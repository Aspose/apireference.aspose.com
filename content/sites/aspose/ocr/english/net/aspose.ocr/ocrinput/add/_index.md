---
title: Add
second_title: Aspose.OCR for .NET API Reference
description: Add the path or URI containing the image for recognition / processing. The type of the image must correspond to the type specified in the constructor.
type: docs
weight: 30
url: /net/aspose.ocr/ocrinput/add/
---
## Add(string) {#add_3}

Add the path or URI containing the image for recognition / processing. The type of the image must correspond to the type specified in the constructor.

```csharp
public void Add(string fullPath)
```

| Parameter | Type | Description |
| --- | --- | --- |
| fullPath | String | Path to the image/ document / folder / archive. |

### See Also

* class [OcrInput](../../ocrinput)
* namespace [Aspose.OCR](../../ocrinput)
* assembly [Aspose.OCR](../../../)

---

## Add(Stream) {#add_1}

Add the memory stream containing the image for recognition / processing. The type of the image must correspond to the type specified in the constructor.

```csharp
public void Add(Stream stream)
```

| Parameter | Type | Description |
| --- | --- | --- |
| stream | Stream | Memory stream containing the image or document. |

### See Also

* class [OcrInput](../../ocrinput)
* namespace [Aspose.OCR](../../ocrinput)
* assembly [Aspose.OCR](../../../)

---

## Add(string, int, int) {#add_4}

Add the multipage images / documents for recognition / processing. The type of the image must correspond to the type specified in the constructor.

```csharp
public void Add(string fullPath, int startPage, int pagesCount)
```

| Parameter | Type | Description |
| --- | --- | --- |
| fullPath | String | Path to the image/ document / folder / archive. |
| startPage | Int32 | The first page/image for processing / recognition. Use for documents, zip, folders. |
| pagesCount | Int32 | The total amount of pages/images for processing / recognition. Use for documents, zip, folders. Default = 1. |

### See Also

* class [OcrInput](../../ocrinput)
* namespace [Aspose.OCR](../../ocrinput)
* assembly [Aspose.OCR](../../../)

---

## Add(Stream, int, int) {#add_2}

Add the memory stream containing the multipage image for recognition / processing. The type of the image must correspond to the type specified in the constructor.

```csharp
public void Add(Stream stream, int startPage, int pagesCount)
```

| Parameter | Type | Description |
| --- | --- | --- |
| stream | Stream | Memory stream containing the multipage document. |
| startPage | Int32 | The first page/image for processing / recognition. Use for documents. |
| pagesCount | Int32 | The total amount of pages/images for processing / recognition. Use for documents. Default = 1. |

### See Also

* class [OcrInput](../../ocrinput)
* namespace [Aspose.OCR](../../ocrinput)
* assembly [Aspose.OCR](../../../)

---

## Add(byte[], int, int, PixelType) {#add}

Add the decoded image to the list for recognition / processing. The type of the image must correspond to the type specified in the constructor (SingleImage).

```csharp
public void Add(byte[] arr, int width, int height, PixelType pixelFormat)
```

| Parameter | Type | Description |
| --- | --- | --- |
| arr | Byte[] | Decoded image in Aspose.Drawing.Color array. |
| width | Int32 | Image width. |
| height | Int32 | Image height. |
| pixelFormat | PixelType | Supports byte, rgb, bgr, rgba. |

### See Also

* enum [PixelType](../../pixeltype)
* class [OcrInput](../../ocrinput)
* namespace [Aspose.OCR](../../ocrinput)
* assembly [Aspose.OCR](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.OCR.dll -->
