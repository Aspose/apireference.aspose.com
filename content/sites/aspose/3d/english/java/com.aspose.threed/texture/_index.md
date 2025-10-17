---
title: Texture
second_title: Aspose.3D for Java API Reference
description: This class defines the texture from an external file.
type: docs
weight: 184
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
| [Texture()](#Texture--) | Initializes a new instance of the [Texture](../../com.aspose.threed/texture) class. |
| [Texture(String name)](#Texture-java.lang.String-) | Initializes a new instance of the [Texture](../../com.aspose.threed/texture) class. |
## Methods

| Method | Description |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [findProperty(String propertyName)](#findProperty-java.lang.String-) | Finds the property. |
| [getAlpha()](#getAlpha--) | Gets the default alpha value of the texture This is valid when the [getAlphaSource](../../com.aspose.threed/texturebase\#getAlphaSource) is [AlphaSource.PIXEL\_ALPHA](../../com.aspose.threed/alphasource\#PIXEL-ALPHA) Default value is 1.0, valid value range is between 0 and 1 |
| [getAlphaSource()](#getAlphaSource--) | Gets whether the texture defines the alpha channel. |
| [getClass()](#getClass--) |  |
| [getContent()](#getContent--) | Gets the binary content of the texture. |
| [getEnableMipMap()](#getEnableMipMap--) | Gets if the mipmap is enabled for this texture |
| [getFileName()](#getFileName--) | Gets the associated texture file. |
| [getMagFilter()](#getMagFilter--) | Gets the filter for magnification. |
| [getMinFilter()](#getMinFilter--) | Gets the filter for minification. |
| [getMipFilter()](#getMipFilter--) | Gets the filter for mip-level sampling. |
| [getName()](#getName--) | Gets the name. |
| [getProperties()](#getProperties--) | Gets the collection of all properties. |
| [getProperty(String property)](#getProperty-java.lang.String-) | Get the value of specified property |
| [getUVRotation()](#getUVRotation--) | Gets the rotation of the texture |
| [getUVScale()](#getUVScale--) | Gets the UV scale. |
| [getUVTranslation()](#getUVTranslation--) | Gets the UV translation. |
| [getWrapModeU()](#getWrapModeU--) | Gets the texture wrap modes in U. |
| [getWrapModeV()](#getWrapModeV--) | Gets the texture wrap modes in V. |
| [getWrapModeW()](#getWrapModeW--) | Gets the texture wrap modes in W. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [removeProperty(Property property)](#removeProperty-com.aspose.threed.Property-) | Removes a dynamic property. |
| [removeProperty(String property)](#removeProperty-java.lang.String-) | Remove the specified property identified by name |
| [setAlpha(double value)](#setAlpha-double-) | Sets the default alpha value of the texture This is valid when the [getAlphaSource](../../com.aspose.threed/texturebase\#getAlphaSource) is [AlphaSource.PIXEL\_ALPHA](../../com.aspose.threed/alphasource\#PIXEL-ALPHA) Default value is 1.0, valid value range is between 0 and 1 |
| [setAlphaSource(AlphaSource value)](#setAlphaSource-com.aspose.threed.AlphaSource-) | Sets whether the texture defines the alpha channel. |
| [setContent(byte[] value)](#setContent-byte---) | Sets the binary content of the texture. |
| [setEnableMipMap(boolean value)](#setEnableMipMap-boolean-) | Sets if the mipmap is enabled for this texture |
| [setFileName(String value)](#setFileName-java.lang.String-) | Sets the associated texture file. |
| [setMagFilter(TextureFilter value)](#setMagFilter-com.aspose.threed.TextureFilter-) | Sets the filter for magnification. |
| [setMinFilter(TextureFilter value)](#setMinFilter-com.aspose.threed.TextureFilter-) | Sets the filter for minification. |
| [setMipFilter(TextureFilter value)](#setMipFilter-com.aspose.threed.TextureFilter-) | Sets the filter for mip-level sampling. |
| [setName(String value)](#setName-java.lang.String-) | Sets the name. |
| [setProperty(String property, Object value)](#setProperty-java.lang.String-java.lang.Object-) | Sets the value of specified property |
| [setRotation(double u, double v)](#setRotation-double-double-) | Sets the UV rotation. |
| [setScale(double u, double v)](#setScale-double-double-) | Sets the UV scale. |
| [setTranslation(double u, double v)](#setTranslation-double-double-) | Sets the UV translation. |
| [setUVRotation(Vector3 value)](#setUVRotation-com.aspose.threed.Vector3-) | Sets the rotation of the texture |
| [setUVScale(Vector2 value)](#setUVScale-com.aspose.threed.Vector2-) | Sets the UV scale. |
| [setUVTranslation(Vector2 value)](#setUVTranslation-com.aspose.threed.Vector2-) | Sets the UV translation. |
| [setWrapModeU(WrapMode value)](#setWrapModeU-com.aspose.threed.WrapMode-) | Sets the texture wrap modes in U. |
| [setWrapModeV(WrapMode value)](#setWrapModeV-com.aspose.threed.WrapMode-) | Sets the texture wrap modes in V. |
| [setWrapModeW(WrapMode value)](#setWrapModeW-com.aspose.threed.WrapMode-) | Sets the texture wrap modes in W. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### Texture() {#Texture--}
```
public Texture()
```


Initializes a new instance of the [Texture](../../com.aspose.threed/texture) class.

### Texture(String name) {#Texture-java.lang.String-}
```
public Texture(String name)
```


Initializes a new instance of the [Texture](../../com.aspose.threed/texture) class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String | Name |

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### findProperty(String propertyName) {#findProperty-java.lang.String-}
```
public Property findProperty(String propertyName)
```


Finds the property. It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) or native property(Identified by its name)

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| propertyName | java.lang.String | Property name. |

**Returns:**
[Property](../../com.aspose.threed/property) - The property.
### getAlpha() {#getAlpha--}
```
public double getAlpha()
```


Gets the default alpha value of the texture This is valid when the [getAlphaSource](../../com.aspose.threed/texturebase\#getAlphaSource) is [AlphaSource.PIXEL\_ALPHA](../../com.aspose.threed/alphasource\#PIXEL-ALPHA) Default value is 1.0, valid value range is between 0 and 1

**Returns:**
double - the default alpha value of the texture This is valid when the [getAlphaSource](../../com.aspose.threed/texturebase\#getAlphaSource) is [AlphaSource.PIXEL\_ALPHA](../../com.aspose.threed/alphasource\#PIXEL-ALPHA) Default value is 1.0, valid value range is between 0 and 1
### getAlphaSource() {#getAlphaSource--}
```
public AlphaSource getAlphaSource()
```


Gets whether the texture defines the alpha channel. Default value is [AlphaSource.NONE](../../com.aspose.threed/alphasource\#NONE)

**Returns:**
[AlphaSource](../../com.aspose.threed/alphasource) - whether the texture defines the alpha channel. Default value is [AlphaSource.NONE](../../com.aspose.threed/alphasource\#NONE)
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getContent() {#getContent--}
```
public byte[] getContent()
```


Gets the binary content of the texture. The embedded texture content is optional, user should load texture from external file if this is missing.

**Returns:**
byte[] - the binary content of the texture. The embedded texture content is optional, user should load texture from external file if this is missing.
### getEnableMipMap() {#getEnableMipMap--}
```
public boolean getEnableMipMap()
```


Gets if the mipmap is enabled for this texture

**Returns:**
boolean - if the mipmap is enabled for this texture
### getFileName() {#getFileName--}
```
public String getFileName()
```


Gets the associated texture file.

**Returns:**
java.lang.String - the associated texture file.
### getMagFilter() {#getMagFilter--}
```
public TextureFilter getMagFilter()
```


Gets the filter for magnification.

**Returns:**
[TextureFilter](../../com.aspose.threed/texturefilter) - the filter for magnification.
### getMinFilter() {#getMinFilter--}
```
public TextureFilter getMinFilter()
```


Gets the filter for minification.

**Returns:**
[TextureFilter](../../com.aspose.threed/texturefilter) - the filter for minification.
### getMipFilter() {#getMipFilter--}
```
public TextureFilter getMipFilter()
```


Gets the filter for mip-level sampling.

**Returns:**
[TextureFilter](../../com.aspose.threed/texturefilter) - the filter for mip-level sampling.
### getName() {#getName--}
```
public String getName()
```


Gets the name.

**Returns:**
java.lang.String - the name.
### getProperties() {#getProperties--}
```
public PropertyCollection getProperties()
```


Gets the collection of all properties.

**Returns:**
[PropertyCollection](../../com.aspose.threed/propertycollection) - the collection of all properties.
### getProperty(String property) {#getProperty-java.lang.String-}
```
public Object getProperty(String property)
```


Get the value of specified property

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| property | java.lang.String | Property name |

**Returns:**
java.lang.Object - The value of the found property
### getUVRotation() {#getUVRotation--}
```
public Vector3 getUVRotation()
```


Gets the rotation of the texture

**Returns:**
[Vector3](../../com.aspose.threed/vector3) - the rotation of the texture
### getUVScale() {#getUVScale--}
```
public Vector2 getUVScale()
```


Gets the UV scale.

**Returns:**
[Vector2](../../com.aspose.threed/vector2) - the UV scale.
### getUVTranslation() {#getUVTranslation--}
```
public Vector2 getUVTranslation()
```


Gets the UV translation.

**Returns:**
[Vector2](../../com.aspose.threed/vector2) - the UV translation.
### getWrapModeU() {#getWrapModeU--}
```
public WrapMode getWrapModeU()
```


Gets the texture wrap modes in U.

**Returns:**
[WrapMode](../../com.aspose.threed/wrapmode) - the texture wrap modes in U.
### getWrapModeV() {#getWrapModeV--}
```
public WrapMode getWrapModeV()
```


Gets the texture wrap modes in V.

**Returns:**
[WrapMode](../../com.aspose.threed/wrapmode) - the texture wrap modes in V.
### getWrapModeW() {#getWrapModeW--}
```
public WrapMode getWrapModeW()
```


Gets the texture wrap modes in W.

**Returns:**
[WrapMode](../../com.aspose.threed/wrapmode) - the texture wrap modes in W.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### removeProperty(Property property) {#removeProperty-com.aspose.threed.Property-}
```
public boolean removeProperty(Property property)
```


Removes a dynamic property.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| property | [Property](../../com.aspose.threed/property) | Which property to remove |

**Returns:**
boolean - true if the property is successfully removed
### removeProperty(String property) {#removeProperty-java.lang.String-}
```
public boolean removeProperty(String property)
```


Remove the specified property identified by name

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| property | java.lang.String | Which property to remove |

**Returns:**
boolean - true if the property is successfully removed
### setAlpha(double value) {#setAlpha-double-}
```
public void setAlpha(double value)
```


Sets the default alpha value of the texture This is valid when the [getAlphaSource](../../com.aspose.threed/texturebase\#getAlphaSource) is [AlphaSource.PIXEL\_ALPHA](../../com.aspose.threed/alphasource\#PIXEL-ALPHA) Default value is 1.0, valid value range is between 0 and 1

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### setAlphaSource(AlphaSource value) {#setAlphaSource-com.aspose.threed.AlphaSource-}
```
public void setAlphaSource(AlphaSource value)
```


Sets whether the texture defines the alpha channel. Default value is [AlphaSource.NONE](../../com.aspose.threed/alphasource\#NONE)

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [AlphaSource](../../com.aspose.threed/alphasource) | New value |

### setContent(byte[] value) {#setContent-byte---}
```
public void setContent(byte[] value)
```


Sets the binary content of the texture. The embedded texture content is optional, user should load texture from external file if this is missing.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | byte[] | New value |

### setEnableMipMap(boolean value) {#setEnableMipMap-boolean-}
```
public void setEnableMipMap(boolean value)
```


Sets if the mipmap is enabled for this texture

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

### setFileName(String value) {#setFileName-java.lang.String-}
```
public void setFileName(String value)
```


Sets the associated texture file.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New value |

### setMagFilter(TextureFilter value) {#setMagFilter-com.aspose.threed.TextureFilter-}
```
public void setMagFilter(TextureFilter value)
```


Sets the filter for magnification.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [TextureFilter](../../com.aspose.threed/texturefilter) | New value |

### setMinFilter(TextureFilter value) {#setMinFilter-com.aspose.threed.TextureFilter-}
```
public void setMinFilter(TextureFilter value)
```


Sets the filter for minification.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [TextureFilter](../../com.aspose.threed/texturefilter) | New value |

### setMipFilter(TextureFilter value) {#setMipFilter-com.aspose.threed.TextureFilter-}
```
public void setMipFilter(TextureFilter value)
```


Sets the filter for mip-level sampling.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [TextureFilter](../../com.aspose.threed/texturefilter) | New value |

### setName(String value) {#setName-java.lang.String-}
```
public void setName(String value)
```


Sets the name.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New value |

### setProperty(String property, Object value) {#setProperty-java.lang.String-java.lang.Object-}
```
public void setProperty(String property, Object value)
```


Sets the value of specified property

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| property | java.lang.String | Property name |
| value | java.lang.Object | The value of the property |

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

### setUVRotation(Vector3 value) {#setUVRotation-com.aspose.threed.Vector3-}
```
public void setUVRotation(Vector3 value)
```


Sets the rotation of the texture

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Vector3](../../com.aspose.threed/vector3) | New value |

### setUVScale(Vector2 value) {#setUVScale-com.aspose.threed.Vector2-}
```
public void setUVScale(Vector2 value)
```


Sets the UV scale.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Vector2](../../com.aspose.threed/vector2) | New value |

### setUVTranslation(Vector2 value) {#setUVTranslation-com.aspose.threed.Vector2-}
```
public void setUVTranslation(Vector2 value)
```


Sets the UV translation.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Vector2](../../com.aspose.threed/vector2) | New value |

### setWrapModeU(WrapMode value) {#setWrapModeU-com.aspose.threed.WrapMode-}
```
public void setWrapModeU(WrapMode value)
```


Sets the texture wrap modes in U.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [WrapMode](../../com.aspose.threed/wrapmode) | New value |

### setWrapModeV(WrapMode value) {#setWrapModeV-com.aspose.threed.WrapMode-}
```
public void setWrapModeV(WrapMode value)
```


Sets the texture wrap modes in V.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [WrapMode](../../com.aspose.threed/wrapmode) | New value |

### setWrapModeW(WrapMode value) {#setWrapModeW-com.aspose.threed.WrapMode-}
```
public void setWrapModeW(WrapMode value)
```


Sets the texture wrap modes in W.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [WrapMode](../../com.aspose.threed/wrapmode) | New value |

### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final void wait(long arg0)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

