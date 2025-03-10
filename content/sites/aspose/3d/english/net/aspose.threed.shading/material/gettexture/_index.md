---
title: Material.GetTexture
second_title: Aspose.3D for .NET API Reference
description: Material method. Gets the texture from the specified slot it can be materials property name or shaders parameter name
type: docs
weight: 20
url: /net/aspose.threed.shading/material/gettexture/
---
## Material.GetTexture method

Gets the texture from the specified slot, it can be material's property name or shader's parameter name

```csharp
public TextureBase GetTexture(string slotName)
```

| Parameter | Type | Description |
| --- | --- | --- |
| slotName | String | Slot name. |

### Return Value

The texture.

## Examples

```csharp
var mat = new LambertMaterial();
var tex = new Texture();
tex.FileName = "diffuse.png";
mat.SetTexture(Material.MapDiffuse, tex);
tex = (Texture)mat.GetTexture(Material.MapDiffuse);
```

### See Also

* class [TextureBase](../../texturebase/)
* class [Material](../)
* namespace [Aspose.ThreeD.Shading](../../material/)
* assembly [Aspose.3D](../../../)


