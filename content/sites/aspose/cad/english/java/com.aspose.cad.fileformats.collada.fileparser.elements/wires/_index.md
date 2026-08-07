---
title: "Wires"
linktitle: "Wires"
second_title: "Aspose.CAD for Java"
description: "The wires."
type: docs
weight: 10
url: /java/com.aspose.cad.fileformats.collada.fileparser.elements/wires/
---

**Inheritance:** java.lang.Object, ColladaElement

The wires. Wires are a combination of one or more edges. A closed wire can limit a face.

## Constructors

| Constructor | Description |
| --- | --- |
| [Wires()](#Wires) |  |

## Methods

| Method | Description |
| --- | --- |
| [getInput()](#getInput) | Gets or sets the input. One input elements is needed to define a wire by its edges. The second is needed for orientation of the edges. |
| [setInput(InputLocalOffset[] value)](#setInput-com.aspose.cad.fileformats.collada.fileparser.elements.InputLocalOffset:A) | Gets or sets the input. One input elements is needed to define a wire by its edges. The second is needed for orientation of the edges. |
| [getEdgesCount()](#getEdgesCount) | Gets or sets the edges count. Contains a list of integers describing the number of edges for each wire. |
| [setEdgesCount(String value)](#setEdgesCount-java.lang.String) | Gets or sets the edges count. Contains a list of integers describing the number of edges for each wire. |
| [getPrimitives()](#getPrimitives) | Gets or sets the primitives. References the indices for the input; this describes the attributes for all the wires. |
| [setPrimitives(Primitives value)](#setPrimitives-com.aspose.cad.fileformats.collada.fileparser.elements.Primitives) | Gets or sets the primitives. References the indices for the input; this describes the attributes for all the wires. |
| [getExtra()](#getExtra) | Gets or sets the extra. |
| [setExtra(Extra[] value)](#setExtra-com.aspose.cad.fileformats.collada.fileparser.elements.Extra:A) | Gets or sets the extra. |
| [getId()](#getId) | Gets or sets the id. A text string containing the unique identifier of this element. This value must be unique within the instance document. Required. |
| [setId(String value)](#setId-java.lang.String) | Gets or sets the id. A text string containing the unique identifier of this element. This value must be unique within the instance document. Required. |
| [getName()](#getName) | Gets or sets the name. The text string name of the element. Optional. |
| [setName(String value)](#setName-java.lang.String) | Gets or sets the name. The text string name of the element. Optional. |
| [getCount()](#getCount) | Gets or sets the count. The number of wires. Required. |
| [setCount(long value)](#setCount-long) | Gets or sets the count. The number of wires. Required. |

### Wires() {#Wires}
```java
public Wires()
```

### getInput() {#getInput}
```java
public final InputLocalOffset[] getInput()
```

Gets or sets the input. One input elements is needed to define a wire by its edges. The second is needed for orientation of the edges.

**Returns:** InputLocalOffset[]

### setInput(InputLocalOffset[] value) {#setInput-com.aspose.cad.fileformats.collada.fileparser.elements.InputLocalOffset:A}
```java
public final void setInput(InputLocalOffset[] value)
```

Gets or sets the input. One input elements is needed to define a wire by its edges. The second is needed for orientation of the edges.

### getEdgesCount() {#getEdgesCount}
```java
public final String getEdgesCount()
```

Gets or sets the edges count. Contains a list of integers describing the number of edges for each wire.

**Returns:** String

### setEdgesCount(String value) {#setEdgesCount-java.lang.String}
```java
public final void setEdgesCount(String value)
```

Gets or sets the edges count. Contains a list of integers describing the number of edges for each wire.

### getPrimitives() {#getPrimitives}
```java
public final Primitives getPrimitives()
```

Gets or sets the primitives. References the indices for the input; this describes the attributes for all the wires.

**Returns:** Primitives

### setPrimitives(Primitives value) {#setPrimitives-com.aspose.cad.fileformats.collada.fileparser.elements.Primitives}
```java
public final void setPrimitives(Primitives value)
```

Gets or sets the primitives. References the indices for the input; this describes the attributes for all the wires.

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

Gets or sets the name. The text string name of the element. Optional.

**Returns:** String

### setName(String value) {#setName-java.lang.String}
```java
public final void setName(String value)
```

Gets or sets the name. The text string name of the element. Optional.

### getCount() {#getCount}
```java
public final long getCount()
```

Gets or sets the count. The number of wires. Required.

**Returns:** long

### setCount(long value) {#setCount-long}
```java
public final void setCount(long value)
```

Gets or sets the count. The number of wires. Required.

