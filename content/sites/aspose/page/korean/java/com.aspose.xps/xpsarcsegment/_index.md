---
title: "XpsArcSegment"
second_title: "Aspose.Page용 Java API 참조"
description: "ArcSegment 요소 기능을 캡슐화하는 클래스."
type: docs
weight: 13
url: /ko/java/com.aspose.xps/xpsarcsegment/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsPathSegment](../../com.aspose.xps/xpspathsegment)
```
public class XpsArcSegment extends XpsPathSegment
```

ArcSegment 요소 기능을 캡슐화하는 클래스입니다. 이 요소는 타원형 호를 설명합니다.
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [deepClone()](#deepClone--) | 이 호 세그먼트를 복제합니다. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getPoint()](#getPoint--) | 타원형 호의 끝점을 반환합니다. |
| [getRotationAngle()](#getRotationAngle--) | 타원이 현재 좌표계에 대해 어떻게 회전했는지를 나타내는 값을 반환합니다. |
| [getSize()](#getSize--) | 타원형 호의 x 및 y 반경을 x,y 쌍으로 반환합니다. |
| [getSweepDirection()](#getSweepDirection--) | 호가 그려지는 방향을 지정하는 값을 반환합니다. |
| [hashCode()](#hashCode--) |  |
| [isLargeArc()](#isLargeArc--) | 호가 180도 이상 스윕으로 그려지는지를 결정하는 값을 반환합니다. |
| [isStroked()](#isStroked--) | 이 경로 세그먼트에 대한 스트로크가 그려지는지 여부를 지정하는 값을 반환합니다. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setLargeArc(boolean value)](#setLargeArc-boolean-) | 호가 180도 이상으로 그려지는지를 결정하는 값을 설정합니다. |
| [setPoint(Point2D value)](#setPoint-java.awt.geom.Point2D-) | 타원 호의 끝점을 설정합니다. |
| [setRotationAngle(float value)](#setRotationAngle-float-) | 타원이 현재 좌표계에 대해 어떻게 회전되는지를 나타내는 값을 설정합니다. |
| [setSize(Dimension2D value)](#setSize-java.awt.geom.Dimension2D-) | 타원 호의 x 및 y 반경을 x,y 쌍으로 설정합니다. |
| [setStroked(boolean value)](#setStroked-boolean-) | 이 경로 세그먼트에 대한 스트로크가 그려지는지 여부를 지정하는 값을 설정합니다. |
| [setSweepDirection(XpsSweepDirection value)](#setSweepDirection-com.aspose.xps.XpsSweepDirection-) | 호가 그려지는 방향을 지정하는 값을 설정합니다. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsArcSegment deepClone()
```


이 호 세그먼트를 복제합니다.

**Returns:**
[XpsArcSegment](../../com.aspose.xps/xpsarcsegment) - Clone of this arc segment.
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
### getPoint() {#getPoint--}
```
public Point2D getPoint()
```


타원형 호의 끝점을 반환합니다.

**Returns:**
java.awt.geom.Point2D - 타원 호의 끝점.
### getRotationAngle() {#getRotationAngle--}
```
public float getRotationAngle()
```


타원이 현재 좌표계에 대해 어떻게 회전했는지를 나타내는 값을 반환합니다.

**Returns:**
float - 타원이 현재 좌표계에 대해 어떻게 회전되는지를 나타내는 값.
### getSize() {#getSize--}
```
public Dimension2D getSize()
```


타원형 호의 x 및 y 반경을 x,y 쌍으로 반환합니다.

**Returns:**
java.awt.geom.Dimension2D - 타원 호의 x 및 y 반경을 x,y 쌍으로 나타냅니다.
### getSweepDirection() {#getSweepDirection--}
```
public XpsSweepDirection getSweepDirection()
```


호가 그려지는 방향을 지정하는 값을 반환합니다.

**Returns:**
[XpsSweepDirection](../../com.aspose.xps/xpssweepdirection) - The value specifying the direction in which the arc is drawn.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### isLargeArc() {#isLargeArc--}
```
public boolean isLargeArc()
```


호가 180도 이상 스윕으로 그려지는지를 결정하는 값을 반환합니다.

**Returns:**
boolean - 호가 180도 이상으로 그려지는지를 결정하는 값.
### isStroked() {#isStroked--}
```
public boolean isStroked()
```


이 경로 세그먼트에 대한 스트로크가 그려지는지 여부를 지정하는 값을 반환합니다.

**Returns:**
boolean - 이 경로 세그먼트에 대한 스트로크가 그려지는지 여부를 지정하는 값.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setLargeArc(boolean value) {#setLargeArc-boolean-}
```
public void setLargeArc(boolean value)
```


호가 180도 이상으로 그려지는지를 결정하는 값을 설정합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 값 | boolean | 호가 180도 이상으로 그려지는지를 결정하는 값. |

### setPoint(Point2D value) {#setPoint-java.awt.geom.Point2D-}
```
public void setPoint(Point2D value)
```


타원 호의 끝점을 설정합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 값 | java.awt.geom.Point2D | 타원 호의 끝점. |

### setRotationAngle(float value) {#setRotationAngle-float-}
```
public void setRotationAngle(float value)
```


타원이 현재 좌표계에 대해 어떻게 회전되는지를 나타내는 값을 설정합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 값 | float | 타원이 현재 좌표계에 대해 어떻게 회전되는지를 나타내는 값. |

### setSize(Dimension2D value) {#setSize-java.awt.geom.Dimension2D-}
```
public void setSize(Dimension2D value)
```


타원 호의 x 및 y 반경을 x,y 쌍으로 설정합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 값 | java.awt.geom.Dimension2D | 타원 호의 x와 y 반지름을 x,y 쌍으로 나타냅니다. |

### setStroked(boolean value) {#setStroked-boolean-}
```
public void setStroked(boolean value)
```


이 경로 세그먼트에 대한 스트로크가 그려지는지 여부를 지정하는 값을 설정합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 값 | boolean | 이 경로 세그먼트에 대한 스트로크가 그려지는지 여부를 지정하는 값. |

### setSweepDirection(XpsSweepDirection value) {#setSweepDirection-com.aspose.xps.XpsSweepDirection-}
```
public void setSweepDirection(XpsSweepDirection value)
```


호가 그려지는 방향을 지정하는 값을 설정합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| value | [XpsSweepDirection](../../com.aspose.xps/xpssweepdirection) | 호가 그려지는 방향을 지정하는 값. |

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

