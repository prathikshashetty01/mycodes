package org.alvas.one_to_one_bi.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Pan {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int panid;
	private String pannnumber;
	private String panaddress;
	@OneToOne
	@JoinColumn(name ="person_id")//to map 2 classes and generate the foreign key
	
	Person person;

	public int getPanid() {
		return panid;
	}

	public void setPanid(int panid) {
		this.panid = panid;
	}

	public String getPannnumber() {
		return pannnumber;
	}

	public void setPannnumber(String pannnumber) {
		this.pannnumber = pannnumber;
	}

	public String getPanaddress() {
		return panaddress;
	}

	public void setPanaddress(String panaddress) {
		this.panaddress = panaddress;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "Pan [panid=" + panid + ", pannnumber=" + pannnumber + ", panaddress=" + panaddress + ", person="
				+ person + "]";
	}

}
