package np.com.bikramtuladhar.multipageaddition;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class AdditionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addition);

        TextView firstDigit = findViewById(R.id.tvFirstDigit);
        TextView secondDigit = findViewById(R.id.tvSecondDigit);

        Intent intent = getIntent();
        String getFirstDigit = intent.getStringExtra("firstDigit");
        String getSecondDigit = intent.getStringExtra("secondDigit");

        firstDigit.setText(getFirstDigit);
        secondDigit.setText(getSecondDigit);

        Button btnBack = findViewById(R.id.addition);

        btnBack.setOnClickListener(view -> {
            Intent intent1 = new Intent(AdditionActivity.this, MainActivity.class);

            int sum = Integer.parseInt(firstDigit.getText().toString()) + Integer.parseInt(secondDigit.getText().toString());

            intent1.putExtra("sum", String.valueOf(sum));
            intent1.putExtra("firstDigit", firstDigit.getText().toString());
            intent1.putExtra("secondDigit", secondDigit.getText().toString());

            startActivity(intent1);
        });
    }
}