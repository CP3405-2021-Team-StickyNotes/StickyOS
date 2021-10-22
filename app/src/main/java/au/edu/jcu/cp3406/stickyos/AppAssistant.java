package au.edu.jcu.cp3406.stickyos;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class AppAssistant extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_assistant);

        setupTabs();
    }

    private void setupTabs() {
        val adapter = TabAdapter(supportFragmentManager);
        pager.adapter = adapter;
        tabs.setupWithViewPager(pager);
    }
}

public final class TabAdapter extends FragmentStatePagerAdapter {
    public int getCount() {
        return 4;
    }

    public Fragment getItem(int i) {
        return (Fragment)(new TabFragment());
    }

    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return (CharSequence)"Business";
        } else if (position == 1) {
            return (CharSequence)"Politics";
        } else {
            return position == 2 ? (CharSequence)"Education" : (CharSequence)"Lifestyle";
        }
    }

    public TabAdapter(FragmentManager fm) {
        Intrinsics.checkParameterIsNotNull(fm, "fm");
        super(fm, 1);
    }
}
