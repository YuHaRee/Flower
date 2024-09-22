package parkchanho.flower.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import parkchanho.flower.domain.Cart;
import parkchanho.flower.domain.Flower;
import parkchanho.flower.service.CartService;
import parkchanho.flower.service.FlowerService;

@Controller
@RequestMapping("/flower")
public class FlowerController {
	@Autowired private FlowerService flowerService;
	@Autowired private CartService cartService;
	
	@Value("${attachPath}") private String attachPath;
	
	@RequestMapping("/listFlower")
	public List<Flower> listFlower() {
		return flowerService.getFlowers();
	}
	
	@RequestMapping(value = "/detailFlower", method=RequestMethod.GET)
	public String detailFlower(Model model, @RequestParam("flowerNum") int flowerNum) {
	    List<Flower> flowerList = flowerService.getDetailFlowers(flowerNum);
	    model.addAttribute("flowerList", flowerList);
		return "flower/detailFlower";
	}
	
	@RequestMapping("searchFlower")
	public String searchFlowerAddr() {
		return "/flower/searchFlower";
	}
	
	@ResponseBody
	@PostMapping("/saveKeyword")
	public void saveKeyword(@RequestParam("keyword") String keyword, HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.setAttribute("keyword", keyword);
	}
	
	@ResponseBody
	@PostMapping("/searchFlower")
	public List<Flower> showSearchResult(HttpServletRequest request) {
		HttpSession session = request.getSession();
		String keyword = (String) session.getAttribute("keyword");
		List<Flower> result = flowerService.searchFlowerWithKeyword(keyword);
		
		return result;
	}
	@ResponseBody
	@RequestMapping(value="/fix")
	public void fixAmount(@RequestBody Flower flower, HttpServletRequest request, HttpServletResponse response) {
		flowerService.fixAmount(flower);
	}
	
	@ResponseBody
	@RequestMapping("addCart")
	public void addCart(@RequestBody Cart cart, HttpServletRequest request) {
		HttpSession session = request.getSession();
		String userId = (String) session.getAttribute("userId");
		cart.setUserId(userId);
		cartService.addCart(cart);
	}
}

