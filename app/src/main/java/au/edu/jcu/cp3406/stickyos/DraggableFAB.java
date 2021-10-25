package au.edu.jcu.cp3406.stickyos;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class DraggableFAB extends FloatingActionButton implements View.OnTouchListener {

    private final static float DRAG_TOLERANCE = 10;

    private float downInputX, downInputY;
    private float dX, dY;

    public DraggableFAB(Context context){
        super(context);
        init();
    }

    public DraggableFAB(Context context, AttributeSet attrs){
        super(context, attrs);
        init();
    }

    public DraggableFAB(Context context, AttributeSet attrs, int defStyleAttr){
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init(){
        setOnTouchListener(this);
    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {

        ViewGroup.MarginLayoutParams layoutParams = (ViewGroup.MarginLayoutParams)view.getLayoutParams();

        int action = motionEvent.getAction();
        if (action == MotionEvent.ACTION_DOWN){

            downInputX = motionEvent.getRawX();

        }

        return false;
    }
}
