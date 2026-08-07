---
title: "Linestrips"
linktitle: "Linestrips"
second_title: "Aspose.CAD for Java"
description: "The LINESTRIPS."
type: docs
weight: 10
url: /java/com.aspose.cad.fileformats.collada.fileparser.elements/linestrips/
---

**Inheritance:** java.lang.Object, ColladaElement

The LINESTRIPS. The linEStrips element provides the information needed to bind vertex attributes together and then organize those vertices into connected line-strips. Each line-strip described by the mesh has an arbitrary number of vertices. Each line segment within the line-strip is formed from the current vertex and the preceding vertex.

## Constructors

| Constructor | Description |
| --- | --- |
| [Linestrips()](#Linestrips) |  |

## Methods

| Method | Description |
| --- | --- |
| [getInput()](#getInput) | Gets or sets the input. The input element may occur any number of times. This input is a local input with the offset and set attributes. |
| [setInput(InputLocalOffset[] value)](#setInput-com.aspose.cad.fileformats.collada.fileparser.elements.InputLocalOffset:A) | Gets or sets the input. The input element may occur any number of times. This input is a local input with the offset and set attributes. |
| [getPrimitives()](#getPrimitives) | Gets or sets the primitives. The LINESTRIPS element may have any number of primitives elements. |
| [setPrimitives(Primitives[] value)](#setPrimitives-com.aspose.cad.fileformats.collada.fileparser.elements.Primitives:A) | Gets or sets the primitives. The LINESTRIPS element may have any number of primitives elements. |
| [getExtra()](#getExtra) | Gets or sets the extra. |
| [setExtra(Extra[] value)](#setExtra-com.aspose.cad.fileformats.collada.fileparser.elements.Extra:A) | Gets or sets the extra. |
| [getName()](#getName) | Gets or sets the name. The name attribute is the text string name of this element. Optional attribute. |
| [setName(String value)](#setName-java.lang.String) | Gets or sets the name. The name attribute is the text string name of this element. Optional attribute. |
| [getCount()](#getCount) | Gets or sets the count. The count attribute indicates the number of LINESTRIP primitives. Required attribute. |
| [setCount(long value)](#setCount-long) | Gets or sets the count. The count attribute indicates the number of LINESTRIP primitives. Required attribute. |
| [getMaterial()](#getMaterial) | Gets or sets the material. The material attribute declares a symbol for a material. This symbol is bound to a material at the time of instantiation. If the material attribute is not specified then the lighting and shading results are application defined. Optional attribute. |
| [setMaterial(String value)](#setMaterial-java.lang.String) | Gets or sets the material. The material attribute declares a symbol for a material. This symbol is bound to a material at the time of instantiation. If the material attribute is not specified then the lighting and shading results are application defined. Optional attribute. |

### Linestrips() {#Linestrips}
```java
public Linestrips()
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

### getPrimitives() {#getPrimitives}
```java
public final Primitives[] getPrimitives()
```

Gets or sets the primitives. The LINESTRIPS element may have any number of primitives elements.

**Returns:** Primitives[]

### setPrimitives(Primitives[] value) {#setPrimitives-com.aspose.cad.fileformats.collada.fileparser.elements.Primitives:A}
```java
public final void setPrimitives(Primitives[] value)
```

Gets or sets the primitives. The LINESTRIPS element may have any number of primitives elements.

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

Gets or sets the count. The count attribute indicates the number of LINESTRIP primitives. Required attribute.

**Returns:** long

### setCount(long value) {#setCount-long}
```java
public final void setCount(long value)
```

Gets or sets the count. The count attribute indicates the number of LINESTRIP primitives. Required attribute.

### getMaterial() {#getMaterial}
```java
public final String getMaterial()
```

Gets or sets the material. The material attribute declares a symbol for a material. This symbol is bound to a material at the time of instantiation. If the material attribute is not specified then the lighting and shading results are application defined. Optional attribute.

**Returns:** String

### setMaterial(String value) {#setMaterial-java.lang.String}
```java
public final void setMaterial(String value)
```

Gets or sets the material. The material attribute declares a symbol for a material. This symbol is bound to a material at the time of instantiation. If the material attribute is not specified then the lighting and shading results are application defined. Optional attribute.

