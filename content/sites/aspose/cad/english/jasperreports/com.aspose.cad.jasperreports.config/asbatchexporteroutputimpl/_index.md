---
title: "ASBatchExporterOutputImpl"
linktitle: "ASBatchExporterOutputImpl"
second_title: "Aspose.CAD for JasperReports"
description: "Batch export output configuration for export of each page of a document separately."
type: docs
weight: 10
url: /jasperreports/com.aspose.cad.jasperreports.config/asbatchexporteroutputimpl/
---

**Inheritance:** java.lang.Object, net.sf.jasperreports.export.SimpleOutputStreamExporterOutput

**All Implemented Interfaces:** ASBatchExporterOutput

Batch export output configuration for export of each page of a document separately.

## Constructors

| Constructor | Description |
| --- | --- |
| [ASBatchExporterOutputImpl(OutputStream outputStream)](#ASBatchExporterOutputImpl-java.io.OutputStream) | Creates a ASBatchExporterOutputImpl instance that puts the zip archive output into provided java.io.OutputStream object. This is useful for sending the export result to an output stream, such as a ServletOutputStream . |
| [ASBatchExporterOutputImpl(OutputStream outputStream, String batchImageExportPrefix)](#ASBatchExporterOutputImpl-java.io.OutputStream-java.lang.String) | Creates a ASBatchExporterOutputImpl instance that puts the zip archive output into provided java.io.OutputStream object. This is useful for sending the export result to an output stream, such as a ServletOutputStream . |
| [ASBatchExporterOutputImpl(File zipFile)](#ASBatchExporterOutputImpl-java.io.File) | Creates a ASBatchExporterOutputImpl instance that puts the zip archive output into the provided java.io.File object. This is useful when exporting to a file and the File instance is already there. |
| [ASBatchExporterOutputImpl(File zipFile, String batchImageExportPrefix)](#ASBatchExporterOutputImpl-java.io.File-java.lang.String) | Creates a ASBatchExporterOutputImpl instance that puts the zip archive output into the provided java.io.File object. This is useful when exporting to a file and the File instance is already there. |
| [ASBatchExporterOutputImpl(String batchExportPath)](#ASBatchExporterOutputImpl-java.lang.String) | Creates a ASBatchExporterOutputImpl instance that puts batch files into the directory designated by the provided file name. |
| [ASBatchExporterOutputImpl(String batchExportPath, String batchImageExportPrefix)](#ASBatchExporterOutputImpl-java.lang.String-java.lang.String) | Creates a ASBatchExporterOutputImpl instance that puts batch files into the directory designated by the provided file name. |

## Methods

| Method | Description |
| --- | --- |
| [getBatchExportPath()](#getBatchExportPath) | Gets the batch export path. |
| [setBatchExportPath(String batchExportPath)](#setBatchExportPath-java.lang.String) | Sets batch export path. The default value is "page_". |
| [getBatchImageExportPrefix()](#getBatchImageExportPrefix) | Gets the prefix of the exported batch files Value: true if multipage export; otherwise, false . |
| [setBatchImageExportPrefix(String batchPrefix)](#setBatchImageExportPrefix-java.lang.String) | Sets batch image export prefix. |
| [isZipArchive()](#isZipArchive) | Description copied from interface: ASBatchExporterOutput |

### ASBatchExporterOutputImpl(OutputStream outputStream) {#ASBatchExporterOutputImpl-java.io.OutputStream}
```java
public ASBatchExporterOutputImpl(OutputStream outputStream)
```

Creates a ASBatchExporterOutputImpl instance that puts the zip archive output into provided java.io.OutputStream object. This is useful for sending the export result to an output stream, such as a ServletOutputStream .

### ASBatchExporterOutputImpl(OutputStream outputStream, String batchImageExportPrefix) {#ASBatchExporterOutputImpl-java.io.OutputStream-java.lang.String}
```java
public ASBatchExporterOutputImpl(OutputStream outputStream, String batchImageExportPrefix)
```

Creates a ASBatchExporterOutputImpl instance that puts the zip archive output into provided java.io.OutputStream object. This is useful for sending the export result to an output stream, such as a ServletOutputStream .

### ASBatchExporterOutputImpl(File zipFile) {#ASBatchExporterOutputImpl-java.io.File}
```java
public ASBatchExporterOutputImpl(File zipFile)
```

Creates a ASBatchExporterOutputImpl instance that puts the zip archive output into the provided java.io.File object. This is useful when exporting to a file and the File instance is already there.

### ASBatchExporterOutputImpl(File zipFile, String batchImageExportPrefix) {#ASBatchExporterOutputImpl-java.io.File-java.lang.String}
```java
public ASBatchExporterOutputImpl(File zipFile, String batchImageExportPrefix)
```

Creates a ASBatchExporterOutputImpl instance that puts the zip archive output into the provided java.io.File object. This is useful when exporting to a file and the File instance is already there.

### ASBatchExporterOutputImpl(String batchExportPath) {#ASBatchExporterOutputImpl-java.lang.String}
```java
public ASBatchExporterOutputImpl(String batchExportPath)
```

Creates a ASBatchExporterOutputImpl instance that puts batch files into the directory designated by the provided file name.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| batchExportPath | String | the batch export path |

### ASBatchExporterOutputImpl(String batchExportPath, String batchImageExportPrefix) {#ASBatchExporterOutputImpl-java.lang.String-java.lang.String}
```java
public ASBatchExporterOutputImpl(String batchExportPath, String batchImageExportPrefix)
```

Creates a ASBatchExporterOutputImpl instance that puts batch files into the directory designated by the provided file name.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| batchExportPath | String | the batch export path |
| batchImageExportPrefix | String | the prefix of the exported batch files. |

### getBatchExportPath() {#getBatchExportPath}
```java
public String getBatchExportPath()
```

Gets the batch export path.

**Returns:** String - The path of batch export.

### setBatchExportPath(String batchExportPath) {#setBatchExportPath-java.lang.String}
```java
public void setBatchExportPath(String batchExportPath)
```

Sets batch export path. The default value is "page_".

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| batchExportPath | String | the batch export path |

**Throws:**

- `com.aspose.ms.System.IO.IOException` - if the directory doesn't exist

### getBatchImageExportPrefix() {#getBatchImageExportPrefix}
```java
public String getBatchImageExportPrefix()
```

Gets the prefix of the exported batch files Value: true if multipage export; otherwise, false .

**Returns:** String - the batch image export prefix

### setBatchImageExportPrefix(String batchPrefix) {#setBatchImageExportPrefix-java.lang.String}
```java
public void setBatchImageExportPrefix(String batchPrefix)
```

Sets batch image export prefix.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| batchPrefix | String | the batch image export prefix |

### isZipArchive() {#isZipArchive}
```java
public boolean isZipArchive()
```

Description copied from interface: ASBatchExporterOutput

**Returns:** boolean - true if output will be as zip archive, otherwise false

