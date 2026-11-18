
/**
 * Clase que modela un interfaz de texto
 * para interactuar con el usuario
 * 
 */
 
public class InterfazTexto
{
    private final int COMPLETO = 1;
    private final int NOMBRE = 2;
    private final int EDAD = 3;
    private final int SUELDO = 4;
    private final int ESTADO = 5;
    private Persona persona;
    private Scanner teclado;

    /**
     * Constructor de la clase InterfazTexto
     */
    public InterfazTexto()
    {
          
    }

     /**
     *  Único método público de la clase. Controla toda la lógica
     *  de la aplicación. Pide los datos de una eprsona, crea el objeto Persona
     *  y luego a través de un menú da la posibilidad al usuario de mostrar esos
     *  datos     
     */
    public void ejecutar()
    {
//          bienvenida();
//          String nombre = leerNombre();
//          persona.setNombre(nombre);
//          int edad = 
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
//          despedida();
    }
    
    /**
     *   Pide por teclado un nombre y lo devuelve
     *  
     */
    private String leerNombre()
    {
         return "";
    }
    
     /**
     *   
     * Pide por teclado la edad y la devuelve
     */
    private int leerEdad()
    {
         return 0;
    }
    
      /**
     *   
     *  Pide por teclado el sueldo y lo devuelve
     */
    private double leerSueldo()
    {
        return 0;
    }
    
      /**
     *   
     *  Pide por teclado el estado civil y lo devuelve
     */
    private char leerEstado()
    {
         return ' ';
    }
    
    /**
     * Muestra un mensaje de bienvenida  
     */
    private void bienvenida()
    {
          System.out.println("Bienvenido/a a nuestra aplicación");
    }
    
     /**
     * 
     * Muestra un mensaje de despedida       
     */
    private void despedida()
    {
          System.out.println("Adiós");
    }
    
      /**
     * Muestra en pantalla los datos completos de la persona    
     */
    private void mostrarDatosCompletos()
    {
          System.out.println(persona.toString());
    }
    
      /**
     * 
     * Muestra solo la edad   
     */
    private void mostrarEdad()
    {
          
    }
    
      /**
     * 
     * Muestra solo el nombre     
     */
    private void mostrarNombre()
    {
          
    }
    
     /**
     * Muestra solo el sueldo     
     */
    private void mostrarSueldo()
    {
           
    }
    
          /**
     * 
     * Muestra solo el estado civil     
     */
    private void mostrarEstadoCivil()
    {
           
    }
    
        /**
     * 
     * Muestra el menú inicial al usuario
     * Le pide que teclee una opción, la lee desde el teclado y la devuelve
     */
    private int mostrarMenu()
    {
        borrarPantalla();
        System.out.println("1. Mostrar datos completos");
        System.out.println("2. Mostrar nombre");
        System.out.println("3. Mostrar edad");
        System.out.println("4. Mostrar sueldo");
        System.out.println("5. Mostrar estado civil");
        System.out.print("Introduce opción: ");
        int opcion = teclado.nextInt();
        // teclado.nextLine();
        return opcion;
    }
    
      /**
     *  Limpiar la pantalla
     *  
     */
    public void borrarPantalla( )
    {
         System.out.println('\u000C');
    }
    
    
}
