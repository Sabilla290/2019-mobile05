package polinema.ac.id.starterchapter05.Fragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import polinema.ac.id.starterchapter05.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PushupFragment extends Fragment {


    public PushupFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pushup, container, false);
    }

}
