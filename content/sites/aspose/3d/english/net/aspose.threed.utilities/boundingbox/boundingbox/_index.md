---
title: BoundingBox.BoundingBox
second_title: Aspose.3D for .NET API Reference
description: BoundingBox constructor. Initialize a finite bounding box with given minimum and maximum corner
type: docs
weight: 10
url: /net/aspose.threed.utilities/boundingbox/boundingbox/
---
## BoundingBox(Vector3, Vector3) {#constructor}

Initialize a finite bounding box with given minimum and maximum corner

```csharp
public BoundingBox(Vector3 minimum, Vector3 maximum)
```

| Parameter | Type | Description |
| --- | --- | --- |
| minimum | Vector3 | The minimum corner |
| maximum | Vector3 | The maximum corner |

### Examples

The following code shows how to construct a bounding box from minimum and maximum corners.

```csharp
var minimum = new Vector3(0, 0, 0);
var maximum = new Vector3(10, 10, 10);
var boundingBox = new BoundingBox(minimum, maximum);
Console.WriteLine("Bounding box = " + boundingBox);
```

### See Also

* struct [Vector3](../../vector3/)
* struct [BoundingBox](../)
* namespace [Aspose.ThreeD.Utilities](../../../aspose.threed.utilities/)
* assembly [Aspose.3D](../../../)

---

## BoundingBox(double, double, double, double, double, double) {#constructor_1}

Initialize a finite bounding box with given minimum and maximum corner

```csharp
public BoundingBox(double minX, double minY, double minZ, double maxX, double maxY, double maxZ)
```

### Examples

The following code shows how to construct a bounding box from minimum and maximum corners.

```csharp
var boundingBox = new BoundingBox(0, 0, 0, 10, 10, 10);
Console.WriteLine("Bounding box = " + boundingBox);
```

### See Also

* struct [BoundingBox](../)
* namespace [Aspose.ThreeD.Utilities](../../../aspose.threed.utilities/)
* assembly [Aspose.3D](../../../)


