package ar.edu.iua.negocio.academico.plan;

import ar.edu.iua.modelo.academico.plan.AnioPlan;
import ar.edu.iua.modelo.academico.plan.AnioPlanImpl;
import ar.edu.iua.modelo.academico.plan.Plan;

public class CrearPlanImpl implements CrearPlan {

    public boolean crear(Plan plan) {
        if (plan != null){
            return false;
        }
        if(!plan.isEstadoActivo()|| !plan.isEstadoNoActivo() || plan.isEstadoBorrador()){
            return false;
        }
        if (plan.getAnio()== null && !plan.isEstadoBorrador()){
            return false;
        }
        if(plan.getAnio()<1990 && plan.getAnio()>2040){
            return false;
        }

       

        //... por favor completar el codigo faltante
        

        return true;
    }
    }

