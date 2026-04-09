---
title: DescriptorSetUpdater
second_title: Aspose.3D für Java API-Referenz
description: Diese Klasse ermöglicht das Aktualisieren des  in einer Kettenoperation.
type: docs
weight: 42
url: /de/java/com.aspose.threed/descriptorsetupdater/
---

**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
java.io.Closeable
```
public final class DescriptorSetUpdater implements Closeable
```

Diese Klasse ermöglicht das Aktualisieren des [IDescriptorSet](../../com.aspose.threed/idescriptorset) in einer Kettenoperation.
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [bind(IBuffer buffer)](#bind-com.aspose.threed.IBuffer-) | Binde den gesamten Puffer an das aktuelle Deskriptorset |
| [bind(IBuffer buffer, int offset, int size)](#bind-com.aspose.threed.IBuffer-int-int-) | Binde den Puffer an das aktuelle Deskriptorset |
| [bind(ITextureUnit texture)](#bind-com.aspose.threed.ITextureUnit-) | Binde die Textureinheit an das aktuelle Deskriptorset |
| [bind(int binding, IBuffer buffer)](#bind-int-com.aspose.threed.IBuffer-) | Binde den Puffer an das aktuelle Deskriptorset an der angegebenen Bindungsposition. |
| [bind(int binding, IBuffer buffer, int offset, int size)](#bind-int-com.aspose.threed.IBuffer-int-int-) | Binde den Puffer an das aktuelle Deskriptorset an der angegebenen Bindungsposition. |
| [bind(int binding, ITextureUnit texture)](#bind-int-com.aspose.threed.ITextureUnit-) | Binde die Textureinheit an das aktuelle Deskriptorset |
| [close()](#close--) | Verwerfen Sie den Updater und übernehmen Sie die Änderungen am Hardwaregerät. |
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


Binde den gesamten Puffer an das aktuelle Deskriptorset

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| buffer | [IBuffer](../../com.aspose.threed/ibuffer) |  |

**Returns:**
[DescriptorSetUpdater](../../com.aspose.threed/descriptorsetupdater) - Return current instance for chaining operation
### bind(IBuffer buffer, int offset, int size) {#bind-com.aspose.threed.IBuffer-int-int-}
```
public DescriptorSetUpdater bind(IBuffer buffer, int offset, int size)
```


Binde den Puffer an das aktuelle Deskriptorset

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| buffer | [IBuffer](../../com.aspose.threed/ibuffer) | Welcher Puffer zu binden |
| Versatz | int | Versatz des zu bindenden Puffers |
| Größe | int | Größe des zu bindenden Puffers |

**Returns:**
[DescriptorSetUpdater](../../com.aspose.threed/descriptorsetupdater) - Return current instance for chaining operation
### bind(ITextureUnit texture) {#bind-com.aspose.threed.ITextureUnit-}
```
public DescriptorSetUpdater bind(ITextureUnit texture)
```


Binde die Textureinheit an das aktuelle Deskriptorset

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| texture | [ITextureUnit](../../com.aspose.threed/itextureunit) | Die Textureinheit zu binden |

**Returns:**
[DescriptorSetUpdater](../../com.aspose.threed/descriptorsetupdater) - Return current instance for chaining operation
### bind(int binding, IBuffer buffer) {#bind-int-com.aspose.threed.IBuffer-}
```
public DescriptorSetUpdater bind(int binding, IBuffer buffer)
```


Binde den Puffer an das aktuelle Deskriptorset an der angegebenen Bindungsposition.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Bindung | int | Bindungsort |
| buffer | [IBuffer](../../com.aspose.threed/ibuffer) | Der gesamte zu bindende Puffer |

**Returns:**
[DescriptorSetUpdater](../../com.aspose.threed/descriptorsetupdater) - Return current instance for chaining operation
### bind(int binding, IBuffer buffer, int offset, int size) {#bind-int-com.aspose.threed.IBuffer-int-int-}
```
public DescriptorSetUpdater bind(int binding, IBuffer buffer, int offset, int size)
```


Binde den Puffer an das aktuelle Deskriptorset an der angegebenen Bindungsposition.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Bindung | int | Bindungsort |
| buffer | [IBuffer](../../com.aspose.threed/ibuffer) | Der zu bindende Puffer |
| Versatz | int | Versatz des zu bindenden Puffers |
| Größe | int | Größe des zu bindenden Puffers |

**Returns:**
[DescriptorSetUpdater](../../com.aspose.threed/descriptorsetupdater) - Return current instance for chaining operation
### bind(int binding, ITextureUnit texture) {#bind-int-com.aspose.threed.ITextureUnit-}
```
public DescriptorSetUpdater bind(int binding, ITextureUnit texture)
```


Binde die Textureinheit an das aktuelle Deskriptorset

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Bindung | int | Der Bindungsort |
| texture | [ITextureUnit](../../com.aspose.threed/itextureunit) | Die Textureinheit zu binden |

**Returns:**
[DescriptorSetUpdater](../../com.aspose.threed/descriptorsetupdater) - Return current instance for chaining operation
### close() {#close--}
```
public void close()
```


Verwerfen Sie den Updater und übernehmen Sie die Änderungen am Hardwaregerät.

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
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
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

