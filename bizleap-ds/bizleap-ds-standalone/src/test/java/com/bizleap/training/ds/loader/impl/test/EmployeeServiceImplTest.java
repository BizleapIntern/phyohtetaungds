package com.bizleap.training.ds.loader.impl.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.log4j.Logger;
import org.junit.Ignore;
import org.junit.Test;

import com.bizleap.commons.domain.exception.ServiceUnavailableException;

public class EmployeeServiceImplTest extends ServiceTest{
static Logger logger=Logger.getLogger(EmployeeServiceImplTest.class);
	
	
//	@Ignore
	@Test
		public void testFindByEmployeeBoId() throws IOException, ServiceUnavailableException {
			
			assertNotNull(employeeService.findByEmployeeBoId("PER01"));
			logger.info("Employee List"+employeeService.findByEmployeeBoId("PER01"));
			assertTrue(CollectionUtils.isNotEmpty(employeeService.findByEmployeeBoId("PER01")));
		}
	//	@Ignore
		@Test
			public void testGetAllEmployee() throws IOException, ServiceUnavailableException {
				
				assertEquals(8,employeeService.getAllEmployee().size());
			}

}
