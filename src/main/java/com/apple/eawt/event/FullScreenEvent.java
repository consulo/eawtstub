package com.apple.eawt.event;

import java.util.EventObject;

public class FullScreenEvent extends EventObject {
    public FullScreenEvent(java.awt.Window window) {
        super(null);
    }

    public java.awt.Window getWindow() {
        return null;
    }
}