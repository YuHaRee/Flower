package parkchanho.flower.dao;

import java.util.List;

import parkchanho.flower.domain.Order;

public interface OrderDao {
	List<Order> selectOrders(String userId);
	List<Order> detailOrders(int orderNum);
	List<Order> selectAdminOrders();
	void insertOrder(Order order);
	void updateDeliState(int orderNum);
	void updateAdmDeliState(int orderNum);
	void deleteOrder(int orderNum);
}
