package com.tubes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText ednamapel, edtnamabar, edtjumlahbel, edtharga, edtuangbay;
    private Button btnproses;
    private Button btnhapus;
    private Button btnexit;
    private Button btndecreasesalad;
    private Button btnincreasesalad;
    private Button btndecreasesate;
    private Button btnincreasesate;
    private Button btndecreasesteak;
    private Button btnincreasesteak;
    private Button btndecreaseayam;
    private Button btnincreaseayam;
    private Button btndecreasebakmie;
    private Button btnincreasebakmie;
    private Button btndecreasetelur;
    private Button btnincreasetelur;
    private TextView txtnamapel;
    private TextView txtnamabar;
    private TextView txtjumlahbel;
    private TextView txtharga;
    private TextView txtuangbay;
    private TextView txtbonus;
    private TextView txttotalbelanja;
    private TextView txtuangkembali;
    private TextView txtketerangan;
    private TextView saladnumber;
    private TextView satenumber;
    private TextView steaknumber;
    private TextView ayamnumber;
    private TextView bakmienumber;
    private TextView telurnumber;
    int intsate,intsalad,intsteak,intayam,intbakmie,inttelur = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("kel3 shop");

        ednamapel = (EditText) findViewById(R.id.namapelanggan);
        edtuangbay = (EditText) findViewById(R.id.uangbayar);
        btnproses = (Button) findViewById(R.id.tombol1);
        btnhapus = (Button) findViewById(R.id.tombol2);
        btnexit = (Button) findViewById(R.id.tombol3);
        btndecreasesalad = (Button) findViewById(R.id.decreasesalad);
        btnincreasesalad = (Button) findViewById(R.id.increasesalad);
        btndecreasesate = (Button) findViewById(R.id.decreasesate);
        btnincreasesate = (Button) findViewById(R.id.increasesate);
        btndecreasesteak = (Button) findViewById(R.id.decreasesteak);
        btnincreasesteak = (Button) findViewById(R.id.increasesteak);
        btndecreaseayam = (Button) findViewById(R.id.decreaseayam);
        btnincreaseayam = (Button) findViewById(R.id.increaseayam);
        btndecreasebakmie = (Button) findViewById(R.id.decreasebakmie);
        btnincreasebakmie = (Button) findViewById(R.id.increasebakmie);
        btndecreasetelur = (Button) findViewById(R.id.decreasetelur);
        btnincreasetelur = (Button) findViewById(R.id.increasetelur);
        txtnamapel = (TextView) findViewById(R.id.namapelanggan);
        txtuangbay = (TextView) findViewById(R.id.uangbayar);
        txtbonus = (TextView) findViewById(R.id.bonus);
        txttotalbelanja = (TextView) findViewById(R.id.totalbelanja);
        txtuangkembali = (TextView) findViewById(R.id.uangkembali);
        txtketerangan = (TextView) findViewById(R.id.keterangan);
        saladnumber = (TextView) findViewById(R.id.salad_number);
        satenumber = (TextView) findViewById(R.id.sate_number);
        steaknumber = (TextView) findViewById(R.id.steak_number);
        ayamnumber = (TextView) findViewById(R.id.ayam_number);
        bakmienumber = (TextView) findViewById(R.id.bakmie_number);
        telurnumber = (TextView) findViewById(R.id.telur_number);

        btnincreasesalad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intsalad = intsalad + 1;
                saladnumber.setText("" + intsalad);
            }
        });

        btndecreasesalad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intsalad = intsalad - 1;
                saladnumber.setText("" + intsalad);
            }
        });

        btnincreasesate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intsate = intsate + 1;
                satenumber.setText("" + intsate);
            }
        });

        btndecreasesate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intsate = intsate - 1;
                satenumber.setText("" + intsate);
            }
        });

        btnincreasesteak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intsteak = intsteak + 1;
                steaknumber.setText("" + intsteak);
            }
        });

        btndecreasesteak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intsteak = intsteak - 1;
                steaknumber.setText("" + intsteak);
            }
        });

        btnincreaseayam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intayam = intayam + 1;
                ayamnumber.setText("" + intayam);
            }
        });

        btndecreaseayam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intayam = intayam - 1;
                ayamnumber.setText("" + intayam);
            }
        });

        btnincreasebakmie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intbakmie = intbakmie + 1;
                bakmienumber.setText("" + intbakmie);
            }
        });

        btndecreasebakmie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intbakmie = intbakmie - 1;
                bakmienumber.setText("" + intbakmie);
            }
        });

        btnincreasetelur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inttelur = inttelur + 1;
                telurnumber.setText("" + inttelur);
            }
        });

        btndecreasesteak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inttelur = inttelur - 1;
                telurnumber.setText("" + inttelur);
            }
        });

        //memberikan action pada tombol proses
        btnproses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String namapelanggan = ednamapel.getText().toString().trim();
                String uangbayar = edtuangbay.getText().toString().trim();
                double ub = Double.parseDouble(uangbayar);
                int total = ((intsalad * 15000) + (intsate * 20000) + (intsteak * 22000) + (intayam * 20000) + (intbakmie * 23000) + (inttelur * 10000) );
                txttotalbelanja.setText("Total Belanja : " + total);

                //pemberian if dan else untuk aturan pemberian bonus

                if (total >=200000){
                    txtbonus.setText("Bonus : Mouse");
                } else if (total >=50000){
                    txtbonus.setText("Bonus : Keyboard");
                } else  if (total >=40000){
                    txtbonus.setText("Bonus : Harddisk");
                } else {
                    txtbonus.setText("Bonus : Tidak Ada Bonus");
                }
                double uangkembalian = (ub - total);

                if (ub < total){
                    txtketerangan.setText("Keterangan : uang bayar kurang Rp " + (-uangkembalian));
                    txtuangkembali.setText("Uang Kembali : Rp 0" );
                }else{
                    txtketerangan.setText("Keterangan : Tunggu Kembalian");
                    txtuangkembali.setText("Uang Kembali : " + uangkembalian);
                }
                //memberikan action pada tombol reset data
            }
        });

        btnhapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtnamapel.setText(" ");
                txtnamabar.setText(" ");
                txttotalbelanja.setText(" Total Belanja : Rp 0");
                txtharga.setText(" ");
                txtuangbay.setText(" ");
                txtuangkembali.setText("Uang Kembali : Rp 0");
                txtbonus.setText("Bonus : - ");
                txtjumlahbel.setText(" ");
                txtketerangan.setText("Keterangan : - ");

                Toast.makeText(getApplicationContext(), "Data sudah direset", Toast.LENGTH_SHORT).show();

                // memberikan action pada tombol keluar
            }
        });

        btnexit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveTaskToBack(true);
            }
        });

    }
}