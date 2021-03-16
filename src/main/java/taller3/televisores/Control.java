package taller3.televisores;

public class Control {
	private TV tv; //
	
	public void enlazar(TV tv) {
		this.tv = tv;
		tv.control = this.tv.control;
	}
	
	public void setTv(TV tv) {
		this.tv = tv;
	}
	
	public TV getTv(TV tv) {
		return this.tv; 
	}
	
	
	public void turnOn() {
		tv.estado = true;
	}
	
	public void turnOff() {
		tv.estado = false;
	}
	
	public void canalUp(){
		if (tv.getEstado() == true) {
			if (tv.canal >= 1 && tv.canal < 120) {
				tv.canal++;
			}
		}
	}
	
	public void canalDown() {
		if (tv.getEstado() == true) {
			if (tv.canal > 1 && tv.canal <= 120) {
				tv.canal--;
			}
		}
	}
	
	public void volumenUp(){
		if (tv.getEstado() == true) {
			if (tv.volumen >= 0 && tv.volumen < 7) {
				tv.volumen++;
			}
		}
	}
	
	public void volumenDown() {
		if (tv.getEstado() == true) {
			if (tv.volumen > 0 && tv.volumen <= 7) {
				tv.volumen--;
			}
		}
	}
	
	public void setCanal(int canal) {
		tv.canal = canal;
	}
	
	
	
}
