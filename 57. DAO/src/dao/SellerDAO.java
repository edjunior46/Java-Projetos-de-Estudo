package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import entities.Department;
import entities.Seller;

public interface SellerDAO {
    
    void insert(Seller seller);
    void update(Seller seller);
    void deleteById(Integer id);
    Seller findById(Integer id);
    List<Seller> findAll();
    List<Seller> findByDepartment(Department department);

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
