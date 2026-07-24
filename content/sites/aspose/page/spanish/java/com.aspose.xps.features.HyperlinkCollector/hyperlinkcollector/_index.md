---
title: "HyperlinkCollector"
second_title: "Referencia de API de Aspose.Page para Java"
description: "La clase permite recopilar elementos XPS con hipervínculos de la página actual de un documento XPS."
type: docs
weight: 10
url: /es/java/com.aspose.xps.features.hyperlinkcollector/hyperlinkcollector/
---
**Inheritance:**
java.lang.Object
```
public class HyperlinkCollector
```

La clase permite recopilar elementos XPS con hipervínculos de la página actual de un documento XPS.
## Métodos

| Método | Descripción |
| --- | --- |
| [<T>collectHyperlinks(XpsDocument document, Class<T> cls)](#-T-collectHyperlinks-com.aspose.xps.XpsDocument-java.lang.Class-T--) | Recopila elementos XPS con hipervínculos de un tipo determinado. |
| [collectHyperlinks(XpsDocument document)](#collectHyperlinks-com.aspose.xps.XpsDocument-) | Recopila elementos XPS con hipervínculos de todos los tipos. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### <T>collectHyperlinks(XpsDocument document, Class<T> cls) {#-T-collectHyperlinks-com.aspose.xps.XpsDocument-java.lang.Class-T--}
```
public static Collection<XpsHyperlinkElement> <T>collectHyperlinks(XpsDocument document, Class<T> cls)
```


Recopila elementos XPS con hipervínculos de un tipo determinado.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| document | [XpsDocument](../../com.aspose.xps/xpsdocument) | El documento XPS. |
| cls | java.lang.Class<T> | El objeto de clase correspondiente al tipo de destino del hipervínculo que se debe filtrar. |

**Returns:**
java.util.Collection<com.aspose.xps.XpsHyperlinkElement> - La colección que contiene elementos XPS con hipervínculos.
### collectHyperlinks(XpsDocument document) {#collectHyperlinks-com.aspose.xps.XpsDocument-}
```
public static Collection<XpsHyperlinkElement> collectHyperlinks(XpsDocument document)
```


Recopila elementos XPS con hipervínculos de todos los tipos.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| document | [XpsDocument](../../com.aspose.xps/xpsdocument) | El documento XPS. |

**Returns:**
java.util.Collection<com.aspose.xps.XpsHyperlinkElement> - La colección que contiene elementos XPS con hipervínculos.
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parámetro | Tipo | Descripción |
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
public final native void wait(long arg0)
```




**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

