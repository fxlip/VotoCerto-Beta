package br.com.felip.votocerto;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class TemaEducacaoSaude extends Fragment{

    public TemaEducacaoSaude() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        ((Quiz) getActivity()).setActionBarTitle("Educacao e Saude");
        return inflater.inflate(R.layout.tema_educacao_saude, container, false);
    }
}