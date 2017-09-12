package edu.chapman.cpsc356.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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

        Toast.makeText(this, "This is a message!", Toast.LENGTH_SHORT).show();
    }

    public void onClickGo(View view)
    {
        // Grab text inside edittext
        String name = nameEditText.getText().toString();

        // Set the name in the textview
        helloTextView.setText("Hello " + name);
    }
}
