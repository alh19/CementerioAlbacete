package com.example.cementerioalbacete;

import android.content.Intent;
import android.view.Menu;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class RegistroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
    }

    //Creación del menú
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_principal, menu);
        return super.onCreateOptionsMenu(menu);
    }

    //******NAVEGACIÓN ENTRE PANTALLAS***********//

    public void IniciarMainActivity(View view) {
        //Redirigir hacia la pantalla principal
        Intent iniciarMainActivity = new Intent(this, MainActivity.class);
        startActivity(iniciarMainActivity);
    }
}