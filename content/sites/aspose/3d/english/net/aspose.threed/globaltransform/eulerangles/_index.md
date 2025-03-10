---
title: GlobalTransform.EulerAngles
second_title: Aspose.3D for .NET API Reference
description: GlobalTransform property. Gets the rotation represented in Euler angles measured in degree
type: docs
weight: 10
url: /net/aspose.threed/globaltransform/eulerangles/
---
## GlobalTransform.EulerAngles property

Gets the rotation represented in Euler angles, measured in degree

```csharp
public Vector3 EulerAngles { get; }
```

## Examples

```csharp
Scene scene = Scene.FromFile("test.fbx");
var tr = scene.RootNode.GlobalTransform;
Console.WriteLine($"EulerAngles = {tr.EulerAngles}");
```

### See Also

* struct [Vector3](../../../aspose.threed.utilities/vector3/)
* class [GlobalTransform](../)
* namespace [Aspose.ThreeD](../../globaltransform/)
* assembly [Aspose.3D](../../../)


