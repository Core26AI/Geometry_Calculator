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

public class CylinderVolume extends AppCompatActivity implements View.OnClickListener {

    TextView txtCylinderVolumeCalculator, txtCylinderVolumeRadius, txtCylinderVolumeHeight, txtCylinderVolumeAnswer;
    EditText inputCylinderVolumeRadius, inputCylinderVolumeHeight;
    Button btnCylinderVolumeCalculate, btnCylinderVolumeBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cylinder_volume);

        txtCylinderVolumeCalculator = findViewById(R.id.txtCylinderVolumeCalculator);
        txtCylinderVolumeRadius = findViewById(R.id.txtCylinderVolumeRadius);
        txtCylinderVolumeHeight = findViewById(R.id.txtCylinderVolumeHeight);
        txtCylinderVolumeAnswer = findViewById(R.id.txtCylinderVolumeAnswer);

        inputCylinderVolumeRadius = findViewById(R.id.inputCylinderVolumeRadius);
        inputCylinderVolumeHeight = findViewById(R.id.inputCylinderVolumeHeight);

        btnCylinderVolumeCalculate = findViewById(R.id.btnCylinderVolumeCalculate);
        btnCylinderVolumeBack = findViewById(R.id.btnCylinderVolumeBack);


        btnCylinderVolumeCalculate.setOnClickListener(this);
        btnCylinderVolumeBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){

        double radius = Double.parseDouble(String.valueOf(inputCylinderVolumeRadius.getText()));
        double height = Double.parseDouble(String.valueOf(inputCylinderVolumeHeight.getText()));

        switch (v.getId()){

            case R.id.btnCylinderVolumeCalculate:
                txtCylinderVolumeAnswer.setText(String.valueOf(Formulas.cylinderVolumeFormula(radius, height)));
                break;
            case R.id.btnCylinderVolumeBack:
                Intent CyVBack = new Intent(this, cylinder.class);
                startActivity(CyVBack);
                break;
        }
    }
}