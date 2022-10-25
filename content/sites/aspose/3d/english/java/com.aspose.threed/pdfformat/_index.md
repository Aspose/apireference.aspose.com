---
title: PdfFormat
second_title: Aspose.3D for Java API Reference
description: Adobes Portable Document Format
type: docs
weight: 110
url: /java/com.aspose.threed/pdfformat/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.FileFormat](../../com.aspose.threed/fileformat)
```
public class PdfFormat extends FileFormat
```

Adobe's Portable Document Format
## Methods

| Method | Description |
| --- | --- |
| [extract(String fileName, byte[] password)](#extract-java.lang.String-byte---) | Extract raw 3D content from PDF file. |
| [extract(String fileName)](#extract-java.lang.String-) | Extract raw 3D content from PDF file. |
| [extract(Stream stream, byte[] password)](#extract-com.aspose.threed.Stream-byte---) | Extract raw 3D content from PDF stream. |
| [extract(Stream stream)](#extract-com.aspose.threed.Stream-) | Extract raw 3D content from PDF stream. |
| [extractScene(String fileName)](#extractScene-java.lang.String-) | Extract 3D scenes from PDF file. |
| [extractScene(String fileName, byte[] password)](#extractScene-java.lang.String-byte---) | Extract 3D scenes from PDF file. |
| [extractScene(Stream stream, byte[] password)](#extractScene-com.aspose.threed.Stream-byte---) | Extract raw 3D content from PDF stream. |
| [extractScene(Stream stream)](#extractScene-com.aspose.threed.Stream-) | Extract raw 3D content from PDF stream. |
### extract(String fileName, byte[] password) {#extract-java.lang.String-byte---}
```
public ArrayList<byte[]> extract(String fileName, byte[] password)
```


Extract raw 3D content from PDF file.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fileName | java.lang.String |  |
| password | byte[] |  |

**Returns:**
java.util.ArrayList<byte[]>
### extract(String fileName) {#extract-java.lang.String-}
```
public ArrayList<byte[]> extract(String fileName)
```


Extract raw 3D content from PDF file.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fileName | java.lang.String |  |

**Returns:**
java.util.ArrayList<byte[]>
### extract(Stream stream, byte[] password) {#extract-com.aspose.threed.Stream-byte---}
```
public ArrayList<byte[]> extract(Stream stream, byte[] password)
```


Extract raw 3D content from PDF stream.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| stream | com.aspose.threed.Stream |  |
| password | byte[] |  |

**Returns:**
java.util.ArrayList<byte[]>
### extract(Stream stream) {#extract-com.aspose.threed.Stream-}
```
public ArrayList<byte[]> extract(Stream stream)
```


Extract raw 3D content from PDF stream.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| stream | com.aspose.threed.Stream |  |

**Returns:**
java.util.ArrayList<byte[]>
### extractScene(String fileName) {#extractScene-java.lang.String-}
```
public ArrayList<Scene> extractScene(String fileName)
```


Extract 3D scenes from PDF file.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fileName | java.lang.String |  |

**Returns:**
java.util.ArrayList<com.aspose.threed.Scene>
### extractScene(String fileName, byte[] password) {#extractScene-java.lang.String-byte---}
```
public ArrayList<Scene> extractScene(String fileName, byte[] password)
```


Extract 3D scenes from PDF file.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fileName | java.lang.String |  |
| password | byte[] |  |

**Returns:**
java.util.ArrayList<com.aspose.threed.Scene>
### extractScene(Stream stream, byte[] password) {#extractScene-com.aspose.threed.Stream-byte---}
```
public ArrayList<Scene> extractScene(Stream stream, byte[] password)
```


Extract raw 3D content from PDF stream.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| stream | com.aspose.threed.Stream |  |
| password | byte[] |  |

**Returns:**
java.util.ArrayList<com.aspose.threed.Scene>
### extractScene(Stream stream) {#extractScene-com.aspose.threed.Stream-}
```
public ArrayList<Scene> extractScene(Stream stream)
```


Extract raw 3D content from PDF stream.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| stream | com.aspose.threed.Stream |  |

**Returns:**
java.util.ArrayList<com.aspose.threed.Scene>
