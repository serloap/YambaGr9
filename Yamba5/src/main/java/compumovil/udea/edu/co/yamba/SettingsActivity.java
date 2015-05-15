package compumovil.udea.edu.co.yamba;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class SettingsActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
// Check whether this activity was created before
        if (savedInstanceState == null) {
// Create a fragment
            SettingsFragment fragment = new SettingsFragment(); //
            getFragmentManager()
                    .beginTransaction()
                    .add(android.R.id.content, fragment,
                            fragment.getClass().getSimpleName())
                    .commit(); //
        }
    };
}