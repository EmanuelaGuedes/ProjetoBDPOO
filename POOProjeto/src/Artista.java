import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;
@Entity
@Table(name = "Artista")

public class Artista {

	@Id
	private Integer id;
	private String nome;
	private int numeroDeMusicas;
	private int idade;
	private String gravadora;
	@OneToMany
	@JoinColumn(name="id_Musica")
	private Set<Musica> musicas;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumeroDeMusicas() {
		return numeroDeMusicas;
	}
	public void setNumeroDeMusicas(int numeroDeMusicas) {
		this.numeroDeMusicas = numeroDeMusicas;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getGravadora() {
		return gravadora;
	}
	public void setGravadora(String gravadora) {
		this.gravadora = gravadora;
	}
	public Set<Musica> getMusicas() {
		return musicas;
	}
	public void setMusicas(Set<Musica> musicas) {
		this.musicas = musicas;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((gravadora == null) ? 0 : gravadora.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + idade;
		result = prime * result + ((musicas == null) ? 0 : musicas.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + numeroDeMusicas;
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
		Artista other = (Artista) obj;
		if (gravadora == null) {
			if (other.gravadora != null)
				return false;
		} else if (!gravadora.equals(other.gravadora))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (idade != other.idade)
			return false;
		if (musicas == null) {
			if (other.musicas != null)
				return false;
		} else if (!musicas.equals(other.musicas))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (numeroDeMusicas != other.numeroDeMusicas)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Artista [id=" + id + ", nome=" + nome + ", numeroDeMusicas=" + numeroDeMusicas + ", idade=" + idade
				+ ", gravadora=" + gravadora + ", musicas=" + musicas + "]";
	}
	public Artista(Integer id, String nome, int numeroDeMusicas, int idade, String gravadora, Set<Musica> musicas) {
		super();
		this.id = id;
		this.nome = nome;
		this.numeroDeMusicas = numeroDeMusicas;
		this.idade = idade;
		this.gravadora = gravadora;
		this.musicas = musicas;
	}
	public Artista() {
		super();
		// TODO Auto-generated constructor stub
	}

	

}
