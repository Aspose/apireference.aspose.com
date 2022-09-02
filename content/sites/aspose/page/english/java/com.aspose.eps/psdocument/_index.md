---
title: PsDocument
second_title: Aspose.Page for Java API Reference
description: This class encapsulates PS/EPS documents.
type: docs
weight: 12
url: /java/com.aspose.eps/psdocument/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.Document](../../com.aspose.page/document)
```
public class PsDocument extends Document
```

This class encapsulates PS/EPS documents.
## Constructors

| Constructor | Description |
| --- | --- |
| [PsDocument(InputStream psStream)](#PsDocument-java.io.InputStream-) | Initializes \`\`\` PsDocument \`\`\` with a stream of PS/EPS file. |
## Methods

| Method | Description |
| --- | --- |
| [setInputStream(InputStream is)](#setInputStream-java.io.InputStream-) | Specifies an input stream. |
| [save(Device device, SaveOptions options)](#save-com.aspose.page.Device-com.aspose.page.SaveOptions-) | Saves PS/EPS file to a device. |
| [save(OutputStream epsStream)](#save-java.io.OutputStream-) | Saves given PsDocument as EPS file. |
| [getXmpMetadata()](#getXmpMetadata--) | Reads PS/EPS file and extracts XmpMetdata if it already exists or add new one if it doesn't exist. |
| [saveImageAsEps(InputStream imageStream, OutputStream epsStream, PsSaveOptions options)](#saveImageAsEps-java.io.InputStream-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-) | Saves PNG/JPEG/BMP/GIF image from input stream to EPS output stream. |
| [saveImageAsEps(String imageFilePath, String epsFilePath, PsSaveOptions options)](#saveImageAsEps-java.lang.String-java.lang.String-com.aspose.eps.device.PsSaveOptions-) | Saves PNG/JPEG/BMP/GIF image from file to EPS file. |
| [saveImageAsEps(BufferedImage image, String epsFilePath, PsSaveOptions options)](#saveImageAsEps-java.awt.image.BufferedImage-java.lang.String-com.aspose.eps.device.PsSaveOptions-) | Saves BufferedImage object to EPS file. |
| [saveImageAsEps(BufferedImage image, OutputStream epsStream, PsSaveOptions options)](#saveImageAsEps-java.awt.image.BufferedImage-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-) | Saves BufferedImage object to EPS file. |
| [getNumberOfPages()](#getNumberOfPages--) | Gets a quantity of pages in resulting PDF document. |
| [merge(String[] filesForMerge, Device device, SaveOptions options)](#merge-java.lang.String---com.aspose.page.Device-com.aspose.page.SaveOptions-) | Merges PS/EPS files to a device. |
### PsDocument(InputStream psStream) {#PsDocument-java.io.InputStream-}
```
public PsDocument(InputStream psStream)
```


Initializes \`\`\` PsDocument \`\`\` with a stream of PS/EPS file.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| psStream | java.io.InputStream | Stream of PS/EPS file. |

### setInputStream(InputStream is) {#setInputStream-java.io.InputStream-}
```
public void setInputStream(InputStream is)
```


Specifies an input stream.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| is | java.io.InputStream | Input stream of PS/EPS file. |

### save(Device device, SaveOptions options) {#save-com.aspose.page.Device-com.aspose.page.SaveOptions-}
```
public void save(Device device, SaveOptions options)
```


Saves PS/EPS file to a device.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| device | [Device](../../com.aspose.page/device) | An output device. |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | Contains flags that specify output of errors thrown during conversion. |

### save(OutputStream epsStream) {#save-java.io.OutputStream-}
```
public void save(OutputStream epsStream)
```


Saves given PsDocument as EPS file. This method is used only after updating XMP metadata. It saves initial EPS file with updated existing metadata or new one created while calling getMetadata method. In the last case all necessary PostScript code and EPS comments are added.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| epsStream | java.io.OutputStream | Stream of output EPS file. |

### getXmpMetadata() {#getXmpMetadata--}
```
public XmpMetadata getXmpMetadata()
```


Reads PS/EPS file and extracts XmpMetdata if it already exists or add new one if it doesn't exist.

**Returns:**
[XmpMetadata](../../com.aspose.eps.xmp/xmpmetadata) - existing or new instance of XMP metadata.
### saveImageAsEps(InputStream imageStream, OutputStream epsStream, PsSaveOptions options) {#saveImageAsEps-java.io.InputStream-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-}
```
public static void saveImageAsEps(InputStream imageStream, OutputStream epsStream, PsSaveOptions options)
```


Saves PNG/JPEG/BMP/GIF image from input stream to EPS output stream.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| imageStream | java.io.InputStream | Image input stream. |
| epsStream | java.io.OutputStream | EPS output stream. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Contains parameters that specify output of errors thrown during conversion. |

### saveImageAsEps(String imageFilePath, String epsFilePath, PsSaveOptions options) {#saveImageAsEps-java.lang.String-java.lang.String-com.aspose.eps.device.PsSaveOptions-}
```
public static void saveImageAsEps(String imageFilePath, String epsFilePath, PsSaveOptions options)
```


Saves PNG/JPEG/BMP/GIF image from file to EPS file.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| imageFilePath | java.lang.String | Image file path. |
| epsFilePath | java.lang.String | EPS file path. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Contains parameters that specify output of errors thrown during conversion. |

### saveImageAsEps(BufferedImage image, String epsFilePath, PsSaveOptions options) {#saveImageAsEps-java.awt.image.BufferedImage-java.lang.String-com.aspose.eps.device.PsSaveOptions-}
```
public static void saveImageAsEps(BufferedImage image, String epsFilePath, PsSaveOptions options)
```


Saves BufferedImage object to EPS file.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| image | java.awt.image.BufferedImage | The Image. |
| epsFilePath | java.lang.String | EPS file path. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Contains parameters that specify output of errors thrown during conversion. |

### saveImageAsEps(BufferedImage image, OutputStream epsStream, PsSaveOptions options) {#saveImageAsEps-java.awt.image.BufferedImage-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-}
```
public static void saveImageAsEps(BufferedImage image, OutputStream epsStream, PsSaveOptions options)
```


Saves BufferedImage object to EPS file.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| image | java.awt.image.BufferedImage | The Image. |
| epsStream | java.io.OutputStream | EPS output stream. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Contains parameters that specify output of errors thrown during conversion. |

### getNumberOfPages() {#getNumberOfPages--}
```
public int getNumberOfPages()
```


Gets a quantity of pages in resulting PDF document.

**Returns:**
int - the number of pages.
### merge(String[] filesForMerge, Device device, SaveOptions options) {#merge-java.lang.String---com.aspose.page.Device-com.aspose.page.SaveOptions-}
```
public void merge(String[] filesForMerge, Device device, SaveOptions options)
```


Merges PS/EPS files to a device.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| filesForMerge | java.lang.String[] | PS/EPS files for merging with this file to an output device. |
| device | [Device](../../com.aspose.page/device) | An output device. |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | Contains flags that specify output of errors thrown during conversion. |

