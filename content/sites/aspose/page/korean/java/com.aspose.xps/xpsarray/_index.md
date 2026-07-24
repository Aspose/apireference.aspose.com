---
title: "XpsArray"
second_title: "Aspose.Page용 Java API 참조"
description: "공통 XPS 모델 배열 객체 기능을 캡슐화하는 클래스."
type: docs
weight: 14
url: /ko/java/com.aspose.xps/xpsarray/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject)
```
public abstract class XpsArray<T> extends XpsObject
```

공통 XPS 모델 배열 객체 기능을 캡슐화하는 클래스.
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [add(T obj)](#add-T-) | 배열에 새 객체를 추가합니다. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | 인덱스 i 로 배열 요소에 접근할 수 있습니다. |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [insert(int index, T obj)](#insert-int-T-) | 지정된 위치에 새 객체를 배열에 삽입합니다. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [remove(T obj)](#remove-T-) | 배열에서 객체를 제거합니다. |
| [removeAt(int index)](#removeAt-int-) | 지정된 위치에서 배열의 객체를 제거합니다. |
| [size()](#size--) | 요소 수를 반환합니다. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### add(T obj) {#add-T-}
```
public T add(T obj)
```


배열에 새 객체를 추가합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| obj | T | 추가할 객체. |

**Returns:**
T - 추가된 객체.
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
public T get(int i)
```


인덱스 i 로 배열 요소에 접근할 수 있습니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| i | int | 요소의 인덱스. |

**Returns:**
T - i 위치에 있는 요소.
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
### insert(int index, T obj) {#insert-int-T-}
```
public T insert(int index, T obj)
```


지정된 위치에 새 객체를 배열에 삽입합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 인덱스 | int | 객체를 삽입할 위치. |
| obj | T | 삽입할 객체. |

**Returns:**
T - 삽입된 객체.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### remove(T obj) {#remove-T-}
```
public T remove(T obj)
```


배열에서 객체를 제거합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| obj | T | 제거할 객체. |

**Returns:**
T - 제거된 객체.
### removeAt(int index) {#removeAt-int-}
```
public T removeAt(int index)
```


지정된 위치에서 배열의 객체를 제거합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 인덱스 | int | 객체를 제거할 위치. |

**Returns:**
T - 제거된 객체.
### size() {#size--}
```
public int size()
```


요소 수를 반환합니다.

**Returns:**
int - 요소의 개수.
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

