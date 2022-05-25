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

public class PyramidArea extends AppCompatActivity implements View.OnClickListener {
    TextView txtPACalculator, txtPALength, txtPAWidth, txtPAHeight, txtPAAnswer;
    EditText inputPALength, inputPAWidth, inputPAHeight;
    Button btnPACalculate, btnPABack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pyramid_area);


        txtPACalculator = findViewById(R.id.txtPACalculator);
        txtPALength = findViewById(R.id.txtPALength);
        txtPAWidth = findViewById(R.id.txtPAWidth);
        txtPAHeight = findViewById(R.id.txtPAHeight);
        txtPAAnswer = findViewById(R.id.txtPAAnswer);


        inputPALength = findViewById(R.id.inputPALength);
        inputPAWidth = findViewById(R.id.inputPAWidth);
        inputPAHeight = findViewById(R.id.inputPAHeight);


        btnPACalculate = findViewById(R.id.btnPACalculate);
        btnPABack = findViewById(R.id.btnPABack);


        btnPACalculate.setOnClickListener(this);
        btnPABack.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){

        double length = Double.parseDouble(String.valueOf(inputPALength.getText()));
        double width = Double.parseDouble(String.valueOf(inputPAWidth.getText()));
        double height = Double.parseDouble(String.valueOf(inputPAHeight.getText()));

        switch (v.getId()){

            case R.id.btnPACalculate:
                txtPAAnswer.setText(String.valueOf(Formulas.pyramidAreaFormula(length,width,height)));
                break;
            case R.id.btnPABack:
                Intent PABack = new Intent(this, pyramid.class);
                startActivity(PABack);
                break;
        }
    }
}