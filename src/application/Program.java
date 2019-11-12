package application;

import java.util.List;

import modelo.dao.DaoFactory;
import modelo.dao.SellerDao;
import modelo.entidades.Department;
import modelo.entidades.Seller;

public class Program {
	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		Seller seller = sellerDao.findById(3);
		
		System.out.println(" Teste 1: seller findById ");
		System.out.println(seller);
		
		System.out.println("\n=== TEST 2: seller findByDepartment =====");
		Department department = new Department(2, null);
		
		List<Seller> list = sellerDao.findByDepartment(department);
		
		for (Seller obj : list) {
			System.out.println(obj);
		}
	}
}
