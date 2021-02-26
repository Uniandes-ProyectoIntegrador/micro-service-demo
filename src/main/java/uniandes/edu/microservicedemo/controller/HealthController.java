/**
 * 
 */
package uniandes.edu.microservicedemo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author leonardovalbuena
 *
 */
@CrossOrigin(origins = "*")
@RequestMapping("/demo")
@RestController
public class HealthController {
	
	
	@GetMapping("/health")
	public String health() {
		return "OK";
	}

}
