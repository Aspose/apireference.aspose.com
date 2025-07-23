---
title: IPathSegment
second_title: Aspose.Font for Java API Reference
description: Represents interface of any path segment.
type: docs
weight: 130
url: /java/com.aspose.font/ipathsegment/
---
**All Implemented Interfaces:**
java.lang.Cloneable
```
public interface IPathSegment extends Cloneable
```

Represents interface of any path segment.
## Methods

| Method | Description |
| --- | --- |
| [copy()](#copy--) | Creates copy of the segment object. |
| [shift(double dx, double dy)](#shift-double-double-) | Performs shift by x and y coordinates. |
| [transform(TransformationMatrix matrix)](#transform-com.aspose.font.TransformationMatrix-) | Transforms coordinates with the transformation matrix. |
### copy() {#copy--}
```
public abstract IPathSegment copy()
```


Creates copy of the segment object.

**Returns:**
[IPathSegment](../../com.aspose.font/ipathsegment) - Copy of the segment object.
### shift(double dx, double dy) {#shift-double-double-}
```
public abstract void shift(double dx, double dy)
```


Performs shift by x and y coordinates.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| dx | double | Value dx. |
| dy | double | Value dy. |

### transform(TransformationMatrix matrix) {#transform-com.aspose.font.TransformationMatrix-}
```
public abstract void transform(TransformationMatrix matrix)
```


Transforms coordinates with the transformation matrix.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| matrix | [TransformationMatrix](../../com.aspose.font/transformationmatrix) | Transformation matrix. |

