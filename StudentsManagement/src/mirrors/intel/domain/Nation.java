package mirrors.intel.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Nation {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Long id;
	String nation;
}
