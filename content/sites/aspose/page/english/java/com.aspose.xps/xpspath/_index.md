---
title: XpsPath
second_title: Aspose.Page for Java API Reference
description: Class incapsulating Path element features.
type: docs
weight: 39
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
| [getFill()](#getFill--) | Returns the brush used to paint the geometry specified by the Data property of the path. |
| [setFill(XpsBrush value)](#setFill-com.aspose.xps.XpsBrush-) | Sets the brush used to paint the geometry specified by the Data property of the path. |
| [getData()](#getData--) | Returns the geometry of the path. |
| [setData(XpsPathGeometry value)](#setData-com.aspose.xps.XpsPathGeometry-) | Sets the geometry of the path. |
| [getStroke()](#getStroke--) | Returns the brush used to draw the stroke. |
| [setStroke(XpsBrush value)](#setStroke-com.aspose.xps.XpsBrush-) | Sets the brush used to draw the stroke. |
| [getStrokeDashArray()](#getStrokeDashArray--) | Returns the array specifying the length of dashes and gaps of the outline stroke. |
| [setStrokeDashArray(float[] value)](#setStrokeDashArray-float---) | Sets the array specifying the length of dashes and gaps of the outline stroke. |
| [getStrokeDashCap()](#getStrokeDashCap--) | Returns the value specifying how the ends of each dash are drawn. |
| [setStrokeDashCap(XpsDashCap value)](#setStrokeDashCap-com.aspose.xps.XpsDashCap-) | Sets the value specifying how the ends of each dash are drawn. |
| [getStrokeDashOffset()](#getStrokeDashOffset--) | Returns the start point for repeating the dash array pattern. |
| [setStrokeDashOffset(float value)](#setStrokeDashOffset-float-) | Sets the start point for repeating the dash array pattern. |
| [getStrokeStartLineCap()](#getStrokeStartLineCap--) | Returns the value defining the shape of the beginning of the first dash in a stroke. |
| [setStrokeStartLineCap(XpsLineCap value)](#setStrokeStartLineCap-com.aspose.xps.XpsLineCap-) | Sets the value defining the shape of the beginning of the first dash in a stroke. |
| [getStrokeEndLineCap()](#getStrokeEndLineCap--) | Returns the value defining the shape of the end of the last dash in a stroke. |
| [setStrokeEndLineCap(XpsLineCap value)](#setStrokeEndLineCap-com.aspose.xps.XpsLineCap-) | Sets the value defining the shape of the end of the last dash in a stroke. |
| [getStrokeLineJoin()](#getStrokeLineJoin--) | Returns the value defining the shape of the beginning of the first dash in a stroke. |
| [setStrokeLineJoin(XpsLineJoin value)](#setStrokeLineJoin-com.aspose.xps.XpsLineJoin-) | Sets the value defining the shape of the beginning of the first dash in a stroke. |
| [getStrokeMiterLimit()](#getStrokeMiterLimit--) | Returns the ratio between the maximum miter length and half of the stroke thickness. |
| [setStrokeMiterLimit(float value)](#setStrokeMiterLimit-float-) | Sets the ratio between the maximum miter length and half of the stroke thickness. |
| [getStrokeThickness()](#getStrokeThickness--) | Returns the thickness of a stroke, in units of the effective coordinate space (includes the path's render transform). |
| [setStrokeThickness(float value)](#setStrokeThickness-float-) | Sets the thickness of a stroke, in units of the effective coordinate space (includes the path's render transform). |
| [deepClone()](#deepClone--) | Clones this path. |
### getFill() {#getFill--}
```
public XpsBrush getFill()
```


Returns the brush used to paint the geometry specified by the Data property of the path.

**Returns:**
[XpsBrush](../../com.aspose.xps/xpsbrush) - The brush used to paint the geometry specified
### setFill(XpsBrush value) {#setFill-com.aspose.xps.XpsBrush-}
```
public void setFill(XpsBrush value)
```


Sets the brush used to paint the geometry specified by the Data property of the path.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [XpsBrush](../../com.aspose.xps/xpsbrush) | The brush used to paint the geometry specified |

### getData() {#getData--}
```
public XpsPathGeometry getData()
```


Returns the geometry of the path.

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The geometry of the path.
### setData(XpsPathGeometry value) {#setData-com.aspose.xps.XpsPathGeometry-}
```
public void setData(XpsPathGeometry value)
```


Sets the geometry of the path.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | The geometry of the path. |

### getStroke() {#getStroke--}
```
public XpsBrush getStroke()
```


Returns the brush used to draw the stroke.

**Returns:**
[XpsBrush](../../com.aspose.xps/xpsbrush) - The brush used to draw the stroke.
### setStroke(XpsBrush value) {#setStroke-com.aspose.xps.XpsBrush-}
```
public void setStroke(XpsBrush value)
```


Sets the brush used to draw the stroke.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [XpsBrush](../../com.aspose.xps/xpsbrush) | The brush used to draw the stroke. |

### getStrokeDashArray() {#getStrokeDashArray--}
```
public float[] getStrokeDashArray()
```


Returns the array specifying the length of dashes and gaps of the outline stroke.

**Returns:**
float[] - The array specifying the length of dashes and gaps of the outline stroke.
### setStrokeDashArray(float[] value) {#setStrokeDashArray-float---}
```
public void setStrokeDashArray(float[] value)
```


Sets the array specifying the length of dashes and gaps of the outline stroke.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | float[] | The array specifying the length of dashes and gaps of the outline stroke. |

### getStrokeDashCap() {#getStrokeDashCap--}
```
public XpsDashCap getStrokeDashCap()
```


Returns the value specifying how the ends of each dash are drawn.

**Returns:**
[XpsDashCap](../../com.aspose.xps/xpsdashcap) - The value specifying how the ends of each dash are drawn.
### setStrokeDashCap(XpsDashCap value) {#setStrokeDashCap-com.aspose.xps.XpsDashCap-}
```
public void setStrokeDashCap(XpsDashCap value)
```


Sets the value specifying how the ends of each dash are drawn.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [XpsDashCap](../../com.aspose.xps/xpsdashcap) | The value specifying how the ends of each dash are drawn. |

### getStrokeDashOffset() {#getStrokeDashOffset--}
```
public float getStrokeDashOffset()
```


Returns the start point for repeating the dash array pattern. If this value is omitted, the dash array aligns with the origin of the stroke.

**Returns:**
float - The start point for repeating the dash array pattern.
### setStrokeDashOffset(float value) {#setStrokeDashOffset-float-}
```
public void setStrokeDashOffset(float value)
```


Sets the start point for repeating the dash array pattern. If this value is omitted, the dash array aligns with the origin of the stroke.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | float | The start point for repeating the dash array pattern. |

### getStrokeStartLineCap() {#getStrokeStartLineCap--}
```
public XpsLineCap getStrokeStartLineCap()
```


Returns the value defining the shape of the beginning of the first dash in a stroke.

**Returns:**
[XpsLineCap](../../com.aspose.xps/xpslinecap) - The value defining the shape of the beginning of the first dash in a stroke.
### setStrokeStartLineCap(XpsLineCap value) {#setStrokeStartLineCap-com.aspose.xps.XpsLineCap-}
```
public void setStrokeStartLineCap(XpsLineCap value)
```


Sets the value defining the shape of the beginning of the first dash in a stroke.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [XpsLineCap](../../com.aspose.xps/xpslinecap) | The value defining the shape of the beginning of the first dash in a stroke. |

### getStrokeEndLineCap() {#getStrokeEndLineCap--}
```
public XpsLineCap getStrokeEndLineCap()
```


Returns the value defining the shape of the end of the last dash in a stroke.

**Returns:**
[XpsLineCap](../../com.aspose.xps/xpslinecap) - The value defining the shape of the end of the last dash in a stroke.
### setStrokeEndLineCap(XpsLineCap value) {#setStrokeEndLineCap-com.aspose.xps.XpsLineCap-}
```
public void setStrokeEndLineCap(XpsLineCap value)
```


Sets the value defining the shape of the end of the last dash in a stroke.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [XpsLineCap](../../com.aspose.xps/xpslinecap) | The value defining the shape of the end of the last dash in a stroke. |

### getStrokeLineJoin() {#getStrokeLineJoin--}
```
public XpsLineJoin getStrokeLineJoin()
```


Returns the value defining the shape of the beginning of the first dash in a stroke.

**Returns:**
[XpsLineJoin](../../com.aspose.xps/xpslinejoin) - The value defining the shape of the beginning of the first dash in a stroke.
### setStrokeLineJoin(XpsLineJoin value) {#setStrokeLineJoin-com.aspose.xps.XpsLineJoin-}
```
public void setStrokeLineJoin(XpsLineJoin value)
```


Sets the value defining the shape of the beginning of the first dash in a stroke.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [XpsLineJoin](../../com.aspose.xps/xpslinejoin) | The value defining the shape of the beginning of the first dash in a stroke. |

### getStrokeMiterLimit() {#getStrokeMiterLimit--}
```
public float getStrokeMiterLimit()
```


Returns the ratio between the maximum miter length and half of the stroke thickness. This value is significant only if the \`\`\` StrokeLineJoin \`\`\` attribute specifies \`\`\` Miter \`\`\`.

**Returns:**
float - The ratio between the maximum miter length and half of the stroke thickness.
### setStrokeMiterLimit(float value) {#setStrokeMiterLimit-float-}
```
public void setStrokeMiterLimit(float value)
```


Sets the ratio between the maximum miter length and half of the stroke thickness. This value is significant only if the \`\`\` StrokeLineJoin \`\`\` attribute specifies \`\`\` Miter \`\`\`.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | float | The ratio between the maximum miter length and half of the stroke thickness. |

### getStrokeThickness() {#getStrokeThickness--}
```
public float getStrokeThickness()
```


Returns the thickness of a stroke, in units of the effective coordinate space (includes the path's render transform). The stroke is drawn on top of the boundary of the geometry specified by the Path element\\u2019s Data property. Half of the StrokeThickness extends outside of the geometry specified by the Data property and the other half extends inside of the geometry.

**Returns:**
float - The thickness of a stroke.
### setStrokeThickness(float value) {#setStrokeThickness-float-}
```
public void setStrokeThickness(float value)
```


Sets the thickness of a stroke, in units of the effective coordinate space (includes the path's render transform). The stroke is drawn on top of the boundary of the geometry specified by the Path element\\u2019s Data property. Half of the StrokeThickness extends outside of the geometry specified by the Data property and the other half extends inside of the geometry.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | float | The thickness of a stroke. |

### deepClone() {#deepClone--}
```
public XpsPath deepClone()
```


Clones this path.

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Clone this path.
