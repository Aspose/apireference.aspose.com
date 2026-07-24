---
title: "HyperlinkCollector"
second_title: "Aspose.Page per Java API Reference"
description: "La classe fornisce la raccolta di elementi XPS con collegamenti ipertestuali dalla pagina corrente di un documento XPS."
type: docs
weight: 10
url: /it/java/com.aspose.xps.features.hyperlinkcollector/hyperlinkcollector/
---
**Inheritance:**
java.lang.Object
```
public class HyperlinkCollector
```

La classe fornisce la raccolta di elementi XPS con collegamenti ipertestuali dalla pagina corrente di un documento XPS.
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [<T>collectHyperlinks(XpsDocument document, Class<T> cls)](#-T-collectHyperlinks-com.aspose.xps.XpsDocument-java.lang.Class-T--) | Raccoglie gli elementi XPS con collegamenti ipertestuali di un certo tipo. |
| [collectHyperlinks(XpsDocument document)](#collectHyperlinks-com.aspose.xps.XpsDocument-) | Raccoglie gli elementi XPS con collegamenti ipertestuali di tutti i tipi. |
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


Raccoglie gli elementi XPS con collegamenti ipertestuali di un certo tipo.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| document | [XpsDocument](../../com.aspose.xps/xpsdocument) | Il documento XPS. |
| cls | java.lang.Class<T> | L'oggetto classe corrispondente al tipo di destinazione del collegamento ipertestuale da filtrare. |

**Returns:**
java.util.Collection<com.aspose.xps.XpsHyperlinkElement> - La collezione contenente gli elementi XPS collegati ipertestualmente.
### collectHyperlinks(XpsDocument document) {#collectHyperlinks-com.aspose.xps.XpsDocument-}
```
public static Collection<XpsHyperlinkElement> collectHyperlinks(XpsDocument document)
```


Raccoglie gli elementi XPS con collegamenti ipertestuali di tutti i tipi.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| document | [XpsDocument](../../com.aspose.xps/xpsdocument) | Il documento XPS. |

**Returns:**
java.util.Collection<com.aspose.xps.XpsHyperlinkElement> - La collezione contenente gli elementi XPS collegati ipertestualmente.
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
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
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

