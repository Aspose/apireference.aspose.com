---
title: ITextureUnit
second_title: Aspose.3D für Java API-Referenz
description: repräsentiert eine Textur im Speicher, die zwischen GPU und CPU geteilt wird und vom Shader abgetastet werden kann, wobei das  nur einen Verweis auf eine externe Datei darstellt.
type: docs
weight: 258
url: /de/java/com.aspose.threed/itextureunit/
---

**All Implemented Interfaces:**
java.io.Closeable
```
public interface ITextureUnit extends Closeable
```

[ITextureUnit](../../com.aspose.threed/itextureunit) represents a texture in the memory that shared between GPU and CPU and can be sampled by the shader, where the [Texture](../../com.aspose.threed/texture) only represents a reference to an external file. More details can be found https://en.wikipedia.org/wiki/Texture\_mapping\_unit
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [getDepth()](#getDepth--) | Liefert die Höhe dieser Textur, bei nicht‑3D‑Texturen ist sie immer 1. |
| [getHeight()](#getHeight--) | Liefert die Höhe dieser Textur. |
| [getMagnification()](#getMagnification--) | Liefert den Filtermodus für Vergrößerung. |
| [getMinification()](#getMinification--) | Liefert den Filtermodus für Verkleinerung. |
| [getMipmap()](#getMipmap--) | Liefert den Filtermodus für Mipmap. |
| [getScale()](#getScale--) | Liefert den Maßstab der UV‑Koordinate. |
| [getScroll()](#getScroll--) | Liefert das Scrollen der UV‑Koordinate. |
| [getType()](#getType--) | Liefert den Typ dieser Textureinheit. |
| [getUWrap()](#getUWrap--) | Liefert den Wrap‑Modus für die U‑Koordinate der Textur. |
| [getVWrap()](#getVWrap--) | Liefert den Wrap‑Modus für die V‑Koordinate der Textur. |
| [getWWrap()](#getWWrap--) | Liefert den Wrap‑Modus für die W‑Koordinate der Textur. |
| [getWidth()](#getWidth--) | Liefert die Breite dieser Textur. |
| [setMagnification(TextureFilter value)](#setMagnification-com.aspose.threed.TextureFilter-) | Setzt den Filtermodus für Vergrößerung. |
| [setMinification(TextureFilter value)](#setMinification-com.aspose.threed.TextureFilter-) | Setzt den Filtermodus für Verkleinerung. |
| [setMipmap(TextureFilter value)](#setMipmap-com.aspose.threed.TextureFilter-) | Setzt den Filtermodus für Mipmap. |
| [setScale(Vector2 value)](#setScale-com.aspose.threed.Vector2-) | Setzt den Maßstab der UV‑Koordinate. |
| [setScroll(Vector2 value)](#setScroll-com.aspose.threed.Vector2-) | Setzt das Scrollen der UV‑Koordinate. |
| [setUWrap(WrapMode value)](#setUWrap-com.aspose.threed.WrapMode-) | Setzt den Wrap‑Modus für die U‑Koordinate der Textur. |
| [setVWrap(WrapMode value)](#setVWrap-com.aspose.threed.WrapMode-) | Setzt den Wrap‑Modus für die V‑Koordinate der Textur. |
| [setWWrap(WrapMode value)](#setWWrap-com.aspose.threed.WrapMode-) | Setzt den Wrap‑Modus für die W‑Koordinate der Textur. |
### getDepth() {#getDepth--}
```
public abstract int getDepth()
```


Liefert die Höhe dieser Textur, bei nicht‑3D‑Texturen ist sie immer 1.

**Returns:**
int - die Höhe dieser Textur, bei nicht‑3D‑Texturen ist sie immer 1.
### getHeight() {#getHeight--}
```
public abstract int getHeight()
```


Liefert die Höhe dieser Textur.

**Returns:**
int - die Höhe dieser Textur.
### getMagnification() {#getMagnification--}
```
public abstract TextureFilter getMagnification()
```


Liefert den Filtermodus für Vergrößerung.

**Returns:**
[TextureFilter](../../com.aspose.threed/texturefilter) - the filter mode for magnification.
### getMinification() {#getMinification--}
```
public abstract TextureFilter getMinification()
```


Liefert den Filtermodus für Verkleinerung.

**Returns:**
[TextureFilter](../../com.aspose.threed/texturefilter) - the filter mode for minification.
### getMipmap() {#getMipmap--}
```
public abstract TextureFilter getMipmap()
```


Liefert den Filtermodus für Mipmap.

**Returns:**
[TextureFilter](../../com.aspose.threed/texturefilter) - the filter mode for mipmap.
### getScale() {#getScale--}
```
public abstract Vector2 getScale()
```


Liefert den Maßstab der UV‑Koordinate.

**Returns:**
[Vector2](../../com.aspose.threed/vector2) - the scale of the UV coordinate.
### getScroll() {#getScroll--}
```
public abstract Vector2 getScroll()
```


Liefert das Scrollen der UV‑Koordinate.

**Returns:**
[Vector2](../../com.aspose.threed/vector2) - the scroll of the UV coordinate.
### getType() {#getType--}
```
public abstract TextureType getType()
```


Liefert den Typ dieser Textureinheit.

**Returns:**
[TextureType](../../com.aspose.threed/texturetype) - the type of this texture unit.
### getUWrap() {#getUWrap--}
```
public abstract WrapMode getUWrap()
```


Liefert den Wrap‑Modus für die U‑Koordinate der Textur.

**Returns:**
[WrapMode](../../com.aspose.threed/wrapmode) - the wrap mode for texture's U coordinate.
### getVWrap() {#getVWrap--}
```
public abstract WrapMode getVWrap()
```


Liefert den Wrap‑Modus für die V‑Koordinate der Textur.

**Returns:**
[WrapMode](../../com.aspose.threed/wrapmode) - the wrap mode for texture's V coordinate.
### getWWrap() {#getWWrap--}
```
public abstract WrapMode getWWrap()
```


Liefert den Wrap‑Modus für die W‑Koordinate der Textur.

**Returns:**
[WrapMode](../../com.aspose.threed/wrapmode) - the wrap mode for texture's W coordinate.
### getWidth() {#getWidth--}
```
public abstract int getWidth()
```


Liefert die Breite dieser Textur.

**Returns:**
int - die Breite dieser Textur.
### setMagnification(TextureFilter value) {#setMagnification-com.aspose.threed.TextureFilter-}
```
public abstract void setMagnification(TextureFilter value)
```


Setzt den Filtermodus für Vergrößerung.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [TextureFilter](../../com.aspose.threed/texturefilter) | Neuer Wert |

### setMinification(TextureFilter value) {#setMinification-com.aspose.threed.TextureFilter-}
```
public abstract void setMinification(TextureFilter value)
```


Setzt den Filtermodus für Verkleinerung.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [TextureFilter](../../com.aspose.threed/texturefilter) | Neuer Wert |

### setMipmap(TextureFilter value) {#setMipmap-com.aspose.threed.TextureFilter-}
```
public abstract void setMipmap(TextureFilter value)
```


Setzt den Filtermodus für Mipmap.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [TextureFilter](../../com.aspose.threed/texturefilter) | Neuer Wert |

### setScale(Vector2 value) {#setScale-com.aspose.threed.Vector2-}
```
public abstract void setScale(Vector2 value)
```


Setzt den Maßstab der UV‑Koordinate.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [Vector2](../../com.aspose.threed/vector2) | Neuer Wert |

### setScroll(Vector2 value) {#setScroll-com.aspose.threed.Vector2-}
```
public abstract void setScroll(Vector2 value)
```


Setzt das Scrollen der UV‑Koordinate.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [Vector2](../../com.aspose.threed/vector2) | Neuer Wert |

### setUWrap(WrapMode value) {#setUWrap-com.aspose.threed.WrapMode-}
```
public abstract void setUWrap(WrapMode value)
```


Setzt den Wrap‑Modus für die U‑Koordinate der Textur.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [WrapMode](../../com.aspose.threed/wrapmode) | Neuer Wert |

### setVWrap(WrapMode value) {#setVWrap-com.aspose.threed.WrapMode-}
```
public abstract void setVWrap(WrapMode value)
```


Setzt den Wrap‑Modus für die V‑Koordinate der Textur.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [WrapMode](../../com.aspose.threed/wrapmode) | Neuer Wert |

### setWWrap(WrapMode value) {#setWWrap-com.aspose.threed.WrapMode-}
```
public abstract void setWWrap(WrapMode value)
```


Setzt den Wrap‑Modus für die W‑Koordinate der Textur.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [WrapMode](../../com.aspose.threed/wrapmode) | Neuer Wert |

