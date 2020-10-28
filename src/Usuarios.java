public class Usuarios {
    private String nombreUsuario;
    private String apellidoUsuario1;
    private String apellidoUsuario2;
    private String rol;
    private String estado;
    private int cedulaUsuario;


    public String getNombreUsuario() {
        return this.nombreUsuario;
    }

    public void setNombreUsuario() {
        this.nombreUsuario = nombreUsuario;
    }

    public String getApellidoUsuario1() {
        return this.apellidoUsuario1;
    }

    public void setApellidoUsuario1(String apellidoUsuario1) {
        this.apellidoUsuario1 = apellidoUsuario1;
    }

    public String getApellidoUsuario2() {
        return apellidoUsuario2;
    }

    public void setApellidoUsuario2(String apellidoUsuario2) {
        this.apellidoUsuario2 = apellidoUsuario2;
    }

    public int getCedulaUsuario() {
        return cedulaUsuario;
    }

    public void setCedulaUsuario(int cedulaUsuario) {
        this.cedulaUsuario = cedulaUsuario;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        estado = estado;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        rol = rol;
    }

    @Override
    public String toString() {
        return "Usuarios :  [Usuario :" + this.nombreUsuario + ", primer apellido " + this.apellidoUsuario1 +
                " , segundo apellido " + this.apellidoUsuario2 + " , cedula " + this.cedulaUsuario +
                " , rol " + this.rol + " , estado " + this.estado + "]";
    }

    public Usuarios(String nombreUsuario, String apellidoUsuario1,
                    String apellidoUsuario2, int cedulaUsuario, String Rol, String estado) {
        this.nombreUsuario = nombreUsuario;
        this.apellidoUsuario1 = apellidoUsuario1;
        this.apellidoUsuario2 = apellidoUsuario2;
        this.cedulaUsuario = cedulaUsuario;
        this.rol = rol;
        this.estado = estado;
    }

    public Usuarios() {

    }
}
