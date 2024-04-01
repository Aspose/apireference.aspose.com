---
title: XpsPath
second_title: Aspose.Page for Java API Reference
description: Class incapsulating Path element features.
type: docs
weight: 40
url: /java/com.aspose.xps/xpspath/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsElement](../../com.aspose.xps/xpselement), [com.aspose.xps.XpsHyperlinkElement](../../com.aspose.xps/xpshyperlinkelement), [com.aspose.xps.XpsContentElement](../../com.aspose.xps/xpscontentelement)
```
public final class XpsPath extends XpsContentElement
```

Class incapsulating Path element features. This element is the sole means of adding vector graphics and images to a fixed page. It defines a single vector graphic to be rendered on a page.
## Methods

| Method | Description |
| --- | --- |
| [deepClone()](#deepClone--) | Clones this path. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | Provides access to element's children by index  i . |
| [getClass()](#getClass--) |  |
| [getClip()](#getClip--) | Returns the path geometry limiting the rendered region of the element. |
| [getData()](#getData--) | Returns the geometry of the path. |
| [getFill()](#getFill--) | Returns the brush used to paint the geometry specified by the Data property of the path. |
| [getHyperlinkTarget()](#getHyperlinkTarget--) | Returns hyperlink target object. |
| [getOpacity()](#getOpacity--) | Returns the value defining the uniform transparency of the element. |
| [getOpacityMask()](#getOpacityMask--) | Returns the brush specifying a mask of alpha values that is applied to the element in the same fashion as the Opacity attribute, but allowing different alpha values for different areas of the element. |
| [getRenderTransform()](#getRenderTransform--) | Returns the affine transformation matrix establishing a new coordinate frame for all attributes of the element and for all child elements (if any). |
| [getStroke()](#getStroke--) | Returns the brush used to draw the stroke. |
| [getStrokeDashArray()](#getStrokeDashArray--) | Returns the array specifying the length of dashes and gaps of the outline stroke. |
| [getStrokeDashCap()](#getStrokeDashCap--) | Returns the value specifying how the ends of each dash are drawn. |
| [getStrokeDashOffset()](#getStrokeDashOffset--) | Returns the start point for repeating the dash array pattern. |
| [getStrokeEndLineCap()](#getStrokeEndLineCap--) | Returns the value defining the shape of the end of the last dash in a stroke. |
| [getStrokeLineJoin()](#getStrokeLineJoin--) | Returns the value defining the shape of the beginning of the first dash in a stroke. |
| [getStrokeMiterLimit()](#getStrokeMiterLimit--) | Returns the ratio between the maximum miter length and half of the stroke thickness. |
| [getStrokeStartLineCap()](#getStrokeStartLineCap--) | Returns the value defining the shape of the beginning of the first dash in a stroke. |
| [getStrokeThickness()](#getStrokeThickness--) | Returns the thickness of a stroke, in units of the effective coordinate space (includes the path's render transform). |
| [hashCode()](#hashCode--) |  |
| [iterator()](#iterator--) | Implementation of  Iterable  interface. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setClip(XpsPathGeometry value)](#setClip-com.aspose.xps.XpsPathGeometry-) | Sets the path geometry limiting the rendered region of the element. |
| [setData(XpsPathGeometry value)](#setData-com.aspose.xps.XpsPathGeometry-) | Sets the geometry of the path. |
| [setFill(XpsBrush value)](#setFill-com.aspose.xps.XpsBrush-) | Sets the brush used to paint the geometry specified by the Data property of the path. |
| [setHyperlinkTarget(XpsHyperlinkTarget value)](#setHyperlinkTarget-com.aspose.xps.XpsHyperlinkTarget-) | Sets hyperlink target object. |
| [setOpacity(float value)](#setOpacity-float-) | Sets the value defining the uniform transparency of the element. |
| [setOpacityMask(XpsBrush value)](#setOpacityMask-com.aspose.xps.XpsBrush-) | Sets the brush specifying a mask of alpha values that is applied to the element in the same fashion as the Opacity attribute, but allowing different alpha values for different areas of the element. |
| [setRenderTransform(XpsMatrix value)](#setRenderTransform-com.aspose.xps.XpsMatrix-) | Sets the affine transformation matrix establishing a new coordinate frame for all attributes of the element and for all child elements (if any). |
| [setStroke(XpsBrush value)](#setStroke-com.aspose.xps.XpsBrush-) | Sets the brush used to draw the stroke. |
| [setStrokeDashArray(float[] value)](#setStrokeDashArray-float---) | Sets the array specifying the length of dashes and gaps of the outline stroke. |
| [setStrokeDashCap(XpsDashCap value)](#setStrokeDashCap-com.aspose.xps.XpsDashCap-) | Sets the value specifying how the ends of each dash are drawn. |
| [setStrokeDashOffset(float value)](#setStrokeDashOffset-float-) | Sets the start point for repeating the dash array pattern. |
| [setStrokeEndLineCap(XpsLineCap value)](#setStrokeEndLineCap-com.aspose.xps.XpsLineCap-) | Sets the value defining the shape of the end of the last dash in a stroke. |
| [setStrokeLineJoin(XpsLineJoin value)](#setStrokeLineJoin-com.aspose.xps.XpsLineJoin-) | Sets the value defining the shape of the beginning of the first dash in a stroke. |
| [setStrokeMiterLimit(float value)](#setStrokeMiterLimit-float-) | Sets the ratio between the maximum miter length and half of the stroke thickness. |
| [setStrokeStartLineCap(XpsLineCap value)](#setStrokeStartLineCap-com.aspose.xps.XpsLineCap-) | Sets the value defining the shape of the beginning of the first dash in a stroke. |
| [setStrokeThickness(float value)](#setStrokeThickness-float-) | Sets the thickness of a stroke, in units of the effective coordinate space (includes the path's render transform). |
| [size()](#size--) | Returns the number of child elements. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsPath deepClone()
```


Clones this path.

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Clone this path.
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
### get(int i) {#get-int-}
```
public XpsContentElement get(int i)
```


Provides access to element's children by index  i .

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| i | int | Index of child element. |

**Returns:**
[XpsContentElement](../../com.aspose.xps/xpscontentelement) - Child element at  i  position.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getClip() {#getClip--}
```
public XpsPathGeometry getClip()
```


Returns the path geometry limiting the rendered region of the element.

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The path geometry limiting the rendered region of the element.
### getData() {#getData--}
```
public XpsPathGeometry getData()
```


Returns the geometry of the path.

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The geometry of the path.
### getFill() {#getFill--}
```
public XpsBrush getFill()
```


Returns the brush used to paint the geometry specified by the Data property of the path.

**Returns:**
[XpsBrush](../../com.aspose.xps/xpsbrush) - The brush used to paint the geometry specified
### getHyperlinkTarget() {#getHyperlinkTarget--}
```
public XpsHyperlinkTarget getHyperlinkTarget()
```


Returns hyperlink target object.

**Returns:**
[XpsHyperlinkTarget](../../com.aspose.xps/xpshyperlinktarget) - Hyperlink target object.
### getOpacity() {#getOpacity--}
```
public float getOpacity()
```


Returns the value defining the uniform transparency of the element.

**Returns:**
float - The value defining the uniform transparency of the element.
### getOpacityMask() {#getOpacityMask--}
```
public XpsBrush getOpacityMask()
```


Returns the brush specifying a mask of alpha values that is applied to the element in the same fashion as the Opacity attribute, but allowing different alpha values for different areas of the element.

**Returns:**
[XpsBrush](../../com.aspose.xps/xpsbrush) - The brush specifying a mask.
### getRenderTransform() {#getRenderTransform--}
```
public XpsMatrix getRenderTransform()
```


Returns the affine transformation matrix establishing a new coordinate frame for all attributes of the element and for all child elements (if any).

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - The affine transformation matrix.
### getStroke() {#getStroke--}
```
public XpsBrush getStroke()
```


Returns the brush used to draw the stroke.

**Returns:**
[XpsBrush](../../com.aspose.xps/xpsbrush) - The brush used to draw the stroke.
### getStrokeDashArray() {#getStrokeDashArray--}
```
public float[] getStrokeDashArray()
```


Returns the array specifying the length of dashes and gaps of the outline stroke.

**Returns:**
float[] - The array specifying the length of dashes and gaps of the outline stroke.
### getStrokeDashCap() {#getStrokeDashCap--}
```
public XpsDashCap getStrokeDashCap()
```


Returns the value specifying how the ends of each dash are drawn.

**Returns:**
[XpsDashCap](../../com.aspose.xps/xpsdashcap) - The value specifying how the ends of each dash are drawn.
### getStrokeDashOffset() {#getStrokeDashOffset--}
```
public float getStrokeDashOffset()
```


Returns the start point for repeating the dash array pattern. If this value is omitted, the dash array aligns with the origin of the stroke.

**Returns:**
float - The start point for repeating the dash array pattern.
### getStrokeEndLineCap() {#getStrokeEndLineCap--}
```
public XpsLineCap getStrokeEndLineCap()
```


Returns the value defining the shape of the end of the last dash in a stroke.

**Returns:**
[XpsLineCap](../../com.aspose.xps/xpslinecap) - The value defining the shape of the end of the last dash in a stroke.
### getStrokeLineJoin() {#getStrokeLineJoin--}
```
public XpsLineJoin getStrokeLineJoin()
```


Returns the value defining the shape of the beginning of the first dash in a stroke.

**Returns:**
[XpsLineJoin](../../com.aspose.xps/xpslinejoin) - The value defining the shape of the beginning of the first dash in a stroke.
### getStrokeMiterLimit() {#getStrokeMiterLimit--}
```
public float getStrokeMiterLimit()
```


Returns the ratio between the maximum miter length and half of the stroke thickness. This value is significant only if the  StrokeLineJoin  attribute specifies  Miter .

**Returns:**
float - The ratio between the maximum miter length and half of the stroke thickness.
### getStrokeStartLineCap() {#getStrokeStartLineCap--}
```
public XpsLineCap getStrokeStartLineCap()
```


Returns the value defining the shape of the beginning of the first dash in a stroke.

**Returns:**
[XpsLineCap](../../com.aspose.xps/xpslinecap) - The value defining the shape of the beginning of the first dash in a stroke.
### getStrokeThickness() {#getStrokeThickness--}
```
public float getStrokeThickness()
```


Returns the thickness of a stroke, in units of the effective coordinate space (includes the path's render transform). The stroke is drawn on top of the boundary of the geometry specified by the Path element\\u2019s Data property. Half of the StrokeThickness extends outside of the geometry specified by the Data property and the other half extends inside of the geometry.

**Returns:**
float - The thickness of a stroke.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### iterator() {#iterator--}
```
public Iterator<XpsContentElement> iterator()
```


Implementation of  Iterable  interface.

**Returns:**
java.util.Iterator<com.aspose.xps.XpsContentElement> - Returns enumerator for the list.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setClip(XpsPathGeometry value) {#setClip-com.aspose.xps.XpsPathGeometry-}
```
public void setClip(XpsPathGeometry value)
```


Sets the path geometry limiting the rendered region of the element.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | The path geometry limiting the rendered region of the element. |

### setData(XpsPathGeometry value) {#setData-com.aspose.xps.XpsPathGeometry-}
```
public void setData(XpsPathGeometry value)
```


Sets the geometry of the path.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | The geometry of the path. |

### setFill(XpsBrush value) {#setFill-com.aspose.xps.XpsBrush-}
```
public void setFill(XpsBrush value)
```


Sets the brush used to paint the geometry specified by the Data property of the path.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [XpsBrush](../../com.aspose.xps/xpsbrush) | The brush used to paint the geometry specified |

### setHyperlinkTarget(XpsHyperlinkTarget value) {#setHyperlinkTarget-com.aspose.xps.XpsHyperlinkTarget-}
```
public void setHyperlinkTarget(XpsHyperlinkTarget value)
```


Sets hyperlink target object.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [XpsHyperlinkTarget](../../com.aspose.xps/xpshyperlinktarget) | Hyperlink target object. |

### setOpacity(float value) {#setOpacity-float-}
```
public void setOpacity(float value)
```


Sets the value defining the uniform transparency of the element.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | float | The value defining the uniform transparency of the element. |

### setOpacityMask(XpsBrush value) {#setOpacityMask-com.aspose.xps.XpsBrush-}
```
public void setOpacityMask(XpsBrush value)
```


Sets the brush specifying a mask of alpha values that is applied to the element in the same fashion as the Opacity attribute, but allowing different alpha values for different areas of the element.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [XpsBrush](../../com.aspose.xps/xpsbrush) | The brush specifying a mask. |

### setRenderTransform(XpsMatrix value) {#setRenderTransform-com.aspose.xps.XpsMatrix-}
```
public void setRenderTransform(XpsMatrix value)
```


Sets the affine transformation matrix establishing a new coordinate frame for all attributes of the element and for all child elements (if any).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | The affine transformation matrix. |

### setStroke(XpsBrush value) {#setStroke-com.aspose.xps.XpsBrush-}
```
public void setStroke(XpsBrush value)
```


Sets the brush used to draw the stroke.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [XpsBrush](../../com.aspose.xps/xpsbrush) | The brush used to draw the stroke. |

### setStrokeDashArray(float[] value) {#setStrokeDashArray-float---}
```
public void setStrokeDashArray(float[] value)
```


Sets the array specifying the length of dashes and gaps of the outline stroke.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | float[] | The array specifying the length of dashes and gaps of the outline stroke. |

### setStrokeDashCap(XpsDashCap value) {#setStrokeDashCap-com.aspose.xps.XpsDashCap-}
```
public void setStrokeDashCap(XpsDashCap value)
```


Sets the value specifying how the ends of each dash are drawn.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [XpsDashCap](../../com.aspose.xps/xpsdashcap) | The value specifying how the ends of each dash are drawn. |

### setStrokeDashOffset(float value) {#setStrokeDashOffset-float-}
```
public void setStrokeDashOffset(float value)
```


Sets the start point for repeating the dash array pattern. If this value is omitted, the dash array aligns with the origin of the stroke.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | float | The start point for repeating the dash array pattern. |

### setStrokeEndLineCap(XpsLineCap value) {#setStrokeEndLineCap-com.aspose.xps.XpsLineCap-}
```
public void setStrokeEndLineCap(XpsLineCap value)
```


Sets the value defining the shape of the end of the last dash in a stroke.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [XpsLineCap](../../com.aspose.xps/xpslinecap) | The value defining the shape of the end of the last dash in a stroke. |

### setStrokeLineJoin(XpsLineJoin value) {#setStrokeLineJoin-com.aspose.xps.XpsLineJoin-}
```
public void setStrokeLineJoin(XpsLineJoin value)
```


Sets the value defining the shape of the beginning of the first dash in a stroke.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [XpsLineJoin](../../com.aspose.xps/xpslinejoin) | The value defining the shape of the beginning of the first dash in a stroke. |

### setStrokeMiterLimit(float value) {#setStrokeMiterLimit-float-}
```
public void setStrokeMiterLimit(float value)
```


Sets the ratio between the maximum miter length and half of the stroke thickness. This value is significant only if the  StrokeLineJoin  attribute specifies  Miter .

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | float | The ratio between the maximum miter length and half of the stroke thickness. |

### setStrokeStartLineCap(XpsLineCap value) {#setStrokeStartLineCap-com.aspose.xps.XpsLineCap-}
```
public void setStrokeStartLineCap(XpsLineCap value)
```


Sets the value defining the shape of the beginning of the first dash in a stroke.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [XpsLineCap](../../com.aspose.xps/xpslinecap) | The value defining the shape of the beginning of the first dash in a stroke. |

### setStrokeThickness(float value) {#setStrokeThickness-float-}
```
public void setStrokeThickness(float value)
```


Sets the thickness of a stroke, in units of the effective coordinate space (includes the path's render transform). The stroke is drawn on top of the boundary of the geometry specified by the Path element\\u2019s Data property. Half of the StrokeThickness extends outside of the geometry specified by the Data property and the other half extends inside of the geometry.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | float | The thickness of a stroke. |

### size() {#size--}
```
public int size()
```


Returns the number of child elements.

**Returns:**
int - The number of child elements.
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

