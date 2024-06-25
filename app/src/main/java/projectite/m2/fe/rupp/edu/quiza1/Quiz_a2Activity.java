package projectite.m2.fe.rupp.edu.quiza1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import projectite.m2.fe.rupp.edu.quiza1.databinding.ActivityQuizA1Binding;
import projectite.m2.fe.rupp.edu.quiza1.databinding.ActivityQuizA2Binding;

public class Quiz_a2Activity extends AppCompatActivity {

    private ActivityQuizA1Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();

        binding = ActivityQuizA1Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }
}