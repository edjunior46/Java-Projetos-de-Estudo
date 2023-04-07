package program;

import java.util.Date;
import java.util.List;

import dao.DAOFactory;
import dao.DepartmentDAO;
import dao.SellerDAO;
import entities.Department;
import entities.Seller;

public class App {
    public static void main(String[] args) {

        SellerDAO sellerDAO = DAOFactory.creatSellerDAO();

        Seller seller = sellerDAO.findById(3);
        System.out.println("Find by ID: ");
        System.out.println(seller);

        System.out.println();
        Department dep = new Department(4, "teste");
        List<Seller> list = sellerDAO.findByDepartment(dep);
        System.out.println("Find by Department: ");
        for (Seller s : list) {
            System.out.println(s);
        }

        System.out.println();
        list = sellerDAO.findAll();
        System.out.println("Find All: ");
        for (Seller s : list) {
            System.out.println(s);
        }

        System.out.println();
        Seller newSeller = new Seller(null, "Greg Green", "greeg@email.com", new Date(), 4000.0, dep);
        sellerDAO.insert(newSeller);
        System.out.println("Inserted: " + newSeller.getId());

        System.out.println();
        seller = sellerDAO.findById(1);
        seller.setName("Yasmin Yellow");
        sellerDAO.update(seller);
        System.out.println("Updated: " + seller);

        System.out.println();
        sellerDAO.deleteById(3);

        System.out.println();
        System.out.println("========================DEPARTMENT TESTS===========================");

        DepartmentDAO depDAO = DAOFactory.createDepartment();

		Department dep2 = depDAO.findById(1);
		System.out.println(dep2);

		List<Department> listDep = depDAO.findAll();
		for (Department d : listDep) {
			System.out.println(d);
		}

		Department newDepartment = new Department(null, "Music");
		depDAO.insert(newDepartment);
		System.out.println("Inserted! New id: " + newDepartment.getId());

		Department dep3 = depDAO.findById(1);
		dep2.setName("Food");
		depDAO.update(dep3);
		System.out.println("Update completed");
		
		System.out.println("\n=== TEST 5: delete =======");
		depDAO.deleteById(3);
		System.out.println("Delete completed");
		
    }
}
