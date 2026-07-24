---
title: "XpsHyperlinkElement"
second_title: "Aspose.Page용 Java API 참조"
description: "하이퍼링크가 될 수 있는 XPS 요소의 공통 기능을 캡슐화합니다."
type: docs
weight: 28
url: /ko/java/com.aspose.xps/xpshyperlinkelement/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsElement](../../com.aspose.xps/xpselement)
```
public abstract class XpsHyperlinkElement extends XpsElement
```

하이퍼링크가 될 수 있는 XPS 요소의 공통 기능을 캡슐화합니다.
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | 인덱스 i 로 요소의 자식에 접근할 수 있습니다. |
| [getClass()](#getClass--) |  |
| [getHyperlinkTarget()](#getHyperlinkTarget--) | 하이퍼링크 대상 객체를 반환합니다. |
| [hashCode()](#hashCode--) |  |
| [iterator()](#iterator--) | Iterable 인터페이스의 구현. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setHyperlinkTarget(XpsHyperlinkTarget value)](#setHyperlinkTarget-com.aspose.xps.XpsHyperlinkTarget-) | 하이퍼링크 대상 객체를 설정합니다. |
| [size()](#size--) | 하위 요소의 수를 반환합니다. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
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
### get(int i) {#get-int-}
```
public XpsContentElement get(int i)
```


인덱스 i 로 요소의 자식에 접근할 수 있습니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| i | int | 하위 요소의 인덱스. |

**Returns:**
[XpsContentElement](../../com.aspose.xps/xpscontentelement) - Child element at  i  position.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getHyperlinkTarget() {#getHyperlinkTarget--}
```
public XpsHyperlinkTarget getHyperlinkTarget()
```


하이퍼링크 대상 객체를 반환합니다.

**Returns:**
[XpsHyperlinkTarget](../../com.aspose.xps/xpshyperlinktarget) - Hyperlink target object.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### iterator() {#iterator--}
```
public Iterator<XpsContentElement> iterator()
```


Iterable 인터페이스의 구현.

**Returns:**
java.util.Iterator<com.aspose.xps.XpsContentElement> - 목록에 대한 열거자를 반환합니다.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setHyperlinkTarget(XpsHyperlinkTarget value) {#setHyperlinkTarget-com.aspose.xps.XpsHyperlinkTarget-}
```
public void setHyperlinkTarget(XpsHyperlinkTarget value)
```


하이퍼링크 대상 객체를 설정합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| value | [XpsHyperlinkTarget](../../com.aspose.xps/xpshyperlinktarget) | 하이퍼링크 대상 객체. |

### size() {#size--}
```
public int size()
```


하위 요소의 수를 반환합니다.

**Returns:**
int - 하위 요소의 수.
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

