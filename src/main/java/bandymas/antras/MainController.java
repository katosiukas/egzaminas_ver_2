package bandymas.antras;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Optional;

@Controller    
@RequestMapping(path="/restfull") 
public class MainController {
						
	@Autowired         	
	private Sporto_klubasRepository Sporto_klubasRepository;
	
	@Autowired
	private NariaiRepository NariaiRepository;
	
	@Autowired
	private Sporto_sakosRepository Sporto_sakosRepository;
	
	@Autowired
	private Nario_sakaRepository Nario_sakaRepository;

	// Klubai SQL
	
	@GetMapping(path="/all_klubai")
	public @ResponseBody Iterable<Sporto_klubas> getAllKlubai() {
		
		return Sporto_klubasRepository.findAll();
	}
	
	@GetMapping(path="/klubas")
	public @ResponseBody Optional<Sporto_klubas> Klubas(@RequestParam Integer id) {
		
		return Sporto_klubasRepository.findById (id);
	}
	
	@GetMapping(path="/del_klubas") 
	public @ResponseBody String klubas (@RequestParam Integer id ) {
				
		Optional <Sporto_klubas> found = Sporto_klubasRepository.findById( id );
		
		String res = "Not done";
		Sporto_klubas n = found.get();
		n.setId(id);
		Sporto_klubasRepository.deleteById(id);
		res = "Deleted";
		
		return res;
	}
	
	@GetMapping(path="/edit_klubas") 
	public @ResponseBody String redaguotikluba (@RequestParam Integer id
			, @RequestParam String pavadinimas
			, @RequestParam String adresas
			, @RequestParam String savininkas
						
			) {
				
		Optional <Sporto_klubas> found = Sporto_klubasRepository.findById( id );
		
		String res = "Not done";
		
		if ( found.isPresent() ) {
			
			   Sporto_klubas n = found.get();
			   n.setId(id);
			   n.setPavadinimas(pavadinimas);
			   n.setAdresas(adresas);
			   n.setSavininkas(savininkas);
			   Sporto_klubasRepository.save(n);	
			   res = "Saved"; 
			   			}
		return res;
	}
	
	@GetMapping(path="/add_klubas") 
	public @ResponseBody String addNewKlubas (@RequestParam String pavadinimas
			, @RequestParam String adresas
			, @RequestParam String savininkas)
			 {
				
		Sporto_klubas n = new Sporto_klubas();
		n.setPavadinimas(pavadinimas);
		n.setAdresas(adresas);
		n.setSavininkas(savininkas);
		Sporto_klubasRepository.save(n);
		return "Saved";
	}
	
	//---------------------- Nariai SQL --------------------------------------------
	
	@GetMapping(path="/all_nariai")
	public @ResponseBody Iterable<Nariai> getAllNariai() {
		
		return NariaiRepository.findAll();
	}
	
	@GetMapping(path="/narys")
	public @ResponseBody Optional<Nariai> Nariai(@RequestParam Integer id) {
		
		return NariaiRepository.findById (id);
	}
	
	@GetMapping(path="/del_narys") 
	public @ResponseBody String narys (@RequestParam Integer id ) {
				
		Optional <Nariai> found = NariaiRepository.findById( id );
		
		String res = "Not done";
		Nariai n = found.get();
		n.setId(id);
		NariaiRepository.deleteById(id);
		res = "Deleted";
		
		return res;
	}
	
	@GetMapping(path="/edit_narys") 
	public @ResponseBody String redaguotinary (@RequestParam Integer id
			, @RequestParam String vardas
			, @RequestParam String pavarde
			, @RequestParam String gimimo_data
			, @RequestParam String miestas
			, @RequestParam String lytis
			, @RequestParam Integer klubo_id
						
			) {
				
		Optional <Nariai> found = NariaiRepository.findById( id );
		
		String res = "Not done";
		
		if ( found.isPresent() ) {
			
			   Nariai n = found.get();
			   n.setId(id);
			   n.setVardas(vardas);
			   n.setPavarde(pavarde);
			   n.setGimimo_data(gimimo_data);
			   n.setMiestas(miestas);
			   n.setLytis(lytis);
			   n.setKlubo_id(klubo_id);
			   NariaiRepository.save(n);	
			   res = "Saved"; 
		}
		return res;
	}
	
