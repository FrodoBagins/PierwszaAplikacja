package ps9.myapplication;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends Activity {
    private Button btnOpenNewActivity;
    private Button btnOpenNextActivity;
    TextView mTextview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main2);

        btnOpenNewActivity = (Button) findViewById(R.id.btnOpenNewActivity);
        btnOpenNewActivity.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), Main22Activity.class);
                startActivityForResult(i, 1);




            }
        });




        btnOpenNextActivity = (Button) findViewById(R.id.btnOpenNextActivity);
        btnOpenNextActivity.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                  onBackPressed();

            }
        });


        mTextview = (TextView)findViewById(R.id.textView1);

        mTextview.setText(getIntent().getStringExtra("mytext"));

    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1) {
            if(resultCode == RESULT_OK){
                String stredittext=data.getStringExtra("mytext");


                mTextview.setText(stredittext);



            }
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;

    }



}