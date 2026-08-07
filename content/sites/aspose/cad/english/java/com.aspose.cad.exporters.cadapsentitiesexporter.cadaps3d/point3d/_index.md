---
title: "Point3D"
linktitle: "Point3D"
second_title: "Aspose.CAD for Java"
description: "Represents class to work with 3D point and special operations for it."
type: docs
weight: 10
url: /java/com.aspose.cad.exporters.cadapsentitiesexporter.cadaps3d/point3d/
---

Represents class to work with 3D point and special operations for it.

## Constructors

| Constructor | Description |
| --- | --- |
| [Point3D()](#Point3D) | Initializes a new instance of the Point3D class |
| [Point3D(double x, double y, double z, double w)](#Point3D-double-double-double-double) | Initializes a new instance of the Point3D class |
| [Point3D(double x, double y)](#Point3D-double-double) | Initializes a new instance of the Point3D class |
| [Point3D(double x, double y, double z)](#Point3D-double-double-double) | Initializes a new instance of the Point3D class |
| [Point3D(com.aspose.foundation.rendering.ApsPoint apsPoint)](#Point3D-com.aspose.foundation.rendering.ApsPoint) | Initializes a new instance of the Point3D class. |

## Methods

| Method | Description |
| --- | --- |
| [getX()](#getX) | Gets or sets X coordinate |
| [setX(double value)](#setX-double) | Gets or sets X coordinate |
| [getY()](#getY) | Gets or sets Y coordinate |
| [setY(double value)](#setY-double) | Gets or sets Y coordinate |
| [getZ()](#getZ) | Gets or sets Z coordinate |
| [setZ(double value)](#setZ-double) | Gets or sets Z coordinate |
| [getW()](#getW) | Gets or sets W coordinate |
| [setW(double value)](#setW-double) | Gets or sets W coordinate |
| [distance(Point3D point1, Point3D point2)](#distance-com.aspose.cad.exporters.cadapsentitiesexporter.cadaps3d.Point3D-com.aspose.cad.exporters.cadapsentitiesexporter.cadaps3d.Point3D) | Gets distance between points |
| [spherical(double r, double theta, double phi)](#spherical-double-double-double) | Get point in spherical coordinates |
| [crossProduct(Point3D point1, Point3D point2)](#crossProduct-com.aspose.cad.exporters.cadapsentitiesexporter.cadaps3d.Point3D-com.aspose.cad.exporters.cadapsentitiesexporter.cadaps3d.Point3D) | Gets cross-product of a points |
| [dotProduct(Point3D point1, Point3D point2)](#dotProduct-com.aspose.cad.exporters.cadapsentitiesexporter.cadaps3d.Point3D-com.aspose.cad.exporters.cadapsentitiesexporter.cadaps3d.Point3D) | Gets dot product between two vectors. |
| [normalVector(Point3D point1, Point3D point2, Point3D point3)](#normalVector-com.aspose.cad.exporters.cadapsentitiesexporter.cadaps3d.Point3D-com.aspose.cad.exporters.cadapsentitiesexporter.cadaps3d.Point3D-com.aspose.cad.exporters.cadapsentitiesexporter.cadaps3d.Point3D) | Get normal vector of a plane. |
| [transform(TransformationMatrix matrix)](#transform-com.aspose.cad.exporters.cadapsentitiesexporter.cadaps3d.TransformationMatrix) | Applies transformation to a point |
| [transformNormalize(TransformationMatrix matrix)](#transformNormalize-com.aspose.cad.exporters.cadapsentitiesexporter.cadaps3d.TransformationMatrix) | Applies transformation with normalization. |
| [op_Equality(Point3D a, Point3D b)](#op_Equality-com.aspose.cad.exporters.cadapsentitiesexporter.cadaps3d.Point3D-com.aspose.cad.exporters.cadapsentitiesexporter.cadaps3d.Point3D) | Allows to compare 3D points. |
| [op_Inequality(Point3D a, Point3D b)](#op_Inequality-com.aspose.cad.exporters.cadapsentitiesexporter.cadaps3d.Point3D-com.aspose.cad.exporters.cadapsentitiesexporter.cadaps3d.Point3D) | Allows to compare 3D points. |
| [op_Subtraction(Point3D a, Point3D b)](#op_Subtraction-com.aspose.cad.exporters.cadapsentitiesexporter.cadaps3d.Point3D-com.aspose.cad.exporters.cadapsentitiesexporter.cadaps3d.Point3D) | Implements the operator -. |
| [op_Addition(Point3D a, Point3D b)](#op_Addition-com.aspose.cad.exporters.cadapsentitiesexporter.cadaps3d.Point3D-com.aspose.cad.exporters.cadapsentitiesexporter.cadaps3d.Point3D) | Implements the operator +. |
| [op_Multiply(Point3D point, double scale)](#op_Multiply-com.aspose.cad.exporters.cadapsentitiesexporter.cadaps3d.Point3D-double) | Implements the operator *. |
| [equals(Object obj)](#equals-java.lang.Object) | Allows to compare 3D points. |
| [equalsSoft(Object obj)](#equalsSoft-java.lang.Object) |  |
| [equalsSoft(Object obj, double eps)](#equalsSoft-java.lang.Object-double) | Allows to compare 3D points with specified threshold. |
| [hashCode()](#hashCode) | Return hash code for object. |
| [copy()](#copy) | Creates copy of current point |
| [normalize()](#normalize) | Normalizes the specified origin. |

### Point3D() {#Point3D}
```java
public Point3D()
```

Initializes a new instance of the Point3D class

### Point3D(double x, double y, double z, double w) {#Point3D-double-double-double-double}
```java
public Point3D(double x, double y, double z, double w)
```

Initializes a new instance of the Point3D class

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| x | double | X value |
| y | double | Y value |
| z | double | Z value |
| w | double | W value |

### Point3D(double x, double y) {#Point3D-double-double}
```java
public Point3D(double x, double y)
```

Initializes a new instance of the Point3D class

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| x | double | X value |
| y | double | Y value |

### Point3D(double x, double y, double z) {#Point3D-double-double-double}
```java
public Point3D(double x, double y, double z)
```

Initializes a new instance of the Point3D class

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| x | double | X value |
| y | double | Y value |
| z | double | Z value |

### Point3D(com.aspose.foundation.rendering.ApsPoint apsPoint) {#Point3D-com.aspose.foundation.rendering.ApsPoint}
```java
public Point3D(com.aspose.foundation.rendering.ApsPoint apsPoint)
```

Initializes a new instance of the Point3D class.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| apsPoint | com.aspose.foundation.rendering.ApsPoint | The cad2 d point. |

### getX() {#getX}
```java
public double getX()
```

Gets or sets X coordinate

**Returns:** double

### setX(double value) {#setX-double}
```java
public void setX(double value)
```

Gets or sets X coordinate

### getY() {#getY}
```java
public double getY()
```

Gets or sets Y coordinate

**Returns:** double

### setY(double value) {#setY-double}
```java
public void setY(double value)
```

Gets or sets Y coordinate

### getZ() {#getZ}
```java
public double getZ()
```

Gets or sets Z coordinate

**Returns:** double

### setZ(double value) {#setZ-double}
```java
public void setZ(double value)
```

Gets or sets Z coordinate

### getW() {#getW}
```java
public double getW()
```

Gets or sets W coordinate

**Returns:** double

### setW(double value) {#setW-double}
```java
public void setW(double value)
```

Gets or sets W coordinate

### distance(Point3D point1, Point3D point2) {#distance-com.aspose.cad.exporters.cadapsentitiesexporter.cadaps3d.Point3D-com.aspose.cad.exporters.cadapsentitiesexporter.cadaps3d.Point3D}
```java
public static double distance(Point3D point1, Point3D point2)
```

Gets distance between points

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| point1 | Point3D | First point |
| point2 | Point3D | Second point |

**Returns:** double - Euclidean distance

### spherical(double r, double theta, double phi) {#spherical-double-double-double}
```java
public static Point3D spherical(double r, double theta, double phi)
```

Get point in spherical coordinates

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| r | double | R value |
| theta | double | Theta value |
| phi | double | Phi value |

**Returns:** Point3D - Spherical coordinates point

### crossProduct(Point3D point1, Point3D point2) {#crossProduct-com.aspose.cad.exporters.cadapsentitiesexporter.cadaps3d.Point3D-com.aspose.cad.exporters.cadapsentitiesexporter.cadaps3d.Point3D}
```java
public static Point3D crossProduct(Point3D point1, Point3D point2)
```

Gets cross-product of a points

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| point1 | Point3D | First point |
| point2 | Point3D | Second point |

**Returns:** Point3D - Cross product point

### dotProduct(Point3D point1, Point3D point2) {#dotProduct-com.aspose.cad.exporters.cadapsentitiesexporter.cadaps3d.Point3D-com.aspose.cad.exporters.cadapsentitiesexporter.cadaps3d.Point3D}
```java
public static double dotProduct(Point3D point1, Point3D point2)
```

Gets dot product between two vectors.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| point1 | Point3D | First vector. |
| point2 | Point3D | Second vector. |

**Returns:** double - Dor product

### normalVector(Point3D point1, Point3D point2, Point3D point3) {#normalVector-com.aspose.cad.exporters.cadapsentitiesexporter.cadaps3d.Point3D-com.aspose.cad.exporters.cadapsentitiesexporter.cadaps3d.Point3D-com.aspose.cad.exporters.cadapsentitiesexporter.cadaps3d.Point3D}
```java
public static Point3D normalVector(Point3D point1, Point3D point2, Point3D point3)
```

Get normal vector of a plane.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| point1 | Point3D | First vector of a plane. |
| point2 | Point3D | Second vector of a plane. |
| point3 | Point3D | Third vector of a plane. |

**Returns:** Point3D - Normal vector of a plane

### transform(TransformationMatrix matrix) {#transform-com.aspose.cad.exporters.cadapsentitiesexporter.cadaps3d.TransformationMatrix}
```java
public void transform(TransformationMatrix matrix)
```

Applies transformation to a point

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| matrix | TransformationMatrix | Transformation matrix |

### transformNormalize(TransformationMatrix matrix) {#transformNormalize-com.aspose.cad.exporters.cadapsentitiesexporter.cadaps3d.TransformationMatrix}
```java
public void transformNormalize(TransformationMatrix matrix)
```

Applies transformation with normalization.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| matrix | TransformationMatrix | Matrix to perform transformation. |

### op_Equality(Point3D a, Point3D b) {#op_Equality-com.aspose.cad.exporters.cadapsentitiesexporter.cadaps3d.Point3D-com.aspose.cad.exporters.cadapsentitiesexporter.cadaps3d.Point3D}
```java
public static boolean op_Equality(Point3D a, Point3D b)
```

Allows to compare 3D points.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| a | Point3D | First point to compare. |
| b | Point3D | Second point to compare. |

**Returns:** boolean - True if points are equal.

### op_Inequality(Point3D a, Point3D b) {#op_Inequality-com.aspose.cad.exporters.cadapsentitiesexporter.cadaps3d.Point3D-com.aspose.cad.exporters.cadapsentitiesexporter.cadaps3d.Point3D}
```java
public static boolean op_Inequality(Point3D a, Point3D b)
```

Allows to compare 3D points.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| a | Point3D | First point to compare. |
| b | Point3D | Second point to compare. |

**Returns:** boolean - True if points are different.

### op_Subtraction(Point3D a, Point3D b) {#op_Subtraction-com.aspose.cad.exporters.cadapsentitiesexporter.cadaps3d.Point3D-com.aspose.cad.exporters.cadapsentitiesexporter.cadaps3d.Point3D}
```java
public static Point3D op_Subtraction(Point3D a, Point3D b)
```

Implements the operator -.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| a | Point3D | a. |
| b | Point3D | The b. |

**Returns:** Point3D - The result of the operator.

### op_Addition(Point3D a, Point3D b) {#op_Addition-com.aspose.cad.exporters.cadapsentitiesexporter.cadaps3d.Point3D-com.aspose.cad.exporters.cadapsentitiesexporter.cadaps3d.Point3D}
```java
public static Point3D op_Addition(Point3D a, Point3D b)
```

Implements the operator +.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| a | Point3D | a. |
| b | Point3D | The b. |

**Returns:** Point3D - The result of the operator.

### op_Multiply(Point3D point, double scale) {#op_Multiply-com.aspose.cad.exporters.cadapsentitiesexporter.cadaps3d.Point3D-double}
```java
public static Point3D op_Multiply(Point3D point, double scale)
```

Implements the operator *.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| point | Point3D | The point. |
| scale | double | The scale. |

**Returns:** Point3D - The result of the operator.

### equals(Object obj) {#equals-java.lang.Object}
```java
public boolean equals(Object obj)
```

Allows to compare 3D points.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| obj | Object | Point to compare current object with. |

**Returns:** boolean - True if points are equal.

### equalsSoft(Object obj) {#equalsSoft-java.lang.Object}
```java
public final boolean equalsSoft(Object obj)
```

**Returns:** boolean

### equalsSoft(Object obj, double eps) {#equalsSoft-java.lang.Object-double}
```java
public final boolean equalsSoft(Object obj, double eps)
```

Allows to compare 3D points with specified threshold.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| obj | Object | Point to compare current object with. |
| eps | double | Epsilon threshold. |

**Returns:** boolean - True if points are equal.

### hashCode() {#hashCode}
```java
public int hashCode()
```

Return hash code for object.

**Returns:** int - Hash value.

### copy() {#copy}
```java
public Point3D copy()
```

Creates copy of current point

**Returns:** Point3D - Copy of a point

### normalize() {#normalize}
```java
public final Point3D normalize()
```

Normalizes the specified origin.

**Returns:** Point3D

