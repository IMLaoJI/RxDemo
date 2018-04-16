package io.reactivex.internal.observers;

import org.junit.Test;

import io.reactivex.internal.functions.Functions;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public final class ConsumerSingleObserverTest {

    @Test
    public void onErrorMissingShouldReportNoCustomOnError() {
        ConsumerSingleObserver<Integer> o = new ConsumerSingleObserver<Integer>(Functions.<Integer>emptyConsumer(),
                Functions.ON_ERROR_MISSING);

        assertFalse(o.hasCustomOnError());
    }

    @Test
    public void customOnErrorShouldReportCustomOnError() {
        ConsumerSingleObserver<Integer> o = new ConsumerSingleObserver<Integer>(Functions.<Integer>emptyConsumer(),
                Functions.<Throwable>emptyConsumer());

        assertTrue(o.hasCustomOnError());
    }

}
