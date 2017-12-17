package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class DoctorType {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String doctorType;

	public DoctorType() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DoctorType(String doctortype) {
		super();
		this.doctorType = doctortype;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDoctortype() {
		return doctorType;
	}

	public void setDoctortype(String doctortype) {
		this.doctorType = doctortype;
	}

	@Override
	public String toString() {
		return "DoctorType [id=" + id + ", doctortype=" + doctorType + "]";
	}

}
