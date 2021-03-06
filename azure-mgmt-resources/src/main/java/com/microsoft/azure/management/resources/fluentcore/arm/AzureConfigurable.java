/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.resources.fluentcore.arm;

import com.microsoft.azure.credentials.AzureTokenCredentials;
import com.microsoft.rest.LogLevel;
import okhttp3.Authenticator;
import okhttp3.ConnectionPool;
import okhttp3.Dispatcher;
import okhttp3.Interceptor;
import okhttp3.Protocol;

import java.net.Proxy;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/**
 * The base interface for allowing configurations to be made on the HTTP client.
 *
 * @param <T> the actual type of the interface extending this interface
 */
public interface AzureConfigurable<T extends AzureConfigurable<T>> {
    /**
     * Set the logging level on the HTTP client.
     *
     * @param level the OkHttp logging level
     * @return the configurable object itself
     */
    T withLogLevel(LogLevel level);

    /**
     * Plug in an interceptor into the HTTP pipeline.
     *
     * @param interceptor the interceptor to plug in
     * @return the configurable object itself
     */
    T withInterceptor(Interceptor interceptor);

    /**
     * Set the cross-tenant auxiliary credentials for Azure which can hold up to three.
     *
     * @param tokens the AzureTokenCredentials list
     * @return the configurable object itself
     */
    T withAuxiliaryCredentials(AzureTokenCredentials... tokens);

    /**
     * Specify the user agent header.
     *
     * @param userAgent the user agent to use
     * @return the configurable object itself
     */
    T withUserAgent(String userAgent);

    /**
     * Set the read timeout on the HTTP client. Default is 10 seconds.
     *
     * @param timeout the timeout numeric value
     * @param unit the time unit for the numeric value
     * @return the configurable object itself for chaining
     */
    T withReadTimeout(long timeout, TimeUnit unit);

    /**
     * Set the connection timeout on the HTTP client. Default is 10 seconds.
     *
     * @param timeout the timeout numeric value
     * @param unit the time unit for the numeric value
     * @return the configurable object itself for chaining
     */
    T withConnectionTimeout(long timeout, TimeUnit unit);

    /**
     * Set the maximum idle connections for the HTTP client. Default is 5.
     *
     * @param maxIdleConnections the maximum idle connections
     * @return the configurable object itself for chaining
     * @deprecated use {@link #withConnectionPool(ConnectionPool)} instead
     */
    @Deprecated
    T withMaxIdleConnections(int maxIdleConnections);

    /**
     * Sets the connection pool for the Http client.
     * @param connectionPool the OkHttp 3 connection pool to use
     * @return the configurable object itself for chaining
     */
    T withConnectionPool(ConnectionPool connectionPool);

    /**
     * Sets whether to use the thread pool in OkHttp client or RxJava schedulers.
     * If set to true, the thread pool in OkHttp client will be used. Default is false.
     * @param useHttpClientThreadPool whether to use the thread pool in Okhttp client. Default is false.
     * @return the configurable object itself for chaining
     */
    T useHttpClientThreadPool(boolean useHttpClientThreadPool);

    /**
     * Sets the dispatcher used in OkHttp client. This is also where to set
     * the thread pool for executing HTTP requests.
     * @param dispatcher the dispatcher to use
     * @return the configurable object itself for chaining
     */
    T withDispatcher(Dispatcher dispatcher);

    /**
     * Sets the executor for async callbacks to run on.
     *
     * @param executor the executor to execute the callbacks.
     * @return the configurable object itself for chaining
     */
    T withCallbackExecutor(Executor executor);

    /**
     * Sets the proxy for the HTTP client.
     *
     * @param proxy the proxy to use
     * @return the configurable object itself for chaining
     */
    T withProxy(Proxy proxy);

    /**
     * Sets the proxy authenticator for the HTTP client.
     *
     * @param proxyAuthenticator the proxy authenticator to use
     * @return the configurable object itself for chaining
     */
    T withProxyAuthenticator(Authenticator proxyAuthenticator);

    /**
     * Sets the HTTP network protocols for HTTP client.
     * <p>
     * HTTP2 multiplexing could result in a single TCP connection to ARM instance.
     * It could cause an undesirable side-effect that ARM throttling happens earlier than with HTTP1.1 with a connection pool.
     *
     * @param protocols the HTTP network protocols to use
     * @return the configurable object itself for chaining
     */
    T withProtocols(List<Protocol> protocols);
}
