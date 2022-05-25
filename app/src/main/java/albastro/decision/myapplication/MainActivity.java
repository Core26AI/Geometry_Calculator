package albastro.decision.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnCone, btnPyramid, btnCylinder, btnCube;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCone = findViewById(R.id.btnCone);
        btnCube = findViewById(R.id.btnCube);
        btnCylinder = findViewById(R.id.btnCylinder);
        btnPyramid = findViewById(R.id.btnPyramid);

        btnCone.setOnClickListener(this);
        btnCube.setOnClickListener(this);
        btnCylinder.setOnClickListener(this);
        btnPyramid.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch (v.getId()) {


            case R.id.btnCone:
                Intent intent = new Intent(this,Cone.class);
                startActivity(intent);
                break;
            case R.id.btnCube:
                Intent intent1 = new Intent(this,cube.class);
                startActivity(intent1);
                break;
            case R.id.btnCylinder:
                Intent intent2 = new Intent(this,cylinder.class);
                startActivity(intent2);
                break;
            case R.id.btnPyramid:
                Intent intent3 = new Intent(this,pyramid.class);
                startActivity(intent3);
                break;
        }

    }
}