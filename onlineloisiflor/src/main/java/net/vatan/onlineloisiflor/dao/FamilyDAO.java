package net.vatan.onlineloisiflor.dao;

import net.vatan.onlineloisiflor.dto.Family;
import java.util.List;

public interface FamilyDAO {

	/*
	 * 
	 */
	
	List<Family> list();

	Family get(int id);
	
	

}
