package albastro.decision.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import albastro.decision.myapplication.CylinderFormulas.CylinderArea;
import albastro.decision.myapplication.CylinderFormulas.CylinderVolume;

public class cylinder extends AppCompatActivity implements View.OnClickListener{

    TextView txtCylinder;
    Button btnCylinderArea, btnCylinderVolume, btnCylinderBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cylinder);

        txtCylinder = findViewById(R.id.txtCylinder);
        btnCylinderArea = findViewById(R.id.btnCylinderArea);
        btnCylinderVolume = findViewById(R.id.btnCylinderVolume);
        btnCylinderBack = findViewById(R.id.btnCylinderBack);

        btnCylinderArea.setOnClickListener(this);
        btnCylinderVolume.setOnClickListener(this);
        btnCylinderBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){

        switch (v.getId()){

            case R.id.btnCylinderArea:
                Intent cylinderArea = new Intent(this, CylinderArea.class);
                startActivity(cylinderArea);
                break;
            case R.id.btnCylinderVolume:
                Intent cylinderVolume = new Intent(this, CylinderVolume.class);
                startActivity(cylinderVolume);
                break;
            case R.id.btnCylinderBack:
                Intent cylinderBack = new Intent(this, MainActivity.class);
                startActivity(cylinderBack);
                break;
        }
    }
}