---
title: XpsTilingBrush
second_title: Aspose.Page for Java API Reference
description: Class incapsulating common features of tiling brushes elements VisualBrush and ImageBrush.
type: docs
weight: 51
url: /java/com.aspose.xps/xpstilingbrush/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsBrush](../../com.aspose.xps/xpsbrush), [com.aspose.xps.XpsTransformableBrush](../../com.aspose.xps/xpstransformablebrush)
```
public abstract class XpsTilingBrush extends XpsTransformableBrush
```

Class incapsulating common features of tiling brushes elements (VisualBrush and ImageBrush).
## Methods

| Method | Description |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getOpacity()](#getOpacity--) | Returns value defining the uniform transparency of the brush fill. |
| [getTileMode()](#getTileMode--) | Returns value specifying how tiling is performed in the filled geometry. |
| [getTransform()](#getTransform--) | Returns the matrix transformation applied to the coordinate space of the brush. |
| [getViewbox()](#getViewbox--) | Returns the region of the source content of the brush that is to be mapped to the viewport. |
| [getViewport()](#getViewport--) | Returns the position and dimensions of the first brush tile. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setOpacity(float value)](#setOpacity-float-) | Sets value defining the uniform transparency of the brush fill. |
| [setTileMode(XpsTileMode value)](#setTileMode-com.aspose.xps.XpsTileMode-) | Sets value specifying how tiling is performed in the filled geometry. |
| [setTransform(XpsMatrix value)](#setTransform-com.aspose.xps.XpsMatrix-) | Sets the matrix transformation applied to the coordinate space of the brush. |
| [setViewbox(Rectangle2D value)](#setViewbox-java.awt.geom.Rectangle2D-) | Sets the region of the source content of the brush that is to be mapped to the viewport. |
| [setViewport(Rectangle2D value)](#setViewport-java.awt.geom.Rectangle2D-) | Sets the position and dimensions of the first brush tile. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getOpacity() {#getOpacity--}
```
public float getOpacity()
```


Returns value defining the uniform transparency of the brush fill.

**Returns:**
float - Value defining the uniform transparency of the brush fill.
### getTileMode() {#getTileMode--}
```
public XpsTileMode getTileMode()
```


Returns value specifying how tiling is performed in the filled geometry.

**Returns:**
[XpsTileMode](../../com.aspose.xps/xpstilemode) - Value specifying how tiling is performed in the filled geometry.
### getTransform() {#getTransform--}
```
public XpsMatrix getTransform()
```


Returns the matrix transformation applied to the coordinate space of the brush. The Transform property is concatenated with the current effective render transform to yield an effective render transform local to the brush. The viewport for the brush is transformed using the local effective render transform.

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - The matrix transformation applied to the coordinate space of the brush.
### getViewbox() {#getViewbox--}
```
public Rectangle2D getViewbox()
```


Returns the region of the source content of the brush that is to be mapped to the viewport.

**Returns:**
java.awt.geom.Rectangle2D - The region of the source content of the brush that is to be mapped to the viewport.
### getViewport() {#getViewport--}
```
public Rectangle2D getViewport()
```


Returns the position and dimensions of the first brush tile. Subsequent tiles are positioned relative to this tile, as specified by the tile mode.

**Returns:**
java.awt.geom.Rectangle2D - The position and dimensions of the first brush tile.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setOpacity(float value) {#setOpacity-float-}
```
public void setOpacity(float value)
```


Sets value defining the uniform transparency of the brush fill.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | float | Value defining the uniform transparency of the brush fill. |

### setTileMode(XpsTileMode value) {#setTileMode-com.aspose.xps.XpsTileMode-}
```
public void setTileMode(XpsTileMode value)
```


Sets value specifying how tiling is performed in the filled geometry.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [XpsTileMode](../../com.aspose.xps/xpstilemode) | Value specifying how tiling is performed in the filled geometry. |

### setTransform(XpsMatrix value) {#setTransform-com.aspose.xps.XpsMatrix-}
```
public void setTransform(XpsMatrix value)
```


Sets the matrix transformation applied to the coordinate space of the brush. The Transform property is concatenated with the current effective render transform to yield an effective render transform local to the brush. The viewport for the brush is transformed using the local effective render transform.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | The matrix transformation applied to the coordinate space of the brush. |

### setViewbox(Rectangle2D value) {#setViewbox-java.awt.geom.Rectangle2D-}
```
public void setViewbox(Rectangle2D value)
```


Sets the region of the source content of the brush that is to be mapped to the viewport.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.awt.geom.Rectangle2D | The region of the source content of the brush that is to be mapped to the viewport. |

### setViewport(Rectangle2D value) {#setViewport-java.awt.geom.Rectangle2D-}
```
public void setViewport(Rectangle2D value)
```


Sets the position and dimensions of the first brush tile. Subsequent tiles are positioned relative to this tile, as specified by the tile mode.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.awt.geom.Rectangle2D | The position and dimensions of the first brush tile. |

### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final native void wait(long arg0)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

