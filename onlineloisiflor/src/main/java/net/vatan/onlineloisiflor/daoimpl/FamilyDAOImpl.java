package net.vatan.onlineloisiflor.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.vatan.onlineloisiflor.dao.FamilyDAO;
import net.vatan.onlineloisiflor.dto.Family;

@Repository("familyDAO")
public class FamilyDAOImpl implements FamilyDAO {

	
	private static List<Family> families = new ArrayList<>();
	
	static {
		
		Family family = new Family();
		
		// adding first family
		family.setIdFamily(1);
		family.setNameFamily("Les végétaux");
		family.setDescriptionF("This is some description for Flowers 2");
		family.setImageURLFamily("Vgetaux.png");
		
		families.add(family);
		
		//adding seconde family
		family = new Family();
		
		family.setIdFamily(2);
		family.setNameFamily("Produits Jardin");
		family.setDescriptionF("This is some description for garden products!");
		family.setImageURLFamily("produitJardin.png");
		
		families.add(family);
		
		//adding third family
		family = new Family();
			
		family.setIdFamily(3);
		family.setNameFamily("Pet shop");
		family.setDescriptionF("This is some description for Pet shop !");
		family.setImageURLFamily("Pet_shop.png");
				
		families.add(family);
		
	}
	
	@Override
	public List<Family> list() {
		// TODO Auto-generated method stub
		return families;
	}

	@Override
	public Family get(int id) {
		
		// enchanced for loop
		for(Family family : families) {
			if(family.getIdFamily() == id) {
				return family;
			}	
		}
		return null;
	}

}
