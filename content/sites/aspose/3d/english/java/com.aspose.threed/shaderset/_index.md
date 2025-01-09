---
title: ShaderSet
second_title: Aspose.3D for Java API Reference
description: Shader programs for each kind of materials
type: docs
weight: 157
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
| [ShaderSet()](#ShaderSet--) | Construct the instance of [ShaderSet](../../com.aspose.threed/shaderset) |
## Methods

| Method | Description |
| --- | --- |
| [close()](#close--) | Dispose this instance and release all shader programs. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getFallback()](#getFallback--) | Gets the fallback shader when required shader is unavailable |
| [getLambert()](#getLambert--) | Gets the shader that used to render the lambert material |
| [getPbr()](#getPbr--) | Gets the shader that used to render the PBR material |
| [getPhong()](#getPhong--) | Gets the shader that used to render the phong material |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setFallback(ShaderProgram value)](#setFallback-com.aspose.threed.ShaderProgram-) | Sets the fallback shader when required shader is unavailable |
| [setLambert(ShaderProgram value)](#setLambert-com.aspose.threed.ShaderProgram-) | Sets the shader that used to render the lambert material |
| [setPbr(ShaderProgram value)](#setPbr-com.aspose.threed.ShaderProgram-) | Sets the shader that used to render the PBR material |
| [setPhong(ShaderProgram value)](#setPhong-com.aspose.threed.ShaderProgram-) | Sets the shader that used to render the phong material |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### ShaderSet() {#ShaderSet--}
```
public ShaderSet()
```


Construct the instance of [ShaderSet](../../com.aspose.threed/shaderset)

### close() {#close--}
```
public void close()
```


Dispose this instance and release all shader programs.

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
### getFallback() {#getFallback--}
```
public ShaderProgram getFallback()
```


Gets the fallback shader when required shader is unavailable

**Returns:**
[ShaderProgram](../../com.aspose.threed/shaderprogram) - the fallback shader when required shader is unavailable
### getLambert() {#getLambert--}
```
public ShaderProgram getLambert()
```


Gets the shader that used to render the lambert material

**Returns:**
[ShaderProgram](../../com.aspose.threed/shaderprogram) - the shader that used to render the lambert material
### getPbr() {#getPbr--}
```
public ShaderProgram getPbr()
```


Gets the shader that used to render the PBR material

**Returns:**
[ShaderProgram](../../com.aspose.threed/shaderprogram) - the shader that used to render the PBR material
### getPhong() {#getPhong--}
```
public ShaderProgram getPhong()
```


Gets the shader that used to render the phong material

**Returns:**
[ShaderProgram](../../com.aspose.threed/shaderprogram) - the shader that used to render the phong material
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




### setFallback(ShaderProgram value) {#setFallback-com.aspose.threed.ShaderProgram-}
```
public void setFallback(ShaderProgram value)
```


Sets the fallback shader when required shader is unavailable

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [ShaderProgram](../../com.aspose.threed/shaderprogram) | New value |

### setLambert(ShaderProgram value) {#setLambert-com.aspose.threed.ShaderProgram-}
```
public void setLambert(ShaderProgram value)
```


Sets the shader that used to render the lambert material

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [ShaderProgram](../../com.aspose.threed/shaderprogram) | New value |

### setPbr(ShaderProgram value) {#setPbr-com.aspose.threed.ShaderProgram-}
```
public void setPbr(ShaderProgram value)
```


Sets the shader that used to render the PBR material

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [ShaderProgram](../../com.aspose.threed/shaderprogram) | New value |

### setPhong(ShaderProgram value) {#setPhong-com.aspose.threed.ShaderProgram-}
```
public void setPhong(ShaderProgram value)
```


Sets the shader that used to render the phong material

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [ShaderProgram](../../com.aspose.threed/shaderprogram) | New value |

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

