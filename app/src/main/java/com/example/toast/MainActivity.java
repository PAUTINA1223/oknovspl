package com.example.toast;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;

        });
    }



    public void kn1(View view) {
        Toast myToast = Toast.makeText(getApplicationContext(),
                "Ура! 1 собака", Toast.LENGTH_LONG);
        myToast.show();
    }

    public void kn2(View view) {
        Toast myToast = Toast.makeText(getApplicationContext(),
                "Ура! 2 собака", Toast.LENGTH_LONG);
        myToast.show();
    }

    public void kn3(View view) {
        Toast myToast = Toast.makeText(getApplicationContext(),
                "Ура! 3 собака", Toast.LENGTH_LONG);
        myToast.show();
    }
}