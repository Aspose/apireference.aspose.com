---
title: XpsArcSegment
second_title: Aspose.Page for Java API Reference
description: Class incapsulating ArcSegment element features.
type: docs
weight: 13
url: /java/com.aspose.xps/xpsarcsegment/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsPathSegment](../../com.aspose.xps/xpspathsegment)
```
public class XpsArcSegment extends XpsPathSegment
```

Class incapsulating ArcSegment element features. This element describes an elliptical arc.
## Methods

| Method | Description |
| --- | --- |
| [deepClone()](#deepClone--) | Clones this arc segment. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getPoint()](#getPoint--) | Returns the endpoint of the elliptical arc. |
| [getRotationAngle()](#getRotationAngle--) | Returns the value indicating how the ellipse is rotated relative to the current coordinate system. |
| [getSize()](#getSize--) | Returns the x and y radius of the elliptical arc as an x,y pair. |
| [getSweepDirection()](#getSweepDirection--) | Returns the value specifying the direction in which the arc is drawn. |
| [hashCode()](#hashCode--) |  |
| [isLargeArc()](#isLargeArc--) | Returns the value determining whether the arc is drawn with a sweep of 180 or greater. |
| [isStroked()](#isStroked--) | Returns the value specifying whether the stroke for this segment of the path is drawn. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setLargeArc(boolean value)](#setLargeArc-boolean-) | Sets the value determining whether the arc is drawn with a sweep of 180 or greater. |
| [setPoint(Point2D value)](#setPoint-java.awt.geom.Point2D-) | Sets the endpoint of the elliptical arc. |
| [setRotationAngle(float value)](#setRotationAngle-float-) | Sets the value indicating how the ellipse is rotated relative to the current coordinate system. |
| [setSize(Dimension2D value)](#setSize-java.awt.geom.Dimension2D-) | Sets the x and y radius of the elliptical arc as an x,y pair. |
| [setStroked(boolean value)](#setStroked-boolean-) | Sets the value specifying whether the stroke for this segment of the path is drawn. |
| [setSweepDirection(XpsSweepDirection value)](#setSweepDirection-com.aspose.xps.XpsSweepDirection-) | Sets the value specifying the direction in which the arc is drawn. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsArcSegment deepClone()
```


Clones this arc segment.

**Returns:**
[XpsArcSegment](../../com.aspose.xps/xpsarcsegment) - Clone of this arc segment.
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Type | Description |
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


Returns the endpoint of the elliptical arc.

**Returns:**
java.awt.geom.Point2D - The endpoint of the elliptical arc.
### getRotationAngle() {#getRotationAngle--}
```
public float getRotationAngle()
```


Returns the value indicating how the ellipse is rotated relative to the current coordinate system.

**Returns:**
float - The value indicating how the ellipse is rotated relative to the current coordinate system.
### getSize() {#getSize--}
```
public Dimension2D getSize()
```


Returns the x and y radius of the elliptical arc as an x,y pair.

**Returns:**
java.awt.geom.Dimension2D - The x and y radius of the elliptical arc as an x,y pair.
### getSweepDirection() {#getSweepDirection--}
```
public XpsSweepDirection getSweepDirection()
```


Returns the value specifying the direction in which the arc is drawn.

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


Returns the value determining whether the arc is drawn with a sweep of 180 or greater.

**Returns:**
boolean - The value determining whether the arc is drawn with a sweep of 180 or greater.
### isStroked() {#isStroked--}
```
public boolean isStroked()
```


Returns the value specifying whether the stroke for this segment of the path is drawn.

**Returns:**
boolean - The value specifying whether the stroke for this segment of the path is drawn.
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


Sets the value determining whether the arc is drawn with a sweep of 180 or greater.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | The value determining whether the arc is drawn with a sweep of 180 or greater. |

### setPoint(Point2D value) {#setPoint-java.awt.geom.Point2D-}
```
public void setPoint(Point2D value)
```


Sets the endpoint of the elliptical arc.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.awt.geom.Point2D | The endpoint of the elliptical arc. |

### setRotationAngle(float value) {#setRotationAngle-float-}
```
public void setRotationAngle(float value)
```


Sets the value indicating how the ellipse is rotated relative to the current coordinate system.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | float | The value indicating how the ellipse is rotated relative to the current coordinate system. |

### setSize(Dimension2D value) {#setSize-java.awt.geom.Dimension2D-}
```
public void setSize(Dimension2D value)
```


Sets the x and y radius of the elliptical arc as an x,y pair.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.awt.geom.Dimension2D | The x and y radius of the elliptical arc as an x,y pair. |

### setStroked(boolean value) {#setStroked-boolean-}
```
public void setStroked(boolean value)
```


Sets the value specifying whether the stroke for this segment of the path is drawn.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | The value specifying whether the stroke for this segment of the path is drawn. |

### setSweepDirection(XpsSweepDirection value) {#setSweepDirection-com.aspose.xps.XpsSweepDirection-}
```
public void setSweepDirection(XpsSweepDirection value)
```


Sets the value specifying the direction in which the arc is drawn.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [XpsSweepDirection](../../com.aspose.xps/xpssweepdirection) | The value specifying the direction in which the arc is drawn. |

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
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

