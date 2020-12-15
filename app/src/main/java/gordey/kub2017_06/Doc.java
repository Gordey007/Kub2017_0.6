package gordey.kub2017_06;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by gorde_000 on 04.10.2017.
 */

public class Doc extends AppCompatActivity implements View.OnClickListener {

    Button send;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.doc);

        send = (Button) findViewById(R.id.send);
        send.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.send:
                Toast toast = Toast.makeText(getApplicationContext(),
                        "Заявки отправлены", Toast.LENGTH_SHORT);
                toast.show();
                Intent intent1 = new Intent(this, Request.class);
                startActivity(intent1);
                break;
        }
    }
}