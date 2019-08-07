package com.example.springmvc.dao;

import java.sql.SQLException;
import java.util.List;

import com.example.springmvc.model.Company;

public interface CompanyDao {
public Company insertCompany(Company company);
public Company updateCompany(Company company);
public List<Company> getCompanyList() throws SQLException;
}
