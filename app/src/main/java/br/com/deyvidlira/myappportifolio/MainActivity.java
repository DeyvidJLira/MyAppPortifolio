package br.com.deyvidlira.myappportifolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button m_ButtonPopularMovies;
    private Button m_ButtonStockHawk;
    private Button m_ButtonBuildItBigger;
    private Button m_ButtonMakeYourAppMaterial;
    private Button m_ButtonGoUbiquitous;
    private Button m_ButtonCapstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FindViewsById();
        ConfigureViewsClick();
    }

    private void FindViewsById() {
        m_ButtonPopularMovies = (Button) findViewById(R.id.buttonPopularMovies);
        m_ButtonStockHawk = (Button) findViewById(R.id.buttonStockHawk);
        m_ButtonBuildItBigger = (Button) findViewById(R.id.buttonBuildItBigger);
        m_ButtonMakeYourAppMaterial = (Button) findViewById(R.id.buttonMakeYourAppMaterial);
        m_ButtonGoUbiquitous = (Button) findViewById(R.id.buttonGoUbiquitous);
        m_ButtonCapstone = (Button) findViewById(R.id.buttonCapstone);
    }

    private void ConfigureViewsClick() {
        m_ButtonPopularMovies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, R.string.m_toast_popular_movies, Toast.LENGTH_SHORT).show();
            }
        });

        m_ButtonStockHawk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, R.string.m_toast_stock_hawk, Toast.LENGTH_SHORT).show();
            }
        });

        m_ButtonBuildItBigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, R.string.m_toast_build_it_bigger, Toast.LENGTH_SHORT).show();
            }
        });

        m_ButtonMakeYourAppMaterial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, R.string.m_toast_make_your_app_material, Toast.LENGTH_SHORT).show();
            }
        });

        m_ButtonGoUbiquitous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, R.string.m_toast_go_ubiquitous, Toast.LENGTH_SHORT).show();
            }
        });

        m_ButtonCapstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, R.string.m_toast_capstone, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
