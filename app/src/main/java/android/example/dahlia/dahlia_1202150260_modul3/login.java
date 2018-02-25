package android.example.dahlia.dahlia_1202150260_modul3;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Asus on 25/02/2018.
 */

public class login extends AppCompatActivity {
    Button button;
    EditText user,pass;
    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //menyambungkan variable yang dibuat sebelumnya dengan edit text dan button pada layout
        user = (EditText) findViewById(R.id.editText);
        pass = (EditText) findViewById(R.id.editText2);
        button = (Button) findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v) {

                //username = EAD, pass = MOBILE
                if (user.getText().toString().equals("EAD") && pass.getText().toString().equals("MOBILE")) {
                    displayToast("Sign in Berhasil");
                    Intent intent  = new Intent(v.getContext(), MainActivity.class);
                    startActivity(intent);
//                    startActivity(intent);

                //jika gagal
                } else {
                    displayToast("username atau Password Salah");
                }
            }


        });
    }
}
