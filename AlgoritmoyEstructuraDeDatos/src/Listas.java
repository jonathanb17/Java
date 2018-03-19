import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Listas {
	
	
	private Nodo raiz;
	
	
	public void agregarFrente(Polizas p){ // ensercion al frente
		Nodo nuevo = new Nodo(p);
		nuevo.setSiguiente(raiz);
		raiz=nuevo;
	}
	
	
	public String listar(){
		
		String  datos= "";
		Nodo aux=raiz; // valor auxiliar que va a ser el encargado de concatenar
		
		while(aux!=null){
			datos+=aux.getInfo().toString()+"\n";// almacenamos toda la info en una variable
			aux=aux.getSiguiente();// va recorriendo al siguiente y al siguiente...
		}
		
		return datos;
	}
	
	
	
	public String mostrarPolizas(){
		
		int arreglo[]= new int [19];
		
		Nodo p =raiz; 
		
		while(p!=null){
			
			arreglo[p.getInfo().getTipoPoliza()]++; // creamos un vector contador
			
			p=p.getSiguiente();// avanza hacia le siguiente
		}// fin ciclo while
			
			
			///vMOS A MOSTRAR 
			String resultado="";
	for(int i=0;i<19;i++){		
			
			resultado+="cantidad de polizas por tipo es :"+i+" : "+arreglo[i]+"\n"; // concatenamos 
		}
		return resultado;

		
	}// fin metodo
	
	
	
	
	
	public void generarArchivo(float x){
		
		FileOutputStream fos; //flujos de entrda
		ObjectOutputStream oos;
		
		try {
			fos= new FileOutputStream("datos.txt");
			oos=new ObjectOutputStream(fos);
			Nodo aux =raiz;
		
				if(raiz!=null){
					while(aux!=null){
						if(aux.getInfo().getMontoCliente()>x){
							oos.writeObject(aux.getInfo());// escribime la informacion 
						}//fin if
						aux=aux.getSiguiente();// recorremos hacia adelante  
					}// fin while
				}
				
				oos.close();
				fos.close(); // cerramos los flujos
		
		} catch (Exception e) {
				System.out.println("error!!"+e.getMessage());
		}
		
		
	}// fin metodo
	

	public void mostrarArchivo(){
		
		FileInputStream fis;
	    ObjectInputStream ois;
		try {
			
			fis= new FileInputStream("datos.txt");
			ois= new ObjectInputStream(fis);
			Nodo aux= raiz;
			
			while(fis.available()>0){
				Polizas pol = (Polizas)ois.readObject(); // lee
				System.out.println("los valores son:"+pol);
			}
		} catch (Exception e) {
			System.out.println("error!"+e.getMessage());
	 }
			
}// fin metodo	
	
	
	
}
