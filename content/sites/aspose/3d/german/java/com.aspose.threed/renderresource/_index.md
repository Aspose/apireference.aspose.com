---
title: RenderResource
second_title: Aspose.3D für Java API-Referenz
description: Die abstrakte Klasse aller Renderressourcen Alle Renderressourcen werden freigegeben, wenn der Renderer freigegeben wird.
type: docs
weight: 150
url: /de/java/com.aspose.threed/renderresource/
---

**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
java.io.Closeable
```
public abstract class RenderResource implements Closeable
```

Die abstrakte Klasse aller Renderressourcen Alle Renderressourcen werden freigegeben, wenn der Renderer freigegeben wird. Klassen wie [Mesh](../../com.aspose.threed/mesh)/[Texture](../../com.aspose.threed/texture) haben ein entsprechendes RenderResource
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [RenderResource()](#RenderResource--) |  |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [close()](#close--) | Freigeben interner Ressourcen, die von [RenderResource](../../com.aspose.threed/renderresource) verwendet werden |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### RenderResource() {#RenderResource--}
```
public RenderResource()
```


### close() {#close--}
```
public void close()
```


Freigeben interner Ressourcen, die von [RenderResource](../../com.aspose.threed/renderresource) verwendet werden

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

