package np.com.bikramtuladhar.multipageaddition;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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

        Intent intent = getIntent();
        String sum = intent.getStringExtra("sum");
        String getFirstDigit = intent.getStringExtra("firstDigit");
        String getSecondDigit = intent.getStringExtra("secondDigit");

        TextView sumView = findViewById(R.id.sum);
        sumView.setText(sum);


        EditText firstDigit = findViewById(R.id.editTextFirstDigit);
        EditText secondDigit = findViewById(R.id.editTextSecondDigit);
        Button btn = findViewById(R.id.buttonSubmit);

        firstDigit.setText(getFirstDigit);
        secondDigit.setText(getSecondDigit);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AdditionActivity.class);

                intent.putExtra("firstDigit", firstDigit.getText().toString());
                intent.putExtra("secondDigit", secondDigit.getText().toString());

                startActivity(intent);
            }
        });
    }
}