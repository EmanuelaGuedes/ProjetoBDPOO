import java.util.ArrayList;

public interface InterfaceSpotify {

	public Usuario addUsuario(Integer conta, String nome);

	public void removerUsuario(Integer conta, Usuario usuario);

	public Musica addMusica(Integer id, String nome, Artista artista, Album album, Genero genero);

	public void removerMusica(Integer id, Musica musica);

	public Album addAlbum(Integer id, String nome, Genero genero, Artista artista, PlayList playlist);

	public void removeAlbum(Integer id, Album album);

	public Artista addArtista(Integer id, String nome, Musica musicas);

	public void removeArtista(Integer id, Artista artista);

	public Genero addGenero(Integer id, String estiloMusical, Musica musicas, ArrayList<Artista> maisFamosos,
			PlayList playlist);

	public void removerGenero(Integer id, Genero genero);

	public PlayList addPlayList(Integer id, String nome, ArrayList<Musica> musicas);

	public void removePlayList(Integer id, PlayList playlist);

	public Radio createRadio(Integer musicaFonte, String nome, PlayList playList);

	public void removeRadio(Integer musicaFonte, Radio radio);

}
