import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Radio {
	@Id
	private Integer musicaFonte;
	private String nome;
	private PlayList playList;

	public Integer getMusicaFonte() {
		return musicaFonte;
	}

	public void setMusicaFonte(Integer musicaFonte) {
		this.musicaFonte = musicaFonte;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public PlayList getPlayList() {
		return playList;
	}

	public void setPlayList(PlayList playList) {
		this.playList = playList;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((musicaFonte == null) ? 0 : musicaFonte.hashCode());
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
		if (musicaFonte == null) {
			if (other.musicaFonte != null)
				return false;
		} else if (!musicaFonte.equals(other.musicaFonte))
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
		return "Radio [musicaFonte=" + musicaFonte + ", nome=" + nome + ", playList=" + playList + "]";
	}

	public Radio(Integer musicaFonte, String nome, PlayList playList) {
		super();
		this.musicaFonte = musicaFonte;
		this.nome = nome;
		this.playList = playList;
	}

}
