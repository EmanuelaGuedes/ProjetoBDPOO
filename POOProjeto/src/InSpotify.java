import java.util.ArrayList;

public interface InSpotify {

	public Usuario addUsuario(Integer id, String nome, PlayList playlist);

	public void removerUsuario(Integer id);

	public Musica addMusica(Integer id, String nome, Artista artista);

	public void removerMusica(Integer id);

	public Album addAlbum(Integer id, String nome, Genero genero);

	public void removeAlbum(Integer id);

	public Artista addArtista(Integer id, String nome);

	public void removeArtista(Integer id);

	public Genero addGenero(Integer id, String nome);

	public void removerGenero(Integer id);

	public PlayList addPlayList(Integer id, String nome, ArrayList<Musica> musicas );

	public void removePlayList(Integer id);

	public Radio createRadio(Integer id, String nome, PlayList playList);

	public void removeRadio(Integer id);

}
