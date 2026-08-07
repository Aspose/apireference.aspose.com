---
title: "Accessor"
linktitle: "Accessor"
second_title: "Aspose.CAD for Java"
description: "The accessor."
type: docs
weight: 10
url: /java/com.aspose.cad.fileformats.collada.fileparser.elements/accessor/
---

**Inheritance:** java.lang.Object, ColladaElement

The accessor. The accessor element declares an access pattern to one of the array elements: FLOAT_ARRAY, INT_ARRAY, NAME_ARRAY, BOOL_ARRAY, TOKEN_ARRAY, and IDREF_ARRAY. The accessor element describes access to arrays that are organized in either an interleaved or non-interleaved manner, depending on the offset and stride attributes.

## Constructors

| Constructor | Description |
| --- | --- |
| [Accessor()](#Accessor) | Initializes a new instance of the Accessor class. |

## Methods

| Method | Description |
| --- | --- |
| [getParameter()](#getParameter) | Gets or sets the parameter. The accessor element may have any number of parameter elements. |
| [setParameter(Parameter[] value)](#setParameter-com.aspose.cad.fileformats.collada.fileparser.elements.Parameter:A) | Gets or sets the parameter. The accessor element may have any number of parameter elements. |
| [getCount()](#getCount) | Gets or sets the count. The count attribute indicates the number of times the array is accessed. Required attribute. |
| [setCount(long value)](#setCount-long) | Gets or sets the count. The count attribute indicates the number of times the array is accessed. Required attribute. |
| [getOffset()](#getOffset) | Gets or sets the offset. The offset attribute indicates the index of the first value to be read from the array. The default value is 0. Optional attribute. |
| [setOffset(long value)](#setOffset-long) | Gets or sets the offset. The offset attribute indicates the index of the first value to be read from the array. The default value is 0. Optional attribute. |
| [getSource()](#getSource) | Gets or sets the source. The source attribute indicates the location of the array to access using a URL expression. Required attribute. |
| [setSource(String value)](#setSource-java.lang.String) | Gets or sets the source. The source attribute indicates the location of the array to access using a URL expression. Required attribute. |
| [getStride()](#getStride) | Gets or sets the stride. The stride attribute indicates number of values to be considered a unit during each access to the array. The default value is 1, indicating that a single value is accessed. Optional attribute. |
| [setStride(long value)](#setStride-long) | Gets or sets the stride. The stride attribute indicates number of values to be considered a unit during each access to the array. The default value is 1, indicating that a single value is accessed. Optional attribute. |

### Accessor() {#Accessor}
```java
public Accessor()
```

Initializes a new instance of the Accessor class.

### getParameter() {#getParameter}
```java
public final Parameter[] getParameter()
```

Gets or sets the parameter. The accessor element may have any number of parameter elements.

**Returns:** Parameter[]

### setParameter(Parameter[] value) {#setParameter-com.aspose.cad.fileformats.collada.fileparser.elements.Parameter:A}
```java
public final void setParameter(Parameter[] value)
```

Gets or sets the parameter. The accessor element may have any number of parameter elements.

### getCount() {#getCount}
```java
public final long getCount()
```

Gets or sets the count. The count attribute indicates the number of times the array is accessed. Required attribute.

**Returns:** long

### setCount(long value) {#setCount-long}
```java
public final void setCount(long value)
```

Gets or sets the count. The count attribute indicates the number of times the array is accessed. Required attribute.

### getOffset() {#getOffset}
```java
public final long getOffset()
```

Gets or sets the offset. The offset attribute indicates the index of the first value to be read from the array. The default value is 0. Optional attribute.

**Returns:** long

### setOffset(long value) {#setOffset-long}
```java
public final void setOffset(long value)
```

Gets or sets the offset. The offset attribute indicates the index of the first value to be read from the array. The default value is 0. Optional attribute.

### getSource() {#getSource}
```java
public final String getSource()
```

Gets or sets the source. The source attribute indicates the location of the array to access using a URL expression. Required attribute.

**Returns:** String

### setSource(String value) {#setSource-java.lang.String}
```java
public final void setSource(String value)
```

Gets or sets the source. The source attribute indicates the location of the array to access using a URL expression. Required attribute.

### getStride() {#getStride}
```java
public final long getStride()
```

Gets or sets the stride. The stride attribute indicates number of values to be considered a unit during each access to the array. The default value is 1, indicating that a single value is accessed. Optional attribute.

**Returns:** long

### setStride(long value) {#setStride-long}
```java
public final void setStride(long value)
```

Gets or sets the stride. The stride attribute indicates number of values to be considered a unit during each access to the array. The default value is 1, indicating that a single value is accessed. Optional attribute.

