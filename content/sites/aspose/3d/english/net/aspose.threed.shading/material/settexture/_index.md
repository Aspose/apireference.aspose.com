---
title: Material.SetTexture
second_title: Aspose.3D for .NET API Reference
description: Material method. Sets the texture to specified slot
type: docs
weight: 30
url: /net/aspose.threed.shading/material/settexture/
---
## Material.SetTexture method

Sets the texture to specified slot

```csharp
public void SetTexture(string slotName, TextureBase texture)
```

| Parameter | Type | Description |
| --- | --- | --- |
| slotName | String | Slot name. |
| texture | TextureBase | Texture. |

## Examples

```csharp
var mat = new LambertMaterial();
var tex = new Texture();
tex.FileName = "diffuse.png";
mat.SetTexture(Material.MapNormal, tex);
```

### See Also

* class [TextureBase](../../texturebase/)
* class [Material](../)
* namespace [Aspose.ThreeD.Shading](../../material/)
* assembly [Aspose.3D](../../../)


