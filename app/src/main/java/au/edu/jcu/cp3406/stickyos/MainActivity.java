package au.edu.jcu.cp3406.stickyos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }


    public void addAlarm(View view) {

    }

    public void openClock(View view){

        TextView titleText = findViewById(R.id.titleText);
        titleText.setText("Clock");

        LinearLayout parentLayout = findViewById(R.id.parentLayout);
        parentLayout.setVisibility(View.INVISIBLE);


    }


}