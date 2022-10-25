---
title: ShaderMaterial
second_title: Aspose.3D for Java API Reference
description: A shader material allows to describe the material by external rendering engine or shader language.
type: docs
weight: 149
url: /java/com.aspose.threed/shadermaterial/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.A3DObject](../../com.aspose.threed/a3dobject), [com.aspose.threed.Material](../../com.aspose.threed/material)
```
public class ShaderMaterial extends Material
```

A shader material allows to describe the material by external rendering engine or shader language. com.aspose.threed.ShaderMaterial uses com.aspose.threed.ShaderTechnique to describe the concrete rendering details, and the most suitable one will be used according to the final rendering platform. For example, your com.aspose.threed.ShaderMaterial instance can have two technique, one is defined by HLSL, and another is defined by GLSL Under non-window platform the GLSL should be used instead of HLSL
## Constructors

| Constructor | Description |
| --- | --- |
| [ShaderMaterial()](#ShaderMaterial--) | Initializes a new instance of the com.aspose.threed.ShaderMaterial class. |
| [ShaderMaterial(String name)](#ShaderMaterial-java.lang.String-) | Initializes a new instance of the com.aspose.threed.ShaderMaterial class. |
## Methods

| Method | Description |
| --- | --- |
| [getTechniques()](#getTechniques--) | Gets all available techniques defined in this material. |
### ShaderMaterial() {#ShaderMaterial--}
```
public ShaderMaterial()
```


Initializes a new instance of the com.aspose.threed.ShaderMaterial class.

### ShaderMaterial(String name) {#ShaderMaterial-java.lang.String-}
```
public ShaderMaterial(String name)
```


Initializes a new instance of the com.aspose.threed.ShaderMaterial class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String | Name |

### getTechniques() {#getTechniques--}
```
public List<ShaderTechnique> getTechniques()
```


Gets all available techniques defined in this material.

**Returns:**
java.util.List<com.aspose.threed.ShaderTechnique>
