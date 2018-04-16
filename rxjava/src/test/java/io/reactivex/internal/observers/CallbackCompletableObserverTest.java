package io.reactivex.internal.observers;

import org.junit.Test;

import io.reactivex.internal.functions.Functions;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public final class CallbackCompletableObserverTest {

    @Test
    public void emptyActionShouldReportNoCustomOnError() {
        CallbackCompletableObserver o = new CallbackCompletableObserver(Functions.EMPTY_ACTION);

        assertFalse(o.hasCustomOnError());
    }

    @Test
    public void customOnErrorShouldReportCustomOnError() {
        CallbackCompletableObserver o = new CallbackCompletableObserver(Functions.<Throwable>emptyConsumer(),
                Functions.EMPTY_ACTION);

        assertTrue(o.hasCustomOnError());
    }

}
