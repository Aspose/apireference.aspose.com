---
title: "HyperlinkCollector"
second_title: "Справочник API Aspose.Page для Java"
description: "Класс обеспечивает сбор гиперссылочных XPS‑элементов с текущей страницы XPS‑документа."
type: docs
weight: 10
url: /ru/java/com.aspose.xps.features.hyperlinkcollector/hyperlinkcollector/
---
**Inheritance:**
java.lang.Object
```
public class HyperlinkCollector
```

Класс обеспечивает сбор гиперссылочных XPS‑элементов с текущей страницы XPS‑документа.
## Методы

| Метод | Описание |
| --- | --- |
| [<T>collectHyperlinks(XpsDocument document, Class<T> cls)](#-T-collectHyperlinks-com.aspose.xps.XpsDocument-java.lang.Class-T--) | Собирает элементы XPS с гиперссылками определённого типа. |
| [collectHyperlinks(XpsDocument document)](#collectHyperlinks-com.aspose.xps.XpsDocument-) | Собирает элементы XPS со всеми типами гиперссылок. |
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


Собирает элементы XPS с гиперссылками определённого типа.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| document | [XpsDocument](../../com.aspose.xps/xpsdocument) | Документ XPS. |
| cls | java.lang.Class<T> | Объект класса, соответствующий типу цели гиперссылки, который следует отфильтровать. |

**Returns:**
java.util.Collection<com.aspose.xps.XpsHyperlinkElement> - Коллекция, содержащая гиперссылочные элементы XPS.
### collectHyperlinks(XpsDocument document) {#collectHyperlinks-com.aspose.xps.XpsDocument-}
```
public static Collection<XpsHyperlinkElement> collectHyperlinks(XpsDocument document)
```


Собирает элементы XPS со всеми типами гиперссылок.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| document | [XpsDocument](../../com.aspose.xps/xpsdocument) | Документ XPS. |

**Returns:**
java.util.Collection<com.aspose.xps.XpsHyperlinkElement> - Коллекция, содержащая гиперссылочные элементы XPS.
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Параметр | Тип | Описание |
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
| Параметр | Тип | Описание |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

