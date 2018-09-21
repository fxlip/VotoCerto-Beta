package br.com.felip.votocerto;

import android.graphics.ImageDecoder;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.Arrays;

public class TemaEducacaoSaude extends Fragment{

    public TemaEducacaoSaude() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
        } else {
            Toast.makeText(((Quiz) getActivity()), "educacao instanciada", Toast.LENGTH_SHORT).show();
        }
//        Toast.makeText(((Quiz) getActivity()), "educacao criado", Toast.LENGTH_SHORT).show();
//        ((Quiz) getActivity()).setActionBarTitle("Educacao e Saude");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        FragmentStatePagerAdapter pa = getFragmentManager().beginTransaction().detach(container
        return inflater.inflate(R.layout.tema_educacao_saude, container, false);
    }

    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        onSelect();
    }

    public void onSelect() {
        Toast.makeText(((Quiz) getActivity()), "educacao selecionado", Toast.LENGTH_SHORT).show();
    }
}