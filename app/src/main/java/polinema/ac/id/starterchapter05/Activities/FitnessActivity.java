package polinema.ac.id.starterchapter05.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import polinema.ac.id.starterchapter05.Fragment.DipsFragment;
import polinema.ac.id.starterchapter05.Fragment.HandstandFragment;
import polinema.ac.id.starterchapter05.Fragment.PushupFragment;
import polinema.ac.id.starterchapter05.R;

public class FitnessActivity extends AppCompatActivity {

    private static final String Handstand_TAG = "HANDSTAND_FRAGMENT";
    private static final String Pushup_TAG = "PUSHUP_FRAGMENT";
    private static final String Dips_TAG = "Dips_FRAGMENT";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fitness);

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout,new PushupFragment());
        fragmentTransaction.commit();
    }

    public void handlerClickHandstandFragment(View view) {
        Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.frameLayout);

        if (fragment == null || fragment instanceof PushupFragment || fragment instanceof DipsFragment) {
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.setCustomAnimations(R.anim.enter_from_left, R.anim.exit_from_left);
            fragmentTransaction.replace(R.id.frameLayout, new HandstandFragment(), "HANDSTAND_FRAGMENT");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public void handlerClickPushupFragment(View view) {
        Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.frameLayout);

        if (fragment == null || fragment instanceof HandstandFragment || fragment instanceof DipsFragment) {
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.setCustomAnimations(R.anim.enter_from_left, R.anim.exit_from_left);
            fragmentTransaction.replace(R.id.frameLayout, new PushupFragment(), "PUSHUP_FRAGMENT");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public void handlerClickDipsFragment(View view) {
        Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.frameLayout);

        if (fragment == null || fragment instanceof PushupFragment || fragment instanceof HandstandFragment) {
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.setCustomAnimations(R.anim.enter_from_left, R.anim.exit_from_left);
            fragmentTransaction.replace(R.id.frameLayout, new DipsFragment(), "DIPS_FRAGMENT");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

}
