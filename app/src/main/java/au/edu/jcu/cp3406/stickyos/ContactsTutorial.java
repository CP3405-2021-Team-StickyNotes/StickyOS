package au.edu.jcu.cp3406.stickyos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ContactsTutorial extends AppCompatActivity {

    ImageButton androidImageButton;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts_tutuorial);

        androidImageButton = (ImageButton) findViewById(R.id.addContact);
        androidImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });
    }

    public void openActivity3() {
        Intent intent = new Intent(this, AddContact.class);
        startActivity(intent);
    }
}
