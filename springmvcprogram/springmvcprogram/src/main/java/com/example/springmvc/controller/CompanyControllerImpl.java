package com.example.springmvc.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.springmvc.model.Company;
import com.example.springmvc.service.CompanyService;
@Controller
public class CompanyControllerImpl implements CompanyController {
@Autowired
private CompanyService companyService;

	@Override
	public Company insertCompany(Company company) throws SQLException {
		// TODO Auto-generated method stub
		companyService.insertCompany(company);
		 return null;
			
	}

	@Override
	public Company updateCompany(Company company) {
		// TODO Auto-generated method stub
		return companyService.updateCompany(company);
		
	}

	@Override
	@RequestMapping(value="/updateCompany")
	public ModelAndView getCompanyList() throws Exception {
		// TODO Auto-generated method stub
		ModelAndView mv  = new ModelAndView();
		mv.setViewName("updateCompany");
		
		mv.addObject("updateCompany", companyService.getCompanyList());
		return mv;
			}
	
		/*CompanyController companyController=new CompanyControllerImpl();
		
		try {
			System.out.println(companyController.getCompanyList());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	
	public static void main(String[] args) throws Exception {
			//SpringApplication.run(StockExchangeApplication.class, args);
			System.out.println("before the container");
			Company company=new Company();
			//company.setBoardOfDirectors("df");
			//company.setCompany_code(1001);
			ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
			System.out.println("after the container");
			CompanyController companyController=(CompanyController)applicationContext.getBean("companyControllerImpl");
		//	companyController.insertCompany(company);		
		 System.out.println(companyController.getCompanyList());
	}

}
