---
title: "FontStoringArgs"
linktitle: "FontStoringArgs"
second_title: "Aspose.CAD for Java"
description: "Parameters for font storage in SVG"
type: docs
weight: 10
url: /java/com.aspose.cad.imageoptions.svgoptionsparameters/fontstoringargs/
---

Parameters for font storage in SVG

## Constructors

| Constructor | Description |
| --- | --- |
| [FontStoringArgs()](#FontStoringArgs) |  |

## Methods

| Method | Description |
| --- | --- |
| [getSourceFontFileName()](#getSourceFontFileName) | Gets the source font file name. |
| [getSourceFontStream()](#getSourceFontStream) | Gets the source font stream, where font data will be read from. |
| [getDestFontStream()](#getDestFontStream) | Gets or sets the destination stream where font data will be written to if FontStoreType is set to Stream. |
| [setDestFontStream(InputStream value)](#setDestFontStream-java.io.InputStream) | Gets or sets the destination stream where font data will be written to if FontStoreType is set to Stream. |
| [getFontFileUri()](#getFontFileUri) | Gets or sets the font file URI. |
| [setFontFileUri(String value)](#setFontFileUri-java.lang.String) | Gets or sets the font file URI. |
| [getDisposeStream()](#getDisposeStream) | Gets or sets a value indicating whether destionation stream should be disposed. |
| [setDisposeStream(boolean value)](#setDisposeStream-boolean) | Gets or sets a value indicating whether destionation stream should be disposed. |
| [getFontStoreType()](#getFontStoreType) | Gets or sets a value indicating how to store font. |
| [setFontStoreType(int value)](#setFontStoreType-int) | Gets or sets a value indicating how to store font. |

### FontStoringArgs() {#FontStoringArgs}
```java
public FontStoringArgs()
```

### getSourceFontFileName() {#getSourceFontFileName}
```java
public final String getSourceFontFileName()
```

Gets the source font file name.

**Returns:** String - The source font file.

### getSourceFontStream() {#getSourceFontStream}
```java
public final InputStream getSourceFontStream()
```

Gets the source font stream, where font data will be read from.

**Returns:** InputStream - The source font stream.

### getDestFontStream() {#getDestFontStream}
```java
public final InputStream getDestFontStream()
```

Gets or sets the destination stream where font data will be written to if FontStoreType is set to Stream.

**Returns:** InputStream - The destination font stream.

### setDestFontStream(InputStream value) {#setDestFontStream-java.io.InputStream}
```java
public final void setDestFontStream(InputStream value)
```

Gets or sets the destination stream where font data will be written to if FontStoreType is set to Stream.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | InputStream | The destination font stream. |

### getFontFileUri() {#getFontFileUri}
```java
public final String getFontFileUri()
```

Gets or sets the font file URI.

**Returns:** String - The font file URI.

### setFontFileUri(String value) {#setFontFileUri-java.lang.String}
```java
public final void setFontFileUri(String value)
```

Gets or sets the font file URI.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | String | The font file URI. |

### getDisposeStream() {#getDisposeStream}
```java
public final boolean getDisposeStream()
```

Gets or sets a value indicating whether destionation stream should be disposed.

**Returns:** boolean - true if [dispose stream]; otherwise, false .

### setDisposeStream(boolean value) {#setDisposeStream-boolean}
```java
public final void setDisposeStream(boolean value)
```

Gets or sets a value indicating whether destionation stream should be disposed.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | true if [dispose stream]; otherwise, false . |

### getFontStoreType() {#getFontStoreType}
```java
public final int getFontStoreType()
```

Gets or sets a value indicating how to store font.

**Returns:** int - Do not store font, store embedded in SVG file, or store in provided destination stream.

### setFontStoreType(int value) {#setFontStoreType-int}
```java
public final void setFontStoreType(int value)
```

Gets or sets a value indicating how to store font.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | int | Do not store font, store embedded in SVG file, or store in provided destination stream. |

