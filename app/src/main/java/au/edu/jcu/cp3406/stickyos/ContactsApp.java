package au.edu.jcu.cp3406.stickyos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ContactsApp extends AppCompatActivity {

    ImageButton androidImageButton;
    DraggableFAB contactsFloater;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts_app);

        androidImageButton = (ImageButton) findViewById(R.id.plus1);
        androidImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });

        contactsFloater = (DraggableFAB) findViewById(R.id.help_button);
        Intent helpIntent = new Intent(this, ContactsTutorial.class);
        contactsFloater.setIntent(helpIntent);

    }

    public void openActivity3() {
        Intent intent = new Intent(this, AddContact.class);
        startActivity(intent);
    }


}

