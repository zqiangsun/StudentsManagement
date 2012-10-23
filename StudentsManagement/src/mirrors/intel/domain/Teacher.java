package mirrors.intel.domain;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Teacher extends User {

	String name;
	@OneToMany
	@JoinColumn
	Set<Clazz> clazzs;
}
