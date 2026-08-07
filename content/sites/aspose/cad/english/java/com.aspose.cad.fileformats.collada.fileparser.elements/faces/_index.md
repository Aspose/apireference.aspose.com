---
title: "Faces"
linktitle: "Faces"
second_title: "Aspose.CAD for Java"
description: "The faces."
type: docs
weight: 10
url: /java/com.aspose.cad.fileformats.collada.fileparser.elements/faces/
---

**Inheritance:** java.lang.Object, ColladaElement

The faces. Faces are limited by one or more wires.

## Constructors

| Constructor | Description |
| --- | --- |
| [Faces()](#Faces) |  |

## Methods

| Method | Description |
| --- | --- |
| [getInput()](#getInput) | Gets or sets the input. Two input elements are needed to define a face, one for referencing the surface and one for referencing the wires themselves. The third is needed for the orientation of each wires. |
| [setInput(InputLocalOffset[] value)](#setInput-com.aspose.cad.fileformats.collada.fileparser.elements.InputLocalOffset:A) | Gets or sets the input. Two input elements are needed to define a face, one for referencing the surface and one for referencing the wires themselves. The third is needed for the orientation of each wires. |
| [getWiresCount()](#getWiresCount) | Gets or sets the wires count. Contains a list of integers describing the number of wires for each face. |
| [setWiresCount(String value)](#setWiresCount-java.lang.String) | Gets or sets the wires count. Contains a list of integers describing the number of wires for each face. |
| [getPrimitives()](#getPrimitives) | Gets or sets the primitives. The indices for referencing the surface and wires for each face. |
| [setPrimitives(Primitives value)](#setPrimitives-com.aspose.cad.fileformats.collada.fileparser.elements.Primitives) | Gets or sets the primitives. The indices for referencing the surface and wires for each face. |
| [getExtra()](#getExtra) | Gets or sets the extra. |
| [setExtra(Extra[] value)](#setExtra-com.aspose.cad.fileformats.collada.fileparser.elements.Extra:A) | Gets or sets the extra. |
| [getId()](#getId) | Gets or sets the id. The text string containing the unique identifier of the faces element. This value must be unique within the instance document. Required. |
| [setId(String value)](#setId-java.lang.String) | Gets or sets the id. The text string containing the unique identifier of the faces element. This value must be unique within the instance document. Required. |
| [getName()](#getName) | Gets or sets the name. The text string name of the element. Optional. |
| [setName(String value)](#setName-java.lang.String) | Gets or sets the name. The text string name of the element. Optional. |
| [getCount()](#getCount) | Gets or sets the count. The number of faces. Required. |
| [setCount(long value)](#setCount-long) | Gets or sets the count. The number of faces. Required. |

### Faces() {#Faces}
```java
public Faces()
```

### getInput() {#getInput}
```java
public final InputLocalOffset[] getInput()
```

Gets or sets the input. Two input elements are needed to define a face, one for referencing the surface and one for referencing the wires themselves. The third is needed for the orientation of each wires.

**Returns:** InputLocalOffset[]

### setInput(InputLocalOffset[] value) {#setInput-com.aspose.cad.fileformats.collada.fileparser.elements.InputLocalOffset:A}
```java
public final void setInput(InputLocalOffset[] value)
```

Gets or sets the input. Two input elements are needed to define a face, one for referencing the surface and one for referencing the wires themselves. The third is needed for the orientation of each wires.

### getWiresCount() {#getWiresCount}
```java
public final String getWiresCount()
```

Gets or sets the wires count. Contains a list of integers describing the number of wires for each face.

**Returns:** String

### setWiresCount(String value) {#setWiresCount-java.lang.String}
```java
public final void setWiresCount(String value)
```

Gets or sets the wires count. Contains a list of integers describing the number of wires for each face.

### getPrimitives() {#getPrimitives}
```java
public final Primitives getPrimitives()
```

Gets or sets the primitives. The indices for referencing the surface and wires for each face.

**Returns:** Primitives

### setPrimitives(Primitives value) {#setPrimitives-com.aspose.cad.fileformats.collada.fileparser.elements.Primitives}
```java
public final void setPrimitives(Primitives value)
```

Gets or sets the primitives. The indices for referencing the surface and wires for each face.

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

Gets or sets the id. The text string containing the unique identifier of the faces element. This value must be unique within the instance document. Required.

**Returns:** String

### setId(String value) {#setId-java.lang.String}
```java
public final void setId(String value)
```

Gets or sets the id. The text string containing the unique identifier of the faces element. This value must be unique within the instance document. Required.

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

Gets or sets the count. The number of faces. Required.

**Returns:** long

### setCount(long value) {#setCount-long}
```java
public final void setCount(long value)
```

Gets or sets the count. The number of faces. Required.

