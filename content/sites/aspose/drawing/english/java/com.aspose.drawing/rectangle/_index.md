---
title: Rectangle
second_title: Aspose.Drawing for Java API Reference
description: Stores a set of four integers that represent the location and size of a rectangle.
type: docs
weight: 38
url: /java/com.aspose.drawing/rectangle/
---
**Inheritance:**
java.lang.Object, com.aspose.ms.System.ValueType, com.aspose.ms.lang.Struct

**All Implemented Interfaces:**
com.aspose.ms.System.IEquatable, java.lang.Cloneable
```
public class Rectangle extends Struct<Rectangle> implements System.IEquatable<Rectangle>, Cloneable
```

Stores a set of four integers that represent the location and size of a rectangle.
## Constructors

| Constructor | Description |
| --- | --- |
| [Rectangle()](#Rectangle--) |  |
| [Rectangle(int x, int y, int width, int height)](#Rectangle-int-int-int-int-) | Initializes a new instance of the Rectangle structure with the specified location and size. |
| [Rectangle(Point location, Size size)](#Rectangle-com.aspose.drawing.Point-com.aspose.drawing.Size-) | Initializes a new instance of the [Rectangle](../../com.aspose.drawing/rectangle) struct with the specified location and size. |
## Methods

| Method | Description |
| --- | --- |
| [fromLTRB(int left, int top, int right, int bottom)](#fromLTRB-int-int-int-int-) | Creates a [Rectangle](../../com.aspose.drawing/rectangle) structure with the specified edge locations. |
| [intersect(Rectangle a, Rectangle b)](#intersect-com.aspose.drawing.Rectangle-com.aspose.drawing.Rectangle-) | Returns a third [Rectangle](../../com.aspose.drawing/rectangle) structure that represents the intersection of two other [Rectangle](../../com.aspose.drawing/rectangle) structures. |
| [op_Equality(Rectangle left, Rectangle right)](#op-Equality-com.aspose.drawing.Rectangle-com.aspose.drawing.Rectangle-) | Tests whether two [Rectangle](../../com.aspose.drawing/rectangle) structures have equal location and size. |
| [op_Inequality(Rectangle left, Rectangle right)](#op-Inequality-com.aspose.drawing.Rectangle-com.aspose.drawing.Rectangle-) | Tests whether two [Rectangle](../../com.aspose.drawing/rectangle) structures differ in location or size. |
| [ceiling(RectangleF value)](#ceiling-com.aspose.drawing.RectangleF-) | Converts the specified [RectangleF](../../com.aspose.drawing/rectanglef) structure to a [Rectangle](../../com.aspose.drawing/rectangle) structure by rounding the [RectangleF](../../com.aspose.drawing/rectanglef) values to the next higher integer values. |
| [truncate(RectangleF value)](#truncate-com.aspose.drawing.RectangleF-) | Converts the specified [RectangleF](../../com.aspose.drawing/rectanglef) to a [Rectangle](../../com.aspose.drawing/rectangle) by truncating the [RectangleF](../../com.aspose.drawing/rectanglef) values. |
| [round(RectangleF value)](#round-com.aspose.drawing.RectangleF-) | Converts the specified [RectangleF](../../com.aspose.drawing/rectanglef) to a [Rectangle](../../com.aspose.drawing/rectangle) by rounding the [RectangleF](../../com.aspose.drawing/rectanglef) values to the nearest integer values. |
| [union(Rectangle a, Rectangle b)](#union-com.aspose.drawing.Rectangle-com.aspose.drawing.Rectangle-) | Gets a [Rectangle](../../com.aspose.drawing/rectangle) structure that contains the union of two [Rectangle](../../com.aspose.drawing/rectangle) structures. |
| [inflate(Rectangle rect, int x, int y)](#inflate-com.aspose.drawing.Rectangle-int-int-) |  |
| [isEquals(Rectangle obj1, Rectangle obj2)](#isEquals-com.aspose.drawing.Rectangle-com.aspose.drawing.Rectangle-) |  |
| [fromPoints(Point point1, Point point2)](#fromPoints-com.aspose.drawing.Point-com.aspose.drawing.Point-) | Creates a new rectangle from two points. |
| [getEmpty()](#getEmpty--) | Gets a new instance of the `Rectangle` structure that has `Rectangle.X`, `Rectangle.Y`, `Rectangle.Width` and `Rectangle.Height` values set to zero. |
| [getX()](#getX--) | Gets the x-coordinate of the upper-left corner of this Rectangle structure. |
| [setX(int value)](#setX-int-) | Sets the x-coordinate of the upper-left corner of this Rectangle structure. |
| [getY()](#getY--) | Gets the y-coordinate of the upper-left corner of this Rectangle structure. |
| [setY(int value)](#setY-int-) | Sets the y-coordinate of the upper-left corner of this Rectangle structure. |
| [getLocation()](#getLocation--) | Gets the coordinates of the upper-left corner of this [Rectangle](../../com.aspose.drawing/rectangle) structure. |
| [setLocation(Point value)](#setLocation-com.aspose.drawing.Point-) | Sets the coordinates of the upper-left corner of this [Rectangle](../../com.aspose.drawing/rectangle) structure. |
| [getWidth()](#getWidth--) | Gets the width of this Rectangle structure. |
| [setWidth(int value)](#setWidth-int-) | Sets the width of this Rectangle structure. |
| [getHeight()](#getHeight--) | Gets the height of this Rectangle structure. |
| [setHeight(int value)](#setHeight-int-) | Sets the height of this Rectangle structure. |
| [getSize()](#getSize--) | Gets the size of this [Rectangle](../../com.aspose.drawing/rectangle). |
| [setSize(Size value)](#setSize-com.aspose.drawing.Size-) | Sets the size of this [Rectangle](../../com.aspose.drawing/rectangle). |
| [getLeft()](#getLeft--) | Gets the x-coordinate of the left edge of this Rectangle structure. |
| [getTop()](#getTop--) | Gets the y-coordinate of the top edge of this Rectangle structure. |
| [getRight()](#getRight--) | Gets the x-coordinate that is the sum of X and Width property values of this Rectangle structure. |
| [getBottom()](#getBottom--) | Gets the y-coordinate that is the sum of the Y and Height property values of this Rectangle structure. |
| [isEmpty()](#isEmpty--) | Gets a value indicating whether all numeric properties of this [Rectangle](../../com.aspose.drawing/rectangle) have values of zero. |
| [equals(Object obj)](#equals-java.lang.Object-) | Tests whether obj is a [Rectangle](../../com.aspose.drawing/rectangle) structure with the same location and size of this [Rectangle](../../com.aspose.drawing/rectangle) structure. |
| [hashCode()](#hashCode--) | Returns the hash code for this [Rectangle](../../com.aspose.drawing/rectangle) structure. |
| [toString()](#toString--) |  |
| [intersect(Rectangle rect)](#intersect-com.aspose.drawing.Rectangle-) | Replaces this [Rectangle](../../com.aspose.drawing/rectangle) with the intersection of itself and the specified [Rectangle](../../com.aspose.drawing/rectangle). |
| [inflate(int width, int height)](#inflate-int-int-) | Enlarges this [Rectangle](../../com.aspose.drawing/rectangle) by the specified amount. |
| [inflate(Size size)](#inflate-com.aspose.drawing.Size-) | Enlarges this [Rectangle](../../com.aspose.drawing/rectangle) by the specified amount. |
| [contains(int x, int y)](#contains-int-int-) | Determines if the specified point is contained within this [Rectangle](../../com.aspose.drawing/rectangle) structure. |
| [contains(Point pt)](#contains-com.aspose.drawing.Point-) | Determines if the specified point is contained within this [Rectangle](../../com.aspose.drawing/rectangle) structure. |
| [contains(Rectangle rect)](#contains-com.aspose.drawing.Rectangle-) |  |
| [intersectsWith(Rectangle rect)](#intersectsWith-com.aspose.drawing.Rectangle-) | Determines if this rectangle intersects with `rect`. |
| [offset(int x, int y)](#offset-int-int-) | Adjusts the location of this rectangle by the specified amount. |
| [offset(Point pos)](#offset-com.aspose.drawing.Point-) | Adjusts the location of this rectangle by the specified amount. |
| [equals(Rectangle other)](#equals-com.aspose.drawing.Rectangle-) | Tests whether other [Rectangle](../../com.aspose.drawing/rectangle) structure has the same location and size of this [Rectangle](../../com.aspose.drawing/rectangle) structure. |
| [CloneTo(Rectangle that)](#CloneTo-com.aspose.drawing.Rectangle-) |  |
| [Clone()](#Clone--) |  |
| [clone()](#clone--) |  |
| [normalize()](#normalize--) | Normalizes the rectangle by making it's width and height positive, left less than right and top less than bottom. |
### Rectangle() {#Rectangle--}
```
public Rectangle()
```


### Rectangle(int x, int y, int width, int height) {#Rectangle-int-int-int-int-}
```
public Rectangle(int x, int y, int width, int height)
```


Initializes a new instance of the Rectangle structure with the specified location and size.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| x | int | The x-coordinate of the upper-left corner of the rectangle. |
| y | int | The y-coordinate of the upper-left corner of the rectangle. |
| width | int | The width of the rectangle. |
| height | int | The height of the rectangle. |

### Rectangle(Point location, Size size) {#Rectangle-com.aspose.drawing.Point-com.aspose.drawing.Size-}
```
public Rectangle(Point location, Size size)
```


Initializes a new instance of the [Rectangle](../../com.aspose.drawing/rectangle) struct with the specified location and size.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| location | [Point](../../com.aspose.drawing/point) | A [Point](../../com.aspose.drawing/point) that represents the upper-left corner of the rectangular region. |
| size | [Size](../../com.aspose.drawing/size) | A `Size`([.getSize](../../null/\#getSize)/[.setSize(Size)](../../null/\#setSize-Size-)) that represents the width and height of the rectangular region. |

### fromLTRB(int left, int top, int right, int bottom) {#fromLTRB-int-int-int-int-}
```
public static Rectangle fromLTRB(int left, int top, int right, int bottom)
```


Creates a [Rectangle](../../com.aspose.drawing/rectangle) structure with the specified edge locations.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| left | int | The x-coordinate of the upper-left corner of this [Rectangle](../../com.aspose.drawing/rectangle) structure. |
| top | int | The y-coordinate of the upper-left corner of this [Rectangle](../../com.aspose.drawing/rectangle) structure. |
| right | int | The x-coordinate of the lower-right corner of this [Rectangle](../../com.aspose.drawing/rectangle) structure. |
| bottom | int | The y-coordinate of the lower-right corner of this [Rectangle](../../com.aspose.drawing/rectangle) structure. |

**Returns:**
[Rectangle](../../com.aspose.drawing/rectangle) - The new [Rectangle](../../com.aspose.drawing/rectangle) that this method creates.
### intersect(Rectangle a, Rectangle b) {#intersect-com.aspose.drawing.Rectangle-com.aspose.drawing.Rectangle-}
```
public static Rectangle intersect(Rectangle a, Rectangle b)
```


Returns a third [Rectangle](../../com.aspose.drawing/rectangle) structure that represents the intersection of two other [Rectangle](../../com.aspose.drawing/rectangle) structures. If there is no intersection, an empty [Rectangle](../../com.aspose.drawing/rectangle) is returned.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| a | [Rectangle](../../com.aspose.drawing/rectangle) | First rectangle to intersect. |
| b | [Rectangle](../../com.aspose.drawing/rectangle) | Second rectangle to intersect. |

**Returns:**
[Rectangle](../../com.aspose.drawing/rectangle) - A [Rectangle](../../com.aspose.drawing/rectangle) that represents the intersection of `a` and `b`.
### op_Equality(Rectangle left, Rectangle right) {#op-Equality-com.aspose.drawing.Rectangle-com.aspose.drawing.Rectangle-}
```
public static boolean op_Equality(Rectangle left, Rectangle right)
```


Tests whether two [Rectangle](../../com.aspose.drawing/rectangle) structures have equal location and size.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| left | [Rectangle](../../com.aspose.drawing/rectangle) | The [Rectangle](../../com.aspose.drawing/rectangle) structure that is to the left of the equality operator. |
| right | [Rectangle](../../com.aspose.drawing/rectangle) | The [Rectangle](../../com.aspose.drawing/rectangle) structure that is to the right of the equality operator. |

**Returns:**
boolean - This operator returns `true` if the two [Rectangle](../../com.aspose.drawing/rectangle) structures have equal X, Y, Width, and Height properties.
### op_Inequality(Rectangle left, Rectangle right) {#op-Inequality-com.aspose.drawing.Rectangle-com.aspose.drawing.Rectangle-}
```
public static boolean op_Inequality(Rectangle left, Rectangle right)
```


Tests whether two [Rectangle](../../com.aspose.drawing/rectangle) structures differ in location or size.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| left | [Rectangle](../../com.aspose.drawing/rectangle) | The [Rectangle](../../com.aspose.drawing/rectangle) structure that is to the left of the inequality operator. |
| right | [Rectangle](../../com.aspose.drawing/rectangle) | The [Rectangle](../../com.aspose.drawing/rectangle) structure that is to the right of the inequality operator. |

**Returns:**
boolean - This operator returns `true` if any of the X, Y, Width or Height properties of the two [Rectangle](../../com.aspose.drawing/rectangle) structures are unequal; otherwise `false`.
### ceiling(RectangleF value) {#ceiling-com.aspose.drawing.RectangleF-}
```
public static Rectangle ceiling(RectangleF value)
```


Converts the specified [RectangleF](../../com.aspose.drawing/rectanglef) structure to a [Rectangle](../../com.aspose.drawing/rectangle) structure by rounding the [RectangleF](../../com.aspose.drawing/rectanglef) values to the next higher integer values.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [RectangleF](../../com.aspose.drawing/rectanglef) | The [RectangleF](../../com.aspose.drawing/rectanglef) structure to be converted. |

**Returns:**
[Rectangle](../../com.aspose.drawing/rectangle) - Returns a [Rectangle](../../com.aspose.drawing/rectangle).
### truncate(RectangleF value) {#truncate-com.aspose.drawing.RectangleF-}
```
public static Rectangle truncate(RectangleF value)
```


Converts the specified [RectangleF](../../com.aspose.drawing/rectanglef) to a [Rectangle](../../com.aspose.drawing/rectangle) by truncating the [RectangleF](../../com.aspose.drawing/rectanglef) values.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [RectangleF](../../com.aspose.drawing/rectanglef) | The [RectangleF](../../com.aspose.drawing/rectanglef) to be converted. |

**Returns:**
[Rectangle](../../com.aspose.drawing/rectangle) - The truncated value of the [Rectangle](../../com.aspose.drawing/rectangle).
### round(RectangleF value) {#round-com.aspose.drawing.RectangleF-}
```
public static Rectangle round(RectangleF value)
```


Converts the specified [RectangleF](../../com.aspose.drawing/rectanglef) to a [Rectangle](../../com.aspose.drawing/rectangle) by rounding the [RectangleF](../../com.aspose.drawing/rectanglef) values to the nearest integer values.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [RectangleF](../../com.aspose.drawing/rectanglef) | The [RectangleF](../../com.aspose.drawing/rectanglef) to be converted. |

**Returns:**
[Rectangle](../../com.aspose.drawing/rectangle) - A [Rectangle](../../com.aspose.drawing/rectangle).
### union(Rectangle a, Rectangle b) {#union-com.aspose.drawing.Rectangle-com.aspose.drawing.Rectangle-}
```
public static Rectangle union(Rectangle a, Rectangle b)
```


Gets a [Rectangle](../../com.aspose.drawing/rectangle) structure that contains the union of two [Rectangle](../../com.aspose.drawing/rectangle) structures.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| a | [Rectangle](../../com.aspose.drawing/rectangle) | A first rectangle to union. |
| b | [Rectangle](../../com.aspose.drawing/rectangle) | A second rectangle to union. |

**Returns:**
[Rectangle](../../com.aspose.drawing/rectangle) - A [Rectangle](../../com.aspose.drawing/rectangle) structure that bounds the union of the two [Rectangle](../../com.aspose.drawing/rectangle) structures.
### inflate(Rectangle rect, int x, int y) {#inflate-com.aspose.drawing.Rectangle-int-int-}
```
public static Rectangle inflate(Rectangle rect, int x, int y)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| rect | [Rectangle](../../com.aspose.drawing/rectangle) |  |
| x | int |  |
| y | int |  |

**Returns:**
[Rectangle](../../com.aspose.drawing/rectangle)
### isEquals(Rectangle obj1, Rectangle obj2) {#isEquals-com.aspose.drawing.Rectangle-com.aspose.drawing.Rectangle-}
```
public static boolean isEquals(Rectangle obj1, Rectangle obj2)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| obj1 | [Rectangle](../../com.aspose.drawing/rectangle) |  |
| obj2 | [Rectangle](../../com.aspose.drawing/rectangle) |  |

**Returns:**
boolean
### fromPoints(Point point1, Point point2) {#fromPoints-com.aspose.drawing.Point-com.aspose.drawing.Point-}
```
public static Rectangle fromPoints(Point point1, Point point2)
```


Creates a new rectangle from two points. The created rectangle will be normalized with (left,top) lower than (right,bottom).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| point1 | [Point](../../com.aspose.drawing/point) | The first point. |
| point2 | [Point](../../com.aspose.drawing/point) | The second point. |

**Returns:**
[Rectangle](../../com.aspose.drawing/rectangle) - A newly created rectangle.
### getEmpty() {#getEmpty--}
```
public static Rectangle getEmpty()
```


Gets a new instance of the `Rectangle` structure that has `Rectangle.X`, `Rectangle.Y`, `Rectangle.Width` and `Rectangle.Height` values set to zero.

**Returns:**
[Rectangle](../../com.aspose.drawing/rectangle)
### getX() {#getX--}
```
public final int getX()
```


Gets the x-coordinate of the upper-left corner of this Rectangle structure.

**Returns:**
int - the x-coordinate of the upper-left corner of this Rectangle structure.
### setX(int value) {#setX-int-}
```
public final void setX(int value)
```


Sets the x-coordinate of the upper-left corner of this Rectangle structure.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | the x-coordinate of the upper-left corner of this Rectangle structure. |

### getY() {#getY--}
```
public final int getY()
```


Gets the y-coordinate of the upper-left corner of this Rectangle structure.

**Returns:**
int - the y-coordinate of the upper-left corner of this Rectangle structure.
### setY(int value) {#setY-int-}
```
public final void setY(int value)
```


Sets the y-coordinate of the upper-left corner of this Rectangle structure.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | the y-coordinate of the upper-left corner of this Rectangle structure. |

### getLocation() {#getLocation--}
```
public final Point getLocation()
```


Gets the coordinates of the upper-left corner of this [Rectangle](../../com.aspose.drawing/rectangle) structure.

**Returns:**
[Point](../../com.aspose.drawing/point) - the coordinates of the upper-left corner of this [Rectangle](../../com.aspose.drawing/rectangle) structure.
### setLocation(Point value) {#setLocation-com.aspose.drawing.Point-}
```
public final void setLocation(Point value)
```


Sets the coordinates of the upper-left corner of this [Rectangle](../../com.aspose.drawing/rectangle) structure.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Point](../../com.aspose.drawing/point) | the coordinates of the upper-left corner of this [Rectangle](../../com.aspose.drawing/rectangle) structure. |

### getWidth() {#getWidth--}
```
public final int getWidth()
```


Gets the width of this Rectangle structure.

**Returns:**
int - the width of this Rectangle structure.
### setWidth(int value) {#setWidth-int-}
```
public final void setWidth(int value)
```


Sets the width of this Rectangle structure.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | the width of this Rectangle structure. |

### getHeight() {#getHeight--}
```
public final int getHeight()
```


Gets the height of this Rectangle structure.

**Returns:**
int - the height of this Rectangle structure.
### setHeight(int value) {#setHeight-int-}
```
public final void setHeight(int value)
```


Sets the height of this Rectangle structure.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | the height of this Rectangle structure. |

### getSize() {#getSize--}
```
public final Size getSize()
```


Gets the size of this [Rectangle](../../com.aspose.drawing/rectangle).

**Returns:**
[Size](../../com.aspose.drawing/size) - the size of this [Rectangle](../../com.aspose.drawing/rectangle).
### setSize(Size value) {#setSize-com.aspose.drawing.Size-}
```
public final void setSize(Size value)
```


Sets the size of this [Rectangle](../../com.aspose.drawing/rectangle).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Size](../../com.aspose.drawing/size) | the size of this [Rectangle](../../com.aspose.drawing/rectangle). |

### getLeft() {#getLeft--}
```
public final int getLeft()
```


Gets the x-coordinate of the left edge of this Rectangle structure.

**Returns:**
int - the x-coordinate of the left edge of this Rectangle structure.
### getTop() {#getTop--}
```
public final int getTop()
```


Gets the y-coordinate of the top edge of this Rectangle structure.

**Returns:**
int - the y-coordinate of the top edge of this Rectangle structure.
### getRight() {#getRight--}
```
public final int getRight()
```


Gets the x-coordinate that is the sum of X and Width property values of this Rectangle structure.

**Returns:**
int - the x-coordinate that is the sum of X and Width property values of this Rectangle structure.
### getBottom() {#getBottom--}
```
public final int getBottom()
```


Gets the y-coordinate that is the sum of the Y and Height property values of this Rectangle structure.

**Returns:**
int - the y-coordinate that is the sum of the Y and Height property values of this Rectangle structure.
### isEmpty() {#isEmpty--}
```
public final boolean isEmpty()
```


Gets a value indicating whether all numeric properties of this [Rectangle](../../com.aspose.drawing/rectangle) have values of zero.

**Returns:**
boolean - This property returns `true` if the `Rectangle.Width`, `Rectangle.Height`, `Rectangle.X`, and `Rectangle.Y` properties of this [Rectangle](../../com.aspose.drawing/rectangle) all have values of zero; otherwise, `false`.
### equals(Object obj) {#equals-java.lang.Object-}
```
public boolean equals(Object obj)
```


Tests whether obj is a [Rectangle](../../com.aspose.drawing/rectangle) structure with the same location and size of this [Rectangle](../../com.aspose.drawing/rectangle) structure.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| obj | java.lang.Object | The Object to test. |

**Returns:**
boolean - This method returns `true` if obj is a [Rectangle](../../com.aspose.drawing/rectangle) structure and its X, Y, Width, and Height properties are equal to the corresponding properties of this [Rectangle](../../com.aspose.drawing/rectangle) structure; otherwise, `false`.
### hashCode() {#hashCode--}
```
public int hashCode()
```


Returns the hash code for this [Rectangle](../../com.aspose.drawing/rectangle) structure. For information about the use of hash codes, see GetHashCode .

**Returns:**
int - An integer that represents the hash code for this rectangle.
### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### intersect(Rectangle rect) {#intersect-com.aspose.drawing.Rectangle-}
```
public final void intersect(Rectangle rect)
```


Replaces this [Rectangle](../../com.aspose.drawing/rectangle) with the intersection of itself and the specified [Rectangle](../../com.aspose.drawing/rectangle).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| rect | [Rectangle](../../com.aspose.drawing/rectangle) | The [Rectangle](../../com.aspose.drawing/rectangle) with which to intersect. |

### inflate(int width, int height) {#inflate-int-int-}
```
public final void inflate(int width, int height)
```


Enlarges this [Rectangle](../../com.aspose.drawing/rectangle) by the specified amount.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| width | int | The amount to inflate this [Rectangle](../../com.aspose.drawing/rectangle) horizontally. |
| height | int | The amount to inflate this [Rectangle](../../com.aspose.drawing/rectangle) vertically. |

### inflate(Size size) {#inflate-com.aspose.drawing.Size-}
```
public final void inflate(Size size)
```


Enlarges this [Rectangle](../../com.aspose.drawing/rectangle) by the specified amount.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| size | [Size](../../com.aspose.drawing/size) | The size to inflate this [Rectangle](../../com.aspose.drawing/rectangle). |

### contains(int x, int y) {#contains-int-int-}
```
public final boolean contains(int x, int y)
```


Determines if the specified point is contained within this [Rectangle](../../com.aspose.drawing/rectangle) structure.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| x | int | The x-coordinate of the point to test. |
| y | int | The y-coordinate of the point to test. |

**Returns:**
boolean - This method returns `true` if the point defined by `x` and `y` is contained within this [Rectangle](../../com.aspose.drawing/rectangle) structure; otherwise `false`.
### contains(Point pt) {#contains-com.aspose.drawing.Point-}
```
public final boolean contains(Point pt)
```


Determines if the specified point is contained within this [Rectangle](../../com.aspose.drawing/rectangle) structure.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| pt | [Point](../../com.aspose.drawing/point) | The [Point](../../com.aspose.drawing/point) to test. |

**Returns:**
boolean - This method returns `true` if the point represented by `pt` is contained within this [Rectangle](../../com.aspose.drawing/rectangle) structure; otherwise `false`.
### contains(Rectangle rect) {#contains-com.aspose.drawing.Rectangle-}
```
public final boolean contains(Rectangle rect)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| rect | [Rectangle](../../com.aspose.drawing/rectangle) |  |

**Returns:**
boolean
### intersectsWith(Rectangle rect) {#intersectsWith-com.aspose.drawing.Rectangle-}
```
public final boolean intersectsWith(Rectangle rect)
```


Determines if this rectangle intersects with `rect`.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| rect | [Rectangle](../../com.aspose.drawing/rectangle) | The rectangle to test. |

**Returns:**
boolean - This method returns true if there is any intersection, otherwise false.
### offset(int x, int y) {#offset-int-int-}
```
public final void offset(int x, int y)
```


Adjusts the location of this rectangle by the specified amount.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| x | int | The horizontal offset. |
| y | int | The vertical offset. |

### offset(Point pos) {#offset-com.aspose.drawing.Point-}
```
public final void offset(Point pos)
```


Adjusts the location of this rectangle by the specified amount.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| pos | [Point](../../com.aspose.drawing/point) | The offset. |

### equals(Rectangle other) {#equals-com.aspose.drawing.Rectangle-}
```
public final boolean equals(Rectangle other)
```


Tests whether other [Rectangle](../../com.aspose.drawing/rectangle) structure has the same location and size of this [Rectangle](../../com.aspose.drawing/rectangle) structure.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| other | [Rectangle](../../com.aspose.drawing/rectangle) | Other rectangle to test |

**Returns:**
boolean - This method returns `true` if other [Rectangle](../../com.aspose.drawing/rectangle) structure and its X, Y, Width, and Height properties are equal to the corresponding properties of this [Rectangle](../../com.aspose.drawing/rectangle) structure; otherwise, `false`.
### CloneTo(Rectangle that) {#CloneTo-com.aspose.drawing.Rectangle-}
```
public void CloneTo(Rectangle that)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| that | [Rectangle](../../com.aspose.drawing/rectangle) |  |

### Clone() {#Clone--}
```
public Rectangle Clone()
```




**Returns:**
[Rectangle](../../com.aspose.drawing/rectangle)
### clone() {#clone--}
```
public Object clone()
```




**Returns:**
java.lang.Object
### normalize() {#normalize--}
```
public void normalize()
```


Normalizes the rectangle by making it's width and height positive, left less than right and top less than bottom.

