package RestService.odev;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

	@GetMapping("/add")
    public int add(@RequestParam int sayi1, @RequestParam int sayi2) {
        return sayi1 + sayi2;
    }
	
	@PostMapping("/multiply")
    public int multiply(@RequestParam int sayi1, @RequestParam int sayi2) {
        return sayi1 * sayi2;
    }
}
