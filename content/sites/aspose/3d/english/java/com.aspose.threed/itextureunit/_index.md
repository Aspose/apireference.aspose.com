---
title: ITextureUnit
second_title: Aspose.3D for Java API Reference
description: com.aspose.threed.ITextureUnit represents a texture in the memory that shared between GPU and CPU and can be sampled by the shader
 where the com.aspose.threed.Texture only represents a reference to an external file.
type: docs
weight: 232
url: /java/com.aspose.threed/itextureunit/
---

**All Implemented Interfaces:**
java.io.Closeable
```
public interface ITextureUnit extends Closeable
```

com.aspose.threed.ITextureUnit represents a texture in the memory that shared between GPU and CPU and can be sampled by the shader, where the com.aspose.threed.Texture only represents a reference to an external file. More details can be found https://en.wikipedia.org/wiki/Texture\_mapping\_unit
## Methods

| Method | Description |
| --- | --- |
| [getType()](#getType--) | Gets the type of this texture unit. |
| [getWidth()](#getWidth--) | Gets the width of this texture. |
| [getHeight()](#getHeight--) | Gets the height of this texture. |
| [getDepth()](#getDepth--) | Gets the height of this texture, for none-3D texture it's always 1. |
| [getUWrap()](#getUWrap--) | Gets the wrap mode for texture's U coordinate. |
| [setUWrap(WrapMode value)](#setUWrap-com.aspose.threed.WrapMode-) | Sets the wrap mode for texture's U coordinate. |
| [getVWrap()](#getVWrap--) | Gets the wrap mode for texture's V coordinate. |
| [setVWrap(WrapMode value)](#setVWrap-com.aspose.threed.WrapMode-) | Sets the wrap mode for texture's V coordinate. |
| [getWWrap()](#getWWrap--) | Gets the wrap mode for texture's W coordinate. |
| [setWWrap(WrapMode value)](#setWWrap-com.aspose.threed.WrapMode-) | Sets the wrap mode for texture's W coordinate. |
| [getMinification()](#getMinification--) | Gets the filter mode for minification. |
| [setMinification(TextureFilter value)](#setMinification-com.aspose.threed.TextureFilter-) | Sets the filter mode for minification. |
| [getMagnification()](#getMagnification--) | Gets the filter mode for magnification. |
| [setMagnification(TextureFilter value)](#setMagnification-com.aspose.threed.TextureFilter-) | Sets the filter mode for magnification. |
| [getMipmap()](#getMipmap--) | Gets the filter mode for mipmap. |
| [setMipmap(TextureFilter value)](#setMipmap-com.aspose.threed.TextureFilter-) | Sets the filter mode for mipmap. |
| [getScroll()](#getScroll--) | Gets the scroll of the UV coordinate. |
| [setScroll(Vector2 value)](#setScroll-com.aspose.threed.Vector2-) | Sets the scroll of the UV coordinate. |
| [getScale()](#getScale--) | Gets the scale of the UV coordinate. |
| [setScale(Vector2 value)](#setScale-com.aspose.threed.Vector2-) | Sets the scale of the UV coordinate. |
### getType() {#getType--}
```
public abstract TextureType getType()
```


Gets the type of this texture unit.

**Returns:**
[TextureType](../../com.aspose.threed/texturetype)
### getWidth() {#getWidth--}
```
public abstract int getWidth()
```


Gets the width of this texture.

**Returns:**
int
### getHeight() {#getHeight--}
```
public abstract int getHeight()
```


Gets the height of this texture.

**Returns:**
int
### getDepth() {#getDepth--}
```
public abstract int getDepth()
```


Gets the height of this texture, for none-3D texture it's always 1.

**Returns:**
int
### getUWrap() {#getUWrap--}
```
public abstract WrapMode getUWrap()
```


Gets the wrap mode for texture's U coordinate.

**Returns:**
[WrapMode](../../com.aspose.threed/wrapmode)
### setUWrap(WrapMode value) {#setUWrap-com.aspose.threed.WrapMode-}
```
public abstract void setUWrap(WrapMode value)
```


Sets the wrap mode for texture's U coordinate.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [WrapMode](../../com.aspose.threed/wrapmode) | New value |

### getVWrap() {#getVWrap--}
```
public abstract WrapMode getVWrap()
```


Gets the wrap mode for texture's V coordinate.

**Returns:**
[WrapMode](../../com.aspose.threed/wrapmode)
### setVWrap(WrapMode value) {#setVWrap-com.aspose.threed.WrapMode-}
```
public abstract void setVWrap(WrapMode value)
```


Sets the wrap mode for texture's V coordinate.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [WrapMode](../../com.aspose.threed/wrapmode) | New value |

### getWWrap() {#getWWrap--}
```
public abstract WrapMode getWWrap()
```


Gets the wrap mode for texture's W coordinate.

**Returns:**
[WrapMode](../../com.aspose.threed/wrapmode)
### setWWrap(WrapMode value) {#setWWrap-com.aspose.threed.WrapMode-}
```
public abstract void setWWrap(WrapMode value)
```


Sets the wrap mode for texture's W coordinate.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [WrapMode](../../com.aspose.threed/wrapmode) | New value |

### getMinification() {#getMinification--}
```
public abstract TextureFilter getMinification()
```


Gets the filter mode for minification.

**Returns:**
[TextureFilter](../../com.aspose.threed/texturefilter)
### setMinification(TextureFilter value) {#setMinification-com.aspose.threed.TextureFilter-}
```
public abstract void setMinification(TextureFilter value)
```


Sets the filter mode for minification.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [TextureFilter](../../com.aspose.threed/texturefilter) | New value |

### getMagnification() {#getMagnification--}
```
public abstract TextureFilter getMagnification()
```


Gets the filter mode for magnification.

**Returns:**
[TextureFilter](../../com.aspose.threed/texturefilter)
### setMagnification(TextureFilter value) {#setMagnification-com.aspose.threed.TextureFilter-}
```
public abstract void setMagnification(TextureFilter value)
```


Sets the filter mode for magnification.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [TextureFilter](../../com.aspose.threed/texturefilter) | New value |

### getMipmap() {#getMipmap--}
```
public abstract TextureFilter getMipmap()
```


Gets the filter mode for mipmap.

**Returns:**
[TextureFilter](../../com.aspose.threed/texturefilter)
### setMipmap(TextureFilter value) {#setMipmap-com.aspose.threed.TextureFilter-}
```
public abstract void setMipmap(TextureFilter value)
```


Sets the filter mode for mipmap.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [TextureFilter](../../com.aspose.threed/texturefilter) | New value |

### getScroll() {#getScroll--}
```
public abstract Vector2 getScroll()
```


Gets the scroll of the UV coordinate.

**Returns:**
[Vector2](../../com.aspose.threed/vector2)
### setScroll(Vector2 value) {#setScroll-com.aspose.threed.Vector2-}
```
public abstract void setScroll(Vector2 value)
```


Sets the scroll of the UV coordinate.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Vector2](../../com.aspose.threed/vector2) | New value |

### getScale() {#getScale--}
```
public abstract Vector2 getScale()
```


Gets the scale of the UV coordinate.

**Returns:**
[Vector2](../../com.aspose.threed/vector2)
### setScale(Vector2 value) {#setScale-com.aspose.threed.Vector2-}
```
public abstract void setScale(Vector2 value)
```


Sets the scale of the UV coordinate.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Vector2](../../com.aspose.threed/vector2) | New value |

