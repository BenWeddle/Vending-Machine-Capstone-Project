package com.techelevator;

import com.techelevator.view.Menu;
import com.techelevator.view.UserInput;

public class CaTEringCapstoneCLI {

	private Menu menu;
<<<<<<< HEAD
=======

	public Menu getMenu() {
		return menu;
	}

>>>>>>> bd06a63b801d746ed6b744df1431f72ac546100b
	public CaTEringCapstoneCLI(Menu menu) {
		this.menu = menu;
	}

	public CaTEringCapstoneCLI() {
	}

	public static void main(String[] args) {
		Menu menu = new Menu();
		CaTEringCapstoneCLI cli = new CaTEringCapstoneCLI(menu);
		cli.run(menu);
	}

	public void run(Menu menu) {
		while (true) {
			UserInput.getHomeScreenOption(menu);
		}
	}
}
