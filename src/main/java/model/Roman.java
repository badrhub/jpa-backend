package model;

//import javax.persistence.DiscriminatorValue;
//import javax.persistence.Entity;
//import javax.persistence.PrimaryKeyJoinColumn;

//@Entity
//@PrimaryKeyJoinColumn(name="id_book")
//@DiscriminatorValue("value_for_romans")
public class Roman {

	private String themeLitteraire;
	
	public String getThemeLitteraire() {
	return themeLitteraire;
	}
	public void setThemeLitteraire(String themeLitteraire) {
	this.themeLitteraire = themeLitteraire;
	}
	public Roman(String title, String themeLitteraire) {
	//super(title);
	this.themeLitteraire = themeLitteraire;
	}
	
	public Roman() {
		super();
	}
	}


