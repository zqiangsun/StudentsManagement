package mirrors.intel.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import mirrors.intel.type.Authority;

@Entity
public class Authorities implements Serializable {
	@Id
	@OneToOne
	@JoinColumn(name="username")
	User user;
	@Enumerated(EnumType.STRING)
	Authority authority;
}
