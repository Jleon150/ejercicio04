public class Reservaciones {
    private String petName;
    private int horaEntrada;
    private int horasalida;

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public int getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(int horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public int getHorasalida() {
        return horasalida;
    }

    public void setHorasalida(int horasalida) {
        this.horasalida = horasalida;
    }
    @Override
    public String toString(){
        return "Reservaciones: [ Nombre Mascota " + this.petName + " , Hora Entrada " + this.horaEntrada + " , Hora Salida "
                + horasalida + "]";
    }
    public Reservaciones(String petName, int horaEntrada, int horasalida){
        this.petName = petName;
        this.horaEntrada = horaEntrada;
        this.horasalida =horasalida;
    }
    public Reservaciones (){

    }
}
