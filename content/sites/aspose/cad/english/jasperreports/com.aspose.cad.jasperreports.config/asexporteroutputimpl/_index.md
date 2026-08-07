---
title: "ASExporterOutputImpl"
linktitle: "ASExporterOutputImpl"
second_title: "Aspose.CAD for JasperReports"
description: "Export output configuration."
type: docs
weight: 10
url: /jasperreports/com.aspose.cad.jasperreports.config/asexporteroutputimpl/
---

**Inheritance:** java.lang.Object, net.sf.jasperreports.export.SimpleOutputStreamExporterOutput

**All Implemented Interfaces:** ASExporterOutput

Export output configuration.

## Constructors

| Constructor | Description |
| --- | --- |
| [ASExporterOutputImpl(OutputStream outputStream)](#ASExporterOutputImpl-java.io.OutputStream) | Instantiates a new instance of ASExporterOutputImpl . |
| [ASExporterOutputImpl(File file)](#ASExporterOutputImpl-java.io.File) | Instantiates a new instance of ASExporterOutputImpl . |
| [ASExporterOutputImpl(String fileName)](#ASExporterOutputImpl-java.lang.String) | Instantiates a new As exporter output. |

## Methods

| Method | Description |
| --- | --- |
| [isMultipageExport()](#isMultipageExport) | Gets a value indicating whether file should be exported in multipage format. Value: true if multipage export; otherwise, false . |
| [setMultipageExport(boolean multipageExport)](#setMultipageExport-boolean) | Sets multipage export indicator. For pdf format the default value is true and false for other. |

### ASExporterOutputImpl(OutputStream outputStream) {#ASExporterOutputImpl-java.io.OutputStream}
```java
public ASExporterOutputImpl(OutputStream outputStream)
```

Instantiates a new instance of ASExporterOutputImpl .

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| outputStream | OutputStream | the output stream |

### ASExporterOutputImpl(File file) {#ASExporterOutputImpl-java.io.File}
```java
public ASExporterOutputImpl(File file)
```

Instantiates a new instance of ASExporterOutputImpl .

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| file | File | the file |

### ASExporterOutputImpl(String fileName) {#ASExporterOutputImpl-java.lang.String}
```java
public ASExporterOutputImpl(String fileName)
```

Instantiates a new As exporter output.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| fileName | String | the file name |

### isMultipageExport() {#isMultipageExport}
```java
public boolean isMultipageExport()
```

Gets a value indicating whether file should be exported in multipage format. Value: true if multipage export; otherwise, false .

**Returns:** boolean

### setMultipageExport(boolean multipageExport) {#setMultipageExport-boolean}
```java
public void setMultipageExport(boolean multipageExport)
```

Sets multipage export indicator. For pdf format the default value is true and false for other.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| multipageExport | boolean | the multipage export |

