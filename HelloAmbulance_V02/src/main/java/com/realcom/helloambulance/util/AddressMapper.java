package com.realcom.helloambulance.util;

import com.realcom.helloambulance.domain.Address;
import com.realcom.helloambulance.pojo.AddressBean;

public class AddressMapper {
	public static Address mapBeanToDomain(AddressBean adBean) {
		
		Address addr=new Address();
		addr.setStreet(adBean.getStreet());
		addr.setCity(adBean.getCity());
		addr.setState(adBean.getState());
		addr.setPinCode(adBean.getPinCode());
		addr.setCountry(adBean.getCountry());
	
		return addr;
		
}

public static AddressBean mapDomainToBean(Address adDomain) {
	
	AddressBean ab=new AddressBean();
	
	ab.setStreet(adDomain.getStreet());
	ab.setCity(adDomain.getCity());
	ab.setState(adDomain.getState());
	ab.setPinCode(adDomain.getPinCode());
	ab.setCountry(adDomain.getCountry());
	
	
	
	
	
	return ab;
	
	
	
}

}
