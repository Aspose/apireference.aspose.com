---
title: Transform.GeometricRotation
second_title: Aspose.3D for .NET API Reference
description: Transform property. Gets or sets the geometric Euler rotationmeasured in degree. Geometric transformation only affects the entities attached and leave the child nodes unaffected. It will be merged as local transformation when you export the geometric transformation to file types that does not support it
type: docs
weight: 20
url: /net/aspose.threed/transform/geometricrotation/
---
## Transform.GeometricRotation property

Gets or sets the geometric Euler rotation(measured in degree). Geometric transformation only affects the entities attached and leave the child nodes unaffected. It will be merged as local transformation when you export the geometric transformation to file types that does not support it.

```csharp
public Vector3 GeometricRotation { get; set; }
```

### Examples

```csharp
Node node = new Node();
node.getTransform().setGeometricRotation(new Vector3(90, 0, 0));
```

### See Also

* struct [Vector3](../../../aspose.threed.utilities/vector3/)
* class [Transform](../)
* namespace [Aspose.ThreeD](../../../aspose.threed/)
* assembly [Aspose.3D](../../../)


