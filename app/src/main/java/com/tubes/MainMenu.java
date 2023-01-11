package com.tubes;

        import androidx.annotation.NonNull;
        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.ImageButton;
        import android.widget.ImageView;
        import android.widget.TextView;
        import android.widget.Toast;

        import com.google.firebase.database.DataSnapshot;
        import com.google.firebase.database.DatabaseError;
        import com.google.firebase.database.DatabaseReference;
        import com.google.firebase.database.FirebaseDatabase;
        import com.google.firebase.database.ValueEventListener;

        import java.security.PublicKey;
        import java.sql.Array;
        import java.util.Map;

public class MainMenu extends AppCompatActivity {
    private EditText ednamapel, edtnamabar, edtjumlahbel, edtharga, edtuangbay;
    private Button btnproses;
    private Button btnbayar;
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
    private TextView txttotalbelanja;
    private TextView txttotalbayar;
    private TextView txtuangkembali;
    private TextView txtketerangan;
    private TextView saladnumber;
    private TextView satenumber;
    private TextView steaknumber;
    private TextView ayamnumber;
    private TextView bakmienumber;
    private TextView telurnumber;
    private TextView saladprice;
    private TextView sateprice;
    private TextView steakprice;
    private TextView bakmieprice;
    private TextView ayamprice;
    private TextView telurprice;
    private DatabaseReference refsalad;
    private DatabaseReference refsteak;
    private DatabaseReference refsate;
    private DatabaseReference refbakmie;
    private DatabaseReference refayam;
    private DatabaseReference reftelur;
    int intsate,intsalad,intsteak,intayam,intbakmie,inttelur,hargasalad = 0;
    private DatabaseReference rootDatabaseref;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

//        getSupportActionBar().setTitle("kel3 shop");

        Button btn = findViewById(R.id.tombol1);
        btnbayar = (Button) findViewById(R.id.btnbayar);
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
        txttotalbelanja = (TextView) findViewById(R.id.totalbelanja);
        txttotalbayar = (TextView) findViewById(R.id.totalbayar);
        txtuangkembali = (TextView) findViewById(R.id.uangkembali);
        txtketerangan = (TextView) findViewById(R.id.keterangan);
        saladnumber = (TextView) findViewById(R.id.salad_number);
        satenumber = (TextView) findViewById(R.id.sate_number);
        steaknumber = (TextView) findViewById(R.id.steak_number);
        ayamnumber = (TextView) findViewById(R.id.ayam_number);
        bakmienumber = (TextView) findViewById(R.id.bakmie_number);
        telurnumber = (TextView) findViewById(R.id.telur_number);
        saladprice=findViewById(R.id.saladprice);
        sateprice=findViewById(R.id.sateprice);
        steakprice=findViewById(R.id.steakprice);
        bakmieprice=findViewById(R.id.bakmieprice);
        ayamprice=findViewById(R.id.ayamprice);
        telurprice=findViewById(R.id.telurprice);

        DAOTransaction dao = new DAOTransaction();
        rootDatabaseref= FirebaseDatabase.getInstance().getReference().child("Transaksi");
        refsalad = FirebaseDatabase.getInstance().getReference().child("menu/salad");
        refsteak = FirebaseDatabase.getInstance().getReference().child("menu/steak");
        refsate = FirebaseDatabase.getInstance().getReference().child("menu/sate");
        refbakmie = FirebaseDatabase.getInstance().getReference().child("menu/bakmie");
        refayam = FirebaseDatabase.getInstance().getReference().child("menu/ayam");
        reftelur = FirebaseDatabase.getInstance().getReference().child("menu/telur");

        refsalad.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if (snapshot.exists()){
                    String salad=snapshot.getValue().toString();
                    saladprice.setText(salad + " X");

                }
            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {
            }
        });

        refsteak.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if (snapshot.exists()){
                    String steak=snapshot.getValue().toString();
                    steakprice.setText(steak + " X");
                }
            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {
            }
        });

        refsate.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if (snapshot.exists()){
                    String sate=snapshot.getValue().toString();
                    sateprice.setText(sate + " X");
                }
            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {
            }
        });

        refbakmie.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if (snapshot.exists()){
                    String bakmie=snapshot.getValue().toString();
                    bakmieprice.setText(bakmie + " X");
                }
            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {
            }
        });

        refayam.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if (snapshot.exists()){
                    String ayam=snapshot.getValue().toString();
                    ayamprice.setText(ayam + " X");
                }
            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {
            }
        });

        reftelur.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if (snapshot.exists()){
                    String telur=snapshot.getValue().toString();
                    telurprice.setText(telur + " X");
                }
            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {
            }
        });

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

        //proses total bayar
