package com.techelevator;

import com.techelevator.view.Menu;
import com.techelevator.view.UserInput;

public class CaTEringCapstoneCLI {



	private Menu menu;

	public CaTEringCapstoneCLI(Menu menu) {
		this.menu = menu;
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
