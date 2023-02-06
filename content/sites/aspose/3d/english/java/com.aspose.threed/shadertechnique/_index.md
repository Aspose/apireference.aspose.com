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
| [ShaderTechnique()](#ShaderTechnique--) | Initializes a new instance of the [ShaderTechnique](../../com.aspose.threed/shadertechnique) class. |
## Methods

| Method | Description |
| --- | --- |
| [addBinding(String property, String shaderParameter)](#addBinding-java.lang.String-java.lang.String-) | Binds the dynamic property to shader parameter |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getDescription()](#getDescription--) | Gets the description of this technique |
| [getRenderAPI()](#getRenderAPI--) | Gets the rendering API used by this technique |
| [getRenderAPIVersion()](#getRenderAPIVersion--) | Gets the version of the rendering API. |
| [getShaderContent()](#getShaderContent--) | Gets the content of a embedded shader script. |
| [getShaderEntry()](#getShaderEntry--) | Gets the entry point of the shader, some shader like HLSL can have customized shader entries. |
| [getShaderFile()](#getShaderFile--) | Gets the file name of the external shader file. |
| [getShaderLanguage()](#getShaderLanguage--) | Gets the shader language used by this technique. |
| [getShaderParameters()](#getShaderParameters--) | Gets the shader parameter definition. |
| [getShaderVersion()](#getShaderVersion--) | Gets the shader version used by this technique. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setDescription(String value)](#setDescription-java.lang.String-) | Sets the description of this technique |
| [setRenderAPI(String value)](#setRenderAPI-java.lang.String-) | Sets the rendering API used by this technique |
| [setRenderAPIVersion(String value)](#setRenderAPIVersion-java.lang.String-) | Sets the version of the rendering API. |
| [setShaderContent(byte[] value)](#setShaderContent-byte---) | Sets the content of a embedded shader script. |
| [setShaderEntry(String value)](#setShaderEntry-java.lang.String-) | Sets the entry point of the shader, some shader like HLSL can have customized shader entries. |
| [setShaderFile(String value)](#setShaderFile-java.lang.String-) | Sets the file name of the external shader file. |
| [setShaderLanguage(String value)](#setShaderLanguage-java.lang.String-) | Sets the shader language used by this technique. |
| [setShaderVersion(String value)](#setShaderVersion-java.lang.String-) | Sets the shader version used by this technique. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### ShaderTechnique() {#ShaderTechnique--}
```
public ShaderTechnique()
```


Initializes a new instance of the [ShaderTechnique](../../com.aspose.threed/shadertechnique) class.

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
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getDescription() {#getDescription--}
```
public String getDescription()
```


Gets the description of this technique

**Returns:**
java.lang.String
### getRenderAPI() {#getRenderAPI--}
```
public String getRenderAPI()
```


Gets the rendering API used by this technique

**Returns:**
java.lang.String
### getRenderAPIVersion() {#getRenderAPIVersion--}
```
public String getRenderAPIVersion()
```


Gets the version of the rendering API.

**Returns:**
java.lang.String
### getShaderContent() {#getShaderContent--}
```
public byte[] getShaderContent()
```


Gets the content of a embedded shader script. It could be HLSL/GLSL shader source file.

**Returns:**
byte[]
### getShaderEntry() {#getShaderEntry--}
```
public String getShaderEntry()
```


Gets the entry point of the shader, some shader like HLSL can have customized shader entries.

**Returns:**
java.lang.String
### getShaderFile() {#getShaderFile--}
```
public String getShaderFile()
```


Gets the file name of the external shader file.

**Returns:**
java.lang.String
### getShaderLanguage() {#getShaderLanguage--}
```
public String getShaderLanguage()
```


Gets the shader language used by this technique.

**Returns:**
java.lang.String
### getShaderParameters() {#getShaderParameters--}
```
public Map<String,String> getShaderParameters()
```


Gets the shader parameter definition. The key is the name of the dynamic property, and value is the shader parameter name that the property connected to.

**Returns:**
java.util.Map<java.lang.String,java.lang.String>
### getShaderVersion() {#getShaderVersion--}
```
public String getShaderVersion()
```


Gets the shader version used by this technique.

**Returns:**
java.lang.String
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setDescription(String value) {#setDescription-java.lang.String-}
```
public void setDescription(String value)
```


Sets the description of this technique

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New value |

### setRenderAPI(String value) {#setRenderAPI-java.lang.String-}
```
public void setRenderAPI(String value)
```


Sets the rendering API used by this technique

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New value |

### setRenderAPIVersion(String value) {#setRenderAPIVersion-java.lang.String-}
```
public void setRenderAPIVersion(String value)
```


Sets the version of the rendering API.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New value |

### setShaderContent(byte[] value) {#setShaderContent-byte---}
```
public void setShaderContent(byte[] value)
```


Sets the content of a embedded shader script. It could be HLSL/GLSL shader source file.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | byte[] | New value |

### setShaderEntry(String value) {#setShaderEntry-java.lang.String-}
```
public void setShaderEntry(String value)
```


Sets the entry point of the shader, some shader like HLSL can have customized shader entries.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New value |

### setShaderFile(String value) {#setShaderFile-java.lang.String-}
```
public void setShaderFile(String value)
```


Sets the file name of the external shader file.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New value |

### setShaderLanguage(String value) {#setShaderLanguage-java.lang.String-}
```
public void setShaderLanguage(String value)
```


Sets the shader language used by this technique.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New value |

### setShaderVersion(String value) {#setShaderVersion-java.lang.String-}
```
public void setShaderVersion(String value)
```


Sets the shader version used by this technique.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New value |

### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final native void wait(long arg0)
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

