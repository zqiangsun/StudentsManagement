package mirrors.intel.domain;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Clazz {
	@Id
	Long id;

	@ManyToOne
	@JoinColumn
	Major major;

	@OneToMany
	@JoinColumn
	Set<Student> student;

	@ManyToOne
	@JoinColumn
	Teacher teacher;
}
