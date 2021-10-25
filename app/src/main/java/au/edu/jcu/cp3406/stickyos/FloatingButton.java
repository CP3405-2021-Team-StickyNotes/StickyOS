package au.edu.jcu.cp3406.stickyos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class FloatingButton extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floating_button2);

        FloatingActionButton fab = findViewById(R.id.help_button);

        fab.setOnClickListener(view -> Toast.makeText(FloatingButton.this, "Test", Toast.LENGTH_SHORT).show());
    }

}