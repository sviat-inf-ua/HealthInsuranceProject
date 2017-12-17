package entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Doctor {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	//table doctortype
	@OneToMany(fetch=FetchType.LAZY,mappedBy="doctor")
	private List<DoctorType> doctorTypes;

	//table location
	@OneToMany(fetch=FetchType.LAZY,mappedBy="doctor")
	private List<Location> locations;
	
	private String firstName;
	private String lastName;
	private int cellPhone;
	private boolean isActive;
	
	public Doctor(int id, List<DoctorType> doctorTypes, List<Location> locations, String firstName, String lastName,
			int cellPhone, boolean isActive) {
		super();
		this.id = id;
		this.doctorTypes = doctorTypes;
		this.locations = locations;
		this.firstName = firstName;
		this.lastName = lastName;
		this.cellPhone = cellPhone;
		this.isActive = isActive;
	}
	
}
