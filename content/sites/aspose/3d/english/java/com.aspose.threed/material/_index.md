---
title: Material
second_title: Aspose.3D for Java API Reference
description: Material defines the parameters necessary for visual appearance of geometry.
type: docs
weight: 89
url: /java/com.aspose.threed/material/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.A3DObject](../../com.aspose.threed/a3dobject)

**All Implemented Interfaces:**
java.lang.Iterable
```
public abstract class Material extends A3DObject implements Iterable<TextureSlot>
```

Material defines the parameters necessary for visual appearance of geometry. Aspose.3D provides shading model for com.aspose.threed.LambertMaterial, com.aspose.threed.PhongMaterial and com.aspose.threed.ShaderMaterial
## Fields

| Field | Description |
| --- | --- |
| [MAP_SPECULAR](#MAP-SPECULAR) | Used in com.aspose.threed.Material\#setTexture to assign a specular texture mapping. |
| [MAP_DIFFUSE](#MAP-DIFFUSE) | Used in com.aspose.threed.Material\#setTexture to assign a diffuse texture mapping. |
| [MAP_EMISSIVE](#MAP-EMISSIVE) | Used in com.aspose.threed.Material\#setTexture to assign a emissive texture mapping. |
| [MAP_AMBIENT](#MAP-AMBIENT) | Used in com.aspose.threed.Material\#setTexture to assign a ambient texture mapping. |
| [MAP_NORMAL](#MAP-NORMAL) | Used in com.aspose.threed.Material\#setTexture to assign a normal texture mapping. |
## Methods

| Method | Description |
| --- | --- |
| [getTexture(String slotName)](#getTexture-java.lang.String-) | Gets the texture from the specified slot, it can be material's property name or shader's parameter name |
| [setTexture(String slotName, TextureBase texture)](#setTexture-java.lang.String-com.aspose.threed.TextureBase-) | Sets the texture to specified slot |
| [toString()](#toString--) | Formats object to string |
| [iterator()](#iterator--) | Gets the enumerator to enumerate internal texture slots. |
### MAP_SPECULAR {#MAP-SPECULAR}
```
public static final String MAP_SPECULAR
```


Used in com.aspose.threed.Material\#setTexture to assign a specular texture mapping.

### MAP_DIFFUSE {#MAP-DIFFUSE}
```
public static final String MAP_DIFFUSE
```


Used in com.aspose.threed.Material\#setTexture to assign a diffuse texture mapping.

### MAP_EMISSIVE {#MAP-EMISSIVE}
```
public static final String MAP_EMISSIVE
```


Used in com.aspose.threed.Material\#setTexture to assign a emissive texture mapping.

### MAP_AMBIENT {#MAP-AMBIENT}
```
public static final String MAP_AMBIENT
```


Used in com.aspose.threed.Material\#setTexture to assign a ambient texture mapping.

### MAP_NORMAL {#MAP-NORMAL}
```
public static final String MAP_NORMAL
```


Used in com.aspose.threed.Material\#setTexture to assign a normal texture mapping.

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

### toString() {#toString--}
```
public String toString()
```


Formats object to string

**Returns:**
java.lang.String - Object string
### iterator() {#iterator--}
```
public Iterator<TextureSlot> iterator()
```


Gets the enumerator to enumerate internal texture slots.

**Returns:**
java.util.Iterator<com.aspose.threed.TextureSlot>
