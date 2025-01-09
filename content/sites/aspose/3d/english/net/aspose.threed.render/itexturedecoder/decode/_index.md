---
title: ITextureDecoder.Decode
second_title: Aspose.3D for .NET API Reference
description: ITextureDecoder method. Decode texture from stream return null if failed to decode
type: docs
weight: 10
url: /net/aspose.threed.render/itexturedecoder/decode/
---
## ITextureDecoder.Decode method

Decode texture from stream, return null if failed to decode.

```csharp
public TextureData Decode(Stream stream, bool reverseY)
```

| Parameter | Type | Description |
| --- | --- | --- |
| stream | Stream | Texture data source stream |
| reverseY | Boolean | Flip the texture |

### Return Value

Decoded texture data or null if not supported.

### Exceptions

| exception | condition |
| --- | --- |
| IOException | Thrown when failed to read data from stream |

### See Also

* class [TextureData](../../texturedata/)
* interface [ITextureDecoder](../)
* namespace [Aspose.ThreeD.Render](../../../aspose.threed.render/)
* assembly [Aspose.3D](../../../)


