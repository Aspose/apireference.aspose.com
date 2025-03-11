---
title: GlobalTransform.Rotation
second_title: Aspose.3D for .NET API Reference
description: GlobalTransform property. Gets the rotation represented in quaternion
type: docs
weight: 20
url: /net/aspose.threed/globaltransform/rotation/
---
## GlobalTransform.Rotation property

Gets the rotation represented in quaternion.

```csharp
public Quaternion Rotation { get; }
```

## Examples

```csharp
Scene scene = Scene.FromFile("test.fbx");
var tr = scene.RootNode.GlobalTransform;
Console.WriteLine($"Rotation = {tr.Rotation}");
```

### See Also

* struct [Quaternion](../../../aspose.threed.utilities/quaternion/)
* class [GlobalTransform](../)
* namespace [Aspose.ThreeD](../../globaltransform/)
* assembly [Aspose.3D](../../../)


