---
title: TransformedCurve
second_title: Aspose.3D for Java API Reference
description: A com.aspose.threed.TransformedCurve gives a curve a placement by using a transformation matrix.
type: docs
weight: 172
url: /java/com.aspose.threed/transformedcurve/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.A3DObject](../../com.aspose.threed/a3dobject), [com.aspose.threed.SceneObject](../../com.aspose.threed/sceneobject), [com.aspose.threed.Entity](../../com.aspose.threed/entity), [com.aspose.threed.Curve](../../com.aspose.threed/curve)
```
public class TransformedCurve extends Curve
```

A com.aspose.threed.TransformedCurve gives a curve a placement by using a transformation matrix. This allows to perform a transformation inside a com.aspose.threed.TrimmedCurve or com.aspose.threed.CompositeCurve.
## Constructors

| Constructor | Description |
| --- | --- |
| [TransformedCurve()](#TransformedCurve--) | The constructor of com.aspose.threed.TransformedCurve |
| [TransformedCurve(Curve basisCurve, Matrix4 transformation)](#TransformedCurve-com.aspose.threed.Curve-com.aspose.threed.Matrix4-) | The constructor of com.aspose.threed.TransformedCurve |
## Methods

| Method | Description |
| --- | --- |
| [getTransformMatrix()](#getTransformMatrix--) | The transformation matrix. |
| [setTransformMatrix(Matrix4 value)](#setTransformMatrix-com.aspose.threed.Matrix4-) | The transformation matrix. |
| [getBasisCurve()](#getBasisCurve--) | The basis curve. |
| [setBasisCurve(Curve value)](#setBasisCurve-com.aspose.threed.Curve-) | The basis curve. |
### TransformedCurve() {#TransformedCurve--}
```
public TransformedCurve()
```


The constructor of com.aspose.threed.TransformedCurve

### TransformedCurve(Curve basisCurve, Matrix4 transformation) {#TransformedCurve-com.aspose.threed.Curve-com.aspose.threed.Matrix4-}
```
public TransformedCurve(Curve basisCurve, Matrix4 transformation)
```


The constructor of com.aspose.threed.TransformedCurve

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| basisCurve | [Curve](../../com.aspose.threed/curve) |  |
| transformation | [Matrix4](../../com.aspose.threed/matrix4) |  |

### getTransformMatrix() {#getTransformMatrix--}
```
public Matrix4 getTransformMatrix()
```


The transformation matrix.

**Returns:**
[Matrix4](../../com.aspose.threed/matrix4)
### setTransformMatrix(Matrix4 value) {#setTransformMatrix-com.aspose.threed.Matrix4-}
```
public void setTransformMatrix(Matrix4 value)
```


The transformation matrix.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Matrix4](../../com.aspose.threed/matrix4) | New value |

### getBasisCurve() {#getBasisCurve--}
```
public Curve getBasisCurve()
```


The basis curve.

**Returns:**
[Curve](../../com.aspose.threed/curve)
### setBasisCurve(Curve value) {#setBasisCurve-com.aspose.threed.Curve-}
```
public void setBasisCurve(Curve value)
```


The basis curve.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Curve](../../com.aspose.threed/curve) | New value |

