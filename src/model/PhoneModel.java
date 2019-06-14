package model;

import entity.Phone;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PhoneModel {
    private static Connection connection = ConnectDatabase.connection;

    public boolean addPhone(Phone phone) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO phones(name, brand, price, description) VALUES (?, ?, ?, ?)");
            preparedStatement.setString(1, phone.getName());
            preparedStatement.setString(2, phone.getBrand());
            preparedStatement.setString(3, phone.getPrice());
            preparedStatement.setString(4, phone.getDescription());
            preparedStatement.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public ArrayList<Phone> getAllPhone() {
        ArrayList<Phone> listPhone = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM phones");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String brand = resultSet.getString("brand");
                String price = resultSet.getString("price");
                String description = resultSet.getString("description");

                Phone phone = new Phone();
                phone.setId(id);
                phone.setName(name);
                phone.setBrand(brand);
                phone.setPrice(price);
                phone.setDescription(description);
                listPhone.add(phone);
            }
            return listPhone;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
