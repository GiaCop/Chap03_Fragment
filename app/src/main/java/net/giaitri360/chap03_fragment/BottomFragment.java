package net.giaitri360.chap03_fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class BottomFragment extends Fragment {
    private TextView textViewFullName;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Read xml file and return View object.
        // inflate(@LayoutRes int resource, @Nullable ViewGroup root, boolean attachToRoot)
        View view = inflater.inflate(R.layout.activity_bottom, container, false);

        textViewFullName = (TextView) view.findViewById(R.id.txtFullName);

        return view;
    }

    public void showText(String firstName, String lastName) {
        textViewFullName.setText(firstName + " " + lastName);
    }
}
