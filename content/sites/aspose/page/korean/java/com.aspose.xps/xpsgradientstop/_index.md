---
title: "XpsGradientStop"
second_title: "Aspose.Page용 Java API 참조"
description: "GradientStop 요소 기능을 캡슐화하는 클래스."
type: docs
weight: 27
url: /ko/java/com.aspose.xps/xpsgradientstop/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject)
```
public final class XpsGradientStop extends XpsObject
```

GradientStop 요소 기능을 캡슐화하는 클래스입니다. 이 요소는 LinearGradientBrush와 RadialGradientBrush 요소 모두에서 사용되어 그라디언트를 렌더링하기 위한 색상 진행 위치와 범위를 정의합니다.
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [deepClone()](#deepClone--) | 이 그라디언트 스톱을 복제합니다. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getColor()](#getColor--) | 그라디언트 스톱 색상을 반환합니다. |
| [getOffset()](#getOffset--) | 그라디언트 오프셋을 반환합니다. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsGradientStop deepClone()
```


이 그라디언트 스톱을 복제합니다.

**Returns:**
[XpsGradientStop](../../com.aspose.xps/xpsgradientstop) - Clone of this gradient stop.
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
### getColor() {#getColor--}
```
public XpsColor getColor()
```


그라디언트 스톱 색상을 반환합니다.

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - The gradient stop color.
### getOffset() {#getOffset--}
```
public float getOffset()
```


그라디언트 오프셋을 반환합니다. 오프셋은 그라디언트 진행 중 색상이 지정되는 지점을 나타냅니다. 진행 중 오프셋 사이의 색상은 보간됩니다.

**Returns:**
float - 그라디언트 오프셋.
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

