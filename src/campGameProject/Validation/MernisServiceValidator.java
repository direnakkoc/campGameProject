package campGameProject.Validation;

import java.rmi.RemoteException;
import java.util.Locale;

import campGameProject.Business.Abstract.UserCheckService;
import campGameProject.Entity.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceValidator implements UserCheckService {

	@Override
	public boolean CheckIfRealPerson(User user) {
		KPSPublicSoapProxy customer = new KPSPublicSoapProxy();
	    boolean result=true;
	    
		try {		
			result = customer.TCKimlikNoDogrula(Long.parseLong(user.getNationalityId()),user.getName().toUpperCase(new Locale("tr")),
				user.getLastName().toUpperCase(new Locale("tr")),user.getDateOfBirth());
		}catch (RemoteException e) {
		
			e.printStackTrace();
		}

	return result;
	}

}
