package com.optimize.performance.tasks;

import com.facebook.stetho.Stetho;
import com.optimize.performance.launchstarter.task.Task;

/**
 * 异步的Task
 */
public class InitStethoTask extends Task {

    @Override
    public void run() {

        Stetho.initializeWithDefaults(mContext);
    }
}
