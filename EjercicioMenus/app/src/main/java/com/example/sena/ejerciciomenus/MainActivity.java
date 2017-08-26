package com.example.sena.ejerciciomenus;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

import com.example.sena.ejerciciomenus.Agenda.agenda;
import com.example.sena.ejerciciomenus.Dialogos.dialogos;
import com.example.sena.ejerciciomenus.Fragmentos.fragmentos;
import com.example.sena.ejerciciomenus.FrgamentoFinal.ListadoProductosActivity;
import com.example.sena.ejerciciomenus.Galeria.galeria;
import com.example.sena.ejerciciomenus.Tabs.tabs;

import static android.R.id.progress;

public class MainActivity extends AppCompatActivity {

    private WebView pagina;
    private ProgressBar barra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        WebView pagina = (WebView) findViewById(R.id.web);
        pagina.loadUrl ("https://www.google.com.co");
        pagina.getSettings().setBuiltInZoomControls(true);
        pagina.setWebViewClient(new WebViewClient() {
        @Override
            public boolean shouldOverrideUrlLoading ( WebView view, String url) {
            view.loadUrl(url);
            return true;
        }

    });
            pagina.loadUrl("https://www.google.com.co");
            barra = (ProgressBar) findViewById(R.id.br1);

            pagina.setWebChromeClient(new WebChromeClient(){
            @Override
            public void onProgressChanged (WebView view, int progress) {
            barra.setProgress(0);
            barra.setVisibility(View.VISIBLE);
            MainActivity.this.setProgress(progress * 1000);

            barra.incrementProgressBy(progress);

            if (progress == 100) {
            barra.setVisibility(view.GONE);
            }
            }
        });}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.Fragmentos) {

            Intent i = new Intent(MainActivity.this,fragmentos.class);
            startActivity(i);
            return true;
        }
        if (id == R.id.Galeria) {

            Intent i = new Intent(MainActivity.this,galeria.class);
            startActivity(i);
            return true;
        }
        if (id == R.id.Dialogos) {

            Intent i = new Intent(MainActivity.this,dialogos.class);
            startActivity(i);
            return true;
        }
        if (id == R.id.Tabs) {

            Intent i = new Intent(MainActivity.this,tabs.class);
            startActivity(i);
            return true;
        }
        if (id == R.id.Agenda) {

            Intent i = new Intent(MainActivity.this,agenda.class);
            startActivity(i);
            return true;
        }
        if (id == R.id.Contactos) {

            Intent i = new Intent(this,ListadoProductosActivity.class);
            startActivity(i);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onBackPressed ()
    {
        if (pagina.canGoBack())
        {
            pagina.goBack();
        }
        else
        {
            super.onBackPressed();
        }
    }

    }


