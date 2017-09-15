package com.hibernate.FS;

public class MainClass {
	
	public static void main(String[] args) {
		FwrspRI imp = new FwrspRI();
		
		FM m = new FM("first", "last");
		
		Fwrsp fs = new Fwrsp("fs");
		fs.getManagers().add(m);
		
		imp.saveFlowerShop(fs);
	}

}
