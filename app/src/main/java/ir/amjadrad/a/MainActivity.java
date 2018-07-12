package ir.amjadrad.a;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import ir.amjadrad.hapoly.HapolyToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "hi", Toast.LENGTH_SHORT).show();
        HapolyToast.makeText(this , "amjad" , Toast.LENGTH_LONG).show();
    }
}
