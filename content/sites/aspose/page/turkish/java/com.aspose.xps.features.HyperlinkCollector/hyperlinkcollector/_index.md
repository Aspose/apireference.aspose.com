---
title: "HyperlinkCollector"
second_title: "Java için Aspose.Page API Referansı"
description: "Sınıf, bir XPS belgesinin geçerli sayfasından hiperlinkli XPS öğelerini toplar."
type: docs
weight: 10
url: /tr/java/com.aspose.xps.features.hyperlinkcollector/hyperlinkcollector/
---
**Inheritance:**
java.lang.Object
```
public class HyperlinkCollector
```

Sınıf, bir XPS belgesinin geçerli sayfasından hiperlinkli XPS öğelerini toplar.
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [<T>collectHyperlinks(XpsDocument document, Class<T> cls)](#-T-collectHyperlinks-com.aspose.xps.XpsDocument-java.lang.Class-T--) | Belirli bir türdeki hiperlinklere sahip XPS öğelerini toplar. |
| [collectHyperlinks(XpsDocument document)](#collectHyperlinks-com.aspose.xps.XpsDocument-) | Tüm türlerdeki hiperlinklere sahip XPS öğelerini toplar. |
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


Belirli bir türdeki hiperlinklere sahip XPS öğelerini toplar.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| document | [XpsDocument](../../com.aspose.xps/xpsdocument) | XPS belgesi. |
| cls | java.lang.Class<T> | Filtrelenecek hiperlink hedef türüne karşılık gelen sınıf nesnesi. |

**Returns:**
java.util.Collection<com.aspose.xps.XpsHyperlinkElement> - Hiperlinkli XPS öğelerini içeren koleksiyon.
### collectHyperlinks(XpsDocument document) {#collectHyperlinks-com.aspose.xps.XpsDocument-}
```
public static Collection<XpsHyperlinkElement> collectHyperlinks(XpsDocument document)
```


Tüm türlerdeki hiperlinklere sahip XPS öğelerini toplar.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| document | [XpsDocument](../../com.aspose.xps/xpsdocument) | XPS belgesi. |

**Returns:**
java.util.Collection<com.aspose.xps.XpsHyperlinkElement> - Hiperlinkli XPS öğelerini içeren koleksiyon.
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parametre | Tür | Açıklama |
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
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

