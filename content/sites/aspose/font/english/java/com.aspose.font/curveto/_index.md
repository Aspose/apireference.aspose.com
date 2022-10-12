---
title: CurveTo
second_title: Aspose.Font for Java API Reference
description: Represents CurveTo operation.
type: docs
weight: 20
url: /java/com.aspose.font/curveto/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.font.IPathSegment](../../com.aspose.font/ipathsegment)
```
public class CurveTo implements IPathSegment
```

Represents CurveTo operation.
## Methods

| Method | Description |
| --- | --- |
| [getX1()](#getX1--) | Gets coordinate x1. |
| [getY1()](#getY1--) | Gets coordinate y1. |
| [getX2()](#getX2--) | Gets coordinate x2. |
| [getY2()](#getY2--) | Gets coordinate y2. |
| [getX3()](#getX3--) | Gets coordinate x3. |
| [getY3()](#getY3--) | Gets coordinate y3. |
| [copy()](#copy--) | Creates copy of the segment object. |
| [shift(double dx, double dy)](#shift-double-double-) | Performs shift by x and y coordinates. |
| [transform(TransformationMatrix matrix)](#transform-com.aspose.font.TransformationMatrix-) | Transforms coordinates with the transformation matrix. |
| [clone()](#clone--) | Creates a new object that is a copy of the current instance. |
### getX1() {#getX1--}
```
public double getX1()
```


Gets coordinate x1.

**Returns:**
double - Coordinate x1.
### getY1() {#getY1--}
```
public double getY1()
```


Gets coordinate y1.

**Returns:**
double - Coordinate y1.
### getX2() {#getX2--}
```
public double getX2()
```


Gets coordinate x2.

**Returns:**
double - Coordinate x2.
### getY2() {#getY2--}
```
public double getY2()
```


Gets coordinate y2.

**Returns:**
double - Coordinate y2.
### getX3() {#getX3--}
```
public double getX3()
```


Gets coordinate x3.

**Returns:**
double - Coordinate x3.
### getY3() {#getY3--}
```
public double getY3()
```


Gets coordinate y3.

**Returns:**
double - Coordinate y3.
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
