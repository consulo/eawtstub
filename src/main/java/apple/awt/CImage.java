/*
 * Copyright 2000-2012 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/* this is stub code written based on Apple EAWT package javadoc published at
 * http://developer.apple.com.  It makes compiling code which uses Apple EAWT
 * on non-Mac platforms possible.  The compiled stub classes should never be
 * included in the final product.
 */

package apple.awt;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.Raster;

public class CImage extends BufferedImage {
  public CImage(int width, int height, int imageType) {
    super(width, height, imageType);
  }

  public static abstract class HiDPIScaledImage extends CImage {
    public HiDPIScaledImage(int width, int height, int imageType) {
      super(width, height, imageType);
    }

    public float getScaleFactor() {
      return 1;
    }

    public java.awt.image.WritableRaster getRaster() {
      return Raster.createWritableRaster(getSampleModel(), new Point(0, 0));
    }

    protected abstract void drawIntoImage(BufferedImage image, float scale);
  }
}
