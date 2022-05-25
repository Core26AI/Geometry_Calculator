package albastro.decision.myapplication.CylinderFormulas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import albastro.decision.myapplication.Formulas;
import albastro.decision.myapplication.R;
import albastro.decision.myapplication.cylinder;

public class CylinderArea extends AppCompatActivity implements View.OnClickListener {

    TextView txtCylinderAreaCalculator, txtCylinderAreaRadius, txtCylinderAreaHeight, txtCylinderAreaAnswer;
    EditText inputCylinderAreaRadius, inputCylinderAreaHeight;
    Button btnCylinderAreaCalculate, btnCylinderAreaBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cylinder_area);

        txtCylinderAreaCalculator = findViewById(R.id.txtCylinderAreaCalculator);
        txtCylinderAreaRadius = findViewById(R.id.txtCylinderAreaRadius);
        txtCylinderAreaHeight = findViewById(R.id.txtCylinderAreaHeight);
        txtCylinderAreaAnswer = findViewById(R.id.txtCylinderAreaAnswer);

        inputCylinderAreaRadius = findViewById(R.id.inputCylinderAreaRadius);
        inputCylinderAreaHeight = findViewById(R.id.inputCylinderAreaHeight);

        btnCylinderAreaCalculate = findViewById(R.id.btnCylinderAreaCalculate);
        btnCylinderAreaBack = findViewById(R.id.btnCylinderAreaBack);


        btnCylinderAreaCalculate.setOnClickListener(this);
        btnCylinderAreaBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){

        double radius = Double.parseDouble(String.valueOf(inputCylinderAreaRadius.getText()));
        double height = Double.parseDouble(String.valueOf(inputCylinderAreaHeight.getText()));

        switch (v.getId()){

            case R.id.btnCylinderAreaCalculate:
                txtCylinderAreaAnswer.setText(String.valueOf(Formulas.cylinderAreaFormula(radius, height)));
                break;
            case R.id.btnCylinderAreaBack:
                Intent CyABack = new Intent(this, cylinder.class);
                startActivity(CyABack);
                break;
        }
    }
}