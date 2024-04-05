package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("===== TEST 1 - department findById =====");
		Department dep1 = departmentDao.findById(3);
		System.out.println(dep1);
		
		System.out.println();
		System.out.println("===== TEST 2 - department findAll =====");
		List<Department> deps1 = departmentDao.findAll();
		deps1.forEach(System.out::println);
		
		System.out.println();
		System.out.println("===== TEST 3 - department insert =====");
		Department dep2 = new Department(null, "Foods");
		departmentDao.insert(dep2);
		System.out.println(dep2);
		
		System.out.println();
		System.out.println("===== TEST 4 - department update =====");
		dep2.setName("Musics");
		departmentDao.update(dep2);
		System.out.println("Update completed!");

		System.out.println();
		System.out.println("===== TEST 5 - department delete =====");
		System.out.print("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed!");

		sc.close();
	}

}
