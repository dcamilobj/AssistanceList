package co.edu.udea.arqsoftware.assistancelist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = ".intent.action.MAIN";
    private Button btnLogin;
    private Button btnLinkToRegister;
    private EditText inputEmail;
    private EditText inputPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputEmail = (EditText) findViewById(R.id.email);
        inputPassword = (EditText) findViewById(R.id.password);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnLinkToRegister = (Button) findViewById(R.id.btnLinkToRegisterScreen);
    }

    public void onLoginClick(View view){
        String logEmail = inputEmail.getText().toString();
        String logPassword = inputPassword.getText().toString();

        if(!logEmail.isEmpty() || !logPassword.isEmpty()){
            if(logEmail.equals("name.lastname") && logPassword.equals("password")){
                Intent intent = new Intent(this, Courses.class);
                startActivity(intent);
            }else {
                Toast.makeText(this, "Please enter correct data", Toast.LENGTH_SHORT).show();
            }
        }else {
            Toast.makeText(this, "Void fields", Toast.LENGTH_SHORT).show();
        }
    }
}
