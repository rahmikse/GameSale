package Utils;

public class MernisLog {

	public String firstName;
	public String lastName;
	public String nationalId;
	public String dateOfBirth;
	
	public MernisLog(String firstName, String lastName, String nationalId, String dateOfBirth) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalId = nationalId;
		this.dateOfBirth = dateOfBirth;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNationalId() {
		return nationalId;
	}

	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
}
