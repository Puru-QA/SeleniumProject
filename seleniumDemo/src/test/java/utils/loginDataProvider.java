package utils;

import org.testng.annotations.DataProvider;

public class loginDataProvider {

	@DataProvider(name = "loginData")

	public Object[][] loginData() throws Exception {

		return new Object[][] {

				{

						ExcellUtils.getExcellData("Sheet2", 1, 0),

						ExcellUtils.getExcellData("Sheet2", 1, 1)

				},

				/*
				 * {
				 * 
				 * ExcellUtils.getExcellData("Sheet2", 2, 0),
				 * 
				 * ExcellUtils.getExcellData("Sheet2", 2, 1)
				 * 
				 * },
				 * 
				 * {
				 * 
				 * ExcellUtils.getExcellData("Sheet2", 3, 0),
				 * 
				 * ExcellUtils.getExcellData("Sheet2", 3, 1)
				 * 
				 * }
				 */

		};

	}
}
