package it.jaschke.alexandria.ScanBarcode;

import android.content.Intent;
import android.support.v4.app.Fragment;

/**
 * Created by sudarsan on 10/12/15.
 */
public class FragmentIntentIntegrator extends IntentIntegrator {
    private final Fragment fragment;

    public FragmentIntentIntegrator(Fragment fragment){
        super(fragment.getActivity());
        this.fragment = fragment;
    }

    @Override
    protected void startActivityForResult(Intent intent, int code){
        fragment.startActivityForResult(intent, code);
    }
}
