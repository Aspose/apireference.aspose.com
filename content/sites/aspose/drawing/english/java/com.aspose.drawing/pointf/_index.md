---
title: PointF
second_title: Aspose.Drawing for Java API Reference
description: Represents an ordered pair of floating-point x- and y-coordinates that defines a point in a two-dimensional plane.
type: docs
weight: 37
url: /java/com.aspose.drawing/pointf/
---
**Inheritance:**
java.lang.Object, com.aspose.ms.System.ValueType, com.aspose.ms.lang.Struct

**All Implemented Interfaces:**
com.aspose.ms.System.IEquatable, java.lang.Cloneable
```
public class PointF extends Struct<PointF> implements System.IEquatable<PointF>, Cloneable
```

Represents an ordered pair of floating-point x- and y-coordinates that defines a point in a two-dimensional plane.
## Constructors

| Constructor | Description |
| --- | --- |
| [PointF()](#PointF--) |  |
| [PointF(float x, float y)](#PointF-float-float-) | Initializes a new instance of the PointF structure with the specified coordinates. |
## Methods

| Method | Description |
| --- | --- |
| [op_Addition(PointF pt, Size sz)](#op-Addition-com.aspose.drawing.PointF-com.aspose.drawing.Size-) |  |
| [op_Subtraction(PointF pt, Size sz)](#op-Subtraction-com.aspose.drawing.PointF-com.aspose.drawing.Size-) |  |
| [op_Addition(PointF pt, SizeF sz)](#op-Addition-com.aspose.drawing.PointF-com.aspose.drawing.SizeF-) |  |
| [op_Subtraction(PointF pt, SizeF sz)](#op-Subtraction-com.aspose.drawing.PointF-com.aspose.drawing.SizeF-) |  |
| [op_Equality(PointF left, PointF right)](#op-Equality-com.aspose.drawing.PointF-com.aspose.drawing.PointF-) | Compares two [PointF](../../com.aspose.drawing/pointf) structures. |
| [op_Inequality(PointF left, PointF right)](#op-Inequality-com.aspose.drawing.PointF-com.aspose.drawing.PointF-) | Determines whether the coordinates of the specified points are not equal. |
| [add(PointF orig, Size size)](#add-com.aspose.drawing.PointF-com.aspose.drawing.Size-) | Translates a given [PointF](../../com.aspose.drawing/pointf) by a specified [SizeF](../../com.aspose.drawing/sizef). |
| [subtract(PointF pt, Size sz)](#subtract-com.aspose.drawing.PointF-com.aspose.drawing.Size-) |  |
| [add(PointF orig, SizeF sizeF)](#add-com.aspose.drawing.PointF-com.aspose.drawing.SizeF-) | Translates a given [PointF](../../com.aspose.drawing/pointf) by a specified [SizeF](../../com.aspose.drawing/sizef). |
| [subtract(PointF pt, SizeF sz)](#subtract-com.aspose.drawing.PointF-com.aspose.drawing.SizeF-) |  |
| [isEquals(PointF obj1, PointF obj2)](#isEquals-com.aspose.drawing.PointF-com.aspose.drawing.PointF-) |  |
| [getEmpty()](#getEmpty--) |  |
| [isEmpty()](#isEmpty--) | Gets a value indicating whether this [PointF](../../com.aspose.drawing/pointf) is empty. |
| [getX()](#getX--) | Gets the x-coordinate of this PointF. |
| [setX(float value)](#setX-float-) | Sets the x-coordinate of this PointF. |
| [getY()](#getY--) | Gets the y-coordinate of this PointF. |
| [setY(float value)](#setY-float-) | Sets the y-coordinate of this PointF. |
| [equals(Object obj)](#equals-java.lang.Object-) | Specifies whether this [PointF](../../com.aspose.drawing/pointf) contains the same coordinates as the specified Object. |
| [hashCode()](#hashCode--) | Returns a hash code for this instance. |
| [toString()](#toString--) |  |
| [equals(PointF other)](#equals-com.aspose.drawing.PointF-) | Tests whether other [PointF](../../com.aspose.drawing/pointf) structure has the same location of this [PointF](../../com.aspose.drawing/pointf) structure. |
| [CloneTo(PointF that)](#CloneTo-com.aspose.drawing.PointF-) |  |
| [Clone()](#Clone--) |  |
| [clone()](#clone--) |  |
### PointF() {#PointF--}
```
public PointF()
```


### PointF(float x, float y) {#PointF-float-float-}
```
public PointF(float x, float y)
```


Initializes a new instance of the PointF structure with the specified coordinates.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| x | float | The horizontal position of the point. |
| y | float | The vertical position of the point. |

### op_Addition(PointF pt, Size sz) {#op-Addition-com.aspose.drawing.PointF-com.aspose.drawing.Size-}
```
public static PointF op_Addition(PointF pt, Size sz)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| pt | [PointF](../../com.aspose.drawing/pointf) |  |
| sz | [Size](../../com.aspose.drawing/size) |  |

**Returns:**
[PointF](../../com.aspose.drawing/pointf)
### op_Subtraction(PointF pt, Size sz) {#op-Subtraction-com.aspose.drawing.PointF-com.aspose.drawing.Size-}
```
public static PointF op_Subtraction(PointF pt, Size sz)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| pt | [PointF](../../com.aspose.drawing/pointf) |  |
| sz | [Size](../../com.aspose.drawing/size) |  |

**Returns:**
[PointF](../../com.aspose.drawing/pointf)
### op_Addition(PointF pt, SizeF sz) {#op-Addition-com.aspose.drawing.PointF-com.aspose.drawing.SizeF-}
```
public static PointF op_Addition(PointF pt, SizeF sz)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| pt | [PointF](../../com.aspose.drawing/pointf) |  |
| sz | [SizeF](../../com.aspose.drawing/sizef) |  |

**Returns:**
[PointF](../../com.aspose.drawing/pointf)
### op_Subtraction(PointF pt, SizeF sz) {#op-Subtraction-com.aspose.drawing.PointF-com.aspose.drawing.SizeF-}
```
public static PointF op_Subtraction(PointF pt, SizeF sz)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| pt | [PointF](../../com.aspose.drawing/pointf) |  |
| sz | [SizeF](../../com.aspose.drawing/sizef) |  |

**Returns:**
[PointF](../../com.aspose.drawing/pointf)
### op_Equality(PointF left, PointF right) {#op-Equality-com.aspose.drawing.PointF-com.aspose.drawing.PointF-}
```
public static boolean op_Equality(PointF left, PointF right)
```


Compares two [PointF](../../com.aspose.drawing/pointf) structures. The result specifies whether the values of the `PointF.X` and `PointF.Y` properties of the two [PointF](../../com.aspose.drawing/pointf) structures are equal.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| left | [PointF](../../com.aspose.drawing/pointf) | First [PointF](../../com.aspose.drawing/pointf) to compare. |
| right | [PointF](../../com.aspose.drawing/pointf) | Second [PointF](../../com.aspose.drawing/pointf) to compare. |

**Returns:**
boolean - true if the `PointF.X` and `PointF.Y` values of the left and right [PointF](../../com.aspose.drawing/pointf) structures are equal; otherwise, false.
### op_Inequality(PointF left, PointF right) {#op-Inequality-com.aspose.drawing.PointF-com.aspose.drawing.PointF-}
```
public static boolean op_Inequality(PointF left, PointF right)
```


Determines whether the coordinates of the specified points are not equal.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| left | [PointF](../../com.aspose.drawing/pointf) | First [PointF](../../com.aspose.drawing/pointf) to compare. |
| right | [PointF](../../com.aspose.drawing/pointf) | Second [PointF](../../com.aspose.drawing/pointf) to compare. |

**Returns:**
boolean - true to indicate the `PointF.X` and `PointF.Y` values of `left` and `right` are not equal; otherwise, false.
### add(PointF orig, Size size) {#add-com.aspose.drawing.PointF-com.aspose.drawing.Size-}
```
public static PointF add(PointF orig, Size size)
```


Translates a given [PointF](../../com.aspose.drawing/pointf) by a specified [SizeF](../../com.aspose.drawing/sizef).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| orig | [PointF](../../com.aspose.drawing/pointf) | The [PointF](../../com.aspose.drawing/pointf) to translate. |
| size | [Size](../../com.aspose.drawing/size) | The [Size](../../com.aspose.drawing/size) that specifies the numbers to add to the coordinates of `orig`. |

**Returns:**
[PointF](../../com.aspose.drawing/pointf) - The translated [PointF](../../com.aspose.drawing/pointf).
### subtract(PointF pt, Size sz) {#subtract-com.aspose.drawing.PointF-com.aspose.drawing.Size-}
```
public static PointF subtract(PointF pt, Size sz)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| pt | [PointF](../../com.aspose.drawing/pointf) |  |
| sz | [Size](../../com.aspose.drawing/size) |  |

**Returns:**
[PointF](../../com.aspose.drawing/pointf)
### add(PointF orig, SizeF sizeF) {#add-com.aspose.drawing.PointF-com.aspose.drawing.SizeF-}
```
public static PointF add(PointF orig, SizeF sizeF)
```


Translates a given [PointF](../../com.aspose.drawing/pointf) by a specified [SizeF](../../com.aspose.drawing/sizef).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| orig | [PointF](../../com.aspose.drawing/pointf) | The [PointF](../../com.aspose.drawing/pointf) to translate. |
| sizeF | [SizeF](../../com.aspose.drawing/sizef) | The [SizeF](../../com.aspose.drawing/sizef) that specifies the numbers to add to the coordinates of `orig`. |

**Returns:**
[PointF](../../com.aspose.drawing/pointf) - The translated [PointF](../../com.aspose.drawing/pointf).
### subtract(PointF pt, SizeF sz) {#subtract-com.aspose.drawing.PointF-com.aspose.drawing.SizeF-}
```
public static PointF subtract(PointF pt, SizeF sz)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| pt | [PointF](../../com.aspose.drawing/pointf) |  |
| sz | [SizeF](../../com.aspose.drawing/sizef) |  |

**Returns:**
[PointF](../../com.aspose.drawing/pointf)
### isEquals(PointF obj1, PointF obj2) {#isEquals-com.aspose.drawing.PointF-com.aspose.drawing.PointF-}
```
public static boolean isEquals(PointF obj1, PointF obj2)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| obj1 | [PointF](../../com.aspose.drawing/pointf) |  |
| obj2 | [PointF](../../com.aspose.drawing/pointf) |  |

**Returns:**
boolean
### getEmpty() {#getEmpty--}
```
public static PointF getEmpty()
```




**Returns:**
[PointF](../../com.aspose.drawing/pointf)
### isEmpty() {#isEmpty--}
```
public final boolean isEmpty()
```


Gets a value indicating whether this [PointF](../../com.aspose.drawing/pointf) is empty.

**Returns:**
boolean - a value indicating whether this [PointF](../../com.aspose.drawing/pointf) is empty.
### getX() {#getX--}
```
public final float getX()
```


Gets the x-coordinate of this PointF.

**Returns:**
float - the x-coordinate of this PointF.
### setX(float value) {#setX-float-}
```
public final void setX(float value)
```


Sets the x-coordinate of this PointF.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | float | the x-coordinate of this PointF. |

### getY() {#getY--}
```
public final float getY()
```


Gets the y-coordinate of this PointF.

**Returns:**
float - the y-coordinate of this PointF.
### setY(float value) {#setY-float-}
```
public final void setY(float value)
```


Sets the y-coordinate of this PointF.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | float | the y-coordinate of this PointF. |

### equals(Object obj) {#equals-java.lang.Object-}
```
public boolean equals(Object obj)
```


Specifies whether this [PointF](../../com.aspose.drawing/pointf) contains the same coordinates as the specified Object.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| obj | java.lang.Object | The Object to test. |

**Returns:**
boolean - This method returns true if `obj` is a [PointF](../../com.aspose.drawing/pointf) and has the same coordinates as this [Point](../../com.aspose.drawing/point).
### hashCode() {#hashCode--}
```
public int hashCode()
```


Returns a hash code for this instance.

**Returns:**
int - A hash code for this instance, suitable for use in hashing algorithms and data structures like a hash table.
### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### equals(PointF other) {#equals-com.aspose.drawing.PointF-}
```
public final boolean equals(PointF other)
```


Tests whether other [PointF](../../com.aspose.drawing/pointf) structure has the same location of this [PointF](../../com.aspose.drawing/pointf) structure.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| other | [PointF](../../com.aspose.drawing/pointf) | Other point to test |

**Returns:**
boolean - This method returns `true` if other [PointF](../../com.aspose.drawing/pointf) structure and its X and Y properties are equal to the corresponding properties of this [PointF](../../com.aspose.drawing/pointf) structure; otherwise, `false`.
### CloneTo(PointF that) {#CloneTo-com.aspose.drawing.PointF-}
```
public void CloneTo(PointF that)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| that | [PointF](../../com.aspose.drawing/pointf) |  |

### Clone() {#Clone--}
```
public PointF Clone()
```




**Returns:**
[PointF](../../com.aspose.drawing/pointf)
### clone() {#clone--}
```
public Object clone()
```




**Returns:**
java.lang.Object
