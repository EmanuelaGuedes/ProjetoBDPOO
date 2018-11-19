import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Usuario")

public class Usuario {
	@Id
	private Integer conta;
	private String nome;
	private String email;
	private String plano;
	@ManyToMany 
	@JoinTable(
			name = "Usuario_Musica",
			joinColumns = @JoinColumn(name = "Usuario_id"),
			inverseJoinColumns = @JoinColumn(name = "Musica_id"))
	private Set<Musica> ouve;
	
	
	@ManyToMany 
	@JoinTable(
			name = "Usuario_Radio",
			joinColumns = @JoinColumn(name = "Usuario_id"),
			inverseJoinColumns = @JoinColumn(name = "Radio_id"))
	private Set <Radio> escutaUma;
	
	
	@ManyToMany 
	@JoinTable(
			name = "Usuario_VideoClip",
			joinColumns = @JoinColumn(name = "Usuario_id"),
			inverseJoinColumns = @JoinColumn(name = "VideoClip_id"))
	private Set<VideoClip> assiste;
	
	public Integer getConta() {
		return conta;
	}
	public void setConta(Integer conta) {
		this.conta = conta;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPlano() {
		return plano;
	}
	public void setPlano(String plano) {
		this.plano = plano;
	}
	public Set<Musica> getOuve() {
		return ouve;
	}
	public void setOuve(Set<Musica> ouve) {
		this.ouve = ouve;
	}
	public Set<Radio> getEscutaUma() {
		return escutaUma;
	}
	public void setEscutaUma(Set<Radio> escutaUma) {
		this.escutaUma = escutaUma;
	}
	public Set<VideoClip> getAssiste() {
		return assiste;
	}
	public void setAssiste(Set<VideoClip> assiste) {
		this.assiste = assiste;
	}
	public PlayList getPlaylist() {
		return playlist;
	}
	public void setPlaylist(PlayList playlist) {
		this.playlist = playlist;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((assiste == null) ? 0 : assiste.hashCode());
		result = prime * result + ((conta == null) ? 0 : conta.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((escutaUma == null) ? 0 : escutaUma.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((ouve == null) ? 0 : ouve.hashCode());
		result = prime * result + ((plano == null) ? 0 : plano.hashCode());
		result = prime * result + ((playlist == null) ? 0 : playlist.hashCode());
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
		Usuario other = (Usuario) obj;
		if (assiste == null) {
			if (other.assiste != null)
				return false;
		} else if (!assiste.equals(other.assiste))
			return false;
		if (conta == null) {
			if (other.conta != null)
				return false;
		} else if (!conta.equals(other.conta))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (escutaUma == null) {
			if (other.escutaUma != null)
				return false;
		} else if (!escutaUma.equals(other.escutaUma))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (ouve == null) {
			if (other.ouve != null)
				return false;
		} else if (!ouve.equals(other.ouve))
			return false;
		if (plano == null) {
			if (other.plano != null)
				return false;
		} else if (!plano.equals(other.plano))
			return false;
		if (playlist == null) {
			if (other.playlist != null)
				return false;
		} else if (!playlist.equals(other.playlist))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Usuario [conta=" + conta + ", nome=" + nome + ", email=" + email + ", plano=" + plano + ", ouve=" + ouve
				+ ", escutaUma=" + escutaUma + ", assiste=" + assiste + ", playlist=" + playlist + "]";
	}
	public Usuario(Integer conta, String nome, String email, String plano, Set<Musica> ouve, Set<Radio> escutaUma,
			Set<VideoClip> assiste, PlayList playlist) {
		super();
		this.conta = conta;
		this.nome = nome;
		this.email = email;
		this.plano = plano;
		this.ouve = ouve;
		this.escutaUma = escutaUma;
		this.assiste = assiste;
		this.playlist = playlist;
	}
	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	

	
}
