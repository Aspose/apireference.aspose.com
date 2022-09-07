---
title: XpsTransformableBrush
second_title: Aspose.Page for Java API Reference
description: Class incapsulating common features of transformable brushes elements all except SolidColorBrush.
type: docs
weight: 51
url: /java/com.aspose.xps/xpstransformablebrush/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsBrush](../../com.aspose.xps/xpsbrush)

**All Implemented Interfaces:**
com.aspose.xps.ITransformableProperty
```
public abstract class XpsTransformableBrush extends XpsBrush implements ITransformableProperty
```

Class incapsulating common features of transformable brushes elements (all except SolidColorBrush).
## Methods

| Method | Description |
| --- | --- |
| [getTransform()](#getTransform--) | Returns the matrix transformation applied to the coordinate space of the brush. |
| [setTransform(XpsMatrix value)](#setTransform-com.aspose.xps.XpsMatrix-) | Sets the matrix transformation applied to the coordinate space of the brush. |
### getTransform() {#getTransform--}
```
public XpsMatrix getTransform()
```


Returns the matrix transformation applied to the coordinate space of the brush. The Transform property is concatenated with the current effective render transform to yield an effective render transform local to the brush. The viewport for the brush is transformed using the local effective render transform.

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - The matrix transformation applied to the coordinate space of the brush.
### setTransform(XpsMatrix value) {#setTransform-com.aspose.xps.XpsMatrix-}
```
public void setTransform(XpsMatrix value)
```


Sets the matrix transformation applied to the coordinate space of the brush. The Transform property is concatenated with the current effective render transform to yield an effective render transform local to the brush. The viewport for the brush is transformed using the local effective render transform.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | The matrix transformation applied to the coordinate space of the brush. |

