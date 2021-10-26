package au.edu.jcu.cp3406.stickyos;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class DraggableFAB extends FloatingActionButton implements View.OnTouchListener {

    private final static float DRAG_TOLERANCE = 10;

    private float downInputX, downInputY;
    private float dX, dY;
    private Intent intent;

    public DraggableFAB(Context context) {
        super(context);
        init();
    }

    public DraggableFAB(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public DraggableFAB(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        setOnTouchListener(this);
    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {

        ViewGroup.MarginLayoutParams layoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();

        int action = motionEvent.getAction();
        if (action == MotionEvent.ACTION_DOWN) {

            downInputX = motionEvent.getRawX();
            downInputY = motionEvent.getRawY();
            dX = view.getX() - downInputX;
            dY = view.getY() - downInputY;

            return true;

        } else if (action == MotionEvent.ACTION_MOVE) {

            int viewWidth = view.getWidth();
            int viewHeight = view.getHeight();

            View viewParent = (View) view.getParent();
            int parentWidth = viewParent.getWidth();
            int parentHeight = viewParent.getHeight();

            // Stop the FAB from going outside the layout
            float newX = motionEvent.getRawX() + dX;
            newX = Math.max(layoutParams.leftMargin, newX);
            newX = Math.min(parentHeight - viewHeight - layoutParams.rightMargin, newX);

            float newY = motionEvent.getRawY() + dY;
            newY = Math.max(layoutParams.topMargin, newY);
            newY = Math.min(parentHeight - viewHeight - layoutParams.bottomMargin, newY);

            view.animate()
                    .x(newX)
                    .y(newY)
                    .setDuration(0)
                    .start();

            return true;
        } else if (action == MotionEvent.ACTION_UP) {

            float upRawX = motionEvent.getRawX();
            float upRawY = motionEvent.getRawY();

            float upDX = upRawX - downInputX;
            float upDY = upRawY - downInputY;

            if (Math.abs(upDX) < DRAG_TOLERANCE && Math.abs(upDY) < DRAG_TOLERANCE) {
                fabClicked();
                return false;
            } else {
                return true;
            }
        } else {
            return super.onTouchEvent(motionEvent);
        }
    }

    public void setIntent (Intent intent) {
        this.intent = intent;
    }
    public void fabClicked() {
        if (this.intent != null) {
            getContext().startActivity(this.intent);
        }
    }
}
