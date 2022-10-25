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
| [PhongMaterial()](#PhongMaterial--) | Initializes a new instance of the com.aspose.threed.PhongMaterial class. |
| [PhongMaterial(String name)](#PhongMaterial-java.lang.String-) | Initializes a new instance of the com.aspose.threed.PhongMaterial class. |
## Methods

| Method | Description |
| --- | --- |
| [getSpecularColor()](#getSpecularColor--) | Gets the specular color. |
| [setSpecularColor(Vector3 value)](#setSpecularColor-com.aspose.threed.Vector3-) | Sets the specular color. |
| [getSpecularFactor()](#getSpecularFactor--) | Gets the specular factor. |
| [setSpecularFactor(double value)](#setSpecularFactor-double-) | Sets the specular factor. |
| [getShininess()](#getShininess--) | Gets the shininess, this controls the specular highlight's size. |
| [setShininess(double value)](#setShininess-double-) | Sets the shininess, this controls the specular highlight's size. |
| [getReflectionColor()](#getReflectionColor--) | Gets the reflection color. |
| [setReflectionColor(Vector3 value)](#setReflectionColor-com.aspose.threed.Vector3-) | Sets the reflection color. |
| [getReflectionFactor()](#getReflectionFactor--) | Gets the attenuation of the reflection color. |
| [setReflectionFactor(double value)](#setReflectionFactor-double-) | Sets the attenuation of the reflection color. |
### PhongMaterial() {#PhongMaterial--}
```
public PhongMaterial()
```


Initializes a new instance of the com.aspose.threed.PhongMaterial class.

### PhongMaterial(String name) {#PhongMaterial-java.lang.String-}
```
public PhongMaterial(String name)
```


Initializes a new instance of the com.aspose.threed.PhongMaterial class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String | Name |

### getSpecularColor() {#getSpecularColor--}
```
public Vector3 getSpecularColor()
```


Gets the specular color.

**Returns:**
[Vector3](../../com.aspose.threed/vector3)
### setSpecularColor(Vector3 value) {#setSpecularColor-com.aspose.threed.Vector3-}
```
public void setSpecularColor(Vector3 value)
```


Sets the specular color.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Vector3](../../com.aspose.threed/vector3) | New value |

### getSpecularFactor() {#getSpecularFactor--}
```
public double getSpecularFactor()
```


Gets the specular factor. The formula of specular: SpecularColor \* SpecularFactor \* (N dot H) ^ Shininess

**Returns:**
double
### setSpecularFactor(double value) {#setSpecularFactor-double-}
```
public void setSpecularFactor(double value)
```


Sets the specular factor. The formula of specular: SpecularColor \* SpecularFactor \* (N dot H) ^ Shininess

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### getShininess() {#getShininess--}
```
public double getShininess()
```


Gets the shininess, this controls the specular highlight's size. The formula of specular: SpecularColor \* SpecularFactor \* (N dot H) ^ Shininess

**Returns:**
double
### setShininess(double value) {#setShininess-double-}
```
public void setShininess(double value)
```


Sets the shininess, this controls the specular highlight's size. The formula of specular: SpecularColor \* SpecularFactor \* (N dot H) ^ Shininess

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### getReflectionColor() {#getReflectionColor--}
```
public Vector3 getReflectionColor()
```


Gets the reflection color.

**Returns:**
[Vector3](../../com.aspose.threed/vector3)
### setReflectionColor(Vector3 value) {#setReflectionColor-com.aspose.threed.Vector3-}
```
public void setReflectionColor(Vector3 value)
```


Sets the reflection color.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Vector3](../../com.aspose.threed/vector3) | New value |

### getReflectionFactor() {#getReflectionFactor--}
```
public double getReflectionFactor()
```


Gets the attenuation of the reflection color.

**Returns:**
double
### setReflectionFactor(double value) {#setReflectionFactor-double-}
```
public void setReflectionFactor(double value)
```


Sets the attenuation of the reflection color.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

