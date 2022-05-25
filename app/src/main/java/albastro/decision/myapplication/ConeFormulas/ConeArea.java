package albastro.decision.myapplication.ConeFormulas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import albastro.decision.myapplication.Cone;
import albastro.decision.myapplication.Formulas;
import albastro.decision.myapplication.R;

public class ConeArea extends AppCompatActivity implements View.OnClickListener {

    EditText txtRadius, txtHeight;
    Button calculate, back;
    TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cone_area);

        txtHeight = findViewById(R.id.txtHeightConeArea);
        txtRadius = findViewById(R.id.txtRadiusConeArea);
        calculate = findViewById(R.id.btnCalculateConeArea);
        answer = findViewById(R.id.txtConeAreaAns);
        back = findViewById(R.id.btnConeBackArea);

        calculate.setOnClickListener(this);
        back.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){

        double radius = Double.parseDouble(String.valueOf(txtRadius.getText()));
        double height = Double.parseDouble(String.valueOf(txtHeight.getText()));

        switch (v.getId()) {
            case R.id.btnCalculateConeArea:

                answer.setText(String.valueOf(Formulas.coneAreaFormula(radius,height)));
                break;
            case R.id.btnConeBackArea:
                Intent ConebackArea = new Intent(this, Cone.class);
                startActivity(ConebackArea);
                break;

        }
    }
}