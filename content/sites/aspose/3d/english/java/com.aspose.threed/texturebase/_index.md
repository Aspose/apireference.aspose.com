---
title: TextureBase
second_title: Aspose.3D for Java API Reference
description: Base class for all concrete textures.
type: docs
weight: 166
url: /java/com.aspose.threed/texturebase/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.A3DObject](../../com.aspose.threed/a3dobject)
```
public class TextureBase extends A3DObject
```

Base class for all concrete textures. Texture defines the look and feel of a geometry surface.
## Constructors

| Constructor | Description |
| --- | --- |
| [TextureBase(String name)](#TextureBase-java.lang.String-) | Initializes a new instance of the com.aspose.threed.TextureBase class. |
## Methods

| Method | Description |
| --- | --- |
| [getAlpha()](#getAlpha--) | Gets the default alpha value of the texture This is valid when the com.aspose.threed.TextureBase\#getAlphaSource is com.aspose.threed.AlphaSource\#PIXEL\_ALPHA Default value is 1.0, valid value range is between 0 and 1 |
| [setAlpha(double value)](#setAlpha-double-) | Sets the default alpha value of the texture This is valid when the com.aspose.threed.TextureBase\#getAlphaSource is com.aspose.threed.AlphaSource\#PIXEL\_ALPHA Default value is 1.0, valid value range is between 0 and 1 |
| [getAlphaSource()](#getAlphaSource--) | Gets whether the texture defines the alpha channel. |
| [setAlphaSource(AlphaSource value)](#setAlphaSource-com.aspose.threed.AlphaSource-) | Sets whether the texture defines the alpha channel. |
| [getWrapModeU()](#getWrapModeU--) | Gets the texture wrap modes in U. |
| [setWrapModeU(WrapMode value)](#setWrapModeU-com.aspose.threed.WrapMode-) | Sets the texture wrap modes in U. |
| [getWrapModeV()](#getWrapModeV--) | Gets the texture wrap modes in V. |
| [setWrapModeV(WrapMode value)](#setWrapModeV-com.aspose.threed.WrapMode-) | Sets the texture wrap modes in V. |
| [getWrapModeW()](#getWrapModeW--) | Gets the texture wrap modes in W. |
| [setWrapModeW(WrapMode value)](#setWrapModeW-com.aspose.threed.WrapMode-) | Sets the texture wrap modes in W. |
| [getMinFilter()](#getMinFilter--) | Gets the filter for minification. |
| [setMinFilter(TextureFilter value)](#setMinFilter-com.aspose.threed.TextureFilter-) | Sets the filter for minification. |
| [getMagFilter()](#getMagFilter--) | Gets the filter for magnification. |
| [setMagFilter(TextureFilter value)](#setMagFilter-com.aspose.threed.TextureFilter-) | Sets the filter for magnification. |
| [getMipFilter()](#getMipFilter--) | Gets the filter for mip-level sampling. |
| [setMipFilter(TextureFilter value)](#setMipFilter-com.aspose.threed.TextureFilter-) | Sets the filter for mip-level sampling. |
| [getUVRotation()](#getUVRotation--) | Gets the rotation of the texture |
| [setUVRotation(Vector3 value)](#setUVRotation-com.aspose.threed.Vector3-) | Sets the rotation of the texture |
| [getUVScale()](#getUVScale--) | Gets the UV scale. |
| [setUVScale(Vector2 value)](#setUVScale-com.aspose.threed.Vector2-) | Sets the UV scale. |
| [getUVTranslation()](#getUVTranslation--) | Gets the UV translation. |
| [setUVTranslation(Vector2 value)](#setUVTranslation-com.aspose.threed.Vector2-) | Sets the UV translation. |
| [setTranslation(double u, double v)](#setTranslation-double-double-) | Sets the UV translation. |
| [setScale(double u, double v)](#setScale-double-double-) | Sets the UV scale. |
| [setRotation(double u, double v)](#setRotation-double-double-) | Sets the UV rotation. |
### TextureBase(String name) {#TextureBase-java.lang.String-}
```
public TextureBase(String name)
```


Initializes a new instance of the com.aspose.threed.TextureBase class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String | Name. |

### getAlpha() {#getAlpha--}
```
public double getAlpha()
```


Gets the default alpha value of the texture This is valid when the com.aspose.threed.TextureBase\#getAlphaSource is com.aspose.threed.AlphaSource\#PIXEL\_ALPHA Default value is 1.0, valid value range is between 0 and 1

**Returns:**
double
### setAlpha(double value) {#setAlpha-double-}
```
public void setAlpha(double value)
```


Sets the default alpha value of the texture This is valid when the com.aspose.threed.TextureBase\#getAlphaSource is com.aspose.threed.AlphaSource\#PIXEL\_ALPHA Default value is 1.0, valid value range is between 0 and 1

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### getAlphaSource() {#getAlphaSource--}
```
public AlphaSource getAlphaSource()
```


Gets whether the texture defines the alpha channel. Default value is com.aspose.threed.AlphaSource\#NONE

**Returns:**
[AlphaSource](../../com.aspose.threed/alphasource)
### setAlphaSource(AlphaSource value) {#setAlphaSource-com.aspose.threed.AlphaSource-}
```
public void setAlphaSource(AlphaSource value)
```


Sets whether the texture defines the alpha channel. Default value is com.aspose.threed.AlphaSource\#NONE

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [AlphaSource](../../com.aspose.threed/alphasource) | New value |

### getWrapModeU() {#getWrapModeU--}
```
public WrapMode getWrapModeU()
```


Gets the texture wrap modes in U.

**Returns:**
[WrapMode](../../com.aspose.threed/wrapmode)
### setWrapModeU(WrapMode value) {#setWrapModeU-com.aspose.threed.WrapMode-}
```
public void setWrapModeU(WrapMode value)
```


Sets the texture wrap modes in U.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [WrapMode](../../com.aspose.threed/wrapmode) | New value |

### getWrapModeV() {#getWrapModeV--}
```
public WrapMode getWrapModeV()
```


Gets the texture wrap modes in V.

**Returns:**
[WrapMode](../../com.aspose.threed/wrapmode)
### setWrapModeV(WrapMode value) {#setWrapModeV-com.aspose.threed.WrapMode-}
```
public void setWrapModeV(WrapMode value)
```


Sets the texture wrap modes in V.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [WrapMode](../../com.aspose.threed/wrapmode) | New value |

### getWrapModeW() {#getWrapModeW--}
```
public WrapMode getWrapModeW()
```


Gets the texture wrap modes in W.

**Returns:**
[WrapMode](../../com.aspose.threed/wrapmode)
### setWrapModeW(WrapMode value) {#setWrapModeW-com.aspose.threed.WrapMode-}
```
public void setWrapModeW(WrapMode value)
```


Sets the texture wrap modes in W.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [WrapMode](../../com.aspose.threed/wrapmode) | New value |

### getMinFilter() {#getMinFilter--}
```
public TextureFilter getMinFilter()
```


Gets the filter for minification.

**Returns:**
[TextureFilter](../../com.aspose.threed/texturefilter)
### setMinFilter(TextureFilter value) {#setMinFilter-com.aspose.threed.TextureFilter-}
```
public void setMinFilter(TextureFilter value)
```


Sets the filter for minification.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [TextureFilter](../../com.aspose.threed/texturefilter) | New value |

### getMagFilter() {#getMagFilter--}
```
public TextureFilter getMagFilter()
```


Gets the filter for magnification.

**Returns:**
[TextureFilter](../../com.aspose.threed/texturefilter)
### setMagFilter(TextureFilter value) {#setMagFilter-com.aspose.threed.TextureFilter-}
```
public void setMagFilter(TextureFilter value)
```


Sets the filter for magnification.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [TextureFilter](../../com.aspose.threed/texturefilter) | New value |

### getMipFilter() {#getMipFilter--}
```
public TextureFilter getMipFilter()
```


Gets the filter for mip-level sampling.

**Returns:**
[TextureFilter](../../com.aspose.threed/texturefilter)
### setMipFilter(TextureFilter value) {#setMipFilter-com.aspose.threed.TextureFilter-}
```
public void setMipFilter(TextureFilter value)
```


Sets the filter for mip-level sampling.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [TextureFilter](../../com.aspose.threed/texturefilter) | New value |

### getUVRotation() {#getUVRotation--}
```
public Vector3 getUVRotation()
```


Gets the rotation of the texture

**Returns:**
[Vector3](../../com.aspose.threed/vector3)
### setUVRotation(Vector3 value) {#setUVRotation-com.aspose.threed.Vector3-}
```
public void setUVRotation(Vector3 value)
```


Sets the rotation of the texture

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Vector3](../../com.aspose.threed/vector3) | New value |

### getUVScale() {#getUVScale--}
```
public Vector2 getUVScale()
```


Gets the UV scale.

**Returns:**
[Vector2](../../com.aspose.threed/vector2)
### setUVScale(Vector2 value) {#setUVScale-com.aspose.threed.Vector2-}
```
public void setUVScale(Vector2 value)
```


Sets the UV scale.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Vector2](../../com.aspose.threed/vector2) | New value |

### getUVTranslation() {#getUVTranslation--}
```
public Vector2 getUVTranslation()
```


Gets the UV translation.

**Returns:**
[Vector2](../../com.aspose.threed/vector2)
### setUVTranslation(Vector2 value) {#setUVTranslation-com.aspose.threed.Vector2-}
```
public void setUVTranslation(Vector2 value)
```


Sets the UV translation.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Vector2](../../com.aspose.threed/vector2) | New value |

### setTranslation(double u, double v) {#setTranslation-double-double-}
```
public void setTranslation(double u, double v)
```


Sets the UV translation.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| u | double | U. |
| v | double | V. |

### setScale(double u, double v) {#setScale-double-double-}
```
public void setScale(double u, double v)
```


Sets the UV scale.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| u | double | U. |
| v | double | V. |

### setRotation(double u, double v) {#setRotation-double-double-}
```
public void setRotation(double u, double v)
```


Sets the UV rotation.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| u | double | U. |
| v | double | V. |

