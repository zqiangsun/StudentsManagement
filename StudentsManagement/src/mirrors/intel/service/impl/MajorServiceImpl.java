package mirrors.intel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import mirrors.intel.dao.MajorDao;
import mirrors.intel.domain.Major;
import mirrors.intel.service.MajorService;

@Service
public class MajorServiceImpl implements MajorService {

	@Autowired
	MajorDao dao;

	@Override
	public long count() {
		return dao.count();
	}

	@Override
	public void delete(Long id) {
		dao.delete(id);

	}

	@Override
	public void deleteInBatch(Iterable<Major> entities) {
		dao.deleteInBatch(entities);
	}

	@Override
	public void deleteAll() {
		dao.deleteAll();
	}

	@Override
	public boolean exists(Long id) {
		return dao.exists(id);
	}

	@Override
	public Major findOne(Long id) {
		return dao.findOne(id);
	}

	@Override
	public List<Major> findAll() {
		return dao.findAll();
	}

	@Override
	public List<Major> findAll(Sort sort) {
		return dao.findAll(sort);
	}

	@Override
	public void flush() {
		dao.flush();
	}

	@Override
	public List<Major> save(Iterable<Major> entities) {
		return dao.save(entities);

	}

	@Override
	public Major saveAndFlush(Major major) {
		return dao.saveAndFlush(major);
	}

	@Override
	public Major save(Major major) {
		// TODO Auto-generated method stub
		return dao.save(major);
	}

}
