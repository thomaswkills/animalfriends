package modelo;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: mausTratos
 *
 */
@Entity

public class mausTratos implements Serializable {
	//Long
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private Long id;
		private static final long serialVersionUID = 1L;
		
		
	private String descricaoMT;
	private String contatoMT;
	private String cidadeMT;
	private Double latitudeMT;
	private Double longitudeMT;
	
	
	
	

	public String getDescricaoMT() {
		return descricaoMT;
	}





	public void setDescricaoMT(String descricaoMT) {
		this.descricaoMT = descricaoMT;
	}





	public String getContatoMT() {
		return contatoMT;
	}





	public void setContatoMT(String contatoMT) {
		this.contatoMT = contatoMT;
	}





	public String getCidadeMT() {
		return cidadeMT;
	}





	public void setCidadeMT(String cidadeMT) {
		this.cidadeMT = cidadeMT;
	}





	public Double getLatitudeMT() {
		return latitudeMT;
	}





	public void setLatitudeMT(Double LatitudeMT) {
		this.latitudeMT = LatitudeMT;
	}





	public Double getLongitudeMT() {
		return longitudeMT;
	}





	public void setLongitudeMT(Double longitudeMT) {
		this.longitudeMT = longitudeMT;
	}





	public mausTratos() {
		super();
	}
   
}
