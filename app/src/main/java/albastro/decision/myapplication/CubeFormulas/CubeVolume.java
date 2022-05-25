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

public class CubeVolume extends AppCompatActivity implements View.OnClickListener {

    TextView txtCubeVolumeCalculator, txtCubeVolumeEdge, txtCubeVolumeAnswer;
    EditText inputCubeVolumeEdge;
    Button btnCubeVolumeCalculate, btnCubeVolumeBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cube_volume);


        txtCubeVolumeCalculator = findViewById(R.id.txtCubeVolumeCalculator);
        txtCubeVolumeEdge = findViewById(R.id.txtCubeVolumeEdge);
        txtCubeVolumeAnswer = findViewById(R.id.txtCubeVolumeAnswer);
        inputCubeVolumeEdge = findViewById(R.id.inputCubeVolumeEdge);
        btnCubeVolumeCalculate = findViewById(R.id.btnCubeVolumeCalculate);
        btnCubeVolumeBack = findViewById(R.id.btnCubeVolumeBack);


        btnCubeVolumeCalculate.setOnClickListener(this);
        btnCubeVolumeBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){

        double edge = Double.parseDouble(String.valueOf(inputCubeVolumeEdge.getText()));

        switch (v.getId()){

            case R.id.btnCubeVolumeCalculate:
                txtCubeVolumeAnswer.setText(String.valueOf(Formulas.cubeVolumeFormula(edge)));
                break;
            case R.id.btnCubeVolumeBack:
                Intent CuVBack = new Intent(this, cube.class);
                startActivity(CuVBack);
                break;
        }
    }
}