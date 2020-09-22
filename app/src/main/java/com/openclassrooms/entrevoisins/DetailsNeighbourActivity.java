package com.openclassrooms.entrevoisins;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.openclassrooms.entrevoisins.di.DI;
import com.openclassrooms.entrevoisins.model.Neighbour;
import com.openclassrooms.entrevoisins.service.FavoryNeighbourApiService;

public class DetailsNeighbourActivity extends AppCompatActivity {

    private Neighbour neighbour;
    private TextView voisinname;
    private ImageView voisinimage;
    private TextView localisation;
    private TextView phonenumber;
    private TextView aboutme;
    private TextView facebook;
    private View buttonfavory;
    private TextView identifiant;
    private View backbutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_neighbour);
        Intent intent = getIntent();
        neighbour = (Neighbour) intent.getExtras().getSerializable("neighbour");
        System.out.println(neighbour.getName());
        voisinname = findViewById(R.id.name);
        voisinimage = findViewById(R.id.avatar);
        localisation = findViewById(R.id.address);
        phonenumber = findViewById(R.id.phoneNumber);
        aboutme = findViewById(R.id.aboutMe);
        facebook = findViewById(R.id.facebook);
        buttonfavory = findViewById(R.id.floatingActionButton);
        identifiant = findViewById(R.id.identifiant);
        backbutton = findViewById(R.id.backButton);


        voisinname.setText(neighbour.getName());
        aboutme.setText(neighbour.getAboutMe());
        localisation.setText(neighbour.getAddress());
        phonenumber.setText(neighbour.getPhoneNumber());
        facebook.setText(neighbour.getFcbAdress());
        identifiant.setText(neighbour.getName());
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        Glide.with(this).load(neighbour.getAvatarUrl()).into(voisinimage);


        //Glide sert a télécharger une image et a l'afficher dans une imageview

        FavoryNeighbourApiService  favoryNeighbourApiService = DI.getFavoryNeighbourApiService();
        if(favoryNeighbourApiService.isfav(neighbour)){
            buttonfavory.setVisibility(View.GONE);
        }
        else {
            buttonfavory.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    favoryNeighbourApiService.addfavorite(neighbour);
                    Toast.makeText(DetailsNeighbourActivity.this, "Ajouté avec succès aux favoris", Toast.LENGTH_SHORT).show();
                    buttonfavory.setOnClickListener(null);
                    buttonfavory.animate().scaleX(0).scaleY(0);
                }
            });


        }


    }

}