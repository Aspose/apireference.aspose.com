---
title: Shape
second_title: Aspose.3D for Java API Reference
description: The shape describes the deformation on a set of control points which is similar to the cluster deformer in Maya.
type: docs
weight: 156
url: /java/com.aspose.threed/shape/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.A3DObject](../../com.aspose.threed/a3dobject), [com.aspose.threed.SceneObject](../../com.aspose.threed/sceneobject), [com.aspose.threed.Entity](../../com.aspose.threed/entity), [com.aspose.threed.Geometry](../../com.aspose.threed/geometry)
```
public class Shape extends Geometry
```

The shape describes the deformation on a set of control points, which is similar to the cluster deformer in Maya. For example, we can add a shape to a created geometry. And the shape and the geometry have the same topological information but different position of the control points. With varying amounts of influence, the geometry performs a deformation effect.
## Constructors

| Constructor | Description |
| --- | --- |
| [Shape()](#Shape--) | Initializes a new instance of the com.aspose.threed.Shape class. |
| [Shape(String name)](#Shape-java.lang.String-) | Initializes a new instance of the com.aspose.threed.Shape class. |
## Methods

| Method | Description |
| --- | --- |
| [fromControlPoints(Vector3[] controlPoints)](#fromControlPoints-com.aspose.threed.Vector3...-) | Create a shape with specified control points with a default indices. |
| [getIndices()](#getIndices--) | Gets the indices. |
### Shape() {#Shape--}
```
public Shape()
```


Initializes a new instance of the com.aspose.threed.Shape class.

### Shape(String name) {#Shape-java.lang.String-}
```
public Shape(String name)
```


Initializes a new instance of the com.aspose.threed.Shape class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String | Name |

### fromControlPoints(Vector3[] controlPoints) {#fromControlPoints-com.aspose.threed.Vector3...-}
```
public static Shape fromControlPoints(Vector3[] controlPoints)
```


Create a shape with specified control points with a default indices.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| controlPoints | com.aspose.threed.Vector3[] |  |

**Returns:**
[Shape](../../com.aspose.threed/shape)
### getIndices() {#getIndices--}
```
public List<Integer> getIndices()
```


Gets the indices.

**Returns:**
java.util.List<java.lang.Integer>
