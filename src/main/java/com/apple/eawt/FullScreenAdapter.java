package com.apple.eawt;

import com.apple.eawt.event.FullScreenEvent;

/**
 * @author Dennis.Ushakov
 */
public abstract class FullScreenAdapter implements FullScreenListener {
  public FullScreenAdapter() { /* compiled code */ }

  public void windowEnteringFullScreen(FullScreenEvent event) { }

  public void windowEnteredFullScreen(FullScreenEvent event) { }

  public void windowExitingFullScreen(FullScreenEvent event) { }

  public void windowExitedFullScreen(FullScreenEvent event) { }
}
