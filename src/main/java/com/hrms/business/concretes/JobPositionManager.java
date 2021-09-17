package com.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.business.abstracts.JobPositionService;
import com.hrms.dataAccess.abstracts.JobPositionDao;
import com.hrms.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService{
	
	private JobPositionDao jobPositionDao;
	
	@Autowired	
	public JobPositionManager(JobPositionDao jobPositionsDao) {
		super();
		jobPositionsDao = jobPositionDao;
	}



	@Override
	public List<JobPosition> getAll() {
		// TODO Auto-generated method stub
		return this.jobPositionDao.findAll();
	}

}
