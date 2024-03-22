---
title: Transform.SetGeometricScaling
second_title: Aspose.3D for .NET API Reference
description: Transform method. Sets the geometric scaling. Geometric transformation only affects the entities attached and leave the child nodes unaffected. It will be merged as local transformation when you export the geometric transformation to file types that does not support it
type: docs
weight: 170
url: /net/aspose.threed/transform/setgeometricscaling/
---
## Transform.SetGeometricScaling method

Sets the geometric scaling. Geometric transformation only affects the entities attached and leave the child nodes unaffected. It will be merged as local transformation when you export the geometric transformation to file types that does not support it.

```csharp
public Transform SetGeometricScaling(double sx, double sy, double sz)
```

### Examples

```csharp
Node node = new Node();
node.Transform.SetGeometricScaling(2, 2, 2);
```

### See Also

* class [Transform](../)
* namespace [Aspose.ThreeD](../../../aspose.threed/)
* assembly [Aspose.3D](../../../)


