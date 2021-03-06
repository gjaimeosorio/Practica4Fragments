package practica3.gabrielosorio.com.practica3actividades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String user, correo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bundle extras = getIntent().getExtras();
        user = extras.getString("usuario");
        correo = extras.getString("email");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        Intent intent;
        Toast toast;
        switch (id){
            case R.id.mMiperfil:
                toast = Toast.makeText(getApplicationContext(), "A perfil", Toast.LENGTH_SHORT);
                toast.show();
                intent = new Intent(MainActivity.this, PerfilActivity.class);
                intent.putExtra("usuario",user);
                intent.putExtra("email",correo);
                startActivity(intent);
                break;
            case R.id.mClasifica:
                toast = Toast.makeText(getApplicationContext(), "A clasificacion", Toast.LENGTH_SHORT);
                toast.show();
                intent = new Intent(MainActivity.this, ClasificacionActivity.class);
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}


