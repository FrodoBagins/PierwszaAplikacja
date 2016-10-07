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

public class Main22Activity extends Activity {

    Button button1;
    String text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main22);
        addListenerOnButton();


    }

  /*  public void sendMessage(View view){
        Intent intent = new Intent(this, Main2Activity.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        //startActivity(intent);

    }  */

    public void addListenerOnButton() {

        button1 = (Button) findViewById(R.id.buttoncalculate);
        button1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                EditText editText = (EditText)findViewById(R.id.editText1);
                String text = editText.getText().toString();

                Intent myIntent = new Intent(view.getContext(),Main2Activity.class);
                myIntent.putExtra("mytext",text);
                startActivity(myIntent);


            }
        });


        }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;

    }

}