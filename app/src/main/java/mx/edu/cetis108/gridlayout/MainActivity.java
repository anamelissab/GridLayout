package mx.edu.cetis108.gridlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void imagen(View view){
        Toast notificacion = Toast.makeText(MainActivity.this, "Ha hecho click en la imagen", Toast.LENGTH_SHORT);
        notificacion.show();
    }

    public void boton(View view){
        Toast notificacion = Toast.makeText(MainActivity.this, "Ha hecho click en el botón", Toast.LENGTH_SHORT);
        notificacion.show();
    }

}
