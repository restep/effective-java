package com.effective.ch02;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author restep
 * @date 2019/1/20
 */
public class Services {
    private Services() {

    }

    private static final Map<String, Provider> providerMap = new ConcurrentHashMap<>();

    public static final String DEFAULT_PROVIDER_NAME = "<def>";

    public static void registerDefaultProvider(Provider provider) {
        providerMap.put(DEFAULT_PROVIDER_NAME, provider);
    }

    public static Service newInstance() {
        Provider provider = providerMap.get(DEFAULT_PROVIDER_NAME);
        if (null == provider) {
            throw new IllegalArgumentException("No provider registered with name: " + DEFAULT_PROVIDER_NAME);
        }

        return provider.newService();
    }
}
