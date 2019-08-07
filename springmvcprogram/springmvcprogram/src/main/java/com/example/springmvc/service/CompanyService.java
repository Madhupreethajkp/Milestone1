package com.example.springmvc.service;

import java.sql.SQLException;
import java.util.List;

import com.example.springmvc.model.Company;

public interface CompanyService {
	public Company insertCompany(Company company);
	public Company updateCompany(Company company);
	public List<Company> getCompanyList() throws SQLException;

}
