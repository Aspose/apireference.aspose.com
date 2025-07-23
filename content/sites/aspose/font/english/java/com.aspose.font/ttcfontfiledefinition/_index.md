---
title: TtcFontFileDefinition
second_title: Aspose.Font for Java API Reference
description: Represents file definition for TTC Font.
type: docs
weight: 78
url: /java/com.aspose.font/ttcfontfiledefinition/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.FontFileDefinition](../../com.aspose.font/fontfiledefinition)
```
public class TtcFontFileDefinition extends FontFileDefinition
```

Represents file definition for TTC Font.
## Constructors

| Constructor | Description |
| --- | --- |
| [TtcFontFileDefinition(int fontIndex, String fileExtension, StreamSource streamSource, long offset)](#TtcFontFileDefinition-int-java.lang.String-com.aspose.font.StreamSource-long-) | Creates a file definition using file content only. |
## Methods

| Method | Description |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getFileExtension()](#getFileExtension--) | Gets File extension. |
| [getFileName()](#getFileName--) | Gets File name. |
| [getFontIndex()](#getFontIndex--) | Gets Font index inside TTC Font. |
| [getOffset()](#getOffset--) | Gets offset inside the stream. |
| [getStreamSource()](#getStreamSource--) | Gets the stream source. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### TtcFontFileDefinition(int fontIndex, String fileExtension, StreamSource streamSource, long offset) {#TtcFontFileDefinition-int-java.lang.String-com.aspose.font.StreamSource-long-}
```
public TtcFontFileDefinition(int fontIndex, String fileExtension, StreamSource streamSource, long offset)
```


Creates a file definition using file content only.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fontIndex | int | Index of font inside TTC font collection. |
| fileExtension | java.lang.String | Extension of font file collection. |
| streamSource | [StreamSource](../../com.aspose.font/streamsource) | Source of font file collection. |
| offset | long | Offset to font data in font file collection, see TTC Header, Offset Table in OpenType Font File specification |

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getFileExtension() {#getFileExtension--}
```
public String getFileExtension()
```


Gets File extension.

**Returns:**
java.lang.String - File extension.
### getFileName() {#getFileName--}
```
public String getFileName()
```


Gets File name.

**Returns:**
java.lang.String - File name.
### getFontIndex() {#getFontIndex--}
```
public long getFontIndex()
```


Gets Font index inside TTC Font.

**Returns:**
long - Font index inside TTC Font.
### getOffset() {#getOffset--}
```
public long getOffset()
```


Gets offset inside the stream.

**Returns:**
long - Offset inside the stream.
### getStreamSource() {#getStreamSource--}
```
public StreamSource getStreamSource()
```


Gets the stream source.

**Returns:**
[StreamSource](../../com.aspose.font/streamsource) - The stream source.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final native void wait(long arg0)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

