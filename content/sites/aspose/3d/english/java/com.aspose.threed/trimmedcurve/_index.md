---
title: TrimmedCurve
second_title: Aspose.3D for Java API Reference
description: A bounded curve that trimmed the basis curve at both ends.
type: docs
weight: 176
url: /java/com.aspose.threed/trimmedcurve/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.A3DObject](../../com.aspose.threed/a3dobject), [com.aspose.threed.SceneObject](../../com.aspose.threed/sceneobject), [com.aspose.threed.Entity](../../com.aspose.threed/entity), [com.aspose.threed.Curve](../../com.aspose.threed/curve)
```
public class TrimmedCurve extends Curve
```

A bounded curve that trimmed the basis curve at both ends.
## Constructors

| Constructor | Description |
| --- | --- |
| [TrimmedCurve()](#TrimmedCurve--) | Constructor of com.aspose.threed.TrimmedCurve |
## Methods

| Method | Description |
| --- | --- |
| [getBasisCurve()](#getBasisCurve--) | The basis curve to be trimmed. |
| [setBasisCurve(Curve value)](#setBasisCurve-com.aspose.threed.Curve-) | The basis curve to be trimmed. |
| [getFirst()](#getFirst--) | The first end point to trim, can be a Cartesian point or a real parameter. |
| [setFirst(EndPoint value)](#setFirst-com.aspose.threed.EndPoint-) | The first end point to trim, can be a Cartesian point or a real parameter. |
| [getSecond()](#getSecond--) | The second end point to trim, can be a Cartesian point or a real parameter. |
| [setSecond(EndPoint value)](#setSecond-com.aspose.threed.EndPoint-) | The second end point to trim, can be a Cartesian point or a real parameter. |
| [getSameDirection()](#getSameDirection--) | Gets whether the trimmed result uses the same direction of the basis curve. |
| [setSameDirection(boolean value)](#setSameDirection-boolean-) | Sets whether the trimmed result uses the same direction of the basis curve. |
### TrimmedCurve() {#TrimmedCurve--}
```
public TrimmedCurve()
```


Constructor of com.aspose.threed.TrimmedCurve

### getBasisCurve() {#getBasisCurve--}
```
public Curve getBasisCurve()
```


The basis curve to be trimmed.

**Returns:**
[Curve](../../com.aspose.threed/curve)
### setBasisCurve(Curve value) {#setBasisCurve-com.aspose.threed.Curve-}
```
public void setBasisCurve(Curve value)
```


The basis curve to be trimmed.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Curve](../../com.aspose.threed/curve) | New value |

### getFirst() {#getFirst--}
```
public EndPoint getFirst()
```


The first end point to trim, can be a Cartesian point or a real parameter.

**Returns:**
[EndPoint](../../com.aspose.threed/endpoint)
### setFirst(EndPoint value) {#setFirst-com.aspose.threed.EndPoint-}
```
public void setFirst(EndPoint value)
```


The first end point to trim, can be a Cartesian point or a real parameter.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [EndPoint](../../com.aspose.threed/endpoint) | New value |

### getSecond() {#getSecond--}
```
public EndPoint getSecond()
```


The second end point to trim, can be a Cartesian point or a real parameter.

**Returns:**
[EndPoint](../../com.aspose.threed/endpoint)
### setSecond(EndPoint value) {#setSecond-com.aspose.threed.EndPoint-}
```
public void setSecond(EndPoint value)
```


The second end point to trim, can be a Cartesian point or a real parameter.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [EndPoint](../../com.aspose.threed/endpoint) | New value |

### getSameDirection() {#getSameDirection--}
```
public boolean getSameDirection()
```


Gets whether the trimmed result uses the same direction of the basis curve.

**Returns:**
boolean
### setSameDirection(boolean value) {#setSameDirection-boolean-}
```
public void setSameDirection(boolean value)
```


Sets whether the trimmed result uses the same direction of the basis curve.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

