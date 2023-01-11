package com.tubes;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.HashMap;

public class editmenu extends AppCompatActivity {

    private EditText editsalad;
    private EditText editsteak;
    private EditText editsate;
    private EditText editbakmie;
    private EditText editayam;
    private EditText edittelur;
    private Button btnupdate;
    private DatabaseReference rootdatabaseref;
    private DatabaseReference refsalad;
    private DatabaseReference refsteak;
    private DatabaseReference refsate;
    private DatabaseReference refbakmie;
    private DatabaseReference refayam;
    private DatabaseReference reftelur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editmenu);
        editsalad=findViewById(R.id.editsalad);
        editsteak=findViewById(R.id.editsteak);
        editsate=findViewById(R.id.editsate);
        editbakmie=findViewById(R.id.editbakmie);
        editayam=findViewById(R.id.editayam);
        edittelur=findViewById(R.id.edittelur);
        btnupdate=findViewById(R.id.btnupdate);

        rootdatabaseref = FirebaseDatabase.getInstance().getReference().child("menu");
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
                    editsalad.setText(salad);
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
                    editsteak.setText(steak);
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
                    editsate.setText(sate);
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
                    editbakmie.setText(bakmie);
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
                    editayam.setText(ayam);
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
                    edittelur.setText(telur);
                }
            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {
            }
        });

        btnupdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer pricesalad=Integer.parseInt(editsalad.getText().toString());
                Integer pricesteak=Integer.parseInt(editsteak.getText().toString());
                Integer pricesate=Integer.parseInt(editsate.getText().toString());
                Integer pricebakmie=Integer.parseInt(editbakmie.getText().toString());
                Integer priceayam=Integer.parseInt(editayam.getText().toString());
                Integer pricetelur=Integer.parseInt(edittelur.getText().toString());
                String name=editsalad.getText().toString();
                HashMap hashMap=new HashMap();
                hashMap.put("salad",pricesalad);
                hashMap.put("steak",pricesteak);
                hashMap.put("sate",pricesate);
                hashMap.put("bakmie",pricebakmie);
                hashMap.put("ayam",priceayam);
                hashMap.put("telur",pricetelur);

                rootdatabaseref.updateChildren(hashMap).addOnSuccessListener(new OnSuccessListener() {
                    @Override
                    public void onSuccess(Object o) {
                        Toast.makeText(editmenu.this, "Your Data Is Successfully update", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
    }
}