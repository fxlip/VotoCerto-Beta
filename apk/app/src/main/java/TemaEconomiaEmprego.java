package br.com.felip.votocerto;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class TemaEconomiaEmprego extends Fragment{

    public TemaEconomiaEmprego() {
        //
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ((Quiz) getActivity()).setActionBarTitle("Economia e Emprego");
        return inflater.inflate(R.layout.tema_economia_emprego, container, false);
    }

}