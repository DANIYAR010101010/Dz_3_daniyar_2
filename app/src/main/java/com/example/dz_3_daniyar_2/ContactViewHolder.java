package com.example.dz_3_daniyar_2;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ContactViewHolder extends RecyclerView.ViewHolder {
    private TextView number;
    public ContactViewHolder(@NonNull View itemView) {
        super(itemView);
        number = itemView.findViewById(R.id.contact_1);
    }
    public void bind(String contactes ){
       number.setText(contactes);
    }
}
