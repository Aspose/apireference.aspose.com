---
title: "HyperlinkCollector"
second_title: "Aspose.Page용 Java API 참조"
description: "이 클래스는 XPS 문서의 현재 페이지에서 하이퍼링크가 포함된 XPS 요소를 수집합니다."
type: docs
weight: 10
url: /ko/java/com.aspose.xps.features.hyperlinkcollector/hyperlinkcollector/
---
**Inheritance:**
java.lang.Object
```
public class HyperlinkCollector
```

이 클래스는 XPS 문서의 현재 페이지에서 하이퍼링크가 포함된 XPS 요소를 수집합니다.
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [<T>collectHyperlinks(XpsDocument document, Class<T> cls)](#-T-collectHyperlinks-com.aspose.xps.XpsDocument-java.lang.Class-T--) | 특정 유형의 하이퍼링크가 있는 XPS 요소를 수집합니다. |
| [collectHyperlinks(XpsDocument document)](#collectHyperlinks-com.aspose.xps.XpsDocument-) | 모든 유형의 하이퍼링크가 있는 XPS 요소를 수집합니다. |
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


특정 유형의 하이퍼링크가 있는 XPS 요소를 수집합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| document | [XpsDocument](../../com.aspose.xps/xpsdocument) | XPS 문서입니다. |
| cls | java.lang.Class<T> | 필터링할 하이퍼링크 대상 유형에 해당하는 클래스 객체입니다. |

**Returns:**
java.util.Collection<com.aspose.xps.XpsHyperlinkElement> - 하이퍼링크된 XPS 요소를 포함하는 컬렉션입니다.
### collectHyperlinks(XpsDocument document) {#collectHyperlinks-com.aspose.xps.XpsDocument-}
```
public static Collection<XpsHyperlinkElement> collectHyperlinks(XpsDocument document)
```


모든 유형의 하이퍼링크가 있는 XPS 요소를 수집합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| document | [XpsDocument](../../com.aspose.xps/xpsdocument) | XPS 문서입니다. |

**Returns:**
java.util.Collection<com.aspose.xps.XpsHyperlinkElement> - 하이퍼링크된 XPS 요소를 포함하는 컬렉션입니다.
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| 매개변수 | 유형 | 설명 |
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
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

