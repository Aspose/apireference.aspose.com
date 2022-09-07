---
title: XpsContentElement
second_title: Aspose.Page for Java API Reference
description: Incapsulates features of XPS content elements Canvas Path and Glyphs.
type: docs
weight: 17
url: /java/com.aspose.xps/xpscontentelement/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsElement](../../com.aspose.xps/xpselement), [com.aspose.xps.XpsHyperlinkElement](../../com.aspose.xps/xpshyperlinkelement)
```
public abstract class XpsContentElement extends XpsHyperlinkElement
```

Incapsulates features of XPS content elements: Canvas, Path and Glyphs.
## Methods

| Method | Description |
| --- | --- |
| [getRenderTransform()](#getRenderTransform--) | Returns the affine transformation matrix establishing a new coordinate frame for all attributes of the element and for all child elements (if any). |
| [setRenderTransform(XpsMatrix value)](#setRenderTransform-com.aspose.xps.XpsMatrix-) | Sets the affine transformation matrix establishing a new coordinate frame for all attributes of the element and for all child elements (if any). |
| [getClip()](#getClip--) | Returns the path geometry limiting the rendered region of the element. |
| [setClip(XpsPathGeometry value)](#setClip-com.aspose.xps.XpsPathGeometry-) | Sets the path geometry limiting the rendered region of the element. |
| [getOpacity()](#getOpacity--) | Returns the value defining the uniform transparency of the element. |
| [setOpacity(float value)](#setOpacity-float-) | Sets the value defining the uniform transparency of the element. |
| [getOpacityMask()](#getOpacityMask--) | Returns the brush specifying a mask of alpha values that is applied to the element in the same fashion as the Opacity attribute, but allowing different alpha values for different areas of the element. |
| [setOpacityMask(XpsBrush value)](#setOpacityMask-com.aspose.xps.XpsBrush-) | Sets the brush specifying a mask of alpha values that is applied to the element in the same fashion as the Opacity attribute, but allowing different alpha values for different areas of the element. |
### getRenderTransform() {#getRenderTransform--}
```
public XpsMatrix getRenderTransform()
```


Returns the affine transformation matrix establishing a new coordinate frame for all attributes of the element and for all child elements (if any).

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - The affine transformation matrix.
### setRenderTransform(XpsMatrix value) {#setRenderTransform-com.aspose.xps.XpsMatrix-}
```
public void setRenderTransform(XpsMatrix value)
```


Sets the affine transformation matrix establishing a new coordinate frame for all attributes of the element and for all child elements (if any).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | The affine transformation matrix. |

### getClip() {#getClip--}
```
public XpsPathGeometry getClip()
```


Returns the path geometry limiting the rendered region of the element.

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The path geometry limiting the rendered region of the element.
### setClip(XpsPathGeometry value) {#setClip-com.aspose.xps.XpsPathGeometry-}
```
public void setClip(XpsPathGeometry value)
```


Sets the path geometry limiting the rendered region of the element.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | The path geometry limiting the rendered region of the element. |

### getOpacity() {#getOpacity--}
```
public float getOpacity()
```


Returns the value defining the uniform transparency of the element.

**Returns:**
float - The value defining the uniform transparency of the element.
### setOpacity(float value) {#setOpacity-float-}
```
public void setOpacity(float value)
```


Sets the value defining the uniform transparency of the element.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | float | The value defining the uniform transparency of the element. |

### getOpacityMask() {#getOpacityMask--}
```
public XpsBrush getOpacityMask()
```


Returns the brush specifying a mask of alpha values that is applied to the element in the same fashion as the Opacity attribute, but allowing different alpha values for different areas of the element.

**Returns:**
[XpsBrush](../../com.aspose.xps/xpsbrush) - The brush specifying a mask.
### setOpacityMask(XpsBrush value) {#setOpacityMask-com.aspose.xps.XpsBrush-}
```
public void setOpacityMask(XpsBrush value)
```


Sets the brush specifying a mask of alpha values that is applied to the element in the same fashion as the Opacity attribute, but allowing different alpha values for different areas of the element.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [XpsBrush](../../com.aspose.xps/xpsbrush) | The brush specifying a mask. |

