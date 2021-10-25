package au.edu.jcu.cp3406.stickyos;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class AddContactsTutorial extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_contact_tutorial);

        Button buttonOne = findViewById(R.id.beginAddContact);
        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity3();
            }
        });

    }


    public void openActivity3() {
        Intent intent = new Intent(this, AddContact.class);
        startActivity(intent);
    }
}

