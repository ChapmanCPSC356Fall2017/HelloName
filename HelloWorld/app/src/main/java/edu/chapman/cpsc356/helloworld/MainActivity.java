package edu.chapman.cpsc356.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private TextView helloTextView;
    private EditText nameEditText;
    private Button goButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create some references
        this.helloTextView = (TextView) findViewById(R.id.tv_hello);
        this.nameEditText = (EditText) findViewById(R.id.et_name);
        this.goButton = (Button) findViewById(R.id.btn_go);

        this.nameEditText.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {

            }

            @Override
            public void afterTextChanged(Editable s)
            {
                // Grab text inside edittext
                String name = s.toString();

                // Set the name in the textview
                helloTextView.setText("Hello " + name);
            }
        });

        this.goButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                // Grab text inside edittext
                String name = nameEditText.getText().toString();

                // Set the name in the textview
                helloTextView.setText("Hello " + name);
            }
        });
    }
}
