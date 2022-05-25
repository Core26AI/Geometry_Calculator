package albastro.decision.myapplication.PyramidFormulas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import albastro.decision.myapplication.Formulas;
import albastro.decision.myapplication.R;
import albastro.decision.myapplication.pyramid;

public class PyramidVolume extends AppCompatActivity implements View.OnClickListener {

    TextView txtPVCalculator, txtPVLength, txtPVWidth, txtPVHeight, txtPVAnswer;
    EditText inputPVLength, inputPVWidth, inputPVHeight;
    Button btnPVCalculate, btnPVBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pyramid_volume);

        txtPVCalculator = findViewById(R.id.txtPVCalculator);
        txtPVLength = findViewById(R.id.txtPVLength);
        txtPVWidth = findViewById(R.id.txtPVWidth);
        txtPVHeight = findViewById(R.id.txtPVHeight);
        txtPVAnswer = findViewById(R.id.txtPVAnswer);

        inputPVLength = findViewById(R.id.inputPVLength);
        inputPVWidth = findViewById(R.id.inputPVWidth);
        inputPVHeight = findViewById(R.id.inputPVHeight);

        btnPVCalculate = findViewById(R.id.btnPVCalculate);
        btnPVBack = findViewById(R.id.btnPVBack);

        btnPVCalculate.setOnClickListener(this);
        btnPVBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){

        double length = Double.parseDouble(String.valueOf(inputPVLength.getText()));
        double width = Double.parseDouble(String.valueOf(inputPVWidth.getText()));
        double height = Double.parseDouble(String.valueOf(inputPVHeight.getText()));

        switch (v.getId()){

            case R.id.btnPVCalculate:
                txtPVAnswer.setText(String.valueOf(Formulas.pyramidVolumeFormula(length,width,height)));
                break;
            case R.id.btnPVBack:
                Intent PVBack = new Intent(this, pyramid.class);
                startActivity(PVBack);
                break;
        }
    }
}