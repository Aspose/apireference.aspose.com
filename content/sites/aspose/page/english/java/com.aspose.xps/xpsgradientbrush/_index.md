---
title: XpsGradientBrush
second_title: Aspose.Page for Java API Reference
description: Class incapsulating common features of LinerGradientBrush and RadialGradientBrush elements.
type: docs
weight: 25
url: /java/com.aspose.xps/xpsgradientbrush/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsBrush](../../com.aspose.xps/xpsbrush), [com.aspose.xps.XpsTransformableBrush](../../com.aspose.xps/xpstransformablebrush)
```
public abstract class XpsGradientBrush extends XpsTransformableBrush
```

Class incapsulating common features of LinerGradientBrush and RadialGradientBrush elements.
## Methods

| Method | Description |
| --- | --- |
| [getGradientStops()](#getGradientStops--) | Returns list of gradient stops that comprise the gradient. |
| [setGradientStops(List<XpsGradientStop> value)](#setGradientStops-java.util.List-com.aspose.xps.XpsGradientStop--) | Sets list of gradient stops that comprise the gradient. |
| [getColorInterpolationMode()](#getColorInterpolationMode--) | Returns value specifying the gamma function for color interpolation. |
| [setColorInterpolationMode(XpsColorInterpolationMode value)](#setColorInterpolationMode-com.aspose.xps.XpsColorInterpolationMode-) | Sets value specifying the gamma function for color interpolation. |
| [getSpreadMethod()](#getSpreadMethod--) | Returns value describing how the brush should fill the content area outside of the primary, initial gradient area. |
| [setSpreadMethod(XpsSpreadMethod value)](#setSpreadMethod-com.aspose.xps.XpsSpreadMethod-) | Sets value describing how the brush should fill the content area outside of the primary, initial gradient area. |
### getGradientStops() {#getGradientStops--}
```
public List<XpsGradientStop> getGradientStops()
```


Returns list of gradient stops that comprise the gradient.

**Returns:**
java.util.List<com.aspose.xps.XpsGradientStop> - List of gradient stops that comprise the gradient.
### setGradientStops(List<XpsGradientStop> value) {#setGradientStops-java.util.List-com.aspose.xps.XpsGradientStop--}
```
public void setGradientStops(List<XpsGradientStop> value)
```


Sets list of gradient stops that comprise the gradient.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.util.List<com.aspose.xps.XpsGradientStop> | List of gradient stops that comprise the gradient. |

### getColorInterpolationMode() {#getColorInterpolationMode--}
```
public XpsColorInterpolationMode getColorInterpolationMode()
```


Returns value specifying the gamma function for color interpolation. The gamma adjustment should not be applied to the alpha component, if specified.

**Returns:**
[XpsColorInterpolationMode](../../com.aspose.xps/xpscolorinterpolationmode) - Value specifying the gamma function for color interpolation.
### setColorInterpolationMode(XpsColorInterpolationMode value) {#setColorInterpolationMode-com.aspose.xps.XpsColorInterpolationMode-}
```
public void setColorInterpolationMode(XpsColorInterpolationMode value)
```


Sets value specifying the gamma function for color interpolation. The gamma adjustment should not be applied to the alpha component, if specified.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [XpsColorInterpolationMode](../../com.aspose.xps/xpscolorinterpolationmode) | Value specifying the gamma function for color interpolation. |

### getSpreadMethod() {#getSpreadMethod--}
```
public XpsSpreadMethod getSpreadMethod()
```


Returns value describing how the brush should fill the content area outside of the primary, initial gradient area.

**Returns:**
[XpsSpreadMethod](../../com.aspose.xps/xpsspreadmethod) - Value describing how the brush should fill the content area outside of the primary, initial gradient area.
### setSpreadMethod(XpsSpreadMethod value) {#setSpreadMethod-com.aspose.xps.XpsSpreadMethod-}
```
public void setSpreadMethod(XpsSpreadMethod value)
```


Sets value describing how the brush should fill the content area outside of the primary, initial gradient area.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [XpsSpreadMethod](../../com.aspose.xps/xpsspreadmethod) | Value describing how the brush should fill the content area outside of the primary, initial gradient area. |

