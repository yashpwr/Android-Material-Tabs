package com.codedecode.androidmaterialtabs.activity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.codedecode.androidmaterialtabs.R;
import com.codedecode.androidmaterialtabs.fragments.EightFragment;
import com.codedecode.androidmaterialtabs.fragments.FiveFragment;
import com.codedecode.androidmaterialtabs.fragments.FourFragment;
import com.codedecode.androidmaterialtabs.fragments.NineFragment;
import com.codedecode.androidmaterialtabs.fragments.OneFragment;
import com.codedecode.androidmaterialtabs.fragments.SevenFragment;
import com.codedecode.androidmaterialtabs.fragments.SixFragment;
import com.codedecode.androidmaterialtabs.fragments.TenFragment;
import com.codedecode.androidmaterialtabs.fragments.ThreeFragment;
import com.codedecode.androidmaterialtabs.fragments.TwoFragment;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.List;

public class ScrollableTabsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrollable_tabs);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ViewPager viewPager = findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        TabLayout tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFrag(new OneFragment(), "ONE");
        adapter.addFrag(new TwoFragment(), "TWO");
        adapter.addFrag(new ThreeFragment(), "THREE");
        adapter.addFrag(new FourFragment(), "FOUR");
        adapter.addFrag(new FiveFragment(), "FIVE");
        adapter.addFrag(new SixFragment(), "SIX");
        adapter.addFrag(new SevenFragment(), "SEVEN");
        adapter.addFrag(new EightFragment(), "EIGHT");
        adapter.addFrag(new NineFragment(), "NINE");
        adapter.addFrag(new TenFragment(), "TEN");
        viewPager.setAdapter(adapter);
    }

    static class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        ViewPagerAdapter(FragmentManager manager) {
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

        void addFrag(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }
}
