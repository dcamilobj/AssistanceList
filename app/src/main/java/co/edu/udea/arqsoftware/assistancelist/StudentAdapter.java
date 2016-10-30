package co.edu.udea.arqsoftware.assistancelist;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Camilo on 29/10/2016.
 */
public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.StudentsViewHolder> {

    private ArrayList<Student> students;

    public StudentAdapter(ArrayList<Student> datos) {
        this.students = datos;
    }

    @Override
    public StudentsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.student, parent, false);

        StudentsViewHolder tvh = new StudentsViewHolder(itemView);

        return tvh;
    }

    @Override
    public void onBindViewHolder(StudentsViewHolder holder, int position) {
        Student item = students.get(position);

        holder.bindTitular(item);
    }

    @Override
    public int getItemCount() {
        return students.size();
    }

    public static class StudentsViewHolder
            extends RecyclerView.ViewHolder {

        private TextView txtFullName;

        public StudentsViewHolder(View itemView) {
            super(itemView);

            txtFullName = (TextView)itemView.findViewById(R.id.fullName);
        }

        public void bindTitular(Student s) {
            txtFullName.setText(s.getNombreCompleto());
        }
    }

}