/*
 * Copyright (C) 2009-2013 Typesafe Inc. <http://www.typesafe.com>
 */
package play.mvc;

import scala.concurrent.Future;

/**
 * A simple result.
 *
 * This exists temporarily to distinguish simple results from AsyncResults.
 */
public abstract class SimpleResult implements Result {

    @Override
    public Future<play.api.mvc.Result> getWrappedResult() {
        return scala.concurrent.Future$.MODULE$.successful(getWrappedSimpleResult());
    }

    /**
     * Get the wrapped simple result
     */
    public abstract play.api.mvc.Result getWrappedSimpleResult();
}
