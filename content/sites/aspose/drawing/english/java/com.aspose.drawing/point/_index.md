---
title: Point
second_title: Aspose.Drawing for Java API Reference
description: Represents an ordered pair of integer x- and y-coordinates that defines a point in a two-dimensional plane.
type: docs
weight: 35
url: /java/com.aspose.drawing/point/
---
**Inheritance:**
java.lang.Object, com.aspose.ms.System.ValueType, com.aspose.ms.lang.Struct

**All Implemented Interfaces:**
com.aspose.ms.System.IEquatable, java.lang.Cloneable
```
public class Point extends Struct<Point> implements System.IEquatable<Point>, Cloneable
```

Represents an ordered pair of integer x- and y-coordinates that defines a point in a two-dimensional plane.
## Constructors

| Constructor | Description |
| --- | --- |
| [Point()](#Point--) |  |
| [Point(int x, int y)](#Point-int-int-) | Initializes a new instance of the [Point](../../com.aspose.drawing/point) struct with the specified coordinates. |
| [Point(Size sz)](#Point-com.aspose.drawing.Size-) |  |
| [Point(int dw)](#Point-int-) | Initializes a new instance of the [Point](../../com.aspose.drawing/point) struct using coordinates specified by an integer value. |
## Fields

| Field | Description |
| --- | --- |
| [EMPTY](#EMPTY) | Represents a [Point](../../com.aspose.drawing/point) that has `P:Point.X` and `P:Point.Y` values set to zero. |
## Methods

| Method | Description |
| --- | --- |
| [to_PointF(Point p)](#to-PointF-com.aspose.drawing.Point-) | Converts the specified [Point](../../com.aspose.drawing/point) structure to a [PointF](../../com.aspose.drawing/pointf) structure. |
| [to_Size(Point p)](#to-Size-com.aspose.drawing.Point-) |  |
| [op_Addition(Point pt, Size sz)](#op-Addition-com.aspose.drawing.Point-com.aspose.drawing.Size-) |  |
| [op_Subtraction(Point pt, Size sz)](#op-Subtraction-com.aspose.drawing.Point-com.aspose.drawing.Size-) |  |
| [op_Equality(Point left, Point right)](#op-Equality-com.aspose.drawing.Point-com.aspose.drawing.Point-) | Compares two [Point](../../com.aspose.drawing/point) objects. |
| [op_Inequality(Point left, Point right)](#op-Inequality-com.aspose.drawing.Point-com.aspose.drawing.Point-) | Compares two [Point](../../com.aspose.drawing/point) objects. |
| [add(Point pt, Size sz)](#add-com.aspose.drawing.Point-com.aspose.drawing.Size-) | Adds the specified [Size](../../com.aspose.drawing/size) to the specified [Point](../../com.aspose.drawing/point). |
| [subtract(Point pt, Size sz)](#subtract-com.aspose.drawing.Point-com.aspose.drawing.Size-) |  |
| [ceiling(PointF value)](#ceiling-com.aspose.drawing.PointF-) |  |
| [truncate(PointF value)](#truncate-com.aspose.drawing.PointF-) | Converts a PointF to a Point by performing a truncate operation on all the coordinates. |
| [round(PointF value)](#round-com.aspose.drawing.PointF-) | Converts the specified [PointF](../../com.aspose.drawing/pointf) to a Point object by rounding the [Point](../../com.aspose.drawing/point) values to the nearest integer. |
| [isEquals(Point obj1, Point obj2)](#isEquals-com.aspose.drawing.Point-com.aspose.drawing.Point-) |  |
| [getEmpty()](#getEmpty--) |  |
| [getX()](#getX--) | Gets the x-coordinate of this Point. |
| [setX(int value)](#setX-int-) | Sets the x-coordinate of this Point. |
| [getY()](#getY--) | Gets the y-coordinate of this Point. |
| [setY(int value)](#setY-int-) | Sets the y-coordinate of this Point. |
| [isEmpty()](#isEmpty--) | Gets a value indicating whether this this [Point](../../com.aspose.drawing/point) is empty. |
| [hashCode()](#hashCode--) | Returns a hash code for this [Point](../../com.aspose.drawing/point). |
| [toString()](#toString--) |  |
| [equals(Object obj)](#equals-java.lang.Object-) | Specifies whether this [Point](../../com.aspose.drawing/point) contains the same coordinates as the specified Object. |
| [offset(int dx, int dy)](#offset-int-int-) | Translates this [Point](../../com.aspose.drawing/point) by the specified amount. |
| [offset(Point p)](#offset-com.aspose.drawing.Point-) | Translates this [Point](../../com.aspose.drawing/point) by the specified [Point](../../com.aspose.drawing/point). |
| [equals(Point other)](#equals-com.aspose.drawing.Point-) | Tests whether other [Point](../../com.aspose.drawing/point) structure has the same location of this [Point](../../com.aspose.drawing/point) structure. |
| [CloneTo(Point that)](#CloneTo-com.aspose.drawing.Point-) |  |
| [Clone()](#Clone--) |  |
| [clone()](#clone--) |  |
### Point() {#Point--}
```
public Point()
```


### Point(int x, int y) {#Point-int-int-}
```
public Point(int x, int y)
```


Initializes a new instance of the [Point](../../com.aspose.drawing/point) struct with the specified coordinates.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| x | int | The horizontal position of the point. |
| y | int | The vertical position of the point. |

### Point(Size sz) {#Point-com.aspose.drawing.Size-}
```
public Point(Size sz)
```


**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| sz | [Size](../../com.aspose.drawing/size) |  |

### Point(int dw) {#Point-int-}
```
public Point(int dw)
```


Initializes a new instance of the [Point](../../com.aspose.drawing/point) struct using coordinates specified by an integer value.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| dw | int | The integer value. |

### EMPTY {#EMPTY}
```
public static final Point EMPTY
```


Represents a [Point](../../com.aspose.drawing/point) that has `P:Point.X` and `P:Point.Y` values set to zero.

### to_PointF(Point p) {#to-PointF-com.aspose.drawing.Point-}
```
public static PointF to_PointF(Point p)
```


Converts the specified [Point](../../com.aspose.drawing/point) structure to a [PointF](../../com.aspose.drawing/pointf) structure.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| p | [Point](../../com.aspose.drawing/point) | The [Point](../../com.aspose.drawing/point) to be converted. |

**Returns:**
[PointF](../../com.aspose.drawing/pointf) - The [PointF](../../com.aspose.drawing/pointf) that results from the conversion.
### to_Size(Point p) {#to-Size-com.aspose.drawing.Point-}
```
public static Size to_Size(Point p)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| p | [Point](../../com.aspose.drawing/point) |  |

**Returns:**
[Size](../../com.aspose.drawing/size)
### op_Addition(Point pt, Size sz) {#op-Addition-com.aspose.drawing.Point-com.aspose.drawing.Size-}
```
public static Point op_Addition(Point pt, Size sz)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| pt | [Point](../../com.aspose.drawing/point) |  |
| sz | [Size](../../com.aspose.drawing/size) |  |

**Returns:**
[Point](../../com.aspose.drawing/point)
### op_Subtraction(Point pt, Size sz) {#op-Subtraction-com.aspose.drawing.Point-com.aspose.drawing.Size-}
```
public static Point op_Subtraction(Point pt, Size sz)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| pt | [Point](../../com.aspose.drawing/point) |  |
| sz | [Size](../../com.aspose.drawing/size) |  |

**Returns:**
[Point](../../com.aspose.drawing/point)
### op_Equality(Point left, Point right) {#op-Equality-com.aspose.drawing.Point-com.aspose.drawing.Point-}
```
public static boolean op_Equality(Point left, Point right)
```


Compares two [Point](../../com.aspose.drawing/point) objects. The result specifies whether the values of the `P:Point.X` and `P:Point.Y` properties of the two [Point](../../com.aspose.drawing/point) objects are equal.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| left | [Point](../../com.aspose.drawing/point) | First [Point](../../com.aspose.drawing/point) to compare. |
| right | [Point](../../com.aspose.drawing/point) | Second [Point](../../com.aspose.drawing/point) to compare. |

**Returns:**
boolean - true if the `P:Point.X` and `P:Point.Y` values of `left` and `right` are equal; otherwise, false.
### op_Inequality(Point left, Point right) {#op-Inequality-com.aspose.drawing.Point-com.aspose.drawing.Point-}
```
public static boolean op_Inequality(Point left, Point right)
```


Compares two [Point](../../com.aspose.drawing/point) objects. The result specifies whether the values of the `P:Point.X` or `P:Point.Y` properties of the two [Point](../../com.aspose.drawing/point) objects are unequal.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| left | [Point](../../com.aspose.drawing/point) | First [Point](../../com.aspose.drawing/point) to compare. |
| right | [Point](../../com.aspose.drawing/point) | Second [Point](../../com.aspose.drawing/point) to compare. |

**Returns:**
boolean - true if the values of either the `P:Point.X` properties or the `P:Point.Y` properties of `left` and `right` differ; otherwise, false.
### add(Point pt, Size sz) {#add-com.aspose.drawing.Point-com.aspose.drawing.Size-}
```
public static Point add(Point pt, Size sz)
```


Adds the specified [Size](../../com.aspose.drawing/size) to the specified [Point](../../com.aspose.drawing/point).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| pt | [Point](../../com.aspose.drawing/point) | The [Point](../../com.aspose.drawing/point) to add. |
| sz | [Size](../../com.aspose.drawing/size) | The [Size](../../com.aspose.drawing/size) to add |

**Returns:**
[Point](../../com.aspose.drawing/point) - The [Point](../../com.aspose.drawing/point) that is the result of the addition operation.
### subtract(Point pt, Size sz) {#subtract-com.aspose.drawing.Point-com.aspose.drawing.Size-}
```
public static Point subtract(Point pt, Size sz)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| pt | [Point](../../com.aspose.drawing/point) |  |
| sz | [Size](../../com.aspose.drawing/size) |  |

**Returns:**
[Point](../../com.aspose.drawing/point)
### ceiling(PointF value) {#ceiling-com.aspose.drawing.PointF-}
```
public static Point ceiling(PointF value)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [PointF](../../com.aspose.drawing/pointf) |  |

**Returns:**
[Point](../../com.aspose.drawing/point)
### truncate(PointF value) {#truncate-com.aspose.drawing.PointF-}
```
public static Point truncate(PointF value)
```


Converts a PointF to a Point by performing a truncate operation on all the coordinates.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [PointF](../../com.aspose.drawing/pointf) | The [PointF](../../com.aspose.drawing/pointf) to truncate. |

**Returns:**
[Point](../../com.aspose.drawing/point) - The [Point](../../com.aspose.drawing/point) that is the result of the truncate operation.
### round(PointF value) {#round-com.aspose.drawing.PointF-}
```
public static Point round(PointF value)
```


Converts the specified [PointF](../../com.aspose.drawing/pointf) to a Point object by rounding the [Point](../../com.aspose.drawing/point) values to the nearest integer.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [PointF](../../com.aspose.drawing/pointf) | The [PointF](../../com.aspose.drawing/pointf) to convert. |

**Returns:**
[Point](../../com.aspose.drawing/point) - The [Point](../../com.aspose.drawing/point) this method converts to.
### isEquals(Point obj1, Point obj2) {#isEquals-com.aspose.drawing.Point-com.aspose.drawing.Point-}
```
public static boolean isEquals(Point obj1, Point obj2)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| obj1 | [Point](../../com.aspose.drawing/point) |  |
| obj2 | [Point](../../com.aspose.drawing/point) |  |

**Returns:**
boolean
### getEmpty() {#getEmpty--}
```
public static Point getEmpty()
```




**Returns:**
[Point](../../com.aspose.drawing/point)
### getX() {#getX--}
```
public final int getX()
```


Gets the x-coordinate of this Point.

**Returns:**
int - the x-coordinate of this Point.
### setX(int value) {#setX-int-}
```
public final void setX(int value)
```


Sets the x-coordinate of this Point.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | the x-coordinate of this Point. |

### getY() {#getY--}
```
public final int getY()
```


Gets the y-coordinate of this Point.

**Returns:**
int - the y-coordinate of this Point.
### setY(int value) {#setY-int-}
```
public final void setY(int value)
```


Sets the y-coordinate of this Point.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | the y-coordinate of this Point. |

### isEmpty() {#isEmpty--}
```
public final boolean isEmpty()
```


Gets a value indicating whether this this [Point](../../com.aspose.drawing/point) is empty.

Value: `true` if both X and Y are 0; otherwise, `false`.

**Returns:**
boolean - a value indicating whether this this [Point](../../com.aspose.drawing/point) is empty.
### hashCode() {#hashCode--}
```
public int hashCode()
```


Returns a hash code for this [Point](../../com.aspose.drawing/point).

**Returns:**
int - An integer value that specifies a hash value for this [Point](../../com.aspose.drawing/point).
### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### equals(Object obj) {#equals-java.lang.Object-}
```
public boolean equals(Object obj)
```


Specifies whether this [Point](../../com.aspose.drawing/point) contains the same coordinates as the specified Object.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| obj | java.lang.Object | The Object to test. |

**Returns:**
boolean - `true` if obj is a Point and has the same coordinates as this [Point](../../com.aspose.drawing/point).
### offset(int dx, int dy) {#offset-int-int-}
```
public final void offset(int dx, int dy)
```


Translates this [Point](../../com.aspose.drawing/point) by the specified amount.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| dx | int | The amount to offset the x-coordinate. |
| dy | int | The amount to offset the y-coordinate. |

### offset(Point p) {#offset-com.aspose.drawing.Point-}
```
public final void offset(Point p)
```


Translates this [Point](../../com.aspose.drawing/point) by the specified [Point](../../com.aspose.drawing/point).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| p | [Point](../../com.aspose.drawing/point) | The [Point](../../com.aspose.drawing/point) used offset this [Point](../../com.aspose.drawing/point). |

### equals(Point other) {#equals-com.aspose.drawing.Point-}
```
public final boolean equals(Point other)
```


Tests whether other [Point](../../com.aspose.drawing/point) structure has the same location of this [Point](../../com.aspose.drawing/point) structure.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| other | [Point](../../com.aspose.drawing/point) | Other point to test |

**Returns:**
boolean - This method returns `true` if other [Point](../../com.aspose.drawing/point) structure and its X and Y properties are equal to the corresponding properties of this [Point](../../com.aspose.drawing/point) structure; otherwise, `false`.
### CloneTo(Point that) {#CloneTo-com.aspose.drawing.Point-}
```
public void CloneTo(Point that)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| that | [Point](../../com.aspose.drawing/point) |  |

### Clone() {#Clone--}
```
public Point Clone()
```




**Returns:**
[Point](../../com.aspose.drawing/point)
### clone() {#clone--}
```
public Object clone()
```




**Returns:**
java.lang.Object
