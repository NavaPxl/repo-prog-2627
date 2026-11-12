package es.iesteis.prog.ud4;

public class Alarma {
    private String horaAlarma;
    private int hora;
    private int minutos;

    public Alarma(String horaAlarma){
        horaAlarma = "07:00";

    }
    public void setHoraAlarma(int hora, int minutos){
    //TODO La clase Alarma guarda la hora de alarma, permite modificar esta hora con el
        //mét.odo setHoraAlarma() y obtiene la hora de alarma como un String de la forma
        //“XX:XX”. El constructor de esta clase establece la alarma, por defecto,  a las
        //7:00  horas.

    }

    public String getHoraAlarma(String horaAlarma){
        return horaAlarma;
    }
}
