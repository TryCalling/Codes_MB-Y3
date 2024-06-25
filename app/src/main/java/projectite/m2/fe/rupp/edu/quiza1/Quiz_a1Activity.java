package projectite.m2.fe.rupp.edu.quiza1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import projectite.m2.fe.rupp.edu.quiza1.databinding.ActivityQuizA1Binding;

public class Quiz_a1Activity extends AppCompatActivity {

    private ActivityQuizA1Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();

        binding = ActivityQuizA1Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }

}