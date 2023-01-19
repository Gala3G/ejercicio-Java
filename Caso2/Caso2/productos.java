package Caso2;

import java.util.ArrayList;

import Caso4.ListaBuscarPosicion;

public class productos {

	private String tipo;
	private int precio;
	private String nombre;

	public productos(String tipo, int i, String nombre) {
		super();
		this.tipo = tipo;
		this.precio = i;
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "productos [tipo=" + tipo + ", precio=" + precio + ", nombre=" + nombre + "]";
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void guardar(ArrayList<productos> lista, productos producto) {
		lista.add(producto);
	}

}
