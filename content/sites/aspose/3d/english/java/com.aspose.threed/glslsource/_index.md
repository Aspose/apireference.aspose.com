---
title: GLSLSource
second_title: Aspose.3D for Java API Reference
description: The source code of shaders in GLSL
type: docs
weight: 65
url: /java/com.aspose.threed/glslsource/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.ShaderSource](../../com.aspose.threed/shadersource)
```
public final class GLSLSource extends ShaderSource
```

The source code of shaders in GLSL
## Constructors

| Constructor | Description |
| --- | --- |
| [GLSLSource()](#GLSLSource--) |  |
## Methods

| Method | Description |
| --- | --- |
| [getComputeShader()](#getComputeShader--) | Gets the source code of the compute shader. |
| [setComputeShader(String value)](#setComputeShader-java.lang.String-) | Sets the source code of the compute shader. |
| [getGeometryShader()](#getGeometryShader--) | Gets the source code of the geometry shader. |
| [setGeometryShader(String value)](#setGeometryShader-java.lang.String-) | Sets the source code of the geometry shader. |
| [getVertexShader()](#getVertexShader--) | Gets the source code of the vertex shader |
| [setVertexShader(String value)](#setVertexShader-java.lang.String-) | Sets the source code of the vertex shader |
| [getFragmentShader()](#getFragmentShader--) | Gets the source code of the fragment shader. |
| [setFragmentShader(String value)](#setFragmentShader-java.lang.String-) | Sets the source code of the fragment shader. |
| [defineInclude(String fileName, String content)](#defineInclude-java.lang.String-java.lang.String-) | Define virtual file for \#include in GLSL source code |
### GLSLSource() {#GLSLSource--}
```
public GLSLSource()
```


### getComputeShader() {#getComputeShader--}
```
public String getComputeShader()
```


Gets the source code of the compute shader.

**Returns:**
java.lang.String
### setComputeShader(String value) {#setComputeShader-java.lang.String-}
```
public void setComputeShader(String value)
```


Sets the source code of the compute shader.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New value |

### getGeometryShader() {#getGeometryShader--}
```
public String getGeometryShader()
```


Gets the source code of the geometry shader.

**Returns:**
java.lang.String
### setGeometryShader(String value) {#setGeometryShader-java.lang.String-}
```
public void setGeometryShader(String value)
```


Sets the source code of the geometry shader.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New value |

### getVertexShader() {#getVertexShader--}
```
public String getVertexShader()
```


Gets the source code of the vertex shader

**Returns:**
java.lang.String
### setVertexShader(String value) {#setVertexShader-java.lang.String-}
```
public void setVertexShader(String value)
```


Sets the source code of the vertex shader

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New value |

### getFragmentShader() {#getFragmentShader--}
```
public String getFragmentShader()
```


Gets the source code of the fragment shader.

**Returns:**
java.lang.String
### setFragmentShader(String value) {#setFragmentShader-java.lang.String-}
```
public void setFragmentShader(String value)
```


Sets the source code of the fragment shader.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New value |

### defineInclude(String fileName, String content) {#defineInclude-java.lang.String-java.lang.String-}
```
public void defineInclude(String fileName, String content)
```


Define virtual file for \#include in GLSL source code

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fileName | java.lang.String | File name of the virtual file |
| content | java.lang.String |  |

