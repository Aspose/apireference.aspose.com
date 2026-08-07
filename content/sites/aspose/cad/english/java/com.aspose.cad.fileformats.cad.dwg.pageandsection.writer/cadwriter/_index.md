---
title: "CadWriter"
linktitle: "CadWriter"
second_title: "Aspose.CAD for Java"
description: ""
type: docs
weight: 10
url: /java/com.aspose.cad.fileformats.cad.dwg.pageandsection.writer/cadwriter/
---

## Constructors

| Constructor | Description |
| --- | --- |
| [CadWriter()](#CadWriter) |  |

## Methods

| Method | Description |
| --- | --- |
| [getInstanceWriter(InputStream stream, com.aspose.cad.StreamContainer baseStream, CadImage cadImage, int specifiedEncoding, String filePath)](#getInstanceWriter-java.io.InputStream-com.aspose.cad.StreamContainer-com.aspose.cad.fileformats.cad.CadImage-int-java.lang.String) | Get instance writer |
| [registerWriter(Class<?> writer, String format)](#registerWriter-java.lang.Class-java.lang.String) | Registers the writer. |

### CadWriter() {#CadWriter}
```java
public CadWriter()
```

### getInstanceWriter(InputStream stream, com.aspose.cad.StreamContainer baseStream, CadImage cadImage, int specifiedEncoding, String filePath) {#getInstanceWriter-java.io.InputStream-com.aspose.cad.StreamContainer-com.aspose.cad.fileformats.cad.CadImage-int-java.lang.String}
```java
public static ICadWriter getInstanceWriter(InputStream stream, com.aspose.cad.StreamContainer baseStream, CadImage cadImage, int specifiedEncoding, String filePath)
```

Get instance writer

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| stream | InputStream | The stream |
| baseStream | com.aspose.cad.StreamContainer | The baseStream |
| cadImage | CadImage | THe cadImage |
| specifiedEncoding | int | The specifiedEncoding |
| filePath | String | the filePath |

**Returns:** ICadWriter - ICadWriter interface

### registerWriter(Class<?> writer, String format) {#registerWriter-java.lang.Class-java.lang.String}
```java
public static void registerWriter(Class<?> writer, String format)
```

Registers the writer.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| writer | Class<?> | The writer. |
| format | String | The format. |

