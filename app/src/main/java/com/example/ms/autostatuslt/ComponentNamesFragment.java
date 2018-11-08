//package com.example.ms.autostatuslt;
//import android.app.Activity;
//import android.app.FragmentManager;
//import android.app.FragmentTransaction;
//import android.app.ListFragment;
//import android.app.Service;
//import android.content.BroadcastReceiver;
//import android.content.ContentProvider;
//import android.os.Bundle;
//
//import android.support.constraint.solver.widgets.Helper;
//import android.view.View;
//import android.widget.ArrayAdapter;
//import android.widget.ListView;
//public class ComponentNamesFragment extends ListFragment {
//    final static String[] COMPONENTS = { "Activity",
//            "Service", "BroadcastReceiver", "ContentProvider" };
//    @Override
//    public void onActivityCreated
//        (Bundle savedInstanceState) {
//        super.onActivityCreated(savedInstanceState);
//        setListAdapter(new ArrayAdapter<>(getActivity(),android.R.layout.simple_list_item_1, COMPONENTS));
//        }
//    @Override
//    public void onListItemClick(ListView l, View v,int index, long id) {
////Create fragment with index
//        DocsFragment docsFragment = new DocsFragment();
//        Bundle args = Helper.getBundleWithIndex(index);
//        docsFragment.setArguments(args);
////Clear the back stack
//        FragmentManager fragmentManager = getFragmentManager();
//        int backStackEntryCount = fragmentManager.getBackStackEntryCount();
//        for (int i = 0; i < backStackEntryCount; i++) {fragmentManager.popBackStackImmediate();
//        }
////Perform the transaction
//        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//        fragmentTransaction.replace(R.id.docs, docsFragment);
//        fragmentTransaction.addToBackStack(getTag()); //get tag?
//        fragmentTransaction.commit();
//
//        }
//
//        }