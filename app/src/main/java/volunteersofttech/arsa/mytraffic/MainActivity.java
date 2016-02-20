package volunteersofttech.arsa.mytraffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    //ประการ ตัวแปร
    private ListView trafficListView;
    private Button aboutButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bind Widget
        bindwidget();

        //button controller
        buttoncontroller();

    } //main method

    private void buttoncontroller() {
        aboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //sound effect
                MediaPlayer mediaPlayer = MediaPlayer.create(getBaseContext(),R.raw.pig);
                mediaPlayer.start();

                //Web View
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://youtu.be/c3XkJ5AiHbI"));
                startActivity(intent);

            } //Event
        });
    }//buttoncontroller

    private void bindwidget() {

        trafficListView = (ListView) findViewById(R.id.listView);
        aboutButton = (Button) findViewById(R.id.button);

    } //bindwidget
} //main class นี้คืน class หลัก
