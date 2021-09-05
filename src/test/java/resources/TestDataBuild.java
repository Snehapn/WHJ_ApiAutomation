package resources;

import pojo.RegisterPayload1;

public class TestDataBuild {

	public RegisterPayload1 RegisterPayload() {
		RegisterPayload1 rp = new RegisterPayload1();
		rp.setCity("Mumbai");
		rp.setCountryCode("IN");
		rp.setDefaultLang("en_US");
		rp.setDelayedLaptopFlow(false);
		rp.setDialCode("91");
		rp.setGrade("7");
		rp.setImmediateStartClassFlow(false);
		rp.setIs3FieldFlow(true);
		// rp.isAddlc(true);
		// rp.isCsp(true);
		rp.setIsLaptop("1");
		// rp.isMobileClassAllowed(false);
		// rp.isRegisterAndVerifyApi(false);
		rp.setLatitude(19.0748);
		rp.setLongitude(72.8856);
		rp.setMobile("9853563745");
		rp.setOtp("9720");
		rp.setPostalCode("400070");
		rp.setSessionId(0);
		rp.setSource("desktop-web");
		rp.setState("Maharashtra");
		rp.setTimezone("Asia/Calcutta");
		return rp;
	}

}
