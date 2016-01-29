package com.example.portfolio;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MyActivity extends Activity
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        addButtonListeners();
    }

    private void addButtonListeners()
    {
        addListener(R.id.super_streamer);
        addListener(R.id.build_bigger);
        addListener(R.id.capstone);
        addListener(R.id.xyz_reader);
        addListener(R.id.super_duo);

    }

    public void addListener(int viewId)
    {
        Button button = ((Button) findViewById(viewId));
        final String buttonDescription = ((String) button.getText());
        final Context context = this;
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(context, "This button will launch " + buttonDescription, Toast.LENGTH_SHORT).show();
            }
        });

    }


}
