package exercisi1;

public class Smartphone implements Telefon{

	@Override
	public void trucar() {
		System.out.println("Està trucant.");
	}
	
	public void ferFotos() {
		System.out.println("Està fent fotos.");
	}

}