	@GetMapping(path="/add_narys")
	public @ResponseBody String addNewNarys (@RequestParam String vardas
			, @RequestParam String pavarde 
			, @RequestParam String gimimo_data
			, @RequestParam String miestas
			, @RequestParam String lytis
			, @RequestParam Integer klubo_id
			) {
				
		Nariai n = new Nariai();
		n.setVardas(vardas);
		n.setPavarde(pavarde);
		n.setGimimo_data(gimimo_data);
		n.setMiestas(miestas);
		n.setLytis(lytis);
		n.setKlubo_id(klubo_id);
		NariaiRepository.save(n);
		return "Saved";
	}
	
	//---------------------- Klubo sporto sakos SQL --------------------------------------------
	
	@GetMapping(path="/all_sakos")
	public @ResponseBody Iterable<Sporto_sakos> getAllSakos() {
		
		return Sporto_sakosRepository.findAll();
	}
	
	@GetMapping(path="/saka")
	public @ResponseBody Optional<Sporto_sakos> Sporto_sakos(@RequestParam Integer id) {
		
		return Sporto_sakosRepository.findById (id);
	}
	
	@GetMapping(path="/del_saka") 
	public @ResponseBody String saka (@RequestParam Integer id ) {
				
		Optional <Sporto_sakos> found = Sporto_sakosRepository.findById( id );
		
		String res = "Not done";
		Sporto_sakos n = found.get();
		n.setId(id);
		Sporto_sakosRepository.deleteById(id);
		res = "Deleted";
		
		return res;
	}
	
	@GetMapping(path="/edit_saka_k") 
	public @ResponseBody String redaguotiS_saka_k (@RequestParam Integer id
			, @RequestParam String saka
			, @RequestParam Integer klubo_id
						
			) {
				
		Optional <Sporto_sakos> found = Sporto_sakosRepository.findById( id );
		
		String res = "Not done";
		
		if ( found.isPresent() ) {
			
			   Sporto_sakos n = found.get();
			   n.setId(id);
			   n.setSaka(saka);
			   n.setKlubo_id(klubo_id);
			   Sporto_sakosRepository.save(n);	
			   res = "Saved"; 
		}
		return res;
	}
	
	@GetMapping(path="/add_saka_k")
	public @ResponseBody String addNewSaka_k (@RequestParam String saka
			, @RequestParam Integer klubo_id
			) {
				
		Sporto_sakos n = new Sporto_sakos();
		n.setSaka(saka);
		n.setKlubo_id(klubo_id);
		Sporto_sakosRepository.save(n);
		return "Saved";
	}
	
	//------ Nario sporto sakos SQL -------
	
	@GetMapping(path="/nario_saka")
	public @ResponseBody List<Nario_saka> Nario_saka(@RequestParam Integer nariai_id) {
		
		return Nario_sakaRepository.findByNarionr (nariai_id);
	}
	
	@GetMapping(path="/del_saka_n") 
	public @ResponseBody String saka_n (@RequestParam Integer id) {
				
		Optional <Nario_saka> found = Nario_sakaRepository.findById( id );
		
		String res = "Not done";
		Nario_saka n = found.get();
		n.setId(id);
		Nario_sakaRepository.delete(n);
		res = "Deleted";
		
		return res;
	}
	
	@GetMapping(path="/edit_saka_n") 
	public @ResponseBody String redaguotiS_saka_n (@RequestParam Integer id
			, @RequestParam String saka
									
			) {
				
		Optional <Nario_saka> found = Nario_sakaRepository.findById( id );
		
		String res = "Not done";
		
		if ( found.isPresent() ) {
			
			   Nario_saka n = found.get();
			   n.setId(id);
			   n.setSaka(saka);
			   Nario_sakaRepository.save(n);	
			   res = "Saved"; 
		}
		return res;
	}
	
	@GetMapping(path="/add_saka_n")
	public @ResponseBody String addNewSaka_n (@RequestParam String saka, @RequestParam Integer narionr) {
				
		Nario_saka n = new Nario_saka();
		n.setSaka(saka);
		n.setNarionr(narionr);
		Nario_sakaRepository.save(n);
		return "Saved";
	}	
}