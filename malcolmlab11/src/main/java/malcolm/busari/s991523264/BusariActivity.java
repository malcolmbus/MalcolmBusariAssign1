/*
Malcolm Busari s991523264
This is assignment 1 to demonstrate how the use of activities
and third-party apps
 */
package malcolm.busari.s991523264;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class BusariActivity extends AppCompatActivity {
    ConstraintLayout constraintLayout2;
    TextView receivedInput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busari);
        constraintLayout2 = findViewById(R.id.constraintLayout2);
        constraintLayout2.setBackgroundColor(Color.rgb(255,255,224));
        receivedInput = (TextView)findViewById(R.id.receivedInputTxt);
        Intent intent = getIntent();
        String str = intent.getStringExtra("sendInput");
        receivedInput.setText(str);
    }

}