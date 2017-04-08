package com.project.notificationapps.rtcapps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView txtmessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txtmessage=(TextView)findViewById(R.id.txtresult);

        Bundle bundle = getIntent().getExtras();
        if(bundle!=null){
            String msg = bundle.getString("message");
            txtmessage.setText(msg);
        }
    }
}
