package com.cyclistalert.Logic;

import com.cyclistalert.modeloDB.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cyclistalert.BDAccess.*;

@Service
//@RequestMapping("/user")
public class UsuarioServices {
    @Autowired
    UsuarioRepository usuario;

    @Autowired
    ReporteRepository reporte;

    //Crecion de usuario:
    //@GetMapping("/creacionUsuario")
    public Integer creacionUsuario(@RequestParam Integer id, @RequestParam String nombre, @RequestParam String correo, @RequestParam Integer telefono){
        Usuario usr = new Usuario();
        usr.setId(id);
        usr.setEmail(correo);
        usr.setNombre(nombre);
        usr.setTelefono(telefono);

        if(usuario.save(usr).equals(null)){
            return -1;
        }
        else{
            usuario.save(usr);
            return usr.getId();
        }

    }

    //Encontrar publicaciones de un usuario
    //@GetMapping("/feed")
    List<Reporte> buscarFeedUsuario(@RequestParam Integer idUsuario){
        return usuario.feedUsuario(idUsuario);
    }
    
}
