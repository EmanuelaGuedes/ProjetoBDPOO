import java.util.ArrayList;

public interface InterfaceSpotify {

	public Usuario addUsuario(Integer conta, String nome) throws NomeInvalidoException;
	
	public void removerUsuario(Integer conta, Usuario usuario) throws IdInvalidoException;

	public Musica addMusica(Integer id, String nome, Artista artista, Album album, Genero genero) throws ArtistaInvalidoException;

	public void removerMusica(Integer id, Musica musica) throws MusicaInvalidoException;

	public Album addAlbum(Integer id, String nome, Genero genero, Artista artista, PlayList playlist)throws GeneroInvalidoException ;

	public void removeAlbum(Integer id, Album album) throws AlbumInvalidoException ;

	public Artista addArtista(Integer id, String nome, Musica musicas) throws IdInvalidoException;

	public void removeArtista(Integer id, Artista artista) throws ArtistaInvalidoException;

	public Genero addGenero(Integer id, String estiloMusical, Musica musicas, ArrayList<Artista> maisFamosos,
			PlayList playlist) throws PlayListInvalidoException;

	public void removerGenero(Integer id, Genero genero) throws IdInvalidoException ;

	public PlayList addPlayList(Integer id, String nome, ArrayList<Musica> musicas) throws MusicaInvalidoException;

	public void removePlayList(Integer id, PlayList playlist)throws PlayListInvalidoException;

	public Radio createRadio(Integer musicaFonte, String nome, PlayList playList) throws MusicaFonteInvalidoException;

	public void removeRadio(Integer musicaFonte, Radio radio) throws MusicaFonteInvalidoException;

}
