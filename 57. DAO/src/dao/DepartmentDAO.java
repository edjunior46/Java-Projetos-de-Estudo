package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import entities.Department;
import entities.Seller;

public interface DepartmentDAO {

    void insert(Department department);
    void update(Department department);
    void deleteById(Integer id);
    Department findById(Integer id);
    List<Department> findAll();

    default Seller instantiateSeller(ResultSet resultSet, Department dep) throws SQLException {
        Seller seller = new Seller();
        seller.setId(resultSet.getInt("Id"));
        seller.setName(resultSet.getString("Name"));
        seller.setEmail(resultSet.getString("Email"));
        seller.setBirthDate(resultSet.getDate("BirthDate"));
        seller.setBaseSalary(resultSet.getDouble("BaseSalary"));
        seller.setDepartment(dep);
        return seller;
    }

    default Department instantiateDepartment(ResultSet resultSet) throws SQLException{
        Department dep = new Department();
        dep.setId(resultSet.getInt("DepartmentId"));
        dep.setName(resultSet.getString("DepName"));
        return dep;
    }
    
}
