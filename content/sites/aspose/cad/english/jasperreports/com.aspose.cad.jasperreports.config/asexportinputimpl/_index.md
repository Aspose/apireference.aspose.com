---
title: "ASExportInputImpl"
linktitle: "ASExportInputImpl"
second_title: "Aspose.CAD for JasperReports"
description: "The type As export input."
type: docs
weight: 10
url: /jasperreports/com.aspose.cad.jasperreports.config/asexportinputimpl/
---

**Inheritance:** java.lang.Object, net.sf.jasperreports.export.SimpleExporterInput

**All Implemented Interfaces:** ASExportInput

The type As export input.

## Constructors

| Constructor | Description |
| --- | --- |
| [ASExportInputImpl(net.sf.jasperreports.engine.JasperPrint jasperPrint)](#ASExportInputImpl-net.sf.jasperreports.engine.JasperPrint) | Creates an ExporterInput object with a single item wrapping the JasperPrint object that will be exported. If you already have a JasperPrint object, you can pass it to the exporter using this type of input. |
| [ASExportInputImpl(InputStream inputStream)](#ASExportInputImpl-java.io.InputStream) | Creates an ExporterInput object with a single JasperPrint item read from the provided input stream. If you want to read the JasperPrint object from an input stream (like a web location), you can pass the stream to this constructor. |
| [ASExportInputImpl(URL url)](#ASExportInputImpl-java.net.URL) | Creates an ExporterInput object with a single JasperPrint item read from the provided URL. If the JasperPrint object is available as a web resource, you can use this constructor, instead of opening a HTTP connection and read from the input stream. |
| [ASExportInputImpl(File file)](#ASExportInputImpl-java.io.File) | Creates an ExporterInput object with a single JasperPrint item read from the provided java.io.File . This is useful if the JasperPrint object is representing a file on disk. |
| [ASExportInputImpl(String fileName)](#ASExportInputImpl-java.lang.String) | Creates an ExporterInput object with a single JasperPrint item read from the provided file. This is useful if the JasperPrint object is representing a file on disk. |
| [ASExportInputImpl(List<net.sf.jasperreports.export.ExporterInputItem> items)](#ASExportInputImpl-java.util.List) | Creates an ExporterInput object with the provided export items. |

### ASExportInputImpl(net.sf.jasperreports.engine.JasperPrint jasperPrint) {#ASExportInputImpl-net.sf.jasperreports.engine.JasperPrint}
```java
public ASExportInputImpl(net.sf.jasperreports.engine.JasperPrint jasperPrint)
```

Creates an ExporterInput object with a single item wrapping the JasperPrint object that will be exported. If you already have a JasperPrint object, you can pass it to the exporter using this type of input.

### ASExportInputImpl(InputStream inputStream) {#ASExportInputImpl-java.io.InputStream}
```java
public ASExportInputImpl(InputStream inputStream)
```

Creates an ExporterInput object with a single JasperPrint item read from the provided input stream. If you want to read the JasperPrint object from an input stream (like a web location), you can pass the stream to this constructor.

### ASExportInputImpl(URL url) {#ASExportInputImpl-java.net.URL}
```java
public ASExportInputImpl(URL url)
```

Creates an ExporterInput object with a single JasperPrint item read from the provided URL. If the JasperPrint object is available as a web resource, you can use this constructor, instead of opening a HTTP connection and read from the input stream.

### ASExportInputImpl(File file) {#ASExportInputImpl-java.io.File}
```java
public ASExportInputImpl(File file)
```

Creates an ExporterInput object with a single JasperPrint item read from the provided java.io.File . This is useful if the JasperPrint object is representing a file on disk.

### ASExportInputImpl(String fileName) {#ASExportInputImpl-java.lang.String}
```java
public ASExportInputImpl(String fileName)
```

Creates an ExporterInput object with a single JasperPrint item read from the provided file. This is useful if the JasperPrint object is representing a file on disk.

### ASExportInputImpl(List<net.sf.jasperreports.export.ExporterInputItem> items) {#ASExportInputImpl-java.util.List}
```java
public ASExportInputImpl(List<net.sf.jasperreports.export.ExporterInputItem> items)
```

Creates an ExporterInput object with the provided export items.

