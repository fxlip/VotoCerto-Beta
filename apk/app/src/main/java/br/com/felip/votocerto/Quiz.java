package br.com.felip.votocerto;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Quiz extends AppCompatActivity {

    public Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private int[] tabIcons = {
            R.mipmap.educacao_saude_round,
            R.mipmap.seguranca_round,
            R.mipmap.politicas_soaicis_e_dh_round,
            R.mipmap.economia_emprego_round,
            R.mipmap.politica_corrupcao_round,
            R.mipmap.politica_externa_round
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Bundle extras = getIntent().getExtras();
        Integer numero = extras.getInt("partido");
        Toast.makeText(this, "Partido: "+numero, Toast.LENGTH_SHORT).show();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
        setupTabIcons();
    }

    private void setupTabIcons() {
        tabLayout.getTabAt(0).setIcon(tabIcons[0]);
        tabLayout.getTabAt(1).setIcon(tabIcons[1]);
        tabLayout.getTabAt(2).setIcon(tabIcons[2]);
        tabLayout.getTabAt(3).setIcon(tabIcons[3]);
        tabLayout.getTabAt(4).setIcon(tabIcons[4]);
        tabLayout.getTabAt(5).setIcon(tabIcons[5]);
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFrag(new br.com.felip.votocerto.TemaEducacaoSaude(), "Educação e Saúde");
        adapter.addFrag(new br.com.felip.votocerto.TemaSeguranca(), "Segurança");
        adapter.addFrag(new br.com.felip.votocerto.TemaPoliticaSocialDH(), "Políticas Sociais");
        adapter.addFrag(new br.com.felip.votocerto.TemaEconomiaEmprego(), "Economia e Emprego");
        adapter.addFrag(new br.com.felip.votocerto.TemaPoliticaCorrupcao(), "Política e Corrupção");
        adapter.addFrag(new br.com.felip.votocerto.TemaPoliticaExternaMA(), "Meio Ambiente");
        viewPager.setAdapter(adapter);
    }

    public void setActionBarTitle(String title) {
        getSupportActionBar().setTitle(title);
    }

    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFrag(Fragment fragment, String title) {
            mFragmentList.add(fragment);
//            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return null;
//            return mFragmentTitleList.get(position);
        }

    }
}