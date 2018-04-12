package by.htp.carparking.service.impl;

import by.htp.carparking.dao.OrderDao;
import by.htp.carparking.dao.impl.OrderDaoDBImpl;
import by.htp.carparking.service.OrderService;

public class OrderServiceImpl implements OrderService {

	//TODO add IoC
	private OrderDao orderDao = new OrderDaoDBImpl();
	
	@Override
	public void orderCar(int userId, int carId) {
		
		orderDao.insertNewOrder(userId, carId);
	}

}
