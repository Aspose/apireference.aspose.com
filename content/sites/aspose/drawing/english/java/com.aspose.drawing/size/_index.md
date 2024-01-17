---
title: Size
second_title: Aspose.Drawing for Java API Reference
description: Stores an ordered pair of integers typically the width and height of a rectangle.
type: docs
weight: 41
url: /java/com.aspose.drawing/size/
---
**Inheritance:**
java.lang.Object, com.aspose.ms.System.ValueType, com.aspose.ms.lang.Struct

**All Implemented Interfaces:**
com.aspose.ms.System.IEquatable, java.lang.Cloneable
```
public class Size extends Struct<Size> implements System.IEquatable<Size>, Cloneable
```

Stores an ordered pair of integers, typically the width and height of a rectangle.
## Constructors

| Constructor | Description |
| --- | --- |
| [Size()](#Size--) |  |
| [Size(Point pt)](#Size-com.aspose.drawing.Point-) | Initializes a new instance of the [Size](../../com.aspose.drawing/size) struct from the specified [Point](../../com.aspose.drawing/point). |
| [Size(int width, int height)](#Size-int-int-) | Initializes a new instance of the [Size](../../com.aspose.drawing/size) struct from the specified dimensions. |
## Methods

| Method | Description |
| --- | --- |
| [to_SizeF(Size p)](#to-SizeF-com.aspose.drawing.Size-) | Converts the specified [Size](../../com.aspose.drawing/size) to a [SizeF](../../com.aspose.drawing/sizef). |
| [op_Addition(Size sz1, Size sz2)](#op-Addition-com.aspose.drawing.Size-com.aspose.drawing.Size-) | Adds the width and height of one [Size](../../com.aspose.drawing/size) structure to the width and height of another [Size](../../com.aspose.drawing/size) structure. |
| [op_Subtraction(Size sz1, Size sz2)](#op-Subtraction-com.aspose.drawing.Size-com.aspose.drawing.Size-) | Subtracts the width and height of one [Size](../../com.aspose.drawing/size) structure from the width and height of another [Size](../../com.aspose.drawing/size) structure. |
| [op_Multiply(int left, Size right)](#op-Multiply-int-com.aspose.drawing.Size-) | Multiplies a [Size](../../com.aspose.drawing/size) by an `int` producing [Size](../../com.aspose.drawing/size). |
| [op_Multiply(Size left, int right)](#op-Multiply-com.aspose.drawing.Size-int-) | Multiplies [Size](../../com.aspose.drawing/size) by an `int` producing [Size](../../com.aspose.drawing/size). |
| [op_Division(Size left, int right)](#op-Division-com.aspose.drawing.Size-int-) | Divides [Size](../../com.aspose.drawing/size) by an `int` producing [Size](../../com.aspose.drawing/size). |
| [op_Multiply(float left, Size right)](#op-Multiply-float-com.aspose.drawing.Size-) | Multiplies [Size](../../com.aspose.drawing/size) by a `float` producing [SizeF](../../com.aspose.drawing/sizef). |
| [op_Multiply(Size left, float right)](#op-Multiply-com.aspose.drawing.Size-float-) | Multiplies [Size](../../com.aspose.drawing/size) by a `float` producing [SizeF](../../com.aspose.drawing/sizef). |
| [op_Division(Size left, float right)](#op-Division-com.aspose.drawing.Size-float-) | Divides [Size](../../com.aspose.drawing/size) by a `float` producing [SizeF](../../com.aspose.drawing/sizef). |
| [op_Equality(Size sz1, Size sz2)](#op-Equality-com.aspose.drawing.Size-com.aspose.drawing.Size-) | Tests whether two [Size](../../com.aspose.drawing/size) structures are equal. |
| [op_Inequality(Size sz1, Size sz2)](#op-Inequality-com.aspose.drawing.Size-com.aspose.drawing.Size-) | Tests whether two [Size](../../com.aspose.drawing/size) structures are different. |
| [to_Point(Size size)](#to-Point-com.aspose.drawing.Size-) | Converts the specified [Size](../../com.aspose.drawing/size) to a [Point](../../com.aspose.drawing/point). |
| [add(Size sz1, Size sz2)](#add-com.aspose.drawing.Size-com.aspose.drawing.Size-) | Adds the width and height of one [Size](../../com.aspose.drawing/size) structure to the width and height of another [Size](../../com.aspose.drawing/size) structure. |
| [ceiling(SizeF value)](#ceiling-com.aspose.drawing.SizeF-) | Converts the specified [SizeF](../../com.aspose.drawing/sizef) structure to a [Size](../../com.aspose.drawing/size) structure by rounding the values of the [Size](../../com.aspose.drawing/size) structure to the next higher integer values. |
| [subtract(Size sz1, Size sz2)](#subtract-com.aspose.drawing.Size-com.aspose.drawing.Size-) | Subtracts the width and height of one [Size](../../com.aspose.drawing/size) structure from the width and height of another [Size](../../com.aspose.drawing/size) structure. |
| [truncate(SizeF value)](#truncate-com.aspose.drawing.SizeF-) | Converts the specified [SizeF](../../com.aspose.drawing/sizef) structure to a [Size](../../com.aspose.drawing/size) structure by truncating the values of the [SizeF](../../com.aspose.drawing/sizef) structure to the next lower integer values. |
| [round(SizeF value)](#round-com.aspose.drawing.SizeF-) | Converts the specified [SizeF](../../com.aspose.drawing/sizef) structure to a [Size](../../com.aspose.drawing/size) structure by rounding the values of the [SizeF](../../com.aspose.drawing/sizef) structure to the nearest integer values. |
| [isEquals(Size obj1, Size obj2)](#isEquals-com.aspose.drawing.Size-com.aspose.drawing.Size-) |  |
| [getEmpty()](#getEmpty--) |  |
| [isEmpty()](#isEmpty--) | Gets a value indicating whether this [Size](../../com.aspose.drawing/size) has width and height of 0. |
| [getWidth()](#getWidth--) | Gets the horizontal component of this [Size](../../com.aspose.drawing/size). |
| [setWidth(int value)](#setWidth-int-) | Sets the horizontal component of this [Size](../../com.aspose.drawing/size). |
| [getHeight()](#getHeight--) | Gets the vertical component of this [Size](../../com.aspose.drawing/size). |
| [setHeight(int value)](#setHeight-int-) | Sets the vertical component of this [Size](../../com.aspose.drawing/size). |
| [equals(Object obj)](#equals-java.lang.Object-) | Tests to see whether the specified object is a [Size](../../com.aspose.drawing/size) with the same dimensions as this [Size](../../com.aspose.drawing/size). |
| [hashCode()](#hashCode--) | Returns a hash code for this [Size](../../com.aspose.drawing/size) structure. |
| [toString()](#toString--) |  |
| [equals(Size other)](#equals-com.aspose.drawing.Size-) | Tests whether other [Size](../../com.aspose.drawing/size) structure has the same size of this [Size](../../com.aspose.drawing/size) structure. |
| [CloneTo(Size that)](#CloneTo-com.aspose.drawing.Size-) |  |
| [Clone()](#Clone--) |  |
| [clone()](#clone--) |  |
### Size() {#Size--}
```
public Size()
```


### Size(Point pt) {#Size-com.aspose.drawing.Point-}
```
public Size(Point pt)
```


Initializes a new instance of the [Size](../../com.aspose.drawing/size) struct from the specified [Point](../../com.aspose.drawing/point).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| pt | [Point](../../com.aspose.drawing/point) | The [Point](../../com.aspose.drawing/point) from which to initialize this [Size](../../com.aspose.drawing/size). |

### Size(int width, int height) {#Size-int-int-}
```
public Size(int width, int height)
```


Initializes a new instance of the [Size](../../com.aspose.drawing/size) struct from the specified dimensions.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| width | int | The width component of the new [Size](../../com.aspose.drawing/size). |
| height | int | The height component of the new [Size](../../com.aspose.drawing/size). |

### to_SizeF(Size p) {#to-SizeF-com.aspose.drawing.Size-}
```
public static SizeF to_SizeF(Size p)
```


Converts the specified [Size](../../com.aspose.drawing/size) to a [SizeF](../../com.aspose.drawing/sizef).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| p | [Size](../../com.aspose.drawing/size) | The [Size](../../com.aspose.drawing/size) to convert. |

**Returns:**
[SizeF](../../com.aspose.drawing/sizef) - The [SizeF](../../com.aspose.drawing/sizef) structure to which this operator converts.
### op_Addition(Size sz1, Size sz2) {#op-Addition-com.aspose.drawing.Size-com.aspose.drawing.Size-}
```
public static Size op_Addition(Size sz1, Size sz2)
```


Adds the width and height of one [Size](../../com.aspose.drawing/size) structure to the width and height of another [Size](../../com.aspose.drawing/size) structure.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| sz1 | [Size](../../com.aspose.drawing/size) | The first [Size](../../com.aspose.drawing/size) to add. |
| sz2 | [Size](../../com.aspose.drawing/size) | The second [Size](../../com.aspose.drawing/size) to add. |

**Returns:**
[Size](../../com.aspose.drawing/size) - A [Size](../../com.aspose.drawing/size) structure that is the result of the addition operation.
### op_Subtraction(Size sz1, Size sz2) {#op-Subtraction-com.aspose.drawing.Size-com.aspose.drawing.Size-}
```
public static Size op_Subtraction(Size sz1, Size sz2)
```


Subtracts the width and height of one [Size](../../com.aspose.drawing/size) structure from the width and height of another [Size](../../com.aspose.drawing/size) structure.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| sz1 | [Size](../../com.aspose.drawing/size) | The [Size](../../com.aspose.drawing/size) structure on the left side of the subtraction operator. |
| sz2 | [Size](../../com.aspose.drawing/size) | The [Size](../../com.aspose.drawing/size) structure on the right side of the subtraction operator. |

**Returns:**
[Size](../../com.aspose.drawing/size) - A [Size](../../com.aspose.drawing/size) structure that is the result of the subtraction operation.
### op_Multiply(int left, Size right) {#op-Multiply-int-com.aspose.drawing.Size-}
```
public static Size op_Multiply(int left, Size right)
```


Multiplies a [Size](../../com.aspose.drawing/size) by an `int` producing [Size](../../com.aspose.drawing/size).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| left | int | Multiplier of type `int`. |
| right | [Size](../../com.aspose.drawing/size) | Multiplicand of type [Size](../../com.aspose.drawing/size). |

**Returns:**
[Size](../../com.aspose.drawing/size) - Product of type [Size](../../com.aspose.drawing/size).
### op_Multiply(Size left, int right) {#op-Multiply-com.aspose.drawing.Size-int-}
```
public static Size op_Multiply(Size left, int right)
```


Multiplies [Size](../../com.aspose.drawing/size) by an `int` producing [Size](../../com.aspose.drawing/size).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| left | [Size](../../com.aspose.drawing/size) | Multiplicand of type [Size](../../com.aspose.drawing/size). |
| right | int | Multiplier of type `int`. |

**Returns:**
[Size](../../com.aspose.drawing/size) - Product of type [Size](../../com.aspose.drawing/size).
### op_Division(Size left, int right) {#op-Division-com.aspose.drawing.Size-int-}
```
public static Size op_Division(Size left, int right)
```


Divides [Size](../../com.aspose.drawing/size) by an `int` producing [Size](../../com.aspose.drawing/size).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| left | [Size](../../com.aspose.drawing/size) | Dividend of type [Size](../../com.aspose.drawing/size). |
| right | int | Divisor of type `int`. |

**Returns:**
[Size](../../com.aspose.drawing/size) - Result of type [Size](../../com.aspose.drawing/size).
### op_Multiply(float left, Size right) {#op-Multiply-float-com.aspose.drawing.Size-}
```
public static SizeF op_Multiply(float left, Size right)
```


Multiplies [Size](../../com.aspose.drawing/size) by a `float` producing [SizeF](../../com.aspose.drawing/sizef).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| left | float | Multiplier of type `float`. |
| right | [Size](../../com.aspose.drawing/size) | Multiplicand of type [Size](../../com.aspose.drawing/size). |

**Returns:**
[SizeF](../../com.aspose.drawing/sizef) - Product of type [SizeF](../../com.aspose.drawing/sizef).
### op_Multiply(Size left, float right) {#op-Multiply-com.aspose.drawing.Size-float-}
```
public static SizeF op_Multiply(Size left, float right)
```


Multiplies [Size](../../com.aspose.drawing/size) by a `float` producing [SizeF](../../com.aspose.drawing/sizef).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| left | [Size](../../com.aspose.drawing/size) | Multiplicand of type [Size](../../com.aspose.drawing/size). |
| right | float | Multiplier of type `float`. |

**Returns:**
[SizeF](../../com.aspose.drawing/sizef) - Product of type [SizeF](../../com.aspose.drawing/sizef).
### op_Division(Size left, float right) {#op-Division-com.aspose.drawing.Size-float-}
```
public static SizeF op_Division(Size left, float right)
```


Divides [Size](../../com.aspose.drawing/size) by a `float` producing [SizeF](../../com.aspose.drawing/sizef).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| left | [Size](../../com.aspose.drawing/size) | Dividend of type [Size](../../com.aspose.drawing/size). |
| right | float | Divisor of type `int`. |

**Returns:**
[SizeF](../../com.aspose.drawing/sizef) - Result of type [SizeF](../../com.aspose.drawing/sizef).
### op_Equality(Size sz1, Size sz2) {#op-Equality-com.aspose.drawing.Size-com.aspose.drawing.Size-}
```
public static boolean op_Equality(Size sz1, Size sz2)
```


Tests whether two [Size](../../com.aspose.drawing/size) structures are equal.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| sz1 | [Size](../../com.aspose.drawing/size) | The [Size](../../com.aspose.drawing/size) structure on the left side of the equality operator. |
| sz2 | [Size](../../com.aspose.drawing/size) | The [Size](../../com.aspose.drawing/size) structure on the right of the equality operator. |

**Returns:**
boolean - true if `sz1` and `sz2` have equal width and height; otherwise, false.
### op_Inequality(Size sz1, Size sz2) {#op-Inequality-com.aspose.drawing.Size-com.aspose.drawing.Size-}
```
public static boolean op_Inequality(Size sz1, Size sz2)
```


Tests whether two [Size](../../com.aspose.drawing/size) structures are different.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| sz1 | [Size](../../com.aspose.drawing/size) | The [Size](../../com.aspose.drawing/size) structure on the left of the inequality operator. |
| sz2 | [Size](../../com.aspose.drawing/size) | The [Size](../../com.aspose.drawing/size) structure on the right of the inequality operator. |

**Returns:**
boolean - true if `sz1` and `sz2` differ either in width or height; false if `sz1` and `sz2` are equal.
### to_Point(Size size) {#to-Point-com.aspose.drawing.Size-}
```
public static Point to_Point(Size size)
```


Converts the specified [Size](../../com.aspose.drawing/size) to a [Point](../../com.aspose.drawing/point).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| size | [Size](../../com.aspose.drawing/size) | The [Size](../../com.aspose.drawing/size) to convert. |

**Returns:**
[Point](../../com.aspose.drawing/point) - The [Point](../../com.aspose.drawing/point) structure to which this operator converts.
### add(Size sz1, Size sz2) {#add-com.aspose.drawing.Size-com.aspose.drawing.Size-}
```
public static Size add(Size sz1, Size sz2)
```


Adds the width and height of one [Size](../../com.aspose.drawing/size) structure to the width and height of another [Size](../../com.aspose.drawing/size) structure.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| sz1 | [Size](../../com.aspose.drawing/size) | The first [Size](../../com.aspose.drawing/size) to add. |
| sz2 | [Size](../../com.aspose.drawing/size) | The second [Size](../../com.aspose.drawing/size) to add. |

**Returns:**
[Size](../../com.aspose.drawing/size) - A [Size](../../com.aspose.drawing/size) structure that is the result of the addition operation.
### ceiling(SizeF value) {#ceiling-com.aspose.drawing.SizeF-}
```
public static Size ceiling(SizeF value)
```


Converts the specified [SizeF](../../com.aspose.drawing/sizef) structure to a [Size](../../com.aspose.drawing/size) structure by rounding the values of the [Size](../../com.aspose.drawing/size) structure to the next higher integer values.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [SizeF](../../com.aspose.drawing/sizef) | The [SizeF](../../com.aspose.drawing/sizef) structure to convert. |

**Returns:**
[Size](../../com.aspose.drawing/size) - The [Size](../../com.aspose.drawing/size) structure this method converts to.
### subtract(Size sz1, Size sz2) {#subtract-com.aspose.drawing.Size-com.aspose.drawing.Size-}
```
public static Size subtract(Size sz1, Size sz2)
```


Subtracts the width and height of one [Size](../../com.aspose.drawing/size) structure from the width and height of another [Size](../../com.aspose.drawing/size) structure.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| sz1 | [Size](../../com.aspose.drawing/size) | The [Size](../../com.aspose.drawing/size) structure on the left side of the subtraction operator. |
| sz2 | [Size](../../com.aspose.drawing/size) | The [Size](../../com.aspose.drawing/size) structure on the right side of the subtraction operator. |

**Returns:**
[Size](../../com.aspose.drawing/size) - The [Size](../../com.aspose.drawing/size) that is a result of the subtraction operation.
### truncate(SizeF value) {#truncate-com.aspose.drawing.SizeF-}
```
public static Size truncate(SizeF value)
```


Converts the specified [SizeF](../../com.aspose.drawing/sizef) structure to a [Size](../../com.aspose.drawing/size) structure by truncating the values of the [SizeF](../../com.aspose.drawing/sizef) structure to the next lower integer values.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [SizeF](../../com.aspose.drawing/sizef) | The [SizeF](../../com.aspose.drawing/sizef) structure to convert. |

**Returns:**
[Size](../../com.aspose.drawing/size) - The [Size](../../com.aspose.drawing/size) structure this method converts to.
### round(SizeF value) {#round-com.aspose.drawing.SizeF-}
```
public static Size round(SizeF value)
```


Converts the specified [SizeF](../../com.aspose.drawing/sizef) structure to a [Size](../../com.aspose.drawing/size) structure by rounding the values of the [SizeF](../../com.aspose.drawing/sizef) structure to the nearest integer values.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [SizeF](../../com.aspose.drawing/sizef) | The [SizeF](../../com.aspose.drawing/sizef) structure to convert. |

**Returns:**
[Size](../../com.aspose.drawing/size) - The [Size](../../com.aspose.drawing/size) structure this method converts to.
### isEquals(Size obj1, Size obj2) {#isEquals-com.aspose.drawing.Size-com.aspose.drawing.Size-}
```
public static boolean isEquals(Size obj1, Size obj2)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| obj1 | [Size](../../com.aspose.drawing/size) |  |
| obj2 | [Size](../../com.aspose.drawing/size) |  |

**Returns:**
boolean
### getEmpty() {#getEmpty--}
```
public static Size getEmpty()
```




**Returns:**
[Size](../../com.aspose.drawing/size)
### isEmpty() {#isEmpty--}
```
public final boolean isEmpty()
```


Gets a value indicating whether this [Size](../../com.aspose.drawing/size) has width and height of 0.

**Returns:**
boolean - a value indicating whether this [Size](../../com.aspose.drawing/size) has width and height of 0.
### getWidth() {#getWidth--}
```
public final int getWidth()
```


Gets the horizontal component of this [Size](../../com.aspose.drawing/size).

**Returns:**
int - the horizontal component of this [Size](../../com.aspose.drawing/size).
### setWidth(int value) {#setWidth-int-}
```
public final void setWidth(int value)
```


Sets the horizontal component of this [Size](../../com.aspose.drawing/size).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | the horizontal component of this [Size](../../com.aspose.drawing/size). |

### getHeight() {#getHeight--}
```
public final int getHeight()
```


Gets the vertical component of this [Size](../../com.aspose.drawing/size).

**Returns:**
int - the vertical component of this [Size](../../com.aspose.drawing/size).
### setHeight(int value) {#setHeight-int-}
```
public final void setHeight(int value)
```


Sets the vertical component of this [Size](../../com.aspose.drawing/size).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | the vertical component of this [Size](../../com.aspose.drawing/size). |

### equals(Object obj) {#equals-java.lang.Object-}
```
public boolean equals(Object obj)
```


Tests to see whether the specified object is a [Size](../../com.aspose.drawing/size) with the same dimensions as this [Size](../../com.aspose.drawing/size).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| obj | java.lang.Object | The Object to test. |

**Returns:**
boolean - true if `obj` is a [Size](../../com.aspose.drawing/size) and has the same width and height as this [Size](../../com.aspose.drawing/size); otherwise, false.
### hashCode() {#hashCode--}
```
public int hashCode()
```


Returns a hash code for this [Size](../../com.aspose.drawing/size) structure.

**Returns:**
int - An integer value that specifies a hash value for this [Size](../../com.aspose.drawing/size) structure.
### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### equals(Size other) {#equals-com.aspose.drawing.Size-}
```
public final boolean equals(Size other)
```


Tests whether other [Size](../../com.aspose.drawing/size) structure has the same size of this [Size](../../com.aspose.drawing/size) structure.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| other | [Size](../../com.aspose.drawing/size) | Other size to test |

**Returns:**
boolean - This method returns `true` if other [Size](../../com.aspose.drawing/size) structure and its Width and Height properties are equal to the corresponding properties of this [Size](../../com.aspose.drawing/size) structure; otherwise, `false`.
### CloneTo(Size that) {#CloneTo-com.aspose.drawing.Size-}
```
public void CloneTo(Size that)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| that | [Size](../../com.aspose.drawing/size) |  |

### Clone() {#Clone--}
```
public Size Clone()
```




**Returns:**
[Size](../../com.aspose.drawing/size)
### clone() {#clone--}
```
public Size clone()
```




**Returns:**
[Size](../../com.aspose.drawing/size)
