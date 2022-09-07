---
title: XpsPathFigure
second_title: Aspose.Page for Java API Reference
description: Class incapsulating PathFigure element features.
type: docs
weight: 40
url: /java/com.aspose.xps/xpspathfigure/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), com.aspose.xps.XpsArray
```
public class XpsPathFigure extends XpsArray<XpsPathSegment>
```

Class incapsulating PathFigure element features. This element is composed of a set of one or more line or curve segments.
## Methods

| Method | Description |
| --- | --- |
| [getSegments()](#getSegments--) | Return the list of child path segments. |
| [isClosed()](#isClosed--) | Returns the value indicating whether the path figure is closed. |
| [setClosed(boolean value)](#setClosed-boolean-) | Sets the value indicating whether the path figure is closed. |
| [getStartPoint()](#getStartPoint--) | Returns the starting point for the first segment of the path figure. |
| [setStartPoint(Point2D value)](#setStartPoint-java.awt.geom.Point2D-) | Sets the starting point for the first segment of the path figure. |
| [isFilled()](#isFilled--) | Returns the value indicating whether the path figure is used in computing the area of the containing path geometry. |
| [setFilled(boolean value)](#setFilled-boolean-) | Sets the value indicating whether the path figure is used in computing the area of the containing path geometry. |
| [deepClone()](#deepClone--) | Clones this path figure. |
### getSegments() {#getSegments--}
```
public List<XpsPathSegment> getSegments()
```


Return the list of child path segments.

**Returns:**
java.util.List<com.aspose.xps.XpsPathSegment> - The list of child path segments.
### isClosed() {#isClosed--}
```
public boolean isClosed()
```


Returns the value indicating whether the path figure is closed.

**Returns:**
boolean - The value indicating whether the path figure is closed.
### setClosed(boolean value) {#setClosed-boolean-}
```
public void setClosed(boolean value)
```


Sets the value indicating whether the path figure is closed.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | The value indicating whether the path figure is closed. |

### getStartPoint() {#getStartPoint--}
```
public Point2D getStartPoint()
```


Returns the starting point for the first segment of the path figure.

**Returns:**
java.awt.geom.Point2D - The starting point for the first segment of the path figure.
### setStartPoint(Point2D value) {#setStartPoint-java.awt.geom.Point2D-}
```
public void setStartPoint(Point2D value)
```


Sets the starting point for the first segment of the path figure.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.awt.geom.Point2D | The starting point for the first segment of the path figure. |

### isFilled() {#isFilled--}
```
public boolean isFilled()
```


Returns the value indicating whether the path figure is used in computing the area of the containing path geometry.

**Returns:**
boolean - The value indicating whether the path figure is used in computing the area of the containing path geometry.
### setFilled(boolean value) {#setFilled-boolean-}
```
public void setFilled(boolean value)
```


Sets the value indicating whether the path figure is used in computing the area of the containing path geometry.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | The value indicating whether the path figure is used in computing the area of the containing path geometry. |

### deepClone() {#deepClone--}
```
public XpsPathFigure deepClone()
```


Clones this path figure.

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - Clone of this path figure.
