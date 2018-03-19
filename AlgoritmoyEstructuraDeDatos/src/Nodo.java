
public class Nodo {

  private Polizas info ;
  private Nodo siguiente;
  
  
  public Nodo(Polizas inf) {
	this.info=inf;
}


public Polizas getInfo() {
	return info;
}


public void setInfo(Polizas info) {
	this.info = info;
}


public Nodo getSiguiente() {
	return siguiente;
}


public void setSiguiente(Nodo siguiente) {
	this.siguiente = siguiente;
}


@Override
public String toString() {
	return "Nodo [info=" + info + ", siguiente=" + siguiente + "]";
}
	
  
	
}
