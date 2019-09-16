package bandymas.antras;

import java.io.Serializable;
import javax.persistence.*;

@Entity 
public class Sporto_sakos implements Serializable{
	
	private static final long serialVersionUID = -6790693372846798580L;	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String saka;
			
	@Column(nullable=true)
	private Integer klubo_id;
			
	@ManyToOne 
	@JoinColumn(name="klubo_id", insertable = false, updatable = false)
	private Sporto_klubas sporto_klubas;
 
	public Sporto_sakos() {}
	
	public Sporto_sakos(String saka, Integer klubo_id) {
		
		this.saka = saka;
		this.klubo_id = klubo_id;
				
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSaka() {
		return saka;
	}

	public void setSaka(String saka) {
		this.saka = saka;
	}

	public Integer getKlubo_id() {
		return klubo_id;
	}

	public void setKlubo_id(Integer klubo_id) {
		this.klubo_id = klubo_id;
	}
	
	public Sporto_klubas getSporto_klubas() {
		return sporto_klubas;
	}

	public void setSporto_klubas(Sporto_klubas sporto_klubas) {
		this.sporto_klubas = sporto_klubas;
	}
	
}
