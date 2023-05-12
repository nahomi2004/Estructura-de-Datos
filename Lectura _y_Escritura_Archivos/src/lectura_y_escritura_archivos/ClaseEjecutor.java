
package lectura_y_escritura_archivos;

/**
 *
 * @author D E L L
 */
public class ClaseEjecutor {
    
    public static void main(String[] args) {
        ClaseMetodos claseMetodos = new ClaseMetodos();
        int opcion;
        int num;
        do{
            opcion=claseMetodos.menu();
            switch (opcion) {
                case 1 ->  {
                    claseMetodos.ingresar();
                }

                case 2 ->  {
                    claseMetodos.presentar();
                }
                
                case 3 ->  {
                    System.out.println("\n¿Desea que se elimine lo anteriormente"
                            + "escrito?\n [1]:Sí  [2]:No");
                    num=claseMetodos.entrada.nextInt();
                    
                    switch (num) {
                        case 1 -> {
                            System.out.println("\nAdvertencia\n Los datos "
                                    + "anteriores serán reemplazados e "
                                    + "imposibles de recuperar");
                            claseMetodos.escribirDesdeCero();
                        }
                        case 2 -> {
                            opcion = 0;
                        }
                        default -> {
                            System.out.println("\nNúmero inválido");
                            opcion = 0;
                        }
                    }
                }
                
                case 4 ->  {
                    System.out.println("\n¿Desea que se elimine el archivo?"
                            + "\n [1]:Sí  [2]:No");
                    num=claseMetodos.entrada.nextInt();
                    switch (num) {
                        case 1 -> {
                            System.out.println("\nAdvertencia\n"
                                    + "Los datos del archivo serán"
                                    + "imposibles de recuperar");
                            claseMetodos.eliminarArchivo();
                        }
                        case 2 -> {
                            opcion = 0;
                        }
                        default -> {
                            System.out.println("\nNúmero inválido");
                            opcion = 0;
                        }
                    }
                }

                default -> {
                }
            }       	 
        } while (opcion!=0);   	 
    }    
}

