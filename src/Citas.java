public class Citas {
    private String nombreMasco;
    private int fechaCita;
    private int horaCita;
    private String observacionesCita;



    public String getNombreMasco() {
        return nombreMasco;
    }

    public void setNombreMasco(String nombreMasco) {
        this.nombreMasco = nombreMasco;
    }

    public int getHoraCita() {
        return horaCita;
    }

    public void setHoraCita(int horaCita) {
        this.horaCita = horaCita;
    }

    public String getObservacionesCita() {
        return observacionesCita;
    }

    public void setObservaciones(String observaciones) {
        this.observacionesCita = observacionesCita;
    }

    @Override
    public String toString() {
        return " Cita :  [ Nombre Mascota " + this.nombreMasco + " , Cita : Fecha " + this.fechaCita + " , hora " + this.horaCita
                + " , Observaciones " +  this.observacionesCita + "]";
    }

    public Citas (String nombreMasco, int fechaCita, int horaCita, String observacionesCita ){
        this.nombreMasco = nombreMasco;
        this.fechaCita = fechaCita;
        this.horaCita = horaCita;
        this.observacionesCita = observacionesCita;

    }
    public Citas(){

    }
}
