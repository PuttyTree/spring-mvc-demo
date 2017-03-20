
import com.bkm.spring.model.PhoneNumberModel;

import com.bkm.spring.web.controller.support.conventer.StringToPhoneNumberConverter;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.core.convert.support.DefaultConversionService;
//import org.springframework.util.Assert;

import java.util.List;

public class ConverterTest
{
	
	@Test
	public void testStringToPhoneNumberConvert() {
		DefaultConversionService conversionService = new DefaultConversionService();
		conversionService.addConverter(new StringToPhoneNumberConverter());
		
		String phoneNumberStr = "010-12345678-010";
		PhoneNumberModel phoneNumber = conversionService.convert(phoneNumberStr, PhoneNumberModel.class);
		
		Assert.assertEquals("010", phoneNumber.getAreaCode());
	}

	@Test
	public void testOtherConvert() {
		DefaultConversionService conversionService = new DefaultConversionService();
		
		//"1"--->true
		//Assert.assertEquals(Boolean.valueOf(true), conversionService.convert("1", Boolean.class));
		
		//"1,2,3,4"--->List
		Assert.assertEquals(4, conversionService.convert("1,2,3,4", List.class).size());
	}
}
