package ar.edu.iua.negocio.academico.plan;

import java.util.List;

import ar.edu.iua.modelo.academico.plan.AnioPlan;
import ar.edu.iua.modelo.academico.plan.Materia;
import ar.edu.iua.modelo.academico.plan.Plan;

public class ModificarPlanesImpl implements ModificarPlanes {

    public boolean modificar(List<Plan> planes) {
        for (Plan plan : planes) {
            if (plan == null) {
                return false;
            }
            if (!plan.isEstadoActivo() || !plan.isEstadoNoActivo() || !plan.isEstadoBorrador()) {
                return false;
            }
            if (plan.getAnios() == null && !plan.isEstadoBorrador()) {
                return false;
            }
            if (plan.getAnio() < 1990 && plan.getAnio() > 2040) {
                return false;
            }
            for (AnioPlan anio : plan.getAnios()) {
                if (anio.getNombre() == null && !plan.isEstadoBorrador()) {
                    return false;
                }
            }
            for (AnioPlan anio : plan.getAnios()) {
                if (anio.getMaterias() == null && !plan.isEstadoBorrador()) {
                    return false;
                }
            }
            for (AnioPlan anio : plan.getAnios()) {
                if (anio.getNumero() <= 0) {
                    return false;
                }
            }
            for (AnioPlan anio : plan.getAnios()) {
                if (anio.getNumero() == null && !plan.isEstadoBorrador()) {
                    return false;
                }
            }
            for (AnioPlan anio : plan.getAnios()) {
                if (anio.getMaterias() == null && !plan.isEstadoBorrador()) {
                    return false;
                }
            }
            for (AnioPlan anio : plan.getAnios()) {
                for (Materia materia : anio.getMaterias())
                    if (materia.getCodigo() == null && !plan.isEstadoBorrador()) {
                        return false;
                    }
            }
            for (AnioPlan anio : plan.getAnios()) {
                for (Materia materia : anio.getMaterias())
                    if (materia.getCodigo() <= 0) {
                        return false;
                    }
            }
            for (AnioPlan anio : plan.getAnios()) {
                for (Materia materia : anio.getMaterias())
                    if (materia.getNombre() == null && !plan.isEstadoBorrador()) {
                        return false;
                    }
            }
            for (AnioPlan anio : plan.getAnios()) {
                for (Materia materia : anio.getMaterias())
                    if (materia.getCargaHoraria() == null && !plan.isEstadoBorrador()) {
                        return false;
                    }
            }
            for (AnioPlan anio : plan.getAnios()) {
                for (Materia materia : anio.getMaterias())
                    if (materia.getCargaHoraria() <= 0) {
                        return false;
                    }
            }
        }
        return true;
    }
    
}
