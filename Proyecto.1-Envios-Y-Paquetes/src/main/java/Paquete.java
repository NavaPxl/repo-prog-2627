/**
 * Un bulto físico que forma parte de un envío.
 *
 * @author
 */
public class Paquete {

    /** cm3 que equivalen a 1 kg a efectos de facturación */
    private static final double FACTOR_VOLUMETRICO = 5000;
    private Dimension dimension;

    private double peso;
    private double alto;
    private double ancho;
    private double largo;
    private double peso;


    // TODO atributos: una Dimension y el peso real (kg)

    /**
     * Crea un paquete a partir de una dimensión ya creada y su peso real (kg).
     */
    public Paquete(Dimension dimension, double peso) {
        this.dimension = dimension;
        this.peso=peso;
    }

    /**
     * Crea un paquete a partir de sus medidas (cm) y su peso real (kg).
     * Sin duplicar el código del otro constructor.
     */
    public Paquete(double alto, double ancho, double largo, double peso) {
        this.alto = alto;
        this.ancho = ancho;
        this.largo = largo;

        this.peso = peso;
    }

    public Dimension getDimension() {
        // TODO
        return dimension;
    }

    /**
     * @return el peso real en kg
     */
    public double getPeso() {

        return peso;
    }

    /**
     * @return el volumen del paquete en cm3
     */
    public double calcularVolumen() {
        // TODO (lee la decisión de diseño del enunciado)
        return 0;
    }

    /**
     * @return el peso volumétrico en kg (volumen / FACTOR_VOLUMETRICO)
     */
    public double calcularPesoVolumetrico() {
        // TODO
        return dimension.calculo()/ FACTOR_VOLUMETRICO;
    }

    /**
     * El peso facturable es el mayor entre el peso real y el volumétrico.
     *
     * @return el peso facturable en kg
     */
    public double calcularPesoFacturable() {
        if(calcularPesoVolumetrico()>peso){
            return calcularPesoVolumetrico();
        }
        return peso;
    }

    /**
     * @return por ejemplo "40.0 x 30.0 x 50.0 cm | 8.0 kg (facturable 12.0 kg)"
     */


    public String toString() {

        return alto + " x " + ancho + " x " + largo + " cm" + peso + "Kg  (facturable " + calcularPesoFacturable() + "Kg)" ;
    }
}
