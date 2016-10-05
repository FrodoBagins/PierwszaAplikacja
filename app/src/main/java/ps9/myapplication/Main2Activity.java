package ps9.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends Activity {
    private Button btnOpenNewActivity;
    private Button btnOpenNextActivity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main2);

        btnOpenNewActivity = (Button) findViewById(R.id.btnOpenNewActivity);
        btnOpenNewActivity.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


              //  onBackPressed();

                Intent startAnotherActivity = new Intent(getApplicationContext(), Main22Activity.class);
                startActivity(startAnotherActivity);
            }
        });

       // btnOpenNextActivity = (Button) findViewById(R.id.btnOpenNextActivity);
     //   btnOpenNextActivity.setOnClickListener(new View.OnClickListener());


        btnOpenNextActivity = (Button) findViewById(R.id.btnOpenNextActivity);
        btnOpenNextActivity.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                  onBackPressed();

               // Intent startAnotherActivity = new Intent(getApplicationContext(), Main22Activity.class);
              //  startActivity(startAnotherActivity);
            }
        });




    }


}