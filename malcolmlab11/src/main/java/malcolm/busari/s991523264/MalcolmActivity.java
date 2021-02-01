/*
Malcolm Busari s991523264
This is assignment 1 to demonstrate how the use of activities
and third-party apps
 */
package malcolm.busari.s991523264;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MalcolmActivity extends AppCompatActivity {

    ConstraintLayout constraintLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        constraintLayout = findViewById(R.id.constraintLayout);
        constraintLayout.setBackgroundColor(Color.rgb(153, 255, 255));
    }

    public void callIntent (View view){
        Intent intent = null;

        switch(view.getId()) {
            case R.id.btnToast:
                Context context = getApplicationContext();
                CharSequence text = "Malcolm Busari. Sheridan College";
                int duration = Toast.LENGTH_LONG;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

                intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.sheridancollege.ca/"));
                startActivity(intent);
                break;
            case R.id.btnSnackbar:
                Snackbar.make(view, "Malcolm Busari 2nd Activity", Snackbar.LENGTH_SHORT)
                        .setAction("Action", null).show();
                intent = new Intent(this, BusariActivity.class);
                startActivity(intent);
            default:
                break;
        }
        }
    }