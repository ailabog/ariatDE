package com.ariat.Tests.Checkout.CreateOrder.GuestOtherPaymentMethods;
import org.testng.annotations.Test;

import com.ariat.Utils.KillBill;

/**
 * Test create account by instantiating the browser, go to Home page, and calls
 * all the methods such as: create account, login, check order status for Austria
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class KillChromeTests {
	@Test(priority = 0)
	public void killChrome() {
		KillBill kill = new KillBill();
			kill.killChrome();
		}
	}

