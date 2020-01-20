package payworks.rest.Automation.domain;

import payworks.rest.Automation.AddressEnums.ErrorCode;
import payworks.rest.Automation.AddressEnums.GeoPrecision;

/**
 * @author ahmetizgi
 *
 */
public class AddressDTO {

	/*
	 * ErrorCode of the response
	 */
	private ErrorCode errorCode;

	/*
	 * Textual description of the error. Blank if no error occurred.
	 */
	private String errorMessage;

	/*
	 * First line of the parsed address. Includes secondary address designator if
	 * supplied in the original address. If the address failed to validate, this
	 * line is a copy of the input line.
	 */
	private String addressLine1;

	/*
	 * City-state-ZIP line of the parsed address. If the address failed to validate,
	 * this line is a copy of the input line.
	 */
	private String addressLine2;

	/*
	 * House number of the parsed address. Blank if street address was not
	 * validated.
	 */
	private String number;

	/*
	 * Street pre-direction of the parsed address. Blank if street address was not
	 * validated.
	 */
	private String preDir;

	/*
	 * Street name of the parsed address, not including pre-direction,
	 * post-direction, and suffix. Blank if street address was not validated.
	 */
	private String street;

	/*
	 * Street suffix of the parsed address. Blank if street address was not
	 * validated.
	 */
	private String suffix;

	/*
	 * Street post-direction of the parsed address. Blank if street address was not
	 * validated.
	 */
	private String postDir;

	/*
	 * Secondary designator of the parsed address, such as apartment, suite, unit,
	 * etc. Blank if secondary designator was not validated.
	 */
	private String sec;

	/*
	 * Secondary number of the parsed address, such as apartment, suite, unit, etc.
	 * Blank if secondary number was not validated.
	 */
	private String secNumber;

	/*
	 * City of the parsed address. Blank if city was not validated.
	 */
	private String city;

	/*
	 * State of the parsed address. Blank if address was not validated.
	 */
	private String state;

	/*
	 * ZIP code of the parsed address. Blank if address was not validated.
	 */
	private String zip;

	/*
	 * ZIP+4 code of the parsed address. Blank if address was not validated.
	 */
	private String zip4;

	/*
	 * County of the parsed address. Blank if county was not validated.
	 */
	private String county;

	/*
	 * State FP number in two digits. Blank if state was not validated.
	 */
	private String stateFP;

	/*
	 * County FP number in three digits. Blank if county was not validated. County
	 * FP’s are unique within a state.
	 */
	private String countyFP;

	/*
	 * Census tract number in the format XXXX.XX. Blank if not determined. Census
	 * tract numbers are unique within a county.
	 */
	private String censusTract;

	/*
	 * Census block number in four digits. Blank if not determined. Census block
	 * numbers are unique within a census tract.
	 */
	private String censusBlock;

	/*
	 * Latitude of the address location. 0 if address cannot be geocoded.
	 */
	private float latitude;

	/*
	 * Longitude of the address location. 0 if address cannot be geocoded.
	 */
	private float longitude;

	/*
	 * Precision with which coordinates of the location were determined.
	 */
	private GeoPrecision geoPrecision;

	public ErrorCode getErrorCode() {
		return errorCode;
	}

	public AddressDTO setErrorCode(ErrorCode errorCode) {
		this.errorCode = errorCode;
		return this;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public AddressDTO setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
		return this;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public AddressDTO setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
		return this;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public AddressDTO setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
		return this;
	}

	public String getNumber() {
		return number;
	}

	public AddressDTO setNumber(String number) {
		this.number = number;
		return this;
	}

	public String getPreDir() {
		return preDir;
	}

	public AddressDTO setPreDir(String preDir) {
		this.preDir = preDir;
		return this;
	}

	public String getStreet() {
		return street;
	}

	public AddressDTO setStreet(String street) {
		this.street = street;
		return this;
	}

	public String getSuffix() {
		return suffix;
	}

	public AddressDTO setSuffix(String suffix) {
		this.suffix = suffix;
		return this;
	}

	public String getPostDir() {
		return postDir;
	}

	public AddressDTO setPostDir(String postDir) {
		this.postDir = postDir;
		return this;
	}

	public String getSec() {
		return sec;
	}

	public AddressDTO setSec(String sec) {
		this.sec = sec;
		return this;
	}

	public String getSecNumber() {
		return secNumber;
	}

	public AddressDTO setSecNumber(String secNumber) {
		this.secNumber = secNumber;
		return this;
	}

	public String getCity() {
		return city;
	}

	public AddressDTO setCity(String city) {
		this.city = city;
		return this;
	}

	public String getState() {
		return state;
	}

	public AddressDTO setState(String state) {
		this.state = state;
		return this;
	}

	public String getZip() {
		return zip;
	}

	public AddressDTO setZip(String zip) {
		this.zip = zip;
		return this;
	}

	public String getZip4() {
		return zip4;
	}

	public AddressDTO setZip4(String zip4) {
		this.zip4 = zip4;
		return this;
	}

	public String getCounty() {
		return county;
	}

	public AddressDTO setCounty(String county) {
		this.county = county;
		return this;
	}

	public String getStateFP() {
		return stateFP;
	}

	public AddressDTO setStateFP(String stateFP) {
		this.stateFP = stateFP;
		return this;
	}

	public String getCountyFP() {
		return countyFP;
	}

	public AddressDTO setCountyFP(String countyFP) {
		this.countyFP = countyFP;
		return this;
	}

	public String getCensusTract() {
		return censusTract;
	}

	public AddressDTO setCensusTract(String censusTract) {
		this.censusTract = censusTract;
		return this;
	}

	public String getCensusBlock() {
		return censusBlock;
	}

	public AddressDTO setCensusBlock(String censusBlock) {
		this.censusBlock = censusBlock;
		return this;
	}

	public float getLatitude() {
		return latitude;
	}

	public AddressDTO setLatitude(float latitude) {
		this.latitude = latitude;
		return this;
	}

	public float getLongitude() {
		return longitude;
	}

	public AddressDTO setLongitude(float longitude) {
		this.longitude = longitude;
		return this;
	}

	public GeoPrecision getGeoPrecision() {
		return geoPrecision;
	}

	public AddressDTO setGeoPrecision(GeoPrecision geoPrecision) {
		this.geoPrecision = geoPrecision;
		return this;
	}

	@Override
	public String toString() {
		return "AddressDTO "
				+ "[errorCode=" + errorCode + ", "
				+ "errorMessage=" + errorMessage + ", "
				+ "addressLine1=" + addressLine1 + ", "
				+ "addressLine2=" + addressLine2 + ", "
				+ "number=" + number + ", "
				+ "preDir=" + preDir + ", "
				+ "street=" + street + ", "
				+ "suffix=" + suffix + ", "
				+ "postDir=" + postDir + ", "
				+ "sec=" + sec + ", "
				+ "secNumber=" + secNumber + ", "
				+ "city=" + city + ", "
				+ "state=" + state + ", "
				+ "zip=" + zip + ", "
				+ "zip4=" + zip4 + ", "
				+ "county=" + county + ", "
				+ "stateFP=" + stateFP + ", "
				+ "countyFP=" + countyFP + ", "
				+ "censusTract=" + censusTract + ", "
				+ "censusBlock=" + censusBlock + ", "
				+ "latitude=" + latitude + ", "
				+ "longitude=" + longitude + ", "
				+ "geoPrecision=" + geoPrecision + "]";
	}

}
