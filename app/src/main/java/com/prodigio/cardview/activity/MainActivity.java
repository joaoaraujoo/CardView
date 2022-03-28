package com.prodigio.cardview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.prodigio.cardview.R;
import com.prodigio.cardview.adapter.PostagemAdapter;
import com.prodigio.cardview.model.Postagem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerPostagem;
    private List<Postagem> postagens = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPostagem = findViewById(R.id.recyclerPostagem);


        //Define layout
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerPostagem.setLayoutManager( layoutManager);


        //Define adapter
        this.prepararPostagens();
        PostagemAdapter adapter = new PostagemAdapter(postagens);
        recyclerPostagem.setAdapter(adapter);
    }

    public void prepararPostagens (){


        Postagem p;

        p = new Postagem ("João Araújo","#tbt Viagem Legal!", R.drawable.imagem1 );
        this.postagens.add( p );

        p = new Postagem ("Henio Antonio","#tbt Viagem Legal!", R.drawable.imagem2 );
        this.postagens.add( p );

        p = new Postagem ("Rafael Miguez","#tbt Viagem Legal!", R.drawable.imagem3 );
        this.postagens.add( p );

        p = new Postagem ("Mabyan Bezerra","#tbt Viagem Legal!", R.drawable.imagem4 );
        this.postagens.add( p );

    }

}