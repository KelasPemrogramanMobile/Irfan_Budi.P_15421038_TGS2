package irfan.tugas_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class hasil extends AppCompatActivity {

    TextView textNama , textTgllahir , textNpm , textFakultas , textProdi , textAgama;
    private Button btnback;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        textNama = (TextView) findViewById(R.id.nm);
        textTgllahir = (TextView) findViewById(R.id.tgllhr);
        textNpm = (TextView) findViewById(R.id.npmm);
        textFakultas = (TextView) findViewById(R.id.fklts);
        textProdi = (TextView) findViewById(R.id.prdi);
        textAgama = (TextView) findViewById(R.id.agma);
        btnback = (Button) findViewById(R.id.btn);

        Intent nama =  getIntent();
        String strNama = nama.getStringExtra("Nama");
        textNama.setText(strNama);

        Intent tgllahir =  getIntent();
        String strTgllahir = tgllahir.getStringExtra("Tgllahir");
        textTgllahir.setText(strTgllahir);

        Intent npm =  getIntent();
        String strNpm = npm.getStringExtra("Npm");
        textNpm.setText(strNpm);

        Intent fakultas =  getIntent();
        String strFakultas = fakultas.getStringExtra("Fakultas");
        textFakultas.setText(strFakultas);

        Intent prodi =  getIntent();
        String strProdi = prodi.getStringExtra("Prodi");
        textProdi.setText(strProdi);

        Intent agama =  getIntent();
        String strAgama = agama.getStringExtra("Agama");
        textAgama.setText(strAgama);

        btnback.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent goHasil = new Intent(hasil.this, MenuUtama.class);
                startActivity(goHasil);
                finish();
            }
        });
    }
}
