package com.example.cementerioalbacete.Usuarios;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.cementerioalbacete.MainActivity;
import com.example.cementerioalbacete.R;

public class IniciarSesionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iniciar_sesion);
    }

    public void IniciarMainActivity(View view) {
        //Redireccionamiento a la página principal
        Intent iniciarMainActivity = new Intent(this, MainActivity.class);
        startActivity(iniciarMainActivity);
    }
}