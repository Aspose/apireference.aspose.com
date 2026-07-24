---
title: "HyperlinkCollector"
second_title: "مرجع API لـ Aspose.Page للـ Java"
description: "الفئة توفر جمع عناصر XPS المرتبطة بروابط تشعبية من الصفحة الحالية لمستند XPS."
type: docs
weight: 10
url: /ar/java/com.aspose.xps.features.hyperlinkcollector/hyperlinkcollector/
---
**Inheritance:**
java.lang.Object
```
public class HyperlinkCollector
```

الفئة توفر جمع عناصر XPS المرتبطة بروابط تشعبية من الصفحة الحالية لمستند XPS.
## الطرق

| طريقة | الوصف |
| --- | --- |
| [<T>collectHyperlinks(XpsDocument document, Class<T> cls)](#-T-collectHyperlinks-com.aspose.xps.XpsDocument-java.lang.Class-T--) | يجمع عناصر XPS التي تحتوي على روابط تشعبية من نوع معين. |
| [collectHyperlinks(XpsDocument document)](#collectHyperlinks-com.aspose.xps.XpsDocument-) | يجمع عناصر XPS التي تحتوي على روابط تشعبية من جميع الأنواع. |
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


يجمع عناصر XPS التي تحتوي على روابط تشعبية من نوع معين.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| document | [XpsDocument](../../com.aspose.xps/xpsdocument) | مستند XPS. |
| cls | java.lang.Class<T> | كائن الفئة المقابل لنوع هدف الرابط التشعبي المراد استبعاده. |

**Returns:**
java.util.Collection<com.aspose.xps.XpsHyperlinkElement> - المجموعة التي تحتوي على عناصر XPS المرتبطة بروابط تشعبية.
### collectHyperlinks(XpsDocument document) {#collectHyperlinks-com.aspose.xps.XpsDocument-}
```
public static Collection<XpsHyperlinkElement> collectHyperlinks(XpsDocument document)
```


يجمع عناصر XPS التي تحتوي على روابط تشعبية من جميع الأنواع.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| document | [XpsDocument](../../com.aspose.xps/xpsdocument) | مستند XPS. |

**Returns:**
java.util.Collection<com.aspose.xps.XpsHyperlinkElement> - المجموعة التي تحتوي على عناصر XPS المرتبطة بروابط تشعبية.
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
منطقي
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
| معامل | نوع | الوصف |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

