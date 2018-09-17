package br.com.felip.votocerto;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class TemaPoliticaSocialDH extends Fragment{

    public TemaPoliticaSocialDH() {
        //
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        ((Quiz) getActivity()).setActionBarTitle("Políticas Sociais");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//        ((Quiz) getActivity()).setActionBarTitle("Políticas Sociais");
        return inflater.inflate(R.layout.tema_politica_social_dh, container, false);
    }

}