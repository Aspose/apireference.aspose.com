---
title: ITextureCubemap
second_title: Aspose.3D for Java API Reference
description: Cube map texture
type: docs
weight: 231
url: /java/com.aspose.threed/itexturecubemap/
---

**All Implemented Interfaces:**
[com.aspose.threed.ITextureUnit](../../com.aspose.threed/itextureunit)
```
public interface ITextureCubemap extends ITextureUnit
```

Cube map texture
## Methods

| Method | Description |
| --- | --- |
| [load(CubeFace face, TextureData data)](#load-com.aspose.threed.CubeFace-com.aspose.threed.TextureData-) | Load the data into specified face |
| [load(CubeFaceData<TextureData> data)](#load-com.aspose.threed.CubeFaceData-com.aspose.threed.TextureData--) | Load texture content from specified [TextureData](../../com.aspose.threed/texturedata) |
| [loadFromFiles(CubeFaceData<String> fileNames)](#loadFromFiles-com.aspose.threed.CubeFaceData-java.lang.String--) | Load texture content from specified files |
| [save(CubeFace side, BufferedImage bitmap)](#save-com.aspose.threed.CubeFace-java.awt.image.BufferedImage-) | Save the specified side to memory |
| [save(CubeFaceData<BufferedImage> bitmap)](#save-com.aspose.threed.CubeFaceData-java.awt.image.BufferedImage--) | Save the texture content to memory. |
| [save(CubeFaceData<String> path, String format)](#save-com.aspose.threed.CubeFaceData-java.lang.String--java.lang.String-) | Save the cube's sides texture content to external files. |
| [toBitmap(CubeFace side)](#toBitmap-com.aspose.threed.CubeFace-) | Convert the texture unit to java.awt.image.BufferedImage instance |
### load(CubeFace face, TextureData data) {#load-com.aspose.threed.CubeFace-com.aspose.threed.TextureData-}
```
public abstract void load(CubeFace face, TextureData data)
```


Load the data into specified face

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| face | [CubeFace](../../com.aspose.threed/cubeface) |  |
| data | [TextureData](../../com.aspose.threed/texturedata) |  |

### load(CubeFaceData<TextureData> data) {#load-com.aspose.threed.CubeFaceData-com.aspose.threed.TextureData--}
```
public abstract void load(CubeFaceData<TextureData> data)
```


Load texture content from specified [TextureData](../../com.aspose.threed/texturedata)

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| data | com.aspose.threed.CubeFaceData<com.aspose.threed.TextureData> |  |

### loadFromFiles(CubeFaceData<String> fileNames) {#loadFromFiles-com.aspose.threed.CubeFaceData-java.lang.String--}
```
public abstract void loadFromFiles(CubeFaceData<String> fileNames)
```


Load texture content from specified files

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fileNames | com.aspose.threed.CubeFaceData<java.lang.String> |  |

### save(CubeFace side, BufferedImage bitmap) {#save-com.aspose.threed.CubeFace-java.awt.image.BufferedImage-}
```
public abstract void save(CubeFace side, BufferedImage bitmap)
```


Save the specified side to memory

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| side | [CubeFace](../../com.aspose.threed/cubeface) |  |
| bitmap | java.awt.image.BufferedImage |  |

### save(CubeFaceData<BufferedImage> bitmap) {#save-com.aspose.threed.CubeFaceData-java.awt.image.BufferedImage--}
```
public abstract void save(CubeFaceData<BufferedImage> bitmap)
```


Save the texture content to memory.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| bitmap | com.aspose.threed.CubeFaceData<java.awt.image.BufferedImage> | Result bitmap to save. |

### save(CubeFaceData<String> path, String format) {#save-com.aspose.threed.CubeFaceData-java.lang.String--java.lang.String-}
```
public abstract void save(CubeFaceData<String> path, String format)
```


Save the cube's sides texture content to external files.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| path | com.aspose.threed.CubeFaceData<java.lang.String> | File names to save. |
| format | java.lang.String | Image format |

### toBitmap(CubeFace side) {#toBitmap-com.aspose.threed.CubeFace-}
```
public abstract BufferedImage toBitmap(CubeFace side)
```


Convert the texture unit to java.awt.image.BufferedImage instance

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| side | [CubeFace](../../com.aspose.threed/cubeface) |  |

**Returns:**
java.awt.image.BufferedImage
