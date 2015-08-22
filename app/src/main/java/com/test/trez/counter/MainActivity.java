package com.test.trez.counter;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.app.Activity;
import android.graphics.Color;

public class MainActivity extends Activity implements OnClickListener {

    Button btn1;
    Button btn2;
    Button btn3;

    EditText scoreText;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button)findViewById(R.id.add);
        btn2 = (Button)findViewById(R.id.retract);
        btn3 = (Button)findViewById(R.id.reset);
        scoreText = (EditText)findViewById(R.id.count);
        // textTitle = (TextView)findViewById(R.id.myTextTitle);

        //---set on click listeners on the buttons-----
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);

        // change font size of the text
        //textTitle.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24);
    }

    @Override
    public void onClick(View v) {
        if (v == btn1){
            counter++;
            scoreText.setText(Integer.toString(counter));
            //scoreText.setBackgroundColor(Color.CYAN);
        }
        if (v == btn2){
            counter--;
            scoreText.setText(Integer.toString(counter));
            //scoreText.setBackgroundColor(Color.GREEN);
        }

        if (v == btn3){
            counter = 0;
            scoreText.setText(Integer.toString(counter));
            //coreText.setBackgroundColor(Color.RED);
        }
    }

}
//- See more at: http://simpledeveloper.com/how-to-build-simple-counter-android-app/#sthash.vdHPb84i.dpuf



/**public class MainActivity extends Activity
{
    Button add;
    Button sub;

    int counter;
    TextView display;

    @Override
    public void onCreate(Bundle a)
    {
        super.onCreate(a);
        setContentView(R.layout.activity_main);
        add=(Button)findViewById(R.id.add);
        sub=(Button)findViewById(R.id.retract);
        display=(TextView)findViewById(R.id.count);
        counter=0;
        add.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                // TODO Auto-generated method stub
                counter++;
                display.setText(+counter);
            }
        });

        sub.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                // TODO Auto-generated method stub
                counter--;
                display.setText(+counter);
            }
        });
    }
}*/

/**public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}*/
