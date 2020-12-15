package gordey.kub2017_06;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button account;
    Button app;
    Button neor;
    Button request1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        account = (Button) findViewById(R.id.account);
        account.setOnClickListener(this);

        app = (Button) findViewById(R.id.app);
        app.setOnClickListener(this);

        neor = (Button) findViewById(R.id.neor);
        neor.setOnClickListener(this);

        request1 = (Button) findViewById(R.id.request1);
        request1.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.account:
                Intent intent = new Intent(this, Account.class);
                startActivity(intent);
                break;

            case R.id.app:
                Intent intent1 = new Intent(this, App.class);
                startActivity(intent1);
                break;

            case R.id.neor:
               Intent intent2 = new Intent(this, Neural_network.class);
               startActivity(intent2);
                break;

            case R.id.request1:
                Intent intent3 = new Intent(this, Request.class);
                startActivity(intent3);
                break;
        }
    }
}
