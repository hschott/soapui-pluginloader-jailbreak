package com.eviware.soapui.plugins;

import java.io.File;
import java.security.Provider;

public final class ProductBodyguard extends Provider {

    public ProductBodyguard() {
        super("SoapUIOSPluginSignBypass", 1.0, "Plugin signature validity bypass");
    }

    public final synchronized boolean isKnown(File plugin) {
        return true;
    }

}
