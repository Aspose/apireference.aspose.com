---
title: "CifReplacingEncoderFallbackBuffer"
linktitle: "CifReplacingEncoderFallbackBuffer"
second_title: "Aspose.CAD for Java"
description: "The replacing encoder fallback buffer that actually does the replacement work"
type: docs
weight: 10
url: /java/com.aspose.cad/cifreplacingencoderfallbackbuffer/
---

**Inheritance:** java.lang.Object, com.aspose.ms.System.Text.EncoderFallbackBuffer

The replacing encoder fallback buffer that actually does the replacement work

## Constructors

| Constructor | Description |
| --- | --- |
| [CifReplacingEncoderFallbackBuffer()](#CifReplacingEncoderFallbackBuffer) |  |

## Methods

| Method | Description |
| --- | --- |
| [getRemaining()](#getRemaining) | Count of remaining characters in replacement buffer |
| [fallback(char charUnknown, int index)](#fallback-char-int) | Called when a single-char character out of output codepage is encountered |
| [fallback(char charUnknownHigh, char charUnknownLow, int index)](#fallback-char-char-int) | Called when a surrogate pair of characters out of output codepage is encountered |
| [getNextChar()](#getNextChar) | Gets next replacement char |
| [movePrevious()](#movePrevious) | Rewinds position in the replacement buffer by one |

### CifReplacingEncoderFallbackBuffer() {#CifReplacingEncoderFallbackBuffer}
```java
public CifReplacingEncoderFallbackBuffer()
```

### getRemaining() {#getRemaining}
```java
public int getRemaining()
```

Count of remaining characters in replacement buffer

**Returns:** int

### fallback(char charUnknown, int index) {#fallback-char-int}
```java
public boolean fallback(char charUnknown, int index)
```

Called when a single-char character out of output codepage is encountered

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| charUnknown | char | Out of codepage character |
| index | int | Index of character in the input string |

**Returns:** boolean - True if we do replace, false if not

### fallback(char charUnknownHigh, char charUnknownLow, int index) {#fallback-char-char-int}
```java
public boolean fallback(char charUnknownHigh, char charUnknownLow, int index)
```

Called when a surrogate pair of characters out of output codepage is encountered

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| charUnknownHigh | char | Out of codepage character - high surrogate |
| charUnknownLow | char | Out of codepage character - low surrogate |
| index | int | Index of character in the input string |

**Returns:** boolean - True if we do replace, false if not

### getNextChar() {#getNextChar}
```java
public char getNextChar()
```

Gets next replacement char

**Returns:** char - Replacement char

### movePrevious() {#movePrevious}
```java
public boolean movePrevious()
```

Rewinds position in the replacement buffer by one

**Returns:** boolean - True if successful, false if cannot rewind

