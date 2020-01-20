package payworks.rest.Automation.test;

import static com.google.gson.FieldNamingPolicy.UPPER_CAMEL_CASE;
import static io.restassured.RestAssured.given;
import static io.restassured.config.ObjectMapperConfig.objectMapperConfig;

import java.lang.reflect.Type;

import org.testng.annotations.BeforeClass;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.config.RestAssuredConfig;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.mapper.ObjectMapperType;
import io.restassured.path.json.mapper.factory.GsonObjectMapperFactory;
import io.restassured.specification.RequestSpecification;
import payworks.rest.Automation.Constants;
import payworks.rest.Automation.domain.AddressDTO;


/**
 * This class is used as base class for test methods. 
 * 
 * @author ahmetizgi
 */

public class BaseAPITest {


	protected static RequestSpecification spec;

	@BeforeClass
	public static void initSpec() {

		// While deserializing the json object to POJO, we need to use object mapper
		// (someFieldName ---> SomeFieldName)
		RestAssured.config = RestAssuredConfig.config()
				.objectMapperConfig(objectMapperConfig().gsonObjectMapperFactory(new GsonObjectMapperFactory() {
					public Gson create(Type cls, String charset) {
						return new GsonBuilder().setFieldNamingPolicy(UPPER_CAMEL_CASE).create();
					}
				}));

		spec = new RequestSpecBuilder()
				.setContentType(ContentType.JSON)
				.setBaseUri("http://www.yaddress.net/api")
				.log(LogDetail.PARAMS)
				.build();
	}

	/**
	 * 
	 * GET '/address method
	 * 
	 * @param userKey
	 * @param addressLine1
	 * @param addressLine2
	 * @return deserialized response JSON to AddressDTO
	 * 
	 */
	protected AddressDTO get(String userKey, String addressLine1, String addressLine2) {
		AddressDTO addressDTO = 
			given()
				.spec(spec)
				.param(Constants.METHOD_PARAM_USERKEY, userKey)
				.param(Constants.METHOD_PARAM_ADDRESSLINE1, addressLine1)
				.param(Constants.METHOD_PARAM_ADDRESSLINE2, addressLine2)
			.when()
				.get(Constants.METHOD_NAME_ADDRESS)
			.as(AddressDTO.class, ObjectMapperType.GSON);

		return addressDTO;
	}
}
