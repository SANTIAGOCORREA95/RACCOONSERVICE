/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package raccoonservice.controladores;

import raccoonservice.modelos.ConsultaUsuario;
import raccoonservice.modelos.Usuario;
import raccoonservice.vistas.VistaUsuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class ControladorUsuario implements ActionListener {
    
    VistaUsuario vistausuario = new VistaUsuario();
    Usuario usuario = new Usuario();
    
    public ControladorUsuario(VistaUsuario vistausuario,Usuario usuario) {
        
        this.usuario = usuario;
        this.vistaUsuario = vistaUsuario;
        vistausuario.botonRegistrarUsuario.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
        ConsultaUsuario consultaUsuario = new ConsultaUsuario();
        
        usuario.setCedula(vistausuario.cajaCedulaUsuario.getText());
        usuario.setNombre(vistausuario.cajaNombreUsuario.getText());
        usuario.setApellido(vistausuario.cajaApellidoUsuario.getText());
        usuario.setTelefono(vistausuario.cajaTelefonoUsuario.getText());
        
        if(consultaUsuario.registrarUsuario(usuario)){
            
            JOptionPane.showMessageDialog(null, "Exito agregando los datos");
            
        }else{
            
            JOptionPane.showMessageDialog(null, "Error agregando los datos");
            
        }
       
    }
}
