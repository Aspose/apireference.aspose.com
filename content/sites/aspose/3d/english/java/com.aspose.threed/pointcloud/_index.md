---
title: PointCloud
second_title: Aspose.3D for Java API Reference
description: The point cloud contains no topology information but only the control points and the vertex elements.
type: docs
weight: 118
url: /java/com.aspose.threed/pointcloud/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.A3DObject](../../com.aspose.threed/a3dobject), [com.aspose.threed.SceneObject](../../com.aspose.threed/sceneobject), [com.aspose.threed.Entity](../../com.aspose.threed/entity), [com.aspose.threed.Geometry](../../com.aspose.threed/geometry)
```
public class PointCloud extends Geometry
```

The point cloud contains no topology information but only the control points and the vertex elements.
## Constructors

| Constructor | Description |
| --- | --- |
| [PointCloud(String name)](#PointCloud-java.lang.String-) | Constructor of com.aspose.threed.PointCloud |
| [PointCloud()](#PointCloud--) | Constructor of com.aspose.threed.PointCloud |
## Methods

| Method | Description |
| --- | --- |
| [getEntityRendererKey()](#getEntityRendererKey--) | Gets the key of the entity renderer registered in the renderer |
| [fromGeometry(Geometry g)](#fromGeometry-com.aspose.threed.Geometry-) | Create a new PointCloud instance from a geometry object |
| [fromGeometry(Geometry g, int density)](#fromGeometry-com.aspose.threed.Geometry-int-) | Create a new point cloud instance from a geometry object. |
### PointCloud(String name) {#PointCloud-java.lang.String-}
```
public PointCloud(String name)
```


Constructor of com.aspose.threed.PointCloud

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String | The name of this entity |

### PointCloud() {#PointCloud--}
```
public PointCloud()
```


Constructor of com.aspose.threed.PointCloud

### getEntityRendererKey() {#getEntityRendererKey--}
```
public EntityRendererKey getEntityRendererKey()
```


Gets the key of the entity renderer registered in the renderer

**Returns:**
[EntityRendererKey](../../com.aspose.threed/entityrendererkey)
### fromGeometry(Geometry g) {#fromGeometry-com.aspose.threed.Geometry-}
```
public static PointCloud fromGeometry(Geometry g)
```


Create a new PointCloud instance from a geometry object

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| g | [Geometry](../../com.aspose.threed/geometry) |  |

**Returns:**
[PointCloud](../../com.aspose.threed/pointcloud)
### fromGeometry(Geometry g, int density) {#fromGeometry-com.aspose.threed.Geometry-int-}
```
public static PointCloud fromGeometry(Geometry g, int density)
```


Create a new point cloud instance from a geometry object. Density is the number of points per unit triangle(Unit triangle are the triangle with maximum surface area from the mesh)

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| g | [Geometry](../../com.aspose.threed/geometry) | Mesh or other geometry instance |
| density | int | Number of points per unit triangle |

**Returns:**
[PointCloud](../../com.aspose.threed/pointcloud)
