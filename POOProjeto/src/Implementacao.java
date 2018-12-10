import java.util.ArrayList;

public class Implementacao implements InterfaceSpotify {

	
	
	
	
	@Override
	public Usuario addUsuario(Integer conta, String nome) throws NomeInvalidoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removerUsuario(Integer conta, Usuario usuario) throws IdInvalidoException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Musica addMusica(Integer id, String nome, Artista artista, Album album, Genero genero)
			throws ArtistaInvalidoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removerMusica(Integer id, Musica musica) throws MusicaInvalidoException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Album addAlbum(Integer id, String nome, Genero genero, Artista artista, PlayList playlist)
			throws GeneroInvalidoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeAlbum(Integer id, Album album) throws AlbumInvalidoException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Artista addArtista(Integer id, String nome, Musica musicas) throws IdInvalidoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeArtista(Integer id, Artista artista) throws ArtistaInvalidoException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Genero addGenero(Integer id, String estiloMusical, Musica musicas, ArrayList<Artista> maisFamosos,
			PlayList playlist) throws PlayListInvalidoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removerGenero(Integer id, Genero genero) throws IdInvalidoException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public PlayList addPlayList(Integer id, String nome, ArrayList<Musica> musicas) throws MusicaInvalidoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removePlayList(Integer id, PlayList playlist) throws PlayListInvalidoException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Radio createRadio(Integer musicaFonte, String nome, PlayList playList) throws MusicaFonteInvalidoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeRadio(Integer musicaFonte, Radio radio) throws MusicaFonteInvalidoException {
		// TODO Auto-generated method stub
		
	}
	

}
