package ps9.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.Menu;
import android.widget.EditText;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.view.inputmethod.InputMethodManager;
import android.content.Context;
import android.widget.CheckBox;
import android.widget.Toast;
import android.util.ArrayMap;

public class Main22Activity extends Activity {
    private Button btnOpenNextActivity;




    Button button1;
    String text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main22);

        addListenerOnButton();

        btnOpenNextActivity = (Button) findViewById(R.id.btnOpenNextActivity);
        btnOpenNextActivity.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                onBackPressed();

            }
        });




    }



    public void addListenerOnButton() {

        button1 = (Button) findViewById(R.id.buttoncalculate);
        button1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                InputMethodManager inputManager = (InputMethodManager)
                        getSystemService(Context.INPUT_METHOD_SERVICE);

                inputManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(),
                        InputMethodManager.HIDE_NOT_ALWAYS);


                EditText editText = (EditText)findViewById(R.id.editText1);
                String text = editText.getText().toString();

                Intent intent = new Intent();
                intent.putExtra("mytext",text);
                setResult(RESULT_OK, intent);

               // finish();


            }
        });



    }





}