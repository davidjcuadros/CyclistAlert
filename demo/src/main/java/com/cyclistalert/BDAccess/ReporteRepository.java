package com.cyclistalert.BDAccess;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.cyclistalert.modeloDB.Reporte;

@Repository
public interface ReporteRepository
extends JpaRepository <Reporte, Integer> 
{
   
}
