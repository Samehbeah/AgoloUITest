package tests;

import java.util.ArrayList;
import org.junit.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import io.qameta.allure.Description;
import Pages.HomePage;
import TestData.TestDataProvider;

@Listeners({TestAllureListener.class})
public class testSubscriptionPackages extends TestBase {
	String LitePlan;
	String CLASSICPlan;
	String PREMIUMPlan;
	String EgyptLitePrice;
	String EgyptCLASSICPrice;
	String EgyptPREMIUMPrice;
	String EmiratesLitePrice;
	String EmiratesCLASSICPrice;
	String EmiratesPREMIUMPrice;
	String AlgeriaLitePrice;
	String AlgeriaCLASSICPrice;
	String AlgeriaPREMIUMPrice;

	@BeforeClass
	public void getTestData() {
		

		LitePlan = TestDataProvider.LitePlan;
		CLASSICPlan = TestDataProvider.CLASSICPlan;
		PREMIUMPlan = TestDataProvider.PREMIUMPlan;
		EgyptLitePrice = TestDataProvider.EgyptLitePrice;
		EgyptCLASSICPrice = TestDataProvider.EgyptCLASSICPrice;
		EgyptPREMIUMPrice = TestDataProvider.EgyptPREMIUMPrice;
		EmiratesLitePrice = TestDataProvider.EmiratesLitePrice;
		EmiratesCLASSICPrice = TestDataProvider.EmiratesCLASSICPrice;
		EmiratesPREMIUMPrice = TestDataProvider.EmiratesPREMIUMPrice;
		AlgeriaLitePrice = TestDataProvider.AlgeriaLitePrice;
		AlgeriaCLASSICPrice = TestDataProvider.AlgeriaCLASSICPrice;
		AlgeriaPREMIUMPrice =TestDataProvider.AlgeriaPREMIUMPrice;

	}

	public HomePage homepage;

	@Test(description="Verify Subscription Packages in Egypt",priority = 1)
	@Description("Verify Subscription Packages in Egypt")
	public void testSubscriptionPackagesInEgypt() {
		homepage= new HomePage(driver);
		ArrayList<String> Plannames = homepage.getPlannames();
		Assert.assertTrue(Plannames.contains(LitePlan));
		Assert.assertTrue(Plannames.contains(CLASSICPlan));
		Assert.assertTrue(Plannames.contains(PREMIUMPlan));
		String LitePrice = homepage.getLitePrice();

		Assert.assertEquals(LitePrice, EgyptLitePrice);

		String CLASSICPrice  = homepage.getCLASSICPrice();

		Assert.assertEquals(CLASSICPrice, EgyptCLASSICPrice);

		String PREMIUMPrice	= homepage.getPREMIUMPrice();

		Assert.assertEquals(PREMIUMPrice, EgyptPREMIUMPrice);

	}

	@Test(description="Verify Subscription Packages in Emirates",priority = 2)
	@Description("Verify Subscription Packages in Emirates")
	public void testSubscriptionPackagesInEmirates() {

		homepage.switchToCountry("Emirates");

		ArrayList<String> Plannames = homepage.getPlannames();
		Assert.assertTrue(Plannames.contains(LitePlan));
		Assert.assertTrue(Plannames.contains(CLASSICPlan));
		Assert.assertTrue(Plannames.contains(PREMIUMPlan));
		String LitePrice = homepage.getLitePrice();

		Assert.assertEquals(LitePrice, EmiratesLitePrice);

		String CLASSICPrice  = homepage.getCLASSICPrice();

		Assert.assertEquals(CLASSICPrice, EmiratesCLASSICPrice);

		String PREMIUMPrice	= homepage.getPREMIUMPrice();

		Assert.assertEquals(PREMIUMPrice, EmiratesPREMIUMPrice);

	}
	@Test(description="Verify Subscription Packages in Algeria",priority = 3)
	@Description("Verify Subscription Packages in Algeria")
	public void testSubscriptionPackagesInAlgeria() {

		homepage.switchToCountry("Algeria");
		ArrayList<String> Plannames = homepage.getPlannames();
		Assert.assertTrue(Plannames.contains(LitePlan));
		Assert.assertTrue(Plannames.contains(CLASSICPlan));
		Assert.assertTrue(Plannames.contains(PREMIUMPlan));
		String LitePrice = homepage.getLitePrice();

		Assert.assertEquals(LitePrice, AlgeriaLitePrice);

		String CLASSICPrice  = homepage.getCLASSICPrice();

		Assert.assertEquals(CLASSICPrice, AlgeriaCLASSICPrice);

		String PREMIUMPrice	= homepage.getPREMIUMPrice();

		Assert.assertEquals(PREMIUMPrice, AlgeriaPREMIUMPrice);
	}




}


