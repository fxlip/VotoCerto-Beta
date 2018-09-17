package br.com.felip.votocerto;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class TemaSeguranca extends Fragment{

    public TemaSeguranca() {
        //
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        ((Quiz) getActivity()).setActionBarTitle("Segurança");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //((Quiz) getActivity()).setActionBarTitle("Segurança");
        return inflater.inflate(R.layout.tema_seguranca, container, false);
    }

}