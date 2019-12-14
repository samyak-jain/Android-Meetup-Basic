package io.agora.tutorials1v1vcall;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class VideoChatViewActivity extends AppCompatActivity {
    private static final String TAG = VideoChatViewActivity.class.getSimpleName();

    private static final int PERMISSION_REQ_ID = 22;
    private String APPID;
    private String channelName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_chat_view);

        Intent intent = getIntent();
        APPID = intent.getStringExtra("APPID");
        channelName = intent.getStringExtra("CHANNEL");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
