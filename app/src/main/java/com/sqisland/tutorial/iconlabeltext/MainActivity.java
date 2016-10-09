package com.sqisland.tutorial.iconlabeltext;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    View image = findViewById(R.id.flower_image);
    final TextView label = (TextView) findViewById(R.id.flower_label);
    final TextView text = (TextView) findViewById(R.id.flower_text);

    final float labelTextSize = label.getTextSize();
    final float valueTextSize = text.getTextSize();

    // Reset
    image.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        label.setTextSize(TypedValue.COMPLEX_UNIT_PX, labelTextSize);
        text.setTextSize(TypedValue.COMPLEX_UNIT_PX, valueTextSize);
      }
    });

    // Enlarge on click
    View.OnClickListener enlargeClickListener = new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        TextView textView = (TextView) view;
        float textSize = textView.getTextSize();
        textView.setTextSize(TypedValue.COMPLEX_UNIT_PX, textSize * 1.2f);
      }
    };
    label.setOnClickListener(enlargeClickListener);
    text.setOnClickListener(enlargeClickListener);
  }
}