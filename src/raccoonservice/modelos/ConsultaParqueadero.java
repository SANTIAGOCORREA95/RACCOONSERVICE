/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package raccoonservice.modelos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author user
 */
public class ConsultaParqueadero extends ModeloBD
{
    PreparedStatement consultaSQL;
    ResultSet resultadoSQL;
   
   public boolean registrarParqueadero(Parqueadero parqueadero)
   {
        
        Connection conexion=conectarBD();
        String query="INSERT INTO pilotos(NombreParqueadero,Telefono,Direccion,CantidadPuesto,CuposDisponibles,CuposRestantes)"
                + "VALUES (?,?,?,?,?,?)";
        
        try{
            //Peparate que voy con toa
            consultaSQL=conexion.prepareStatement(query);
            
            //Ajusto la consulta
            consultaSQL.setString(1,parqueadero.getNombreParqueadero());
            consultaSQL.setString(2,parqueadero.getTelefono());
            consultaSQL.setString(3,parqueadero.getDireccion());
            consultaSQL.setString(4,parqueadero.getCantidadPuesto());
            consultaSQL.setString(5,parqueadero.getCuposDisponibles());
            consultaSQL.setString(6,parqueadero.getCuposRestantes());
            
            //Ejecuto la consulta
            int resultado=consultaSQL.executeUpdate();
            
            //validando el resultado
            if(resultado>0){
              return true;  
            }else{
               return false; 
            }
            
        }
        catch(Exception error)
        {
            System.out.println("upsss... "+error);
            return false;
        }
   }
    public Parqueadero buscarParqueadero (int IDParqueadero)
    {
       
        Connection conexion=conectarBD();
        String query="SELECT * from parqueadero where IDParqueadero=?";
        
        try{
            
            //Peparate que voy con toa
            consultaSQL=conexion.prepareStatement(query);
            
            //Ajusto la consulta
            consultaSQL.setInt(1,IDParqueadero);
            
            //Ejecuto la consulta
            resultadoSQL=consultaSQL.executeQuery();
            
            //Orgaizo el resultado
            Parqueadero parqueadero= new Parqueadero();
            if(resultadoSQL.next()){
                
                parqueadero.setIDParqueadero(resultadoSQL.getInt("IDParqueadero"));
                parqueadero.setNombreParqueadero(resultadoSQL.getString("NombreParqueadero"));
                parqueadero.setTelefono(resultadoSQL.getString("Telefono"));
                parqueadero.setDireccion(resultadoSQL.getString("Direccion"));
                parqueadero.setCantidadPuesto(resultadoSQL.getString("CantidadPuesto"));
                parqueadero.setCuposDisponibles(resultadoSQL.getString("CuposDisponibles"));
                parqueadero.setCuposRestantes(resultadoSQL.getString("CuposRestantes"));
                
                return parqueadero;
                
                
            }else{
                return null;
            }   
        }
        catch(Exception error)
        {
            System.out.println("upsss... "+error);
            return null;
        }
    }
    
}
