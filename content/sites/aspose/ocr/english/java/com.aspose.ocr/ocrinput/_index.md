---
title: OcrInput
second_title: Aspose.OCR for Java API Reference
description: Main class for recognize text from images.
type: docs
weight: 20
url: /java/com.aspose.ocr/ocrinput/
---

**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
java.lang.Iterable
```
public class OcrInput implements Iterable<ImageData>
```

Main class for recognize text from images.
## Constructors

| Constructor | Description |
| --- | --- |
| [OcrInput(InputType type, PreprocessingFilter filters)](#OcrInput-com.aspose.ocr.InputType-com.aspose.ocr.PreprocessingFilter-) | Constructor to create container and set the type of images / documents and filters for further processing / recognition. |
| [OcrInput(InputType type)](#OcrInput-com.aspose.ocr.InputType-) |  |
## Methods

| Method | Description |
| --- | --- |
| [replaceFilters(PreprocessingFilter filters)](#replaceFilters-com.aspose.ocr.PreprocessingFilter-) | Remove old filters and set new. |
| [clearFilters()](#clearFilters--) | Remove all filters. |
| [add(String fullPath)](#add-java.lang.String-) | Add the path or URI containing the image for recognition / processing. |
| [add(BufferedImage image)](#add-java.awt.image.BufferedImage-) | Add the BufferedImage containing the image for recognition / processing. |
| [add(String fullPath, int startPage, int pagesCount)](#add-java.lang.String-int-int-) | Add the multipage images / documents for recognition / processing. |
| [add(BufferedImage image, int startPage, int pagesCount)](#add-java.awt.image.BufferedImage-int-int-) | Add the BufferedImage containing the multipage image for recognition / processing. |
| [add(int[] pixels, int width, int height, int bitsPerPixel)](#add-int---int-int-int-) | Add the decoded image to the list for recognition / processing. |
| [add(InputStream stream)](#add-java.io.InputStream-) | Add the InputStream containing the image for recognition / processing. |
| [add(InputStream stream, int startPage, int pagesCount)](#add-java.io.InputStream-int-int-) | Add the InputStream containing the multipage image for recognition / processing. |
| [addBase64(String base64)](#addBase64-java.lang.String-) | Add the memory stream containing the image for recognition / processing. |
| [clear()](#clear--) | Set the amount of items for processing / recognition as 0. |
| [size()](#size--) | Amount of items for processing / recognition. |
| [get(int index)](#get-int-) | Returns information about processed / recognized image. |
| [iterator()](#iterator--) |  |
### OcrInput(InputType type, PreprocessingFilter filters) {#OcrInput-com.aspose.ocr.InputType-com.aspose.ocr.PreprocessingFilter-}
```
public OcrInput(InputType type, PreprocessingFilter filters)
```


Constructor to create container and set the type of images / documents and filters for further processing / recognition.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| type | [InputType](../../com.aspose.ocr/inputtype) | Set the images/documents type will be added to container. |
| filters | [PreprocessingFilter](../../com.aspose.ocr/preprocessingfilter) | Set processing filters will be applied for further processing or recognition. |

### OcrInput(InputType type) {#OcrInput-com.aspose.ocr.InputType-}
```
public OcrInput(InputType type)
```


**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| type | [InputType](../../com.aspose.ocr/inputtype) |  |

### replaceFilters(PreprocessingFilter filters) {#replaceFilters-com.aspose.ocr.PreprocessingFilter-}
```
public void replaceFilters(PreprocessingFilter filters)
```


Remove old filters and set new.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| filters | [PreprocessingFilter](../../com.aspose.ocr/preprocessingfilter) | Processing filters will be applied for further processing or recognition. |

### clearFilters() {#clearFilters--}
```
public void clearFilters()
```


Remove all filters.

### add(String fullPath) {#add-java.lang.String-}
```
public void add(String fullPath)
```


Add the path or URI containing the image for recognition / processing. The type of the image must correspond to the type specified in the constructor.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fullPath | java.lang.String | Path to the image/ document / folder / archive. |

### add(BufferedImage image) {#add-java.awt.image.BufferedImage-}
```
public void add(BufferedImage image)
```


Add the BufferedImage containing the image for recognition / processing. The type of the image must correspond to the type specified in the constructor.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| image | java.awt.image.BufferedImage | BufferedImage containing the image or document. |

### add(String fullPath, int startPage, int pagesCount) {#add-java.lang.String-int-int-}
```
public void add(String fullPath, int startPage, int pagesCount)
```


Add the multipage images / documents for recognition / processing. The type of the image must correspond to the type specified in the constructor.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fullPath | java.lang.String | Path to the image/ document / folder / archive. |
| startPage | int | The first page/image for processing / recognition. Use for documents, zip, folders. |
| pagesCount | int | The total amount of pages/images for processing / recognition. Use for documents, zip, folders. Default = 1. |

### add(BufferedImage image, int startPage, int pagesCount) {#add-java.awt.image.BufferedImage-int-int-}
```
public void add(BufferedImage image, int startPage, int pagesCount)
```


Add the BufferedImage containing the multipage image for recognition / processing. The type of the image must correspond to the type specified in the constructor.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| image | java.awt.image.BufferedImage | BufferedImage containing the multipage document. |
| startPage | int | The first page/image for processing / recognition. Use for documents. |
| pagesCount | int | The total amount of pages/images for processing / recognition. Use for documents. Default = 1. |

### add(int[] pixels, int width, int height, int bitsPerPixel) {#add-int---int-int-int-}
```
public void add(int[] pixels, int width, int height, int bitsPerPixel)
```


Add the decoded image to the list for recognition / processing. The type of the image must correspond to the type specified in the constructor (SingleImage).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| pixels | int[] | The pixels are represented as 32-bit integer values (rgb). |
| width | int | Image width. |
| height | int | Image height. |
| bitsPerPixel | int | Supports 1-32 bits. |

### add(InputStream stream) {#add-java.io.InputStream-}
```
public void add(InputStream stream)
```


Add the InputStream containing the image for recognition / processing. The type of the image must correspond to the type specified in the constructor.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| stream | java.io.InputStream | InputStream containing the image or document. |

### add(InputStream stream, int startPage, int pagesCount) {#add-java.io.InputStream-int-int-}
```
public void add(InputStream stream, int startPage, int pagesCount)
```


Add the InputStream containing the multipage image for recognition / processing. The type of the image must correspond to the type specified in the constructor.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| stream | java.io.InputStream | InputStream containing the multipage document. |
| startPage | int | The first page/image for processing / recognition. Use for documents. |
| pagesCount | int | The total amount of pages/images for processing / recognition. Use for documents. Default = 1. |

### addBase64(String base64) {#addBase64-java.lang.String-}
```
public void addBase64(String base64)
```


Add the memory stream containing the image for recognition / processing. The type of the image must correspond to the type specified in the constructor.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| base64 | java.lang.String | Base64 string with single image. |

### clear() {#clear--}
```
public void clear()
```


Set the amount of items for processing / recognition as 0. Clear the collection.

### size() {#size--}
```
public int size()
```


Amount of items for processing / recognition.

**Returns:**
int - Amount of items.
### get(int index) {#get-int-}
```
public ImageData get(int index)
```


Returns information about processed / recognized image.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| index | int | Position of the image in the List. |

**Returns:**
[ImageData](../../com.aspose.ocr/imagedata) - The object of @see [ImageData](../../com.aspose.ocr/imagedata)
### iterator() {#iterator--}
```
public Iterator<ImageData> iterator()
```




**Returns:**
java.util.Iterator<com.aspose.ocr.ImageData>
