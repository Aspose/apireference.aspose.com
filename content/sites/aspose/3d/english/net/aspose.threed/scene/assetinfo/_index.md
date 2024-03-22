---
title: Scene.AssetInfo
second_title: Aspose.3D for .NET API Reference
description: Scene property. Gets or sets the toplevel asset information
type: docs
weight: 50
url: /net/aspose.threed/scene/assetinfo/
---
## Scene.AssetInfo property

Gets or sets the top-level asset information

```csharp
public AssetInfo AssetInfo { get; set; }
```

### Property Value

The document info.

### Examples

The following code shows how to read the application information from a FBX file:

```csharp
Scene scene = Scene.FromFile("test.fbx");
Console.WriteLine($"The FBX file is created by {scene.AssetInfo.ApplicationName} {scene.AssetInfo.ApplicationVersion}");
```

### See Also

* class [AssetInfo](../../assetinfo/)
* class [Scene](../)
* namespace [Aspose.ThreeD](../../../aspose.threed/)
* assembly [Aspose.3D](../../../)


