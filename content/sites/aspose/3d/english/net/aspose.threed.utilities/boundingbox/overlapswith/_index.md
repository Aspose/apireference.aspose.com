---
title: BoundingBox.OverlapsWith
second_title: Aspose.3D for .NET API Reference
description: BoundingBox method. Check if current bounding box overlaps with specified bounding box
type: docs
weight: 140
url: /net/aspose.threed.utilities/boundingbox/overlapswith/
---
## BoundingBox.OverlapsWith method

Check if current bounding box overlaps with specified bounding box.

```csharp
public bool OverlapsWith(BoundingBox box)
```

| Parameter | Type | Description |
| --- | --- | --- |
| box | BoundingBox | The other bounding box to test |

### Return Value

True if the current bounding box overlaps with the given one.

### Examples

The following code shows how to check if two bounding boxes overlaps with each other.

```csharp
var boundingBox = new BoundingBox(0, 0, 0, 10, 10, 10);
var bbox2 = new BoundingBox(1, 1, 1, 11, 11, 11);
Console.WriteLine("Bounding box overlaps = " + boundingBox.OverlapsWith(bbox2));
```

### See Also

* struct [BoundingBox](../)
* namespace [Aspose.ThreeD.Utilities](../../../aspose.threed.utilities/)
* assembly [Aspose.3D](../../../)


