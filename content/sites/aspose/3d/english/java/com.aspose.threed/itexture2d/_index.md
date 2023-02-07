---
title: ITexture2D
second_title: Aspose.3D for Java API Reference
description: 2D texture
type: docs
weight: 230
url: /java/com.aspose.threed/itexture2d/
---

**All Implemented Interfaces:**
[com.aspose.threed.ITextureUnit](../../com.aspose.threed/itextureunit)
```
public interface ITexture2D extends ITextureUnit
```

2D texture
## Methods

| Method | Description |
| --- | --- |
| [load(TextureData bitmap)](#load-com.aspose.threed.TextureData-) | Load texture content from specified Bitmap |
| [save(BufferedImage bitmap)](#save-java.awt.image.BufferedImage-) | Save the texture content to external file. |
| [save(String path, String format)](#save-java.lang.String-java.lang.String-) | Save the texture content to external file. |
| [toBitmap()](#toBitmap--) | Convert the texture unit to java.awt.image.BufferedImage instance |
### load(TextureData bitmap) {#load-com.aspose.threed.TextureData-}
```
public abstract void load(TextureData bitmap)
```


Load texture content from specified Bitmap

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| bitmap | [TextureData](../../com.aspose.threed/texturedata) |  |

### save(BufferedImage bitmap) {#save-java.awt.image.BufferedImage-}
```
public abstract void save(BufferedImage bitmap)
```


Save the texture content to external file.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| bitmap | java.awt.image.BufferedImage | Result bitmap to save. |

### save(String path, String format) {#save-java.lang.String-java.lang.String-}
```
public abstract void save(String path, String format)
```


Save the texture content to external file.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| path | java.lang.String | File name to save. |
| format | java.lang.String | Image format |

### toBitmap() {#toBitmap--}
```
public abstract BufferedImage toBitmap()
```


Convert the texture unit to java.awt.image.BufferedImage instance

**Returns:**
java.awt.image.BufferedImage
