---
title: "IText"
linktitle: "IText"
second_title: "Aspose.CAD for Java"
description: "Interface for text primitive"
type: docs
weight: 10
url: /java/com.aspose.cad.fileformats.iges.drawables/itext/
---

**Inheritance:** java.lang.Object, IDrawable

Interface for text primitive

## Methods

| Method | Description |
| --- | --- |
| [getText()](#getText) | Text |
| [getOrientation()](#getOrientation) | Horizontal or vertical text |
| [getMirrioring()](#getMirrioring) | Mirroring of text |
| [getOrigin()](#getOrigin) | Left bottom point of text boundary, used as origin point of primitive,maps to AllPoints[0] |
| [getEndBottomLine()](#getEndBottomLine) | Right bottom point of text boundary, maps to AllPoints[3] |
| [getUpperLeft()](#getUpperLeft) | Left upper point of text boundary, maps to AllPoints[1] |
| [getUpperRight()](#getUpperRight) | Right upper point of text boundary, maps to AllPoints[2] |

### getText() {#getText}
```java
String getText()
```

Text

**Returns:** String

### getOrientation() {#getOrientation}
```java
int getOrientation()
```

Horizontal or vertical text

**Returns:** int

### getMirrioring() {#getMirrioring}
```java
int getMirrioring()
```

Mirroring of text

**Returns:** int

### getOrigin() {#getOrigin}
```java
Point3D getOrigin()
```

Left bottom point of text boundary, used as origin point of primitive,maps to AllPoints[0]

**Returns:** Point3D

### getEndBottomLine() {#getEndBottomLine}
```java
Point3D getEndBottomLine()
```

Right bottom point of text boundary, maps to AllPoints[3]

**Returns:** Point3D

### getUpperLeft() {#getUpperLeft}
```java
Point3D getUpperLeft()
```

Left upper point of text boundary, maps to AllPoints[1]

**Returns:** Point3D

### getUpperRight() {#getUpperRight}
```java
Point3D getUpperRight()
```

Right upper point of text boundary, maps to AllPoints[2]

**Returns:** Point3D

