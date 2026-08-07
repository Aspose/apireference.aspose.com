---
title: "ResourceBlock"
linktitle: "ResourceBlock"
second_title: "Aspose.CAD for Java"
description: "The resource block."
type: docs
weight: 10
url: /java/com.aspose.cad.fileformats.psd/resourceblock/
---

The resource block.

## Constructors

| Constructor | Description |
| --- | --- |
| [ResourceBlock()](#ResourceBlock) |  |

## Fields

| Field | Description |
| --- | --- |
| [RESOUCE_BLOCK_SIGNATURE](#RESOUCE_BLOCK_SIGNATURE) | The resource signature. |

## Methods

| Method | Description |
| --- | --- |
| [getSignature()](#getSignature) | Gets the resource signature. Should be always '8BIM'. |
| [getID()](#getID) | Gets or sets the unique identifier for the resource. |
| [setID(short value)](#setID-short) | Gets or sets the unique identifier for the resource. |
| [getName()](#getName) | Gets or sets the resource name. Pascal string, padded to make the size even (a null name consists of two bytes of 0). |
| [setName(String value)](#setName-java.lang.String) | Gets or sets the resource name. Pascal string, padded to make the size even (a null name consists of two bytes of 0). |
| [getDataSize()](#getDataSize) | Gets the resource data size in bytes. |
| [getSize()](#getSize) | Gets the resource block size in bytes including its data. |
| [getMinimalVersion()](#getMinimalVersion) | Gets the minimal required PSD version. |
| [save(com.aspose.cad.StreamContainer stream)](#save-com.aspose.cad.StreamContainer) | Saves the resource block to the specified stream. |
| [validateValues()](#validateValues) | Validates the resource values. |

### ResourceBlock() {#ResourceBlock}
```java
public ResourceBlock()
```

### RESOUCE_BLOCK_SIGNATURE {#RESOUCE_BLOCK_SIGNATURE}
```java
public static final int RESOUCE_BLOCK_SIGNATURE
```

The resource signature.

**Returns:** int

### getSignature() {#getSignature}
```java
public int getSignature()
```

Gets the resource signature. Should be always '8BIM'.

**Returns:** int - The resource signature.

### getID() {#getID}
```java
public short getID()
```

Gets or sets the unique identifier for the resource.

**Returns:** short - The unique identifier for the resource.

### setID(short value) {#setID-short}
```java
public void setID(short value)
```

Gets or sets the unique identifier for the resource.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | short | The unique identifier for the resource. |

### getName() {#getName}
```java
public String getName()
```

Gets or sets the resource name. Pascal string, padded to make the size even (a null name consists of two bytes of 0).

**Returns:** String - The resource name.

### setName(String value) {#setName-java.lang.String}
```java
public void setName(String value)
```

Gets or sets the resource name. Pascal string, padded to make the size even (a null name consists of two bytes of 0).

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | String | The resource name. |

### getDataSize() {#getDataSize}
```java
public abstract int getDataSize()
```

Gets the resource data size in bytes.

**Returns:** int - The resource data size.

### getSize() {#getSize}
```java
public int getSize()
```

Gets the resource block size in bytes including its data.

**Returns:** int - The resource block size.

### getMinimalVersion() {#getMinimalVersion}
```java
public abstract int getMinimalVersion()
```

Gets the minimal required PSD version.

**Returns:** int - The minimal PSD version.

### save(com.aspose.cad.StreamContainer stream) {#save-com.aspose.cad.StreamContainer}
```java
public void save(com.aspose.cad.StreamContainer stream)
```

Saves the resource block to the specified stream.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| stream | com.aspose.cad.StreamContainer | The stream to save the resource block to. |

### validateValues() {#validateValues}
```java
public void validateValues()
```

Validates the resource values.

