---
title: Struct MaterialChannel
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.GLB.MaterialChannel struct. Represents a material subchannel which usually contains a texture. Use Channels and FindChannel to access it
type: docs
weight: 10490
url: /net/aspose.cad.fileformats.glb/materialchannel/
---
## MaterialChannel structure

Represents a material sub-channel, which usually contains a texture. Use [`Channels`](../material/channels/) and [`FindChannel`](../material/findchannel/) to access it.

```csharp
public struct MaterialChannel
```

## Properties

| Name | Description |
| --- | --- |
| [Color](../../aspose.cad.fileformats.glb/materialchannel/color/) { get; set; } |  |
| [HasDefaultContent](../../aspose.cad.fileformats.glb/materialchannel/hasdefaultcontent/) { get; } |  |
| [Key](../../aspose.cad.fileformats.glb/materialchannel/key/) { get; } |  |
| [LogicalParent](../../aspose.cad.fileformats.glb/materialchannel/logicalparent/) { get; } |  |
| [Parameter](../../aspose.cad.fileformats.glb/materialchannel/parameter/) { get; set; } | Gets or sets the Vector4 parameter of this channel. The meaning of the X, Y. Z and W depend on the type of channel. |
| [Parameters](../../aspose.cad.fileformats.glb/materialchannel/parameters/) { get; } |  |
| [Texture](../../aspose.cad.fileformats.glb/materialchannel/texture/) { get; } | Gets the [`Texture`](./texture/) instance used by this Material, or null. |
| [TextureCoordinate](../../aspose.cad.fileformats.glb/materialchannel/texturecoordinate/) { get; } | Gets the index of texture's TEXCOORD_[index] attribute used for texture coordinate mapping. |
| [TextureSampler](../../aspose.cad.fileformats.glb/materialchannel/texturesampler/) { get; } |  |
| [TextureTransform](../../aspose.cad.fileformats.glb/materialchannel/texturetransform/) { get; } |  |

## Methods

| Name | Description |
| --- | --- |
| [Equals](../../aspose.cad.fileformats.glb/materialchannel/equals/#equals)(MaterialChannel) |  |
| override [Equals](../../aspose.cad.fileformats.glb/materialchannel/equals/#equals_1)(object) |  |
| [GetFactor](../../aspose.cad.fileformats.glb/materialchannel/getfactor/)(string) |  |
| override [GetHashCode](../../aspose.cad.fileformats.glb/materialchannel/gethashcode/)() |  |
| [SetFactor](../../aspose.cad.fileformats.glb/materialchannel/setfactor/)(string, float) |  |
| [SetTexture](../../aspose.cad.fileformats.glb/materialchannel/settexture/#settexture_1)(int, Texture) |  |
| [SetTexture](../../aspose.cad.fileformats.glb/materialchannel/settexture/#settexture)(int, ImageGlb, ImageGlb, TextureWrapMode, TextureWrapMode, TextureMipMapFilter, TextureInterpolationFilter) |  |
| [SetTransform](../../aspose.cad.fileformats.glb/materialchannel/settransform/)(Vector2, Vector2, float, int?) |  |

## Remarks

This structure is not part of the gltf schema, but wraps several components of the material to have an homogeneous and easy to use API.

### See Also

* namespace [Aspose.CAD.FileFormats.GLB](../../aspose.cad.fileformats.glb/)
* assembly [Aspose.CAD](../../)


