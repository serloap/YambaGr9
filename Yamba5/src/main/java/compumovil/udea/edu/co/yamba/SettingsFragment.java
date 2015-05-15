package compumovil.udea.edu.co.yamba;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;
import android.text.TextUtils;

import com.marakana.android.yamba.clientlib.YambaClient;
import com.marakana.android.yamba.clientlib.YambaClientException;

public class SettingsFragment extends PreferenceFragment implements
        OnSharedPreferenceChangeListener { //
    private SharedPreferences prefs;

    @Override
    public void onCreate(Bundle savedInstanceState) { //
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.settings); //
    }
    @Override
    public void onStart() {
        super.onStart();
        prefs = PreferenceManager.getDefaultSharedPreferences(getActivity());
        prefs.registerOnSharedPreferenceChangeListener(this);
    }

    @Override
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String key) {
        
    }




}