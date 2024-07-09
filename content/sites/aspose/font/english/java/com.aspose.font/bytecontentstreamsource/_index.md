---
title: ByteContentStreamSource
second_title: Aspose.Font for Java API Reference
description: Represents a stream source based on content stream.
type: docs
weight: 17
url: /java/com.aspose.font/bytecontentstreamsource/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.StreamSource](../../com.aspose.font/streamsource)
```
public class ByteContentStreamSource extends StreamSource
```

Represents a stream source based on content stream.
## Constructors

| Constructor | Description |
| --- | --- |
| [ByteContentStreamSource(byte[] fileContent)](#ByteContentStreamSource-byte---) | Initializes new  ByteContentStreamSource  object. |
## Methods

| Method | Description |
| --- | --- |
| [getFontStream()](#getFontStream--) | Returns Font file stream. |
| [deepClone()](#deepClone--) | Clones the ByteContentStreamSource object. |
### ByteContentStreamSource(byte[] fileContent) {#ByteContentStreamSource-byte---}
```
public ByteContentStreamSource(byte[] fileContent)
```


Initializes new  ByteContentStreamSource  object.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fileContent | byte[] | File bytes. |

### getFontStream() {#getFontStream--}
```
public InputStream getFontStream()
```


Returns Font file stream. Don't forget to close the stream after use.

**Returns:**
java.io.InputStream - Font file stream.
### deepClone() {#deepClone--}
```
public Object deepClone()
```


Clones the ByteContentStreamSource object.

**Returns:**
java.lang.Object
