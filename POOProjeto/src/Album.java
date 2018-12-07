import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;
import java.util.Set;
import java.util.Set;

@Entity
@Table(name = "Album")

public class Album implements Identificavel {
	@Id
	@Column(name = "id_album")
	
	
	private Long id;
	private String titulo;
	private Date anoDeLancamento;
	@OneToMany
	@JoinColumn(name="id_Musica")
	private Set<Musica> faixas;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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
	public Set<Musica> getFaixas() {
		return faixas;
	}
	public void setFaixas(Set<Musica> faixas) {
		this.faixas = faixas;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((anoDeLancamento == null) ? 0 : anoDeLancamento.hashCode());
		result = prime * result + ((faixas == null) ? 0 : faixas.hashCode());
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
		if (faixas == null) {
			if (other.faixas != null)
				return false;
		} else if (!faixas.equals(other.faixas))
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
	@Override
	public String toString() {
		return "Album [id=" + id + ", titulo=" + titulo + ", anoDeLancamento=" + anoDeLancamento + ", faixas=" + faixas
				+ "]";
	}
	public Album(Long id, String titulo, Date anoDeLancamento, Set<Musica> faixas) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.anoDeLancamento = anoDeLancamento;
		this.faixas = faixas;
	}
	public Album() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
