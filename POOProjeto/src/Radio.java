import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "Radio")

public class Radio implements Identificavel {
	
	@Id
	private Long id;
	private String nome;
	@ManyToOne
	@JoinColumn(name="id_PlayList")
	private Set <PlayList> playList;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Set<PlayList> getPlayList() {
		return playList;
	}
	public void setPlayList(Set<PlayList> playList) {
		this.playList = playList;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((playList == null) ? 0 : playList.hashCode());
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
		Radio other = (Radio) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (playList == null) {
			if (other.playList != null)
				return false;
		} else if (!playList.equals(other.playList))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Radio [id=" + id + ", nome=" + nome + ", playList=" + playList + "]";
	}
	public Radio(Long id, String nome, Set<PlayList> playList) {
		super();
		this.id = id;
		this.nome = nome;
		this.playList = playList;
	}
	public Radio() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}