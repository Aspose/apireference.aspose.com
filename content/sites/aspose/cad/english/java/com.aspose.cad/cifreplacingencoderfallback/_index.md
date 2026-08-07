---
title: "CifReplacingEncoderFallback"
linktitle: "CifReplacingEncoderFallback"
second_title: "Aspose.CAD for Java"
description: "Encoder fallback that replaces out of codepage characters with CIF sequence"
type: docs
weight: 10
url: /java/com.aspose.cad/cifreplacingencoderfallback/
---

**Inheritance:** java.lang.Object, com.aspose.ms.System.Text.EncoderFallback

Encoder fallback that replaces out of codepage characters with CIF sequence

## Constructors

| Constructor | Description |
| --- | --- |
| [CifReplacingEncoderFallback()](#CifReplacingEncoderFallback) |  |

## Methods

| Method | Description |
| --- | --- |
| [getMaxCharCount()](#getMaxCharCount) | For surrogate pair of two UTF-16 characters that are encoded as two consequent CIF entries in AutoCad format (slash-escaped) it is 14, so we return 14 |
| [createFallbackBuffer()](#createFallbackBuffer) | Creates the actual fallback buffer |

### CifReplacingEncoderFallback() {#CifReplacingEncoderFallback}
```java
public CifReplacingEncoderFallback()
```

### getMaxCharCount() {#getMaxCharCount}
```java
public int getMaxCharCount()
```

For surrogate pair of two UTF-16 characters that are encoded as two consequent CIF entries in AutoCad format (slash-escaped) it is 14, so we return 14

**Returns:** int

### createFallbackBuffer() {#createFallbackBuffer}
```java
public com.aspose.ms.System.Text.EncoderFallbackBuffer createFallbackBuffer()
```

Creates the actual fallback buffer

**Returns:** com.aspose.ms.System.Text.EncoderFallbackBuffer - Fallback buffer

