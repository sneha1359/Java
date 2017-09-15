package com.hibernate.FS;

import java.util.List;

//ccimport com.hib.assign.model.FlowerShop;

public interface FwrspR {
	
	public List<Fwrsp> getAllData();
	
	public void saveFlowerShop(Fwrsp flowerShop);
	
	public Fwrsp getFlowerShop(int id);
	
	public void deleteFlowerShop(int id);
	
	public Fwrsp updateFlowerShop(Fwrsp flowerShop);

}
