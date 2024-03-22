---
title: Transform.SetGeometricTranslation
second_title: Aspose.3D for .NET API Reference
description: Transform method. Sets the geometric translation. Geometric transformation only affects the entities attached and leave the child nodes unaffected. It will be merged as local transformation when you export the geometric transformation to file types that does not support it
type: docs
weight: 180
url: /net/aspose.threed/transform/setgeometrictranslation/
---
## Transform.SetGeometricTranslation method

Sets the geometric translation. Geometric transformation only affects the entities attached and leave the child nodes unaffected. It will be merged as local transformation when you export the geometric transformation to file types that does not support it.

```csharp
public Transform SetGeometricTranslation(double x, double y, double z)
```

### Examples

```csharp
Node node = new Node();
node.Transform.SetGeometricTranslation(10, 0, 0);
```

### See Also

* class [Transform](../)
* namespace [Aspose.ThreeD](../../../aspose.threed/)
* assembly [Aspose.3D](../../../)


