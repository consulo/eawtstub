package com.apple.eawt;

import com.apple.eawt.event.FullScreenEvent;

/**
 * @author Dennis.Ushakov
 */
public interface FullScreenListener {
  public void windowEnteringFullScreen(FullScreenEvent event);

  public void windowEnteredFullScreen(FullScreenEvent event);

  public void windowExitingFullScreen(FullScreenEvent event);

  public void windowExitedFullScreen(FullScreenEvent event);
}
