
public class Vector {

	
	Polizas vec[];// creamos un vector de tipo poliza
	
	public Vector(int tam){
		vec= new Polizas[tam]; // poliza es la clase,la inicializamos con loq ue le pasemos por parametro
	}
	
	
	public void agregarVector(Polizas f){
		
		for(int i=0;i<vec.length;i++){
		  if(vec[i]==null){
			  vec[i]=f;
			  	break;
		  }
		}
		
	}// fin del metodo
	
	
	// metodo que ordena los valores de acuerdo una variable 
	// en este caso por su codigo
	
	
	 public void ordenar() {
	     for(int i=0;i<(vec.length-1);i++){
	            for(int j=i+1;j<vec.length;j++){
	                if(vec[i].getCod()>vec[j].getCod()){
	                    //Intercambiamos valores
	                    Polizas auxiliar=vec[i];
	                    vec[i]=vec[j];
	                    vec[j]=auxiliar;
	 
	                }
	            }
	        }
	   
	    }
		
	
	
	  public String mostrarDatos () {
	        String datos = "";
	        for (int i = 0; i < vec.length; i++) {
	            datos += vec[i].toString() + "\n";
	        }
	        return datos;
	    }
	
	
	  
	  public Listas creoLista(){
		  
		  Listas li = new Listas();
		  
		  for (int i = 0; i < vec.length; i++) {
			if(vec[i].getCod()!=0 && vec[i].getCod()!=1){
					li.agregarFrente(vec[i]);
			}
		}
		  
		  return li;
	  }
	  
	  
}
