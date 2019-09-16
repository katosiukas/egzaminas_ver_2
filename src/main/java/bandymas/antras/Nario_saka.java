package bandymas.antras;

import java.io.Serializable;
import javax.persistence.*;

@Entity 
@Table(name="nario_saka")
public class Nario_saka implements Serializable{
	
	private static final long serialVersionUID = -6790693372846798580L;	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String saka;
	
	@Column(name="narionr")
    private Integer narionr;  
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNarionr() {
		return narionr;
	}

	public void setNarionr(Integer narionr) {
		this.narionr = narionr;
	}
	
	public String getSaka() {
		return saka;
	}
 
	public void setSaka(String saka) {
		this.saka = saka;
	}
}
	