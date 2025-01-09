---
title: Entity.GetBoundingBox
second_title: Aspose.3D for .NET API Reference
description: Entity method. Gets the bounding box of current entity in its object space coordinate system
type: docs
weight: 50
url: /net/aspose.threed/entity/getboundingbox/
---
## Entity.GetBoundingBox method

Gets the bounding box of current entity in its object space coordinate system.

```csharp
public BoundingBox GetBoundingBox()
```

### Return Value

the bounding box of current entity in its object space coordinate system.

### Examples

The following code shows how to calculate the bounding box of a shape

```csharp
Entity entity = new Sphere() { Radius = 10 };
var bbox = entity.GetBoundingBox();
Console.WriteLine($"The bounding box of the entity is {bbox.Minimum} ~ {bbox.Maximum}");
```

### See Also

* struct [BoundingBox](../../../aspose.threed.utilities/boundingbox/)
* class [Entity](../)
* namespace [Aspose.ThreeD](../../../aspose.threed/)
* assembly [Aspose.3D](../../../)


