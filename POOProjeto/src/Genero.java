
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Genero")

public class Genero implements Identificavel {
	@Id
	private Long id;
	private String estiloMusical;
	@OneToMany
	@JoinColumn(name="id_Musica")
	private Set< Musica> musicas;
	private Set<Artista> maisFamosos;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEstiloMusical() {
		return estiloMusical;
	}
	public void setEstiloMusical(String estiloMusical) {
		this.estiloMusical = estiloMusical;
	}
	public Set<Musica> getMusicas() {
		return musicas;
	}
	public void setMusicas(Set<Musica> musicas) {
		this.musicas = musicas;
	}
	public Set<Artista> getMaisFamosos() {
		return maisFamosos;
	}
	public void setMaisFamosos(Set<Artista> maisFamosos) {
		this.maisFamosos = maisFamosos;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((estiloMusical == null) ? 0 : estiloMusical.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((maisFamosos == null) ? 0 : maisFamosos.hashCode());
		result = prime * result + ((musicas == null) ? 0 : musicas.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Genero other = (Genero) obj;
		if (estiloMusical == null) {
			if (other.estiloMusical != null)
				return false;
		} else if (!estiloMusical.equals(other.estiloMusical))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (maisFamosos == null) {
			if (other.maisFamosos != null)
				return false;
		} else if (!maisFamosos.equals(other.maisFamosos))
			return false;
		if (musicas == null) {
			if (other.musicas != null)
				return false;
		} else if (!musicas.equals(other.musicas))
			return false;
		return true;
	}
	public Genero(Long id, String estiloMusical, Set<Musica> musicas, Set<Artista> maisFamosos) {
		super();
		this.id = id;
		this.estiloMusical = estiloMusical;
		this.musicas = musicas;
		this.maisFamosos = maisFamosos;
	}
	public Genero() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
