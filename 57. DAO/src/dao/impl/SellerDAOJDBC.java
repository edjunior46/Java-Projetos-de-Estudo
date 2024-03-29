package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dao.SellerDAO;
import db.DB;
import db.DBException;
import entities.Department;
import entities.Seller;

public class SellerDAOJDBC implements SellerDAO {

    private Connection connection;

    public SellerDAOJDBC(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void insert(Seller seller) {
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(
                "INSERT INTO seller (Name, Email, BirthDate, BaseSalary, DepartmentId) VALUES (?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS
            );
            preparedStatement.setString(1, seller.getName());
            preparedStatement.setString(2, seller.getEmail());
            preparedStatement.setDate(3, new java.sql.Date(seller.getBirthDate().getTime()));
            preparedStatement.setDouble(4, seller.getBaseSalary());
            preparedStatement.setInt(5, seller.getDepartment().getId());

            int update = preparedStatement.executeUpdate();

            if (update > 0) {
                ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
                if (generatedKeys.next()) {
                    seller.setId(generatedKeys.getInt(1));
                }
                DB.closeResultSet(generatedKeys);
            } else {
                throw new DBException("Failed to insert seller");
            }
        } catch (SQLException e) {
            throw new DBException(e.getMessage());
        } finally {
            DB.closeStatement(preparedStatement);
        }
    }

    @Override
    public void update(Seller seller) {
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(
                "UPDATE seller SET Name=?, Email=?, BirthDate=?, BaseSalary=?, DepartmentId=? WHERE Id=?"
            );
            preparedStatement.setString(1, seller.getName());
            preparedStatement.setString(2, seller.getEmail());
            preparedStatement.setDate(3, new java.sql.Date(seller.getBirthDate().getTime()));
            preparedStatement.setDouble(4, seller.getBaseSalary());
            preparedStatement.setInt(5, seller.getDepartment().getId());
            preparedStatement.setInt(6, seller.getId());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new DBException(e.getMessage());
        } finally {
            DB.closeStatement(preparedStatement);
        }
    }

    @Override
    public void deleteById(Integer id) {
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(
                "DELETE FROM seller WHERE id = ?"
            );
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new DBException(e.getMessage());
        } finally {
            DB.closeStatement(preparedStatement);
        }
    }

    @Override
    public Seller findById(Integer id) {
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            preparedStatement = connection.prepareStatement(
                "SELECT seller.*,department.Name as DepName FROM seller INNER JOIN department ON seller.DepartmentId = department.Id WHERE seller.Id = ?"
            );
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                Department dep = instantiateDepartment(resultSet);
                Seller seller = instantiateSeller(resultSet, dep);
                return seller;
            }
            return null;
        } catch (SQLException e) {
            throw new DBException(e.getMessage());
        } finally {
            DB.closeStatement(preparedStatement);
            DB.closeResultSet(resultSet);
        }
    }
    
    @Override
    public List<Seller> findAll() {
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            preparedStatement = connection.prepareStatement(
                "SELECT seller.*,department.Name as DepName FROM seller INNER JOIN department ON seller.DepartmentId = department.Id ORDER BY Name"
            );
            resultSet = preparedStatement.executeQuery();

            List<Seller> sellerList = new ArrayList<>();
            Map<Integer, Department> departmentMap = new HashMap<>();

            while (resultSet.next()) {
                
                Department dep = departmentMap.get(resultSet.getInt("DepartmentId"));

                if (dep == null) {
                    dep = instantiateDepartment(resultSet);
                    departmentMap.put(resultSet.getInt("DepartmentId"), dep);
                }

                Seller seller = instantiateSeller(resultSet, dep);
                sellerList.add(seller);
            }

            return sellerList;

        } catch (SQLException e) {
            throw new DBException(e.getMessage());
        } finally {
            DB.closeStatement(preparedStatement);
            DB.closeResultSet(resultSet);
        }
    }

    @Override
    public List<Seller> findByDepartment(Department department) {
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            preparedStatement = connection.prepareStatement(
                "SELECT seller.*,department.Name as DepName FROM seller INNER JOIN department ON seller.DepartmentId = department.Id WHERE DepartmentId = ? ORDER BY Name"
            );
            preparedStatement.setInt(1, department.getId());
            resultSet = preparedStatement.executeQuery();

            List<Seller> sellerList = new ArrayList<>();
            Map<Integer, Department> departmentMap = new HashMap<>();

            while (resultSet.next()) {
                
                Department dep = departmentMap.get(resultSet.getInt("DepartmentId"));

                if (dep == null) {
                    dep = instantiateDepartment(resultSet);
                    departmentMap.put(resultSet.getInt("DepartmentId"), dep);
                }

                Seller seller = instantiateSeller(resultSet, dep);
                sellerList.add(seller);
            }

            return sellerList;

        } catch (SQLException e) {
            throw new DBException(e.getMessage());
        } finally {
            DB.closeStatement(preparedStatement);
            DB.closeResultSet(resultSet);
        }
    }
    
}
