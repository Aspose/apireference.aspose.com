---
title: "XpsPage"
second_title: "Aspose.Page용 Java API 참조"
description: "FixedPage 요소 기능을 캡슐화하는 클래스."
type: docs
weight: 38
url: /ko/java/com.aspose.xps/xpspage/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsElement](../../com.aspose.xps/xpselement)
```
public final class XpsPage extends XpsElement
```

FixedPage 요소 기능을 캡슐화하는 클래스입니다. 이 요소는 페이지의 내용을 포함하며 FixedPage 파트의 루트 요소입니다.
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [deepClone()](#deepClone--) | 이 페이지를 복제합니다. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | 인덱스 i 로 요소의 자식에 접근할 수 있습니다. |
| [getClass()](#getClass--) |  |
| [getHeight()](#getHeight--) | 페이지의 높이를 반환합니다. 높이는 유효 좌표 공간 단위의 실수값으로 표현됩니다. |
| [getWidth()](#getWidth--) | 페이지의 너비를 반환합니다. 너비는 유효 좌표 공간 단위의 실수값으로 표현됩니다. |
| [getXmlLang()](#getXmlLang--) | 현재 요소 및 모든 자식 또는 하위 요소에 사용되는 기본 언어를 지정하는 값을 반환합니다. |
| [hashCode()](#hashCode--) |  |
| [iterator()](#iterator--) | Iterable 인터페이스의 구현. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setHeight(float value)](#setHeight-float-) | 페이지의 높이를 설정합니다. 높이는 유효 좌표 공간 단위의 실수값으로 표현됩니다. |
| [setWidth(float value)](#setWidth-float-) | 페이지의 너비를 설정합니다. 너비는 유효 좌표 공간 단위의 실수값으로 표현됩니다. |
| [setXmlLang(String value)](#setXmlLang-java.lang.String-) | 현재 요소 및 모든 자식 또는 하위 요소에 사용되는 기본 언어를 지정하는 값을 설정합니다. |
| [size()](#size--) | 하위 요소의 수를 반환합니다. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsPage deepClone()
```


이 페이지를 복제합니다.

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Clone of this page.
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
### getHeight() {#getHeight--}
```
public float getHeight()
```


페이지의 높이를 반환합니다. 높이는 유효 좌표 공간 단위의 실수값으로 표현됩니다.

**Returns:**
float - 페이지의 높이.
### getWidth() {#getWidth--}
```
public float getWidth()
```


페이지의 너비를 반환합니다. 너비는 유효 좌표 공간 단위의 실수값으로 표현됩니다.

**Returns:**
float - 페이지의 너비.
### getXmlLang() {#getXmlLang--}
```
public String getXmlLang()
```


현재 요소 및 모든 자식 또는 하위 요소에 사용되는 기본 언어를 지정하는 값을 반환합니다.

**Returns:**
java.lang.String - 기본 언어를 지정하는 값.
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




### setHeight(float value) {#setHeight-float-}
```
public void setHeight(float value)
```


페이지의 높이를 설정합니다. 높이는 유효 좌표 공간 단위의 실수값으로 표현됩니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 값 | float | 페이지의 높이. |

### setWidth(float value) {#setWidth-float-}
```
public void setWidth(float value)
```


페이지의 너비를 설정합니다. 너비는 유효 좌표 공간 단위의 실수값으로 표현됩니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 값 | float | 페이지의 너비. |

### setXmlLang(String value) {#setXmlLang-java.lang.String-}
```
public void setXmlLang(String value)
```


현재 요소 및 모든 자식 또는 하위 요소에 사용되는 기본 언어를 지정하는 값을 설정합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 값 | java.lang.String | 기본 언어를 지정하는 값. |

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

