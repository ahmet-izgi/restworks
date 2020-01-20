package payworks.rest.Automation.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import payworks.rest.Automation.AddressEnums.ErrorCode;
import payworks.rest.Automation.AddressEnums.GeoPrecision;
import payworks.rest.Automation.data.AddressDataProvider;
import payworks.rest.Automation.domain.AddressDTO;

/**
 * This class is used for API methods of YAddress. (Currently there is only get
 * method for address)
 * 
 * @author ahmetizgi
 */

public class AppTest extends BaseAPITest {

	/**
	 * This method is used for calling get address method of YAddress API.
	 * 
	 * @param testName
	 * @param userKey
	 * @param addressLine1
	 * @param addressLine2
	 * @param errorCode
	 * @param geoPrecision
	 */
	@Test(dataProvider = "api-data-provider", dataProviderClass = AddressDataProvider.class)
	public void yaddressGet(String testName, String userKey, String addressLine1, String addressLine2,
			ErrorCode errorCode, GeoPrecision geoPrecision) {
		AddressDTO addressDTO = get(userKey, addressLine1, addressLine2);
		Assert.assertEquals(addressDTO.getErrorCode(), errorCode);
		Assert.assertEquals(addressDTO.getGeoPrecision(), geoPrecision);
	}
}
