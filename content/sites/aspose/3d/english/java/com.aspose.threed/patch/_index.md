---
title: Patch
second_title: Aspose.3D for Java API Reference
description: A com.aspose.threed.Patch is a parametric modeling surface similar to com.aspose.threed.NurbsSurface its also defined by two
 com.aspose.threed.PatchDirection the com.aspose.threed.PatchgetU and com.aspose.threed.PatchgetV.
type: docs
weight: 106
url: /java/com.aspose.threed/patch/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.A3DObject](../../com.aspose.threed/a3dobject), [com.aspose.threed.SceneObject](../../com.aspose.threed/sceneobject), [com.aspose.threed.Entity](../../com.aspose.threed/entity), [com.aspose.threed.Geometry](../../com.aspose.threed/geometry)
```
public class Patch extends Geometry
```

A com.aspose.threed.Patch is a parametric modeling surface, similar to com.aspose.threed.NurbsSurface, it's also defined by two com.aspose.threed.PatchDirection, the com.aspose.threed.Patch\#getU and com.aspose.threed.Patch\#getV. But difference between com.aspose.threed.Patch and com.aspose.threed.NurbsSurface is that the com.aspose.threed.PatchDirection curve can be one of com.aspose.threed.PatchDirectionType\#BEZIER, com.aspose.threed.PatchDirectionType\#QUADRATIC\_BEZIER, com.aspose.threed.PatchDirectionType\#BASIS\_SPLINE, com.aspose.threed.PatchDirectionType\#CARDINAL\_SPLINE and com.aspose.threed.PatchDirectionType\#LINEAR
## Constructors

| Constructor | Description |
| --- | --- |
| [Patch()](#Patch--) | Initializes a new instance of the com.aspose.threed.Patch class. |
| [Patch(String name)](#Patch-java.lang.String-) | Initializes a new instance of the com.aspose.threed.Patch class. |
## Methods

| Method | Description |
| --- | --- |
| [getU()](#getU--) | Gets the u direction. |
| [getV()](#getV--) | Gets the v direction. |
### Patch() {#Patch--}
```
public Patch()
```


Initializes a new instance of the com.aspose.threed.Patch class.

### Patch(String name) {#Patch-java.lang.String-}
```
public Patch(String name)
```


Initializes a new instance of the com.aspose.threed.Patch class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String | Name. |

### getU() {#getU--}
```
public PatchDirection getU()
```


Gets the u direction.

**Returns:**
[PatchDirection](../../com.aspose.threed/patchdirection)
### getV() {#getV--}
```
public PatchDirection getV()
```


Gets the v direction.

**Returns:**
[PatchDirection](../../com.aspose.threed/patchdirection)
