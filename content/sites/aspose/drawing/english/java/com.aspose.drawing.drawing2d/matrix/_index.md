---
title: Matrix
second_title: Aspose.Drawing for Java API Reference
description: Encapsulates a 3-by-3 affine matrix that represents a geometric transform.
type: docs
weight: 33
url: /java/com.aspose.drawing.drawing2d/matrix/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
com.aspose.ms.System.IDisposable
```
public final class Matrix implements System.IDisposable
```

Encapsulates a 3-by-3 affine matrix that represents a geometric transform. This class cannot be inherited.
## Constructors

| Constructor | Description |
| --- | --- |
| [Matrix()](#Matrix--) | Initializes a new instance of the Matrix class as the identity matrix. |
| [Matrix(float m11, float m12, float m21, float m22, float dx, float dy)](#Matrix-float-float-float-float-float-float-) | Initializes a new instance of the Matrix class with the specified elements. |
| [Matrix(Rectangle rect, Point[] plgpts)](#Matrix-com.aspose.drawing.Rectangle-com.aspose.drawing.Point---) | Initializes a new instance of the [Matrix](../../com.aspose.drawing.drawing2d/matrix) class to the geometric transform defined by the specified rectangle and array of points. |
| [Matrix(RectangleF rect, PointF[] plgpts)](#Matrix-com.aspose.drawing.RectangleF-com.aspose.drawing.PointF---) | Initializes a new instance of the [Matrix](../../com.aspose.drawing.drawing2d/matrix) class to the geometric transform defined by the specified rectangle and array of points. |
## Fields

| Field | Description |
| --- | --- |
| [IdentityTransform](#IdentityTransform) |  |
## Methods

| Method | Description |
| --- | --- |
| [getElements()](#getElements--) | Gets an array of floating-point values that represents the elements of this Matrix. |
| [isIdentity()](#isIdentity--) | Gets a value indicating whether this Matrix is the identity matrix. |
| [isInvertible()](#isInvertible--) | Gets a value indicating whether this Matrix is invertible. |
| [getOffsetX()](#getOffsetX--) | Gets the x translation value (the dx value, or the element in the third row and first column) of this Matrix. |
| [getOffsetY()](#getOffsetY--) | Gets the y translation value (the `dy` value, or the element in the third row and second column) of this Matrix. |
| [dispose()](#dispose--) | Releases all resources used by this Matrix. |
| [deepClone()](#deepClone--) | Creates an exact copy of this Matrix. |
| [invert()](#invert--) | Inverts this Matrix, if it is invertible. |
| [translate(float offsetX, float offsetY)](#translate-float-float-) | Applies the specified translation vector (offsetX and offsetY) to this Matrix by prepending the translation vector. |
| [translate(float offsetX, float offsetY, int order)](#translate-float-float-int-) | Applies the specified translation vector to this Matrix in the specified order. |
| [transformVectors(PointF[] pts)](#transformVectors-com.aspose.drawing.PointF---) | Multiplies each vector in an array by the matrix. |
| [scale(float scaleX, float scaleY)](#scale-float-float-) | Applies the specified scale vector to this Matrix by prepending the scale vector. |
| [scale(float scaleX, float scaleY, int order)](#scale-float-float-int-) | Applies the specified scale vector (scaleX and scaleY) to this Matrix using the specified order. |
| [shear(float shearX, float shearY)](#shear-float-float-) | Applies the specified shear vector to this Matrix by prepending the shear transformation. |
| [shear(float shearX, float shearY, int order)](#shear-float-float-int-) | Applies the specified shear vector to this Matrix in the specified order. |
| [rotateAt(float angle, PointF point)](#rotateAt-float-com.aspose.drawing.PointF-) | Applies a clockwise rotation to this Matrix around the point specified in the point parameter, and by prepending the rotation. |
| [rotateAt(float angle, PointF point, int order)](#rotateAt-float-com.aspose.drawing.PointF-int-) | Applies a clockwise rotation about the specified point to this Matrix in the specified order. |
| [transformPoints(PointF[] pts)](#transformPoints-com.aspose.drawing.PointF---) | Applies the geometric transform represented by this [Matrix](../../com.aspose.drawing.drawing2d/matrix) to a specified array of points. |
| [transformPoints(Point[] pts)](#transformPoints-com.aspose.drawing.Point---) | Applies the geometric transform represented by this [Matrix](../../com.aspose.drawing.drawing2d/matrix) to a specified array of points. |
| [multiply(Matrix matrix)](#multiply-com.aspose.drawing.drawing2d.Matrix-) | Multiplies this [Matrix](../../com.aspose.drawing.drawing2d/matrix) by the matrix specified in the `matrix` parameter, by prepending the specified [Matrix](../../com.aspose.drawing.drawing2d/matrix). |
| [multiply(Matrix matrix, int order)](#multiply-com.aspose.drawing.drawing2d.Matrix-int-) | Multiplies this [Matrix](../../com.aspose.drawing.drawing2d/matrix) by the matrix specified in the `matrix` parameter, and in the order specified in the `order` parameter. |
| [rotate(float angle)](#rotate-float-) | Prepend to this [Matrix](../../com.aspose.drawing.drawing2d/matrix) a clockwise rotation, around the origin and by the specified angle. |
| [rotate(float angle, int order)](#rotate-float-int-) | Applies a clockwise rotation of an amount specified in the angle parameter, around the origin (zero x and y coordinates) for this [Matrix](../../com.aspose.drawing.drawing2d/matrix). |
| [reset()](#reset--) | Resets this [Matrix](../../com.aspose.drawing.drawing2d/matrix) to have the elements of the identity matrix. |
### Matrix() {#Matrix--}
```
public Matrix()
```


Initializes a new instance of the Matrix class as the identity matrix.

### Matrix(float m11, float m12, float m21, float m22, float dx, float dy) {#Matrix-float-float-float-float-float-float-}
```
public Matrix(float m11, float m12, float m21, float m22, float dx, float dy)
```


Initializes a new instance of the Matrix class with the specified elements.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| m11 | float | The value in the first row and first column of the new Matrix. |
| m12 | float | The value in the first row and second column of the new Matrix. |
| m21 | float | The value in the second row and first column of the new Matrix. |
| m22 | float | The value in the second row and second column of the new Matrix. |
| dx | float | The value in the third row and first column of the new Matrix. |
| dy | float | The value in the third row and second column of the new Matrix. |

### Matrix(Rectangle rect, Point[] plgpts) {#Matrix-com.aspose.drawing.Rectangle-com.aspose.drawing.Point---}
```
public Matrix(Rectangle rect, Point[] plgpts)
```


Initializes a new instance of the [Matrix](../../com.aspose.drawing.drawing2d/matrix) class to the geometric transform defined by the specified rectangle and array of points.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| rect | [Rectangle](../../com.aspose.drawing/rectangle) | A [Rectangle](../../com.aspose.drawing/rectangle) structure that represents the rectangle to be transformed. |
| plgpts | [Point\[\]](../../com.aspose.drawing/point) | An array of three [Point](../../com.aspose.drawing/point) structures that represents the points of a parallelogram to which the upper-left, upper-right, and lower-left corners of the rectangle is to be transformed. The lower-right corner of the parallelogram is implied by the first three corners. |

### Matrix(RectangleF rect, PointF[] plgpts) {#Matrix-com.aspose.drawing.RectangleF-com.aspose.drawing.PointF---}
```
public Matrix(RectangleF rect, PointF[] plgpts)
```


Initializes a new instance of the [Matrix](../../com.aspose.drawing.drawing2d/matrix) class to the geometric transform defined by the specified rectangle and array of points.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| rect | [RectangleF](../../com.aspose.drawing/rectanglef) | A [RectangleF](../../com.aspose.drawing/rectanglef) structure that represents the rectangle to be transformed. |
| plgpts | [PointF\[\]](../../com.aspose.drawing/pointf) | An array of three [PointF](../../com.aspose.drawing/pointf) structures that represents the points of a parallelogram to which the upper-left, upper-right, and lower-left corners of the rectangle is to be transformed. The lower-right corner of the parallelogram is implied by the first three corners. |

### IdentityTransform {#IdentityTransform}
```
public static final Matrix IdentityTransform
```


### getElements() {#getElements--}
```
public float[] getElements()
```


Gets an array of floating-point values that represents the elements of this Matrix.

**Returns:**
float[] - an array of floating-point values that represents the elements of this Matrix.
### isIdentity() {#isIdentity--}
```
public boolean isIdentity()
```


Gets a value indicating whether this Matrix is the identity matrix.

**Returns:**
boolean - a value indicating whether this Matrix is the identity matrix.
### isInvertible() {#isInvertible--}
```
public boolean isInvertible()
```


Gets a value indicating whether this Matrix is invertible.

**Returns:**
boolean - a value indicating whether this Matrix is invertible.
### getOffsetX() {#getOffsetX--}
```
public float getOffsetX()
```


Gets the x translation value (the dx value, or the element in the third row and first column) of this Matrix.

**Returns:**
float - the x translation value (the dx value, or the element in the third row and first column) of this Matrix.
### getOffsetY() {#getOffsetY--}
```
public float getOffsetY()
```


Gets the y translation value (the `dy` value, or the element in the third row and second column) of this Matrix.

**Returns:**
float - the y translation value (the `dy` value, or the element in the third row and second column) of this Matrix.
### dispose() {#dispose--}
```
public void dispose()
```


Releases all resources used by this Matrix.

--------------------

This method actually does nothing. It's just for compatibility with System.Drawing API.

### deepClone() {#deepClone--}
```
public Matrix deepClone()
```


Creates an exact copy of this Matrix.

**Returns:**
[Matrix](../../com.aspose.drawing.drawing2d/matrix) - The Matrix that this method creates.
### invert() {#invert--}
```
public void invert()
```


Inverts this Matrix, if it is invertible.

### translate(float offsetX, float offsetY) {#translate-float-float-}
```
public void translate(float offsetX, float offsetY)
```


Applies the specified translation vector (offsetX and offsetY) to this Matrix by prepending the translation vector.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| offsetX | float | The x value by which to translate this Matrix. |
| offsetY | float | The y value by which to translate this Matrix. |

### translate(float offsetX, float offsetY, int order) {#translate-float-float-int-}
```
public void translate(float offsetX, float offsetY, int order)
```


Applies the specified translation vector to this Matrix in the specified order.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| offsetX | float | The x value by which to translate this Matrix. |
| offsetY | float | The y value by which to translate this Matrix. |
| order | int | A MatrixOrder that specifies the order (append or prepend) in which the translation is applied to this Matrix. |

### transformVectors(PointF[] pts) {#transformVectors-com.aspose.drawing.PointF---}
```
public void transformVectors(PointF[] pts)
```


Multiplies each vector in an array by the matrix. The translation elements of this matrix (third row) are ignored.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| pts | [PointF\[\]](../../com.aspose.drawing/pointf) | An array of [PointF](../../com.aspose.drawing/pointf) structures that represents the points to transform. |

### scale(float scaleX, float scaleY) {#scale-float-float-}
```
public void scale(float scaleX, float scaleY)
```


Applies the specified scale vector to this Matrix by prepending the scale vector.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| scaleX | float | The value by which to scale this Matrix in the x-axis direction. |
| scaleY | float | The value by which to scale this Matrix in the y-axis direction. |

### scale(float scaleX, float scaleY, int order) {#scale-float-float-int-}
```
public void scale(float scaleX, float scaleY, int order)
```


Applies the specified scale vector (scaleX and scaleY) to this Matrix using the specified order.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| scaleX | float | The value by which to scale this Matrix in the x-axis direction. |
| scaleY | float | The value by which to scale this Matrix in the y-axis direction. |
| order | int | A MatrixOrder that specifies the order (append or prepend) in which the scale vector is applied to this Matrix. |

### shear(float shearX, float shearY) {#shear-float-float-}
```
public void shear(float shearX, float shearY)
```


Applies the specified shear vector to this Matrix by prepending the shear transformation.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| shearX | float | The horizontal shear factor. |
| shearY | float | The vertical shear factor. |

### shear(float shearX, float shearY, int order) {#shear-float-float-int-}
```
public void shear(float shearX, float shearY, int order)
```


Applies the specified shear vector to this Matrix in the specified order.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| shearX | float | The horizontal shear factor. |
| shearY | float | The vertical shear factor. |
| order | int | A MatrixOrder that specifies the order (append or prepend) in which the shear is applied. |

### rotateAt(float angle, PointF point) {#rotateAt-float-com.aspose.drawing.PointF-}
```
public void rotateAt(float angle, PointF point)
```


Applies a clockwise rotation to this Matrix around the point specified in the point parameter, and by prepending the rotation.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| angle | float | The angle (extent) of the rotation, in degrees. |
| point | [PointF](../../com.aspose.drawing/pointf) | A PointF that represents the center of the rotation. |

### rotateAt(float angle, PointF point, int order) {#rotateAt-float-com.aspose.drawing.PointF-int-}
```
public void rotateAt(float angle, PointF point, int order)
```


Applies a clockwise rotation about the specified point to this Matrix in the specified order.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| angle | float | The angle of the rotation, in degrees. |
| point | [PointF](../../com.aspose.drawing/pointf) | A PointF that represents the center of the rotation. |
| order | int | A MatrixOrder that specifies the order (append or prepend) in which the rotation is applied. |

### transformPoints(PointF[] pts) {#transformPoints-com.aspose.drawing.PointF---}
```
public void transformPoints(PointF[] pts)
```


Applies the geometric transform represented by this [Matrix](../../com.aspose.drawing.drawing2d/matrix) to a specified array of points.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| pts | [PointF\[\]](../../com.aspose.drawing/pointf) | An array of [PointF](../../com.aspose.drawing/pointf) structures that represents the points to transform. |

### transformPoints(Point[] pts) {#transformPoints-com.aspose.drawing.Point---}
```
public void transformPoints(Point[] pts)
```


Applies the geometric transform represented by this [Matrix](../../com.aspose.drawing.drawing2d/matrix) to a specified array of points.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| pts | [Point\[\]](../../com.aspose.drawing/point) | An array of [Point](../../com.aspose.drawing/point) structures that represents the points to transform. |

### multiply(Matrix matrix) {#multiply-com.aspose.drawing.drawing2d.Matrix-}
```
public void multiply(Matrix matrix)
```


Multiplies this [Matrix](../../com.aspose.drawing.drawing2d/matrix) by the matrix specified in the `matrix` parameter, by prepending the specified [Matrix](../../com.aspose.drawing.drawing2d/matrix).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| matrix | [Matrix](../../com.aspose.drawing.drawing2d/matrix) | The [Matrix](../../com.aspose.drawing.drawing2d/matrix) by which this [Matrix](../../com.aspose.drawing.drawing2d/matrix) is to be multiplied. |

### multiply(Matrix matrix, int order) {#multiply-com.aspose.drawing.drawing2d.Matrix-int-}
```
public void multiply(Matrix matrix, int order)
```


Multiplies this [Matrix](../../com.aspose.drawing.drawing2d/matrix) by the matrix specified in the `matrix` parameter, and in the order specified in the `order` parameter.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| matrix | [Matrix](../../com.aspose.drawing.drawing2d/matrix) | The [Matrix](../../com.aspose.drawing.drawing2d/matrix) by which this [Matrix](../../com.aspose.drawing.drawing2d/matrix) is to be multiplied. |
| order | int | The [MatrixOrder](../../com.aspose.drawing.drawing2d/matrixorder) that represents the order of the multiplication. |

### rotate(float angle) {#rotate-float-}
```
public void rotate(float angle)
```


Prepend to this [Matrix](../../com.aspose.drawing.drawing2d/matrix) a clockwise rotation, around the origin and by the specified angle.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| angle | float | The angle of the rotation, in degrees. |

### rotate(float angle, int order) {#rotate-float-int-}
```
public void rotate(float angle, int order)
```


Applies a clockwise rotation of an amount specified in the angle parameter, around the origin (zero x and y coordinates) for this [Matrix](../../com.aspose.drawing.drawing2d/matrix).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| angle | float | The angle of the rotation, in degrees. |
| order | int | A [MatrixOrder](../../com.aspose.drawing.drawing2d/matrixorder) that specifies the order (append or prepend) in which the rotation is applied to this [Matrix](../../com.aspose.drawing.drawing2d/matrix). |

### reset() {#reset--}
```
public void reset()
```


Resets this [Matrix](../../com.aspose.drawing.drawing2d/matrix) to have the elements of the identity matrix.

