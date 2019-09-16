package bandymas.antras;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity 
public class Sporto_klubas implements Serializable{
	
	private static final long serialVersionUID = -6790693372846798580L;	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String pavadinimas;
	private String adresas;
	private String savininkas;
	
	@JsonIgnoreProperties("sporto_klubas")
	@OneToMany(mappedBy = "sporto_klubas",cascade = CascadeType.ALL)
	private List<Nariai> nariai; 
	
	@JsonIgnoreProperties("sporto_klubas")
	@OneToMany(mappedBy = "sporto_klubas",cascade = CascadeType.ALL)
	private List<Sporto_sakos> sporto_sakos;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPavadinimas() {
		return pavadinimas;
	}
 
	public void setPavadinimas(String pavadinimas) {
		this.pavadinimas = pavadinimas;
	}
 
	public String getAdresas() {
		return adresas;
	}
 
	public void setAdresas(String adresas) {
		 this.adresas = adresas;
	} 
 
	public String getSavininkas() {
		return savininkas;
	}

	public void setSavininkas(String savininkas) {
		this.savininkas = savininkas;
	}
	
	public List<Sporto_sakos> getSporto_sakos() {
		
		return sporto_sakos;
	}

	public void setSporto_sakos (List<Sporto_sakos> sporto_sakos) {
	
		this.sporto_sakos = sporto_sakos;
	}
	
	public List<Nariai> getNariai() {
		
		return nariai;
	}

	public void setNariai (List<Nariai> nariai) {
	
		this.nariai = nariai;
	}

} 