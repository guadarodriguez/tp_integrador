package ar.edu.iua.negocio.academico.plan;

import ar.edu.iua.modelo.academico.plan.AnioPlan;
import ar.edu.iua.modelo.academico.plan.Materia;
import ar.edu.iua.modelo.academico.plan.Plan;

public class ModificarPlanImpl implements ModificarPlan {

    public boolean modificar(Plan plan) {
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

        // ... por favor completar el codigo faltante

        return true;

    }
}
