---
title: XpsLinearGradientBrush
second_title: Aspose.Page for Java API Reference
description: Class incapsulating LinearGradientBrush property element features.
type: docs
weight: 34
url: /java/com.aspose.xps/xpslineargradientbrush/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsBrush](../../com.aspose.xps/xpsbrush), [com.aspose.xps.XpsTransformableBrush](../../com.aspose.xps/xpstransformablebrush), [com.aspose.xps.XpsGradientBrush](../../com.aspose.xps/xpsgradientbrush)
```
public final class XpsLinearGradientBrush extends XpsGradientBrush
```

Class incapsulating LinearGradientBrush property element features. This element is used to specify a linear gradient brush along a vector.
## Methods

| Method | Description |
| --- | --- |
| [deepClone()](#deepClone--) | Clones this linear gradient brush. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getColorInterpolationMode()](#getColorInterpolationMode--) | Returns value specifying the gamma function for color interpolation. |
| [getEndPoint()](#getEndPoint--) | Returns the end point of the linear gradient. |
| [getGradientStops()](#getGradientStops--) | Returns list of gradient stops that comprise the gradient. |
| [getOpacity()](#getOpacity--) | Returns value defining the uniform transparency of the brush fill. |
| [getSpreadMethod()](#getSpreadMethod--) | Returns value describing how the brush should fill the content area outside of the primary, initial gradient area. |
| [getStartPoint()](#getStartPoint--) | Returns the starting point of the linear gradient. |
| [getTransform()](#getTransform--) | Returns the matrix transformation applied to the coordinate space of the brush. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setColorInterpolationMode(XpsColorInterpolationMode value)](#setColorInterpolationMode-com.aspose.xps.XpsColorInterpolationMode-) | Sets value specifying the gamma function for color interpolation. |
| [setEndPoint(Point2D value)](#setEndPoint-java.awt.geom.Point2D-) | Returns/sets the end point of the linear gradient. |
| [setGradientStops(List<XpsGradientStop> value)](#setGradientStops-java.util.List-com.aspose.xps.XpsGradientStop--) | Sets list of gradient stops that comprise the gradient. |
| [setOpacity(float value)](#setOpacity-float-) | Sets value defining the uniform transparency of the brush fill. |
| [setSpreadMethod(XpsSpreadMethod value)](#setSpreadMethod-com.aspose.xps.XpsSpreadMethod-) | Sets value describing how the brush should fill the content area outside of the primary, initial gradient area. |
| [setStartPoint(Point2D value)](#setStartPoint-java.awt.geom.Point2D-) | Sets the starting point of the linear gradient. |
| [setTransform(XpsMatrix value)](#setTransform-com.aspose.xps.XpsMatrix-) | Sets the matrix transformation applied to the coordinate space of the brush. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsLinearGradientBrush deepClone()
```


Clones this linear gradient brush.

**Returns:**
[XpsLinearGradientBrush](../../com.aspose.xps/xpslineargradientbrush) - Clone of this linear gradient brush.
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
### getColorInterpolationMode() {#getColorInterpolationMode--}
```
public XpsColorInterpolationMode getColorInterpolationMode()
```


Returns value specifying the gamma function for color interpolation. The gamma adjustment should not be applied to the alpha component, if specified.

**Returns:**
[XpsColorInterpolationMode](../../com.aspose.xps/xpscolorinterpolationmode) - Value specifying the gamma function for color interpolation.
### getEndPoint() {#getEndPoint--}
```
public Point2D getEndPoint()
```


Returns the end point of the linear gradient.

**Returns:**
java.awt.geom.Point2D - The end point of the linear gradient.
### getGradientStops() {#getGradientStops--}
```
public List<XpsGradientStop> getGradientStops()
```


Returns list of gradient stops that comprise the gradient.

**Returns:**
java.util.List<com.aspose.xps.XpsGradientStop> - List of gradient stops that comprise the gradient.
### getOpacity() {#getOpacity--}
```
public float getOpacity()
```


Returns value defining the uniform transparency of the brush fill.

**Returns:**
float - Value defining the uniform transparency of the brush fill.
### getSpreadMethod() {#getSpreadMethod--}
```
public XpsSpreadMethod getSpreadMethod()
```


Returns value describing how the brush should fill the content area outside of the primary, initial gradient area.

**Returns:**
[XpsSpreadMethod](../../com.aspose.xps/xpsspreadmethod) - Value describing how the brush should fill the content area outside of the primary, initial gradient area.
### getStartPoint() {#getStartPoint--}
```
public Point2D getStartPoint()
```


Returns the starting point of the linear gradient.

**Returns:**
java.awt.geom.Point2D - The starting point of the linear gradient.
### getTransform() {#getTransform--}
```
public XpsMatrix getTransform()
```


Returns the matrix transformation applied to the coordinate space of the brush. The Transform property is concatenated with the current effective render transform to yield an effective render transform local to the brush. The viewport for the brush is transformed using the local effective render transform.

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - The matrix transformation applied to the coordinate space of the brush.
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




### setColorInterpolationMode(XpsColorInterpolationMode value) {#setColorInterpolationMode-com.aspose.xps.XpsColorInterpolationMode-}
```
public void setColorInterpolationMode(XpsColorInterpolationMode value)
```


Sets value specifying the gamma function for color interpolation. The gamma adjustment should not be applied to the alpha component, if specified.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [XpsColorInterpolationMode](../../com.aspose.xps/xpscolorinterpolationmode) | Value specifying the gamma function for color interpolation. |

### setEndPoint(Point2D value) {#setEndPoint-java.awt.geom.Point2D-}
```
public void setEndPoint(Point2D value)
```


Returns/sets the end point of the linear gradient.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.awt.geom.Point2D | The end point of the linear gradient. |

### setGradientStops(List<XpsGradientStop> value) {#setGradientStops-java.util.List-com.aspose.xps.XpsGradientStop--}
```
public void setGradientStops(List<XpsGradientStop> value)
```


Sets list of gradient stops that comprise the gradient.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.util.List<com.aspose.xps.XpsGradientStop> | List of gradient stops that comprise the gradient. |

### setOpacity(float value) {#setOpacity-float-}
```
public void setOpacity(float value)
```


Sets value defining the uniform transparency of the brush fill.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | float | Value defining the uniform transparency of the brush fill. |

### setSpreadMethod(XpsSpreadMethod value) {#setSpreadMethod-com.aspose.xps.XpsSpreadMethod-}
```
public void setSpreadMethod(XpsSpreadMethod value)
```


Sets value describing how the brush should fill the content area outside of the primary, initial gradient area.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [XpsSpreadMethod](../../com.aspose.xps/xpsspreadmethod) | Value describing how the brush should fill the content area outside of the primary, initial gradient area. |

### setStartPoint(Point2D value) {#setStartPoint-java.awt.geom.Point2D-}
```
public void setStartPoint(Point2D value)
```


Sets the starting point of the linear gradient.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.awt.geom.Point2D | The starting point of the linear gradient. |

### setTransform(XpsMatrix value) {#setTransform-com.aspose.xps.XpsMatrix-}
```
public void setTransform(XpsMatrix value)
```


Sets the matrix transformation applied to the coordinate space of the brush. The Transform property is concatenated with the current effective render transform to yield an effective render transform local to the brush. The viewport for the brush is transformed using the local effective render transform.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | The matrix transformation applied to the coordinate space of the brush. |

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

