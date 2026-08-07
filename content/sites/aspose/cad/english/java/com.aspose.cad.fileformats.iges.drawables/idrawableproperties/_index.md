---
title: "IDrawableProperties"
linktitle: "IDrawableProperties"
second_title: "Aspose.CAD for Java"
description: "Interface for Non-geometric properties for geometric representations"
type: docs
weight: 10
url: /java/com.aspose.cad.fileformats.iges.drawables/idrawableproperties/
---

Interface for Non-geometric properties for geometric representations

## Methods

| Method | Description |
| --- | --- |
| [getColor()](#getColor) | Color to represent geometry with Value: Null if no color specified, RGB color if specified |
| [getLineThickness()](#getLineThickness) | Line thickness in document's measurement units (i.e. same as geometry's units). Value: 0 if default thickness should be used |
| [getVisible()](#getVisible) | Visibility of geometry Value: True if visible, false if not |
| [getUnitToMMRate()](#getUnitToMMRate) | Rate of document's measurement units to millimeters |
| [getLinePattern()](#getLinePattern) | Line pattern to represent geometry with |

### getColor() {#getColor}
```java
ColorRGB getColor()
```

Color to represent geometry with Value: Null if no color specified, RGB color if specified

**Returns:** ColorRGB

### getLineThickness() {#getLineThickness}
```java
double getLineThickness()
```

Line thickness in document's measurement units (i.e. same as geometry's units). Value: 0 if default thickness should be used

**Returns:** double

### getVisible() {#getVisible}
```java
boolean getVisible()
```

Visibility of geometry Value: True if visible, false if not

**Returns:** boolean

### getUnitToMMRate() {#getUnitToMMRate}
```java
double getUnitToMMRate()
```

Rate of document's measurement units to millimeters

**Returns:** double

### getLinePattern() {#getLinePattern}
```java
int getLinePattern()
```

Line pattern to represent geometry with

**Returns:** int

