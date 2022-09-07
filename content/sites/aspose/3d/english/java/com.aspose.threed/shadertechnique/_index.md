---
title: ShaderTechnique
second_title: Aspose.3D for Java API Reference
description: A shader technique represents a concrete rendering implementation.
type: docs
weight: 154
url: /java/com.aspose.threed/shadertechnique/
---

**Inheritance:**
java.lang.Object
```
public class ShaderTechnique
```

A shader technique represents a concrete rendering implementation.
## Constructors

| Constructor | Description |
| --- | --- |
| [ShaderTechnique()](#ShaderTechnique--) | Initializes a new instance of the com.aspose.threed.ShaderTechnique class. |
## Methods

| Method | Description |
| --- | --- |
| [getDescription()](#getDescription--) | Gets the description of this technique |
| [setDescription(String value)](#setDescription-java.lang.String-) | Sets the description of this technique |
| [getShaderLanguage()](#getShaderLanguage--) | Gets the shader language used by this technique. |
| [setShaderLanguage(String value)](#setShaderLanguage-java.lang.String-) | Sets the shader language used by this technique. |
| [getShaderVersion()](#getShaderVersion--) | Gets the shader version used by this technique. |
| [setShaderVersion(String value)](#setShaderVersion-java.lang.String-) | Sets the shader version used by this technique. |
| [getShaderFile()](#getShaderFile--) | Gets the file name of the external shader file. |
| [setShaderFile(String value)](#setShaderFile-java.lang.String-) | Sets the file name of the external shader file. |
| [getShaderContent()](#getShaderContent--) | Gets the content of a embedded shader script. |
| [setShaderContent(byte[] value)](#setShaderContent-byte---) | Sets the content of a embedded shader script. |
| [getShaderEntry()](#getShaderEntry--) | Gets the entry point of the shader, some shader like HLSL can have customized shader entries. |
| [setShaderEntry(String value)](#setShaderEntry-java.lang.String-) | Sets the entry point of the shader, some shader like HLSL can have customized shader entries. |
| [getRenderAPI()](#getRenderAPI--) | Gets the rendering API used by this technique |
| [setRenderAPI(String value)](#setRenderAPI-java.lang.String-) | Sets the rendering API used by this technique |
| [getRenderAPIVersion()](#getRenderAPIVersion--) | Gets the version of the rendering API. |
| [setRenderAPIVersion(String value)](#setRenderAPIVersion-java.lang.String-) | Sets the version of the rendering API. |
| [getShaderParameters()](#getShaderParameters--) | Gets the shader parameter definition. |
| [addBinding(String property, String shaderParameter)](#addBinding-java.lang.String-java.lang.String-) | Binds the dynamic property to shader parameter |
### ShaderTechnique() {#ShaderTechnique--}
```
public ShaderTechnique()
```


Initializes a new instance of the com.aspose.threed.ShaderTechnique class.

### getDescription() {#getDescription--}
```
public String getDescription()
```


Gets the description of this technique

**Returns:**
java.lang.String
### setDescription(String value) {#setDescription-java.lang.String-}
```
public void setDescription(String value)
```


Sets the description of this technique

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New value |

### getShaderLanguage() {#getShaderLanguage--}
```
public String getShaderLanguage()
```


Gets the shader language used by this technique.

**Returns:**
java.lang.String
### setShaderLanguage(String value) {#setShaderLanguage-java.lang.String-}
```
public void setShaderLanguage(String value)
```


Sets the shader language used by this technique.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New value |

### getShaderVersion() {#getShaderVersion--}
```
public String getShaderVersion()
```


Gets the shader version used by this technique.

**Returns:**
java.lang.String
### setShaderVersion(String value) {#setShaderVersion-java.lang.String-}
```
public void setShaderVersion(String value)
```


Sets the shader version used by this technique.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New value |

### getShaderFile() {#getShaderFile--}
```
public String getShaderFile()
```


Gets the file name of the external shader file.

**Returns:**
java.lang.String
### setShaderFile(String value) {#setShaderFile-java.lang.String-}
```
public void setShaderFile(String value)
```


Sets the file name of the external shader file.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New value |

### getShaderContent() {#getShaderContent--}
```
public byte[] getShaderContent()
```


Gets the content of a embedded shader script. It could be HLSL/GLSL shader source file.

**Returns:**
byte[]
### setShaderContent(byte[] value) {#setShaderContent-byte---}
```
public void setShaderContent(byte[] value)
```


Sets the content of a embedded shader script. It could be HLSL/GLSL shader source file.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | byte[] | New value |

### getShaderEntry() {#getShaderEntry--}
```
public String getShaderEntry()
```


Gets the entry point of the shader, some shader like HLSL can have customized shader entries.

**Returns:**
java.lang.String
### setShaderEntry(String value) {#setShaderEntry-java.lang.String-}
```
public void setShaderEntry(String value)
```


Sets the entry point of the shader, some shader like HLSL can have customized shader entries.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New value |

### getRenderAPI() {#getRenderAPI--}
```
public String getRenderAPI()
```


Gets the rendering API used by this technique

**Returns:**
java.lang.String
### setRenderAPI(String value) {#setRenderAPI-java.lang.String-}
```
public void setRenderAPI(String value)
```


Sets the rendering API used by this technique

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New value |

### getRenderAPIVersion() {#getRenderAPIVersion--}
```
public String getRenderAPIVersion()
```


Gets the version of the rendering API.

**Returns:**
java.lang.String
### setRenderAPIVersion(String value) {#setRenderAPIVersion-java.lang.String-}
```
public void setRenderAPIVersion(String value)
```


Sets the version of the rendering API.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New value |

### getShaderParameters() {#getShaderParameters--}
```
public Map<String,String> getShaderParameters()
```


Gets the shader parameter definition. The key is the name of the dynamic property, and value is the shader parameter name that the property connected to.

**Returns:**
java.util.Map<java.lang.String,java.lang.String>
### addBinding(String property, String shaderParameter) {#addBinding-java.lang.String-java.lang.String-}
```
public void addBinding(String property, String shaderParameter)
```


Binds the dynamic property to shader parameter

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| property | java.lang.String | The name of the dynamic property. |
| shaderParameter | java.lang.String | The name of the shader parameter. |

