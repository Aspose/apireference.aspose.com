---
title: BoundingBox.FromGeometry
second_title: Aspose.3D for .NET API Reference
description: BoundingBox method. Construct a bounding box from given geometry
type: docs
weight: 40
url: /net/aspose.threed.utilities/boundingbox/fromgeometry/
---
## BoundingBox.FromGeometry method

Construct a bounding box from given geometry

```csharp
public static BoundingBox FromGeometry(Geometry geometry)
```

| Parameter | Type | Description |
| --- | --- | --- |
| geometry | Geometry | The geometry to calculate bounding box |

### Return Value

The bounding box of given geometry

### Examples

The following code shows how to construct a bounding box from a geometry instance.

```csharp
var sphere = (new Sphere()).ToMesh();
var boundingBox = BoundingBox.FromGeometry(sphere);
Console.WriteLine("Bounding box = " + boundingBox);
```

### See Also

* class [Geometry](../../../aspose.threed.entities/geometry/)
* struct [BoundingBox](../)
* namespace [Aspose.ThreeD.Utilities](../../../aspose.threed.utilities/)
* assembly [Aspose.3D](../../../)


