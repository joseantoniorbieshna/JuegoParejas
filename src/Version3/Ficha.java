package Version3;

public class Ficha {
	private Integer valor;
	private boolean isOculta;
	
	
	
	public Ficha(Integer valor) {
		super();
		this.valor = valor;
		this.isOculta = true;
	}

	public void intercambiarValores(Ficha ficha) {
		Integer guardado = ficha.getValor();
		ficha.setValor(this.getValor());
		this.setValor(guardado);
	}
	
	public void revelar() {
		isOculta=false;
	}
	public void ocultar() {
		isOculta=true;
	}
	
	public Integer getValor() {
		return valor;
	}
	
	public void setValor(Integer valor) {
		this.valor = valor;
	}

	public boolean isOculta() {
		return isOculta;
	}
	
	
}
