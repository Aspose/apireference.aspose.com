---
title: GlobalTransform.Translation
second_title: Aspose.3D for .NET API Reference
description: GlobalTransform property. Gets the translation
type: docs
weight: 50
url: /net/aspose.threed/globaltransform/translation/
---
## GlobalTransform.Translation property

Gets the translation

```csharp
public Vector3 Translation { get; }
```

## Examples

```csharp
Scene scene = Scene.FromFile("test.fbx");
var tr = scene.RootNode.GlobalTransform;
Console.WriteLine($"Translation = {tr.Translation}");
```

### See Also

* struct [Vector3](../../../aspose.threed.utilities/vector3/)
* class [GlobalTransform](../)
* namespace [Aspose.ThreeD](../../globaltransform/)
* assembly [Aspose.3D](../../../)


