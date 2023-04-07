package dao;

import dao.impl.DepartmentDAOJDBC;
import dao.impl.SellerDAOJDBC;
import db.DB;

public class DAOFactory {
    
    public static SellerDAO creatSellerDAO() {
       return new SellerDAOJDBC(DB.getConnection()); 
    }

    public static DepartmentDAO createDepartment() {
        return new DepartmentDAOJDBC(DB.getConnection());
    }

}
