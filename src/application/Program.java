package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("===== TEST 1 - seller findById =====");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println();
		System.out.println("===== TEST 2 - seller findByDepartment =====");
		List<Seller> sellers1 = sellerDao.findByDepartment(new Department(2, null));
		sellers1.forEach(System.out::println);
		
		System.out.println();
		System.out.println("===== TEST 3 - seller findAll =====");
		List<Seller> sellers2 = sellerDao.findAll();
		sellers2.forEach(System.out::println);
	}

}
