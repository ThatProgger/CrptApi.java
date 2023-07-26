package limit;

import java.util.concurrent.TimeUnit;

/**
 * @author Mikhail Dedyukhin
 * @since  1.0
 */
public interface Limit {

    /**
     * Sets the basic settins
     * @param timeUnit must not be null
     * @param requestLimit must be greater than zero
     */
    public void setLimit (TimeUnit timeUnit, int requestLimit);
}
