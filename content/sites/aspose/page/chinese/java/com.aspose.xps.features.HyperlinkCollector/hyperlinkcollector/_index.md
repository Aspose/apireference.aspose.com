---
title: "HyperlinkCollector"
second_title: "Aspose.Page for Java API 参考"
description: "该类提供从 XPS 文档的当前页面收集带超链接的 XPS 元素。"
type: docs
weight: 10
url: /zh/java/com.aspose.xps.features.hyperlinkcollector/hyperlinkcollector/
---
**Inheritance:**
java.lang.Object
```
public class HyperlinkCollector
```

该类提供从 XPS 文档的当前页面收集带超链接的 XPS 元素。
## 方法

| 方法 | 描述 |
| --- | --- |
| [<T>collectHyperlinks(XpsDocument document, Class<T> cls)](#-T-collectHyperlinks-com.aspose.xps.XpsDocument-java.lang.Class-T--) | 收集具有特定类型超链接的 XPS 元素。 |
| [collectHyperlinks(XpsDocument document)](#collectHyperlinks-com.aspose.xps.XpsDocument-) | 收集具有所有类型超链接的 XPS 元素。 |
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


收集具有特定类型超链接的 XPS 元素。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| document | [XpsDocument](../../com.aspose.xps/xpsdocument) | XPS 文档。 |
| cls | java.lang.Class<T> | 对应于要过滤的超链接目标类型的类对象。 |

**Returns:**
java.util.Collection<com.aspose.xps.XpsHyperlinkElement> - 包含超链接 XPS 元素的集合。
### collectHyperlinks(XpsDocument document) {#collectHyperlinks-com.aspose.xps.XpsDocument-}
```
public static Collection<XpsHyperlinkElement> collectHyperlinks(XpsDocument document)
```


收集具有所有类型超链接的 XPS 元素。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| document | [XpsDocument](../../com.aspose.xps/xpsdocument) | XPS 文档。 |

**Returns:**
java.util.Collection<com.aspose.xps.XpsHyperlinkElement> - 包含超链接 XPS 元素的集合。
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| 参数 | 类型 | 描述 |
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
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

