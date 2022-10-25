---
title: PbrSpecularMaterial
second_title: Aspose.3D for Java API Reference
description: Material for physically based rendering based on diffuse color/specular/glossiness
type: docs
weight: 109
url: /java/com.aspose.threed/pbrspecularmaterial/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.A3DObject](../../com.aspose.threed/a3dobject), [com.aspose.threed.Material](../../com.aspose.threed/material)
```
public class PbrSpecularMaterial extends Material
```

Material for physically based rendering based on diffuse color/specular/glossiness
## Constructors

| Constructor | Description |
| --- | --- |
| [PbrSpecularMaterial()](#PbrSpecularMaterial--) | Constructor of the com.aspose.threed.PbrSpecularMaterial |
## Fields

| Field | Description |
| --- | --- |
| [MAP_SPECULAR_GLOSSINESS](#MAP-SPECULAR-GLOSSINESS) | The texture map for specular glossiness |
## Methods

| Method | Description |
| --- | --- |
| [getTransparency()](#getTransparency--) | Gets the transparency factor. |
| [setTransparency(double value)](#setTransparency-double-) | Sets the transparency factor. |
| [getNormalTexture()](#getNormalTexture--) | Gets the texture of normal mapping |
| [setNormalTexture(TextureBase value)](#setNormalTexture-com.aspose.threed.TextureBase-) | Sets the texture of normal mapping |
| [getSpecularGlossinessTexture()](#getSpecularGlossinessTexture--) | Gets the texture for specular color, channel RGB stores the specular color and channel A stores the glossiness. |
| [setSpecularGlossinessTexture(TextureBase value)](#setSpecularGlossinessTexture-com.aspose.threed.TextureBase-) | Sets the texture for specular color, channel RGB stores the specular color and channel A stores the glossiness. |
| [getGlossinessFactor()](#getGlossinessFactor--) | Gets the glossiness(smoothness) of the material, 1 means perfectly smooth and 0 means perfectly rough, default value is 1, range is [0, 1] |
| [setGlossinessFactor(double value)](#setGlossinessFactor-double-) | Sets the glossiness(smoothness) of the material, 1 means perfectly smooth and 0 means perfectly rough, default value is 1, range is [0, 1] |
| [getSpecular()](#getSpecular--) | Gets the specular color of the material, default value is (1, 1, 1). |
| [setSpecular(Vector3 value)](#setSpecular-com.aspose.threed.Vector3-) | Sets the specular color of the material, default value is (1, 1, 1). |
| [getDiffuseTexture()](#getDiffuseTexture--) | Gets the texture for diffuse |
| [setDiffuseTexture(TextureBase value)](#setDiffuseTexture-com.aspose.threed.TextureBase-) | Sets the texture for diffuse |
| [getDiffuse()](#getDiffuse--) | Gets the diffuse color of the material, default value is (1, 1, 1) |
| [setDiffuse(Vector3 value)](#setDiffuse-com.aspose.threed.Vector3-) | Sets the diffuse color of the material, default value is (1, 1, 1) |
| [getEmissiveTexture()](#getEmissiveTexture--) | Gets the texture for emissive |
| [setEmissiveTexture(TextureBase value)](#setEmissiveTexture-com.aspose.threed.TextureBase-) | Sets the texture for emissive |
| [getEmissiveColor()](#getEmissiveColor--) | Gets the emissive color, default value is (0, 0, 0) |
| [setEmissiveColor(Vector3 value)](#setEmissiveColor-com.aspose.threed.Vector3-) | Sets the emissive color, default value is (0, 0, 0) |
### PbrSpecularMaterial() {#PbrSpecularMaterial--}
```
public PbrSpecularMaterial()
```


Constructor of the com.aspose.threed.PbrSpecularMaterial

### MAP_SPECULAR_GLOSSINESS {#MAP-SPECULAR-GLOSSINESS}
```
public static final String MAP_SPECULAR_GLOSSINESS
```


The texture map for specular glossiness

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

### getSpecularGlossinessTexture() {#getSpecularGlossinessTexture--}
```
public TextureBase getSpecularGlossinessTexture()
```


Gets the texture for specular color, channel RGB stores the specular color and channel A stores the glossiness.

**Returns:**
[TextureBase](../../com.aspose.threed/texturebase)
### setSpecularGlossinessTexture(TextureBase value) {#setSpecularGlossinessTexture-com.aspose.threed.TextureBase-}
```
public void setSpecularGlossinessTexture(TextureBase value)
```


Sets the texture for specular color, channel RGB stores the specular color and channel A stores the glossiness.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [TextureBase](../../com.aspose.threed/texturebase) | New value |

### getGlossinessFactor() {#getGlossinessFactor--}
```
public double getGlossinessFactor()
```


Gets the glossiness(smoothness) of the material, 1 means perfectly smooth and 0 means perfectly rough, default value is 1, range is [0, 1]

**Returns:**
double
### setGlossinessFactor(double value) {#setGlossinessFactor-double-}
```
public void setGlossinessFactor(double value)
```


Sets the glossiness(smoothness) of the material, 1 means perfectly smooth and 0 means perfectly rough, default value is 1, range is [0, 1]

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### getSpecular() {#getSpecular--}
```
public Vector3 getSpecular()
```


Gets the specular color of the material, default value is (1, 1, 1).

**Returns:**
[Vector3](../../com.aspose.threed/vector3)
### setSpecular(Vector3 value) {#setSpecular-com.aspose.threed.Vector3-}
```
public void setSpecular(Vector3 value)
```


Sets the specular color of the material, default value is (1, 1, 1).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Vector3](../../com.aspose.threed/vector3) | New value |

### getDiffuseTexture() {#getDiffuseTexture--}
```
public TextureBase getDiffuseTexture()
```


Gets the texture for diffuse

**Returns:**
[TextureBase](../../com.aspose.threed/texturebase)
### setDiffuseTexture(TextureBase value) {#setDiffuseTexture-com.aspose.threed.TextureBase-}
```
public void setDiffuseTexture(TextureBase value)
```


Sets the texture for diffuse

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [TextureBase](../../com.aspose.threed/texturebase) | New value |

### getDiffuse() {#getDiffuse--}
```
public Vector3 getDiffuse()
```


Gets the diffuse color of the material, default value is (1, 1, 1)

**Returns:**
[Vector3](../../com.aspose.threed/vector3)
### setDiffuse(Vector3 value) {#setDiffuse-com.aspose.threed.Vector3-}
```
public void setDiffuse(Vector3 value)
```


Sets the diffuse color of the material, default value is (1, 1, 1)

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Vector3](../../com.aspose.threed/vector3) | New value |

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


Gets the emissive color, default value is (0, 0, 0)

**Returns:**
[Vector3](../../com.aspose.threed/vector3)
### setEmissiveColor(Vector3 value) {#setEmissiveColor-com.aspose.threed.Vector3-}
```
public void setEmissiveColor(Vector3 value)
```


Sets the emissive color, default value is (0, 0, 0)

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Vector3](../../com.aspose.threed/vector3) | New value |

