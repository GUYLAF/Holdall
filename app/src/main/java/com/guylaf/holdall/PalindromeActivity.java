package com.guylaf.holdall;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class PalindromeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palindrome);
        final EditText editText = (EditText) findViewById(R.id.edit_text);
        final TextView textView = (TextView) findViewById(R.id.text_view);
        final Button button = (Button) findViewById(R.id.button_ok);
        final FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(PalindromeActivity.this,editText.getText(), Toast.LENGTH_SHORT).show();
                Palindrome p = new Palindrome();
                //String t = p.Inverse(editText.getText().toString());
                textView.setText(p.Inverse(editText.getText().toString()));
                String pal = editText.getText().toString();
                if (p.Palindrome(pal)) {
                    fab.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(android.R.color.holo_green_dark)));
                }else {
                    fab.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(android.R.color.holo_red_dark)));
                }
            }
        });

    }
}
