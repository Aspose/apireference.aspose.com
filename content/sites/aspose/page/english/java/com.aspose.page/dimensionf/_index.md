---
title: DimensionF
second_title: Aspose.Page for Java API Reference
description: The Dimension class encapsulates the width and height of a component in single precision in a single object.
type: docs
weight: 12
url: /java/com.aspose.page/dimensionf/
---
**Inheritance:**
java.lang.Object, java.awt.geom.Dimension2D

**All Implemented Interfaces:**
java.io.Serializable
```
public class DimensionF extends Dimension2D implements Serializable
```

The `Dimension` class encapsulates the width and height of a component (in single precision) in a single object.

Normally the values of `width` and `height` are non-negative integers. The constructors that allow you to create a dimension do not prevent you from setting a negative value for these properties. If the value of `width` or `height` is negative, the behavior of some methods defined by other objects is undefined.
## Constructors

| Constructor | Description |
| --- | --- |
| [DimensionF()](#DimensionF--) | Creates an instance of `Dimension` with a width of zero and a height of zero. |
| [DimensionF(DimensionF d)](#DimensionF-com.aspose.page.DimensionF-) | Creates an instance of `Dimension` whose width and height are the same as for the specified dimension. |
| [DimensionF(float width, float height)](#DimensionF-float-float-) | Constructs a `Dimension` and initializes it to the specified width and specified height. |
## Fields

| Field | Description |
| --- | --- |
| [width](#width) | The width dimension; negative values can be used. |
| [height](#height) | The height dimension; negative values can be used. |
## Methods

| Method | Description |
| --- | --- |
| [getWidth()](#getWidth--) | \{@inheritDoc\} |
| [getHeight()](#getHeight--) | \{@inheritDoc\} |
| [setSize(double width, double height)](#setSize-double-double-) | Sets the size of this `Dimension` object to the specified width and height in double precision. |
| [getSize()](#getSize--) | Gets the size of this `Dimension` object. |
| [setSize(DimensionF d)](#setSize-com.aspose.page.DimensionF-) | Sets the size of this `Dimension` object to the specified size. |
| [setSize(float width, float height)](#setSize-float-float-) | Sets the size of this `Dimension` object to the specified width and height. |
| [equals(Object obj)](#equals-java.lang.Object-) | Checks whether two dimension objects have equal values. |
| [hashCode()](#hashCode--) | Returns the hash code for this `Dimension`. |
| [toString()](#toString--) | Returns a string representation of the values of this `Dimension` object's `height` and `width` fields. |
### DimensionF() {#DimensionF--}
```
public DimensionF()
```


Creates an instance of `Dimension` with a width of zero and a height of zero.

### DimensionF(DimensionF d) {#DimensionF-com.aspose.page.DimensionF-}
```
public DimensionF(DimensionF d)
```


Creates an instance of `Dimension` whose width and height are the same as for the specified dimension.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| d | [DimensionF](../../com.aspose.page/dimensionf) | the specified dimension for the `width` and `height` values |

### DimensionF(float width, float height) {#DimensionF-float-float-}
```
public DimensionF(float width, float height)
```


Constructs a `Dimension` and initializes it to the specified width and specified height.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| width | float | the specified width |
| height | float | the specified height |

### width {#width}
```
public float width
```


The width dimension; negative values can be used.

### height {#height}
```
public float height
```


The height dimension; negative values can be used.

### getWidth() {#getWidth--}
```
public double getWidth()
```




**Returns:**
double
### getHeight() {#getHeight--}
```
public double getHeight()
```




**Returns:**
double
### setSize(double width, double height) {#setSize-double-double-}
```
public void setSize(double width, double height)
```


Sets the size of this `Dimension` object to the specified width and height in double precision. Note that if `width` or `height` are larger than `Integer.MAX_VALUE`, they will be reset to `Integer.MAX_VALUE`.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| width | double | the new width for the `Dimension` object |
| height | double | the new height for the `Dimension` object |

### getSize() {#getSize--}
```
public DimensionF getSize()
```


Gets the size of this `Dimension` object. This method is included for completeness, to parallel the `getSize` method defined by `Component`.

**Returns:**
[DimensionF](../../com.aspose.page/dimensionf) - the size of this dimension, a new instance of `Dimension` with the same width and height
### setSize(DimensionF d) {#setSize-com.aspose.page.DimensionF-}
```
public void setSize(DimensionF d)
```


Sets the size of this `Dimension` object to the specified size. This method is included for completeness, to parallel the `setSize` method defined by `Component`.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| d | [DimensionF](../../com.aspose.page/dimensionf) | the new size for this `Dimension` object |

### setSize(float width, float height) {#setSize-float-float-}
```
public void setSize(float width, float height)
```


Sets the size of this `Dimension` object to the specified width and height. This method is included for completeness, to parallel the `setSize` method defined by `Component`.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| width | float | the new width for this `Dimension` object |
| height | float | the new height for this `Dimension` object |

### equals(Object obj) {#equals-java.lang.Object-}
```
public boolean equals(Object obj)
```


Checks whether two dimension objects have equal values.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| obj | java.lang.Object |  |

**Returns:**
boolean
### hashCode() {#hashCode--}
```
public int hashCode()
```


Returns the hash code for this `Dimension`.

**Returns:**
int - a hash code for this `Dimension`
### toString() {#toString--}
```
public String toString()
```


Returns a string representation of the values of this `Dimension` object's `height` and `width` fields. This method is intended to be used only for debugging purposes, and the content and format of the returned string may vary between implementations. The returned string may be empty but may not be `null`.

**Returns:**
java.lang.String - a string representation of this `Dimension` object
