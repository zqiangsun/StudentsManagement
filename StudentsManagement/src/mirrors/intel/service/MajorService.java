package mirrors.intel.service;

import java.util.List;

import org.springframework.data.domain.Sort;

import mirrors.intel.domain.Major;

public interface MajorService {
	long count();

	void delete(Long id);

	void deleteInBatch(Iterable<Major> entities);

	void deleteAll();

	boolean exists(Long id);

	Major findOne(Long id);

	List<Major> findAll();

	List<Major> findAll(Sort sort);

	void flush();

	Major save(Major major);
	
	List<Major> save(Iterable<Major> entities);

	Major saveAndFlush(Major major);
}
