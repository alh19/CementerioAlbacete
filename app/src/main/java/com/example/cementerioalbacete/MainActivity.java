package com.example.cementerioalbacete;

import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.cementerioalbacete.Invitados.InvitadosInicioActivity;
import com.example.cementerioalbacete.Usuarios.IniciarSesionActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Creación del menú
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_principal, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();

        switch (id){
            case R.id.item_horarios:
                //Intent intentHorario = new Intent(this, HorarioActivity.class);
                //startActivity(intentInicio);
                //break;
            case R.id.item_iniciarSesion:
                Intent intentIniciarSesion = new Intent(this, IniciarSesionActivity.class);
                startActivity(intentIniciarSesion);
                break;
            case R.id.item_buscarFallecido:
                //Intent intentBuscar = new Intent(this, BuscarFallecidoActivity.class);
                //startActivity(intentBuscar);
                //break;
            case R.id.item_salir:
                finish();
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    //******NAVEGACIÓN ENTRE PANTALLAS***********//

    public void IniciarInvitadosInicio(View view) {
        //Navegación hacia el Activity de inicio de Invitados
        Intent iniciarInvitadosInicio = new Intent(this, InvitadosInicioActivity.class);
        startActivity(iniciarInvitadosInicio);
    }

    public void IniciarIniciarSesion(View view) {
        //Navegación hacia el Activity de inicio de sesión
        Intent iniciarIniciarSesion = new Intent(this, IniciarSesionActivity.class);
        startActivity(iniciarIniciarSesion);
    }

    public void IniciarRegistro(View view) {
        //Navegación hacia el Activity de Registro
        Intent iniciarRegistro = new Intent(this, RegistroActivity.class);
        startActivity(iniciarRegistro);
    }
}