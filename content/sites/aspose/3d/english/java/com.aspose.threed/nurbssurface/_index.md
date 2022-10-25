---
title: NurbsSurface
second_title: Aspose.3D for Java API Reference
description: com.aspose.threed.NurbsSurface is a surface represented by a hrefhttps//en.wikipedia.org/wiki/Non-uniform_rational_B-splineNURBSNon-uniform rational basis spline/a
 A com.aspose.threed.NurbsSurface is defined by two com.aspose.threed.NurbsDirection com.aspose.threed.NurbsSurfacegetU and com.aspose.threed.NurbsSurfacegetV.
type: docs
weight: 101
url: /java/com.aspose.threed/nurbssurface/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.A3DObject](../../com.aspose.threed/a3dobject), [com.aspose.threed.SceneObject](../../com.aspose.threed/sceneobject), [com.aspose.threed.Entity](../../com.aspose.threed/entity), [com.aspose.threed.Geometry](../../com.aspose.threed/geometry)

**All Implemented Interfaces:**
[com.aspose.threed.IMeshConvertible](../../com.aspose.threed/imeshconvertible)
```
public class NurbsSurface extends Geometry implements IMeshConvertible
```

com.aspose.threed.NurbsSurface is a surface represented by [NURBS(Non-uniform rational basis spline)][NURBS_Non-uniform rational basis spline], A com.aspose.threed.NurbsSurface is defined by two com.aspose.threed.NurbsDirection com.aspose.threed.NurbsSurface\#getU and com.aspose.threed.NurbsSurface\#getV. The w component in control point is used as control point's weight whatever the direction's type is a com.aspose.threed.CurveDimension\#TWO\_DIMENSIONAL or com.aspose.threed.CurveDimension\#THREE\_DIMENSIONAL


[NURBS_Non-uniform rational basis spline]: https://en.wikipedia.org/wiki/Non-uniform_rational_B-spline
## Constructors

| Constructor | Description |
| --- | --- |
| [NurbsSurface()](#NurbsSurface--) | Initializes a new instance of the com.aspose.threed.NurbsSurface class. |
| [NurbsSurface(String name)](#NurbsSurface-java.lang.String-) | Initializes a new instance of the com.aspose.threed.NurbsSurface class. |
## Methods

| Method | Description |
| --- | --- |
| [getU()](#getU--) | Gets the NURBS surface's U direction |
| [getV()](#getV--) | Gets the NURBS surface's V direction |
| [toMesh()](#toMesh--) | Convert the NURBS surface to the mesh |
### NurbsSurface() {#NurbsSurface--}
```
public NurbsSurface()
```


Initializes a new instance of the com.aspose.threed.NurbsSurface class.

### NurbsSurface(String name) {#NurbsSurface-java.lang.String-}
```
public NurbsSurface(String name)
```


Initializes a new instance of the com.aspose.threed.NurbsSurface class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String | Name. |

### getU() {#getU--}
```
public NurbsDirection getU()
```


Gets the NURBS surface's U direction

**Returns:**
[NurbsDirection](../../com.aspose.threed/nurbsdirection)
### getV() {#getV--}
```
public NurbsDirection getV()
```


Gets the NURBS surface's V direction

**Returns:**
[NurbsDirection](../../com.aspose.threed/nurbsdirection)
### toMesh() {#toMesh--}
```
public Mesh toMesh()
```


Convert the NURBS surface to the mesh

**Returns:**
[Mesh](../../com.aspose.threed/mesh)
