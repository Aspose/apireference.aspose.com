---
title: "TransformationMatrix"
linktitle: "TransformationMatrix"
second_title: "Aspose.CAD for Java"
description: "Represents 3d transformation matrix"
type: docs
weight: 10
url: /java/com.aspose.cad.exporters.cadapsentitiesexporter.cadaps3d/transformationmatrix/
---

**All Implemented Interfaces:** com.aspose.ms.System.ICloneable

Represents 3d transformation matrix

## Constructors

| Constructor | Description |
| --- | --- |
| [TransformationMatrix()](#TransformationMatrix) | Initializes a new instance of the TransformationMatrix class |
| [TransformationMatrix(double[] items, boolean inverseRowCol)](#TransformationMatrix-double:A-boolean) | Initializes a new instance of the TransformationMatrix class. |

## Methods

| Method | Description |
| --- | --- |
| [getMatrix()](#getMatrix) | Gets or sets transformation matrix. |
| [setMatrix(double[][] value)](#setMatrix-double:A:A) | Gets or sets transformation matrix. |
| [copy(TransformationMatrix matrix)](#copy-com.aspose.cad.exporters.cadapsentitiesexporter.cadaps3d.TransformationMatrix) | Performs copy of one TransformationMatrix into other. |
| [scale(double sx, double sy, double sz)](#scale-double-double-double) | Scaling of a matrix |
| [fromAxis(Point3D xAxis, Point3D yAxis, Point3D zAxis)](#fromAxis-com.aspose.cad.exporters.cadapsentitiesexporter.cadaps3d.Point3D-com.aspose.cad.exporters.cadapsentitiesexporter.cadaps3d.Point3D-com.aspose.cad.exporters.cadapsentitiesexporter.cadaps3d.Point3D) | From the axis. |
| [rotateX(double theta)](#rotateX-double) | Rotation matrix around X |
| [rotateY(double theta)](#rotateY-double) | Rotation matrix around Y |
| [rotateZ(double theta)](#rotateZ-double) | Rotation matrix around Z |
| [topView()](#topView) | TopView matrix |
| [frontView()](#frontView) | FrontView matrix |
| [sideView()](#sideView) | SideView matrix |
| [op_Multiply(TransformationMatrix matrix, double value)](#op_Multiply-com.aspose.cad.exporters.cadapsentitiesexporter.cadaps3d.TransformationMatrix-double) | Multiplies matrix by value. |
| [op_Addition(TransformationMatrix matrix1, TransformationMatrix matrix2)](#op_Addition-com.aspose.cad.exporters.cadapsentitiesexporter.cadaps3d.TransformationMatrix-com.aspose.cad.exporters.cadapsentitiesexporter.cadaps3d.TransformationMatrix) | Performs summation of two matrices. |
| [perspective(double fov, double aspect, double near, double far, double distance)](#perspective-double-double-double-double-double) | Creates perspective matrix. |
| [transpose(TransformationMatrix initialMatrix)](#transpose-com.aspose.cad.exporters.cadapsentitiesexporter.cadaps3d.TransformationMatrix) | Performs transposing of matrix. |
| [axonometric(double alpha, double beta)](#axonometric-double-double) | Axonometric projection |
| [translate(double dx, double dy, double dz)](#translate-double-double-double) | Translation matrix |
| [op_Multiply(TransformationMatrix matrix1, TransformationMatrix matrix2)](#op_Multiply-com.aspose.cad.exporters.cadapsentitiesexporter.cadaps3d.TransformationMatrix-com.aspose.cad.exporters.cadapsentitiesexporter.cadaps3d.TransformationMatrix) | Matrix multiplication operator. |
| [vectorMultiply(double[] point)](#vectorMultiply-double:A) | Applies transformation to point |
| [getWCS(Point3D normalVector)](#getWCS-com.aspose.cad.exporters.cadapsentitiesexporter.cadaps3d.Point3D) | WCSs the specified normal vector. |
| [ucsToWcs(Point3D vX, Point3D vY)](#ucsToWcs-com.aspose.cad.exporters.cadapsentitiesexporter.cadaps3d.Point3D-com.aspose.cad.exporters.cadapsentitiesexporter.cadaps3d.Point3D) | Ucses to WCS. |
| [oCStoWCS(Point3D normalVector)](#oCStoWCS-com.aspose.cad.exporters.cadapsentitiesexporter.cadaps3d.Point3D) | Transforms OCS coordinates to WSC |
| [invert()](#invert) | Given an nXn matrix A, solve n linear equations to find the inverse of A. |
| [deepClone()](#deepClone) |  |
| [determinant()](#determinant) | Estimates determinant of a matrix. |

### TransformationMatrix() {#TransformationMatrix}
```java
public TransformationMatrix()
```

Initializes a new instance of the TransformationMatrix class

### TransformationMatrix(double[] items, boolean inverseRowCol) {#TransformationMatrix-double:A-boolean}
```java
public TransformationMatrix(double[] items, boolean inverseRowCol)
```

Initializes a new instance of the TransformationMatrix class.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| items | double[] | The items. |
| inverseRowCol | boolean | if set to true [inverse row col]. |

### getMatrix() {#getMatrix}
```java
public double[][] getMatrix()
```

Gets or sets transformation matrix.

**Returns:** double[][]

### setMatrix(double[][] value) {#setMatrix-double:A:A}
```java
public void setMatrix(double[][] value)
```

Gets or sets transformation matrix.

### copy(TransformationMatrix matrix) {#copy-com.aspose.cad.exporters.cadapsentitiesexporter.cadaps3d.TransformationMatrix}
```java
public static TransformationMatrix copy(TransformationMatrix matrix)
```

Performs copy of one TransformationMatrix into other.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| matrix | TransformationMatrix | Matrix to copy values from. |

**Returns:** TransformationMatrix - Copy matrix.

### scale(double sx, double sy, double sz) {#scale-double-double-double}
```java
public static TransformationMatrix scale(double sx, double sy, double sz)
```

Scaling of a matrix

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| sx | double | X scale value |
| sy | double | Y scale value |
| sz | double | Z scale value |

**Returns:** TransformationMatrix - Scaling matrix

### fromAxis(Point3D xAxis, Point3D yAxis, Point3D zAxis) {#fromAxis-com.aspose.cad.exporters.cadapsentitiesexporter.cadaps3d.Point3D-com.aspose.cad.exporters.cadapsentitiesexporter.cadaps3d.Point3D-com.aspose.cad.exporters.cadapsentitiesexporter.cadaps3d.Point3D}
```java
public static TransformationMatrix fromAxis(Point3D xAxis, Point3D yAxis, Point3D zAxis)
```

From the axis.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| xAxis | Point3D | The x axis. |
| yAxis | Point3D | The y axis. |
| zAxis | Point3D | The z axis. |

**Returns:** TransformationMatrix

### rotateX(double theta) {#rotateX-double}
```java
public static TransformationMatrix rotateX(double theta)
```

Rotation matrix around X

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| theta | double | Angle of rotation |

**Returns:** TransformationMatrix - Rotation matrix

### rotateY(double theta) {#rotateY-double}
```java
public static TransformationMatrix rotateY(double theta)
```

Rotation matrix around Y

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| theta | double | Angle of rotation |

**Returns:** TransformationMatrix - Rotation matrix

### rotateZ(double theta) {#rotateZ-double}
```java
public static TransformationMatrix rotateZ(double theta)
```

Rotation matrix around Z

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| theta | double | Angle of rotation |

**Returns:** TransformationMatrix - Rotation matrix

### topView() {#topView}
```java
public static TransformationMatrix topView()
```

TopView matrix

**Returns:** TransformationMatrix - Top view matrix

### frontView() {#frontView}
```java
public static TransformationMatrix frontView()
```

FrontView matrix

**Returns:** TransformationMatrix - Front view matrix

### sideView() {#sideView}
```java
public static TransformationMatrix sideView()
```

SideView matrix

**Returns:** TransformationMatrix - Side view matrix

### op_Multiply(TransformationMatrix matrix, double value) {#op_Multiply-com.aspose.cad.exporters.cadapsentitiesexporter.cadaps3d.TransformationMatrix-double}
```java
public static TransformationMatrix op_Multiply(TransformationMatrix matrix, double value)
```

Multiplies matrix by value.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| matrix | TransformationMatrix | Matrix to multiply. |
| value | double | Value to multiply matrix on. |

**Returns:** TransformationMatrix - Matrix multiplied by a factor.

### op_Addition(TransformationMatrix matrix1, TransformationMatrix matrix2) {#op_Addition-com.aspose.cad.exporters.cadapsentitiesexporter.cadaps3d.TransformationMatrix-com.aspose.cad.exporters.cadapsentitiesexporter.cadaps3d.TransformationMatrix}
```java
public static TransformationMatrix op_Addition(TransformationMatrix matrix1, TransformationMatrix matrix2)
```

Performs summation of two matrices.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| matrix1 | TransformationMatrix | First matrix. |
| matrix2 | TransformationMatrix | Second matrix. |

**Returns:** TransformationMatrix - Summary matrix.

### perspective(double fov, double aspect, double near, double far, double distance) {#perspective-double-double-double-double-double}
```java
public static TransformationMatrix perspective(double fov, double aspect, double near, double far, double distance)
```

Creates perspective matrix.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| fov | double | Field of view value. |
| aspect | double | Aspect ratio. |
| near | double | Near Z value. |
| far | double | Far Z value. |
| distance | double | Distance to object. |

**Returns:** TransformationMatrix - Perspective transformation matrix.

### transpose(TransformationMatrix initialMatrix) {#transpose-com.aspose.cad.exporters.cadapsentitiesexporter.cadaps3d.TransformationMatrix}
```java
public static TransformationMatrix transpose(TransformationMatrix initialMatrix)
```

Performs transposing of matrix.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| initialMatrix | TransformationMatrix | Matrix to transpose. |

**Returns:** TransformationMatrix - Transposed matrix.

### axonometric(double alpha, double beta) {#axonometric-double-double}
```java
public static TransformationMatrix axonometric(double alpha, double beta)
```

Axonometric projection

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| alpha | double | Alpha angle |
| beta | double | Beta angle |

**Returns:** TransformationMatrix - Axonometric matrix

### translate(double dx, double dy, double dz) {#translate-double-double-double}
```java
public static TransformationMatrix translate(double dx, double dy, double dz)
```

Translation matrix

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| dx | double | X shift value |
| dy | double | Y shift value |
| dz | double | Z shift value |

**Returns:** TransformationMatrix - Shift matrix

### op_Multiply(TransformationMatrix matrix1, TransformationMatrix matrix2) {#op_Multiply-com.aspose.cad.exporters.cadapsentitiesexporter.cadaps3d.TransformationMatrix-com.aspose.cad.exporters.cadapsentitiesexporter.cadaps3d.TransformationMatrix}
```java
public static TransformationMatrix op_Multiply(TransformationMatrix matrix1, TransformationMatrix matrix2)
```

Matrix multiplication operator.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| matrix1 | TransformationMatrix | First matrix. |
| matrix2 | TransformationMatrix | Second matrix. |

**Returns:** TransformationMatrix - Multiplication of a matrices.

### vectorMultiply(double[] point) {#vectorMultiply-double:A}
```java
public double[] vectorMultiply(double[] point)
```

Applies transformation to point

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| point | double[] | Point to transform |

**Returns:** double[] - Transformed point

### getWCS(Point3D normalVector) {#getWCS-com.aspose.cad.exporters.cadapsentitiesexporter.cadaps3d.Point3D}
```java
public static TransformationMatrix getWCS(Point3D normalVector)
```

WCSs the specified normal vector.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| normalVector | Point3D | The normal vector. |

**Returns:** TransformationMatrix

### ucsToWcs(Point3D vX, Point3D vY) {#ucsToWcs-com.aspose.cad.exporters.cadapsentitiesexporter.cadaps3d.Point3D-com.aspose.cad.exporters.cadapsentitiesexporter.cadaps3d.Point3D}
```java
public static TransformationMatrix ucsToWcs(Point3D vX, Point3D vY)
```

Ucses to WCS.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| vX | Point3D | The v x. |
| vY | Point3D | The v y. |

**Returns:** TransformationMatrix

### oCStoWCS(Point3D normalVector) {#oCStoWCS-com.aspose.cad.exporters.cadapsentitiesexporter.cadaps3d.Point3D}
```java
public static TransformationMatrix oCStoWCS(Point3D normalVector)
```

Transforms OCS coordinates to WSC

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| normalVector | Point3D | Normal vector. |

**Returns:** TransformationMatrix - Transformatuon matrix.

### invert() {#invert}
```java
public TransformationMatrix invert()
```

Given an nXn matrix A, solve n linear equations to find the inverse of A.

**Returns:** TransformationMatrix - Inverted matrix

### deepClone() {#deepClone}
```java
public Object deepClone()
```

**Returns:** Object

### determinant() {#determinant}
```java
public double determinant()
```

Estimates determinant of a matrix.

**Returns:** double - Determinant value.

