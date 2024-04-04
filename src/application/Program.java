package application;

import java.time.LocalDate;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Department dep = new Department(1, "Books");
		Seller seller = new Seller(21, "Bob", "bob@gmail.com", LocalDate.of(1972, 11, 5), 2500.0, dep);
		
		System.out.println(seller);
		
	}

}
