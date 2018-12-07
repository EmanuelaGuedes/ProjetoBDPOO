
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DAO<Album> dao = new DAO<Album>();
		Album a = new Album();
		a.setId(22l);
		a.setTitulo("");
		dao.save(a);
		Album a2 = new Album();
		a2.setId(23l);
		a2.setTitulo("");
		dao.save(a2);
		Album find = dao.find(Album.class, 22l);
		System.out.println(find.getTitulo());
		// ________________________________________________
		//
		DAO<Artista> daoArtista = new DAO<Artista>();
		Artista Artista = new Artista();
		Artista.setId(22l);
		Artista.setNome("");
		daoArtista.save(Artista);
		Artista Artista2 = new Artista();
		Artista2.setId(23l);
		Artista2.setNome("");
		daoArtista.save(Artista2);
		Artista findArtista = daoArtista.find(Artista.class, 22l);
		System.out.println(findArtista.getNome());
		// _____________________________________________
		//
		DAO<Genero> daoGenero = new DAO<Genero>();
		Genero g = new Genero();
		g.setId(22l);
		g.setEstiloMusical("");
		daoGenero.save(g);
		Genero g2 = new Genero();
		g2.setId(23l);
		g2.setEstiloMusical("");
		daoGenero.save(g2);
		Genero findGenero = daoGenero.find(Genero.class, 222l);
		System.out.println(findGenero.getEstiloMusical());

		// _________________________________________________
		//
		DAO<Musica> daoMusica = new DAO<Musica>();
		Musica m = new Musica();
		m.setId(855l);
		m.setNome("");
		daoMusica.save(m);
		Musica m2 = new Musica();
		m2.setId(84485l);
		m2.setNome("");
		daoMusica.save(m2);
		Musica findMusica = daoMusica.find(Musica.class, 223l);
		System.out.println(findMusica.getNome());
		//___________________________________________________
		//
		DAO<PlayList> daoPlayList = new DAO<PlayList>();
		PlayList p = new PlayList();
		p.setId(855l);
		p.setNome("");
		daoPlayList.save(p);
		PlayList p2 = new PlayList();
		p2.setId(84485l);
		p2.setNome("");
		daoPlayList.save(p2);
		PlayList findPlayList = daoPlayList.find(PlayList.class, 223l);
		System.out.println(findPlayList.getNome());
		//_____________________________________________________
		//
		DAO<Radio> daoRadio = new DAO<Radio>();
		Radio r = new Radio();
		r.setId(855l);
		r.setNome("");
		daoRadio.save(r);
		Radio r2 = new Radio();
		r2.setId(84485l);
		r2.setNome("");
		daoRadio.save(r2);
		Radio findRadio = daoRadio.find(Radio.class, 223l);
		System.out.println(findRadio.getNome());	
		//_________________________________________________________
		//
		DAO<Usuario> daoUsuario = new DAO<Usuario>();
		Usuario u = new Usuario();
		u.setId(855l);
		u.setNome("");
		daoUsuario.save(u);
		Usuario u2 = new Usuario();
		u2.setId(84485l);
		u2.setNome("");
		daoUsuario.save(u2);
		Usuario findUsuario = daoUsuario.find(Usuario.class, 223l);
		System.out.println(findUsuario.getNome());
	//________________________________________________________________
	//
		DAO<VideoClip> daoVideoClip = new DAO<VideoClip>();
		VideoClip v = new VideoClip();
		v.setId(855l);
		v.setNome("");
		daoVideoClip.save(v);
		VideoClip v2 = new VideoClip();
		v2.setId(84485l);
		v2.setNome("");
		daoVideoClip.save(v2);
		VideoClip findVideoClip = daoVideoClip.find(VideoClip.class, 223l);
		System.out.println(findVideoClip.getNome());

}
}
