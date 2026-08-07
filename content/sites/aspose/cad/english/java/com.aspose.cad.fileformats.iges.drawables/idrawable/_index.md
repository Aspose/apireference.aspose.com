---
title: "IDrawable"
linktitle: "IDrawable"
second_title: "Aspose.CAD for Java"
description: "Parent Interface for Simple geometric represetation of an entity or its part"
type: docs
weight: 10
url: /java/com.aspose.cad.fileformats.iges.drawables/idrawable/
---

Parent Interface for Simple geometric represetation of an entity or its part

## Methods

| Method | Description |
| --- | --- |
| [getProperties()](#getProperties) | Non-geometric properties of geometric representation |
| [getAllPoints()](#getAllPoints) | Array of all points defining geometry |
| [getEntityUID()](#getEntityUID) | Unique identifier (line number) of entity that created this entity |
| [setEntityUID(String value)](#setEntityUID-java.lang.String) | Unique identifier (line number) of entity that created this entity |
| [getTransformedDrawable(Point3D[] newPoints)](#getTransformedDrawable-com.aspose.cad.fileformats.iges.commondefinitions.Point3D:A) | Creates a new drawable using provided points and non-geometric properties of current drawable |
| [getNewPropsDrawable(IDrawableProperties props)](#getNewPropsDrawable-com.aspose.cad.fileformats.iges.drawables.IDrawableProperties) | Creates a new drawable using geometry of current drawable and provided non-geometric properties |
| [accept(IExporterVisitor visitor)](#accept-com.aspose.cad.exporters.igesexporter.igesdrawableexporter.IExporterVisitor) | Part of Visitor pattern with an |

### getProperties() {#getProperties}
```java
IDrawableProperties getProperties()
```

Non-geometric properties of geometric representation

**Returns:** IDrawableProperties

### getAllPoints() {#getAllPoints}
```java
Point3D[] getAllPoints()
```

Array of all points defining geometry

**Returns:** Point3D[]

### getEntityUID() {#getEntityUID}
```java
String getEntityUID()
```

Unique identifier (line number) of entity that created this entity

**Returns:** String

### setEntityUID(String value) {#setEntityUID-java.lang.String}
```java
void setEntityUID(String value)
```

Unique identifier (line number) of entity that created this entity

### getTransformedDrawable(Point3D[] newPoints) {#getTransformedDrawable-com.aspose.cad.fileformats.iges.commondefinitions.Point3D:A}
```java
IDrawable getTransformedDrawable(Point3D[] newPoints)
```

Creates a new drawable using provided points and non-geometric properties of current drawable

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| newPoints | Point3D[] | All points defining new geometry |

**Returns:** IDrawable - New drawable with new geometry and current non-geometric properties

### getNewPropsDrawable(IDrawableProperties props) {#getNewPropsDrawable-com.aspose.cad.fileformats.iges.drawables.IDrawableProperties}
```java
IDrawable getNewPropsDrawable(IDrawableProperties props)
```

Creates a new drawable using geometry of current drawable and provided non-geometric properties

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| props | IDrawableProperties | New non-geometric properties |

**Returns:** IDrawable - New drawable with current geometry and new non-geometric properties

### accept(IExporterVisitor visitor) {#accept-com.aspose.cad.exporters.igesexporter.igesdrawableexporter.IExporterVisitor}
```java
void accept(IExporterVisitor visitor)
```

Part of Visitor pattern with an

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| visitor | IExporterVisitor | An to render geometry |