//        btnproses.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Integer total = ((intsalad * 15000) + (intsate * 20000) + (intsteak * 22000) + (intayam * 20000) + (intbakmie * 23000) + (inttelur * 10000) );
//                String namapel = ednamapel.getText().toString();
//            }
//        });
//
//        //push to firebase
//        btnbayar.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Integer total = ((intsalad * 15000) + (intsate * 20000) + (intsteak * 22000) + (intayam * 20000) + (intbakmie * 23000) + (inttelur * 10000) );
//                String namapel = ednamapel.getText().toString();
//                String key = rootDatabaseref.push().getKey();
//
//                rootDatabaseref.child(key).child("Nama").setValue(namapel);
//                rootDatabaseref.child(key).child("total").setValue(total);
//            }
//        });

        //memberikan action pada tombol proses
        btnproses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int total = ((intsalad * 15000) + (intsate * 20000) + (intsteak * 22000) + (intayam * 20000) + (intbakmie * 23000) + (inttelur * 10000) );
                txttotalbayar.setText("Total : " + total);

                //pemberian if dan else untuk aturan pemberian bonus
            }
        });

        //push to firebase
        btnbayar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String namapelanggan = ednamapel.getText().toString().trim();
                String uangbayar = edtuangbay.getText().toString().trim();
                double ub = Double.parseDouble(uangbayar);
                int salad = intsalad * hargasalad ;
                int sate = intsate * 20000;
                int steak = intsteak * 22000;
                int ayam = intayam * 20000;
                int bakmie = intbakmie * 23000;
                int telur = inttelur * 10000;
                int total = salad + sate + steak + ayam + bakmie + telur;
                txttotalbelanja.setText("Total Belanja : " + total);

                //pemberian if dan else untuk aturan pemberian bonus

                double uangkembalian = (ub - total);

                if (ub < total){
                    txtketerangan.setText("Keterangan : uang bayar kurang Rp " + (-uangkembalian));
                    txtuangkembali.setText("Uang Kembali : Rp 0" );
                }else{
                    txtketerangan.setText("Keterangan : Tunggu Kembalian");
                    txtuangkembali.setText("Uang Kembali : " + uangkembalian);
                }

                String namapel = ednamapel.getText().toString();
                String key = rootDatabaseref.push().getKey();

                if (salad > 0){
                    rootDatabaseref.child(key).child("menu").child("salad").setValue(salad);
                }
                if (sate > 0){
                    rootDatabaseref.child(key).child("menu").child("sate").setValue(sate);
                }
                if (steak > 0){
                    rootDatabaseref.child(key).child("menu").child("steak").setValue(steak);
                }
                if (bakmie > 0){
                    rootDatabaseref.child(key).child("menu").child("bakmie").setValue(bakmie);
                }
                if (ayam > 0){
                    rootDatabaseref.child(key).child("menu").child("ayam").setValue(ayam);
                }
                if (telur > 0){
                    rootDatabaseref.child(key).child("menu").child("telur").setValue(telur);
                }
                else {
                     namapel = namapel;
                }

                rootDatabaseref.child(key).child("Nama").setValue(namapel);
                rootDatabaseref.child(key).child("total").setValue(total);

                Toast.makeText(getApplicationContext(), "Pembelian Berhasil", Toast.LENGTH_SHORT).show();


            }
        });

        //memberikan action pada tombol reset data

        btnhapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtnamapel.setText(" ");
                txttotalbelanja.setText(" Total Belanja : Rp 0");
                txttotalbayar.setText(" Total : Rp 0");
                txtuangbay.setText(" ");
                txtuangkembali.setText("Uang Kembali : Rp 0");
                txtketerangan.setText("Keterangan : - ");
                saladnumber.setText("0");
                satenumber.setText("0");
                steaknumber.setText("0");
                bakmienumber.setText("0");
                ayamnumber.setText("0");
                telurnumber.setText("0");

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