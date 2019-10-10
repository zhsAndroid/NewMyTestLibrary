package zhs.floatingactionbutton.mytestlibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import zhs.floatingactionbutton.FloatingActionsMenu;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.action_b).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                actionA.setTitle("Action A clicked");
                Toast.makeText(MainActivity.this, "Clicked pink Floating Action Button action_b", Toast.LENGTH_SHORT).show();
            }
        });

        findViewById(R.id.action_a).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Clicked pink Floating Action Button action_a", Toast.LENGTH_SHORT).show();
            }
        });
        findViewById(R.id.action_c).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Clicked pink Floating Action Button action_c", Toast.LENGTH_SHORT).show();
            }
        });

        final FloatingActionsMenu menuMultipleActions = (FloatingActionsMenu) findViewById(R.id.multiple_actions);

    }
}
