package au.edu.jcu.cp3406.stickyos.ui.main;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import au.edu.jcu.cp3406.stickyos.ContactsActivityTest;
import au.edu.jcu.cp3406.stickyos.ContactsTutorial;
import au.edu.jcu.cp3406.stickyos.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link TutorialListFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TutorialListFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private int mParam1;
    private int mParam2;

    public TutorialListFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment TutorialListFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static TutorialListFragment newInstance(int param1, int param2) {
        TutorialListFragment fragment = new TutorialListFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_PARAM1, param1);
        args.putInt(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getInt(ARG_PARAM1);
            mParam2 = getArguments().getInt(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_tutorial_list, container, false);

        TextView tuteTextContacts = (TextView) rootView.findViewById(R.id.tuteTextContacts);
        TextView tuteTextCalender = (TextView) rootView.findViewById(R.id.tuteTextCalender);
        TextView tuteTextClock = (TextView) rootView.findViewById(R.id.tuteTextClock);

        tuteTextContacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent contactsIntent = new Intent(getActivity(), ContactsTutorial.class);
                contactsIntent.putExtra("TutorialTrigger", 1);
                startActivity(contactsIntent);
            }
        });

/**        tuteTextCalender.setOnClickListener(new View.OnClickListener() {
@Override public void onClick(View view) {
Intent calenderIntent = new Intent(getActivity(), ContactsActivityTest.class);
calenderIntent.putExtra("TutorialTrigger", 1);
startActivity(calenderIntent);
}
});

 tuteTextClock.setOnClickListener(new View.OnClickListener() {
@Override public void onClick(View view) {
Intent clockIntent = new Intent(getActivity(), ContactsActivityTest.class);
clockIntent.putExtra("TutorialTrigger", 1);
startActivity(clockIntent);
}
});
 */

        return rootView;
    }


}