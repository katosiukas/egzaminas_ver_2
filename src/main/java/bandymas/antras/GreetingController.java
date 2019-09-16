package bandymas.antras;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {
	
	@GetMapping("/klubas")
	public String klubas(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		
	        model.addAttribute("name", name);
	        return "klubas";
	    
	}
	 
	@GetMapping("/narys")
	public String narys(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		
	        model.addAttribute("name", name);
	        return "narys";
	    
	}
	
	@GetMapping("/klubo_nariai")
	public String klubo_nariai(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		
	        model.addAttribute("name", name);
	        return "klubo_nariai";
	    
	}
	
	@GetMapping("/sporto_sakos")
	public String sporto_sakos(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		
	        model.addAttribute("name", name);
	        return "sporto_sakos";
	    
	}
	
	@GetMapping("/nario_sakos")
	public String nario_sakos(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		
	        model.addAttribute("name", name);
	        return "nario_sakos";
	    
	}
	
}