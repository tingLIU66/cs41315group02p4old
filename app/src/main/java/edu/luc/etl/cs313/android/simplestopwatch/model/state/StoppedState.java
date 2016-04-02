package edu.luc.etl.cs313.android.simplestopwatch.model.state;

import edu.luc.etl.cs313.android.simplestopwatch.R;

class StoppedState implements SimpleTimerState {

    public StoppedState(final SimpleTimerSMStateView sm) {
        this.sm = sm;
    }

    private final SimpleTimerSMStateView sm;

    @Override
    public void onIncrement() {
        sm.updateUIRuntime();
        sm.getValue();
        //if equals 99, beep() and go to running state;
        // else get current time and if 3 seconds go by, go to running state;
        sm.buttonChgToCancel();
    }

    @Override
    public int getId() {
        return R.string.STOPPED;
    }


}