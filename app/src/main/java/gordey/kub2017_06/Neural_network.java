package gordey.kub2017_06;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * Created by gorde_000 on 25.10.2017.
 */

public class Neural_network extends AppCompatActivity implements View.OnClickListener {

   // TextView textView;
   // SeekBar seekBar;

    Button send;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.neural);

        send = (Button) findViewById(R.id.send);
        send.setOnClickListener(this);

      /*seekBar = (SeekBar) findViewById(R.id.seekBar);
        textView = (TextView) findViewById(R.id.status);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                textView.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });*/

        Spinner type_of_symptoms = (Spinner) findViewById(R.id.type_of_symptoms);
        type_of_symptoms.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

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

        Spinner symptoms = (Spinner) findViewById(R.id.symptoms);
        symptoms.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

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
            case R.id.send:
                AlertDialog.Builder builder = new AlertDialog.Builder(Neural_network.this);
                builder.setTitle("Заявка обработана!")
                        .setMessage("предполагаемый заболевания: грипп, бронхит, пневмония.")
                        .setCancelable(false)
                        .setNegativeButton("Ок",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();

                break;

        }

    }
}
