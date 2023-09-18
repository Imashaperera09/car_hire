package lk.ijse.carhire.model;

import lk.ijse.carhire.to.Customer;
import lk.ijse.carhire.util.CrudUtil;

import java.sql.SQLException;

public class CustomerModel {
    public static boolean save(Customer customer) throws SQLException, ClassNotFoundException {
        return CrudUtil.execute("INSERT INTO Customer VALUES(?, ?, ?, ?, ?, ?, ?, ?)",
                customer.getCust_id(),
                customer.getName(),
                customer.getDob(),
                customer.getSalary(),
                customer.getAddress(),
                customer.getCity(),
                customer.getProvince(),
                customer.getPostal_code()
        );
    }
}


