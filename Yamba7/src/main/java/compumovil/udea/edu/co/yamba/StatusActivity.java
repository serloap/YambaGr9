package compumovil.udea.edu.co.yamba;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;

public class StatusActivity extends ActionBarActivity {

    private static final String TAG = "StatusActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_status);

        if (savedInstanceState == null) {
            StatusFragment fragment = new StatusFragment();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.add(android.R.id.content, fragment, fragment.getClass().getSimpleName());
            fragmentTransaction.commit();

        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) { //
// Inflate the menu items to the action bar.
        getMenuInflater().inflate(R.menu.menu_status, menu); //
        return true; //
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        switch (item.getItemId()) {
            case R.id.action_settings2:
                startActivity(new Intent(this, SettingsActivity.class));
                break;
            default:
                return false;
        }
        return true;
    }
}
