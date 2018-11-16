import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Album")

public class Album {
	@Id
	@Column(name = "id_album")
	
	
	private Integer id;
	private String titulo;
	private Date anoDeLancamento;

	@OneToMany
	@JoinColumn(name="id_album")
	private Set<Musica> faixas;

	private Artista artista;
	private Genero genero;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Date getAnoDeLancamento() {
		return anoDeLancamento;
	}

	public void setAnoDeLancamento(Date anoDeLancamento) {
		this.anoDeLancamento = anoDeLancamento;
	}

	public Musica getFaixas() {
		return faixas;
	}

	public void setFaixas(Musica faixas) {
		this.faixas = faixas;
	}

	public Artista getArtista() {
		return artista;
	}

	public void setArtista(Artista artista) {
		this.artista = artista;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Album [id=" + id + ", titulo=" + titulo + ", anoDeLancamento=" + anoDeLancamento + ", faixas=" + faixas
				+ ", artista=" + artista + ", genero=" + genero + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((anoDeLancamento == null) ? 0 : anoDeLancamento.hashCode());
		result = prime * result + ((artista == null) ? 0 : artista.hashCode());
		result = prime * result + ((faixas == null) ? 0 : faixas.hashCode());
		result = prime * result + ((genero == null) ? 0 : genero.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
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
		Album other = (Album) obj;
		if (anoDeLancamento == null) {
			if (other.anoDeLancamento != null)
				return false;
		} else if (!anoDeLancamento.equals(other.anoDeLancamento))
			return false;
		if (artista == null) {
			if (other.artista != null)
				return false;
		} else if (!artista.equals(other.artista))
			return false;
		if (faixas == null) {
			if (other.faixas != null)
				return false;
		} else if (!faixas.equals(other.faixas))
			return false;
		if (genero == null) {
			if (other.genero != null)
				return false;
		} else if (!genero.equals(other.genero))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}

	public Album(Integer id, String titulo, Date anoDeLancamento, Musica faixas, Artista artista, Genero genero) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.anoDeLancamento = anoDeLancamento;
		this.faixas = faixas;
		this.artista = artista;
		this.genero = genero;
	}

}
