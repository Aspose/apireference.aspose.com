---
title: DescriptorSetUpdater
second_title: Aspose.3D for Java API Reference
description: This class allows to update the  in a chain operation.
type: docs
weight: 39
url: /java/com.aspose.threed/descriptorsetupdater/
---

**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
java.io.Closeable
```
public final class DescriptorSetUpdater implements Closeable
```

This class allows to update the [IDescriptorSet](../../com.aspose.threed/idescriptorset) in a chain operation.
## Methods

| Method | Description |
| --- | --- |
| [bind(IBuffer buffer)](#bind-com.aspose.threed.IBuffer-) | Bind the entire buffer to current descriptor |
| [bind(IBuffer buffer, int offset, int size)](#bind-com.aspose.threed.IBuffer-int-int-) | Bind the buffer to current descriptor set |
| [bind(ITextureUnit texture)](#bind-com.aspose.threed.ITextureUnit-) | Bind the texture unit to current descriptor set |
| [bind(int binding, IBuffer buffer)](#bind-int-com.aspose.threed.IBuffer-) | Bind the buffer to current descriptor set at specified binding location. |
| [bind(int binding, IBuffer buffer, int offset, int size)](#bind-int-com.aspose.threed.IBuffer-int-int-) | Bind the buffer to current descriptor set at specified binding location. |
| [bind(int binding, ITextureUnit texture)](#bind-int-com.aspose.threed.ITextureUnit-) | Bind the texture unit to current descriptor set |
| [close()](#close--) | Dispose the updater and commit the changes to hardware device. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### bind(IBuffer buffer) {#bind-com.aspose.threed.IBuffer-}
```
public DescriptorSetUpdater bind(IBuffer buffer)
```


Bind the entire buffer to current descriptor

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| buffer | [IBuffer](../../com.aspose.threed/ibuffer) |  |

**Returns:**
[DescriptorSetUpdater](../../com.aspose.threed/descriptorsetupdater) - Return current instance for chaining operation
### bind(IBuffer buffer, int offset, int size) {#bind-com.aspose.threed.IBuffer-int-int-}
```
public DescriptorSetUpdater bind(IBuffer buffer, int offset, int size)
```


Bind the buffer to current descriptor set

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| buffer | [IBuffer](../../com.aspose.threed/ibuffer) | Which buffer to bind |
| offset | int | Offset of the buffer to bind |
| size | int | Size of the buffer to bind |

**Returns:**
[DescriptorSetUpdater](../../com.aspose.threed/descriptorsetupdater) - Return current instance for chaining operation
### bind(ITextureUnit texture) {#bind-com.aspose.threed.ITextureUnit-}
```
public DescriptorSetUpdater bind(ITextureUnit texture)
```


Bind the texture unit to current descriptor set

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| texture | [ITextureUnit](../../com.aspose.threed/itextureunit) | The texture unit to bind |

**Returns:**
[DescriptorSetUpdater](../../com.aspose.threed/descriptorsetupdater) - Return current instance for chaining operation
### bind(int binding, IBuffer buffer) {#bind-int-com.aspose.threed.IBuffer-}
```
public DescriptorSetUpdater bind(int binding, IBuffer buffer)
```


Bind the buffer to current descriptor set at specified binding location.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| binding | int | Binding location |
| buffer | [IBuffer](../../com.aspose.threed/ibuffer) | The entire buffer to bind |

**Returns:**
[DescriptorSetUpdater](../../com.aspose.threed/descriptorsetupdater) - Return current instance for chaining operation
### bind(int binding, IBuffer buffer, int offset, int size) {#bind-int-com.aspose.threed.IBuffer-int-int-}
```
public DescriptorSetUpdater bind(int binding, IBuffer buffer, int offset, int size)
```


Bind the buffer to current descriptor set at specified binding location.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| binding | int | Binding location |
| buffer | [IBuffer](../../com.aspose.threed/ibuffer) | The buffer to bind |
| offset | int | Offset of the buffer to bind |
| size | int | Size of the buffer to bind |

**Returns:**
[DescriptorSetUpdater](../../com.aspose.threed/descriptorsetupdater) - Return current instance for chaining operation
### bind(int binding, ITextureUnit texture) {#bind-int-com.aspose.threed.ITextureUnit-}
```
public DescriptorSetUpdater bind(int binding, ITextureUnit texture)
```


Bind the texture unit to current descriptor set

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| binding | int | The binding location |
| texture | [ITextureUnit](../../com.aspose.threed/itextureunit) | The texture unit to bind |

**Returns:**
[DescriptorSetUpdater](../../com.aspose.threed/descriptorsetupdater) - Return current instance for chaining operation
### close() {#close--}
```
public void close()
```


Dispose the updater and commit the changes to hardware device.

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

