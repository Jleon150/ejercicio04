public class Mascota {
    private String nombreMascota;
    private String foto;
    private int ranking;
    private String nombreDueno;
    private String apellidoDueno1;
    private String apellidoDueno2;
    private String cedula;
    private String telefono;
    private String canton;
    private String ciudad;
    private String provincia;
    private String observacionesMasc;

    
    public String getNombreMascota(){
        return this.nombreMascota;

    }
    public void setNombreMascota(){
        this.nombreMascota = nombreMascota;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public int getRanking() {
        return ranking;
    }

    public String getNombreDueno() {
        return nombreDueno;
    }

    public void setNombreDueno(String nombreDueno) {
        this.nombreDueno = nombreDueno;
    }

    public String getApellidoDueno1() {
        return apellidoDueno1;
    }

    public void setApellidoDueno1(String apellidoDueno1) {
        this.apellidoDueno1 = apellidoDueno1;
    }

    public String getApellidoDueno2() {
        return apellidoDueno2;
    }

    public void setApellidoDueno2(String apellidoDueno2) {
        this. apellidoDueno2 = apellidoDueno2;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCanton() {
        return canton;
    }

    public void setCanton(String canton) {
        this.canton = canton;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getProvincia() {
        return provincia;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;

    }

    public String getObservacionesMasc() {
        return observacionesMasc;
    }

    public void setObservacionesMasc(String observacionesMasc) {
        this.observacionesMasc = observacionesMasc;
    }

    public Mascota(String nombreMascota, String foto, int ranking, String nombreDueno,
                   String apellidoDueno1, String apellidoDueno2, String cedula, String telefono, String
                           canton, String ciudad, String provincia, String observacionesMasc) {
        this.nombreMascota = nombreMascota;
        this.foto = foto;
        this.ranking = ranking;
        this.nombreDueno = nombreDueno;
        this.apellidoDueno1 = apellidoDueno1;
        this.apellidoDueno2 = apellidoDueno2;
        this.cedula = cedula;
        this.telefono = telefono;
        this.canton = canton;
        this.ciudad = ciudad;
        this.provincia = provincia;
        this.observacionesMasc = observacionesMasc;

    }
    @Override
    public String toString(){
        return " Mascotas : [ Nombre de la mascota " + this.nombreMascota + " , foto " + this.foto +
                " , ranking " + this.ranking +"\n" +  " , Dueño " + this.nombreDueno + " " +this.apellidoDueno1 +
                "  " + this.apellidoDueno2 + " , cedula " + this.cedula + " telefono " + this.telefono
                + " , Direccion: " + this.canton + " , " + this.ciudad +" , "+  this.provincia + " ] ";
    }
    public Mascota (){

    }

}
