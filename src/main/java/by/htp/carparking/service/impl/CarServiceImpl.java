package by.htp.carparking.service.impl;

import java.util.List;

import by.htp.carparking.dao.CarDao;
import by.htp.carparking.dao.impl.CarDaoDBImpl;
import by.htp.carparking.domain.Car;
import by.htp.carparking.service.CarService;

public class CarServiceImpl implements CarService {

	// TODO change to IoC, singletone
	private CarDao carDao = new CarDaoDBImpl();

	@Override
	public List<Car> getCarsList() {
		return carDao.readAll();
	}
}
