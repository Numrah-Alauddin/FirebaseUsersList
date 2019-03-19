package com.example.firebaseuserslist;


import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class UserViewHolder extends RecyclerView.ViewHolder{

    TextView name;
    TextView email;

    public UserViewHolder(@NonNull View itemView) {
        super(itemView);

        name=itemView.findViewById(R.id.user_name);
        email=itemView.findViewById(R.id.user_email);

    }
}
