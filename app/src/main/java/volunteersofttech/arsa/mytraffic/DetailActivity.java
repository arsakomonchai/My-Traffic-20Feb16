package volunteersofttech.arsa.mytraffic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity implements View.OnClickListener {

    //explicit
    private TextView titleTextView, detailTextView;
    private ImageView tranfficImageView;
    private Button preButton,backButton, nextButton;
    private int[] iconints;
    private String[] titlestrings, detaillongstrings;
    private int myindexAnInt;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // bind widget
        bindwidget();

        //show view
        showview();

        //button control
        button_control();

        //button 2
        //backButtoncontrol();

        //button 4
        //nextButtoncontrol();



    }//main method

    private void button_control() {
        preButton.setOnClickListener(this);
        backButton.setOnClickListener(this);
        nextButton.setOnClickListener(this);

    } //button control



    private void showview() {

        //receive value from Intend
        titlestrings = getIntent().getStringArrayExtra("title");
        iconints = getIntent().getIntArrayExtra("image");
        myindexAnInt = getIntent().getIntExtra("Index", 0);

        detaillongstrings = getResources().getStringArray(R.array.detail_log); //detail_long

        changeview(myindexAnInt);

    } //showview

    private void changeview(int myindexAnInt) {


        titleTextView.setText(titlestrings[myindexAnInt]);
        tranfficImageView.setImageResource(iconints[myindexAnInt]);
        detailTextView.setText(detaillongstrings[myindexAnInt]);

    }

    private void bindwidget() {
        titleTextView = (TextView) findViewById(R.id.textView4);
        detailTextView = (TextView) findViewById(R.id.textView5);
        tranfficImageView = (ImageView) findViewById(R.id.imageView2);
        preButton = (Button) findViewById((R.id.button2));
        backButton = (Button) findViewById(R.id.button3);
        nextButton = (Button) findViewById(R.id.button4);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.button2:

                myindexAnInt -= 1;
                if (myindexAnInt <0) {
                    myindexAnInt = 19;
                }
                changeview(myindexAnInt);

                break;
            case R.id.button3:
                finish();
                break;
            case R.id.button4:
                myindexAnInt += 1;
                if (myindexAnInt >19) {
                    myindexAnInt = 0;

                }
                changeview(myindexAnInt);
                break;

        }//switch


    }//onclick

}// maincass
