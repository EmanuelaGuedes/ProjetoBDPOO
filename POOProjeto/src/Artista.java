import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Artista {

	@Id
	private Integer id;
	private String nome;
	private int numeroDeMusicas;
	private int idade;
	private String gravadora;
	private Musica musica;

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

	public Musica getMusica() {
		return musica;
	}

	public void setMusica(Musica musica) {
		this.musica = musica;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((gravadora == null) ? 0 : gravadora.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + idade;
		result = prime * result + ((musica == null) ? 0 : musica.hashCode());
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
		if (musica == null) {
			if (other.musica != null)
				return false;
		} else if (!musica.equals(other.musica))
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
				+ ", gravadora=" + gravadora + ", musica=" + musica + "]";
	}

	public Artista(Integer id, String nome, int numeroDeMusicas, int idade, String gravadora, Musica musica) {
		super();
		this.id = id;
		this.nome = nome;
		this.numeroDeMusicas = numeroDeMusicas;
		this.idade = idade;
		this.gravadora = gravadora;
		this.musica = musica;
	}

}
