---
title: XpsRadialGradientBrush
second_title: Aspose.Page for Java API Reference
description: Class incapsulating RadialGradientBrush property element features.
type: docs
weight: 48
url: /java/com.aspose.xps/xpsradialgradientbrush/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsBrush](../../com.aspose.xps/xpsbrush), [com.aspose.xps.XpsTransformableBrush](../../com.aspose.xps/xpstransformablebrush), [com.aspose.xps.XpsGradientBrush](../../com.aspose.xps/xpsgradientbrush)
```
public final class XpsRadialGradientBrush extends XpsGradientBrush
```

Class incapsulating RadialGradientBrush property element features. This element is used to specify a radial gradient brush.
## Methods

| Method | Description |
| --- | --- |
| [deepClone()](#deepClone--) | Clones this radial gradient brush. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getCenter()](#getCenter--) | Returns the center point of the radial gradient (that is, the center of the ellipse). |
| [getClass()](#getClass--) |  |
| [getColorInterpolationMode()](#getColorInterpolationMode--) | Returns value specifying the gamma function for color interpolation. |
| [getGradientOrigin()](#getGradientOrigin--) | Returns the origin point of the radial gradient. |
| [getGradientStops()](#getGradientStops--) | Returns list of gradient stops that comprise the gradient. |
| [getOpacity()](#getOpacity--) | Returns value defining the uniform transparency of the brush fill. |
| [getRadiusX()](#getRadiusX--) | Returns the radius in the x dimension of the ellipse which defines the radial gradient. |
| [getRadiusY()](#getRadiusY--) | Returns the radius in the y dimension of the ellipse which defines the radial gradient. |
| [getSpreadMethod()](#getSpreadMethod--) | Returns value describing how the brush should fill the content area outside of the primary, initial gradient area. |
| [getTransform()](#getTransform--) | Returns the matrix transformation applied to the coordinate space of the brush. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setCenter(Point2D value)](#setCenter-java.awt.geom.Point2D-) | Sets the center point of the radial gradient (that is, the center of the ellipse). |
| [setColorInterpolationMode(XpsColorInterpolationMode value)](#setColorInterpolationMode-com.aspose.xps.XpsColorInterpolationMode-) | Sets value specifying the gamma function for color interpolation. |
| [setGradientOrigin(Point2D value)](#setGradientOrigin-java.awt.geom.Point2D-) | Sets the origin point of the radial gradient. |
| [setGradientStops(List<XpsGradientStop> value)](#setGradientStops-java.util.List-com.aspose.xps.XpsGradientStop--) | Sets list of gradient stops that comprise the gradient. |
| [setOpacity(float value)](#setOpacity-float-) | Sets value defining the uniform transparency of the brush fill. |
| [setRadiusX(float value)](#setRadiusX-float-) | Sets the radius in the x dimension of the ellipse which defines the radial gradient. |
| [setRadiusY(float value)](#setRadiusY-float-) | Sets the radius in the y dimension of the ellipse which defines the radial gradient. |
| [setSpreadMethod(XpsSpreadMethod value)](#setSpreadMethod-com.aspose.xps.XpsSpreadMethod-) | Sets value describing how the brush should fill the content area outside of the primary, initial gradient area. |
| [setTransform(XpsMatrix value)](#setTransform-com.aspose.xps.XpsMatrix-) | Sets the matrix transformation applied to the coordinate space of the brush. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsRadialGradientBrush deepClone()
```


Clones this radial gradient brush.

**Returns:**
[XpsRadialGradientBrush](../../com.aspose.xps/xpsradialgradientbrush) - Clone of this radial gradient brush.
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
### getCenter() {#getCenter--}
```
public Point2D getCenter()
```


Returns the center point of the radial gradient (that is, the center of the ellipse).

**Returns:**
java.awt.geom.Point2D - The center point of the radial gradient.
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
### getGradientOrigin() {#getGradientOrigin--}
```
public Point2D getGradientOrigin()
```


Returns the origin point of the radial gradient.

**Returns:**
java.awt.geom.Point2D - The origin point of the radial gradient.
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
### getRadiusX() {#getRadiusX--}
```
public float getRadiusX()
```


Returns the radius in the x dimension of the ellipse which defines the radial gradient.

**Returns:**
float - The radius in the x dimension of the ellipse which defines the radial gradient.
### getRadiusY() {#getRadiusY--}
```
public float getRadiusY()
```


Returns the radius in the y dimension of the ellipse which defines the radial gradient.

**Returns:**
float - The radius in the y dimension of the ellipse which defines the radial gradient.
### getSpreadMethod() {#getSpreadMethod--}
```
public XpsSpreadMethod getSpreadMethod()
```


Returns value describing how the brush should fill the content area outside of the primary, initial gradient area.

**Returns:**
[XpsSpreadMethod](../../com.aspose.xps/xpsspreadmethod) - Value describing how the brush should fill the content area outside of the primary, initial gradient area.
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




### setCenter(Point2D value) {#setCenter-java.awt.geom.Point2D-}
```
public void setCenter(Point2D value)
```


Sets the center point of the radial gradient (that is, the center of the ellipse).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.awt.geom.Point2D | The center point of the radial gradient. |

### setColorInterpolationMode(XpsColorInterpolationMode value) {#setColorInterpolationMode-com.aspose.xps.XpsColorInterpolationMode-}
```
public void setColorInterpolationMode(XpsColorInterpolationMode value)
```


Sets value specifying the gamma function for color interpolation. The gamma adjustment should not be applied to the alpha component, if specified.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [XpsColorInterpolationMode](../../com.aspose.xps/xpscolorinterpolationmode) | Value specifying the gamma function for color interpolation. |

### setGradientOrigin(Point2D value) {#setGradientOrigin-java.awt.geom.Point2D-}
```
public void setGradientOrigin(Point2D value)
```


Sets the origin point of the radial gradient.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.awt.geom.Point2D | The origin point of the radial gradient. |

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

### setRadiusX(float value) {#setRadiusX-float-}
```
public void setRadiusX(float value)
```


Sets the radius in the x dimension of the ellipse which defines the radial gradient.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | float | The radius in the x dimension of the ellipse which defines the radial gradient. |

### setRadiusY(float value) {#setRadiusY-float-}
```
public void setRadiusY(float value)
```


Sets the radius in the y dimension of the ellipse which defines the radial gradient.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | float | The radius in the y dimension of the ellipse which defines the radial gradient. |

### setSpreadMethod(XpsSpreadMethod value) {#setSpreadMethod-com.aspose.xps.XpsSpreadMethod-}
```
public void setSpreadMethod(XpsSpreadMethod value)
```


Sets value describing how the brush should fill the content area outside of the primary, initial gradient area.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [XpsSpreadMethod](../../com.aspose.xps/xpsspreadmethod) | Value describing how the brush should fill the content area outside of the primary, initial gradient area. |

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

