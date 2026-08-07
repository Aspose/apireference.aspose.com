---
title: "InterruptionTokenSource"
linktitle: "InterruptionTokenSource"
second_title: "Aspose.CAD for Java"
description: "Source that provides token used to interrupt long operations and triggers interruption."
type: docs
weight: 10
url: /java/com.aspose.cad/interruptiontokensource/
---

**All Implemented Interfaces:** com.aspose.ms.System.IDisposable

Source that provides token used to interrupt long operations and triggers interruption. Must be disposed!

## Constructors

| Constructor | Description |
| --- | --- |
| [InterruptionTokenSource()](#InterruptionTokenSource) | Creates source |

## Methods

| Method | Description |
| --- | --- |
| [dispose()](#dispose) | Disposes source |
| [getToken()](#getToken) | Token used to interrupt long operations |
| [interrupt()](#interrupt) | Triggers the interruption of operation |

### InterruptionTokenSource() {#InterruptionTokenSource}
```java
public InterruptionTokenSource()
```

Creates source

### dispose() {#dispose}
```java
public final void dispose()
```

Disposes source

### getToken() {#getToken}
```java
public final InterruptionToken getToken()
```

Token used to interrupt long operations

**Returns:** InterruptionToken

### interrupt() {#interrupt}
```java
public final void interrupt()
```

Triggers the interruption of operation

