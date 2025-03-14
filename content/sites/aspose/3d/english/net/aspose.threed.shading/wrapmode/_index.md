---
title: Enum WrapMode
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Shading.WrapMode enum. Textures wrap mode
type: docs
weight: 2540
url: /net/aspose.threed.shading/wrapmode/
---
## WrapMode enumeration

Texture's wrap mode.

```csharp
public enum WrapMode
```

### Values

| Name | Value | Description |
| --- | --- | --- |
| Wrap | `0` | Tiles the texture on the model's surface, creating a repeating pattern. |
| Clamp | `1` | Clamps the texture to the last pixel at the border. |
| Mirror | `2` | The texture will be repeated, but it will be mirrored when the integer part of the coordinate is odd. |
| MirrorOnce | `3` | The texture will be mirrored once, and then clamps to the maximum value. |
| Border | `4` | The coordinates that outside of the range [0.0, 1.0] are set to a specified border color. |

### See Also

* namespace [Aspose.ThreeD.Shading](../../aspose.threed.shading/)
* assembly [Aspose.3D](../../)


