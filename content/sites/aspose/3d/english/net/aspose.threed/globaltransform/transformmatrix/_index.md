---
title: GlobalTransform.TransformMatrix
second_title: Aspose.3D for .NET API Reference
description: GlobalTransform property. Gets the transform matrix
type: docs
weight: 40
url: /net/aspose.threed/globaltransform/transformmatrix/
---
## GlobalTransform.TransformMatrix property

Gets the transform matrix.

```csharp
public Matrix4 TransformMatrix { get; }
```

### Examples

```csharp
Scene scene = Scene.FromFile("test.fbx");
var tr = scene.RootNode.GlobalTransform;
Console.WriteLine($"Matrix = {tr.TransformMatrix}");
```

### See Also

* struct [Matrix4](../../../aspose.threed.utilities/matrix4/)
* class [GlobalTransform](../)
* namespace [Aspose.ThreeD](../../../aspose.threed/)
* assembly [Aspose.3D](../../../)


