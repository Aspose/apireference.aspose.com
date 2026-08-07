---
title: "Polylist"
linktitle: "Polylist"
second_title: "Aspose.CAD for Java"
description: "The POLYLIST."
type: docs
weight: 10
url: /java/com.aspose.cad.fileformats.collada.fileparser.elements/polylist/
---

**Inheritance:** java.lang.Object, ColladaElement

The POLYLIST. The POLYLIST element provides the information needed to bind vertex attributes together and then organize those vertices into individual polygons. The polygons described in POLYLIST can contain arbitrary numbers of vertices. Unlike the polygons element, the POLYLIST element cannot contain polygons with holes.

## Constructors

| Constructor | Description |
| --- | --- |
| [Polylist()](#Polylist) |  |

## Methods

| Method | Description |
| --- | --- |
| [getInput()](#getInput) | Gets or sets the input. The input element may occur any number of times. This input is a local input with the offset and set attributes. |
| [setInput(InputLocalOffset[] value)](#setInput-com.aspose.cad.fileformats.collada.fileparser.elements.InputLocalOffset:A) | Gets or sets the input. The input element may occur any number of times. This input is a local input with the offset and set attributes. |
| [getVerticesCount()](#getVerticesCount) | Gets or sets the vertices count. The vertices count element contains a list of integers describing the number of sides for each polygon described by the POLYLIST element. The vertices count element may occur once. |
| [setVerticesCount(String value)](#setVerticesCount-java.lang.String) | Gets or sets the vertices count. The vertices count element contains a list of integers describing the number of sides for each polygon described by the POLYLIST element. The vertices count element may occur once. |
| [getPrimitives()](#getPrimitives) | Gets or sets the primitives. The POLYLIST element may have zero or one primitives element. |
| [setPrimitives(Primitives value)](#setPrimitives-com.aspose.cad.fileformats.collada.fileparser.elements.Primitives) | Gets or sets the primitives. The POLYLIST element may have zero or one primitives element. |
| [getExtra()](#getExtra) | Gets or sets the extra. The extra element may appear any number of times. |
| [setExtra(Extra[] value)](#setExtra-com.aspose.cad.fileformats.collada.fileparser.elements.Extra:A) | Gets or sets the extra. The extra element may appear any number of times. |
| [getName()](#getName) | Gets or sets the name. The name attribute is the text string name of this element. Optional attribute. |
| [setName(String value)](#setName-java.lang.String) | Gets or sets the name. The name attribute is the text string name of this element. Optional attribute. |
| [getCount()](#getCount) | Gets or sets the count. The count attribute indicates the number of polygon primitives. Required attribute. |
| [setCount(long value)](#setCount-long) | Gets or sets the count. The count attribute indicates the number of polygon primitives. Required attribute. |
| [getMaterial()](#getMaterial) | Gets or sets the material. |
| [setMaterial(String value)](#setMaterial-java.lang.String) | Gets or sets the material. |

### Polylist() {#Polylist}
```java
public Polylist()
```

### getInput() {#getInput}
```java
public final InputLocalOffset[] getInput()
```

Gets or sets the input. The input element may occur any number of times. This input is a local input with the offset and set attributes.

**Returns:** InputLocalOffset[]

### setInput(InputLocalOffset[] value) {#setInput-com.aspose.cad.fileformats.collada.fileparser.elements.InputLocalOffset:A}
```java
public final void setInput(InputLocalOffset[] value)
```

Gets or sets the input. The input element may occur any number of times. This input is a local input with the offset and set attributes.

### getVerticesCount() {#getVerticesCount}
```java
public final String getVerticesCount()
```

Gets or sets the vertices count. The vertices count element contains a list of integers describing the number of sides for each polygon described by the POLYLIST element. The vertices count element may occur once.

**Returns:** String

### setVerticesCount(String value) {#setVerticesCount-java.lang.String}
```java
public final void setVerticesCount(String value)
```

Gets or sets the vertices count. The vertices count element contains a list of integers describing the number of sides for each polygon described by the POLYLIST element. The vertices count element may occur once.

### getPrimitives() {#getPrimitives}
```java
public final Primitives getPrimitives()
```

Gets or sets the primitives. The POLYLIST element may have zero or one primitives element.

**Returns:** Primitives

### setPrimitives(Primitives value) {#setPrimitives-com.aspose.cad.fileformats.collada.fileparser.elements.Primitives}
```java
public final void setPrimitives(Primitives value)
```

Gets or sets the primitives. The POLYLIST element may have zero or one primitives element.

### getExtra() {#getExtra}
```java
public final Extra[] getExtra()
```

Gets or sets the extra. The extra element may appear any number of times.

**Returns:** Extra[]

### setExtra(Extra[] value) {#setExtra-com.aspose.cad.fileformats.collada.fileparser.elements.Extra:A}
```java
public final void setExtra(Extra[] value)
```

Gets or sets the extra. The extra element may appear any number of times.

### getName() {#getName}
```java
public final String getName()
```

Gets or sets the name. The name attribute is the text string name of this element. Optional attribute.

**Returns:** String

### setName(String value) {#setName-java.lang.String}
```java
public final void setName(String value)
```

Gets or sets the name. The name attribute is the text string name of this element. Optional attribute.

### getCount() {#getCount}
```java
public final long getCount()
```

Gets or sets the count. The count attribute indicates the number of polygon primitives. Required attribute.

**Returns:** long

### setCount(long value) {#setCount-long}
```java
public final void setCount(long value)
```

Gets or sets the count. The count attribute indicates the number of polygon primitives. Required attribute.

### getMaterial() {#getMaterial}
```java
public final String getMaterial()
```

Gets or sets the material.

**Returns:** String

### setMaterial(String value) {#setMaterial-java.lang.String}
```java
public final void setMaterial(String value)
```

Gets or sets the material.

