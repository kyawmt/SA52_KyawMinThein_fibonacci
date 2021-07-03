package sg.edu.iss.fibonacci.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import sg.edu.iss.fibonacci.service.FibService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class FibController {
	
	@GetMapping("fibonacci")
	public Map<String, List<Integer>> getFibonacci(@RequestParam("elements") int elements) {
		
		Map<String, List<Integer>> fib = new HashMap<String, List<Integer>>();
		
		
		
		List<Integer> fibonacci = FibService.getFibonacci(elements);
		List<Integer> sorted = FibService.getSorted(fibonacci);
						
		fib.put("fibonacci", fibonacci);
		fib.put("sorted", sorted);
		
		
		
		return fib;
	}

}
