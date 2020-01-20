package payworks.rest.Automation;

import com.google.gson.annotations.SerializedName;

public class AddressEnums {

	public enum ErrorCode {

		/*
		 * No error
		 */
		@SerializedName("0")
		NO_ERROR,

		/*
		 * System error. Operator's attention required. See Error Message for more
		 * details.
		 */
		@SerializedName("1")
		SYSTEM_ERROR,

		/*
		 * Input address was supplied in an invalid format.
		 */
		@SerializedName("2")
		INVALID_FORMAT,

		/*
		 * Specified street was not found in the ZIP code provided or in any ZIP code of
		 * the city-state.
		 */
		@SerializedName("3")
		STREET_NOT_FOUND_IN_ZIP_OR_CITY,

		/*
		 * City is not found in the state.
		 */
		@SerializedName("4")
		CITY_NOT_FOUND,

		/*
		 * Ambiguous street name. More than one street matches the search address with
		 * equal accuracy.
		 */
		@SerializedName("5")
		AMBIGUOUS_STREET_NAME,

		/*
		 * YAddress installation is corrupted. Reinstall YAddress.
		 */
		@SerializedName("6")
		YADDRESS_INSTALLATION_CORRUPTED,

		/*
		 * YAddress data edition has expired. Contact www.yaddress.net to obtain current
		 * edition.
		 */
		@SerializedName("7")
		YADDRESS_DATA_EXPIRED,

		/*
		 * No such house number in the street.
		 */
		@SerializedName("8")
		NO_SUCH_HOUSE_NUMBER_IN_STREET;

	}

	public enum GeoPrecision {

		/*
		 * Location could not be determined.
		 */
		@SerializedName("0")
		LOCATION_NOT_DETERMINED,

		/*
		 * Center point of the state.
		 */
		@SerializedName("1")
		CENTER_OF_STATE,

		/*
		 * City center. Usually points to the downtown city district.
		 */
		@SerializedName("2")
		CITY_CENTER,

		/*
		 * Center point of the ZIP code.
		 */
		@SerializedName("3")
		CENTER_OF_ZIP,

		/*
		 * Nearest end of the nearest street block. For example, if input address is
		 * "105 Main St", and Main St only has addresses up to 100, the coordinates of
		 * "100 Main St" are returned.
		 */
		@SerializedName("4")
		NEAREST_STREET_BLOCK,

		/*
		 * Location of the exact address.
		 */
		@SerializedName("5")
		EXACT_ADDRESS;

	}
}
