---
title: "HyperlinkCollector"
second_title: "Aspose.Page for Java API-Referenz"
description: "Die Klasse ermöglicht das Sammeln hyperverlinkter XPS‑Elemente von der aktuellen Seite eines XPS‑Dokuments."
type: docs
weight: 10
url: /de/java/com.aspose.xps.features.hyperlinkcollector/hyperlinkcollector/
---
**Inheritance:**
java.lang.Object
```
public class HyperlinkCollector
```

Die Klasse ermöglicht das Sammeln hyperverlinkter XPS‑Elemente von der aktuellen Seite eines XPS‑Dokuments.
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [<T>collectHyperlinks(XpsDocument document, Class<T> cls)](#-T-collectHyperlinks-com.aspose.xps.XpsDocument-java.lang.Class-T--) | Sammelt XPS-Elemente mit Hyperlinks eines bestimmten Typs. |
| [collectHyperlinks(XpsDocument document)](#collectHyperlinks-com.aspose.xps.XpsDocument-) | Sammelt XPS-Elemente mit Hyperlinks aller Typen. |
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


Sammelt XPS-Elemente mit Hyperlinks eines bestimmten Typs.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| document | [XpsDocument](../../com.aspose.xps/xpsdocument) | Das XPS-Dokument. |
| cls | java.lang.Class<T> | Das Klassenobjekt, das dem Hyperlink-Zieltyp entspricht, der herausgefiltert werden soll. |

**Returns:**
java.util.Collection<com.aspose.xps.XpsHyperlinkElement> - Die Sammlung, die hyperverknüpfte XPS-Elemente enthält.
### collectHyperlinks(XpsDocument document) {#collectHyperlinks-com.aspose.xps.XpsDocument-}
```
public static Collection<XpsHyperlinkElement> collectHyperlinks(XpsDocument document)
```


Sammelt XPS-Elemente mit Hyperlinks aller Typen.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| document | [XpsDocument](../../com.aspose.xps/xpsdocument) | Das XPS-Dokument. |

**Returns:**
java.util.Collection<com.aspose.xps.XpsHyperlinkElement> - Die Sammlung, die hyperverknüpfte XPS-Elemente enthält.
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
public final native void wait(long arg0)
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

