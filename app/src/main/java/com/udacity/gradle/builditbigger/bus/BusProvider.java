package com.udacity.gradle.builditbigger.bus;

import com.squareup.otto.Bus;
import com.squareup.otto.ThreadEnforcer;

/**
 * Created by Zark on 9/8/2017.
 *
 */

public final class BusProvider {

    private static final Bus BUS = new Bus(ThreadEnforcer.ANY); // allow use in background threads

    public static Bus getInstance() {
        return BUS;
    }

    private BusProvider() {}
}
