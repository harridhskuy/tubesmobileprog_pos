package com.tubes;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class testfire extends AppCompatActivity {

    private EditText inputid, inputname;
    private Button btn;
    private DatabaseReference rootDatabaseref;
//    private Button btnRead;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testfire);

        inputid=findViewById(R.id.inputid);
        inputname=findViewById(R.id.inputname);
        btn=findViewById(R.id.btnsend);

        rootDatabaseref= FirebaseDatabase.getInstance().getReference().child("menu");


//        rootDatabaseref.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot snapshot) {
//                for (DataSnapshot snapshot1 : snapshot.getChildren()){
//                    Information info =snapshot1.getValue(Information.class);
//                }
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError error) {
//
//            }
//        });


//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Integer ID=Integer.parseInt(inputid.getText().toString());
//                String name=inputname.getText().toString();
//
//                String key=rootDatabaseref.push().getKey();
//                rootDatabaseref.child(key).child("ID").setValue(ID);
//                rootDatabaseref.child(key).child("Name").setValue(name);
//            }
//        });
    }
}