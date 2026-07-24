---
title: "HyperlinkCollector"
second_title: "Aspose.Page voor Java API-referentie"
description: "De klasse biedt het verzamelen van hyperlinked XPS-elementen van de huidige pagina van een XPS-document."
type: docs
weight: 10
url: /nl/java/com.aspose.xps.features.hyperlinkcollector/hyperlinkcollector/
---
**Inheritance:**
java.lang.Object
```
public class HyperlinkCollector
```

De klasse biedt het verzamelen van hyperlinked XPS-elementen van de huidige pagina van een XPS-document.
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [<T>collectHyperlinks(XpsDocument document, Class<T> cls)](#-T-collectHyperlinks-com.aspose.xps.XpsDocument-java.lang.Class-T--) | Verzamelt XPS‑elementen met hyperlinks van een bepaald type. |
| [collectHyperlinks(XpsDocument document)](#collectHyperlinks-com.aspose.xps.XpsDocument-) | Verzamelt XPS‑elementen met hyperlinks van alle typen. |
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


Verzamelt XPS‑elementen met hyperlinks van een bepaald type.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| document | [XpsDocument](../../com.aspose.xps/xpsdocument) | Het XPS‑document. |
| cls | java.lang.Class<T> | Het klasse‑object dat overeenkomt met het hyperlink‑doeltype om uit te filteren. |

**Returns:**
java.util.Collection<com.aspose.xps.XpsHyperlinkElement> - De collectie die hyperlinked XPS‑elementen bevat.
### collectHyperlinks(XpsDocument document) {#collectHyperlinks-com.aspose.xps.XpsDocument-}
```
public static Collection<XpsHyperlinkElement> collectHyperlinks(XpsDocument document)
```


Verzamelt XPS‑elementen met hyperlinks van alle typen.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| document | [XpsDocument](../../com.aspose.xps/xpsdocument) | Het XPS‑document. |

**Returns:**
java.util.Collection<com.aspose.xps.XpsHyperlinkElement> - De collectie die hyperlinked XPS‑elementen bevat.
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Type | Beschrijving |
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
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

