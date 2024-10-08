package parkchanho.flower.service;

import java.util.List;

import parkchanho.flower.domain.Cart;

public interface CartService {
	List<Cart> getCarts(String userId);
	List<Cart> getCart(int flowerNum, String userId);
	int addCart(Cart cart);
	int delCart(int cartNum);
	int emptyCart(String userId);
}
