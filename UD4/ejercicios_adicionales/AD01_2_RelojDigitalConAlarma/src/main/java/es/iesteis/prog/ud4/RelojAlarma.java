package es.iesteis.prog.ud4;

public class RelojAlarma {
    private VisorReloj reloj;
    private Alarma alarma;

    /// -----------------------
    private String horaActual;
    private String horaAlarma;

    public RelojAlarma(){
        this.reloj=reloj;
        this.alarma=alarma;


    }
    public RelojAlarma(int hs, int mins, String reloj){
    hs =00;
    // ______________maxHora=23;
    // ______________minHora=00;
    mins=00;
    // ______________maxMins=23;
    // ______________minMins=00;
    //reloj=hs+mins;
    }

    public void emitirTic(int minYa){
        int mins = 0;
        minYa=mins+1;
    }

    public String getHora(){
//        if (mins>59){
//            return hs++;
//        }else{                         E S T O
//            return mins;              N O   E S
//        }                              A Q U I
//
//        if (hs>23){                      V ¬ V
//            return hs=
//        }
//
        return horaActual;

    }

    public String getAlarma(){
        return horaAlarma;

    }

}
