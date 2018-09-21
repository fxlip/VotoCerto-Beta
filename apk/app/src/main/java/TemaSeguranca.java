package br.com.felip.votocerto;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class TemaSeguranca extends Fragment{

    public TemaSeguranca() {
        //
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
        } else {
            Toast.makeText(((Quiz) getActivity()), "seguranca instanciada", Toast.LENGTH_SHORT).show();
        }
//        Toast.makeText(((Quiz) getActivity()), "seguranca criado", Toast.LENGTH_SHORT).show();
//      ((Quiz) getActivity()).setActionBarTitle("Segurança");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.tema_seguranca, container, false);
    }

    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        onSelect();
    }

    public void onSelect() {
        Toast.makeText(((Quiz) getActivity()), "seguranca selecionado", Toast.LENGTH_SHORT).show();
    }

}