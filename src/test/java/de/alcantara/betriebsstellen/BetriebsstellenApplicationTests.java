package de.alcantara.betriebsstellen;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
class BetriebsstellenApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	void contextLoads() throws Exception {

		mockMvc.perform(MockMvcRequestBuilders.get("/betriebsstelle/XBIM"))//
				.andExpect(status().isOk())//
				.andExpect(MockMvcResultMatchers.jsonPath("Name").value("Ingelmunster"))//
				.andExpect(MockMvcResultMatchers.jsonPath("Kurzname").value("Ingelmunster"))//
				.andExpect(MockMvcResultMatchers.jsonPath("Typ").value("BF"))//
				.andReturn();

		mockMvc.perform(MockMvcRequestBuilders.get("/betriebsstelle/KRK"))//
				.andExpect(status().isOk())//
				.andExpect(MockMvcResultMatchers.jsonPath("Name").value("Köln-Rodenkirchen"))//
				.andExpect(MockMvcResultMatchers.jsonPath("Kurzname").value("Rodenkirchen"))//
				.andExpect(MockMvcResultMatchers.jsonPath("Typ").value("NE-BF"))//
				.andReturn();

	}

}
