package demo;


import java.sql.SQLException;

import java.util.Properties;

import org.hibernate.HibernateException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class PersistenciaEscuela {
    static SessionFactory SESSION_FACTORY;
    Aula getAula(int idAula) throws SQLException{
	void insertAula(Aula aula) throws SQLException{
		Transaction transaction = null;
		Session session = null;
        try {
           	session = this.crearSesion();
            
            transaction = session.beginTransaction();
            session.saveOrUpdate(aula); 
            transaction.commit();
        } catch (HibernateException ex) {
            
            if (transaction != null) {
                transaction.rollback();
            }
            
            ex.printStackTrace();
        }
        session.close();
	}
	
	Aula getAula(int idAula) throws SQLException{
		
		Aula aula = null;
		Transaction transaction = null;
		Session session = null;
        try {
           	session = this.crearSesion();
            transaction = session.beginTransaction();
            aula=(Aula) session.get(Aula.class,idAula);
            System.out.println(aula.getId_aula()+" "+aula.getNombre()+" "+aula.getPlanta()+" "+aula.getCapacidad()+" "+aula.isDisponible()+" "+aula.getSeccion());
            

            transaction.commit();
        } catch (HibernateException ex) {
            
            if (transaction != null) {
                transaction.rollback();
            }
            
            ex.printStackTrace();
        }
        session.close();
        return aula;
	}
	
	void updateAula(Aula aula) throws SQLException{
		Transaction transaction = null;
		Session session = null;
        try {
           	session = this.crearSesion();
            transaction = session.beginTransaction();
            session.saveOrUpdate(aula); 
            transaction.commit();
        } catch (HibernateException ex) {
            
            if (transaction != null) {
                transaction.rollback();
            }
            
            ex.printStackTrace();
        }
        session.close();
	}
	
	void deleteAula(int idAula) throws SQLException{ 
		
		Transaction transaction = null;
		Aula aula;
		Session session = null;
        try {
           	session = this.crearSesion();
        	aula=this.getAula(idAula);
           
            transaction = session.beginTransaction();
            session.delete(aula); 
            transaction.commit();
        } catch (HibernateException ex) {
            
            if (transaction != null) {
                transaction.rollback();
            }
            
            ex.printStackTrace();
        }
        session.close();
	}
	//-----------------------
	void insertAlumno (Alumno alumno) throws SQLException{
		Transaction transaction = null;
		Session session = null;
        try {
           	session = this.crearSesion();
            
            transaction = session.beginTransaction();
            session.saveOrUpdate(alumno); 
            transaction.commit();
        } catch (HibernateException ex) {
            
            if (transaction != null) {
                transaction.rollback();
            }
            
            ex.printStackTrace();
        }
        session.close();
	}
	
	Alumno getAlumno(int idAlumno) throws SQLException{
		
		Alumno alumno = null;
		Transaction transaction = null;
		Session session = null;
        try {
           	session = this.crearSesion();
            transaction = session.beginTransaction();
            alumno=(Alumno) session.get(Alumno.class,idAlumno);
            System.out.println(alumno.getId_alumno()+" "+alumno.getNombre()+" "+alumno.getApellidos()+" "+alumno.getSexo()+" "+alumno.getCurso()+" "+alumno.isRepetidor()+" "+
            		alumno.getId_tutor());
           

            transaction.commit();
        } catch (HibernateException ex) {
            
            if (transaction != null) {
                transaction.rollback();
            }
            
            ex.printStackTrace();
        }
        session.close();
        return alumno;
	}
	
	void updateAlumno(Alumno alumno) throws SQLException{
		Transaction transaction = null;
		Session session = null;
        try {
           	session = this.crearSesion();
            transaction = session.beginTransaction();
            session.saveOrUpdate(alumno); 
            transaction.commit();
        } catch (HibernateException ex) {
            
            if (transaction != null) {
                transaction.rollback();
            }
            
            ex.printStackTrace();
        }
        session.close();
	}
	
	void deleteAlumno(int idAlumno) throws SQLException{ 
		
		Transaction transaction = null;
		Alumno alumno;
		Session session = null;
        try {
           	session = this.crearSesion();
        	alumno=this.getAlumno(idAlumno);
           
            transaction = session.beginTransaction();
            session.delete(alumno); 
            transaction.commit();
        } catch (HibernateException ex) {
            
            if (transaction != null) {
                transaction.rollback();
            }
            
            ex.printStackTrace();
        }
        session.close();
	}
	//-----------------------
		

	private Session crearSesion() throws SQLException
	{
     
			SFUnica.getInstance();
	        return SFUnica.SESSION_FACTORY.openSession();
		}
   
	}

