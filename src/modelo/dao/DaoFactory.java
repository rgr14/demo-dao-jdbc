package modelo.dao;

import modelo.dao.empl.SellerDaoJDBC;


public class DaoFactory {

	
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC();
	}
}
