package albastro.decision.myapplication.CubeFormulas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import albastro.decision.myapplication.Formulas;
import albastro.decision.myapplication.R;
import albastro.decision.myapplication.cube;

public class CubeArea extends AppCompatActivity implements View.OnClickListener {

    TextView txtCubeAreaCalculator, txtCubeAreaEdge, txtCubeAreaAnswer;
    EditText inputCubeAreaEdge;
    Button btnCubeAreaCalculate, btnCubeAreaBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cube_area);

        txtCubeAreaCalculator = findViewById(R.id.txtCubeAreaCalculator);
        txtCubeAreaEdge = findViewById(R.id.txtCubeAreaEdge);
        txtCubeAreaAnswer = findViewById(R.id.txtCubeAreaAnswer);
        inputCubeAreaEdge = findViewById(R.id.inputCubeAreaEdge);
        btnCubeAreaCalculate = findViewById(R.id.btnCubeAreaCalculate);
        btnCubeAreaBack = findViewById(R.id.btnCubeAreaBack);

        btnCubeAreaCalculate.setOnClickListener(this);
        btnCubeAreaBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){

        double edge = Double.parseDouble(String.valueOf(inputCubeAreaEdge.getText()));

        switch (v.getId()){

            case R.id.btnCubeAreaCalculate:
                txtCubeAreaAnswer.setText(String.valueOf(Formulas.cubeAreaFormula(edge)));
                break;
            case R.id.btnCubeAreaBack:
                Intent CuABack = new Intent(this, cube.class);
                startActivity(CuABack);
                break;
        }
    }
}
