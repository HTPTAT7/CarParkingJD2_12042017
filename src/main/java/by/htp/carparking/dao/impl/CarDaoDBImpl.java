package by.htp.carparking.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import by.htp.carparking.dao.CarDao;
import by.htp.carparking.dao.util.DBConnectionHelper;
import by.htp.carparking.domain.Car;

public class CarDaoDBImpl implements CarDao {

	@Override
	public void create(Car entity) {

		Connection conn = DBConnectionHelper.connect();
		
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement("INSERT INTO cars (brand, model) VALUES (?,?)");

			ps.setString(1, "brand1");
			ps.setString(2, "model1");

			ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}

	@Override
	public Car read(int id) {
		return null;
	}

	@Override
	public List<Car> readAll() {

		return null;
	}

	@Override
	public void update(Car entity) {

	}

	@Override
	public void delete(int id) {

	}

}
