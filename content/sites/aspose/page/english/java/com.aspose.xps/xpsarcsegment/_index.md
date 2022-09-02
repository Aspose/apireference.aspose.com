---
title: XpsArcSegment
second_title: Aspose.Page for Java API Reference
description: Class incapsulating ArcSegment element features.
type: docs
weight: 12
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
| [getPoint()](#getPoint--) | Returns the endpoint of the elliptical arc. |
| [setPoint(Point2D value)](#setPoint-java.awt.geom.Point2D-) | Sets the endpoint of the elliptical arc. |
| [getSize()](#getSize--) | Returns the x and y radius of the elliptical arc as an x,y pair. |
| [setSize(Dimension2D value)](#setSize-java.awt.geom.Dimension2D-) | Sets the x and y radius of the elliptical arc as an x,y pair. |
| [getRotationAngle()](#getRotationAngle--) | Returns the value indicating how the ellipse is rotated relative to the current coordinate system. |
| [setRotationAngle(float value)](#setRotationAngle-float-) | Sets the value indicating how the ellipse is rotated relative to the current coordinate system. |
| [isLargeArc()](#isLargeArc--) | Returns the value determining whether the arc is drawn with a sweep of 180 or greater. |
| [setLargeArc(boolean value)](#setLargeArc-boolean-) | Sets the value determining whether the arc is drawn with a sweep of 180 or greater. |
| [getSweepDirection()](#getSweepDirection--) | Returns the value specifying the direction in which the arc is drawn. |
| [setSweepDirection(XpsSweepDirection value)](#setSweepDirection-com.aspose.xps.XpsSweepDirection-) | Sets the value specifying the direction in which the arc is drawn. |
| [deepClone()](#deepClone--) | Clones this arc segment. |
### getPoint() {#getPoint--}
```
public Point2D getPoint()
```


Returns the endpoint of the elliptical arc.

**Returns:**
java.awt.geom.Point2D - The endpoint of the elliptical arc.
### setPoint(Point2D value) {#setPoint-java.awt.geom.Point2D-}
```
public void setPoint(Point2D value)
```


Sets the endpoint of the elliptical arc.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.awt.geom.Point2D | The endpoint of the elliptical arc. |

### getSize() {#getSize--}
```
public Dimension2D getSize()
```


Returns the x and y radius of the elliptical arc as an x,y pair.

**Returns:**
java.awt.geom.Dimension2D - The x and y radius of the elliptical arc as an x,y pair.
### setSize(Dimension2D value) {#setSize-java.awt.geom.Dimension2D-}
```
public void setSize(Dimension2D value)
```


Sets the x and y radius of the elliptical arc as an x,y pair.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.awt.geom.Dimension2D | The x and y radius of the elliptical arc as an x,y pair. |

### getRotationAngle() {#getRotationAngle--}
```
public float getRotationAngle()
```


Returns the value indicating how the ellipse is rotated relative to the current coordinate system.

**Returns:**
float - The value indicating how the ellipse is rotated relative to the current coordinate system.
### setRotationAngle(float value) {#setRotationAngle-float-}
```
public void setRotationAngle(float value)
```


Sets the value indicating how the ellipse is rotated relative to the current coordinate system.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | float | The value indicating how the ellipse is rotated relative to the current coordinate system. |

### isLargeArc() {#isLargeArc--}
```
public boolean isLargeArc()
```


Returns the value determining whether the arc is drawn with a sweep of 180 or greater.

**Returns:**
boolean - The value determining whether the arc is drawn with a sweep of 180 or greater.
### setLargeArc(boolean value) {#setLargeArc-boolean-}
```
public void setLargeArc(boolean value)
```


Sets the value determining whether the arc is drawn with a sweep of 180 or greater.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | The value determining whether the arc is drawn with a sweep of 180 or greater. |

### getSweepDirection() {#getSweepDirection--}
```
public XpsSweepDirection getSweepDirection()
```


Returns the value specifying the direction in which the arc is drawn.

**Returns:**
[XpsSweepDirection](../../com.aspose.xps/xpssweepdirection) - The value specifying the direction in which the arc is drawn.
### setSweepDirection(XpsSweepDirection value) {#setSweepDirection-com.aspose.xps.XpsSweepDirection-}
```
public void setSweepDirection(XpsSweepDirection value)
```


Sets the value specifying the direction in which the arc is drawn.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [XpsSweepDirection](../../com.aspose.xps/xpssweepdirection) | The value specifying the direction in which the arc is drawn. |

### deepClone() {#deepClone--}
```
public XpsArcSegment deepClone()
```


Clones this arc segment.

**Returns:**
[XpsArcSegment](../../com.aspose.xps/xpsarcsegment) - Clone of this arc segment.
