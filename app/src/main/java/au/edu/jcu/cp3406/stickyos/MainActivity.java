package au.edu.jcu.cp3406.stickyos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton cameraImageButton;
    ImageButton photosImageButton;
    ImageButton clockImageButton;
    ImageButton calendarImageButton;
    ImageButton notesImageButton;
    ImageButton mailImageButton;
    ImageButton appAssistantImageButton;
    ImageButton settingsImageButton;
    ImageButton phoneImageButton;
    ImageButton messagesImageButton;
    ImageButton contactsImageButton;
    ImageButton musicImageButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cameraImageButton = (ImageButton) findViewById(R.id.imageButtonCamera);
        cameraImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        photosImageButton = (ImageButton) findViewById(R.id.imageButtonPhotos);
        photosImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        clockImageButton = findViewById(R.id.imageButtonClock);
        clockImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        calendarImageButton = (ImageButton) findViewById(R.id.imageButtonCalendar);
        calendarImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        notesImageButton = (ImageButton) findViewById(R.id.imageButtonNotes);
        notesImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        mailImageButton = (ImageButton) findViewById(R.id.imageButtonMail);
        mailImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        appAssistantImageButton = (ImageButton) findViewById(R.id.imageButtonAssistant);
        appAssistantImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        settingsImageButton = (ImageButton) findViewById(R.id.imageButtonSettings);
        settingsImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        phoneImageButton = (ImageButton) findViewById(R.id.imageButtonPhone);
        phoneImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        messagesImageButton = (ImageButton) findViewById(R.id.imageButtonMessages);
        messagesImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        contactsImageButton = (ImageButton) findViewById(R.id.imageButtonContacts);
        contactsImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        musicImageButton = (ImageButton) findViewById(R.id.imageButtonMusic);
        musicImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}