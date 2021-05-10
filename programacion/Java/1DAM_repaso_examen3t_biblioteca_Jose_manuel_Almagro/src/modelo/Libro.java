package modelo;

import java.time.LocalDate;

public class Libro {
	private String ISBN;
	private String titulo;
	private LocalDate fechaPublicacion;
	private String editorial;
	private String categoria;
	private int edicion;
	private String autor;
	private int numPaginas;
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Libro [ISBN=" + ISBN + ", titulo=" + titulo + ", fechaPublicacion=" + fechaPublicacion + ", editorial="
				+ editorial + ", categoria=" + categoria + ", edicion=" + edicion + ", autor=" + autor + ", numPaginas="
				+ numPaginas + "]";
	}

	public Libro(String iSBN, String titulo, LocalDate fechaPublicacion, String editorial, String categoria,
			int edicion, String autor, int numPaginas) {
		super();
		ISBN = iSBN;
		this.titulo = titulo;
		this.fechaPublicacion = fechaPublicacion;
		this.editorial = editorial;
		this.categoria = categoria;
		this.edicion = edicion;
		this.autor = autor;
		this.numPaginas = numPaginas;
	}

	public String getISBN() {
		return ISBN;
	}
	
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public LocalDate getFechaPublicacion() {
		return fechaPublicacion;
	}
	
	public void setFechaPublicacion(LocalDate fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}
	
	public String getEditorial() {
		return editorial;
	}
	
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	
	public String getCategoria() {
		return categoria;
	}
	
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public int getEdicion() {
		return edicion;
	}
	
	public void setEdicion(int edicion) {
		this.edicion = edicion;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public int getNumPaginas() {
		return numPaginas;
	}
	
	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}
	
	
}
