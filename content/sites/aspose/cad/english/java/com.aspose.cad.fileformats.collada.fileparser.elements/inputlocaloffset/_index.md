---
title: "InputLocalOffset"
linktitle: "InputLocalOffset"
second_title: "Aspose.CAD for Java"
description: "The input local offset."
type: docs
weight: 10
url: /java/com.aspose.cad.fileformats.collada.fileparser.elements/inputlocaloffset/
---

**Inheritance:** java.lang.Object, ColladaElement

The input local offset. The input_local_offset_type element is used to represent indexed inputs that can only reference resources declared in the same document.

## Constructors

| Constructor | Description |
| --- | --- |
| [InputLocalOffset()](#InputLocalOffset) |  |

## Methods

| Method | Description |
| --- | --- |
| [getOffset()](#getOffset) | Gets or sets the offset. The offset attribute represents the offset into the list of indices. If two input elements share the same offset, they will be indexed the same. This works as a simple form of compression for the list of indices as well as defining the order the inputs should be used in. Required attribute. |
| [setOffset(long value)](#setOffset-long) | Gets or sets the offset. The offset attribute represents the offset into the list of indices. If two input elements share the same offset, they will be indexed the same. This works as a simple form of compression for the list of indices as well as defining the order the inputs should be used in. Required attribute. |
| [getSemantic()](#getSemantic) | Gets or sets the semantic. The semantic attribute is the user-defined meaning of the input connection. Required attribute. |
| [setSemantic(String value)](#setSemantic-java.lang.String) | Gets or sets the semantic. The semantic attribute is the user-defined meaning of the input connection. Required attribute. |
| [getSource()](#getSource) | Gets or sets the source. The source attribute indicates the location of the data source. Required attribute. |
| [setSource(String value)](#setSource-java.lang.String) | Gets or sets the source. The source attribute indicates the location of the data source. Required attribute. |
| [getSingleSet()](#getSingleSet) | Gets or sets the single set. The set attribute indicates which inputs should be grouped together as a single set. This is helpful when multiple inputs share the same semantics. |
| [setSingleSet(long value)](#setSingleSet-long) | Gets or sets the single set. The set attribute indicates which inputs should be grouped together as a single set. This is helpful when multiple inputs share the same semantics. |
| [getSetSpecified()](#getSetSpecified) | Gets or sets a value indicating whether set specified. |
| [setSetSpecified(boolean value)](#setSetSpecified-boolean) | Gets or sets a value indicating whether set specified. |

### InputLocalOffset() {#InputLocalOffset}
```java
public InputLocalOffset()
```

### getOffset() {#getOffset}
```java
public final long getOffset()
```

Gets or sets the offset. The offset attribute represents the offset into the list of indices. If two input elements share the same offset, they will be indexed the same. This works as a simple form of compression for the list of indices as well as defining the order the inputs should be used in. Required attribute.

**Returns:** long

### setOffset(long value) {#setOffset-long}
```java
public final void setOffset(long value)
```

Gets or sets the offset. The offset attribute represents the offset into the list of indices. If two input elements share the same offset, they will be indexed the same. This works as a simple form of compression for the list of indices as well as defining the order the inputs should be used in. Required attribute.

### getSemantic() {#getSemantic}
```java
public final String getSemantic()
```

Gets or sets the semantic. The semantic attribute is the user-defined meaning of the input connection. Required attribute.

**Returns:** String

### setSemantic(String value) {#setSemantic-java.lang.String}
```java
public final void setSemantic(String value)
```

Gets or sets the semantic. The semantic attribute is the user-defined meaning of the input connection. Required attribute.

### getSource() {#getSource}
```java
public final String getSource()
```

Gets or sets the source. The source attribute indicates the location of the data source. Required attribute.

**Returns:** String

### setSource(String value) {#setSource-java.lang.String}
```java
public final void setSource(String value)
```

Gets or sets the source. The source attribute indicates the location of the data source. Required attribute.

### getSingleSet() {#getSingleSet}
```java
public final long getSingleSet()
```

Gets or sets the single set. The set attribute indicates which inputs should be grouped together as a single set. This is helpful when multiple inputs share the same semantics.

**Returns:** long

### setSingleSet(long value) {#setSingleSet-long}
```java
public final void setSingleSet(long value)
```

Gets or sets the single set. The set attribute indicates which inputs should be grouped together as a single set. This is helpful when multiple inputs share the same semantics.

### getSetSpecified() {#getSetSpecified}
```java
public final boolean getSetSpecified()
```

Gets or sets a value indicating whether set specified.

**Returns:** boolean

### setSetSpecified(boolean value) {#setSetSpecified-boolean}
```java
public final void setSetSpecified(boolean value)
```

Gets or sets a value indicating whether set specified.

