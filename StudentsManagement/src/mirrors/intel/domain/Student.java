package mirrors.intel.domain;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import mirrors.intel.type.Sex;

@Entity
public class Student extends User {
	Long id;
	@OneToOne
	@JoinColumn
	Nation nation;
	@ManyToOne
	@JoinColumn
	Clazz clazz;
	String dormitory;
	String name;
	Sex sex;
	String address;
	Long mobile;
	Long phone;
	@Lob
	Byte[] photo;
	
}
