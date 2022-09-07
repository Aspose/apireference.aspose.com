---
title: ShaderSet
second_title: Aspose.3D for Java API Reference
description: Shader programs for each kind of materials
type: docs
weight: 151
url: /java/com.aspose.threed/shaderset/
---

**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
java.io.Closeable
```
public class ShaderSet implements Closeable
```

Shader programs for each kind of materials
## Constructors

| Constructor | Description |
| --- | --- |
| [ShaderSet()](#ShaderSet--) | Construct the instance of com.aspose.threed.ShaderSet |
## Methods

| Method | Description |
| --- | --- |
| [getLambert()](#getLambert--) | Gets the shader that used to render the lambert material |
| [setLambert(ShaderProgram value)](#setLambert-com.aspose.threed.ShaderProgram-) | Sets the shader that used to render the lambert material |
| [getPhong()](#getPhong--) | Gets the shader that used to render the phong material |
| [setPhong(ShaderProgram value)](#setPhong-com.aspose.threed.ShaderProgram-) | Sets the shader that used to render the phong material |
| [getPbr()](#getPbr--) | Gets the shader that used to render the PBR material |
| [setPbr(ShaderProgram value)](#setPbr-com.aspose.threed.ShaderProgram-) | Sets the shader that used to render the PBR material |
| [getFallback()](#getFallback--) | Gets the fallback shader when required shader is unavailable |
| [setFallback(ShaderProgram value)](#setFallback-com.aspose.threed.ShaderProgram-) | Sets the fallback shader when required shader is unavailable |
| [close()](#close--) | Dispose this instance and release all shader programs. |
### ShaderSet() {#ShaderSet--}
```
public ShaderSet()
```


Construct the instance of com.aspose.threed.ShaderSet

### getLambert() {#getLambert--}
```
public ShaderProgram getLambert()
```


Gets the shader that used to render the lambert material

**Returns:**
[ShaderProgram](../../com.aspose.threed/shaderprogram)
### setLambert(ShaderProgram value) {#setLambert-com.aspose.threed.ShaderProgram-}
```
public void setLambert(ShaderProgram value)
```


Sets the shader that used to render the lambert material

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [ShaderProgram](../../com.aspose.threed/shaderprogram) | New value |

### getPhong() {#getPhong--}
```
public ShaderProgram getPhong()
```


Gets the shader that used to render the phong material

**Returns:**
[ShaderProgram](../../com.aspose.threed/shaderprogram)
### setPhong(ShaderProgram value) {#setPhong-com.aspose.threed.ShaderProgram-}
```
public void setPhong(ShaderProgram value)
```


Sets the shader that used to render the phong material

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [ShaderProgram](../../com.aspose.threed/shaderprogram) | New value |

### getPbr() {#getPbr--}
```
public ShaderProgram getPbr()
```


Gets the shader that used to render the PBR material

**Returns:**
[ShaderProgram](../../com.aspose.threed/shaderprogram)
### setPbr(ShaderProgram value) {#setPbr-com.aspose.threed.ShaderProgram-}
```
public void setPbr(ShaderProgram value)
```


Sets the shader that used to render the PBR material

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [ShaderProgram](../../com.aspose.threed/shaderprogram) | New value |

### getFallback() {#getFallback--}
```
public ShaderProgram getFallback()
```


Gets the fallback shader when required shader is unavailable

**Returns:**
[ShaderProgram](../../com.aspose.threed/shaderprogram)
### setFallback(ShaderProgram value) {#setFallback-com.aspose.threed.ShaderProgram-}
```
public void setFallback(ShaderProgram value)
```


Sets the fallback shader when required shader is unavailable

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [ShaderProgram](../../com.aspose.threed/shaderprogram) | New value |

### close() {#close--}
```
public void close()
```


Dispose this instance and release all shader programs.

