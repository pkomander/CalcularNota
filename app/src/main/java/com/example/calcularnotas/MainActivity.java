package com.example.calcularnotas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editTxtNota1;
    private EditText editTxtNota2;
    private EditText editTxtNota3;
    private Button btnCalcular;
    private TextView txtMediaFinal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTxtNota1 = (EditText) findViewById(R.id.editTxtNota1);
        editTxtNota2 = (EditText) findViewById(R.id.editTxtNota2);
        editTxtNota3 = (EditText) findViewById(R.id.editTxtNota3);
        btnCalcular = (Button) findViewById(R.id.editTxtCalcular);
        txtMediaFinal = (TextView) findViewById(R.id.editTxtMediaFinal);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double nota1 = Double.parseDouble(editTxtNota1.getText().toString());
                double nota2 = Double.parseDouble(editTxtNota2.getText().toString());
                double nota3 = Double.parseDouble(editTxtNota3.getText().toString());

                double media = CalcularMedia(nota1, nota2, nota3);

                if (media >= 6){
                    txtMediaFinal.setText(""+media+" Aluno Aprovado");
                }
                else {
                    txtMediaFinal.setText(""+media+" Aluno Reprovado");
                }
            }
        });

    }

    private double CalcularMedia(double n1, double n2, double n3) {
        double mediaFinal = (n1 + n2 + n3) / 3;
        return mediaFinal;
    }
}