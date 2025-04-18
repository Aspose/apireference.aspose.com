---
title: BoundingBox.Contains
second_title: Aspose.3D for .NET API Reference
description: BoundingBox method. Check if the point p is inside the bounding box
type: docs
weight: 100
url: /net/aspose.threed.utilities/boundingbox/contains/
---
## Contains(Vector3) {#contains_1}

Check if the point p is inside the bounding box

```csharp
public bool Contains(Vector3 p)
```

| Parameter | Type | Description |
| --- | --- | --- |
| p | Vector3 | The point to test |

### Return Value

True if the point is inside the bounding box

## Examples

The following code shows how to check if a point is inside the bounding box.

```csharp
var boundingBox = new BoundingBox(0, 0, 0, 10, 10, 10);
var pt = new Vector3(4, 4, 4);
Console.WriteLine("Bounding box overlaps = " + boundingBox.Contains(pt));
```

### See Also

* struct [Vector3](../../vector3/)
* struct [BoundingBox](../)
* namespace [Aspose.ThreeD.Utilities](../../boundingbox/)
* assembly [Aspose.3D](../../../)

---

## Contains(BoundingBox) {#contains}

The bounding box to check if it's inside current bounding box.

```csharp
public bool Contains(BoundingBox bbox)
```

| Parameter | Type | Description |
| --- | --- | --- |
| bbox | BoundingBox |  |

### See Also

* struct [BoundingBox](../)
* namespace [Aspose.ThreeD.Utilities](../../boundingbox/)
* assembly [Aspose.3D](../../../)


