---
title: CharacterRange
second_title: Aspose.Drawing for Java API Reference
description: Specifies a range of character positions within a string.
type: docs
weight: 13
url: /java/com.aspose.drawing/characterrange/
---
**Inheritance:**
java.lang.Object, com.aspose.ms.System.ValueType, com.aspose.ms.lang.Struct

**All Implemented Interfaces:**
java.lang.Cloneable
```
public class CharacterRange extends Struct<CharacterRange> implements Cloneable
```

Specifies a range of character positions within a string.
## Constructors

| Constructor | Description |
| --- | --- |
| [CharacterRange()](#CharacterRange--) |  |
| [CharacterRange(int first, int length)](#CharacterRange-int-int-) | Initializes a new instance of the [CharacterRange](../../com.aspose.drawing/characterrange) struct, specifying a range of character positions within a string. |
## Methods

| Method | Description |
| --- | --- |
| [op_Equality(CharacterRange cr1, CharacterRange cr2)](#op-Equality-com.aspose.drawing.CharacterRange-com.aspose.drawing.CharacterRange-) | Compares two [CharacterRange](../../com.aspose.drawing/characterrange) objects. |
| [op_Inequality(CharacterRange cr1, CharacterRange cr2)](#op-Inequality-com.aspose.drawing.CharacterRange-com.aspose.drawing.CharacterRange-) | Compares two [CharacterRange](../../com.aspose.drawing/characterrange) objects. |
| [getFirst()](#getFirst--) | Gets the position in the string of the first character of this [CharacterRange](../../com.aspose.drawing/characterrange). |
| [setFirst(int value)](#setFirst-int-) | Sets the position in the string of the first character of this [CharacterRange](../../com.aspose.drawing/characterrange). |
| [getLength()](#getLength--) | Gets the number of positions in this [CharacterRange](../../com.aspose.drawing/characterrange). |
| [setLength(int value)](#setLength-int-) | Sets the number of positions in this [CharacterRange](../../com.aspose.drawing/characterrange). |
| [equals(Object obj)](#equals-java.lang.Object-) | Gets a value indicating whether this object is equivalent to the specified object. |
| [hashCode()](#hashCode--) | Returns the hash code for this instance. |
| [CloneTo(CharacterRange that)](#CloneTo-com.aspose.drawing.CharacterRange-) |  |
| [Clone()](#Clone--) |  |
| [clone()](#clone--) |  |
### CharacterRange() {#CharacterRange--}
```
public CharacterRange()
```


### CharacterRange(int first, int length) {#CharacterRange-int-int-}
```
public CharacterRange(int first, int length)
```


Initializes a new instance of the [CharacterRange](../../com.aspose.drawing/characterrange) struct, specifying a range of character positions within a string.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| first | int | The position of the first character in the range. For example, if First is set to 0, the first position of the range is position 0 in the string. |
| length | int | The number of positions in the range. |

### op_Equality(CharacterRange cr1, CharacterRange cr2) {#op-Equality-com.aspose.drawing.CharacterRange-com.aspose.drawing.CharacterRange-}
```
public static boolean op_Equality(CharacterRange cr1, CharacterRange cr2)
```


Compares two [CharacterRange](../../com.aspose.drawing/characterrange) objects. Gets a value indicating whether the First and Length values of the two [CharacterRange](../../com.aspose.drawing/characterrange) objects are equal.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| cr1 | [CharacterRange](../../com.aspose.drawing/characterrange) | A [CharacterRange](../../com.aspose.drawing/characterrange) to compare for equality. |
| cr2 | [CharacterRange](../../com.aspose.drawing/characterrange) | A [CharacterRange](../../com.aspose.drawing/characterrange) to compare for equality. |

**Returns:**
boolean - `true` to indicate the two CharacterRange objects have the same First and Length values; otherwise, `false`.
### op_Inequality(CharacterRange cr1, CharacterRange cr2) {#op-Inequality-com.aspose.drawing.CharacterRange-com.aspose.drawing.CharacterRange-}
```
public static boolean op_Inequality(CharacterRange cr1, CharacterRange cr2)
```


Compares two [CharacterRange](../../com.aspose.drawing/characterrange) objects. Gets a value indicating whether the First or Length values of the two [CharacterRange](../../com.aspose.drawing/characterrange) objects are not equal.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| cr1 | [CharacterRange](../../com.aspose.drawing/characterrange) | A [CharacterRange](../../com.aspose.drawing/characterrange) to compare for inequality. |
| cr2 | [CharacterRange](../../com.aspose.drawing/characterrange) | A [CharacterRange](../../com.aspose.drawing/characterrange) to compare for inequality. |

**Returns:**
boolean - `true` to indicate the either the First or Length values of the two CharacterRange objects differ; otherwise, `false`.
### getFirst() {#getFirst--}
```
public final int getFirst()
```


Gets the position in the string of the first character of this [CharacterRange](../../com.aspose.drawing/characterrange).

Value: The first position of this [CharacterRange](../../com.aspose.drawing/characterrange).

**Returns:**
int - the position in the string of the first character of this [CharacterRange](../../com.aspose.drawing/characterrange).
### setFirst(int value) {#setFirst-int-}
```
public final void setFirst(int value)
```


Sets the position in the string of the first character of this [CharacterRange](../../com.aspose.drawing/characterrange).

Value: The first position of this [CharacterRange](../../com.aspose.drawing/characterrange).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | the position in the string of the first character of this [CharacterRange](../../com.aspose.drawing/characterrange). |

### getLength() {#getLength--}
```
public final int getLength()
```


Gets the number of positions in this [CharacterRange](../../com.aspose.drawing/characterrange).

Value: The number of positions in this [CharacterRange](../../com.aspose.drawing/characterrange).

**Returns:**
int - the number of positions in this [CharacterRange](../../com.aspose.drawing/characterrange).
### setLength(int value) {#setLength-int-}
```
public final void setLength(int value)
```


Sets the number of positions in this [CharacterRange](../../com.aspose.drawing/characterrange).

Value: The number of positions in this [CharacterRange](../../com.aspose.drawing/characterrange).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | the number of positions in this [CharacterRange](../../com.aspose.drawing/characterrange). |

### equals(Object obj) {#equals-java.lang.Object-}
```
public boolean equals(Object obj)
```


Gets a value indicating whether this object is equivalent to the specified object.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| obj | java.lang.Object | The object to compare to for equality.. |

**Returns:**
boolean - `true` to indicate the specified object is an instance with the same First and Length value as this instance; otherwise, `false`.
### hashCode() {#hashCode--}
```
public int hashCode()
```


Returns the hash code for this instance.

**Returns:**
int - A 32-bit signed integer that is the hash code for this instance.
### CloneTo(CharacterRange that) {#CloneTo-com.aspose.drawing.CharacterRange-}
```
public void CloneTo(CharacterRange that)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| that | [CharacterRange](../../com.aspose.drawing/characterrange) |  |

### Clone() {#Clone--}
```
public CharacterRange Clone()
```




**Returns:**
[CharacterRange](../../com.aspose.drawing/characterrange)
### clone() {#clone--}
```
public Object clone()
```




**Returns:**
java.lang.Object
