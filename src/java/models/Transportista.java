package models;


public class Transportista {
    private int Id;
    private String Placa;
    private String Nombre;
    private String Apellido;
    private String Telefono;


    public Transportista() {
    }

    public Transportista(String placa, String nombre, String apellido, String telefono) {
        this.Placa = placa;
            this.Nombre = nombre;
            this.Apellido = apellido;
            this.Telefono = telefono;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
    
  }
