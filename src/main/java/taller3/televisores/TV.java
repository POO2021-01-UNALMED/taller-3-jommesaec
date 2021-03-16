package taller3.televisores;

public class TV {

	private Marca marca; //
	int canal = 1;
	private int precio = 500; //
	boolean estado;
	int volumen = 1;
	Control control;
	private static int numTV = 0; //
	
	public TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
		numTV++;
	}
	
	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public Marca getMarca() {
		return this.marca;
	}
	
	public void setControl(Control control) {
		this.control = control;
	}
	
	public Control getControl() {
		return this.control;
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public int getPrecio() {
		return this.precio;
	}
	
	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}
	
	public int getVolumen() {
		return this.volumen;
	}
	
	public void setCanal(int canal) {
		this.canal = canal;
	}
	
	public int getCanal() {
		return this.canal;
	}
	
	public int getNumTV() {
		return numTV;
	}
	
	public void turnOn() {
		this.estado = true;
	}
	
	public void turnOff() {
		this.estado = false;
	}
	
	public boolean getEstado() {
		return this.estado;
	}
	
	public void canalUp(){
		if (this.getEstado() == true) {
			if (this.canal >= 1 && this.canal < 120) {
				this.canal++;
			}
		}
	}
	
	public void canalDown() {
		if (this.getEstado() == true) {
			if (this.canal > 1 && this.canal <= 120) {
				this.canal--;
			}
		}
	}
	
	public void volumenUp(){
		if (this.getEstado() == true) {
			if (this.volumen >= 0 && this.volumen < 7) {
				this.volumen++;
			}
		}
	}
	
	public void volumenDown() {
		if (this.getEstado() == true) {
			if (this.volumen > 0 && this.volumen <= 7) {
				this.volumen--;
			}
		}
	}
	
	
	
}
