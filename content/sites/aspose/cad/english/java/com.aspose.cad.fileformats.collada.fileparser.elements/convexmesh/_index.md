---
title: "ConvexMesh"
linktitle: "ConvexMesh"
second_title: "Aspose.CAD for Java"
description: "The convex mesh."
type: docs
weight: 10
url: /java/com.aspose.cad.fileformats.collada.fileparser.elements/convexmesh/
---

**Inheritance:** java.lang.Object, ColladaElement

The convex mesh. The definition of the convex_mesh element is identical to the mesh element with the exception that instead of a complete description(source, vertices, polygons etc.), it may simply point to another geometry to derive its shape. The latter case means that the convex hull of that geometry should be computed and is indicated by the optional "convex_hull_of" attribute.

## Constructors

| Constructor | Description |
| --- | --- |
| [ConvexMesh()](#ConvexMesh) |  |

## Methods

| Method | Description |
| --- | --- |
| [getSource()](#getSource) | Gets or sets the source. |
| [setSource(Source[] value)](#setSource-com.aspose.cad.fileformats.collada.fileparser.elements.Source:A) | Gets or sets the source. |
| [getVertices()](#getVertices) | Gets or sets the vertices. |
| [setVertices(Vertices value)](#setVertices-com.aspose.cad.fileformats.collada.fileparser.elements.Vertices) | Gets or sets the vertices. |
| [getItems()](#getItems) | Gets or sets the items. |
| [setItems(Object[] value)](#setItems-java.lang.Object:A) | Gets or sets the items. |
| [getExtra()](#getExtra) | Gets or sets the extra. |
| [setExtra(Extra[] value)](#setExtra-com.aspose.cad.fileformats.collada.fileparser.elements.Extra:A) | Gets or sets the extra. |
| [getConvexHullOf()](#getConvexHullOf) | Gets or sets the convex hull of. |
| [setConvexHullOf(String value)](#setConvexHullOf-java.lang.String) | Gets or sets the convex hull of. |

### ConvexMesh() {#ConvexMesh}
```java
public ConvexMesh()
```

### getSource() {#getSource}
```java
public final Source[] getSource()
```

Gets or sets the source.

**Returns:** Source[]

### setSource(Source[] value) {#setSource-com.aspose.cad.fileformats.collada.fileparser.elements.Source:A}
```java
public final void setSource(Source[] value)
```

Gets or sets the source.

### getVertices() {#getVertices}
```java
public final Vertices getVertices()
```

Gets or sets the vertices.

**Returns:** Vertices

### setVertices(Vertices value) {#setVertices-com.aspose.cad.fileformats.collada.fileparser.elements.Vertices}
```java
public final void setVertices(Vertices value)
```

Gets or sets the vertices.

### getItems() {#getItems}
```java
public final Object[] getItems()
```

Gets or sets the items.

**Returns:** Object[]

### setItems(Object[] value) {#setItems-java.lang.Object:A}
```java
public final void setItems(Object[] value)
```

Gets or sets the items.

### getExtra() {#getExtra}
```java
public final Extra[] getExtra()
```

Gets or sets the extra.

**Returns:** Extra[]

### setExtra(Extra[] value) {#setExtra-com.aspose.cad.fileformats.collada.fileparser.elements.Extra:A}
```java
public final void setExtra(Extra[] value)
```

Gets or sets the extra.

### getConvexHullOf() {#getConvexHullOf}
```java
public final String getConvexHullOf()
```

Gets or sets the convex hull of.

**Returns:** String

### setConvexHullOf(String value) {#setConvexHullOf-java.lang.String}
```java
public final void setConvexHullOf(String value)
```

Gets or sets the convex hull of.

