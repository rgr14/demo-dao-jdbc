package modelo.dao;

import db.DB;
import modelo.dao.empl.SellerDaoJDBC;


public class DaoFactory {

	
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
}
