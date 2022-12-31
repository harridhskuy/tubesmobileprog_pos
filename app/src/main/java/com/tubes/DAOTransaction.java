package com.tubes;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Transaction;

public class DAOTransaction {
    private DatabaseReference databaseReference;
    public DAOTransaction(){
        FirebaseDatabase db = FirebaseDatabase.getInstance();
        databaseReference = db.getReference(Transaction.class.getSimpleName());
    }
    public Task<Void> add(Transaction emp){
        return databaseReference.push().setValue(emp);
    }
}
