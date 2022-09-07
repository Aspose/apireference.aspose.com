---
title: PbrMaterial
second_title: Aspose.3D for Java API Reference
description: Material for physically based rendering based on albedo color/metallic/roughness
type: docs
weight: 108
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
| [PbrMaterial(Color albedo)](#PbrMaterial-java.awt.Color-) | Construct a default PBR material with specified albedo color value. |
## Methods

| Method | Description |
| --- | --- |
| [getTransparency()](#getTransparency--) | Gets the transparency factor. |
| [setTransparency(double value)](#setTransparency-double-) | Sets the transparency factor. |
| [getNormalTexture()](#getNormalTexture--) | Gets the texture of normal mapping |
| [setNormalTexture(TextureBase value)](#setNormalTexture-com.aspose.threed.TextureBase-) | Sets the texture of normal mapping |
| [getSpecularTexture()](#getSpecularTexture--) | Gets the texture for specular color |
| [setSpecularTexture(TextureBase value)](#setSpecularTexture-com.aspose.threed.TextureBase-) | Sets the texture for specular color |
| [getAlbedoTexture()](#getAlbedoTexture--) | Gets the texture for albedo |
| [setAlbedoTexture(TextureBase value)](#setAlbedoTexture-com.aspose.threed.TextureBase-) | Sets the texture for albedo |
| [getAlbedo()](#getAlbedo--) | Gets the base color of the material |
| [setAlbedo(Vector3 value)](#setAlbedo-com.aspose.threed.Vector3-) | Sets the base color of the material |
| [getOcclusionTexture()](#getOcclusionTexture--) | Gets the texture for ambient occlusion |
| [setOcclusionTexture(TextureBase value)](#setOcclusionTexture-com.aspose.threed.TextureBase-) | Sets the texture for ambient occlusion |
| [getOcclusionFactor()](#getOcclusionFactor--) | Gets the factor of ambient occlusion |
| [setOcclusionFactor(double value)](#setOcclusionFactor-double-) | Sets the factor of ambient occlusion |
| [getMetallicFactor()](#getMetallicFactor--) | Gets the metalness of the material, value of 1 means the material is a metal and value of 0 means the material is a dielectric. |
| [setMetallicFactor(double value)](#setMetallicFactor-double-) | Sets the metalness of the material, value of 1 means the material is a metal and value of 0 means the material is a dielectric. |
| [getRoughnessFactor()](#getRoughnessFactor--) | Gets the roughness of the material, value of 1 means the material is completely rough and value of 0 means the material is completely smooth |
| [setRoughnessFactor(double value)](#setRoughnessFactor-double-) | Sets the roughness of the material, value of 1 means the material is completely rough and value of 0 means the material is completely smooth |
| [getMetallicRoughness()](#getMetallicRoughness--) | Gets the texture for metallic(in R channel) and roughness(in G channel) |
| [setMetallicRoughness(TextureBase value)](#setMetallicRoughness-com.aspose.threed.TextureBase-) | Sets the texture for metallic(in R channel) and roughness(in G channel) |
| [getEmissiveTexture()](#getEmissiveTexture--) | Gets the texture for emissive |
| [setEmissiveTexture(TextureBase value)](#setEmissiveTexture-com.aspose.threed.TextureBase-) | Sets the texture for emissive |
| [getEmissiveColor()](#getEmissiveColor--) | Gets the emissive color |
| [setEmissiveColor(Vector3 value)](#setEmissiveColor-com.aspose.threed.Vector3-) | Sets the emissive color |
| [fromMaterial(Material material)](#fromMaterial-com.aspose.threed.Material-) | Allow convert other material to PbrMaterial |
### PbrMaterial() {#PbrMaterial--}
```
public PbrMaterial()
```


Construct a default PBR material instance

### PbrMaterial(Color albedo) {#PbrMaterial-java.awt.Color-}
```
public PbrMaterial(Color albedo)
```


Construct a default PBR material with specified albedo color value.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| albedo | java.awt.Color | The default albedo color value |

### getTransparency() {#getTransparency--}
```
public double getTransparency()
```


Gets the transparency factor. The factor should be ranged between 0(0%, fully opaque) and 1(100%, fully transparent) Any invalid factor value will be clamped.

**Returns:**
double
### setTransparency(double value) {#setTransparency-double-}
```
public void setTransparency(double value)
```


Sets the transparency factor. The factor should be ranged between 0(0%, fully opaque) and 1(100%, fully transparent) Any invalid factor value will be clamped.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### getNormalTexture() {#getNormalTexture--}
```
public TextureBase getNormalTexture()
```


Gets the texture of normal mapping

**Returns:**
[TextureBase](../../com.aspose.threed/texturebase)
### setNormalTexture(TextureBase value) {#setNormalTexture-com.aspose.threed.TextureBase-}
```
public void setNormalTexture(TextureBase value)
```


Sets the texture of normal mapping

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [TextureBase](../../com.aspose.threed/texturebase) | New value |

### getSpecularTexture() {#getSpecularTexture--}
```
public TextureBase getSpecularTexture()
```


Gets the texture for specular color

**Returns:**
[TextureBase](../../com.aspose.threed/texturebase)
### setSpecularTexture(TextureBase value) {#setSpecularTexture-com.aspose.threed.TextureBase-}
```
public void setSpecularTexture(TextureBase value)
```


Sets the texture for specular color

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [TextureBase](../../com.aspose.threed/texturebase) | New value |

### getAlbedoTexture() {#getAlbedoTexture--}
```
public TextureBase getAlbedoTexture()
```


Gets the texture for albedo

**Returns:**
[TextureBase](../../com.aspose.threed/texturebase)
### setAlbedoTexture(TextureBase value) {#setAlbedoTexture-com.aspose.threed.TextureBase-}
```
public void setAlbedoTexture(TextureBase value)
```


Sets the texture for albedo

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [TextureBase](../../com.aspose.threed/texturebase) | New value |

### getAlbedo() {#getAlbedo--}
```
public Vector3 getAlbedo()
```


Gets the base color of the material

**Returns:**
[Vector3](../../com.aspose.threed/vector3)
### setAlbedo(Vector3 value) {#setAlbedo-com.aspose.threed.Vector3-}
```
public void setAlbedo(Vector3 value)
```


Sets the base color of the material

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Vector3](../../com.aspose.threed/vector3) | New value |

### getOcclusionTexture() {#getOcclusionTexture--}
```
public TextureBase getOcclusionTexture()
```


Gets the texture for ambient occlusion

**Returns:**
[TextureBase](../../com.aspose.threed/texturebase)
### setOcclusionTexture(TextureBase value) {#setOcclusionTexture-com.aspose.threed.TextureBase-}
```
public void setOcclusionTexture(TextureBase value)
```


Sets the texture for ambient occlusion

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [TextureBase](../../com.aspose.threed/texturebase) | New value |

### getOcclusionFactor() {#getOcclusionFactor--}
```
public double getOcclusionFactor()
```


Gets the factor of ambient occlusion

**Returns:**
double
### setOcclusionFactor(double value) {#setOcclusionFactor-double-}
```
public void setOcclusionFactor(double value)
```


Sets the factor of ambient occlusion

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### getMetallicFactor() {#getMetallicFactor--}
```
public double getMetallicFactor()
```


Gets the metalness of the material, value of 1 means the material is a metal and value of 0 means the material is a dielectric.

**Returns:**
double
### setMetallicFactor(double value) {#setMetallicFactor-double-}
```
public void setMetallicFactor(double value)
```


Sets the metalness of the material, value of 1 means the material is a metal and value of 0 means the material is a dielectric.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### getRoughnessFactor() {#getRoughnessFactor--}
```
public double getRoughnessFactor()
```


Gets the roughness of the material, value of 1 means the material is completely rough and value of 0 means the material is completely smooth

**Returns:**
double
### setRoughnessFactor(double value) {#setRoughnessFactor-double-}
```
public void setRoughnessFactor(double value)
```


Sets the roughness of the material, value of 1 means the material is completely rough and value of 0 means the material is completely smooth

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### getMetallicRoughness() {#getMetallicRoughness--}
```
public TextureBase getMetallicRoughness()
```


Gets the texture for metallic(in R channel) and roughness(in G channel)

**Returns:**
[TextureBase](../../com.aspose.threed/texturebase)
### setMetallicRoughness(TextureBase value) {#setMetallicRoughness-com.aspose.threed.TextureBase-}
```
public void setMetallicRoughness(TextureBase value)
```


Sets the texture for metallic(in R channel) and roughness(in G channel)

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [TextureBase](../../com.aspose.threed/texturebase) | New value |

### getEmissiveTexture() {#getEmissiveTexture--}
```
public TextureBase getEmissiveTexture()
```


Gets the texture for emissive

**Returns:**
[TextureBase](../../com.aspose.threed/texturebase)
### setEmissiveTexture(TextureBase value) {#setEmissiveTexture-com.aspose.threed.TextureBase-}
```
public void setEmissiveTexture(TextureBase value)
```


Sets the texture for emissive

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [TextureBase](../../com.aspose.threed/texturebase) | New value |

### getEmissiveColor() {#getEmissiveColor--}
```
public Vector3 getEmissiveColor()
```


Gets the emissive color

**Returns:**
[Vector3](../../com.aspose.threed/vector3)
### setEmissiveColor(Vector3 value) {#setEmissiveColor-com.aspose.threed.Vector3-}
```
public void setEmissiveColor(Vector3 value)
```


Sets the emissive color

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Vector3](../../com.aspose.threed/vector3) | New value |

### fromMaterial(Material material) {#fromMaterial-com.aspose.threed.Material-}
```
public static PbrMaterial fromMaterial(Material material)
```


Allow convert other material to PbrMaterial

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| material | [Material](../../com.aspose.threed/material) |  |

**Returns:**
[PbrMaterial](../../com.aspose.threed/pbrmaterial)
