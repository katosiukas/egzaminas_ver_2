package bandymas.antras;

import java.io.Serializable;
import javax.persistence.*;

@Entity 
public class Nariai implements Serializable{
	
	private static final long serialVersionUID = -6790693372846798580L;	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String vardas;
	private String pavarde;
	private String gimimo_data;
	private String miestas;
	private String lytis;
		
	@Column(nullable=true)
	private Integer klubo_id;
		 
	@ManyToOne 
	@JoinColumn(name="klubo_id", insertable = false, updatable = false)
	private Sporto_klubas sporto_klubas;
	
	public Nariai() {}
 
	public Nariai(String vardas, String pavarde, String gimimo_data, String miestas, String lytis, Integer klubo_id) {
	 
		this.vardas = vardas;
		this.pavarde = pavarde;
		this.gimimo_data = gimimo_data;
		this.miestas = miestas;
		this.lytis = lytis;
		this.klubo_id = klubo_id; 
		 
	}
  
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getVardas() {
		return vardas;
	}
 
	public void setVardas(String vardas) {
		this.vardas = vardas;
	}
 
	public String getPavarde() {
		return pavarde;
	}
 
	public void setPavarde(String pavarde) {
		 this.pavarde = pavarde;
	} 
 
	public String getGimimo_data() {
		return gimimo_data;
	}

	public void setGimimo_data(String gimimo_data) {
		this.gimimo_data = gimimo_data;
	}

	public String getMiestas() {
		return miestas;
	}
 
	public void setMiestas(String miestas) {
		 this.miestas = miestas;
	} 
 
	public String getLytis() {
		return lytis;
	}
 
	public void setLytis(String lytis) {
		 this.lytis = lytis;
	} 
	
	public Integer getKlubo_id() {
		return klubo_id;
	}

	public void setKlubo_id(Integer klubo_id) {
		this.klubo_id = klubo_id;
	}
		
	public void setSporto_klubas(Sporto_klubas sporto_klubas) {
		this.sporto_klubas = sporto_klubas;
	}
 
	public Sporto_klubas getSporto_klubas() {
		return sporto_klubas;
	}
} 