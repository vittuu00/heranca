package midias;

public class CD extends Midia {

	public CD(int codigo, String descricao) {
		super(codigo, descricao);
		// TODO Auto-generated constructor stub
	}
 private int faixas;
 private String artista;
 private String album;
 public void Midia1(int duracao, String gravadora) {
		setGravadora(gravadora);
		setDuracao(duracao);
	}
public void CD1(int faixas, String artista, String album) {
	setFaixas(faixas);
	setArtista(artista); setAlbum(album);
}
public int getFaixas() {
	return faixas;
}
public void setFaixas(int faixas) {
	if(faixas>0)
	this.faixas = faixas;
}
public String getArtista() {
	return artista;
}
public void setArtista(String artista) {
	if(artista.length()>0)
	this.artista = artista;
}
public String getAlbum() {
	return album;
}
public void setAlbum(String album) {
	if(album.length()>0)
	this.album = album;
}
@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("CD [faixas=");
	builder.append(faixas);
	builder.append(", artista=");
	builder.append(artista);
	builder.append(", album=");
	builder.append(album);
	builder.append(", getFaixas()=");
	builder.append(getFaixas());
	builder.append(", getArtista()=");
	builder.append(getArtista());
	builder.append(", getAlbum()=");
	builder.append(getAlbum());
	builder.append(super.toString());
	return builder.toString();
}

 
}
