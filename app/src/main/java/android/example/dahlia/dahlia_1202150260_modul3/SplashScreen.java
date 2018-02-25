package android.example.dahlia.dahlia_1202150260_modul3;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Created by Asus on 25/02/2018.
 */
//membuat splashscreen
public class SplashScreen extends AppCompatActivity

    {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_splash_screen);
            Toast.makeText(this, "DAHLIARAITANA_1202150260_MODUL3", Toast.LENGTH_SHORT).show();
            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {

                @Override
                public void run() {
                    startActivity(new Intent(getApplicationContext(), login.class));
                    finish();
                }
            }, 5000L);//splash screen 5 seconds
        }
}
