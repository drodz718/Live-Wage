package com.drod.livewage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    Button enterWageBtn = (Button) findViewById(R.id.enterWageButton);
    enterWageBtn.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        EditText wageEditText = (EditText) findViewById(R.id.editHourlyWage);
        TextView resultTextView = (TextView) findViewById(R.id.textAmount);

        Double hourlyWage = Double.parseDouble(wageEditText.getText().toString());
        Double secondlyWage = hourlyWage / 3600;
        resultTextView.setText("$ " + secondlyWage);

      }
    });



  }
}
