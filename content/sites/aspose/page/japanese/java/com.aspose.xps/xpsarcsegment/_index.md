---
title: "XpsArcSegment"
second_title: "Aspose.Page for Java API リファレンス"
description: "ArcSegment 要素の機能をカプセル化するクラス。"
type: docs
weight: 13
url: /ja/java/com.aspose.xps/xpsarcsegment/
---
**Inheritance:**
java.lang.Object、[com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject)、[com.aspose.xps.XpsPathSegment](../../com.aspose.xps/xpspathsegment)
```
public class XpsArcSegment extends XpsPathSegment
```

ArcSegment 要素の機能をカプセル化するクラスです。この要素は楕円弧を記述します。
## メソッド

| メソッド | 説明 |
| --- | --- |
| [deepClone()](#deepClone--) | この弧セグメントをクローンします。 |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getPoint()](#getPoint--) | 楕円弧の終点を返します。 |
| [getRotationAngle()](#getRotationAngle--) | 楕円が現在の座標系に対してどのように回転しているかを示す値を返します。 |
| [getSize()](#getSize--) | 楕円弧の x と y の半径を x,y のペアとして返します。 |
| [getSweepDirection()](#getSweepDirection--) | 弧が描画される方向を指定する値を返します。 |
| [hashCode()](#hashCode--) |  |
| [isLargeArc()](#isLargeArc--) | 弧が 180 度以上のスイープで描画されるかどうかを決定する値を返します。 |
| [isStroked()](#isStroked--) | このパスセグメントのストロークが描画されるかどうかを示す値を返します。 |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setLargeArc(boolean value)](#setLargeArc-boolean-) | 円弧が180度以上のスイープで描画されるかどうかを決定する値を設定します。 |
| [setPoint(Point2D value)](#setPoint-java.awt.geom.Point2D-) | 楕円弧の終点を設定します。 |
| [setRotationAngle(float value)](#setRotationAngle-float-) | 楕円が現在の座標系に対してどのように回転しているかを示す値を設定します。 |
| [setSize(Dimension2D value)](#setSize-java.awt.geom.Dimension2D-) | 楕円弧の x および y 半径を x,y のペアとして設定します。 |
| [setStroked(boolean value)](#setStroked-boolean-) | このパスセグメントのストロークが描画されるかどうかを示す値を設定します。 |
| [setSweepDirection(XpsSweepDirection value)](#setSweepDirection-com.aspose.xps.XpsSweepDirection-) | 円弧が描画される方向を指定する値を設定します。 |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsArcSegment deepClone()
```


この弧セグメントをクローンします。

**Returns:**
[XpsArcSegment](../../com.aspose.xps/xpsarcsegment) - Clone of this arc segment.
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| パラメータ | 型 | 説明 |
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


楕円弧の終点を返します。

**Returns:**
java.awt.geom.Point2D - 楕円弧の終点。
### getRotationAngle() {#getRotationAngle--}
```
public float getRotationAngle()
```


楕円が現在の座標系に対してどのように回転しているかを示す値を返します。

**Returns:**
float - 楕円が現在の座標系に対してどのように回転しているかを示す値。
### getSize() {#getSize--}
```
public Dimension2D getSize()
```


楕円弧の x と y の半径を x,y のペアとして返します。

**Returns:**
java.awt.geom.Dimension2D - 楕円弧の x および y 半径を x,y のペアとして表します。
### getSweepDirection() {#getSweepDirection--}
```
public XpsSweepDirection getSweepDirection()
```


弧が描画される方向を指定する値を返します。

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


弧が 180 度以上のスイープで描画されるかどうかを決定する値を返します。

**Returns:**
boolean - 円弧が180度以上のスイープで描画されるかどうかを決定する値。
### isStroked() {#isStroked--}
```
public boolean isStroked()
```


このパスセグメントのストロークが描画されるかどうかを示す値を返します。

**Returns:**
boolean - このパスセグメントのストロークが描画されるかどうかを示す値。
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


円弧が180度以上のスイープで描画されるかどうかを決定する値を設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| value | boolean | 円弧が180度以上のスイープで描画されるかどうかを決定する値。 |

### setPoint(Point2D value) {#setPoint-java.awt.geom.Point2D-}
```
public void setPoint(Point2D value)
```


楕円弧の終点を設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| value | java.awt.geom.Point2D | 楕円弧の終点。 |

### setRotationAngle(float value) {#setRotationAngle-float-}
```
public void setRotationAngle(float value)
```


楕円が現在の座標系に対してどのように回転しているかを示す値を設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| value | float | 楕円が現在の座標系に対してどのように回転しているかを示す値。 |

### setSize(Dimension2D value) {#setSize-java.awt.geom.Dimension2D-}
```
public void setSize(Dimension2D value)
```


楕円弧の x および y 半径を x,y のペアとして設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| value | java.awt.geom.Dimension2D | 楕円弧の x と y の半径（x,y のペア）。 |

### setStroked(boolean value) {#setStroked-boolean-}
```
public void setStroked(boolean value)
```


このパスセグメントのストロークが描画されるかどうかを示す値を設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| value | boolean | このパスセグメントのストロークが描画されるかどうかを示す値。 |

### setSweepDirection(XpsSweepDirection value) {#setSweepDirection-com.aspose.xps.XpsSweepDirection-}
```
public void setSweepDirection(XpsSweepDirection value)
```


円弧が描画される方向を指定する値を設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| value | [XpsSweepDirection](../../com.aspose.xps/xpssweepdirection) | 円弧が描画される方向を指定する値。 |

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
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

