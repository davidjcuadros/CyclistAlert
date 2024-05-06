package com.cyclistalert.BDAccess;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cyclistalert.modeloDB.Reporte;
import com.cyclistalert.modeloDB.Usuario;

@Repository
public interface UsuarioRepository 
    extends JpaRepository <Usuario, Integer>
    {

        @Query("SELECT * FROM Reporte WHERE id= :id")
        List<Reporte> feedUsuario(Integer id);

}
