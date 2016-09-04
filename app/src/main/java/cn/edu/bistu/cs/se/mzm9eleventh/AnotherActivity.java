package cn.edu.bistu.cs.se.mzm9eleventh;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class AnotherActivity extends AppCompatActivity {

 protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);



        Button button=(Button)findViewById(R.id.buttonReturn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=getIntent();
                String login=intent.getStringExtra("login");
                Integer password=intent.getIntExtra("password", 18);
                intent.putExtra("result","登陆:"+login+" 密码"+password);
                setResult(0,intent);
                finish();
            }
        });

    }

}
