/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.azure.management.resources;

import com.azure.core.http.rest.PagedIterable;
import com.azure.management.RestClient;
import com.azure.management.resources.core.TestBase;
import com.azure.management.resources.implementation.ResourceManager;
import org.junit.Assert;
import org.junit.Test;

public class TenantsTests extends TestBase {
    protected static ResourceManager.Authenticated resourceManager;

    @Override
    protected void initializeClients(RestClient restClient, String defaultSubscription, String domain) {
        resourceManager = ResourceManager
                .authenticate(restClient);
    }

    @Override
    protected void cleanUpResources() {

    }

    @Test
    public void canListTenants() throws Exception {
        PagedIterable<TenantIdDescription> tenants = resourceManager.tenants().list();
        // FIXME:
        // Assert.assertTrue(tenants.size() > 0);
    }
}
