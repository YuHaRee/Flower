package parkchanho.flower.dao.map;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import parkchanho.flower.domain.Order;

public interface OrderMap {
	List<Order> selectOrders(@Param("userId") String userId);
	List<Order> detailOrders(@Param("orderNum") int orderNum);
	List<Order> selectAdminOrders();
	void insertOrder(Order order);
	void updateDeliState(int orderNum);
	void updateAdmDeliState(int orderNum);
	void deleteOrder(int orderNum);
}