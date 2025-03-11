---
title: GlobalTransform.Scale
second_title: Aspose.3D for .NET API Reference
description: GlobalTransform property. Gets the scale
type: docs
weight: 30
url: /net/aspose.threed/globaltransform/scale/
---
## GlobalTransform.Scale property

Gets the scale

```csharp
public Vector3 Scale { get; }
```

## Examples

```csharp
Scene scene = Scene.FromFile("test.fbx");
var tr = scene.RootNode.GlobalTransform;
Console.WriteLine($"Scale = {tr.Scale}");
```

### See Also

* struct [Vector3](../../../aspose.threed.utilities/vector3/)
* class [GlobalTransform](../)
* namespace [Aspose.ThreeD](../../globaltransform/)
* assembly [Aspose.3D](../../../)


