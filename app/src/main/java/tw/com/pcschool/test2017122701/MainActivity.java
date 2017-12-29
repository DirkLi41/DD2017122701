package tw.com.pcschool.test2017122701;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }

    public void click1(View v)
    {
        EditText et,et2;
        et = (EditText) findViewById(R.id.editText);
        et2 = (EditText) findViewById(R.id.editText2);
        int q = Integer.valueOf(et.getText().toString());
        int q2 = Integer.valueOf(et2.getText().toString());
        int ans = q + q2;
        TextView tv = (TextView)findViewById(R.id.textView);
        tv.setText(String.valueOf(ans));
    }

}
