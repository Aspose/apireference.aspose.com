---
title: Transform.GeometricScaling
second_title: Aspose.3D for .NET API Reference
description: Transform property. Gets or sets the geometric scaling. Geometric transformation only affects the entities attached and leave the child nodes unaffected. It will be merged as local transformation when you export the geometric transformation to file types that does not support it
type: docs
weight: 30
url: /net/aspose.threed/transform/geometricscaling/
---
## Transform.GeometricScaling property

Gets or sets the geometric scaling. Geometric transformation only affects the entities attached and leave the child nodes unaffected. It will be merged as local transformation when you export the geometric transformation to file types that does not support it.

```csharp
public Vector3 GeometricScaling { get; set; }
```

## Examples

```csharp
Node node = new Node();
node.Transform.GeometricScaling = new Vector3(2, 2, 2);
```

### See Also

* struct [Vector3](../../../aspose.threed.utilities/vector3/)
* class [Transform](../)
* namespace [Aspose.ThreeD](../../transform/)
* assembly [Aspose.3D](../../../)


