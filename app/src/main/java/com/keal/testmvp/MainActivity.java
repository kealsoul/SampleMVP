package com.keal.testmvp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends Activity implements LoginView {
    @BindView(R.id.edit1)
    EditText editText1;
    @BindView(R.id.edit2)
    EditText editText2;
    @BindView(R.id.button)
    Button button;

    LoginPersenter loginPersenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loginPersenter = new LoginPersnterImpl(this);
        ButterKnife.bind(this);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginPersenter.v(editText1.getText().toString(),editText2.getText().toString());
            }
        });
    }

    @Override
    public void success() {
        Toast.makeText(this,"成功",Toast.LENGTH_SHORT).show();

    }

    @Override
    public void error() {
        Toast.makeText(this,"失败",Toast.LENGTH_SHORT).show();
    }
}
