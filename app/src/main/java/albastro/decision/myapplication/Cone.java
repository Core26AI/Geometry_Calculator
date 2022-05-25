package albastro.decision.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import albastro.decision.myapplication.ConeFormulas.ConeArea;
import albastro.decision.myapplication.ConeFormulas.ConeVolume;

public class Cone extends AppCompatActivity implements View.OnClickListener {

    Button btnConeArea, btnConeVolume, btnConeBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cone);

        btnConeArea = findViewById(R.id.btnConeArea);
        btnConeVolume = findViewById(R.id.btnConeVolume);
        btnConeBack = findViewById(R.id.btnConeBack);

        btnConeArea.setOnClickListener(this);
        btnConeVolume.setOnClickListener(this);
        btnConeBack.setOnClickListener(this);

    }

    @Override
    public void onClick(View v){
        switch (v.getId()) {

            case R.id.btnConeArea:
                Intent intent = new Intent(this, ConeArea.class);
                startActivity(intent);
                break;
            case R.id.btnConeVolume:
                Intent intent2 = new Intent(this, ConeVolume.class);
                startActivity(intent2);
                break;
            case R.id.btnConeBack:
                Intent intent3 = new Intent(this, MainActivity.class);
                startActivity(intent3);
                break;

        }
    }
}