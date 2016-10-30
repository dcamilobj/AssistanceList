package co.edu.udea.arqsoftware.assistancelist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Courses extends AppCompatActivity {

    private TextView group12View, group7View;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses);

        group12View = (TextView) findViewById(R.id.group12);
        group7View = (TextView) findViewById(R.id.group7);

        group12View.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Students.class);
                startActivity(intent);
            }
        });

    }
}
