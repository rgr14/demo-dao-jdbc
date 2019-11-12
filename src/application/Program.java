package application;

import modelo.dao.DaoFactory;
import modelo.dao.SellerDao;
import modelo.entidades.Seller;

public class Program {
	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		Seller seller = sellerDao.findById(3);
		
		System.out.println(" Teste 1: seller findById ");
		System.out.println(seller);
	}
}
