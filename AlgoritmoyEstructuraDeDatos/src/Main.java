import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner entrada = new Scanner(System.in);
		int opcion;
		Vector vec = null;
		Polizas poli;
		int tamaño = 0;
		Listas l= new Listas();
		int tipoPoliza = 0;
		
		do {
			
			System.out.println("ingrse una opcion");
			System.out.println("1-ingrese le tamaño del vector");
			System.out.println("2-ingrese valores");
			System.out.println("3-mostrar vector ordenado");
			System.out.println("4-crear la lista");
			System.out.println("5-mostramos la lista");
			System.out.println("6-mostrar polizas en cada una de los tipos posibles");
			System.out.println("7-creamos el archivo");
			System.out.println("8-Mostramos el archivo");
			System.out.println("ingrse 9 para salir");
			opcion=entrada.nextInt();
			
			switch (opcion) {
			case 1:
				 System.out.println(" ingrse el rtamaño dle vector:");
				  tamaño = entrada.nextInt();
				 vec= new Vector(tamaño);
				break;
			case 2:
		       for(int i=0;i<tamaño;i++){		
						System.out.println("ingrse un codigo:");
						int cod= entrada.nextInt();
						System.out.println("ingrese un dni");
						int numDni=entrada.nextInt();
						
						do{
							System.out.println("ingrse un numero de poliza-(0 al 19)");
							 tipoPoliza= entrada.nextInt();
						 }while(tipoPoliza<0||tipoPoliza>19);
						
					   System.out.println(" ingrese un monto");
						float montoCliente = entrada.nextFloat();
						System.out.println("ingrse una descripcionde poliza(String)");
						String descrPoliza= entrada.next();
				
				poli= new Polizas(cod, numDni, tipoPoliza, montoCliente, descrPoliza);
				vec.agregarVector(poli);
			}	
				break;
				
			case 3:
				vec.ordenar();
				System.out.println(vec.mostrarDatos());
				break;
				
			case 4:
				System.out.println("creo la lista");
				l=vec.creoLista();
				break;
				
			case 5:
				System.out.println("Mostramos la lista");
				System.out.println(l.listar());
				break;
			
			case 6:
			         System.out.println("Mostramos el vector contdor con tipo de poliza");
					System.out.println(l.mostrarPolizas());
			         break;
			case 7:
				 System.out.println("creamos el archivo");
				 System.out.println("ingrese un valor para ver si supera el montoya establecido");
				 float monto=entrada.nextFloat();
				 l.generarArchivo(monto);
				 break;
			case 8:
				 System.out.println("mostramo el archivo");
				 l.mostrarArchivo();
				 break;
				
			default:
				System.out.println("exitos!!!");
				
			}
		
			
		} while (opcion!=9);

	}

}
