---
title: "Edges"
linktitle: "Edges"
second_title: "Aspose.CAD for Java"
description: "The edges."
type: docs
weight: 10
url: /java/com.aspose.cad.fileformats.collada.fileparser.elements/edges/
---

**Inheritance:** java.lang.Object, ColladaElement

The edges. Edges are limited by two vertices and have a curve for a geometric representation. The segment of the curve is also limited by its start and end parameters.

## Constructors

| Constructor | Description |
| --- | --- |
| [Edges()](#Edges) |  |

## Methods

| Method | Description |
| --- | --- |
| [getInput()](#getInput) | Gets or sets the input. Five input elements are needed to define an edge, one for referencing the curve, two for referencing the two vertices, one for the orientation of the first vertex(the second is the opposite of the first) and one for the parametric values of the curve. |
| [setInput(InputLocalOffset[] value)](#setInput-com.aspose.cad.fileformats.collada.fileparser.elements.InputLocalOffset:A) | Gets or sets the input. Five input elements are needed to define an edge, one for referencing the curve, two for referencing the two vertices, one for the orientation of the first vertex(the second is the opposite of the first) and one for the parametric values of the curve. |
| [getPrimitives()](#getPrimitives) | Gets or sets the primitives. |
| [setPrimitives(Primitives value)](#setPrimitives-com.aspose.cad.fileformats.collada.fileparser.elements.Primitives) | Gets or sets the primitives. |
| [getExtra()](#getExtra) | Gets or sets the extra. |
| [setExtra(Extra[] value)](#setExtra-com.aspose.cad.fileformats.collada.fileparser.elements.Extra:A) | Gets or sets the extra. |
| [getId()](#getId) | Gets or sets the id. A text string containing the unique identifier of this element. This value must be unique within the instance document. Required. |
| [setId(String value)](#setId-java.lang.String) | Gets or sets the id. A text string containing the unique identifier of this element. This value must be unique within the instance document. Required. |
| [getName()](#getName) | Gets or sets the name. |
| [setName(String value)](#setName-java.lang.String) | Gets or sets the name. |
| [getCount()](#getCount) | Gets or sets the count. |
| [setCount(long value)](#setCount-long) | Gets or sets the count. |

### Edges() {#Edges}
```java
public Edges()
```

### getInput() {#getInput}
```java
public final InputLocalOffset[] getInput()
```

Gets or sets the input. Five input elements are needed to define an edge, one for referencing the curve, two for referencing the two vertices, one for the orientation of the first vertex(the second is the opposite of the first) and one for the parametric values of the curve.

**Returns:** InputLocalOffset[]

### setInput(InputLocalOffset[] value) {#setInput-com.aspose.cad.fileformats.collada.fileparser.elements.InputLocalOffset:A}
```java
public final void setInput(InputLocalOffset[] value)
```

Gets or sets the input. Five input elements are needed to define an edge, one for referencing the curve, two for referencing the two vertices, one for the orientation of the first vertex(the second is the opposite of the first) and one for the parametric values of the curve.

### getPrimitives() {#getPrimitives}
```java
public final Primitives getPrimitives()
```

Gets or sets the primitives.

**Returns:** Primitives

### setPrimitives(Primitives value) {#setPrimitives-com.aspose.cad.fileformats.collada.fileparser.elements.Primitives}
```java
public final void setPrimitives(Primitives value)
```

Gets or sets the primitives.

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

### getId() {#getId}
```java
public final String getId()
```

Gets or sets the id. A text string containing the unique identifier of this element. This value must be unique within the instance document. Required.

**Returns:** String

### setId(String value) {#setId-java.lang.String}
```java
public final void setId(String value)
```

Gets or sets the id. A text string containing the unique identifier of this element. This value must be unique within the instance document. Required.

### getName() {#getName}
```java
public final String getName()
```

Gets or sets the name.

**Returns:** String

### setName(String value) {#setName-java.lang.String}
```java
public final void setName(String value)
```

Gets or sets the name.

### getCount() {#getCount}
```java
public final long getCount()
```

Gets or sets the count.

**Returns:** long

### setCount(long value) {#setCount-long}
```java
public final void setCount(long value)
```

Gets or sets the count.

