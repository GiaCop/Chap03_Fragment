package net.giaitri360.chap03_fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class TopFragment extends Fragment {
    private EditText editTextFirstName;
    private EditText editTextLastName;
    private Button buttonApply;

    private MainActivity mainActivity;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.activity_top,container,false);
        //View view = inflater.inflate(R.layout.activity_top, container, false);
        editTextFirstName = (EditText) view.findViewById(R.id.edtFirsName);
        editTextLastName = (EditText) view.findViewById(R.id.edtLastName);


        buttonApply = (Button) view.findViewById(R.id.btnApply);

        buttonApply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                applyText();

            }
        });
        return view;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if(context instanceof MainActivity){
            this.mainActivity=(MainActivity)context;

        }
    }

    private void applyText() {
        String firtsname=this.editTextFirstName.getText().toString();
        String lastname=this.editTextLastName.getText().toString();
        this.mainActivity.showText(firtsname,lastname);

    }


}
