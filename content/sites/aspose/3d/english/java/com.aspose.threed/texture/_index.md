---
title: Texture
second_title: Aspose.3D for Java API Reference
description: This class defines the texture from an external file.
type: docs
weight: 165
url: /java/com.aspose.threed/texture/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.A3DObject](../../com.aspose.threed/a3dobject), [com.aspose.threed.TextureBase](../../com.aspose.threed/texturebase)
```
public class Texture extends TextureBase
```

This class defines the texture from an external file.
## Constructors

| Constructor | Description |
| --- | --- |
| [Texture()](#Texture--) | Initializes a new instance of the com.aspose.threed.Texture class. |
| [Texture(String name)](#Texture-java.lang.String-) | Initializes a new instance of the com.aspose.threed.Texture class. |
## Methods

| Method | Description |
| --- | --- |
| [getEnableMipMap()](#getEnableMipMap--) | Gets if the mipmap is enabled for this texture |
| [setEnableMipMap(boolean value)](#setEnableMipMap-boolean-) | Sets if the mipmap is enabled for this texture |
| [getContent()](#getContent--) | Gets the binary content of the texture. |
| [setContent(byte[] value)](#setContent-byte---) | Sets the binary content of the texture. |
| [getFileName()](#getFileName--) | Gets the associated texture file. |
| [setFileName(String value)](#setFileName-java.lang.String-) | Sets the associated texture file. |
### Texture() {#Texture--}
```
public Texture()
```


Initializes a new instance of the com.aspose.threed.Texture class.

### Texture(String name) {#Texture-java.lang.String-}
```
public Texture(String name)
```


Initializes a new instance of the com.aspose.threed.Texture class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String | Name |

### getEnableMipMap() {#getEnableMipMap--}
```
public boolean getEnableMipMap()
```


Gets if the mipmap is enabled for this texture

**Returns:**
boolean
### setEnableMipMap(boolean value) {#setEnableMipMap-boolean-}
```
public void setEnableMipMap(boolean value)
```


Sets if the mipmap is enabled for this texture

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

### getContent() {#getContent--}
```
public byte[] getContent()
```


Gets the binary content of the texture. The embedded texture content is optional, user should load texture from external file if this is missing.

**Returns:**
byte[]
### setContent(byte[] value) {#setContent-byte---}
```
public void setContent(byte[] value)
```


Sets the binary content of the texture. The embedded texture content is optional, user should load texture from external file if this is missing.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | byte[] | New value |

### getFileName() {#getFileName--}
```
public String getFileName()
```


Gets the associated texture file.

**Returns:**
java.lang.String
### setFileName(String value) {#setFileName-java.lang.String-}
```
public void setFileName(String value)
```


Sets the associated texture file.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New value |

