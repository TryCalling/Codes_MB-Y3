package projectite.m2.fe.rupp.edu.quiza1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Test1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test1);
        getSupportActionBar().hide();

        ConstraintLayout viewYear1 = findViewById(R.id.view_year1);
        viewYear1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Test1Activity.this, "Test Click", Toast.LENGTH_SHORT).show();
            }
        });

    }
}