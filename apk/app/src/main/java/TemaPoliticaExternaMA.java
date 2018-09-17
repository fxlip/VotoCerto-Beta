package br.com.felip.votocerto;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class TemaPoliticaExternaMA extends Fragment{

    public TemaPoliticaExternaMA() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        ((Quiz) getActivity()).setActionBarTitle("Meio Ambiente");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.tema_politica_externa_ma, container, false);
    }

}