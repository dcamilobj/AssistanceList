package co.edu.udea.arqsoftware.assistancelist;

/**
 * Created by Camilo on 29/10/2016.
 */
public class Student
{
    private String nombreCompleto;

    public Student(String nombre){
        nombreCompleto = nombre;
    }

    public String getNombreCompleto(){
        return nombreCompleto;
    }

}
