package com.example.springmvc.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springmvc.dao.CompanyDao;
import com.example.springmvc.model.Company;
@Service
public class CompanyServiceImpl implements CompanyService {
	@Autowired
CompanyDao companyDao;
	@Override
	public Company insertCompany(Company company) {
		// TODO Auto-generated method stub
		companyDao.insertCompany(company);
	 return null;
	
		
	}
	@Override
	public Company updateCompany(Company company) {
		// TODO Auto-generated method stub
		
	companyDao.updateCompany(company);
	return null;
	}

	@Override
	public List<Company> getCompanyList() throws SQLException {
		// TODO Auto-generated method stub
		return companyDao.getCompanyList();
		
	}

}
