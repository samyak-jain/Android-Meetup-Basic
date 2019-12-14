package io.agora.tutorials1v1vcall;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startCall(View view) {
        String appId = ((EditText) findViewById(R.id.appid)).getText().toString();
        String channel = ((EditText) findViewById(R.id.channel)).getText().toString();

        Intent callIntent = new Intent(this, VideoChatViewActivity.class);
        callIntent.putExtra("APPID", appId);
        callIntent.putExtra("CHANNEL", channel);
        startActivity(callIntent);
    }
}
