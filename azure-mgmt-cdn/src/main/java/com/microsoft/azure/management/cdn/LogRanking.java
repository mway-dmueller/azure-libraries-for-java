/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for LogRanking.
 */
public final class LogRanking extends ExpandableStringEnum<LogRanking> {
    /** Static value url for LogRanking. */
    public static final LogRanking URL = fromString("url");

    /** Static value referrer for LogRanking. */
    public static final LogRanking REFERRER = fromString("referrer");

    /** Static value browser for LogRanking. */
    public static final LogRanking BROWSER = fromString("browser");

    /** Static value userAgent for LogRanking. */
    public static final LogRanking USER_AGENT = fromString("userAgent");

    /** Static value countryOrRegion for LogRanking. */
    public static final LogRanking COUNTRY_OR_REGION = fromString("countryOrRegion");

    /**
     * Creates or finds a LogRanking from its string representation.
     * @param name a name to look for
     * @return the corresponding LogRanking
     */
    @JsonCreator
    public static LogRanking fromString(String name) {
        return fromString(name, LogRanking.class);
    }

    /**
     * @return known LogRanking values
     */
    public static Collection<LogRanking> values() {
        return values(LogRanking.class);
    }
}
