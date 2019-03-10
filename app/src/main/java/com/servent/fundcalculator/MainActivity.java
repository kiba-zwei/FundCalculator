package com.servent.fundcalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText holdingTimeEditText;
    private EditText expectedReturnEditText;
    private EditText totalAmountEditText;
    private TextView conclusionTextView;
    private Button caculatorButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        caculatorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO: enrich the content displayed
                int holdingTime = Integer.valueOf(holdingTimeEditText.getText().toString());
                double exceptedRetrun = Double.valueOf(expectedReturnEditText.getText().toString());
                int totalAmount = Integer.valueOf(totalAmountEditText.getText().toString());
                StringBuilder res = new StringBuilder("建议在总额");
                res.append(AlgorithmUtils.getTotolAmountForYear(holdingTime, exceptedRetrun, totalAmount));
                res.append("后卖出");
                conclusionTextView.setText(res.toString());
            }
        });

    }

    private void init() {
        holdingTimeEditText = (EditText) findViewById(R.id.edit_text_holding_time);
        expectedReturnEditText = (EditText) findViewById(R.id.edit_text_expected_return);
        totalAmountEditText = (EditText) findViewById(R.id.edit_text_total_amount);
        conclusionTextView = (TextView) findViewById(R.id.text_view_conclusion);
        caculatorButton = (Button) findViewById(R.id.button_calculate);
    }
}
