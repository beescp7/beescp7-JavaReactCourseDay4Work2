package Adapters;

import java.rmi.RemoteException;
import java.time.ZoneId;

import Entities.Gamer;
import Interfaces.GamerCheckService;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisGamerAdapter implements GamerCheckService {

	@Override
	public boolean checkIfRealGamer(Gamer gamer) {
		KPSPublicSoapProxy kpsPublicSoapProxy=new KPSPublicSoapProxy();
		boolean resoult=false;
		try {
			resoult=kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(gamer.getIdentityNumber()), gamer.getFirstName().toUpperCase(), gamer.getLastName().toUpperCase(), gamer.getBirthDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getYear());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resoult;
	}

}
