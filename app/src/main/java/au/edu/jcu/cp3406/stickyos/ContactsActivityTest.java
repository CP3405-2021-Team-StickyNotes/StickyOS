package au.edu.jcu.cp3406.stickyos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ContactsActivityTest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts_test);

        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            if(bundle.getString("TutorialTrigger") != null) {
                //Trigger Tutorial
            }
        }
    }
}