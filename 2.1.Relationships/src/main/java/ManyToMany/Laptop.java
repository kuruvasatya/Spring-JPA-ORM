package ManyToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Laptop3")
public class Laptop {
	@Id
	@Column(name="SerialNumber")
	int serNo;
	@Column(name="Name")
	String name;
		
	@ManyToMany(mappedBy="laptop")
	List<Student> listOfstudents = new ArrayList<Student>();
	
	public List<Student> getStudent() {
		return listOfstudents;
	}
	public void setStudent(List<Student> student) {
		this.listOfstudents = student;
	}
	public int getSerNo() {
		return serNo;
	}
	public void setSerNo(int serNo) {
		this.serNo = serNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Laptop [serNo=" + serNo + ", name=" + name + "]";
	}
	
}
