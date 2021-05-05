package Utils;

import Abstract.IGamersService;
import Entities.Gamers;

public class LogManager extends MernisLog implements IGamersService {

	
	public LogManager(String firstName, String lastName, String nationalId, String dateOfBirth) {
		super(firstName, lastName, nationalId, dateOfBirth);
		
	}

	

	
	public void log(Gamers gamers) {
		System.out.println("Ad: "+gamers.getFirstName()+" Soyad: " +gamers.getLastName()+" Tc :"+gamers.getNationalId()+" Doğum tarihi :" +gamers.getDateOfBirth());
		System.out.println("Bilgiler doğrulandı");
		
	}



	@Override
	public void Save(Gamers gamers) {
		// TODO Auto-generated method stub
		
	}

}
