---
title: "DxfOptions"
linktitle: "DxfOptions"
second_title: "Aspose.CAD for Java"
description: "The SVG file format creation options."
type: docs
weight: 10
url: /java/com.aspose.cad.imageoptions/dxfoptions/
---

**Inheritance:** java.lang.Object, ImageOptionsBase

The SVG file format creation options.

## Constructors

| Constructor | Description |
| --- | --- |
| [DxfOptions()](#DxfOptions) |  |

## Methods

| Method | Description |
| --- | --- |
| [getVersion()](#getVersion) | Version of output DXF format |
| [setVersion(int value)](#setVersion-int) | Version of output DXF format |
| [getBezierPointCount()](#getBezierPointCount) | How many points to generate when converting Bezier curves to polylines |
| [setBezierPointCount(byte value)](#setBezierPointCount-byte) | How many points to generate when converting Bezier curves to polylines |
| [getConvertTextBeziers()](#getConvertTextBeziers) | Wether to convert Bezier curves in text outlines to multipoint polylines (converted to 4 points if false). |
| [setConvertTextBeziers(boolean value)](#setConvertTextBeziers-boolean) | Wether to convert Bezier curves in text outlines to multipoint polylines (converted to 4 points if false). |
| [getTextAsLines()](#getTextAsLines) | Gets or sets a value indicating whether [text as lines]. |
| [setTextAsLines(boolean value)](#setTextAsLines-boolean) | Gets or sets a value indicating whether [text as lines]. |
| [getTargetFormat()](#getTargetFormat) |  |

### DxfOptions() {#DxfOptions}
```java
public DxfOptions()
```

### getVersion() {#getVersion}
```java
public final int getVersion()
```

Version of output DXF format

**Returns:** int

### setVersion(int value) {#setVersion-int}
```java
public final void setVersion(int value)
```

Version of output DXF format

### getBezierPointCount() {#getBezierPointCount}
```java
public final byte getBezierPointCount()
```

How many points to generate when converting Bezier curves to polylines

**Returns:** byte

### setBezierPointCount(byte value) {#setBezierPointCount-byte}
```java
public final void setBezierPointCount(byte value)
```

How many points to generate when converting Bezier curves to polylines

### getConvertTextBeziers() {#getConvertTextBeziers}
```java
public final boolean getConvertTextBeziers()
```

Wether to convert Bezier curves in text outlines to multipoint polylines (converted to 4 points if false).

**Returns:** boolean

### setConvertTextBeziers(boolean value) {#setConvertTextBeziers-boolean}
```java
public final void setConvertTextBeziers(boolean value)
```

Wether to convert Bezier curves in text outlines to multipoint polylines (converted to 4 points if false).

### getTextAsLines() {#getTextAsLines}
```java
public final boolean getTextAsLines()
```

Gets or sets a value indicating whether [text as lines].

**Returns:** boolean - true if [text as lines]; otherwise, false .

### setTextAsLines(boolean value) {#setTextAsLines-boolean}
```java
public final void setTextAsLines(boolean value)
```

Gets or sets a value indicating whether [text as lines].

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | true if [text as lines]; otherwise, false . |

### getTargetFormat() {#getTargetFormat}
```java
public long getTargetFormat()
```

**Returns:** long

