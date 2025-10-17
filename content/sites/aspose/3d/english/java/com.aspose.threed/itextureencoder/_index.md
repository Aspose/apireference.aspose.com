---
title: ITextureEncoder
second_title: Aspose.3D for Java API Reference
description: External texture encoder should implement this interface for encoding.
type: docs
weight: 257
url: /java/com.aspose.threed/itextureencoder/
---
```
public interface ITextureEncoder
```

External texture encoder should implement this interface for encoding.
## Methods

| Method | Description |
| --- | --- |
| [encode(TextureData texture, Stream stream)](#encode-com.aspose.threed.TextureData-com.aspose.threed.Stream-) | Encode texture data into stream |
| [getFileExtension()](#getFileExtension--) | File extension name(without dot) of the this encoder |
### encode(TextureData texture, Stream stream) {#encode-com.aspose.threed.TextureData-com.aspose.threed.Stream-}
```
public abstract void encode(TextureData texture, Stream stream)
```


Encode texture data into stream

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| texture | [TextureData](../../com.aspose.threed/texturedata) | The texture data to be encoded |
| stream | [Stream](../../com.aspose.threed/stream) | The output stream |

### getFileExtension() {#getFileExtension--}
```
public abstract String getFileExtension()
```


File extension name(without dot) of the this encoder

**Returns:**
java.lang.String - File extension name(without dot) of the this encoder
