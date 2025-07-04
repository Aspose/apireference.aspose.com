---
title: SplitArchiveSaveOptions
second_title: Aspose.ZIP for Java API Reference
description: Options for saving a multi-volume zip archive.
type: docs
weight: 96
url: /java/com.aspose.zip/splitarchivesaveoptions/
---

**Inheritance:**
java.lang.Object
```
public class SplitArchiveSaveOptions
```

Options for saving a multi-volume zip archive.
## Constructors

| Constructor | Description |
| --- | --- |
| [SplitArchiveSaveOptions(String fileName, long segmentSize)](#SplitArchiveSaveOptions-java.lang.String-long-) | Instantiates settings for saving a multi-volume zip archive. |
## Methods

| Method | Description |
| --- | --- |
| [getArchiveComment()](#getArchiveComment--) | Gets optional comment for the Zip file. |
| [getCloseEntrySource()](#getCloseEntrySource--) | Gets a value indicating whether entries' sources should be closed right after an entry has been compressed. |
| [getEncoding()](#getEncoding--) | Gets encoding for converting file names and other strings to bytes. |
| [getEventsBag()](#getEventsBag--) | Gets container of events raising on archive saving. |
| [getFileName()](#getFileName--) | Gets the name of segments without extension. |
| [getSegmentSize()](#getSegmentSize--) | Gets the size of the segment. |
| [setArchiveComment(String value)](#setArchiveComment-java.lang.String-) | Sets optional comment for the Zip file. |
| [setCloseEntrySource(boolean value)](#setCloseEntrySource-boolean-) | Sets a value indicating whether entries' sources should be closed right after an entry has been compressed. |
| [setEncoding(Charset value)](#setEncoding-java.nio.charset.Charset-) | Sets encoding for converting file names and other strings to bytes. |
| [setEventsBag(EventsBag value)](#setEventsBag-com.aspose.zip.EventsBag-) | Sets container of events raising on archive saving. |
### SplitArchiveSaveOptions(String fileName, long segmentSize) {#SplitArchiveSaveOptions-java.lang.String-long-}
```
public SplitArchiveSaveOptions(String fileName, long segmentSize)
```


Instantiates settings for saving a multi-volume zip archive.

Some volumes may be less than `segmentSize`. In most cases, the last segment will be less but rarely regular segments might be too.

Names of files will be as follows: `fileName`.z01, `fileName`.z02, ..., `fileName`.z(n-1), `fileName`.zip.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fileName | java.lang.String | Name for volumes. May be with or without .zip extension. |
| segmentSize | long | Size of volume. |

### getArchiveComment() {#getArchiveComment--}
```
public final String getArchiveComment()
```


Gets optional comment for the Zip file.

**Returns:**
java.lang.String - optional comment for the Zip file.
### getCloseEntrySource() {#getCloseEntrySource--}
```
public final boolean getCloseEntrySource()
```


Gets a value indicating whether entries' sources should be closed right after an entry has been compressed.

**Returns:**
boolean - a value indicating whether entries' sources should be closed right after an entry has been compressed.
### getEncoding() {#getEncoding--}
```
public final Charset getEncoding()
```


Gets encoding for converting file names and other strings to bytes.

If not set, code page 437 will be used.

**Returns:**
java.nio.charset.Charset - encoding for converting file names and other strings to bytes.
### getEventsBag() {#getEventsBag--}
```
public final EventsBag getEventsBag()
```


Gets container of events raising on archive saving.

**Returns:**
[EventsBag](../../com.aspose.zip/eventsbag) - container of events raising on archive saving.
### getFileName() {#getFileName--}
```
public final String getFileName()
```


Gets the name of segments without extension.

**Returns:**
java.lang.String - the name of segments without extension.
### getSegmentSize() {#getSegmentSize--}
```
public final long getSegmentSize()
```


Gets the size of the segment.

**Returns:**
long - the size of the segment.
### setArchiveComment(String value) {#setArchiveComment-java.lang.String-}
```
public final void setArchiveComment(String value)
```


Sets optional comment for the Zip file.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | optional comment for the Zip file. |

### setCloseEntrySource(boolean value) {#setCloseEntrySource-boolean-}
```
public final void setCloseEntrySource(boolean value)
```


Sets a value indicating whether entries' sources should be closed right after an entry has been compressed.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | a value indicating whether entries' sources should be closed right after an entry has been compressed. |

### setEncoding(Charset value) {#setEncoding-java.nio.charset.Charset-}
```
public final void setEncoding(Charset value)
```


Sets encoding for converting file names and other strings to bytes.

If not set, code page 437 will be used.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.nio.charset.Charset | encoding for converting file names and other strings to bytes. |

### setEventsBag(EventsBag value) {#setEventsBag-com.aspose.zip.EventsBag-}
```
public final void setEventsBag(EventsBag value)
```


Sets container of events raising on archive saving.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [EventsBag](../../com.aspose.zip/eventsbag) | container of events raising on archive saving. |

