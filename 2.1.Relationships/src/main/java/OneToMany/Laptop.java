package OneToMany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Laptop21")
public class Laptop {
	@Id
	@Column(name="SerialNumber")
	int serNo;
	@Column(name="Name")
	String name;
		
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
