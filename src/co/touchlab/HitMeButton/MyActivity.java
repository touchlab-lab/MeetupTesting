package co.touchlab.HitMeButton;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    public View updateText(View view){

        TextView text = ((TextView)findViewById(R.id.text));
        if(!text.getText().toString().equals(getResources().getString(R.string.ouch)))
            text.setText(getResources().getString(R.string.ouch));
        else
            text.setText("");

        return view;
    }
}
