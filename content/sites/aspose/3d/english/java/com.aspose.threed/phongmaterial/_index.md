---
title: PhongMaterial
second_title: Aspose.3D for Java API Reference
description: Material for blinn-phong shading model.
type: docs
weight: 113
url: /java/com.aspose.threed/phongmaterial/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.A3DObject](../../com.aspose.threed/a3dobject), [com.aspose.threed.Material](../../com.aspose.threed/material), [com.aspose.threed.LambertMaterial](../../com.aspose.threed/lambertmaterial)
```
public class PhongMaterial extends LambertMaterial
```

Material for blinn-phong shading model.
## Constructors

| Constructor | Description |
| --- | --- |
| [PhongMaterial()](#PhongMaterial--) | Initializes a new instance of the [PhongMaterial](../../com.aspose.threed/phongmaterial) class. |
| [PhongMaterial(String name)](#PhongMaterial-java.lang.String-) | Initializes a new instance of the [PhongMaterial](../../com.aspose.threed/phongmaterial) class. |
## Fields

| Field | Description |
| --- | --- |
| [MAP_AMBIENT](#MAP-AMBIENT) | Used in [setTexture](../../com.aspose.threed/material\#setTexture) to assign a ambient texture mapping. |
| [MAP_DIFFUSE](#MAP-DIFFUSE) | Used in [setTexture](../../com.aspose.threed/material\#setTexture) to assign a diffuse texture mapping. |
| [MAP_EMISSIVE](#MAP-EMISSIVE) | Used in [setTexture](../../com.aspose.threed/material\#setTexture) to assign a emissive texture mapping. |
| [MAP_NORMAL](#MAP-NORMAL) | Used in [setTexture](../../com.aspose.threed/material\#setTexture) to assign a normal texture mapping. |
| [MAP_SPECULAR](#MAP-SPECULAR) | Used in [setTexture](../../com.aspose.threed/material\#setTexture) to assign a specular texture mapping. |
## Methods

| Method | Description |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [findProperty(String propertyName)](#findProperty-java.lang.String-) | Finds the property. |
| [getAmbientColor()](#getAmbientColor--) | Gets the ambient color |
| [getClass()](#getClass--) |  |
| [getDiffuseColor()](#getDiffuseColor--) | Gets the diffuse color |
| [getEmissiveColor()](#getEmissiveColor--) | Gets the emissive color |
| [getName()](#getName--) | Gets the name. |
| [getProperties()](#getProperties--) | Gets the collection of all properties. |
| [getProperty(String property)](#getProperty-java.lang.String-) | Get the value of specified property |
| [getReflectionColor()](#getReflectionColor--) | Gets the reflection color. |
| [getReflectionFactor()](#getReflectionFactor--) | Gets the attenuation of the reflection color. |
| [getShininess()](#getShininess--) | Gets the shininess, this controls the specular highlight's size. |
| [getSpecularColor()](#getSpecularColor--) | Gets the specular color. |
| [getSpecularFactor()](#getSpecularFactor--) | Gets the specular factor. |
| [getTexture(String slotName)](#getTexture-java.lang.String-) | Gets the texture from the specified slot, it can be material's property name or shader's parameter name |
| [getTransparency()](#getTransparency--) | Gets the transparency factor. |
| [getTransparentColor()](#getTransparentColor--) | Gets the transparent color. |
| [hashCode()](#hashCode--) |  |
| [iterator()](#iterator--) | Gets the enumerator to enumerate internal texture slots. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [removeProperty(Property property)](#removeProperty-com.aspose.threed.Property-) | Removes a dynamic property. |
| [removeProperty(String property)](#removeProperty-java.lang.String-) | Remove the specified property identified by name |
| [setAmbientColor(Vector3 value)](#setAmbientColor-com.aspose.threed.Vector3-) | Sets the ambient color |
| [setDiffuseColor(Vector3 value)](#setDiffuseColor-com.aspose.threed.Vector3-) | Sets the diffuse color |
| [setEmissiveColor(Vector3 value)](#setEmissiveColor-com.aspose.threed.Vector3-) | Sets the emissive color |
| [setName(String value)](#setName-java.lang.String-) | Sets the name. |
| [setProperty(String property, Object value)](#setProperty-java.lang.String-java.lang.Object-) | Sets the value of specified property |
| [setReflectionColor(Vector3 value)](#setReflectionColor-com.aspose.threed.Vector3-) | Sets the reflection color. |
| [setReflectionFactor(double value)](#setReflectionFactor-double-) | Sets the attenuation of the reflection color. |
| [setShininess(double value)](#setShininess-double-) | Sets the shininess, this controls the specular highlight's size. |
| [setSpecularColor(Vector3 value)](#setSpecularColor-com.aspose.threed.Vector3-) | Sets the specular color. |
| [setSpecularFactor(double value)](#setSpecularFactor-double-) | Sets the specular factor. |
| [setTexture(String slotName, TextureBase texture)](#setTexture-java.lang.String-com.aspose.threed.TextureBase-) | Sets the texture to specified slot |
| [setTransparency(double value)](#setTransparency-double-) | Sets the transparency factor. |
| [setTransparentColor(Vector3 value)](#setTransparentColor-com.aspose.threed.Vector3-) | Sets the transparent color. |
| [toString()](#toString--) | Formats object to string |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PhongMaterial() {#PhongMaterial--}
```
public PhongMaterial()
```


Initializes a new instance of the [PhongMaterial](../../com.aspose.threed/phongmaterial) class.

### PhongMaterial(String name) {#PhongMaterial-java.lang.String-}
```
public PhongMaterial(String name)
```


Initializes a new instance of the [PhongMaterial](../../com.aspose.threed/phongmaterial) class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String | Name |

### MAP_AMBIENT {#MAP-AMBIENT}
```
public static final String MAP_AMBIENT
```


Used in [setTexture](../../com.aspose.threed/material\#setTexture) to assign a ambient texture mapping.

### MAP_DIFFUSE {#MAP-DIFFUSE}
```
public static final String MAP_DIFFUSE
```


Used in [setTexture](../../com.aspose.threed/material\#setTexture) to assign a diffuse texture mapping.

### MAP_EMISSIVE {#MAP-EMISSIVE}
```
public static final String MAP_EMISSIVE
```


Used in [setTexture](../../com.aspose.threed/material\#setTexture) to assign a emissive texture mapping.

### MAP_NORMAL {#MAP-NORMAL}
```
public static final String MAP_NORMAL
```


Used in [setTexture](../../com.aspose.threed/material\#setTexture) to assign a normal texture mapping.

### MAP_SPECULAR {#MAP-SPECULAR}
```
public static final String MAP_SPECULAR
```


Used in [setTexture](../../com.aspose.threed/material\#setTexture) to assign a specular texture mapping.

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
### getAmbientColor() {#getAmbientColor--}
```
public Vector3 getAmbientColor()
```


Gets the ambient color

**Returns:**
[Vector3](../../com.aspose.threed/vector3)
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getDiffuseColor() {#getDiffuseColor--}
```
public Vector3 getDiffuseColor()
```


Gets the diffuse color

**Returns:**
[Vector3](../../com.aspose.threed/vector3)
### getEmissiveColor() {#getEmissiveColor--}
```
public Vector3 getEmissiveColor()
```


Gets the emissive color

**Returns:**
[Vector3](../../com.aspose.threed/vector3)
### getName() {#getName--}
```
public String getName()
```


Gets the name.

**Returns:**
java.lang.String
### getProperties() {#getProperties--}
```
public PropertyCollection getProperties()
```


Gets the collection of all properties.

**Returns:**
[PropertyCollection](../../com.aspose.threed/propertycollection)
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
### getReflectionColor() {#getReflectionColor--}
```
public Vector3 getReflectionColor()
```


Gets the reflection color.

**Returns:**
[Vector3](../../com.aspose.threed/vector3)
### getReflectionFactor() {#getReflectionFactor--}
```
public double getReflectionFactor()
```


Gets the attenuation of the reflection color.

**Returns:**
double
### getShininess() {#getShininess--}
```
public double getShininess()
```


Gets the shininess, this controls the specular highlight's size. The formula of specular: SpecularColor \* SpecularFactor \* (N dot H) ^ Shininess

**Returns:**
double
### getSpecularColor() {#getSpecularColor--}
```
public Vector3 getSpecularColor()
```


Gets the specular color.

**Returns:**
[Vector3](../../com.aspose.threed/vector3)
### getSpecularFactor() {#getSpecularFactor--}
```
public double getSpecularFactor()
```


Gets the specular factor. The formula of specular: SpecularColor \* SpecularFactor \* (N dot H) ^ Shininess

**Returns:**
double
### getTexture(String slotName) {#getTexture-java.lang.String-}
```
public TextureBase getTexture(String slotName)
```


Gets the texture from the specified slot, it can be material's property name or shader's parameter name

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| slotName | java.lang.String | Slot name. |

**Returns:**
[TextureBase](../../com.aspose.threed/texturebase) - The texture.
### getTransparency() {#getTransparency--}
```
public double getTransparency()
```


Gets the transparency factor. The factor should be ranged between 0(0%, fully opaque) and 1(100%, fully transparent) Any invalid factor value will be clamped.

**Returns:**
double
### getTransparentColor() {#getTransparentColor--}
```
public Vector3 getTransparentColor()
```


Gets the transparent color.

**Returns:**
[Vector3](../../com.aspose.threed/vector3)
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### iterator() {#iterator--}
```
public Iterator<TextureSlot> iterator()
```


Gets the enumerator to enumerate internal texture slots.

**Returns:**
java.util.Iterator<com.aspose.threed.TextureSlot>
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
| property | java.lang.String |  |

**Returns:**
boolean
### setAmbientColor(Vector3 value) {#setAmbientColor-com.aspose.threed.Vector3-}
```
public void setAmbientColor(Vector3 value)
```


Sets the ambient color

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Vector3](../../com.aspose.threed/vector3) | New value |

### setDiffuseColor(Vector3 value) {#setDiffuseColor-com.aspose.threed.Vector3-}
```
public void setDiffuseColor(Vector3 value)
```


Sets the diffuse color

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Vector3](../../com.aspose.threed/vector3) | New value |

### setEmissiveColor(Vector3 value) {#setEmissiveColor-com.aspose.threed.Vector3-}
```
public void setEmissiveColor(Vector3 value)
```


Sets the emissive color

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Vector3](../../com.aspose.threed/vector3) | New value |

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

### setReflectionColor(Vector3 value) {#setReflectionColor-com.aspose.threed.Vector3-}
```
public void setReflectionColor(Vector3 value)
```


Sets the reflection color.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Vector3](../../com.aspose.threed/vector3) | New value |

### setReflectionFactor(double value) {#setReflectionFactor-double-}
```
public void setReflectionFactor(double value)
```


Sets the attenuation of the reflection color.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### setShininess(double value) {#setShininess-double-}
```
public void setShininess(double value)
```


Sets the shininess, this controls the specular highlight's size. The formula of specular: SpecularColor \* SpecularFactor \* (N dot H) ^ Shininess

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### setSpecularColor(Vector3 value) {#setSpecularColor-com.aspose.threed.Vector3-}
```
public void setSpecularColor(Vector3 value)
```


Sets the specular color.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Vector3](../../com.aspose.threed/vector3) | New value |

### setSpecularFactor(double value) {#setSpecularFactor-double-}
```
public void setSpecularFactor(double value)
```


Sets the specular factor. The formula of specular: SpecularColor \* SpecularFactor \* (N dot H) ^ Shininess

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### setTexture(String slotName, TextureBase texture) {#setTexture-java.lang.String-com.aspose.threed.TextureBase-}
```
public void setTexture(String slotName, TextureBase texture)
```


Sets the texture to specified slot

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| slotName | java.lang.String | Slot name. |
| texture | [TextureBase](../../com.aspose.threed/texturebase) | Texture. |

### setTransparency(double value) {#setTransparency-double-}
```
public void setTransparency(double value)
```


Sets the transparency factor. The factor should be ranged between 0(0%, fully opaque) and 1(100%, fully transparent) Any invalid factor value will be clamped.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### setTransparentColor(Vector3 value) {#setTransparentColor-com.aspose.threed.Vector3-}
```
public void setTransparentColor(Vector3 value)
```


Sets the transparent color.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Vector3](../../com.aspose.threed/vector3) | New value |

### toString() {#toString--}
```
public String toString()
```


Formats object to string

**Returns:**
java.lang.String - Object string
### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final native void wait(long arg0)
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

