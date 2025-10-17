---
title: PbrMaterial
second_title: Aspose.3D for Java API Reference
description: Material for physically based rendering based on albedo color/metallic/roughness
type: docs
weight: 121
url: /java/com.aspose.threed/pbrmaterial/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.A3DObject](../../com.aspose.threed/a3dobject), [com.aspose.threed.Material](../../com.aspose.threed/material)
```
public class PbrMaterial extends Material
```

Material for physically based rendering based on albedo color/metallic/roughness
## Constructors

| Constructor | Description |
| --- | --- |
| [PbrMaterial()](#PbrMaterial--) | Construct a default PBR material instance |
| [PbrMaterial(Vector3 albedo)](#PbrMaterial-com.aspose.threed.Vector3-) | Construct a default PBR material with specified albedo color value. |
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
| [fromMaterial(Material material)](#fromMaterial-com.aspose.threed.Material-) | Allow convert other material to PbrMaterial **Example:** |
| [getAlbedo()](#getAlbedo--) | Gets the base color of the material |
| [getAlbedoTexture()](#getAlbedoTexture--) | Gets the texture for albedo |
| [getClass()](#getClass--) |  |
| [getEmissiveColor()](#getEmissiveColor--) | Gets the emissive color |
| [getEmissiveTexture()](#getEmissiveTexture--) | Gets the texture for emissive |
| [getMetallicFactor()](#getMetallicFactor--) | Gets the metalness of the material, value of 1 means the material is a metal and value of 0 means the material is a dielectric. |
| [getMetallicRoughness()](#getMetallicRoughness--) | Gets the texture for metallic(in R channel) and roughness(in G channel) |
| [getName()](#getName--) | Gets the name. |
| [getNormalTexture()](#getNormalTexture--) | Gets the texture of normal mapping |
| [getOcclusionFactor()](#getOcclusionFactor--) | Gets the factor of ambient occlusion |
| [getOcclusionTexture()](#getOcclusionTexture--) | Gets the texture for ambient occlusion |
| [getProperties()](#getProperties--) | Gets the collection of all properties. |
| [getProperty(String property)](#getProperty-java.lang.String-) | Get the value of specified property |
| [getRoughnessFactor()](#getRoughnessFactor--) | Gets the roughness of the material, value of 1 means the material is completely rough and value of 0 means the material is completely smooth |
| [getSpecularTexture()](#getSpecularTexture--) | Gets the texture for specular color |
| [getTexture(String slotName)](#getTexture-java.lang.String-) | Gets the texture from the specified slot, it can be material's property name or shader's parameter name |
| [getTransparency()](#getTransparency--) | Gets the transparency factor. |
| [hashCode()](#hashCode--) |  |
| [iterator()](#iterator--) | Gets the enumerator to enumerate internal texture slots. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [removeProperty(Property property)](#removeProperty-com.aspose.threed.Property-) | Removes a dynamic property. |
| [removeProperty(String property)](#removeProperty-java.lang.String-) | Remove the specified property identified by name |
| [setAlbedo(Vector3 value)](#setAlbedo-com.aspose.threed.Vector3-) | Sets the base color of the material |
| [setAlbedoTexture(TextureBase value)](#setAlbedoTexture-com.aspose.threed.TextureBase-) | Sets the texture for albedo |
| [setEmissiveColor(Vector3 value)](#setEmissiveColor-com.aspose.threed.Vector3-) | Sets the emissive color |
| [setEmissiveTexture(TextureBase value)](#setEmissiveTexture-com.aspose.threed.TextureBase-) | Sets the texture for emissive |
| [setMetallicFactor(double value)](#setMetallicFactor-double-) | Sets the metalness of the material, value of 1 means the material is a metal and value of 0 means the material is a dielectric. |
| [setMetallicRoughness(TextureBase value)](#setMetallicRoughness-com.aspose.threed.TextureBase-) | Sets the texture for metallic(in R channel) and roughness(in G channel) |
| [setName(String value)](#setName-java.lang.String-) | Sets the name. |
| [setNormalTexture(TextureBase value)](#setNormalTexture-com.aspose.threed.TextureBase-) | Sets the texture of normal mapping |
| [setOcclusionFactor(double value)](#setOcclusionFactor-double-) | Sets the factor of ambient occlusion |
| [setOcclusionTexture(TextureBase value)](#setOcclusionTexture-com.aspose.threed.TextureBase-) | Sets the texture for ambient occlusion |
| [setProperty(String property, Object value)](#setProperty-java.lang.String-java.lang.Object-) | Sets the value of specified property |
| [setRoughnessFactor(double value)](#setRoughnessFactor-double-) | Sets the roughness of the material, value of 1 means the material is completely rough and value of 0 means the material is completely smooth |
| [setSpecularTexture(TextureBase value)](#setSpecularTexture-com.aspose.threed.TextureBase-) | Sets the texture for specular color |
| [setTexture(String slotName, TextureBase texture)](#setTexture-java.lang.String-com.aspose.threed.TextureBase-) | Sets the texture to specified slot |
| [setTransparency(double value)](#setTransparency-double-) | Sets the transparency factor. |
| [toString()](#toString--) | Formats object to string |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PbrMaterial() {#PbrMaterial--}
```
public PbrMaterial()
```


Construct a default PBR material instance

### PbrMaterial(Vector3 albedo) {#PbrMaterial-com.aspose.threed.Vector3-}
```
public PbrMaterial(Vector3 albedo)
```


Construct a default PBR material with specified albedo color value.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| albedo | [Vector3](../../com.aspose.threed/vector3) | The default albedo color value |

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
### fromMaterial(Material material) {#fromMaterial-com.aspose.threed.Material-}
```
public static PbrMaterial fromMaterial(Material material)
```


Allow convert other material to PbrMaterial **Example:**

```
var mat = new LambertMaterial();
     var tex = new Texture();
     tex.setFileName("diffuse.png");
     mat.setTexture(Material.MAP_DIFFUSE, tex);
     mat.setDiffuseColor(new Vector3(0.3, 0.9, 0.4));
     PbrMaterial pbr = PbrMaterial.fromMaterial(mat);
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| material | [Material](../../com.aspose.threed/material) |  |

**Returns:**
[PbrMaterial](../../com.aspose.threed/pbrmaterial)
### getAlbedo() {#getAlbedo--}
```
public Vector3 getAlbedo()
```


Gets the base color of the material

**Returns:**
[Vector3](../../com.aspose.threed/vector3) - the base color of the material
### getAlbedoTexture() {#getAlbedoTexture--}
```
public TextureBase getAlbedoTexture()
```


Gets the texture for albedo

**Returns:**
[TextureBase](../../com.aspose.threed/texturebase) - the texture for albedo
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getEmissiveColor() {#getEmissiveColor--}
```
public Vector3 getEmissiveColor()
```


Gets the emissive color

**Returns:**
[Vector3](../../com.aspose.threed/vector3) - the emissive color
### getEmissiveTexture() {#getEmissiveTexture--}
```
public TextureBase getEmissiveTexture()
```


Gets the texture for emissive

**Returns:**
[TextureBase](../../com.aspose.threed/texturebase) - the texture for emissive
### getMetallicFactor() {#getMetallicFactor--}
```
public double getMetallicFactor()
```


Gets the metalness of the material, value of 1 means the material is a metal and value of 0 means the material is a dielectric.

**Returns:**
double - the metalness of the material, value of 1 means the material is a metal and value of 0 means the material is a dielectric.
### getMetallicRoughness() {#getMetallicRoughness--}
```
public TextureBase getMetallicRoughness()
```


Gets the texture for metallic(in R channel) and roughness(in G channel)

**Returns:**
[TextureBase](../../com.aspose.threed/texturebase) - the texture for metallic(in R channel) and roughness(in G channel)
### getName() {#getName--}
```
public String getName()
```


Gets the name.

**Returns:**
java.lang.String - the name.
### getNormalTexture() {#getNormalTexture--}
```
public TextureBase getNormalTexture()
```


Gets the texture of normal mapping

**Returns:**
[TextureBase](../../com.aspose.threed/texturebase) - the texture of normal mapping
### getOcclusionFactor() {#getOcclusionFactor--}
```
public double getOcclusionFactor()
```


Gets the factor of ambient occlusion

**Returns:**
double - the factor of ambient occlusion
### getOcclusionTexture() {#getOcclusionTexture--}
```
public TextureBase getOcclusionTexture()
```


Gets the texture for ambient occlusion

**Returns:**
[TextureBase](../../com.aspose.threed/texturebase) - the texture for ambient occlusion
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
### getRoughnessFactor() {#getRoughnessFactor--}
```
public double getRoughnessFactor()
```


Gets the roughness of the material, value of 1 means the material is completely rough and value of 0 means the material is completely smooth

**Returns:**
double - the roughness of the material, value of 1 means the material is completely rough and value of 0 means the material is completely smooth
### getSpecularTexture() {#getSpecularTexture--}
```
public TextureBase getSpecularTexture()
```


Gets the texture for specular color

**Returns:**
[TextureBase](../../com.aspose.threed/texturebase) - the texture for specular color
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
### getTransparency() {#getTransparency--}
```
public double getTransparency()
```


Gets the transparency factor. The factor should be ranged between 0(0%, fully opaque) and 1(100%, fully transparent) Any invalid factor value will be clamped.

**Returns:**
double - the transparency factor. The factor should be ranged between 0(0%, fully opaque) and 1(100%, fully transparent) Any invalid factor value will be clamped.
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
### setAlbedo(Vector3 value) {#setAlbedo-com.aspose.threed.Vector3-}
```
public void setAlbedo(Vector3 value)
```


Sets the base color of the material

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Vector3](../../com.aspose.threed/vector3) | New value |

### setAlbedoTexture(TextureBase value) {#setAlbedoTexture-com.aspose.threed.TextureBase-}
```
public void setAlbedoTexture(TextureBase value)
```


Sets the texture for albedo

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [TextureBase](../../com.aspose.threed/texturebase) | New value |

### setEmissiveColor(Vector3 value) {#setEmissiveColor-com.aspose.threed.Vector3-}
```
public void setEmissiveColor(Vector3 value)
```


Sets the emissive color

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Vector3](../../com.aspose.threed/vector3) | New value |

### setEmissiveTexture(TextureBase value) {#setEmissiveTexture-com.aspose.threed.TextureBase-}
```
public void setEmissiveTexture(TextureBase value)
```


Sets the texture for emissive

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [TextureBase](../../com.aspose.threed/texturebase) | New value |

### setMetallicFactor(double value) {#setMetallicFactor-double-}
```
public void setMetallicFactor(double value)
```


Sets the metalness of the material, value of 1 means the material is a metal and value of 0 means the material is a dielectric.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### setMetallicRoughness(TextureBase value) {#setMetallicRoughness-com.aspose.threed.TextureBase-}
```
public void setMetallicRoughness(TextureBase value)
```


Sets the texture for metallic(in R channel) and roughness(in G channel)

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [TextureBase](../../com.aspose.threed/texturebase) | New value |

### setName(String value) {#setName-java.lang.String-}
```
public void setName(String value)
```


Sets the name.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New value |

### setNormalTexture(TextureBase value) {#setNormalTexture-com.aspose.threed.TextureBase-}
```
public void setNormalTexture(TextureBase value)
```


Sets the texture of normal mapping

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [TextureBase](../../com.aspose.threed/texturebase) | New value |

### setOcclusionFactor(double value) {#setOcclusionFactor-double-}
```
public void setOcclusionFactor(double value)
```


Sets the factor of ambient occlusion

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### setOcclusionTexture(TextureBase value) {#setOcclusionTexture-com.aspose.threed.TextureBase-}
```
public void setOcclusionTexture(TextureBase value)
```


Sets the texture for ambient occlusion

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [TextureBase](../../com.aspose.threed/texturebase) | New value |

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

### setRoughnessFactor(double value) {#setRoughnessFactor-double-}
```
public void setRoughnessFactor(double value)
```


Sets the roughness of the material, value of 1 means the material is completely rough and value of 0 means the material is completely smooth

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### setSpecularTexture(TextureBase value) {#setSpecularTexture-com.aspose.threed.TextureBase-}
```
public void setSpecularTexture(TextureBase value)
```


Sets the texture for specular color

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [TextureBase](../../com.aspose.threed/texturebase) | New value |

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

### setTransparency(double value) {#setTransparency-double-}
```
public void setTransparency(double value)
```


Sets the transparency factor. The factor should be ranged between 0(0%, fully opaque) and 1(100%, fully transparent) Any invalid factor value will be clamped.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

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

