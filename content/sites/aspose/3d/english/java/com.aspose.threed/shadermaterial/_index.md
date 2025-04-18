---
title: ShaderMaterial
second_title: Aspose.3D for Java API Reference
description: A shader material allows to describe the material by external rendering engine or shader language.
type: docs
weight: 160
url: /java/com.aspose.threed/shadermaterial/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.A3DObject](../../com.aspose.threed/a3dobject), [com.aspose.threed.Material](../../com.aspose.threed/material)
```
public class ShaderMaterial extends Material
```

A shader material allows to describe the material by external rendering engine or shader language. [ShaderMaterial](../../com.aspose.threed/shadermaterial) uses [ShaderTechnique](../../com.aspose.threed/shadertechnique) to describe the concrete rendering details, and the most suitable one will be used according to the final rendering platform. For example, your [ShaderMaterial](../../com.aspose.threed/shadermaterial) instance can have two technique, one is defined by HLSL, and another is defined by GLSL Under non-window platform the GLSL should be used instead of HLSL
## Constructors

| Constructor | Description |
| --- | --- |
| [ShaderMaterial()](#ShaderMaterial--) | Initializes a new instance of the [ShaderMaterial](../../com.aspose.threed/shadermaterial) class. |
| [ShaderMaterial(String name)](#ShaderMaterial-java.lang.String-) | Initializes a new instance of the [ShaderMaterial](../../com.aspose.threed/shadermaterial) class. |
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
| [getClass()](#getClass--) |  |
| [getName()](#getName--) | Gets the name. |
| [getProperties()](#getProperties--) | Gets the collection of all properties. |
| [getProperty(String property)](#getProperty-java.lang.String-) | Get the value of specified property |
| [getTechniques()](#getTechniques--) | Gets all available techniques defined in this material. |
| [getTexture(String slotName)](#getTexture-java.lang.String-) | Gets the texture from the specified slot, it can be material's property name or shader's parameter name |
| [hashCode()](#hashCode--) |  |
| [iterator()](#iterator--) | Gets the enumerator to enumerate internal texture slots. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [removeProperty(Property property)](#removeProperty-com.aspose.threed.Property-) | Removes a dynamic property. |
| [removeProperty(String property)](#removeProperty-java.lang.String-) | Remove the specified property identified by name |
| [setName(String value)](#setName-java.lang.String-) | Sets the name. |
| [setProperty(String property, Object value)](#setProperty-java.lang.String-java.lang.Object-) | Sets the value of specified property |
| [setTexture(String slotName, TextureBase texture)](#setTexture-java.lang.String-com.aspose.threed.TextureBase-) | Sets the texture to specified slot |
| [toString()](#toString--) | Formats object to string |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### ShaderMaterial() {#ShaderMaterial--}
```
public ShaderMaterial()
```


Initializes a new instance of the [ShaderMaterial](../../com.aspose.threed/shadermaterial) class.

### ShaderMaterial(String name) {#ShaderMaterial-java.lang.String-}
```
public ShaderMaterial(String name)
```


Initializes a new instance of the [ShaderMaterial](../../com.aspose.threed/shadermaterial) class.

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
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
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
### getTechniques() {#getTechniques--}
```
public List<ShaderTechnique> getTechniques()
```


Gets all available techniques defined in this material.

**Returns:**
java.util.List<com.aspose.threed.ShaderTechnique> - all available techniques defined in this material.
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
[TextureBase](../../com.aspose.threed/texturebase) - The texture. **Example:**

```
var mat = new LambertMaterial();
     var tex = new Texture();
     tex.setFileName("diffuse.png");
     mat.setTexture(Material.MAP_DIFFUSE, tex);
     tex = (Texture)mat.getTexture(Material.MAP_DIFFUSE);
```
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
| property | java.lang.String | Which property to remove |

**Returns:**
boolean - true if the property is successfully removed
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

### setTexture(String slotName, TextureBase texture) {#setTexture-java.lang.String-com.aspose.threed.TextureBase-}
```
public void setTexture(String slotName, TextureBase texture)
```


Sets the texture to specified slot

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| slotName | java.lang.String | Slot name. |
| texture | [TextureBase](../../com.aspose.threed/texturebase) | Texture. **Example:**

```
var mat = new LambertMaterial();
     var tex = new Texture();
     tex.setFileName("diffuse.png");
     mat.setTexture(Material.MAP_NORMAL, tex);
``` |

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

