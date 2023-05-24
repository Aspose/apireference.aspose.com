---
title: EnumFxSamplerWrap enumeration
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 1300
url: /aspose.cad.fileformats.collada.fileparser.elements/enumfxsamplerwrap/
is_root: false
---

## EnumFxSamplerWrap enumeration

The enumeration FX sampler wrap.



The EnumFxSamplerWrap type exposes the following members:

### Fields
| Field | Description |
| :- | :- |
| WRAP | The wrap.<br/>Tile the texture at every integer junction.<br/>For example, for u values between 0 and 3, the texture is repeated three times; no mirroring is performed. |
| CLAMP | The clamp.<br/>Same as CLAMP_TO_EDGE.<br/>Texture coordinates reaching or exceeding the range [0.0, 1.0] are set just within 0.0 or 1.0 so that the boarder is not sampled. |
| BORDER | The border.<br/>Much like clamp except texture coordinates outside the range [0.0, 1.0] are set to the border color. |
| MIRROR | The mirror.<br/>Texture is flipped at every integer junction.<br/>For u values between 0 and 1, for example, the texture is addressed normally; between 1 and 2, the texture is flipped (mirrored); between 2 and 3, the texture is normal again; and so on. |
| MIRROR_ONCE | The mirror once.<br/>Takes the absolute value of the texture coordinate (thus, mirroring around 0), and then clamps to the maximum value. |



### See Also
* module [`aspose.cad.fileformats.collada.fileparser.elements`](..)
