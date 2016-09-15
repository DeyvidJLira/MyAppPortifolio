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

        findViewsById();
        configureViewsClick();
    }

    private void findViewsById() {
        m_ButtonPopularMovies = (Button) findViewById(R.id.buttonPopularMovies);
        m_ButtonStockHawk = (Button) findViewById(R.id.buttonStockHawk);
        m_ButtonBuildItBigger = (Button) findViewById(R.id.buttonBuildItBigger);
        m_ButtonMakeYourAppMaterial = (Button) findViewById(R.id.buttonMakeYourAppMaterial);
        m_ButtonGoUbiquitous = (Button) findViewById(R.id.buttonGoUbiquitous);
        m_ButtonCapstone = (Button) findViewById(R.id.buttonCapstone);
    }

    private void configureViewsClick() {
        setDisplayMessage(m_ButtonPopularMovies, R.string.m_toast_popular_movies);
        setDisplayMessage(m_ButtonStockHawk, R.string.m_toast_stock_hawk);
        setDisplayMessage(m_ButtonBuildItBigger, R.string.m_toast_build_it_bigger);
        setDisplayMessage(m_ButtonMakeYourAppMaterial, R.string.m_toast_make_your_app_material);
        setDisplayMessage(m_ButtonGoUbiquitous, R.string.m_toast_go_ubiquitous);
        setDisplayMessage(m_ButtonCapstone, R.string.m_toast_capstone);
    }

    private void setDisplayMessage(Button viewButton, int toastMessageId) {
        final String toastMessage = getResources().getString(toastMessageId);
        viewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, toastMessage, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
