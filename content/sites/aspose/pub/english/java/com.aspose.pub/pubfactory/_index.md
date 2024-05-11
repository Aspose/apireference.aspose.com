---
title: PubFactory
second_title: Aspose.PUB for Java API Reference
description: Factory for PUB objects
type: docs
weight: 18
url: /java/com.aspose.pub/pubfactory/
---
**Inheritance:**
java.lang.Object
```
public class PubFactory
```

Factory for PUB objects
## Constructors

| Constructor | Description |
| --- | --- |
| [PubFactory()](#PubFactory--) |  |
## Methods

| Method | Description |
| --- | --- |
| [createParser(String fileName)](#createParser-java.lang.String-) | Creates PUB parser for PUB file |
| [createParser(InputStream pubStream)](#createParser-java.io.InputStream-) | Creates PUB parser for PUB stream |
| [createPdfConverter()](#createPdfConverter--) | Creates PdfConverter |
### PubFactory() {#PubFactory--}
```
public PubFactory()
```


### createParser(String fileName) {#createParser-java.lang.String-}
```
public static IPubParser createParser(String fileName)
```


Creates PUB parser for PUB file

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fileName | java.lang.String | PUB file name |

**Returns:**
[IPubParser](../../com.aspose.pub/ipubparser) - PUB parser
### createParser(InputStream pubStream) {#createParser-java.io.InputStream-}
```
public static IPubParser createParser(InputStream pubStream)
```


Creates PUB parser for PUB stream

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| pubStream | java.io.InputStream | stream with PUB data |

**Returns:**
[IPubParser](../../com.aspose.pub/ipubparser) - PUB parser
### createPdfConverter() {#createPdfConverter--}
```
public static IPdfConverter createPdfConverter()
```


Creates PdfConverter

**Returns:**
[IPdfConverter](../../com.aspose.pub/ipdfconverter) - PdfConverter
