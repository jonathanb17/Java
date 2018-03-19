import java.io.Serializable;

public class Polizas implements Serializable {
	
	
	private int cod;
	private int numDni;
	private int tipoPoliza ; // del 0 al 19
	private float montoCliente;
	private String descrpPoliza;
	
	public Polizas(){
		
	}
	
	public Polizas(int cod,int numDni,int tipoPoliza,float montoCliente,String descrPoliza){
		this.cod=cod;
		this.numDni=numDni;
		this.tipoPoliza=tipoPoliza;
		this.montoCliente=montoCliente;
		this.descrpPoliza=descrPoliza;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public int getNumDni() {
		return numDni;
	}

	public void setNumDni(int numDni) {
		this.numDni = numDni;
	}

	public int getTipoPoliza() {
		return tipoPoliza;
	}

	public void setTipoPoliza(int tipoPoliza) {
		this.tipoPoliza = tipoPoliza;
	}

	public float getMontoCliente() {
		return montoCliente;
	}

	public void setMontoCliente(float montoCliente) {
		this.montoCliente = montoCliente;
	}

	public String getDescrpPoliza() {
		return descrpPoliza;
	}

	public void setDescrpPoliza(String descrpPoliza) {
		this.descrpPoliza = descrpPoliza;
	}

	@Override
	public String toString() {
		return "Polizas [cod=" + cod + ", numDni=" + numDni + ", tipoPoliza=" + tipoPoliza + ", montoCliente="
				+ montoCliente + ", descrpPoliza=" + descrpPoliza + "]";
	}

	
	
	
	
	
	
}
