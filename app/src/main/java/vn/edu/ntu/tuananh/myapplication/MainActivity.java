package vn.edu.ntu.tuananh.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    TextView txtTG;
    EditText edtTen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("LifeCycle", "onCreate");
        txtTG = findViewById(R.id.txtTG);
        edtTen = findViewById(R.id.edtTen);
        SimpleDateFormat spF = new SimpleDateFormat("HH:mm:ss");
        String date = spF.format(new Date());
        txtTG.setText(date);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LifeCycle", "onStart Called");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("LifeCycle", "onRestart Called");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LifeCycle", "onResume Called");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LifeCycle", "onPause Called");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LifeCycle", "onStop Called");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LifeCycle", "onDestroy Called");
    }
}
