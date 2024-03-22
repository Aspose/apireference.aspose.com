---
title: Enum BlendFactor
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Render.BlendFactor enum. Blend factor specify pixel arithmetic
type: docs
weight: 790
url: /net/aspose.threed.render/blendfactor/
---
## BlendFactor enumeration

Blend factor specify pixel arithmetic.

```csharp
public enum BlendFactor
```

### Values

| Name | Value | Description |
| --- | --- | --- |
| Zero | `0` | The blend factor is vec4(0) |
| One | `1` | The blend factor is vec4(1) |
| SrcColor | `2` | The blend factor is src.rgba |
| OneMinusSrcColor | `3` | The blend factor is vec4(1) - src.rgba |
| DstColor | `4` | The blend factor is dst.rgba |
| OneMinusDstColor | `5` | The blend factor is vec4(1) - dst.rgba |
| SrcAlpha | `6` | The blend factor is vec4(src.a) |
| OneMinusSrcAlpha | `7` | The blend factor is vec4(1 - src.a) |
| DstAlpha | `8` | The blend factor is vec4(dst.a) |
| OneMinusDstAlpha | `9` | The blend factor is vec4(1 - dst.a) |
| ConstantColor | `10` | The blend factor is c where c is specified in [`BlendColor`](../renderstate/blendcolor/) |
| OneMinusConstantColor | `11` | The blend factor is vec4(1) - c where c is specified in [`BlendColor`](../renderstate/blendcolor/) |
| ConstantAlpha | `12` | The blend factor is vec4(c.a) where c is specified in [`BlendColor`](../renderstate/blendcolor/) |
| OneMinusConstantAlpha | `13` | The blend factor is vec4(1 - c.a) where c is specified in [`BlendColor`](../renderstate/blendcolor/) |
| SrcAlphaSaturate | `14` | The blend factor is min(src.a, 1 - dst.a) |

### See Also

* namespace [Aspose.ThreeD.Render](../../aspose.threed.render/)
* assembly [Aspose.3D](../../)


