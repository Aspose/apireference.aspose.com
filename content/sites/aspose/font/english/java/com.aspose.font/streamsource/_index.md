---
title: StreamSource
second_title: Aspose.Font for Java API Reference
description: Defines a way to get a file stream when it is needed.
type: docs
weight: 60
url: /java/com.aspose.font/streamsource/
---
**Inheritance:**
java.lang.Object
```
public abstract class StreamSource
```

Defines a way to get a file stream when it is needed.
## Constructors

| Constructor | Description |
| --- | --- |
| [StreamSource()](#StreamSource--) | Initializes stream source instance. |
## Methods

| Method | Description |
| --- | --- |
| [getFontStream()](#getFontStream--) | Returns Font stream. |
| [mustCloseAfterUse()](#mustCloseAfterUse--) | The inheritors may prevent stream from closing. |
| [getOffset()](#getOffset--) | Gets offset inside the source. |
| [setOffset(long value)](#setOffset-long-) | Sets offset inside the source. |
| [deepClone()](#deepClone--) | Clones the stream source object. |
### StreamSource() {#StreamSource--}
```
public StreamSource()
```


Initializes stream source instance.

### getFontStream() {#getFontStream--}
```
public abstract InputStream getFontStream()
```


Returns Font stream.

**Returns:**
java.io.InputStream - Font stream.
### mustCloseAfterUse() {#mustCloseAfterUse--}
```
public boolean mustCloseAfterUse()
```


The inheritors may prevent stream from closing. Returns true if the stream source wants the stream to be closed after use. Otherwise returns false.

**Returns:**
boolean - True if the stream source wants the stream to be closed after use, otherwise false.
### getOffset() {#getOffset--}
```
public long getOffset()
```


Gets offset inside the source.

**Returns:**
long - Offset inside the source.
### setOffset(long value) {#setOffset-long-}
```
public void setOffset(long value)
```


Sets offset inside the source.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | long | Offset inside the source. |

### deepClone() {#deepClone--}
```
public abstract Object deepClone()
```


Clones the stream source object.

**Returns:**
java.lang.Object - Copy of the stream source object.
