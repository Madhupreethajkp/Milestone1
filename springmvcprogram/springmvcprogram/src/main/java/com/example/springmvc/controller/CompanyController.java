package com.example.springmvc.controller;

import java.sql.SQLException;

import org.springframework.web.servlet.ModelAndView;

import com.example.springmvc.model.Company;

public interface CompanyController {
	 public Company insertCompany(Company company) throws SQLException;
	    public Company updateCompany(Company company);
		public ModelAndView getCompanyList() throws Exception;

}
