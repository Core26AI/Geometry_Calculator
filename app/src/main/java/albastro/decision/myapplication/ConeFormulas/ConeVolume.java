package albastro.decision.myapplication.ConeFormulas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import albastro.decision.myapplication.Cone;
import albastro.decision.myapplication.Formulas;
import albastro.decision.myapplication.R;

public class ConeVolume extends AppCompatActivity implements View.OnClickListener {

    TextView txtConeVolCalculator, txtConeVolRadius, txtConeVolHeight, txtConeVolAnswer;
    EditText inputConeVolRadius, inputConeVolHeight;
    Button btnConeVolCalculate, btnConeVolBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cone_volume);


        txtConeVolCalculator = findViewById(R.id.txtConeVolCalculator);
        txtConeVolRadius = findViewById(R.id.txtConeVolRadius);
        txtConeVolHeight = findViewById(R.id.txtConeVolHeight);
        txtConeVolAnswer = findViewById(R.id.txtConeVolAnswer);


        inputConeVolRadius = findViewById(R.id.inputConeVolRadius);
        inputConeVolHeight = findViewById(R.id.inputConeVolHeight);


        btnConeVolCalculate = findViewById(R.id.btnConeVolCalculate);
        btnConeVolBack = findViewById(R.id.btnConeVolBack);


        btnConeVolCalculate.setOnClickListener(this);
        btnConeVolBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){

        double radius = Double.parseDouble(String.valueOf(inputConeVolRadius.getText()));
        double height = Double.parseDouble(String.valueOf(inputConeVolHeight.getText()));

        switch (v.getId()){

            case R.id.btnConeVolCalculate:
                txtConeVolAnswer.setText(String.valueOf(Formulas.coneVolumeFormula(radius, height)));
                break;
            case R.id.btnConeVolBack:
                Intent CoVBack = new Intent(this, Cone.class);
                startActivity(CoVBack);
                break;
        }
    }
}