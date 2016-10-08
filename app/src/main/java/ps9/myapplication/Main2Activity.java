package ps9.myapplication;

import android.app.Activity;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
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

        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;

    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.forward:

                onBackPressed();
                return true;

            case R.id.action_refresh:

                startActivity(new Intent(Main2Activity.this,Pop.class));


                return true;


            case R.id.item1:
                ImageView mImageView;
                mImageView = (ImageView) findViewById(R.id.android);
                mImageView.setImageResource(R.drawable.android);


                return true;

            case R.id.item2:
                btnOpenNextActivity = (Button) findViewById(R.id.btnOpenNextActivity);

                btnOpenNextActivity.setBackgroundColor(Color.parseColor("#ff0000"));

                btnOpenNewActivity = (Button) findViewById(R.id.btnOpenNewActivity);

                btnOpenNewActivity.setBackgroundColor(Color.parseColor("#009999"));

                return true;

            default:
                // If we got here, the user's action was not recognized.
                // Invoke the superclass to handle it.
                return super.onOptionsItemSelected(item);

        }
    }


}