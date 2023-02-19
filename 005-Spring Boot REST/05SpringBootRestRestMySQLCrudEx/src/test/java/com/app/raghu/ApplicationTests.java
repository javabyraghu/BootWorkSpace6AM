package com.app.raghu;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@SpringBootTest(webEnvironment = WebEnvironment.MOCK)
@AutoConfigureMockMvc
@TestPropertySource("classpath:application.properties")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ApplicationTests {

	@Autowired
	private MockMvc mockMvc;
	
	@Test
	@Order(1)
	@DisplayName("STUDENT # SAVE OPERATION")
	public void testSaveStudent() throws Exception {
		//a. Create Mock Request
		MockHttpServletRequestBuilder request = 
				MockMvcRequestBuilders.post("/v1/api/student/save")
				.contentType(MediaType.APPLICATION_JSON)
				.content("{\"stdName\" : \"AJAY\",\"stdGen\" : \"Male\", \"stdCourse\" : \"SBMS\", \"stdAddr\" : \"HYDERABAD, IND\"}");
		
		//b. Execute and read result
		MvcResult result = mockMvc.perform(request).andReturn();
		
		//c. Read Response from Result
		MockHttpServletResponse response = result.getResponse();
		
		//d. Assert Result with expected values
		assertNotNull(response.getContentAsString());
		assertEquals(HttpStatus.OK.value(), response.getStatus());
		if(!response.getContentAsString().contains("Created")) {
			fail("Looks Student is not created");
		}
	}

	@Test
	@Order(2)
	@DisplayName("STUDENT # GETIING ALL RECORDS")
	public void testGetAllStudents() throws Exception {
		//a. Create Mock Request
		MockHttpServletRequestBuilder request = 
				MockMvcRequestBuilders.get("/v1/api/student/all");
		
		//b. Execute and read result
		MvcResult result = mockMvc.perform(request).andReturn();
				
		//c. Read Response from Result
		MockHttpServletResponse response = result.getResponse();
		
		//d. Assert Result with expected values
		assertNotNull(response.getContentAsString());
		assertEquals(HttpStatus.OK.value(), response.getStatus());
	}
	
	
	@Test
	@Order(3)
	@DisplayName("STUDENT # FETCHING ONE STUDENT BY ID")
	public void testFetchOneStudent() throws Exception {
		//a. Create Mock Request
		MockHttpServletRequestBuilder request = 
				MockMvcRequestBuilders.get("/v1/api/student/find/{id}",1);
				
		//b. Execute and read result
		MvcResult result = mockMvc.perform(request).andReturn();
						
		//c. Read Response from Result
		MockHttpServletResponse response = result.getResponse();
				
		//d. Assert Result with expected values
		assertNotNull(response.getContentAsString());
		assertEquals(HttpStatus.OK.value(), response.getStatus());
		assertEquals("application/json", response.getContentType());
		if(!response.getContentAsString().contains("AJAY")) {
			fail("Looks Student data not exist");
		}
	}
	
	
	@Test
	@Order(4)
	@DisplayName("STUDENT # UPDATING STUDENT")
	@Disabled
	public void testUpdateStudent() throws Exception {
		//a. Create Mock Request
		MockHttpServletRequestBuilder request = 
				MockMvcRequestBuilders.put("/v1/api/student/modify")
				.contentType(MediaType.APPLICATION_JSON)
				.content("{\"stdId\":1,\"stdName\" : \"AJAY KUMAR\",\"stdGen\" : \"Male\", \"stdCourse\" : \"SBMS\", \"stdAddr\" : \"HYDERABAD, IND\"}");
				
		//b. Execute and read result
		MvcResult result = mockMvc.perform(request).andReturn();
				
		//c. Read Response from Result
		MockHttpServletResponse response = result.getResponse();
				
		//d. Assert Result with expected values
		assertNotNull(response.getContentAsString());
		assertEquals(HttpStatus.OK.value(), response.getStatus());
		if(!response.getContentAsString().contains("Updated")) {
				fail("Looks Student is not exist");
		}
	}

	@Test
	@Order(5)
	@DisplayName("STUDENT # DELETE")
	public void testDeleteStudent() throws Exception {
		//a. Create Mock Request
		MockHttpServletRequestBuilder request = 
						MockMvcRequestBuilders.delete("/v1/api/student/remove/{id}",1);
						
		//b. Execute and read result
		MvcResult result = mockMvc.perform(request).andReturn();
								
		//c. Read Response from Result
		MockHttpServletResponse response = result.getResponse();
						
		//d. Assert Result with expected values
		assertNotNull(response.getContentAsString());
		assertEquals(HttpStatus.OK.value(), response.getStatus());
		if(!response.getContentAsString().contains("Deleted")) {
				fail("Looks Student data not exist");
		}
	}
	
}



