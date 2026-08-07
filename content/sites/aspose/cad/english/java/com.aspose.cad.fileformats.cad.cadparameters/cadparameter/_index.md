---
title: "CadParameter"
linktitle: "CadParameter"
second_title: "Aspose.CAD for Java"
description: "Parameter base class"
type: docs
weight: 10
url: /java/com.aspose.cad.fileformats.cad.cadparameters/cadparameter/
---

Parameter base class

## Constructors

| Constructor | Description |
| --- | --- |
| [CadParameter(int type)](#CadParameter-int) | Initializes a new instance of the CadParameter class. |
| [CadParameter()](#CadParameter) | Initializes a new instance of the CadParameter class. |

## Methods

| Method | Description |
| --- | --- |
| [getType()](#getType) | Gets the type. |
| [init(int type, CadCodeValue value)](#init-int-com.aspose.cad.fileformats.cad.CadCodeValue) | Initialize the specified type. |
| [init(int type, Object value)](#init-int-java.lang.Object) | Initialize the specified type. |
| [init(CadCodeValue value)](#init-com.aspose.cad.fileformats.cad.CadCodeValue) | Initialize the specified value. |
| [init(Object value)](#init-java.lang.Object) | Initialize the specified value. |

### CadParameter(int type) {#CadParameter-int}
```java
public CadParameter(int type)
```

Initializes a new instance of the CadParameter class.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| type | int | The type of the parameter. |

### CadParameter() {#CadParameter}
```java
public CadParameter()
```

Initializes a new instance of the CadParameter class.

### getType() {#getType}
```java
public final int getType()
```

Gets the type.

**Returns:** int - The type.

### init(int type, CadCodeValue value) {#init-int-com.aspose.cad.fileformats.cad.CadCodeValue}
```java
public final void init(int type, CadCodeValue value)
```

Initialize the specified type.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| type | int | The type of the parameter. |
| value | CadCodeValue | The value of the parameter. |

### init(int type, Object value) {#init-int-java.lang.Object}
```java
public final void init(int type, Object value)
```

Initialize the specified type.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| type | int | The type of the parameter. |
| value | Object | The value of the parameter. |

### init(CadCodeValue value) {#init-com.aspose.cad.fileformats.cad.CadCodeValue}
```java
public abstract void init(CadCodeValue value)
```

Initialize the specified value.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | CadCodeValue | The value of the parameter. |

### init(Object value) {#init-java.lang.Object}
```java
public abstract void init(Object value)
```

Initialize the specified value.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Object | The value of the parameter. |

