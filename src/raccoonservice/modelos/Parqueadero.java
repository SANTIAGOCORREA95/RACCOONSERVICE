/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package raccoonservice.modelos;

/**
 *
 * @author user
 */
public class Parqueadero {
     private int IDParqueadero;
    private String NombreParqueadero;
    private String Telefono;
    private String Direccion;
    private String CantidadPuesto;
    private String CuposDisponibles;
    private String CuposRestantes;

    public Parqueadero() {
    }

    public Parqueadero(int IDParqueadero, String NombreParqueadero, String Telefono, String Direccion, String CantidadPuesto, String CuposDisponibles, String CuposRestantes) {
        this.IDParqueadero = IDParqueadero;
        this.NombreParqueadero = NombreParqueadero;
        this.Telefono = Telefono;
        this.Direccion = Direccion;
        this.CantidadPuesto = CantidadPuesto;
        this.CuposDisponibles = CuposDisponibles;
        this.CuposRestantes = CuposRestantes;
    }

    public int getIDParqueadero() {
        return IDParqueadero;
    }

    public void setIDParqueadero(int IDParqueadero) {
        this.IDParqueadero = IDParqueadero;
    }

    public String getNombreParqueadero() {
        return NombreParqueadero;
    }

    public void setNombreParqueadero(String NombreParqueadero) {
        this.NombreParqueadero = NombreParqueadero;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getCantidadPuesto() {
        return CantidadPuesto;
    }

    public void setCantidadPuesto(String CantidadPuesto) {
        this.CantidadPuesto = CantidadPuesto;
    }

    public String getCuposDisponibles() {
        return CuposDisponibles;
    }

    public void setCuposDisponibles(String CuposDisponibles) {
        this.CuposDisponibles = CuposDisponibles;
    }

    public String getCuposRestantes() {
        return CuposRestantes;
    }

    public void setCuposRestantes(String CuposRestantes) {
        this.CuposRestantes = CuposRestantes;
    }
}
