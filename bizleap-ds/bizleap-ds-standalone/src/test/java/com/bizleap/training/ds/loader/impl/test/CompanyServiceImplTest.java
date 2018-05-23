package com.bizleap.training.ds.loader.impl.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.log4j.Logger;
import org.junit.Ignore;
import org.junit.Test;

import com.bizleap.commons.domain.enums.ObjectFullnessLevel;
import com.bizleap.commons.domain.exception.ServiceUnavailableException;
import com.bizleap.training.ds.service.CompanyService;

public class CompanyServiceImplTest extends ServiceTest {
	static Logger logger = Logger.getLogger(CompanyServiceImplTest.class);

 //   @Ignore
	@Test
	public void testFindByCompanyBoIdSummary() throws IOException, ServiceUnavailableException {

		assertNotNull(companyService.findByCompanyBoId("COMP01",ObjectFullnessLevel.FULL));
		logger.info("Full" + companyService.findByCompanyBoId("COMP01",ObjectFullnessLevel.FULL));
		assertTrue(CollectionUtils.isNotEmpty(companyService.findByCompanyBoId("COMP01",ObjectFullnessLevel.FULL)));
		
		assertNotNull(companyService.findByCompanyBoId("COMP01",ObjectFullnessLevel.SUMMARY));
		logger.info("Summary" + companyService.findByCompanyBoId("COMP01",ObjectFullnessLevel.SUMMARY));
		assertTrue(CollectionUtils.isNotEmpty(companyService.findByCompanyBoId("COMP01",ObjectFullnessLevel.SUMMARY)));
		
		assertNotNull(companyService.findByCompanyBoId("COMP01",ObjectFullnessLevel.DETAILED));
		logger.info("Detailed" + companyService.findByCompanyBoId("COMP01",ObjectFullnessLevel.DETAILED));
		assertTrue(CollectionUtils.isNotEmpty(companyService.findByCompanyBoId("COMP01",ObjectFullnessLevel.DETAILED)));
	}

    @Ignore
	@Test
	public void testFindByCompanyBoId() throws IOException, ServiceUnavailableException {

		assertNotNull(companyService.findByCompanyBoId("COMP01"));
		logger.info("Company List" + companyService.findByCompanyBoId("COMP01"));
		assertTrue(CollectionUtils.isNotEmpty(companyService.findByCompanyBoId("COMP01")));
	}
	
	@Ignore
	@Test
	public void testGetAllCompany() throws IOException, ServiceUnavailableException {
		assertEquals(3, companyService.getAllCompany().size());
	}

}
