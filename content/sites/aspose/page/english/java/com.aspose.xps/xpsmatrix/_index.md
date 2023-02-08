---
title: XpsMatrix
second_title: Aspose.Page for Java API Reference
description: Class incapsulating MatrixTransform property element features.
type: docs
weight: 35
url: /java/com.aspose.xps/xpsmatrix/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject)
```
public final class XpsMatrix extends XpsObject
```

Class incapsulating MatrixTransform property element features. This element defines an arbitrary affine matrix transformation used to manipulate the coordinate systems of elements.
## Methods

| Method | Description |
| --- | --- |
| [getM11()](#getM11--) | Gets the M11 element. |
| [getM12()](#getM12--) | Gets the M12 element. |
| [getM21()](#getM21--) | Gets the M21 element. |
| [getM22()](#getM22--) | Gets the M22 element. |
| [getM31()](#getM31--) | Gets the M31 element. |
| [getM32()](#getM32--) | Gets the M32 element. |
| [isIdentity()](#isIdentity--) | Gets a value indicating whether this instance is identity matrix. |
| [transformPoints(Point2D[] points, int startIndex, int numberOfPoints)](#transformPoints-java.awt.geom.Point2D---int-int-) | Applies the affine transformation represented by this Matrix to a specified part of array of points. |
| [transformPoint(Point2D point)](#transformPoint-java.awt.geom.Point2D-) | Applies the affine transformation represented by this Matrix to a specified point. |
| [transformPoints(Point2D[] points)](#transformPoints-java.awt.geom.Point2D---) | Applies the affine transformation represented by this Matrix to a specified array of points. |
| [transform(Rectangle2D rect)](#transform-java.awt.geom.Rectangle2D-) | Applies the affine transformation represented by this Matrix to a specified rectangle. |
| [scale(float scaleX, float scaleY, XpsMatrix.MatrixOrder matrixOrder)](#scale-float-float-com.aspose.xps.XpsMatrix.MatrixOrder-) | Applies the specified scale vector (scaleX and scaleY) to this Matrix in order specified by \`\`\` matrixOrder \`\`\`. |
| [scale(float scaleX, float scaleY)](#scale-float-float-) | Applies the specified scale vector (scaleX and scaleY) to this Matrix in default (Prepend) order. |
| [translate(float offsetX, float offsetY, XpsMatrix.MatrixOrder matrixOrder)](#translate-float-float-com.aspose.xps.XpsMatrix.MatrixOrder-) | Applies the specified translation vector to this Matrix in order specified by \`\`\` matrixOrder \`\`\`. |
| [translate(float offsetX, float offsetY)](#translate-float-float-) | Applies the specified translation vector to this Matrix. |
| [multiply(XpsMatrix matrix, XpsMatrix.MatrixOrder matrixOrder)](#multiply-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix.MatrixOrder-) | Multiplies this matrix by the matrix specified by the \`\`\` matrix \`\`\` in order specified by \`\`\` matrixOrder \`\`\`. |
| [multiply(XpsMatrix matrix)](#multiply-com.aspose.xps.XpsMatrix-) | Multiplies this matrix by the matrix specified by the \`\`\` matrix \`\`\` in default (Prepend) order. |
| [skew(double skewX, double skewY)](#skew-double-double-) | Applies specified skew transformation to this Matrix. |
| [rotate(float angle, XpsMatrix.MatrixOrder matrixOrder)](#rotate-float-com.aspose.xps.XpsMatrix.MatrixOrder-) | Applies clockwise rotation by \`\`\` angle \`\`\` to this Matrix in order specified by \`\`\` matrixOrder \`\`\`. |
| [rotate(float angle)](#rotate-float-) | Applies clockwise rotation by \`\`\` angle \`\`\` to this Matrix in default (Prepend) order. |
| [rotateAround(float angle, Point2D pivot, XpsMatrix.MatrixOrder matrixOrder)](#rotateAround-float-java.awt.geom.Point2D-com.aspose.xps.XpsMatrix.MatrixOrder-) | Applies clockwise rotation by \`\`\` angle \`\`\` around the \`\`\` pivot \`\`\` to this Matrix in order specified by \`\`\` matrixOrder \`\`\`. |
| [rotateAround(float angle, Point2D pivot)](#rotateAround-float-java.awt.geom.Point2D-) | Applies clockwise rotation by \`\`\` angle \`\`\` around the \`\`\` pivot \`\`\` to this Matrix in default (Prepend) order. |
| [reset()](#reset--) | Resets this Matrix to identity matrix. |
| [hashCode()](#hashCode--) | Returns a hash code for this instance. |
| [equals(Object obj)](#equals-java.lang.Object-) | Determines whether the specified \`\`\` object \`\`\` is equal to this instance. |
| [equals(XpsMatrix a, XpsMatrix b)](#equals-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix-) | The actual implementation. |
| [op_Equality(XpsMatrix a, XpsMatrix b)](#op-Equality-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix-) | Implements the operator ==. |
| [op_Inequality(XpsMatrix a, XpsMatrix b)](#op-Inequality-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix-) | Implements the operator ! |
| [toString()](#toString--) | Returns the string representation of this \`\`\` XpsMatrix \`\`\` instance. |
| [deepClone()](#deepClone--) | Clones this transformation matrix. |
### getM11() {#getM11--}
```
public float getM11()
```


Gets the M11 element.

**Returns:**
float - The M11 element.
### getM12() {#getM12--}
```
public float getM12()
```


Gets the M12 element.

**Returns:**
float - The M12 element.
### getM21() {#getM21--}
```
public float getM21()
```


Gets the M21 element.

**Returns:**
float - The M21 element.
### getM22() {#getM22--}
```
public float getM22()
```


Gets the M22 element.

**Returns:**
float - The M22 element.
### getM31() {#getM31--}
```
public float getM31()
```


Gets the M31 element.

**Returns:**
float - The M31 element.
### getM32() {#getM32--}
```
public float getM32()
```


Gets the M32 element.

**Returns:**
float - The M32 element.
### isIdentity() {#isIdentity--}
```
public boolean isIdentity()
```


Gets a value indicating whether this instance is identity matrix.

Value: \`\`\` True \`\`\` if this instance is identity matrix; otherwise, \`\`\` false \`\`\`.

**Returns:**
boolean - A value indicating whether this instance is identity matrix.
### transformPoints(Point2D[] points, int startIndex, int numberOfPoints) {#transformPoints-java.awt.geom.Point2D---int-int-}
```
public void transformPoints(Point2D[] points, int startIndex, int numberOfPoints)
```


Applies the affine transformation represented by this Matrix to a specified part of array of points.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | The points. |
| startIndex | int | The start index. |
| numberOfPoints | int | The number of points. |

### transformPoint(Point2D point) {#transformPoint-java.awt.geom.Point2D-}
```
public Point2D transformPoint(Point2D point)
```


Applies the affine transformation represented by this Matrix to a specified point.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| point | java.awt.geom.Point2D | The point. |

**Returns:**
java.awt.geom.Point2D - Transformed point
### transformPoints(Point2D[] points) {#transformPoints-java.awt.geom.Point2D---}
```
public void transformPoints(Point2D[] points)
```


Applies the affine transformation represented by this Matrix to a specified array of points.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | The points. |

### transform(Rectangle2D rect) {#transform-java.awt.geom.Rectangle2D-}
```
public Rectangle2D transform(Rectangle2D rect)
```


Applies the affine transformation represented by this Matrix to a specified rectangle.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| rect | java.awt.geom.Rectangle2D | The rectangle. |

**Returns:**
java.awt.geom.Rectangle2D - Transformed rectangle
### scale(float scaleX, float scaleY, XpsMatrix.MatrixOrder matrixOrder) {#scale-float-float-com.aspose.xps.XpsMatrix.MatrixOrder-}
```
public void scale(float scaleX, float scaleY, XpsMatrix.MatrixOrder matrixOrder)
```


Applies the specified scale vector (scaleX and scaleY) to this Matrix in order specified by \`\`\` matrixOrder \`\`\`.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| scaleX | float | The scale X. |
| scaleY | float | The scale Y. |
| matrixOrder | [MatrixOrder](../../com.aspose.xps/matrixorder) | The order. |

### scale(float scaleX, float scaleY) {#scale-float-float-}
```
public void scale(float scaleX, float scaleY)
```


Applies the specified scale vector (scaleX and scaleY) to this Matrix in default (Prepend) order.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| scaleX | float | The scale x. |
| scaleY | float | The scale y. |

### translate(float offsetX, float offsetY, XpsMatrix.MatrixOrder matrixOrder) {#translate-float-float-com.aspose.xps.XpsMatrix.MatrixOrder-}
```
public void translate(float offsetX, float offsetY, XpsMatrix.MatrixOrder matrixOrder)
```


Applies the specified translation vector to this Matrix in order specified by \`\`\` matrixOrder \`\`\`.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| offsetX | float | The offset X. |
| offsetY | float | The offset Y. |
| matrixOrder | [MatrixOrder](../../com.aspose.xps/matrixorder) | The order. |

### translate(float offsetX, float offsetY) {#translate-float-float-}
```
public void translate(float offsetX, float offsetY)
```


Applies the specified translation vector to this Matrix.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| offsetX | float | The offset X. |
| offsetY | float | The offset Y. |

### multiply(XpsMatrix matrix, XpsMatrix.MatrixOrder matrixOrder) {#multiply-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix.MatrixOrder-}
```
public void multiply(XpsMatrix matrix, XpsMatrix.MatrixOrder matrixOrder)
```


Multiplies this matrix by the matrix specified by the \`\`\` matrix \`\`\` in order specified by \`\`\` matrixOrder \`\`\`.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| matrix | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | The matrix. |
| matrixOrder | [MatrixOrder](../../com.aspose.xps/matrixorder) | The order. |

### multiply(XpsMatrix matrix) {#multiply-com.aspose.xps.XpsMatrix-}
```
public void multiply(XpsMatrix matrix)
```


Multiplies this matrix by the matrix specified by the \`\`\` matrix \`\`\` in default (Prepend) order.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| matrix | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | The matrix. |

### skew(double skewX, double skewY) {#skew-double-double-}
```
public void skew(double skewX, double skewY)
```


Applies specified skew transformation to this Matrix.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| skewX | double | The skew x. |
| skewY | double | The skew y. |

### rotate(float angle, XpsMatrix.MatrixOrder matrixOrder) {#rotate-float-com.aspose.xps.XpsMatrix.MatrixOrder-}
```
public void rotate(float angle, XpsMatrix.MatrixOrder matrixOrder)
```


Applies clockwise rotation by \`\`\` angle \`\`\` to this Matrix in order specified by \`\`\` matrixOrder \`\`\`.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| angle | float | The angle. |
| matrixOrder | [MatrixOrder](../../com.aspose.xps/matrixorder) | The order. |

### rotate(float angle) {#rotate-float-}
```
public void rotate(float angle)
```


Applies clockwise rotation by \`\`\` angle \`\`\` to this Matrix in default (Prepend) order.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| angle | float | The angle. |

### rotateAround(float angle, Point2D pivot, XpsMatrix.MatrixOrder matrixOrder) {#rotateAround-float-java.awt.geom.Point2D-com.aspose.xps.XpsMatrix.MatrixOrder-}
```
public void rotateAround(float angle, Point2D pivot, XpsMatrix.MatrixOrder matrixOrder)
```


Applies clockwise rotation by \`\`\` angle \`\`\` around the \`\`\` pivot \`\`\` to this Matrix in order specified by \`\`\` matrixOrder \`\`\`.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| angle | float | The angle. |
| pivot | java.awt.geom.Point2D | The pivot point. |
| matrixOrder | [MatrixOrder](../../com.aspose.xps/matrixorder) | The order. |

### rotateAround(float angle, Point2D pivot) {#rotateAround-float-java.awt.geom.Point2D-}
```
public void rotateAround(float angle, Point2D pivot)
```


Applies clockwise rotation by \`\`\` angle \`\`\` around the \`\`\` pivot \`\`\` to this Matrix in default (Prepend) order.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| angle | float | The angle. |
| pivot | java.awt.geom.Point2D | The pivot point. |

### reset() {#reset--}
```
public void reset()
```


Resets this Matrix to identity matrix.

### hashCode() {#hashCode--}
```
public int hashCode()
```


Returns a hash code for this instance.

**Returns:**
int - A hash code for this instance, suitable for use in hashing algorithms and data structures like a hash table.
### equals(Object obj) {#equals-java.lang.Object-}
```
public boolean equals(Object obj)
```


Determines whether the specified \`\`\` object \`\`\` is equal to this instance.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| obj | java.lang.Object | The \`\`\` object \`\`\` to compare with this instance. |

**Returns:**
boolean - \`\`\` true \`\`\` if the specified \`\`\` object \`\`\` is equal to this instance; otherwise, \`\`\` false \`\`\`. The \`\`\` obj \`\`\` parameter is null.
### equals(XpsMatrix a, XpsMatrix b) {#equals-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix-}
```
public static boolean equals(XpsMatrix a, XpsMatrix b)
```


The actual implementation.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| a | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | The first matrix. |
| b | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | The second matrix. |

**Returns:**
boolean - [true] if martrices are equals
### op_Equality(XpsMatrix a, XpsMatrix b) {#op-Equality-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix-}
```
public static boolean op_Equality(XpsMatrix a, XpsMatrix b)
```


Implements the operator ==.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| a | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | The first matrix. |
| b | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | The second matrix. |

**Returns:**
boolean - The result of the operator.
### op_Inequality(XpsMatrix a, XpsMatrix b) {#op-Inequality-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix-}
```
public static boolean op_Inequality(XpsMatrix a, XpsMatrix b)
```


Implements the operator !=.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| a | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | The first matrix. |
| b | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | The second matrix. |

**Returns:**
boolean - The result of the operator.
### toString() {#toString--}
```
public String toString()
```


Returns the string representation of this \`\`\` XpsMatrix \`\`\` instance.

**Returns:**
java.lang.String - String representation
### deepClone() {#deepClone--}
```
public XpsMatrix deepClone()
```


Clones this transformation matrix.

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - Clone of this transformation matrix.
