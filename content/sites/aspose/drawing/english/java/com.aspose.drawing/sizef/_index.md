---
title: SizeF
second_title: Aspose.Drawing for Java API Reference
description: Stores an ordered pair of floating-point numbers typically the width and height of a rectangle.
type: docs
weight: 42
url: /java/com.aspose.drawing/sizef/
---
**Inheritance:**
java.lang.Object, com.aspose.ms.System.ValueType, com.aspose.ms.lang.Struct

**All Implemented Interfaces:**
com.aspose.ms.System.IEquatable, java.lang.Cloneable
```
public class SizeF extends Struct<SizeF> implements System.IEquatable<SizeF>, Cloneable
```

Stores an ordered pair of floating-point numbers, typically the width and height of a rectangle.
## Constructors

| Constructor | Description |
| --- | --- |
| [SizeF()](#SizeF--) |  |
| [SizeF(float width, float height)](#SizeF-float-float-) | Initializes a new instance of the SizeF structure from the specified dimensions. |
| [SizeF(PointF pt)](#SizeF-com.aspose.drawing.PointF-) | Initializes a new instance of the [SizeF](../../com.aspose.drawing/sizef) struct. |
| [SizeF(SizeF size)](#SizeF-com.aspose.drawing.SizeF-) | Initializes a new instance of the [SizeF](../../com.aspose.drawing/sizef) struct. |
## Methods

| Method | Description |
| --- | --- |
| [op_Equality(SizeF sz1, SizeF sz2)](#op-Equality-com.aspose.drawing.SizeF-com.aspose.drawing.SizeF-) | Tests whether two [SizeF](../../com.aspose.drawing/sizef) structures are equal. |
| [op_Inequality(SizeF sz1, SizeF sz2)](#op-Inequality-com.aspose.drawing.SizeF-com.aspose.drawing.SizeF-) | Tests whether two [SizeF](../../com.aspose.drawing/sizef) structures are different. |
| [add(SizeF sz1, SizeF sz2)](#add-com.aspose.drawing.SizeF-com.aspose.drawing.SizeF-) | Adds the width and height of one [SizeF](../../com.aspose.drawing/sizef) structure to the width and height of another [SizeF](../../com.aspose.drawing/sizef) structure. |
| [subtract(SizeF sz1, SizeF sz2)](#subtract-com.aspose.drawing.SizeF-com.aspose.drawing.SizeF-) | Subtracts the width and height of one [SizeF](../../com.aspose.drawing/sizef) structure from the width and height of another [SizeF](../../com.aspose.drawing/sizef) structure. |
| [op_Addition(SizeF sz1, SizeF sz2)](#op-Addition-com.aspose.drawing.SizeF-com.aspose.drawing.SizeF-) | Adds the width and height of one [SizeF](../../com.aspose.drawing/sizef) structure to the width and height of another [SizeF](../../com.aspose.drawing/sizef) structure. |
| [op_Subtraction(SizeF sz1, SizeF sz2)](#op-Subtraction-com.aspose.drawing.SizeF-com.aspose.drawing.SizeF-) | Subtracts the width and height of one [SizeF](../../com.aspose.drawing/sizef) structure from the width and height of another [SizeF](../../com.aspose.drawing/sizef) structure. |
| [op_Multiply(float left, SizeF right)](#op-Multiply-float-com.aspose.drawing.SizeF-) | Multiplies [SizeF](../../com.aspose.drawing/sizef) by a `float` producing [SizeF](../../com.aspose.drawing/sizef). |
| [op_Multiply(SizeF left, float right)](#op-Multiply-com.aspose.drawing.SizeF-float-) | Multiplies [SizeF](../../com.aspose.drawing/sizef) by a `float` producing [SizeF](../../com.aspose.drawing/sizef). |
| [op_Division(SizeF left, float right)](#op-Division-com.aspose.drawing.SizeF-float-) | Divides [SizeF](../../com.aspose.drawing/sizef) by a `float` producing [SizeF](../../com.aspose.drawing/sizef). |
| [to_PointF(SizeF size)](#to-PointF-com.aspose.drawing.SizeF-) |  |
| [isEquals(SizeF obj1, SizeF obj2)](#isEquals-com.aspose.drawing.SizeF-com.aspose.drawing.SizeF-) |  |
| [getEmpty()](#getEmpty--) |  |
| [isEmpty()](#isEmpty--) | Gets a value indicating whether this [SizeF](../../com.aspose.drawing/sizef) structure has zero width and height. |
| [getWidth()](#getWidth--) | Gets the horizontal component of this SizeF structure. |
| [setWidth(float value)](#setWidth-float-) | Sets the horizontal component of this SizeF structure. |
| [getHeight()](#getHeight--) | Gets the vertical component of this SizeF structure. |
| [setHeight(float value)](#setHeight-float-) | Sets the vertical component of this SizeF structure. |
| [hashCode()](#hashCode--) | Returns a hash code for this [SizeF](../../com.aspose.drawing/sizef) structure. |
| [toString()](#toString--) |  |
| [equals(Object obj)](#equals-java.lang.Object-) | Tests to see whether the specified object is a [SizeF](../../com.aspose.drawing/sizef) structure with the same dimensions as this [SizeF](../../com.aspose.drawing/sizef) structure. |
| [toSize()](#toSize--) | Converts a [SizeF](../../com.aspose.drawing/sizef) structure to a [Size](../../com.aspose.drawing/size) structure. |
| [toPointF()](#toPointF--) | Converts a [SizeF](../../com.aspose.drawing/sizef) structure to a [PointF](../../com.aspose.drawing/pointf) structure. |
| [equals(SizeF other)](#equals-com.aspose.drawing.SizeF-) | Tests whether other [SizeF](../../com.aspose.drawing/sizef) structure has the same size of this [SizeF](../../com.aspose.drawing/sizef) structure. |
| [CloneTo(SizeF that)](#CloneTo-com.aspose.drawing.SizeF-) |  |
| [Clone()](#Clone--) |  |
| [clone()](#clone--) |  |
### SizeF() {#SizeF--}
```
public SizeF()
```


### SizeF(float width, float height) {#SizeF-float-float-}
```
public SizeF(float width, float height)
```


Initializes a new instance of the SizeF structure from the specified dimensions.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| width | float | The width component of the new SizeF structure. |
| height | float | The height component of the new SizeF structure. |

### SizeF(PointF pt) {#SizeF-com.aspose.drawing.PointF-}
```
public SizeF(PointF pt)
```


Initializes a new instance of the [SizeF](../../com.aspose.drawing/sizef) struct.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| pt | [PointF](../../com.aspose.drawing/pointf) | The [PointF](../../com.aspose.drawing/pointf) structure from which to initialize this [SizeF](../../com.aspose.drawing/sizef) structure. |

### SizeF(SizeF size) {#SizeF-com.aspose.drawing.SizeF-}
```
public SizeF(SizeF size)
```


Initializes a new instance of the [SizeF](../../com.aspose.drawing/sizef) struct.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| size | [SizeF](../../com.aspose.drawing/sizef) | The [SizeF](../../com.aspose.drawing/sizef) structure from which to create the new [SizeF](../../com.aspose.drawing/sizef) structure. |

### op_Equality(SizeF sz1, SizeF sz2) {#op-Equality-com.aspose.drawing.SizeF-com.aspose.drawing.SizeF-}
```
public static boolean op_Equality(SizeF sz1, SizeF sz2)
```


Tests whether two [SizeF](../../com.aspose.drawing/sizef) structures are equal.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| sz1 | [SizeF](../../com.aspose.drawing/sizef) | The [SizeF](../../com.aspose.drawing/sizef) structure on the left side of the equality operator. |
| sz2 | [SizeF](../../com.aspose.drawing/sizef) | The [SizeF](../../com.aspose.drawing/sizef) structure on the right of the equality operator. |

**Returns:**
boolean - This operator returns true if `sz1` and `sz2` have equal width and height; otherwise, false.
### op_Inequality(SizeF sz1, SizeF sz2) {#op-Inequality-com.aspose.drawing.SizeF-com.aspose.drawing.SizeF-}
```
public static boolean op_Inequality(SizeF sz1, SizeF sz2)
```


Tests whether two [SizeF](../../com.aspose.drawing/sizef) structures are different.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| sz1 | [SizeF](../../com.aspose.drawing/sizef) | The [SizeF](../../com.aspose.drawing/sizef) structure on the left of the inequality operator. |
| sz2 | [SizeF](../../com.aspose.drawing/sizef) | The [SizeF](../../com.aspose.drawing/sizef) structure on the right of the inequality operator. |

**Returns:**
boolean - This operator returns true if `sz1` and `sz2` differ either in width or height; false if `sz1` and `sz2` are equal.
### add(SizeF sz1, SizeF sz2) {#add-com.aspose.drawing.SizeF-com.aspose.drawing.SizeF-}
```
public static SizeF add(SizeF sz1, SizeF sz2)
```


Adds the width and height of one [SizeF](../../com.aspose.drawing/sizef) structure to the width and height of another [SizeF](../../com.aspose.drawing/sizef) structure.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| sz1 | [SizeF](../../com.aspose.drawing/sizef) | The first [SizeF](../../com.aspose.drawing/sizef) structure to add. |
| sz2 | [SizeF](../../com.aspose.drawing/sizef) | The second [SizeF](../../com.aspose.drawing/sizef) structure to add. |

**Returns:**
[SizeF](../../com.aspose.drawing/sizef) - A [SizeF](../../com.aspose.drawing/sizef) structure that is the result of the addition operation.
### subtract(SizeF sz1, SizeF sz2) {#subtract-com.aspose.drawing.SizeF-com.aspose.drawing.SizeF-}
```
public static SizeF subtract(SizeF sz1, SizeF sz2)
```


Subtracts the width and height of one [SizeF](../../com.aspose.drawing/sizef) structure from the width and height of another [SizeF](../../com.aspose.drawing/sizef) structure.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| sz1 | [SizeF](../../com.aspose.drawing/sizef) | The [SizeF](../../com.aspose.drawing/sizef) structure on the left side of the subtraction operator. |
| sz2 | [SizeF](../../com.aspose.drawing/sizef) | The [SizeF](../../com.aspose.drawing/sizef) structure on the right side of the subtraction operator. |

**Returns:**
[SizeF](../../com.aspose.drawing/sizef) - A [SizeF](../../com.aspose.drawing/sizef) structure that is a result of the subtraction operation.
### op_Addition(SizeF sz1, SizeF sz2) {#op-Addition-com.aspose.drawing.SizeF-com.aspose.drawing.SizeF-}
```
public static SizeF op_Addition(SizeF sz1, SizeF sz2)
```


Adds the width and height of one [SizeF](../../com.aspose.drawing/sizef) structure to the width and height of another [SizeF](../../com.aspose.drawing/sizef) structure.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| sz1 | [SizeF](../../com.aspose.drawing/sizef) | The first [SizeF](../../com.aspose.drawing/sizef) structure to add. |
| sz2 | [SizeF](../../com.aspose.drawing/sizef) | The second [SizeF](../../com.aspose.drawing/sizef) structure to add. |

**Returns:**
[SizeF](../../com.aspose.drawing/sizef) - A [Size](../../com.aspose.drawing/size) structure that is the result of the addition operation.
### op_Subtraction(SizeF sz1, SizeF sz2) {#op-Subtraction-com.aspose.drawing.SizeF-com.aspose.drawing.SizeF-}
```
public static SizeF op_Subtraction(SizeF sz1, SizeF sz2)
```


Subtracts the width and height of one [SizeF](../../com.aspose.drawing/sizef) structure from the width and height of another [SizeF](../../com.aspose.drawing/sizef) structure.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| sz1 | [SizeF](../../com.aspose.drawing/sizef) | The [SizeF](../../com.aspose.drawing/sizef) structure on the left side of the subtraction operator. |
| sz2 | [SizeF](../../com.aspose.drawing/sizef) | The [SizeF](../../com.aspose.drawing/sizef) structure on the right side of the subtraction operator. |

**Returns:**
[SizeF](../../com.aspose.drawing/sizef) - A [SizeF](../../com.aspose.drawing/sizef) that is the result of the subtraction operation.
### op_Multiply(float left, SizeF right) {#op-Multiply-float-com.aspose.drawing.SizeF-}
```
public static SizeF op_Multiply(float left, SizeF right)
```


Multiplies [SizeF](../../com.aspose.drawing/sizef) by a `float` producing [SizeF](../../com.aspose.drawing/sizef).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| left | float | Multiplier of type `float`. |
| right | [SizeF](../../com.aspose.drawing/sizef) | Multiplicand of type [SizeF](../../com.aspose.drawing/sizef). |

**Returns:**
[SizeF](../../com.aspose.drawing/sizef) - Product of type [SizeF](../../com.aspose.drawing/sizef).
### op_Multiply(SizeF left, float right) {#op-Multiply-com.aspose.drawing.SizeF-float-}
```
public static SizeF op_Multiply(SizeF left, float right)
```


Multiplies [SizeF](../../com.aspose.drawing/sizef) by a `float` producing [SizeF](../../com.aspose.drawing/sizef).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| left | [SizeF](../../com.aspose.drawing/sizef) | Multiplicand of type [SizeF](../../com.aspose.drawing/sizef). |
| right | float | Multiplier of type `float`. |

**Returns:**
[SizeF](../../com.aspose.drawing/sizef) - Product of type [SizeF](../../com.aspose.drawing/sizef).
### op_Division(SizeF left, float right) {#op-Division-com.aspose.drawing.SizeF-float-}
```
public static SizeF op_Division(SizeF left, float right)
```


Divides [SizeF](../../com.aspose.drawing/sizef) by a `float` producing [SizeF](../../com.aspose.drawing/sizef).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| left | [SizeF](../../com.aspose.drawing/sizef) | Dividend of type [SizeF](../../com.aspose.drawing/sizef). |
| right | float | Divisor of type `int`. |

**Returns:**
[SizeF](../../com.aspose.drawing/sizef) - Result of type [SizeF](../../com.aspose.drawing/sizef).
### to_PointF(SizeF size) {#to-PointF-com.aspose.drawing.SizeF-}
```
public static PointF to_PointF(SizeF size)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| size | [SizeF](../../com.aspose.drawing/sizef) |  |

**Returns:**
[PointF](../../com.aspose.drawing/pointf)
### isEquals(SizeF obj1, SizeF obj2) {#isEquals-com.aspose.drawing.SizeF-com.aspose.drawing.SizeF-}
```
public static boolean isEquals(SizeF obj1, SizeF obj2)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| obj1 | [SizeF](../../com.aspose.drawing/sizef) |  |
| obj2 | [SizeF](../../com.aspose.drawing/sizef) |  |

**Returns:**
boolean
### getEmpty() {#getEmpty--}
```
public static SizeF getEmpty()
```




**Returns:**
[SizeF](../../com.aspose.drawing/sizef)
### isEmpty() {#isEmpty--}
```
public final boolean isEmpty()
```


Gets a value indicating whether this [SizeF](../../com.aspose.drawing/sizef) structure has zero width and height.

**Returns:**
boolean - a value indicating whether this [SizeF](../../com.aspose.drawing/sizef) structure has zero width and height.
### getWidth() {#getWidth--}
```
public final float getWidth()
```


Gets the horizontal component of this SizeF structure.

**Returns:**
float - the horizontal component of this SizeF structure.
### setWidth(float value) {#setWidth-float-}
```
public final void setWidth(float value)
```


Sets the horizontal component of this SizeF structure.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | float | the horizontal component of this SizeF structure. |

### getHeight() {#getHeight--}
```
public final float getHeight()
```


Gets the vertical component of this SizeF structure.

**Returns:**
float - the vertical component of this SizeF structure.
### setHeight(float value) {#setHeight-float-}
```
public final void setHeight(float value)
```


Sets the vertical component of this SizeF structure.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | float | the vertical component of this SizeF structure. |

### hashCode() {#hashCode--}
```
public int hashCode()
```


Returns a hash code for this [SizeF](../../com.aspose.drawing/sizef) structure.

**Returns:**
int - An integer value that specifies a hash value for this [SizeF](../../com.aspose.drawing/sizef) structure.
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


Tests to see whether the specified object is a [SizeF](../../com.aspose.drawing/sizef) structure with the same dimensions as this [SizeF](../../com.aspose.drawing/sizef) structure.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| obj | java.lang.Object | The Object to test. |

**Returns:**
boolean - This method returns `true` if obj is a [SizeF](../../com.aspose.drawing/sizef) and has the same width and height as this SizeF; otherwise, `false`.
### toSize() {#toSize--}
```
public final Size toSize()
```


Converts a [SizeF](../../com.aspose.drawing/sizef) structure to a [Size](../../com.aspose.drawing/size) structure.

**Returns:**
[Size](../../com.aspose.drawing/size) - Returns a [Size](../../com.aspose.drawing/size) structure.
### toPointF() {#toPointF--}
```
public final PointF toPointF()
```


Converts a [SizeF](../../com.aspose.drawing/sizef) structure to a [PointF](../../com.aspose.drawing/pointf) structure.

**Returns:**
[PointF](../../com.aspose.drawing/pointf) - Returns a [PointF](../../com.aspose.drawing/pointf) structure.
### equals(SizeF other) {#equals-com.aspose.drawing.SizeF-}
```
public final boolean equals(SizeF other)
```


Tests whether other [SizeF](../../com.aspose.drawing/sizef) structure has the same size of this [SizeF](../../com.aspose.drawing/sizef) structure.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| other | [SizeF](../../com.aspose.drawing/sizef) | Other size to test |

**Returns:**
boolean - This method returns `true` if other [SizeF](../../com.aspose.drawing/sizef) structure and its Width and Height properties are equal to the corresponding properties of this [SizeF](../../com.aspose.drawing/sizef) structure; otherwise, `false`.
### CloneTo(SizeF that) {#CloneTo-com.aspose.drawing.SizeF-}
```
public void CloneTo(SizeF that)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| that | [SizeF](../../com.aspose.drawing/sizef) |  |

### Clone() {#Clone--}
```
public SizeF Clone()
```




**Returns:**
[SizeF](../../com.aspose.drawing/sizef)
### clone() {#clone--}
```
public Object clone()
```




**Returns:**
java.lang.Object
