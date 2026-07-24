---
title: "XpsPathGeometry"
second_title: "Aspose.Page용 Java API 참조"
description: "PathGeometry 속성 요소 기능을 캡슐화하는 클래스."
type: docs
weight: 42
url: /ko/java/com.aspose.xps/xpspathgeometry/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), com.aspose.xps.XpsArray

**All Implemented Interfaces:**
com.aspose.xps.ITransformableProperty
```
public final class XpsPathGeometry extends XpsArray<XpsPathFigure> implements ITransformableProperty
```

PathGeometry 속성 요소 기능을 캡슐화하는 클래스입니다. 이 요소는 Figures 속성으로 지정하거나 자식 PathFigure 요소로 지정된 경로 피겨 집합을 포함합니다.
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [add(T obj)](#add-T-) | 배열에 새 객체를 추가합니다. |
| [addSegment(XpsPathSegment segment)](#addSegment-com.aspose.xps.XpsPathSegment-) | 마지막 pah 피겨의 자식 세그먼트 목록에 경로 세그먼트를 추가합니다. |
| [deepClone()](#deepClone--) | 이 경로 기하학을 복제합니다. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | 인덱스 i 로 배열 요소에 접근할 수 있습니다. |
| [getClass()](#getClass--) |  |
| [getFillRule()](#getFillRule--) | 기하학적 도형의 교차 영역이 결합되어 영역을 형성하는 방식을 지정하는 값을 반환합니다. |
| [getPathFigures()](#getPathFigures--) | 자식 경로 피겨 목록을 반환합니다. |
| [getTransform()](#getTransform--) | 채우기, 클리핑 또는 스트로크에 사용되기 전에 경로 기하학의 모든 자식 및 하위 요소에 적용되는 로컬 행렬 변환을 설정하는 어파인 변환 행렬을 반환합니다. |
| [hashCode()](#hashCode--) |  |
| [insert(int index, T obj)](#insert-int-T-) | 지정된 위치에 새 객체를 배열에 삽입합니다. |
| [insertSegment(int index, XpsPathSegment segment)](#insertSegment-int-com.aspose.xps.XpsPathSegment-) | 마지막 경로 피겨의 자식 세그먼트 목록에 인덱스 위치에 경로 세그먼트를 삽입합니다. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [remove(T obj)](#remove-T-) | 배열에서 객체를 제거합니다. |
| [removeAt(int index)](#removeAt-int-) | 지정된 위치에서 배열의 객체를 제거합니다. |
| [removeSegment(XpsPathSegment segment)](#removeSegment-com.aspose.xps.XpsPathSegment-) | 마지막 경로 피겨의 자식 세그먼트 목록에서 경로 세그먼트를 제거합니다. |
| [removeSegmentAt(int index)](#removeSegmentAt-int-) | 마지막 경로 피겨의 자식 세그먼트 목록에서 인덱스 위치에 있는 경로 세그먼트를 제거합니다. |
| [setFillRule(XpsFillRule value)](#setFillRule-com.aspose.xps.XpsFillRule-) | 기하학적 도형의 교차 영역이 결합되어 영역을 형성하는 방식을 지정하는 값을 설정합니다. |
| [setTransform(XpsMatrix value)](#setTransform-com.aspose.xps.XpsMatrix-) | 채우기, 클리핑 또는 스트로크에 사용되기 전에 경로 기하학의 모든 자식 및 하위 요소에 적용되는 로컬 행렬 변환을 설정하는 어파인 변환 행렬을 설정합니다. |
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
### addSegment(XpsPathSegment segment) {#addSegment-com.aspose.xps.XpsPathSegment-}
```
public XpsPathSegment addSegment(XpsPathSegment segment)
```


마지막 pah 피겨의 자식 세그먼트 목록에 경로 세그먼트를 추가합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| segment | [XpsPathSegment](../../com.aspose.xps/xpspathsegment) | 추가될 경로 세그먼트. |

**Returns:**
[XpsPathSegment](../../com.aspose.xps/xpspathsegment) - Added path segment.
### deepClone() {#deepClone--}
```
public XpsPathGeometry deepClone()
```


이 경로 기하학을 복제합니다.

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - Clone of this path geometry.
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
### getFillRule() {#getFillRule--}
```
public XpsFillRule getFillRule()
```


기하학적 도형의 교차 영역이 결합되어 영역을 형성하는 방식을 지정하는 값을 반환합니다.

**Returns:**
[XpsFillRule](../../com.aspose.xps/xpsfillrule) - The value specifying how the intersecting areas of geometric shapes are combined to form a region.
### getPathFigures() {#getPathFigures--}
```
public List<XpsPathFigure> getPathFigures()
```


자식 경로 피겨 목록을 반환합니다.

**Returns:**
java.util.List<com.aspose.xps.XpsPathFigure> - 자식 경로 피겨 목록.
### getTransform() {#getTransform--}
```
public XpsMatrix getTransform()
```


채우기, 클리핑 또는 스트로크에 사용되기 전에 경로 기하학의 모든 자식 및 하위 요소에 적용되는 로컬 행렬 변환을 설정하는 어파인 변환 행렬을 반환합니다.

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - The affine transformation matrix.
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
### insertSegment(int index, XpsPathSegment segment) {#insertSegment-int-com.aspose.xps.XpsPathSegment-}
```
public XpsPathSegment insertSegment(int index, XpsPathSegment segment)
```


마지막 경로 피겨의 자식 세그먼트 목록에 인덱스 위치에 경로 세그먼트를 삽입합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 인덱스 | int | 세그먼트를 삽입해야 하는 위치. |
| segment | [XpsPathSegment](../../com.aspose.xps/xpspathsegment) | 삽입될 경로 세그먼트. |

**Returns:**
[XpsPathSegment](../../com.aspose.xps/xpspathsegment) - Inserted path segment.
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
### removeSegment(XpsPathSegment segment) {#removeSegment-com.aspose.xps.XpsPathSegment-}
```
public XpsPathSegment removeSegment(XpsPathSegment segment)
```


마지막 경로 피겨의 자식 세그먼트 목록에서 경로 세그먼트를 제거합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| segment | [XpsPathSegment](../../com.aspose.xps/xpspathsegment) | 제거될 경로 세그먼트. |

**Returns:**
[XpsPathSegment](../../com.aspose.xps/xpspathsegment) - Removed path segment.
### removeSegmentAt(int index) {#removeSegmentAt-int-}
```
public XpsPathSegment removeSegmentAt(int index)
```


마지막 경로 피겨의 자식 세그먼트 목록에서 인덱스 위치에 있는 경로 세그먼트를 제거합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 인덱스 | int | 경로 세그먼트를 제거해야 하는 위치. |

**Returns:**
[XpsPathSegment](../../com.aspose.xps/xpspathsegment) - Removed path segment.
### setFillRule(XpsFillRule value) {#setFillRule-com.aspose.xps.XpsFillRule-}
```
public void setFillRule(XpsFillRule value)
```


기하학적 도형의 교차 영역이 결합되어 영역을 형성하는 방식을 지정하는 값을 설정합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| value | [XpsFillRule](../../com.aspose.xps/xpsfillrule) | 기하학적 도형의 교차 영역이 결합되어 영역을 형성하는 방식을 지정하는 값. |

### setTransform(XpsMatrix value) {#setTransform-com.aspose.xps.XpsMatrix-}
```
public void setTransform(XpsMatrix value)
```


채우기, 클리핑 또는 스트로크에 사용되기 전에 경로 기하학의 모든 자식 및 하위 요소에 적용되는 로컬 행렬 변환을 설정하는 어파인 변환 행렬을 설정합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| value | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | 아핀 변환 행렬. |

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

