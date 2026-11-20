/**
 * Un envío agrupa los paquetes que un cliente manda a un mismo destino.
 * Un envío admite como máximo tres paquetes.
 *
 * Ninguno de los métodos de esta clase escribe en pantalla.
 *
 * @author
 */
public class Envio {
    // TODO constante de clase MAX_PAQUETES (ver enunciado)
public static final int MAX_PAQUETES = 3;

    // TODO atributos: código de seguimiento, código postal y tres paquetes
public String codSeg;
public String cp;

//DECLARAMOS CLASES
public Paquete paquete1;
public Paquete paquete2;
public Paquete paquete3;

    /**
     * Crea un envío sin paquetes.
     *
     * @param codigo       código de seguimiento, p.ej. "PX00000001R"
     * @param codigoPostal código postal del destino, p.ej. "36202"

    public String toString() {
    return alto + " x " + ancho + " x " + largo + " cm";
    }

     */
    public Envio(String codigo, String codigoPostal) {
        codSeg = codigo;
        cp = codigoPostal;
    }

    public String getCodigo() {
        return codSeg;
    }

    public String getCodigoPostal() {
        return cp;
    }

    /**
     * @return cuántos paquetes tiene el envío (0 a 3)
     * Para mejorar el algoritmo: Los paquetes se añaden siempre en orden, así que nunca hay huecos entre ellos.

        Para repasar: constructores (this), estructuras condicionales IF y SWITCH CASE (==, !=, etc.). declarar variables (tipos de variables y sobre todo Clases. Ej: private Paquete p1)
     */
    public int getNumeroPaquetes() {
        // TODO (se calcula comprobando qué atributos d paquete son null)
        if (paquete1 == null){
            return 0;
        } else if (paquete2 == null) {
            return 1;
        } else if (paquete3 == null){
            return 2;
        } else {
            return 3;
        }
    }

    /**
     * @return true si ya no se pueden añadir más paquetes
     */
    public boolean estaCompleto() {
        // al principio pense en poner if(paquete3 != null){return true}false
        //pero luego decidí usar el método
        if (getNumeroPaquetes() == MAX_PAQUETES){
            return true;
        }
        return false;

    }

    /**
     * Añade un paquete al envío si no está completo
     * @return true si se ha añadido, false si el envío estaba completo
     */
    public boolean addPaquete(Paquete paquete) {
        // if(estaCompleto() == true) o if(estaCompleto())
        // algo += 1 ====> algo = algo + 1;
       /* if (estaCompleto()) {
        }*/

        switch (getNumeroPaquetes()) {
            case 0:
                paquete1 = paquete;
               return true;


            case 1:
                paquete2 = paquete;
                return true;

            case 2:
                paquete3= paquete;
                return true;

        }
        return false;
    }

    /**
     * Crea un paquete con las medidas y peso indicados y lo añade al envío.
     *
     * @return true si se ha añadido, false si el envío estaba completo
     */
    public boolean addPaquete(double alto, double ancho, double largo, double peso) {
        // TODO
        return false;
    }

    /**
     * @return la suma de los pesos reales de los paquetes (kg)
     */
    public double calcularPesoReal() {
        // TODO
        return 0;
    }

    /**
     * Suma los pesos facturables de los paquetes y redondea hacia arriba
     * al kilo entero.
     *
     * @return el peso facturable del envío (kg enteros)
     */
    public double calcularPesoFacturable() {
        // TODO
        return 0;
    }

    /**
     * @return el paquete de mayor peso real; si hay empate, el que se añadió
     * antes; null si el envío no tiene paquetes
     */
    public Paquete getPaqueteMasPesado() {
        // TODO
        return null;
    }

    /**
     * @return representación textual del envío (ver enunciado)
     */
    public String toString() {
        // TODO
        return "";
    }
}
