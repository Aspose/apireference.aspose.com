---
title: LambertMaterial
second_title: Aspose.3D for Java API Reference
description: Material for lambert shading model
type: docs
weight: 82
url: /java/com.aspose.threed/lambertmaterial/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.A3DObject](../../com.aspose.threed/a3dobject), [com.aspose.threed.Material](../../com.aspose.threed/material)
```
public class LambertMaterial extends Material
```

Material for lambert shading model
## Constructors

| Constructor | Description |
| --- | --- |
| [LambertMaterial()](#LambertMaterial--) | Initializes a new instance of the com.aspose.threed.LambertMaterial class. |
| [LambertMaterial(String name)](#LambertMaterial-java.lang.String-) | Initializes a new instance of the com.aspose.threed.LambertMaterial class. |
## Methods

| Method | Description |
| --- | --- |
| [getEmissiveColor()](#getEmissiveColor--) | Gets the emissive color |
| [setEmissiveColor(Vector3 value)](#setEmissiveColor-com.aspose.threed.Vector3-) | Sets the emissive color |
| [getAmbientColor()](#getAmbientColor--) | Gets the ambient color |
| [setAmbientColor(Vector3 value)](#setAmbientColor-com.aspose.threed.Vector3-) | Sets the ambient color |
| [getDiffuseColor()](#getDiffuseColor--) | Gets the diffuse color |
| [setDiffuseColor(Vector3 value)](#setDiffuseColor-com.aspose.threed.Vector3-) | Sets the diffuse color |
| [getTransparentColor()](#getTransparentColor--) | Gets the transparent color. |
| [setTransparentColor(Vector3 value)](#setTransparentColor-com.aspose.threed.Vector3-) | Sets the transparent color. |
| [getTransparency()](#getTransparency--) | Gets the transparency factor. |
| [setTransparency(double value)](#setTransparency-double-) | Sets the transparency factor. |
### LambertMaterial() {#LambertMaterial--}
```
public LambertMaterial()
```


Initializes a new instance of the com.aspose.threed.LambertMaterial class.

### LambertMaterial(String name) {#LambertMaterial-java.lang.String-}
```
public LambertMaterial(String name)
```


Initializes a new instance of the com.aspose.threed.LambertMaterial class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String | Name |

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

### getAmbientColor() {#getAmbientColor--}
```
public Vector3 getAmbientColor()
```


Gets the ambient color

**Returns:**
[Vector3](../../com.aspose.threed/vector3)
### setAmbientColor(Vector3 value) {#setAmbientColor-com.aspose.threed.Vector3-}
```
public void setAmbientColor(Vector3 value)
```


Sets the ambient color

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Vector3](../../com.aspose.threed/vector3) | New value |

### getDiffuseColor() {#getDiffuseColor--}
```
public Vector3 getDiffuseColor()
```


Gets the diffuse color

**Returns:**
[Vector3](../../com.aspose.threed/vector3)
### setDiffuseColor(Vector3 value) {#setDiffuseColor-com.aspose.threed.Vector3-}
```
public void setDiffuseColor(Vector3 value)
```


Sets the diffuse color

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Vector3](../../com.aspose.threed/vector3) | New value |

### getTransparentColor() {#getTransparentColor--}
```
public Vector3 getTransparentColor()
```


Gets the transparent color.

**Returns:**
[Vector3](../../com.aspose.threed/vector3)
### setTransparentColor(Vector3 value) {#setTransparentColor-com.aspose.threed.Vector3-}
```
public void setTransparentColor(Vector3 value)
```


Sets the transparent color.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Vector3](../../com.aspose.threed/vector3) | New value |

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

