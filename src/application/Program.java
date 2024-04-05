package application;

import java.time.LocalDate;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("===== TEST 1 - seller findById =====");
		Seller seller1 = sellerDao.findById(3);
		System.out.println(seller1);
		
		System.out.println();
		System.out.println("===== TEST 2 - seller findByDepartment =====");
		List<Seller> sellers1 = sellerDao.findByDepartment(new Department(2, null));
		sellers1.forEach(System.out::println);
		
		System.out.println();
		System.out.println("===== TEST 3 - seller findAll =====");
		List<Seller> sellers2 = sellerDao.findAll();
		sellers2.forEach(System.out::println);
		
		System.out.println();
		System.out.println("===== TEST 4 - seller insert =====");
		Seller seller2 = new Seller(null, "Greg", "greg@gmail.com", LocalDate.of(1972, 5, 11), 3500.0, new Department(1, "Computers"));
		sellerDao.insert(seller2);
		System.out.println(seller2);
		
		System.out.println();
		System.out.println("===== TEST 4 - seller update =====");
		seller2.setBirthDate(LocalDate.of(1986, 5, 22));
		sellerDao.update(seller2);
		System.out.println("Update completed!");
	}

}
