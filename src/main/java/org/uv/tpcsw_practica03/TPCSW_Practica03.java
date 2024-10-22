package org.uv.tpcsw_practica03;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class TPCSW_Practica03 {

    public static void main(String[] args) {
     
        
//        Departamento depto = new Departamento();
//        depto.setNombre("Finanzas");
//     
        Empleado empleado = new Empleado();
        empleado.setClave(10);
        empleado.setNombre("Daniel");
        empleado.setDireccion("Calle 12");
        empleado.setTelefono("09721");
        
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.getCurrentSession();
        Transaction t = session.beginTransaction();
        
//        session.save(depto);
//        session.save(empleado);

        //t.commit();
        
        Departamento depto2 = session.get(Departamento.class, 2L);
        
        if(depto2!=null) {
            empleado.setDepto(depto2);
            session.save(empleado);
        }
        
        System.out.println("Clave: " + depto2.getClave() + " Nombre: " + depto2.getNombre());
        
        t.commit();
        
    }

}
