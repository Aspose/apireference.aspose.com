---
title: MoveTo
second_title: Aspose.Font for Java API Reference
description: Represents MoveTo operation.
type: docs
weight: 54
url: /java/com.aspose.font/moveto/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.font.IPathSegment](../../com.aspose.font/ipathsegment)
```
public class MoveTo implements IPathSegment
```

Represents MoveTo operation.
## Methods

| Method | Description |
| --- | --- |
| [getX()](#getX--) | Gets coordinate x. |
| [getY()](#getY--) | Gets coordinate y. |
| [copy()](#copy--) | Creates copy of the segment object. |
| [shift(double dx, double dy)](#shift-double-double-) | Performs shift by x and y coordinates. |
| [transform(TransformationMatrix matrix)](#transform-com.aspose.font.TransformationMatrix-) | Transforms coordinates with the transformation matrix. |
| [clone()](#clone--) | Creates a new object that is a copy of the current instance. |
### getX() {#getX--}
```
public double getX()
```


Gets coordinate x.

**Returns:**
double - Coordinate x.
### getY() {#getY--}
```
public double getY()
```


Gets coordinate y.

**Returns:**
double - Coordinate y.
### copy() {#copy--}
```
public IPathSegment copy()
```


Creates copy of the segment object.

**Returns:**
[IPathSegment](../../com.aspose.font/ipathsegment) - Copy of the segment object.
### shift(double dx, double dy) {#shift-double-double-}
```
public void shift(double dx, double dy)
```


Performs shift by x and y coordinates.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| dx | double | Value dx. |
| dy | double | Value dy. |

### transform(TransformationMatrix matrix) {#transform-com.aspose.font.TransformationMatrix-}
```
public void transform(TransformationMatrix matrix)
```


Transforms coordinates with the transformation matrix.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| matrix | [TransformationMatrix](../../com.aspose.font/transformationmatrix) | Transformation matrix. |

### clone() {#clone--}
```
public Object clone()
```


Creates a new object that is a copy of the current instance.

**Returns:**
java.lang.Object - A new object that is a copy of this instance.
