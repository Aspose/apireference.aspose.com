---
title: "Cad3DPoint"
linktitle: "Cad3DPoint"
second_title: "Aspose.CAD for Java"
description: "The Cad point."
type: docs
weight: 10
url: /java/com.aspose.cad.fileformats.cad.cadobjects/cad3dpoint/
---

**Inheritance:** java.lang.Object, Cad2DPoint

The Cad point.

## Constructors

| Constructor | Description |
| --- | --- |
| [Cad3DPoint()](#Cad3DPoint) | Initializes a new instance of the Cad3DPoint class. |
| [Cad3DPoint(double x, double y, double z)](#Cad3DPoint-double-double-double) | Initializes a new instance of the Cad3DPoint class. |
| [Cad3DPoint(double x, double y)](#Cad3DPoint-double-double) | Initializes a new instance of the Cad3DPoint class. |

## Methods

| Method | Description |
| --- | --- |
| [getZ()](#getZ) | Gets or sets the z. |
| [setZ(double value)](#setZ-double) | Gets or sets the z. |
| [angleBetween3Points(Cad3DPoint a, Cad3DPoint b, Cad3DPoint c)](#angleBetween3Points-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint) | Angles the between3 points. |
| [rotatePoint(Cad3DPoint pointToRotate, Cad3DPoint centerPoint, double angleInRadians)](#rotatePoint-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint-double) | Rotates one point arount another one |
| [distance(Cad3DPoint destination)](#distance-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint) | The distance. |
| [length()](#length) | The length. |
| [cross(Cad3DPoint vc1, Cad3DPoint vc2)](#cross-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint) | The cross product of two vectors. |
| [dot(Cad3DPoint vc1, Cad3DPoint vc2)](#dot-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint) | The dot product of two vectors. |
| [min(Cad3DPoint pt1, Cad3DPoint pt2)](#min-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint) | The minimum of two points. |
| [max(Cad3DPoint pt1, Cad3DPoint pt2)](#max-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint) | The maximum of two points. |
| [inverse()](#inverse) | Inverses this instance. |
| [op_Addition(Cad3DPoint pt1, Cad3DPoint pt2)](#op_Addition-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint) | Sum of two points |
| [op_Subtraction(Cad3DPoint pt1, Cad3DPoint pt2)](#op_Subtraction-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint) | Diff of two points |
| [op_Multiply(Cad3DPoint pt, double sc)](#op_Multiply-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint-double) | Multiplication of a point and a scalar |

### Cad3DPoint() {#Cad3DPoint}
```java
public Cad3DPoint()
```

Initializes a new instance of the Cad3DPoint class.

### Cad3DPoint(double x, double y, double z) {#Cad3DPoint-double-double-double}
```java
public Cad3DPoint(double x, double y, double z)
```

Initializes a new instance of the Cad3DPoint class.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| x | double | The x ordinate. |
| y | double | The y ordinate. |
| z | double | The z ordinate. |

### Cad3DPoint(double x, double y) {#Cad3DPoint-double-double}
```java
public Cad3DPoint(double x, double y)
```

Initializes a new instance of the Cad3DPoint class.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| x | double | The pointX. |
| y | double | The point Y. |

### getZ() {#getZ}
```java
public final double getZ()
```

Gets or sets the z.

**Returns:** double

### setZ(double value) {#setZ-double}
```java
public final void setZ(double value)
```

Gets or sets the z.

### angleBetween3Points(Cad3DPoint a, Cad3DPoint b, Cad3DPoint c) {#angleBetween3Points-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint}
```java
public static double angleBetween3Points(Cad3DPoint a, Cad3DPoint b, Cad3DPoint c)
```

Angles the between3 points.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| a | Cad3DPoint | First Point |
| b | Cad3DPoint | second point |
| c | Cad3DPoint | third point |

**Returns:** double - Angle between 3 points

### rotatePoint(Cad3DPoint pointToRotate, Cad3DPoint centerPoint, double angleInRadians) {#rotatePoint-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint-double}
```java
public static Cad3DPoint rotatePoint(Cad3DPoint pointToRotate, Cad3DPoint centerPoint, double angleInRadians)
```

Rotates one point arount another one

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| pointToRotate | Cad3DPoint | the point to rotate |
| centerPoint | Cad3DPoint | the centre point of rotation |
| angleInRadians | double | The angle In Radians. |

**Returns:** Cad3DPoint - Rotated point

### distance(Cad3DPoint destination) {#distance-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint}
```java
public final double distance(Cad3DPoint destination)
```

The distance.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| destination | Cad3DPoint | The destination. |

**Returns:** double - The double .

### length() {#length}
```java
public final double length()
```

The length.

**Returns:** double - The double .

### cross(Cad3DPoint vc1, Cad3DPoint vc2) {#cross-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint}
```java
public static Cad3DPoint cross(Cad3DPoint vc1, Cad3DPoint vc2)
```

The cross product of two vectors.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| vc1 | Cad3DPoint | The first vector |
| vc2 | Cad3DPoint | The second vector |

**Returns:** Cad3DPoint - Result of cross

### dot(Cad3DPoint vc1, Cad3DPoint vc2) {#dot-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint}
```java
public static double dot(Cad3DPoint vc1, Cad3DPoint vc2)
```

The dot product of two vectors.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| vc1 | Cad3DPoint | The first vector |
| vc2 | Cad3DPoint | The second vector |

**Returns:** double - Result of dot

### min(Cad3DPoint pt1, Cad3DPoint pt2) {#min-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint}
```java
public static Cad3DPoint min(Cad3DPoint pt1, Cad3DPoint pt2)
```

The minimum of two points.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| pt1 | Cad3DPoint | The first point |
| pt2 | Cad3DPoint | The second point |

**Returns:** Cad3DPoint - Result of Min

### max(Cad3DPoint pt1, Cad3DPoint pt2) {#max-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint}
```java
public static Cad3DPoint max(Cad3DPoint pt1, Cad3DPoint pt2)
```

The maximum of two points.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| pt1 | Cad3DPoint | The first point |
| pt2 | Cad3DPoint | The second point |

**Returns:** Cad3DPoint - Result of Max

### inverse() {#inverse}
```java
public final Cad3DPoint inverse()
```

Inverses this instance.

**Returns:** Cad3DPoint - Result of Inverses

### op_Addition(Cad3DPoint pt1, Cad3DPoint pt2) {#op_Addition-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint}
```java
public static Cad3DPoint op_Addition(Cad3DPoint pt1, Cad3DPoint pt2)
```

Sum of two points

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| pt1 | Cad3DPoint | The first point |
| pt2 | Cad3DPoint | The second point |

**Returns:** Cad3DPoint - Returns the sum

### op_Subtraction(Cad3DPoint pt1, Cad3DPoint pt2) {#op_Subtraction-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint}
```java
public static Cad3DPoint op_Subtraction(Cad3DPoint pt1, Cad3DPoint pt2)
```

Diff of two points

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| pt1 | Cad3DPoint | The first point |
| pt2 | Cad3DPoint | The second point |

**Returns:** Cad3DPoint - Returns the diff

### op_Multiply(Cad3DPoint pt, double sc) {#op_Multiply-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint-double}
```java
public static Cad3DPoint op_Multiply(Cad3DPoint pt, double sc)
```

Multiplication of a point and a scalar

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| pt | Cad3DPoint | The point |
| sc | double | The scalar |

**Returns:** Cad3DPoint - Returns the sum

