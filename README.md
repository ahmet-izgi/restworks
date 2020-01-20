[![CircleCI](https://circleci.com/gh/ahmet-izgi/restworks.svg?style=svg)](https://circleci.com/gh/ahmet-izgi/restworks)

# YAddress REST API tests

Automated tests prepared with Java, Rest Assured, TestNG, DataProvider, CircleCI.

## Scenarios

  - 0001: Exact address test.
  - 0002: Invalid format response test. AddressLine2 parameter is empty.
  - 0003: No such house number in the street.
  - 0004: City center test. Usually points to the downtown city district. AddressLine1 parameter is empty string.
  - 0005: Specified street was not found in the ZIP code provided.
  - 0006: City is not found in the state and Center point of the state.
  - 0007: Invalid format response test. AddressLine1 and AddressLine2 parameter is empty string.

# Notes about tests!
For handling response data, we used directly POJO's. AddressDTO is the type which is designed for response data of the /address method. 

YAddress API has only one endpoint which is GET /address. There is base class (BaseAPITest.java) for initial steps (initSpec()) and request method (get()). 

While initializing we also configured object mapper for deserialization process. Because while deserializing the JSON object to the POJO, case-sensitivity causes mapping errors. RestAssuredConfig directly manipulated with GsonBuilder's setFieldNamingPolicy (UPPER_CAMEL_CASE) method.

AppTest class extends BaseAPITest class. There is only one method (yaddressGet()) that is using the get() method of the superclass.

For further developments, we should add the necessary methods to BaseAPITest class and we should call added methods within AppTest class with necessary test data.

## Managing test data
We have only one test method. Thanks to TestNG's data provider annotation, we can use different data variations for just one test method.

AddressDataProvider class have testDataFeed method for preparing test data. We have six arguments for each test.

        testParameters[0][0] = "0001_ExactAddress"; // Test name for readability
        testParameters[0][1] = ""; // user key
        testParameters[0][2] = "506 Fourth Avenue Unit 1"; // addressLine1
        testParameters[0][3] = "Asbury Prk NJ"; // addressline2
        testParameters[0][4] = ErrorCode.NO_ERROR; // expected ErrorCode of the response
        testParameters[0][5] = GeoPrecision.EXACT_ADDRESS; // expected GeoPrecision of the response

