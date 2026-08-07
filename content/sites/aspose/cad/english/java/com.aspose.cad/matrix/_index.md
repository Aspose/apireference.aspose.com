---
title: "Matrix"
linktitle: "Matrix"
second_title: "Aspose.CAD for Java"
description: "Replaces the GDI+ Matrix."
type: docs
weight: 10
url: /java/com.aspose.cad/matrix/
---

Replaces the GDI+ Matrix. Most algorithms taken from Sun's AffineTransform.java. Java's names for matrix elements used internally. Map of java names to .net ones to description: m00 M11 Scale X m10 M12 Shear Y m01 M21 Shear X m11 M22 Scale Y m02 M31 Translate X m12 M32 Translate Y

## Constructors

| Constructor | Description |
| --- | --- |
| [Matrix()](#Matrix) | Initializes a new instance of the Matrix class as the identity matrix. |
| [Matrix(float m11, float m12, float m21, float m22, float m31, float m32)](#Matrix-float-float-float-float-float-float) | Initializes a new instance of the Matrix class. |
| [Matrix(com.aspose.cad.RectangleF rect, com.aspose.cad.PointF[] plgpts)](#Matrix-com.aspose.cad.RectangleF-com.aspose.cad.PointF:A) | Initializes a new instance of the Aspose.CAD.Matrix class to the geometric transform defined by the specified rectangle and array of points. |
| [Matrix(com.aspose.cad.Rectangle rect, com.aspose.cad.Point[] plgpts)](#Matrix-com.aspose.cad.Rectangle-com.aspose.cad.Point:A) | Initializes a new instance of the Aspose.CAD.Matrix class to the geometric transform defined by the specified rectangle and array of points. |

## Fields

| Field | Description |
| --- | --- |
| [TYPE_IDENTITY](#TYPE_IDENTITY) | An identity transform is one in which the output coordinates are always the same as the input coordinates. If this transform is anything other than the identity transform, the type will either be the constant GENERAL_TRANSFORM or a combination of the appropriate flag bits for the various coordinate conversions that this transform performs. |
| [TYPE_TRANSLATION](#TYPE_TRANSLATION) | A translation moves the coordinates by a constant amount in x and y without changing the length or angle of vectors. |
| [TYPE_UNIFORM_SCALE](#TYPE_UNIFORM_SCALE) | A uniform scale multiplies the length of vectors by the same amount in both the x and y directions without changing the angle between vectors. This flag bit is mutually exclusive with the TypeGeneralScale flag. |
| [TYPE_GENERAL_SCALE](#TYPE_GENERAL_SCALE) | A general scale multiplies the length of vectors by different amounts in the x and y directions without changing the angle between perpendicular vectors. This flag bit is mutually exclusive with the TypeUniformScale flag. |
| [TYPE_MASK_SCALE](#TYPE_MASK_SCALE) | This constant is a bit mask for any of the scale flag bits. |
| [TYPE_FLIP](#TYPE_FLIP) | This flag bit indicates that the transform defined by this object performs a mirror image flip about some axis which changes the normally right handed coordinate system into a left handed system in addition to the conversions indicated by other flag bits. A right handed coordinate system is one where the positive X axis rotates counterclockwise to overlay the positive Y axis similar to the direction that the fingers on your right hand curl when you stare end on at your thumb. A left handed coordinate system is one where the positive X axis rotates clockwise to overlay the positive Y axis similar to the direction that the fingers on your left hand curl. There is no mathematical way to determine the angle of the original flipping or mirroring transformation since all angles of flip are identical given an appropriate adjusting rotation. NOTE: TypeFlip was added after GENERAL_TRANSFORM was in public circulation and the flag bits could no longer be conveniently renumbered without introducing binary incompatibility in outside code. |
| [TYPE_QUADRANT_ROTATION](#TYPE_QUADRANT_ROTATION) | This flag bit indicates that the transform defined by this object performs a quadrant rotation by some multiple of 90 degrees in addition to the conversions indicated by other flag bits. A rotation changes the angles of vectors by the same amount regardless of the original direction of the vector and without changing the length of the vector. This flag bit is mutually exclusive with the TypeGeneralRotation flag. |
| [TYPE_GENERAL_ROTATION](#TYPE_GENERAL_ROTATION) | This flag bit indicates that the transform defined by this object performs a rotation by an arbitrary angle in addition to the conversions indicated by other flag bits. A rotation changes the angles of vectors by the same amount regardless of the original direction of the vector and without changing the length of the vector. This flag bit is mutually exclusive with the |
| [TYPE_MASK_ROTATION](#TYPE_MASK_ROTATION) | This constant is a bit mask for any of the rotation flag bits. |
| [TYPE_GENERAL_TRANSFORM](#TYPE_GENERAL_TRANSFORM) | This constant indicates that the transform defined by this object performs an arbitrary conversion of the input coordinates. If this transform can be classified by any of the above constants, the type will either be the constant TypeIdentity or a combination of the appropriate flag bits for the various coordinate conversions that this transform performs. |

## Methods

| Method | Description |
| --- | --- |
| [getElements()](#getElements) | Gets an array of floating-point values that represents the elements of this Matrix . |
| [getM11()](#getM11) | Gets the matrix element at first row first column. Represents scale along X axis. |
| [getM12()](#getM12) | Gets the matrix element at first row second column. Represents shear along Y axis. |
| [getM21()](#getM21) | Gets the matrix element at second row first column. Represents shear along X axis. |
| [getM22()](#getM22) | Gets the matrix element at second row second column. Represents scale along Y axis. |
| [getM31()](#getM31) | Gets the matrix element at third row first column. Represents translation along X axis. |
| [getM32()](#getM32) | Gets the matrix element at third row first column. Represents translation along Y axis. |
| [toString()](#toString) | Returns a System.String that represents this instance. |
| [op_Equality(Matrix matrix1, Matrix matrix2)](#op_Equality-com.aspose.cad.Matrix-com.aspose.cad.Matrix) | Implements the operator ==. |
| [op_Inequality(Matrix matrix1, Matrix matrix2)](#op_Inequality-com.aspose.cad.Matrix-com.aspose.cad.Matrix) | Implements the operator !=. |
| [transformPoints(com.aspose.cad.PointF[] points)](#transformPoints-com.aspose.cad.PointF:A) | Applies the geometric transform represented by this Matrix to a specified array of points. |
| [scale(float scaleX, float scaleY, int order)](#scale-float-float-int) | Applies the specified scale vector (scaleX and scaleY) to this Matrix using the specified order. |
| [scale(float sx, float sy)](#scale-float-float) | Applies the specified scale vector (scaleX and scaleY) to this Matrix using (default) Prepend order. |
| [translate(float offsetX, float offsetY, int order)](#translate-float-float-int) | Applies the specified translation vector to this Matrix in the specified order. |
| [translate(float tx, float ty)](#translate-float-float) | Applies the specified translation vector to this Matrix using (default) Prepend order. |
| [multiply(Matrix Tx, int order)](#multiply-com.aspose.cad.Matrix-int) | Multiplies this Matrix by the matrix specified in the matrix parameter, and in the order specified in the order parameter. |
| [multiply(Matrix Tx)](#multiply-com.aspose.cad.Matrix) | Multiplies this Matrix by the matrix specified in the matrix parameter using (default) Prepend order. |
| [rotate(float angle, int order)](#rotate-float-int) | Applies a clockwise rotation of an amount specified in the angle parameter, around the origin (zero x and y coordinates) for this Matrix in the specified order. |
| [rotate(float angle)](#rotate-float) | Applies a clockwise rotation of an amount specified in the angle parameter, around the origin (zero x and y coordinates) for this Matrix in the default (Prepend) order. |
| [rotateAt(float angle, com.aspose.cad.PointF point, int order)](#rotateAt-float-com.aspose.cad.PointF-int) | Applies a clockwise rotation about the specified point to this Matrix in the specified order. |
| [rotateAt(float angle, com.aspose.cad.PointF point)](#rotateAt-float-com.aspose.cad.PointF) | Applies a clockwise rotation about the specified point to this Matrix in the default (Prepend) order. |
| [reset()](#reset) | Resets this Matrix to have the elements of the identity matrix. |
| [hashCode()](#hashCode) | Returns a hash code for this instance. |
| [equals(Object obj)](#equals-java.lang.Object) | Determines whether the specified System.Object is equal to this instance. |
| [equals(Matrix a, Matrix b)](#equals-com.aspose.cad.Matrix-com.aspose.cad.Matrix) | Determines whether two matrixes are equal. |

### Matrix() {#Matrix}
```java
public Matrix()
```

Initializes a new instance of the Matrix class as the identity matrix.

### Matrix(float m11, float m12, float m21, float m22, float m31, float m32) {#Matrix-float-float-float-float-float-float}
```java
public Matrix(float m11, float m12, float m21, float m22, float m31, float m32)
```

Initializes a new instance of the Matrix class.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| m11 | float | m00 M11 Scale X |
| m12 | float | m10 M12 Shear Y |
| m21 | float | m01 M21 Shear X |
| m22 | float | m11 M22 Scale Y |
| m31 | float | m02 M31 Translate X |
| m32 | float | m12 M32 Translate Y |

### Matrix(com.aspose.cad.RectangleF rect, com.aspose.cad.PointF[] plgpts) {#Matrix-com.aspose.cad.RectangleF-com.aspose.cad.PointF:A}
```java
public Matrix(com.aspose.cad.RectangleF rect, com.aspose.cad.PointF[] plgpts)
```

Initializes a new instance of the Aspose.CAD.Matrix class to the geometric transform defined by the specified rectangle and array of points.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| rect | com.aspose.cad.RectangleF | A Aspose.CAD.RectangleF structure that represents the rectangle to be transformed. |
| plgpts | com.aspose.cad.PointF[] | An array of three Aspose.CAD.PointF structures that represents the points of a parallelogram to which the upper-left, upper-right, and lower-left corners of the rectangle is to be transformed. The lower-right corner of the parallelogram is implied by the first three corners. |

### Matrix(com.aspose.cad.Rectangle rect, com.aspose.cad.Point[] plgpts) {#Matrix-com.aspose.cad.Rectangle-com.aspose.cad.Point:A}
```java
public Matrix(com.aspose.cad.Rectangle rect, com.aspose.cad.Point[] plgpts)
```

Initializes a new instance of the Aspose.CAD.Matrix class to the geometric transform defined by the specified rectangle and array of points.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| rect | com.aspose.cad.Rectangle | A Aspose.CAD.Rectangle structure that represents the rectangle to be transformed. |
| plgpts | com.aspose.cad.Point[] | An array of three Aspose.CAD.Point structures that represents the points of a parallelogram to which the upper-left, upper-right, and lower-left corners of the rectangle is to be transformed. The lower-right corner of the parallelogram is implied by the first three corners. |

### TYPE_IDENTITY {#TYPE_IDENTITY}
```java
public static final int TYPE_IDENTITY
```

An identity transform is one in which the output coordinates are always the same as the input coordinates. If this transform is anything other than the identity transform, the type will either be the constant GENERAL_TRANSFORM or a combination of the appropriate flag bits for the various coordinate conversions that this transform performs.

**Returns:** int

### TYPE_TRANSLATION {#TYPE_TRANSLATION}
```java
public static final int TYPE_TRANSLATION
```

A translation moves the coordinates by a constant amount in x and y without changing the length or angle of vectors.

**Returns:** int

### TYPE_UNIFORM_SCALE {#TYPE_UNIFORM_SCALE}
```java
public static final int TYPE_UNIFORM_SCALE
```

A uniform scale multiplies the length of vectors by the same amount in both the x and y directions without changing the angle between vectors. This flag bit is mutually exclusive with the TypeGeneralScale flag.

**Returns:** int

### TYPE_GENERAL_SCALE {#TYPE_GENERAL_SCALE}
```java
public static final int TYPE_GENERAL_SCALE
```

A general scale multiplies the length of vectors by different amounts in the x and y directions without changing the angle between perpendicular vectors. This flag bit is mutually exclusive with the TypeUniformScale flag.

**Returns:** int

### TYPE_MASK_SCALE {#TYPE_MASK_SCALE}
```java
public static final int TYPE_MASK_SCALE
```

This constant is a bit mask for any of the scale flag bits.

**Returns:** int

### TYPE_FLIP {#TYPE_FLIP}
```java
public static final int TYPE_FLIP
```

This flag bit indicates that the transform defined by this object performs a mirror image flip about some axis which changes the normally right handed coordinate system into a left handed system in addition to the conversions indicated by other flag bits. A right handed coordinate system is one where the positive X axis rotates counterclockwise to overlay the positive Y axis similar to the direction that the fingers on your right hand curl when you stare end on at your thumb. A left handed coordinate system is one where the positive X axis rotates clockwise to overlay the positive Y axis similar to the direction that the fingers on your left hand curl. There is no mathematical way to determine the angle of the original flipping or mirroring transformation since all angles of flip are identical given an appropriate adjusting rotation. NOTE: TypeFlip was added after GENERAL_TRANSFORM was in public circulation and the flag bits could no longer be conveniently renumbered without introducing binary incompatibility in outside code.

**Returns:** int

### TYPE_QUADRANT_ROTATION {#TYPE_QUADRANT_ROTATION}
```java
public static final int TYPE_QUADRANT_ROTATION
```

This flag bit indicates that the transform defined by this object performs a quadrant rotation by some multiple of 90 degrees in addition to the conversions indicated by other flag bits. A rotation changes the angles of vectors by the same amount regardless of the original direction of the vector and without changing the length of the vector. This flag bit is mutually exclusive with the TypeGeneralRotation flag.

**Returns:** int

### TYPE_GENERAL_ROTATION {#TYPE_GENERAL_ROTATION}
```java
public static final int TYPE_GENERAL_ROTATION
```

This flag bit indicates that the transform defined by this object performs a rotation by an arbitrary angle in addition to the conversions indicated by other flag bits. A rotation changes the angles of vectors by the same amount regardless of the original direction of the vector and without changing the length of the vector. This flag bit is mutually exclusive with the

**Returns:** int

### TYPE_MASK_ROTATION {#TYPE_MASK_ROTATION}
```java
public static final int TYPE_MASK_ROTATION
```

This constant is a bit mask for any of the rotation flag bits.

**Returns:** int

### TYPE_GENERAL_TRANSFORM {#TYPE_GENERAL_TRANSFORM}
```java
public static final int TYPE_GENERAL_TRANSFORM
```

This constant indicates that the transform defined by this object performs an arbitrary conversion of the input coordinates. If this transform can be classified by any of the above constants, the type will either be the constant TypeIdentity or a combination of the appropriate flag bits for the various coordinate conversions that this transform performs.

**Returns:** int

### getElements() {#getElements}
```java
public float[] getElements()
```

Gets an array of floating-point values that represents the elements of this Matrix .

**Returns:** float[] - An array of floating-point values that represents the elements of this Matrix .

### getM11() {#getM11}
```java
public float getM11()
```

Gets the matrix element at first row first column. Represents scale along X axis.

**Returns:** float

### getM12() {#getM12}
```java
public float getM12()
```

Gets the matrix element at first row second column. Represents shear along Y axis.

**Returns:** float

### getM21() {#getM21}
```java
public float getM21()
```

Gets the matrix element at second row first column. Represents shear along X axis.

**Returns:** float

### getM22() {#getM22}
```java
public float getM22()
```

Gets the matrix element at second row second column. Represents scale along Y axis.

**Returns:** float

### getM31() {#getM31}
```java
public float getM31()
```

Gets the matrix element at third row first column. Represents translation along X axis.

**Returns:** float

### getM32() {#getM32}
```java
public float getM32()
```

Gets the matrix element at third row first column. Represents translation along Y axis.

**Returns:** float

### toString() {#toString}
```java
public String toString()
```

Returns a System.String that represents this instance.

**Returns:** String - A System.String that represents this instance.

### op_Equality(Matrix matrix1, Matrix matrix2) {#op_Equality-com.aspose.cad.Matrix-com.aspose.cad.Matrix}
```java
public static boolean op_Equality(Matrix matrix1, Matrix matrix2)
```

Implements the operator ==.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| matrix1 | Matrix | The first matrix to compare. |
| matrix2 | Matrix | The second matrix to compare. |

**Returns:** boolean - The result of the operator.

### op_Inequality(Matrix matrix1, Matrix matrix2) {#op_Inequality-com.aspose.cad.Matrix-com.aspose.cad.Matrix}
```java
public static boolean op_Inequality(Matrix matrix1, Matrix matrix2)
```

Implements the operator !=.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| matrix1 | Matrix | The first matrix to compare. |
| matrix2 | Matrix | The second matrix to compare. |

**Returns:** boolean - The result of the operator.

### transformPoints(com.aspose.cad.PointF[] points) {#transformPoints-com.aspose.cad.PointF:A}
```java
public void transformPoints(com.aspose.cad.PointF[] points)
```

Applies the geometric transform represented by this Matrix to a specified array of points.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| points | com.aspose.cad.PointF[] | The points. |

### scale(float scaleX, float scaleY, int order) {#scale-float-float-int}
```java
public void scale(float scaleX, float scaleY, int order)
```

Applies the specified scale vector (scaleX and scaleY) to this Matrix using the specified order.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| scaleX | float | The scale X. |
| scaleY | float | The scale Y. |
| order | int | The order. |

### scale(float sx, float sy) {#scale-float-float}
```java
public void scale(float sx, float sy)
```

Applies the specified scale vector (scaleX and scaleY) to this Matrix using (default) Prepend order.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| sx | float | The sx. The sx. The sx. |
| sy | float | The sy. The sy. The sy. |

### translate(float offsetX, float offsetY, int order) {#translate-float-float-int}
```java
public void translate(float offsetX, float offsetY, int order)
```

Applies the specified translation vector to this Matrix in the specified order.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| offsetX | float | The offset X. |
| offsetY | float | The offset Y. |
| order | int | The order. |

### translate(float tx, float ty) {#translate-float-float}
```java
public void translate(float tx, float ty)
```

Applies the specified translation vector to this Matrix using (default) Prepend order.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| tx | float | The tx. The tx. The tx. |
| ty | float | The ty. The ty. The ty. |

### multiply(Matrix Tx, int order) {#multiply-com.aspose.cad.Matrix-int}
```java
public void multiply(Matrix Tx, int order)
```

Multiplies this Matrix by the matrix specified in the matrix parameter, and in the order specified in the order parameter.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| Tx | Matrix | The tx. The tx. The tx. |
| order | int | The order. The order. The order. |

### multiply(Matrix Tx) {#multiply-com.aspose.cad.Matrix}
```java
public void multiply(Matrix Tx)
```

Multiplies this Matrix by the matrix specified in the matrix parameter using (default) Prepend order.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| Tx | Matrix | The matrix to multiply with. |

### rotate(float angle, int order) {#rotate-float-int}
```java
public void rotate(float angle, int order)
```

Applies a clockwise rotation of an amount specified in the angle parameter, around the origin (zero x and y coordinates) for this Matrix in the specified order.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| angle | float | The rotate angle. |
| order | int | The matrix order. |

### rotate(float angle) {#rotate-float}
```java
public void rotate(float angle)
```

Applies a clockwise rotation of an amount specified in the angle parameter, around the origin (zero x and y coordinates) for this Matrix in the default (Prepend) order.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| angle | float | The rotate angle. |

### rotateAt(float angle, com.aspose.cad.PointF point, int order) {#rotateAt-float-com.aspose.cad.PointF-int}
```java
public void rotateAt(float angle, com.aspose.cad.PointF point, int order)
```

Applies a clockwise rotation about the specified point to this Matrix in the specified order.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| angle | float | The angle. |
| point | com.aspose.cad.PointF | The point. |
| order | int | The order. |

### rotateAt(float angle, com.aspose.cad.PointF point) {#rotateAt-float-com.aspose.cad.PointF}
```java
public void rotateAt(float angle, com.aspose.cad.PointF point)
```

Applies a clockwise rotation about the specified point to this Matrix in the default (Prepend) order.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| angle | float | The angle. |
| point | com.aspose.cad.PointF | The point. |

### reset() {#reset}
```java
public void reset()
```

Resets this Matrix to have the elements of the identity matrix.

### hashCode() {#hashCode}
```java
public int hashCode()
```

Returns a hash code for this instance.

**Returns:** int - A hash code for this instance, suitable for use in hashing algorithms and data structures like a hash table.

### equals(Object obj) {#equals-java.lang.Object}
```java
public boolean equals(Object obj)
```

Determines whether the specified System.Object is equal to this instance.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| obj | Object | The System.Object to compare with this instance. |

**Returns:** boolean - true if the specified System.Object is equal to this instance; otherwise, false .

**Throws:**

- `T:System.NullReferenceException` - The obj parameter is null.

### equals(Matrix a, Matrix b) {#equals-com.aspose.cad.Matrix-com.aspose.cad.Matrix}
```java
public static boolean equals(Matrix a, Matrix b)
```

Determines whether two matrixes are equal.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| a | Matrix | The first matrix to compare. |
| b | Matrix | The second matrix to compare. |

**Returns:** boolean - True if matrixes are equal.

