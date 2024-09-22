package parkchanho.flower.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import parkchanho.flower.dao.map.CartMap;
import parkchanho.flower.domain.Cart;

@Repository
public class CartDaoImpl implements CartDao {
	@Autowired private CartMap cartMap;
	
	@Override
	public List<Cart> selectCarts(String userId) {
		return cartMap.selectCarts(userId);
	}

	@Override
	public List<Cart> selectCart(int flowerNum, String userId) {
		return cartMap.selectCart(flowerNum, userId);
	}
	
	@Override
	public int insertCart(Cart cart) {
		return cartMap.insertCart(cart);
	}

	@Override
	public int deleteCart(int cartNum) {
		return cartMap.deleteCart(cartNum);
	}

	
	@Override
	public int emptyCart(String userId) {
		return cartMap.emptyCart(userId);
	}
}
