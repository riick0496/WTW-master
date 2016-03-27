package epiphany_soft.wtw;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class ActivityRegitrarPrograma extends AppCompatActivity{
        private EditText name,gen,sinopsis;
        private RadioButton pel,ser;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_reg_pel_ser);
            pel=(RadioButton)findViewById(R.id.but_pel);
            ser=(RadioButton)findViewById(R.id.but_ser);
            name=(EditText)findViewById(R.id.name_programa);
            gen=(EditText)findViewById(R.id.gen_programa);
            sinopsis=(EditText)findViewById(R.id.sin_programa);
        }

        public void onClickBuscar(View v)
        {


            String nombre=name.getText().toString();
            String genero=gen.getText().toString();
            String sinopsis=gen.getText().toString();
            if (pel.isChecked()==true)
            {

            }
            if (ser.isChecked()==true)
            {

            }
        }

}
