---
title: GlbData.UseTextureSampler
second_title: Aspose.CAD for .NET API Reference
description: GlbData method. Creates or reuses a TextureSampler instance at GlbImage.LogicalTextureSamplers
type: docs
weight: 530
url: /net/aspose.cad.fileformats.glb/glbdata/usetexturesampler/
---
## GlbData.UseTextureSampler method

Creates or reuses a [`TextureSampler`](../../texturesampler/) instance at !:GlbImage.LogicalTextureSamplers.

```csharp
public TextureSampler UseTextureSampler(TextureWrapMode ws, TextureWrapMode wt, 
    TextureMipMapFilter min, TextureInterpolationFilter mag)
```

| Parameter | Type | Description |
| --- | --- | --- |
| ws | TextureWrapMode | The [`TextureWrapMode`](../../texturewrapmode/) in the S axis. |
| wt | TextureWrapMode | The [`TextureWrapMode`](../../texturewrapmode/) in the T axis. |
| min | TextureMipMapFilter | A value of [`TextureMipMapFilter`](../../texturemipmapfilter/). |
| mag | TextureInterpolationFilter | A value of [`TextureInterpolationFilter`](../../textureinterpolationfilter/). |

### Return Value

A [`TextureSampler`](../../texturesampler/) instance, or null if all the arguments are default values.

### See Also

* class [TextureSampler](../../texturesampler/)
* enum [TextureWrapMode](../../texturewrapmode/)
* enum [TextureMipMapFilter](../../texturemipmapfilter/)
* enum [TextureInterpolationFilter](../../textureinterpolationfilter/)
* class [GlbData](../)
* namespace [Aspose.CAD.FileFormats.GLB](../../glbdata/)
* assembly [Aspose.CAD](../../../)


