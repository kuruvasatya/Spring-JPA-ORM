package OneToMany;

import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Student21")
public class Student {
	@Id
	@Column(name="Rollno")
	int rollNo;
	@Column(name="Name")
	String name;
	
	@OneToMany(targetEntity=Laptop.class, cascade = CascadeType.ALL)
	@JoinColumn(referencedColumnName="rollno", name = "student_roll_no")
	List<Laptop> laptop = new ArrayList<Laptop>();
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Laptop> getLaptop() {
		return laptop;
	}
	public void setLaptop(List<Laptop> laptop) {
		this.laptop = laptop;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", laptop=" + laptop + "]";
	}
	
	

}
