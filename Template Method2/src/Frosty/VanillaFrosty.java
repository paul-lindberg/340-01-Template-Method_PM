/**
 * Presentation 1 Frosty
 * 
 * Champlain College CSI-340, Fall 2018
 * 
 * Author: Matthew Schwartzkopf And Paul Lindenberg Emails:
 * matthew.schwartzkopf@mymail.champlain.edu,
 * paul.lindenberg@mymail.champlain.edu Class : CSI-340 Assignment: Presentation 1
 * Frosty Date Assigned: October 7, 2018 Due Date: October 16, 2018
 * 
 * Description:
 * 
 * This code represents an example of Template Method using a Frosty class
 **/

package Frosty;

public class VanillaFrosty extends Frosty {

	public VanillaFrosty() {
	}

	@Override
	void addFlavor() {
		System.out.println("Adding Vanilla.");
	}
}
