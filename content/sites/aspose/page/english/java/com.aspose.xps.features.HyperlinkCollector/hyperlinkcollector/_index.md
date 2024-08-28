---
title: HyperlinkCollector
second_title: Aspose.Page for Java API Reference
description: The class provides collecting hyperlinked XPS elements from the current page of an XPS document.
type: docs
weight: 10
url: /java/com.aspose.xps.features.hyperlinkcollector/hyperlinkcollector/
---
**Inheritance:**
java.lang.Object
```
public class HyperlinkCollector
```

The class provides collecting hyperlinked XPS elements from the current page of an XPS document.
## Methods

| Method | Description |
| --- | --- |
| [<T>collectHyperlinks(XpsDocument document, Class<T> cls)](#-T-collectHyperlinks-com.aspose.xps.XpsDocument-java.lang.Class-T--) | Collects XPS elements with hyperlinks of a certain type. |
| [collectHyperlinks(XpsDocument document)](#collectHyperlinks-com.aspose.xps.XpsDocument-) | Collects XPS elements with hyperlinks of all types. |
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


Collects XPS elements with hyperlinks of a certain type.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| document | [XpsDocument](../../com.aspose.xps/xpsdocument) | The XPS document. |
| cls | java.lang.Class<T> | The class object corresponding to the hyperlink target type to filter out. |

**Returns:**
java.util.Collection<com.aspose.xps.XpsHyperlinkElement> - The collection containing hyperlinked XPS elements.
### collectHyperlinks(XpsDocument document) {#collectHyperlinks-com.aspose.xps.XpsDocument-}
```
public static Collection<XpsHyperlinkElement> collectHyperlinks(XpsDocument document)
```


Collects XPS elements with hyperlinks of all types.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| document | [XpsDocument](../../com.aspose.xps/xpsdocument) | The XPS document. |

**Returns:**
java.util.Collection<com.aspose.xps.XpsHyperlinkElement> - The collection containing hyperlinked XPS elements.
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
public final native void wait(long arg0)
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

