package ch03.generic;

public class GenericPrinter<T extends Material> {

	private T material;

	
	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}
	
	@Override
	public String toString() {
		//material의 toString!!!
		return material.toString();
	}
	
	public void doPrinting() {
		material.doPrinting();
	}
}
