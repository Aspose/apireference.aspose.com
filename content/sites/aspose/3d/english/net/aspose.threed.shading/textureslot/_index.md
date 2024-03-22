---
title: Class TextureSlot
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Shading.TextureSlot class. Texture slot in Material can be enumerated through material instance
type: docs
weight: 310
url: /net/aspose.threed.shading/textureslot/
---
## TextureSlot class

Texture slot in [`Material`](../material/), can be enumerated through material instance.

```csharp
public class TextureSlot
```

## Properties

| Name | Description |
| --- | --- |
| [SlotName](../../aspose.threed.shading/textureslot/slotname/) { get; } | The slot name that indicates where this texture will be bounded to. |
| [Texture](../../aspose.threed.shading/textureslot/texture/) { get; } | The texture that will be bounded to the material. |

### Examples

```csharp
var mat = new LambertMaterial();
var tex = new Texture();
tex.FileName = "diffuse.png";
mat.SetTexture(Material.MapDiffuse, tex);
foreach(var slot in mat)
{
    Console.WriteLine($"Texture slot {slot.SlotName} = {slot.Texture}");
}
```

### See Also

* namespace [Aspose.ThreeD.Shading](../../aspose.threed.shading/)
* assembly [Aspose.3D](../../)


