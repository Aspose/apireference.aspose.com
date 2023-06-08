---
title: Enum EnumFxSamplerWrap
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.Collada.FileParser.Elements.EnumFxSamplerWrap enum. The enumeration FX sampler wrap
type: docs
weight: 7410
url: /net/aspose.cad.fileformats.collada.fileparser.elements/enumfxsamplerwrap/
---
## EnumFxSamplerWrap enumeration

The enumeration FX sampler wrap.

```csharp
public enum EnumFxSamplerWrap
```

### Values

| Name | Value | Description |
| --- | --- | --- |
| WRAP | `0` | The wrap. Tile the texture at every integer junction. For example, for u values between 0 and 3, the texture is repeated three times; no mirroring is performed. |
| CLAMP | `1` | The clamp. Same as CLAMP_TO_EDGE. Texture coordinates reaching or exceeding the range [0.0, 1.0] are set just within 0.0 or 1.0 so that the boarder is not sampled. |
| BORDER | `2` | The border. Much like clamp except texture coordinates outside the range [0.0, 1.0] are set to the border color. |
| MIRROR | `3` | The mirror. Texture is flipped at every integer junction. For u values between 0 and 1, for example, the texture is addressed normally; between 1 and 2, the texture is flipped (mirrored); between 2 and 3, the texture is normal again; and so on. |
| MIRROR_ONCE | `4` | The mirror once. Takes the absolute value of the texture coordinate (thus, mirroring around 0), and then clamps to the maximum value. |

### See Also

* namespace [Aspose.CAD.FileFormats.Collada.FileParser.Elements](../../aspose.cad.fileformats.collada.fileparser.elements/)
* assembly [Aspose.CAD](../../)


