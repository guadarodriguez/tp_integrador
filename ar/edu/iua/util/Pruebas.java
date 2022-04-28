package ar.edu.iua.util;

import java.util.List;

import ar.edu.iua.interfazusuario.BuscarEImprimirPlanes;
import ar.edu.iua.interfazusuario.BuscarEImprimirPlanesImpl;
import ar.edu.iua.modelo.academico.plan.Plan;
import ar.edu.iua.modelo.academico.plan.PlanImpl;
import ar.edu.iua.negocio.academico.plan.CrearPlan;
import ar.edu.iua.negocio.academico.plan.CrearPlanImpl;
import ar.edu.iua.negocio.academico.plan.ModificarPlan;
import ar.edu.iua.negocio.academico.plan.ModificarPlanImpl;

public class Pruebas {

    public void probar() {

        List<Plan> planes = GenerarEjemplosDePlanes.generar(25, true);        

        System.out.println("\n\nSe crearon " + planes.size() + " planes.");


        CrearPlan crearPlan = new CrearPlanImpl();

        Plan plan = new PlanImpl();
        

        boolean ok = crearPlan.crear(plan);

        if (ok == false) {
            return;
        }

       
        ModificarPlan modificarPlan = new ModificarPlanImpl();
        
        planes.get(0).setAnio(2050);
        planes.get(1).setAnio(2003);

        boolean okk = modificarPlan.modificar(planes.get(0));
        System.out.println("Se modifico el plan " + planes.get(0) + " ? = " + (okk ? "SI" : "NO") );

        okk = modificarPlan.modificar(planes.get(1));
        System.out.println("Se modifico el plan " + planes.get(1) + " ? = " + (okk ? "SI" : "NO") );


        BuscarEImprimirPlanes buscarEImprimirPlanes = new BuscarEImprimirPlanesImpl();

        // debe buscar todos los planes que contengan en sus datos (incluido años y materias)
        // devolver todos los planes q contengan un valor 18, o mate o hist o 5
        buscarEImprimirPlanes.buscar(" 18 mate hist 5") ; 
      

        
       // por favor complete con mas codigo de pruebas, trate de probar todas las clases de negocio, borrar, modificar, buscar    

    }

}
