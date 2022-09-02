---
title: XpsGradientStop
second_title: Aspose.Page for Java API Reference
description: Class incapsulating GradientStop element features.
type: docs
weight: 26
url: /java/com.aspose.xps/xpsgradientstop/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject)
```
public final class XpsGradientStop extends XpsObject
```

Class incapsulating GradientStop element features. This element is used by both the LinearGradientBrush and RadialGradientBrush elements to define the location and range of color progression for rendering a gradient.
## Methods

| Method | Description |
| --- | --- |
| [getColor()](#getColor--) | Returns the gradient stop color. |
| [getOffset()](#getOffset--) | Returns the gradient offset. |
| [deepClone()](#deepClone--) | Clones this gradient stop. |
### getColor() {#getColor--}
```
public XpsColor getColor()
```


Returns the gradient stop color.

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - The gradient stop color.
### getOffset() {#getOffset--}
```
public float getOffset()
```


Returns the gradient offset. The offset indicates a point along the progression of the gradient at which a color is specified. Colors between gradient offsets in the progression are interpolated.

**Returns:**
float - The gradient offset.
### deepClone() {#deepClone--}
```
public XpsGradientStop deepClone()
```


Clones this gradient stop.

**Returns:**
[XpsGradientStop](../../com.aspose.xps/xpsgradientstop) - Clone of this gradient stop.
