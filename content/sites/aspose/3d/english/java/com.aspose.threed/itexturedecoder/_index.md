---
title: ITextureDecoder
second_title: Aspose.3D for Java API Reference
description: External texture decoder should implement this interface for decoding.
type: docs
weight: 240
url: /java/com.aspose.threed/itexturedecoder/
---
```
public interface ITextureDecoder
```

External texture decoder should implement this interface for decoding.
## Methods

| Method | Description |
| --- | --- |
| [decode(Stream stream, boolean reverseY)](#decode-com.aspose.csporter.helpers.Stream-boolean-) | Decode texture from stream, return null if failed to decode. |
### decode(Stream stream, boolean reverseY) {#decode-com.aspose.csporter.helpers.Stream-boolean-}
```
public abstract TextureData decode(Stream stream, boolean reverseY)
```


Decode texture from stream, return null if failed to decode.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| stream | com.aspose.csporter.helpers.Stream | Texture data source stream |
| reverseY | boolean | Flip the texture |

**Returns:**
[TextureData](../../com.aspose.threed/texturedata) - Decoded texture data or null if not supported.
