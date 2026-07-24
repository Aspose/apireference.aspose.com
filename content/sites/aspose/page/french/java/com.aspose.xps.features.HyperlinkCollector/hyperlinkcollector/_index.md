---
title: "HyperlinkCollector"
second_title: "Référence API Aspose.Page pour Java"
description: "La classe fournit la collecte d'éléments XPS hyperliés depuis la page actuelle d'un document XPS."
type: docs
weight: 10
url: /fr/java/com.aspose.xps.features.hyperlinkcollector/hyperlinkcollector/
---
**Inheritance:**
java.lang.Object
```
public class HyperlinkCollector
```

La classe fournit la collecte d'éléments XPS hyperliés depuis la page actuelle d'un document XPS.
## Méthodes

| Méthode | Description |
| --- | --- |
| [<T>collectHyperlinks(XpsDocument document, Class<T> cls)](#-T-collectHyperlinks-com.aspose.xps.XpsDocument-java.lang.Class-T--) | Collecte les éléments XPS avec des hyperliens d'un certain type. |
| [collectHyperlinks(XpsDocument document)](#collectHyperlinks-com.aspose.xps.XpsDocument-) | Collecte les éléments XPS avec des hyperliens de tous les types. |
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


Collecte les éléments XPS avec des hyperliens d'un certain type.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| document | [XpsDocument](../../com.aspose.xps/xpsdocument) | Le document XPS. |
| cls | java.lang.Class<T> | L'objet de classe correspondant au type de cible d'hyperlien à exclure. |

**Returns:**
java.util.Collection<com.aspose.xps.XpsHyperlinkElement> - La collection contenant les éléments XPS hyperliés.
### collectHyperlinks(XpsDocument document) {#collectHyperlinks-com.aspose.xps.XpsDocument-}
```
public static Collection<XpsHyperlinkElement> collectHyperlinks(XpsDocument document)
```


Collecte les éléments XPS avec des hyperliens de tous les types.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| document | [XpsDocument](../../com.aspose.xps/xpsdocument) | Le document XPS. |

**Returns:**
java.util.Collection<com.aspose.xps.XpsHyperlinkElement> - La collection contenant les éléments XPS hyperliés.
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Paramètre | Type | Description |
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
| Paramètre | Type | Description |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

