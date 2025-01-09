---
title: IOConfig.LookupPaths
second_title: Aspose.3D for .NET API Reference
description: IOConfig property. Some files like OBJ depends on external file the lookup paths will allows Aspose.3D to look for external file to load
type: docs
weight: 50
url: /net/aspose.threed.formats/ioconfig/lookuppaths/
---
## IOConfig.LookupPaths property

Some files like OBJ depends on external file, the lookup paths will allows Aspose.3D to look for external file to load.

```csharp
public List<string> LookupPaths { get; set; }
```

### Examples

The following code shows how to manually specify the look up textures, so the importer can find

```csharp
var opt = new ObjLoadOptions();
//Specify the lookup paths, so the textures can be located.
opt.LookupPaths.Add("textures");
var scene = Scene.FromFile("input.obj", opt);
scene.Save("output.glb");
```

### See Also

* class [IOConfig](../)
* namespace [Aspose.ThreeD.Formats](../../../aspose.threed.formats/)
* assembly [Aspose.3D](../../../)


