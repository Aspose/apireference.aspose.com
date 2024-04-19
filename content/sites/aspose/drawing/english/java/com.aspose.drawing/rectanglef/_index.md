---
title: RectangleF
second_title: Aspose.Drawing for Java API Reference
description: Stores a set of four floating-point numbers that represent the location and size of a rectangle.
type: docs
weight: 39
url: /java/com.aspose.drawing/rectanglef/
---
**Inheritance:**
java.lang.Object, com.aspose.ms.System.ValueType, com.aspose.ms.lang.Struct

**All Implemented Interfaces:**
com.aspose.ms.System.IEquatable, java.lang.Cloneable
```
public class RectangleF extends Struct<RectangleF> implements System.IEquatable<RectangleF>, Cloneable
```

Stores a set of four floating-point numbers that represent the location and size of a rectangle. For more advanced region functions, use a Region object.
## Constructors

| Constructor | Description |
| --- | --- |
| [RectangleF()](#RectangleF--) |  |
| [RectangleF(PointF location, SizeF size)](#RectangleF-com.aspose.drawing.PointF-com.aspose.drawing.SizeF-) | Initializes a new instance of the RectangleF structure with the specified location and size. |
| [RectangleF(float x, float y, float width, float height)](#RectangleF-float-float-float-float-) | Initializes a new instance of the RectangleF structure with the specified location and size. |
## Methods

| Method | Description |
| --- | --- |
| [fromPoints(PointF point1, PointF point2)](#fromPoints-com.aspose.drawing.PointF-com.aspose.drawing.PointF-) | Creates a new rectangle from two points. |
| [to_RectangleF(Rectangle r)](#to-RectangleF-com.aspose.drawing.Rectangle-) | Converts the specified Rectangle structure to a RectangleF structure. |
| [op_Equality(RectangleF left, RectangleF right)](#op-Equality-com.aspose.drawing.RectangleF-com.aspose.drawing.RectangleF-) | Tests whether two [RectangleF](../../com.aspose.drawing/rectanglef) structures have equal location and size. |
| [op_Inequality(RectangleF left, RectangleF right)](#op-Inequality-com.aspose.drawing.RectangleF-com.aspose.drawing.RectangleF-) | Tests whether two [RectangleF](../../com.aspose.drawing/rectanglef) structures differ in location or size. |
| [fromLTRB(float left, float top, float right, float bottom)](#fromLTRB-float-float-float-float-) | Creates a RectangleF structure with upper-left corner and lower-right corner at the specified locations. |
| [inflate(RectangleF rect, float x, float y)](#inflate-com.aspose.drawing.RectangleF-float-float-) | Creates and returns an inflated copy of the specified [RectangleF](../../com.aspose.drawing/rectanglef) structure. |
| [intersect(RectangleF a, RectangleF b)](#intersect-com.aspose.drawing.RectangleF-com.aspose.drawing.RectangleF-) | Returns a [RectangleF](../../com.aspose.drawing/rectanglef) structure that represents the intersection of two rectangles. |
| [union(RectangleF a, RectangleF b)](#union-com.aspose.drawing.RectangleF-com.aspose.drawing.RectangleF-) | Creates the smallest possible third rectangle that can contain both of two rectangles that form a union. |
| [isEquals(RectangleF obj1, RectangleF obj2)](#isEquals-com.aspose.drawing.RectangleF-com.aspose.drawing.RectangleF-) |  |
| [getEmpty()](#getEmpty--) |  |
| [isEmpty()](#isEmpty--) | Gets a value indicating whether the `RectangleF.Width` or `RectangleF.Height` property of this [RectangleF](../../com.aspose.drawing/rectanglef) has a value of zero. |
| [getX()](#getX--) | Gets the x-coordinate of the upper-left corner of this RectangleF structure. |
| [setX(float value)](#setX-float-) | Sets the x-coordinate of the upper-left corner of this RectangleF structure. |
| [getY()](#getY--) | Gets the x-coordinate of the upper-left corner of this RectangleF structure. |
| [setY(float value)](#setY-float-) | Sets the x-coordinate of the upper-left corner of this RectangleF structure. |
| [getLocation()](#getLocation--) | Gets the coordinates of the upper-left corner of this [RectangleF](../../com.aspose.drawing/rectanglef) structure. |
| [setLocation(PointF value)](#setLocation-com.aspose.drawing.PointF-) | Sets the coordinates of the upper-left corner of this [RectangleF](../../com.aspose.drawing/rectanglef) structure. |
| [getWidth()](#getWidth--) | Gets the width of this RectangleF structure. |
| [setWidth(float value)](#setWidth-float-) | Sets the width of this RectangleF structure. |
| [getHeight()](#getHeight--) | Gets the height of this RectangleF structure. |
| [setHeight(float value)](#setHeight-float-) | Sets the height of this RectangleF structure. |
| [getSize()](#getSize--) | Gets the size of this [RectangleF](../../com.aspose.drawing/rectanglef). |
| [setSize(SizeF value)](#setSize-com.aspose.drawing.SizeF-) | Sets the size of this [RectangleF](../../com.aspose.drawing/rectanglef). |
| [getLeft()](#getLeft--) | Gets the x-coordinate of the left edge of this RectangleF structure. |
| [getTop()](#getTop--) | Gets the y-coordinate of the top edge of this RectangleF structure. |
| [getRight()](#getRight--) | Gets the x-coordinate that is the sum of X and Width of this RectangleF structure. |
| [getBottom()](#getBottom--) | Gets the y-coordinate that is the sum of Y and Height of this RectangleF structure. |
| [toString()](#toString--) |  |
| [inflate(float x, float y)](#inflate-float-float-) | Inflates this [RectangleF](../../com.aspose.drawing/rectanglef) structure by the specified amount. |
| [inflate(SizeF size)](#inflate-com.aspose.drawing.SizeF-) | Inflates this [RectangleF](../../com.aspose.drawing/rectanglef) by the specified amount. |
| [intersect(RectangleF rect)](#intersect-com.aspose.drawing.RectangleF-) | Replaces this [RectangleF](../../com.aspose.drawing/rectanglef) structure with the intersection of itself and the specified [RectangleF](../../com.aspose.drawing/rectanglef) structure. |
| [intersectsWith(RectangleF rect)](#intersectsWith-com.aspose.drawing.RectangleF-) | Determines if this rectangle intersects with `rect`. |
| [offset(PointF pos)](#offset-com.aspose.drawing.PointF-) | Adjusts the location of this rectangle by the specified amount. |
| [offset(float x, float y)](#offset-float-float-) | Adjusts the location of this rectangle by the specified amount. |
| [contains(float x, float y)](#contains-float-float-) | Determines if the specified point is contained within this [RectangleF](../../com.aspose.drawing/rectanglef) structure. |
| [contains(PointF pt)](#contains-com.aspose.drawing.PointF-) | Determines if the specified point is contained within this [RectangleF](../../com.aspose.drawing/rectanglef) structure. |
| [contains(RectangleF rect)](#contains-com.aspose.drawing.RectangleF-) | Determines if the rectangular region represented by `rect` is entirely contained within this [RectangleF](../../com.aspose.drawing/rectanglef) structure. |
| [equals(Object obj)](#equals-java.lang.Object-) | Determines whether the specified Object, is equal to this instance. |
| [hashCode()](#hashCode--) | Returns a hash code for this instance. |
| [equals(RectangleF other)](#equals-com.aspose.drawing.RectangleF-) | Tests whether other [RectangleF](../../com.aspose.drawing/rectanglef) structure has the same location and size of this [RectangleF](../../com.aspose.drawing/rectanglef) structure. |
| [CloneTo(RectangleF that)](#CloneTo-com.aspose.drawing.RectangleF-) |  |
| [Clone()](#Clone--) |  |
| [clone()](#clone--) |  |
### RectangleF() {#RectangleF--}
```
public RectangleF()
```


### RectangleF(PointF location, SizeF size) {#RectangleF-com.aspose.drawing.PointF-com.aspose.drawing.SizeF-}
```
public RectangleF(PointF location, SizeF size)
```


Initializes a new instance of the RectangleF structure with the specified location and size.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| location | [PointF](../../com.aspose.drawing/pointf) | A PointF that represents the upper-left corner of the rectangular region. |
| size | [SizeF](../../com.aspose.drawing/sizef) | A SizeF that represents the width and height of the rectangular region. |

### RectangleF(float x, float y, float width, float height) {#RectangleF-float-float-float-float-}
```
public RectangleF(float x, float y, float width, float height)
```


Initializes a new instance of the RectangleF structure with the specified location and size.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| x | float | The x-coordinate of the upper-left corner of the rectangle. |
| y | float | The y-coordinate of the upper-left corner of the rectangle. |
| width | float | The width of the rectangle. |
| height | float | The height of the rectangle. |

### fromPoints(PointF point1, PointF point2) {#fromPoints-com.aspose.drawing.PointF-com.aspose.drawing.PointF-}
```
public static RectangleF fromPoints(PointF point1, PointF point2)
```


Creates a new rectangle from two points. The created rectangle will be normalized with (left,top) lower than (right,bottom).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| point1 | [PointF](../../com.aspose.drawing/pointf) | The first point. |
| point2 | [PointF](../../com.aspose.drawing/pointf) | The second point. |

**Returns:**
[RectangleF](../../com.aspose.drawing/rectanglef) - A newly created rectangle.
### to_RectangleF(Rectangle r) {#to-RectangleF-com.aspose.drawing.Rectangle-}
```
public static RectangleF to_RectangleF(Rectangle r)
```


Converts the specified Rectangle structure to a RectangleF structure.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| r | [Rectangle](../../com.aspose.drawing/rectangle) | The Rectangle structure to convert. |

**Returns:**
[RectangleF](../../com.aspose.drawing/rectanglef) - The RectangleF structure that is converted from the specified Rectangle structure.
### op_Equality(RectangleF left, RectangleF right) {#op-Equality-com.aspose.drawing.RectangleF-com.aspose.drawing.RectangleF-}
```
public static boolean op_Equality(RectangleF left, RectangleF right)
```


Tests whether two [RectangleF](../../com.aspose.drawing/rectanglef) structures have equal location and size.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| left | [RectangleF](../../com.aspose.drawing/rectanglef) | The [RectangleF](../../com.aspose.drawing/rectanglef) structure that is to the left of the equality operator. |
| right | [RectangleF](../../com.aspose.drawing/rectanglef) | The [RectangleF](../../com.aspose.drawing/rectanglef) structure that is to the right of the equality operator. |

**Returns:**
boolean - This operator returns true if the two specified [RectangleF](../../com.aspose.drawing/rectanglef) structures have equal `RectangleF.X`, `RectangleF.Y`, `RectangleF.Width`, and `RectangleF.Height` properties.
### op_Inequality(RectangleF left, RectangleF right) {#op-Inequality-com.aspose.drawing.RectangleF-com.aspose.drawing.RectangleF-}
```
public static boolean op_Inequality(RectangleF left, RectangleF right)
```


Tests whether two [RectangleF](../../com.aspose.drawing/rectanglef) structures differ in location or size.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| left | [RectangleF](../../com.aspose.drawing/rectanglef) | The [RectangleF](../../com.aspose.drawing/rectanglef) structure that is to the left of the inequality operator. |
| right | [RectangleF](../../com.aspose.drawing/rectanglef) | The [RectangleF](../../com.aspose.drawing/rectanglef) structure that is to the right of the inequality operator. |

**Returns:**
boolean - This operator returns true if any of the `RectangleF.X`, `RectangleF.Y`, `RectangleF.Width`, or `RectangleF.Height` properties of the two [Rectangle](../../com.aspose.drawing/rectangle) structures are unequal; otherwise false.
### fromLTRB(float left, float top, float right, float bottom) {#fromLTRB-float-float-float-float-}
```
public static RectangleF fromLTRB(float left, float top, float right, float bottom)
```


Creates a RectangleF structure with upper-left corner and lower-right corner at the specified locations.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| left | float | The x-coordinate of the upper-left corner of the rectangular region. |
| top | float | The y-coordinate of the upper-left corner of the rectangular region. |
| right | float | The x-coordinate of the lower-right corner of the rectangular region. |
| bottom | float | The y-coordinate of the lower-right corner of the rectangular region. |

**Returns:**
[RectangleF](../../com.aspose.drawing/rectanglef) - The new RectangleF that this method creates.
### inflate(RectangleF rect, float x, float y) {#inflate-com.aspose.drawing.RectangleF-float-float-}
```
public static RectangleF inflate(RectangleF rect, float x, float y)
```


Creates and returns an inflated copy of the specified [RectangleF](../../com.aspose.drawing/rectanglef) structure. The copy is inflated by the specified amount. The original rectangle remains unmodified.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| rect | [RectangleF](../../com.aspose.drawing/rectanglef) | The [RectangleF](../../com.aspose.drawing/rectanglef) to be copied. This rectangle is not modified. |
| x | float | The amount to inflate the copy of the rectangle horizontally. |
| y | float | The amount to inflate the copy of the rectangle vertically. |

**Returns:**
[RectangleF](../../com.aspose.drawing/rectanglef) - The inflated [RectangleF](../../com.aspose.drawing/rectanglef).
### intersect(RectangleF a, RectangleF b) {#intersect-com.aspose.drawing.RectangleF-com.aspose.drawing.RectangleF-}
```
public static RectangleF intersect(RectangleF a, RectangleF b)
```


Returns a [RectangleF](../../com.aspose.drawing/rectanglef) structure that represents the intersection of two rectangles. If there is no intersection, and empty [RectangleF](../../com.aspose.drawing/rectanglef) is returned.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| a | [RectangleF](../../com.aspose.drawing/rectanglef) | First rectangle to intersect. |
| b | [RectangleF](../../com.aspose.drawing/rectanglef) | Second rectangle to intersect. |

**Returns:**
[RectangleF](../../com.aspose.drawing/rectanglef) - A third [RectangleF](../../com.aspose.drawing/rectanglef) structure the size of which represents the overlapped area of the two specified rectangles.
### union(RectangleF a, RectangleF b) {#union-com.aspose.drawing.RectangleF-com.aspose.drawing.RectangleF-}
```
public static RectangleF union(RectangleF a, RectangleF b)
```


Creates the smallest possible third rectangle that can contain both of two rectangles that form a union.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| a | [RectangleF](../../com.aspose.drawing/rectanglef) | First rectangle to union. |
| b | [RectangleF](../../com.aspose.drawing/rectanglef) | Second rectangle to union. |

**Returns:**
[RectangleF](../../com.aspose.drawing/rectanglef) - A third [RectangleF](../../com.aspose.drawing/rectanglef) structure that contains both of the two rectangles that form the union.
### isEquals(RectangleF obj1, RectangleF obj2) {#isEquals-com.aspose.drawing.RectangleF-com.aspose.drawing.RectangleF-}
```
public static boolean isEquals(RectangleF obj1, RectangleF obj2)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| obj1 | [RectangleF](../../com.aspose.drawing/rectanglef) |  |
| obj2 | [RectangleF](../../com.aspose.drawing/rectanglef) |  |

**Returns:**
boolean
### getEmpty() {#getEmpty--}
```
public static RectangleF getEmpty()
```




**Returns:**
[RectangleF](../../com.aspose.drawing/rectanglef)
### isEmpty() {#isEmpty--}
```
public final boolean isEmpty()
```


Gets a value indicating whether the `RectangleF.Width` or `RectangleF.Height` property of this [RectangleF](../../com.aspose.drawing/rectanglef) has a value of zero.

**Returns:**
boolean - This property returns true if the `RectangleF.Width` or `P:RectangleF.Height` property of this [RectangleF](../../com.aspose.drawing/rectanglef) has a value of zero; otherwise, false.
### getX() {#getX--}
```
public final float getX()
```


Gets the x-coordinate of the upper-left corner of this RectangleF structure.

**Returns:**
float - the x-coordinate of the upper-left corner of this RectangleF structure.
### setX(float value) {#setX-float-}
```
public final void setX(float value)
```


Sets the x-coordinate of the upper-left corner of this RectangleF structure.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | float | the x-coordinate of the upper-left corner of this RectangleF structure. |

### getY() {#getY--}
```
public final float getY()
```


Gets the x-coordinate of the upper-left corner of this RectangleF structure.

**Returns:**
float - the x-coordinate of the upper-left corner of this RectangleF structure.
### setY(float value) {#setY-float-}
```
public final void setY(float value)
```


Sets the x-coordinate of the upper-left corner of this RectangleF structure.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | float | the x-coordinate of the upper-left corner of this RectangleF structure. |

### getLocation() {#getLocation--}
```
public final PointF getLocation()
```


Gets the coordinates of the upper-left corner of this [RectangleF](../../com.aspose.drawing/rectanglef) structure.

**Returns:**
[PointF](../../com.aspose.drawing/pointf) - A [PointF](../../com.aspose.drawing/pointf) that represents the upper-left corner of this [RectangleF](../../com.aspose.drawing/rectanglef) structure.
### setLocation(PointF value) {#setLocation-com.aspose.drawing.PointF-}
```
public final void setLocation(PointF value)
```


Sets the coordinates of the upper-left corner of this [RectangleF](../../com.aspose.drawing/rectanglef) structure.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [PointF](../../com.aspose.drawing/pointf) | the coordinates of the upper-left corner of this [RectangleF](../../com.aspose.drawing/rectanglef) structure. |

### getWidth() {#getWidth--}
```
public final float getWidth()
```


Gets the width of this RectangleF structure.

**Returns:**
float - the width of this RectangleF structure.
### setWidth(float value) {#setWidth-float-}
```
public final void setWidth(float value)
```


Sets the width of this RectangleF structure.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | float | the width of this RectangleF structure. |

### getHeight() {#getHeight--}
```
public final float getHeight()
```


Gets the height of this RectangleF structure.

**Returns:**
float - the height of this RectangleF structure.
### setHeight(float value) {#setHeight-float-}
```
public final void setHeight(float value)
```


Sets the height of this RectangleF structure.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | float | the height of this RectangleF structure. |

### getSize() {#getSize--}
```
public final SizeF getSize()
```


Gets the size of this [RectangleF](../../com.aspose.drawing/rectanglef).

**Returns:**
[SizeF](../../com.aspose.drawing/sizef) - A [SizeF](../../com.aspose.drawing/sizef) that represents the width and height of this [RectangleF](../../com.aspose.drawing/rectanglef) structure.
### setSize(SizeF value) {#setSize-com.aspose.drawing.SizeF-}
```
public final void setSize(SizeF value)
```


Sets the size of this [RectangleF](../../com.aspose.drawing/rectanglef).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [SizeF](../../com.aspose.drawing/sizef) | the size of this [RectangleF](../../com.aspose.drawing/rectanglef). |

### getLeft() {#getLeft--}
```
public final float getLeft()
```


Gets the x-coordinate of the left edge of this RectangleF structure.

**Returns:**
float - the x-coordinate of the left edge of this RectangleF structure.
### getTop() {#getTop--}
```
public final float getTop()
```


Gets the y-coordinate of the top edge of this RectangleF structure.

**Returns:**
float - the y-coordinate of the top edge of this RectangleF structure.
### getRight() {#getRight--}
```
public final float getRight()
```


Gets the x-coordinate that is the sum of X and Width of this RectangleF structure.

**Returns:**
float - the x-coordinate that is the sum of X and Width of this RectangleF structure.
### getBottom() {#getBottom--}
```
public final float getBottom()
```


Gets the y-coordinate that is the sum of Y and Height of this RectangleF structure.

**Returns:**
float - the y-coordinate that is the sum of Y and Height of this RectangleF structure.
### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### inflate(float x, float y) {#inflate-float-float-}
```
public final void inflate(float x, float y)
```


Inflates this [RectangleF](../../com.aspose.drawing/rectanglef) structure by the specified amount.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| x | float | The amount to inflate this [RectangleF](../../com.aspose.drawing/rectanglef) structure horizontally. |
| y | float | The amount to inflate this [RectangleF](../../com.aspose.drawing/rectanglef) structure vertically. |

### inflate(SizeF size) {#inflate-com.aspose.drawing.SizeF-}
```
public final void inflate(SizeF size)
```


Inflates this [RectangleF](../../com.aspose.drawing/rectanglef) by the specified amount.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| size | [SizeF](../../com.aspose.drawing/sizef) | The amount to inflate this rectangle. |

### intersect(RectangleF rect) {#intersect-com.aspose.drawing.RectangleF-}
```
public final void intersect(RectangleF rect)
```


Replaces this [RectangleF](../../com.aspose.drawing/rectanglef) structure with the intersection of itself and the specified [RectangleF](../../com.aspose.drawing/rectanglef) structure.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| rect | [RectangleF](../../com.aspose.drawing/rectanglef) | The rectangle to intersect. |

### intersectsWith(RectangleF rect) {#intersectsWith-com.aspose.drawing.RectangleF-}
```
public final boolean intersectsWith(RectangleF rect)
```


Determines if this rectangle intersects with `rect`.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| rect | [RectangleF](../../com.aspose.drawing/rectanglef) | The rectangle to test. |

**Returns:**
boolean - This method returns true if there is any intersection.
### offset(PointF pos) {#offset-com.aspose.drawing.PointF-}
```
public final void offset(PointF pos)
```


Adjusts the location of this rectangle by the specified amount.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| pos | [PointF](../../com.aspose.drawing/pointf) | The amount to offset the location. |

### offset(float x, float y) {#offset-float-float-}
```
public final void offset(float x, float y)
```


Adjusts the location of this rectangle by the specified amount.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| x | float | The amount to offset the location horizontally. |
| y | float | The amount to offset the location vertically. |

### contains(float x, float y) {#contains-float-float-}
```
public final boolean contains(float x, float y)
```


Determines if the specified point is contained within this [RectangleF](../../com.aspose.drawing/rectanglef) structure.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| x | float | he x-coordinate of the point to test. |
| y | float | The y-coordinate of the point to test. |

**Returns:**
boolean - This method returns `true` if the point defined by x and y is contained within this [RectangleF](../../com.aspose.drawing/rectanglef) structure; otherwise `false`.
### contains(PointF pt) {#contains-com.aspose.drawing.PointF-}
```
public final boolean contains(PointF pt)
```


Determines if the specified point is contained within this [RectangleF](../../com.aspose.drawing/rectanglef) structure.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| pt | [PointF](../../com.aspose.drawing/pointf) | The [PointF](../../com.aspose.drawing/pointf) to test. |

**Returns:**
boolean - This method returns `true` if the point represented by the pt parameter is contained within this [RectangleF](../../com.aspose.drawing/rectanglef) structure; otherwise `false`.
### contains(RectangleF rect) {#contains-com.aspose.drawing.RectangleF-}
```
public final boolean contains(RectangleF rect)
```


Determines if the rectangular region represented by `rect` is entirely contained within this [RectangleF](../../com.aspose.drawing/rectanglef) structure.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| rect | [RectangleF](../../com.aspose.drawing/rectanglef) | The [RectangleF](../../com.aspose.drawing/rectanglef) to test. |

**Returns:**
boolean - This method returns `true` if the rectangular region represented by `rect` is entirely contained within the rectangular region represented by this [RectangleF](../../com.aspose.drawing/rectanglef); otherwise `false`.
### equals(Object obj) {#equals-java.lang.Object-}
```
public boolean equals(Object obj)
```


Determines whether the specified Object, is equal to this instance.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| obj | java.lang.Object | The Object to compare with this instance. |

**Returns:**
boolean - `true` if the specified Object is equal to this instance; otherwise, `false`.
### hashCode() {#hashCode--}
```
public int hashCode()
```


Returns a hash code for this instance.

**Returns:**
int - A hash code for this instance, suitable for use in hashing algorithms and data structures like a hash table.
### equals(RectangleF other) {#equals-com.aspose.drawing.RectangleF-}
```
public final boolean equals(RectangleF other)
```


Tests whether other [RectangleF](../../com.aspose.drawing/rectanglef) structure has the same location and size of this [RectangleF](../../com.aspose.drawing/rectanglef) structure.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| other | [RectangleF](../../com.aspose.drawing/rectanglef) | Other rectangle to test |

**Returns:**
boolean - This method returns `true` if other [RectangleF](../../com.aspose.drawing/rectanglef) structure and its X, Y, Width, and Height properties are equal to the corresponding properties of this [RectangleF](../../com.aspose.drawing/rectanglef) structure; otherwise, `false`.
### CloneTo(RectangleF that) {#CloneTo-com.aspose.drawing.RectangleF-}
```
public void CloneTo(RectangleF that)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| that | [RectangleF](../../com.aspose.drawing/rectanglef) |  |

### Clone() {#Clone--}
```
public RectangleF Clone()
```




**Returns:**
[RectangleF](../../com.aspose.drawing/rectanglef)
### clone() {#clone--}
```
public Object clone()
```




**Returns:**
java.lang.Object
