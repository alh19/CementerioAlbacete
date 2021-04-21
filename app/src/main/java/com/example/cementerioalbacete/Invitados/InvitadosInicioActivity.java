package com.example.cementerioalbacete.Invitados;

import android.content.Intent;
import android.view.Menu;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.cementerioalbacete.MainActivity;
import com.example.cementerioalbacete.R;

public class InvitadosInicioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invitados_inicio);
    }

    //Creación del menú
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_principal, menu);
        return super.onCreateOptionsMenu(menu);
    }

    //******NAVEGACIÓN ENTRE PANTALLAS***********//

    public void IniciarMainActivity(View view) {
        //Redireccionamiento a la página principal
        Intent iniciarMainActivity = new Intent(this, MainActivity.class);
        startActivity(iniciarMainActivity);
    }
}