package irfan.tugas_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MenuUtama extends AppCompatActivity {

    private EditText ubNama , ubTgllahir , ubNpm , ubFakultas , ubProdi , ubAgama;
    private Button btnambildata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);

        ubNama = (EditText) findViewById(R.id.nama);
        ubTgllahir = (EditText) findViewById(R.id.tgllahir);
        ubNpm = (EditText) findViewById(R.id.npm);
        ubFakultas = (EditText) findViewById(R.id.fakultas);
        ubProdi = (EditText) findViewById(R.id.prodi);
        ubAgama = (EditText) findViewById(R.id.agama);
        btnambildata = (Button) findViewById(R.id.btnambildata);

        btnambildata.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String nama = ubNama.getText().toString();
                String tgllahir = ubTgllahir.getText().toString();
                String npm = ubNpm.getText().toString();
                String fakultas = ubFakultas.getText().toString();
                String prodi = ubProdi.getText().toString();
                String agama = ubAgama.getText().toString();

                Intent go = new Intent(MenuUtama.this,hasil.class);
                go.putExtra("Nama",nama);
                go.putExtra("Tgllahir",tgllahir);
                go.putExtra("Npm",npm);
                go.putExtra("Fakultas",fakultas);
                go.putExtra("Prodi",prodi);
                go.putExtra("Agama",agama);
                startActivity(go);
                finish();
            }
        });
    }
}
