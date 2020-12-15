package gordey.kub2017_06;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * Created by gorde_000 on 22.10.2017.
 */

public class Registration extends AppCompatActivity  implements View.OnClickListener{

    Button btnregg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reg);

        btnregg = (Button) findViewById(R.id.btnregg);
        btnregg.setOnClickListener(this);

        Spinner spinner = (Spinner) findViewById(R.id.sex);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int pos,
                                       long id) {
                // TODO Auto-generated method stub
                ((TextView) parent.getChildAt(0)).setTextColor(Color.BLUE);
                ((TextView) parent.getChildAt(0)).setTextSize(20);
               // ((TextView) parent.getChildAt(0)).setTextColor(getTitleColor());
                //((TextView) parent.getChildAt(0)).setPadding(20,20,20,20);
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub

            }
        });

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnregg:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
        }
    }
}
