---
title: FontFileDefinition
second_title: Aspose.Font for Java API Reference
description: Represents Font file definition.
type: docs
weight: 39
url: /java/com.aspose.font/fontfiledefinition/
---
**Inheritance:**
java.lang.Object
```
public class FontFileDefinition
```

Represents Font file definition.
## Constructors

| Constructor | Description |
| --- | --- |
| [FontFileDefinition(StreamSource streamSource)](#FontFileDefinition-com.aspose.font.StreamSource-) | Creates a file definition using file content only. |
| [FontFileDefinition(String fileExtension, StreamSource streamSource)](#FontFileDefinition-java.lang.String-com.aspose.font.StreamSource-) | Creates a file definition using file content only. |
| [FontFileDefinition(String fileExtension, StreamSource streamSource, long offset)](#FontFileDefinition-java.lang.String-com.aspose.font.StreamSource-long-) | Creates a file definition using file content only. |
| [FontFileDefinition(File fontFile)](#FontFileDefinition-java.io.File-) | Creates a file definition using font file (represented by File) and file content. |
## Methods

| Method | Description |
| --- | --- |
| [getFileName()](#getFileName--) | Gets File name. |
| [getFileExtension()](#getFileExtension--) | Gets File extension. |
| [getStreamSource()](#getStreamSource--) | Gets the stream source. |
| [getOffset()](#getOffset--) | Gets offset inside the stream. |
### FontFileDefinition(StreamSource streamSource) {#FontFileDefinition-com.aspose.font.StreamSource-}
```
public FontFileDefinition(StreamSource streamSource)
```


Creates a file definition using file content only.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| streamSource | [StreamSource](../../com.aspose.font/streamsource) | Font stream source. |

### FontFileDefinition(String fileExtension, StreamSource streamSource) {#FontFileDefinition-java.lang.String-com.aspose.font.StreamSource-}
```
public FontFileDefinition(String fileExtension, StreamSource streamSource)
```


Creates a file definition using file content only.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fileExtension | java.lang.String | Font file extension. |
| streamSource | [StreamSource](../../com.aspose.font/streamsource) | Font stream source. |

### FontFileDefinition(String fileExtension, StreamSource streamSource, long offset) {#FontFileDefinition-java.lang.String-com.aspose.font.StreamSource-long-}
```
public FontFileDefinition(String fileExtension, StreamSource streamSource, long offset)
```


Creates a file definition using file content only.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fileExtension | java.lang.String | Font file extension. |
| streamSource | [StreamSource](../../com.aspose.font/streamsource) | Font stream source. |
| offset | long | Offset to font data in stream source. |

### FontFileDefinition(File fontFile) {#FontFileDefinition-java.io.File-}
```
public FontFileDefinition(File fontFile)
```


Creates a file definition using font file (represented by File) and file content.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fontFile | java.io.File | File object. |

### getFileName() {#getFileName--}
```
public String getFileName()
```


Gets File name.

**Returns:**
java.lang.String - File name.
### getFileExtension() {#getFileExtension--}
```
public String getFileExtension()
```


Gets File extension.

**Returns:**
java.lang.String - File extension.
### getStreamSource() {#getStreamSource--}
```
public StreamSource getStreamSource()
```


Gets the stream source.

**Returns:**
[StreamSource](../../com.aspose.font/streamsource) - The stream source.
### getOffset() {#getOffset--}
```
public long getOffset()
```


Gets offset inside the stream.

**Returns:**
long - Offset inside the stream.
