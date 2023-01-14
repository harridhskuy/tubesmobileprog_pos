package com.tubes;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class history extends AppCompatActivity {

    private DatabaseReference ref;
    private ListView namauser;
    private ListView totalan;
    String[] mobileArray = {"Android","IPhone","WindowsMobile","Blackberry",
            "WebOS","Ubuntu","Windows7","Max OS X"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

//        namauser = (TextView) findViewById(R.id.nama);
//        ref= FirebaseDatabase.getInstance().getReference().child("Transaksi");
//        totalan= (ListView) findViewById(R.id.totalan);


        //read data
//
//        ref.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot snapshot) {
//                for (DataSnapshot datas: snapshot.getChildren()){
//                    String ma = datas.child("Nama").getValue().toString();
//                    String tal = datas.child("total").getValue().toString();
//                }
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError error) {
//
//            }
//        });
    }
}