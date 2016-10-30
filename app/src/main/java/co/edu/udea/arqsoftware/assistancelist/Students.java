package co.edu.udea.arqsoftware.assistancelist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Students extends AppCompatActivity {

    ArrayList<Student> students;
    private RecyclerView recView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_students);
        //inicialización de la lista de datos de ejemplo
        students = new ArrayList<Student>();
        //for(int i=0; i<50; i++)
        students.add(new Student("Mario Agudelo Henao"));
        students.add(new Student("Jose Alzate Barbosa"));
        students.add(new Student("Ana Asprilla Moreno"));
        students.add(new Student("Pedro Becerra Rojas"));
        students.add(new Student("Camilo Bedoya Jiménez"));
        students.add(new Student("Jose Bedoya Zapata"));
        students.add(new Student("Alejandra Bedoya Mejía"));
        students.add(new Student("Daniel Cantero Velasquez"));
        students.add(new Student("Sara Celis Agudelo"));
        students.add(new Student("Emmanuel Ceballos Gómez"));
        students.add(new Student("Anibal García Osorno"));
        students.add(new Student("Felipe García Romero"));
        students.add(new Student("Carolina Henao Rojas"));
        students.add(new Student("Victor Henao Marín"));
        students.add(new Student("Maria Henao Henao"));
        students.add(new Student("Isabel Jiménez Castaño"));
        students.add(new Student("Daniela Londoño Quincia"));
        students.add(new Student("Juan López López"));
        students.add(new Student("Pablo López Osorio"));
        students.add(new Student("Daniela Monsalve Henao"));
        students.add(new Student("Estefania Monsalve Zapata"));
        students.add(new Student("Javier Monsalve Vergara"));
        students.add(new Student("Jesus Mesa Agudelo"));


        //Inicialización RecyclerView
        recView = (RecyclerView) findViewById(R.id.RecView);
        recView.setHasFixedSize(true);

        final StudentAdapter adaptador = new StudentAdapter(students);

        recView.setAdapter(adaptador);

        recView.setAdapter(adaptador);

        recView.setLayoutManager(
                new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false));
    }
}
