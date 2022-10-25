---
title: CompositeCurve
second_title: Aspose.3D for Java API Reference
description: A com.aspose.threed.CompositeCurve is consisting of several curve segments.
type: docs
weight: 30
url: /java/com.aspose.threed/compositecurve/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.A3DObject](../../com.aspose.threed/a3dobject), [com.aspose.threed.SceneObject](../../com.aspose.threed/sceneobject), [com.aspose.threed.Entity](../../com.aspose.threed/entity), [com.aspose.threed.Curve](../../com.aspose.threed/curve)
```
public class CompositeCurve extends Curve
```

A com.aspose.threed.CompositeCurve is consisting of several curve segments.
## Constructors

| Constructor | Description |
| --- | --- |
| [CompositeCurve()](#CompositeCurve--) | Constructor of com.aspose.threed.CompositeCurve |
## Methods

| Method | Description |
| --- | --- |
| [getSegments()](#getSegments--) | The segments of the curve. |
| [addSegment(Curve curve, boolean sameDirection)](#addSegment-com.aspose.threed.Curve-boolean-) | The |
| [addSegment(Curve curve)](#addSegment-com.aspose.threed.Curve-) | The |
### CompositeCurve() {#CompositeCurve--}
```
public CompositeCurve()
```


Constructor of com.aspose.threed.CompositeCurve

### getSegments() {#getSegments--}
```
public ArrayList<CompositeCurve.Segment> getSegments()
```


The segments of the curve.

**Returns:**
java.util.ArrayList<com.aspose.threed.CompositeCurve.Segment>
### addSegment(Curve curve, boolean sameDirection) {#addSegment-com.aspose.threed.Curve-boolean-}
```
public void addSegment(Curve curve, boolean sameDirection)
```


The

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| curve | [Curve](../../com.aspose.threed/curve) |  |
| sameDirection | boolean |  |

### addSegment(Curve curve) {#addSegment-com.aspose.threed.Curve-}
```
public void addSegment(Curve curve)
```


The

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| curve | [Curve](../../com.aspose.threed/curve) |  |

