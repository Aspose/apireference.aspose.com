---
title: "CadBinaryCodeValue"
linktitle: "CadBinaryCodeValue"
second_title: "Aspose.CAD for Java"
description: "Cad binary Code Value class"
type: docs
weight: 10
url: /java/com.aspose.cad.fileformats.cad/cadbinarycodevalue/
---

**Inheritance:** java.lang.Object, CadCodeValue

Cad binary Code Value class

## Constructors

| Constructor | Description |
| --- | --- |
| [CadBinaryCodeValue(int code, byte[] data, int dataCount)](#CadBinaryCodeValue-int-byte:A-int) | Initializes a new instance of the CadBinaryCodeValue class. |
| [CadBinaryCodeValue(int code, String value)](#CadBinaryCodeValue-int-java.lang.String) | Initializes a new instance of the CadBinaryCodeValue class. |

## Methods

| Method | Description |
| --- | --- |
| [getData()](#getData) | Gets or sets the value. |
| [setData(byte[] value)](#setData-byte:A) | Gets or sets the value. |
| [getBinaryData()](#getBinaryData) | Gets the binary data. |
| [getBoolValue()](#getBoolValue) | Gets the boolean value. |
| [getShortValue()](#getShortValue) | The get short value. |
| [getIntValue()](#getIntValue) | The get integer value. |
| [getLongValue()](#getLongValue) | The get long value. |
| [getDoubleValue()](#getDoubleValue) | The get double value. |
| [equals(CadCodeValue obj)](#equals-com.aspose.cad.fileformats.cad.CadCodeValue) | Determines whether the specified CadCodeValue , is equal to this instance. |

### CadBinaryCodeValue(int code, byte[] data, int dataCount) {#CadBinaryCodeValue-int-byte:A-int}
```java
public CadBinaryCodeValue(int code, byte[] data, int dataCount)
```

Initializes a new instance of the CadBinaryCodeValue class.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| code | int | The code of the parameter. |
| data | byte[] | The data of the parameter. |
| dataCount | int | The data count. |

### CadBinaryCodeValue(int code, String value) {#CadBinaryCodeValue-int-java.lang.String}
```java
public CadBinaryCodeValue(int code, String value)
```

Initializes a new instance of the CadBinaryCodeValue class.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| code | int | The code of the parameter. |
| value | String | The value of the parameter. |

### getData() {#getData}
```java
public byte[] getData()
```

Gets or sets the value.

**Returns:** byte[] - The value.

### setData(byte[] value) {#setData-byte:A}
```java
public void setData(byte[] value)
```

Gets or sets the value.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | byte[] | The value. |

### getBinaryData() {#getBinaryData}
```java
public byte[] getBinaryData()
```

Gets the binary data.

**Returns:** byte[] - Byte array from hexadecimal data.

### getBoolValue() {#getBoolValue}
```java
public boolean getBoolValue()
```

Gets the boolean value.

**Returns:** boolean - The bool .

### getShortValue() {#getShortValue}
```java
public short getShortValue()
```

The get short value.

**Returns:** short - The short .

### getIntValue() {#getIntValue}
```java
public int getIntValue()
```

The get integer value.

**Returns:** int - The int .

### getLongValue() {#getLongValue}
```java
public long getLongValue()
```

The get long value.

**Returns:** long - The long .

### getDoubleValue() {#getDoubleValue}
```java
public double getDoubleValue()
```

The get double value.

**Returns:** double - The double .

### equals(CadCodeValue obj) {#equals-com.aspose.cad.fileformats.cad.CadCodeValue}
```java
public boolean equals(CadCodeValue obj)
```

Determines whether the specified CadCodeValue , is equal to this instance.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| obj | CadCodeValue | The CadCodeValue to compare with this instance. |

**Returns:** boolean - true if the specified CadCodeValue is equal to this instance; otherwise, false .

