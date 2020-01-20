package payworks.rest.Automation.data;

import org.testng.annotations.DataProvider;

import payworks.rest.Automation.AddressEnums.ErrorCode;
import payworks.rest.Automation.AddressEnums.GeoPrecision;

/**
 * 
 * This class used for providing data for the tests.
 * 
 * testParameters[0][0] = test name; 
 * testParameters[0][1] = user key;
 * testParameters[0][2] = addressline1; 
 * testParameters[0][3] = addressline2;
 * testParameters[0][4] = ErrorCode of the response data; 
 * testParameters[0][5] = GeoPrecision of the response data;
 *
 * Instead of filling array within this class, we can use text/csv files for importing
 * data dynamically
 *
 * @author ahmetizgi
 *
 */
public class AddressDataProvider {

	@DataProvider(name = "api-data-provider")
	public static Object[][] testDataFeed() {
		Object[][] testParameters = new Object[7][6];

		testParameters[0][0] = "0001_ExactAddress";
		testParameters[0][1] = "";
		testParameters[0][2] = "506 Fourth Avenue Unit 1";
		testParameters[0][3] = "Asbury Prk NJ";
		testParameters[0][4] = ErrorCode.NO_ERROR;
		testParameters[0][5] = GeoPrecision.EXACT_ADDRESS;

		testParameters[1][0] = "0002_invalidFormat";
		testParameters[1][1] = "";
		testParameters[1][2] = "506 Fourth Avenue Unit 1";
		testParameters[1][3] = "";
		testParameters[1][4] = ErrorCode.INVALID_FORMAT;
		testParameters[1][5] = GeoPrecision.LOCATION_NOT_DETERMINED;

		testParameters[2][0] = "0003_noSuchHouseNumberInStreet";
		testParameters[2][1] = "";
		testParameters[2][2] = "506 Avenue Unit 1";
		testParameters[2][3] = "Asbury Prk NJ";
		testParameters[2][4] = ErrorCode.NO_SUCH_HOUSE_NUMBER_IN_STREET;
		testParameters[2][5] = GeoPrecision.NEAREST_STREET_BLOCK;

		testParameters[3][0] = "0004_correctAddressCityCenterTest";
		testParameters[3][1] = "";
		testParameters[3][2] = "";
		testParameters[3][3] = "Asbury Prk NJ";
		testParameters[3][4] = ErrorCode.NO_ERROR;
		testParameters[3][5] = GeoPrecision.CITY_CENTER;

		testParameters[4][0] = "0005_streetNotFoundInZipCode";
		testParameters[4][1] = "";
		testParameters[4][2] = "123 St";
		testParameters[4][3] = "Asbury Prk NJ";
		testParameters[4][4] = ErrorCode.STREET_NOT_FOUND_IN_ZIP_OR_CITY;
		testParameters[4][5] = GeoPrecision.CITY_CENTER;
		
		testParameters[5][0] = "0006_cityNotFoundInState";
		testParameters[5][1] = "";
		testParameters[5][2] = "506 Avenue Unit 1";
		testParameters[5][3] = "Hams NJ";
		testParameters[5][4] = ErrorCode.CITY_NOT_FOUND;
		testParameters[5][5] = GeoPrecision.CENTER_OF_STATE;

		testParameters[6][0] = "0007_cityNotFoundInState";
		testParameters[6][1] = "";
		testParameters[6][2] = "";
		testParameters[6][3] = "";
		testParameters[6][4] = ErrorCode.CITY_NOT_FOUND;
		testParameters[6][5] = GeoPrecision.CENTER_OF_STATE;

		return testParameters;
	}
}
