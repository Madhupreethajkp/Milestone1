package com.example.springmvc;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.springmvc.controller.CompanyController;
import com.example.springmvc.model.Company;

//@SpringBootApplication
public class StockExchangeApplication {

	public static void main(String[] args) throws Exception {
		//SpringApplication.run(StockExchangeApplication.class, args);
		System.out.println("before the container");
		Company company=new Company();
		//company.setBoardOfDirectors("df");
		//company.setCompany_code(1001);
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
		System.out.println("after the container");
		CompanyController companyController=(CompanyController)applicationContext.getBean("companyControllerImpl");
		companyController.insertCompany(company);		
	 companyController.getCompanyList();
		/*User user=new User();
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
		UserController userController=(UserController)applicationContext.getBean("userControllerImpl");
		System.out.println("hi");
	 userController.insertUser(user);*/
		/*Sector sector=new Sector();
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
		SectorController sectorController=(SectorController)applicationContext.getBean("sectorControllerImpl");
		sectorController.insertSector(sector);
		*/
	}

}
