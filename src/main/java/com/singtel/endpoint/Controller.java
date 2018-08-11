package com.singtel.endpoint;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.singtel.animal.Animal;
import com.singtel.constant.URIConstants;
import com.singtel.response.ResponseBean;
import com.singtel.service.AnimalService;

/**
 * This class handles rest request and returns response.
 * 
 * @author Suria
 */
@RestController
@RequestMapping(URIConstants.ANIMAL)
public class Controller {

	@Autowired
	private AnimalService animalService;

	@RequestMapping(value = URIConstants.ANIMAL_GET_ALL, method = RequestMethod.GET)
	public ResponseEntity<?> getAll() throws JsonProcessingException {

		Animal[] animals = animalService.getAll();
		List<ResponseBean> response = new ArrayList<ResponseBean>();

		for (Animal animal : animals) {

			ResponseBean bean = new ResponseBean();
			bean.map(animal);
			response.add(bean);
		}
		
		ObjectMapper mapper = new ObjectMapper();
		String responseJson = mapper.writeValueAsString(response);

		return new ResponseEntity<String>(responseJson, HttpStatus.OK);

	}

}
