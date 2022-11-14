---
title: RecognizeImage
second_title: Aspose.OCR for .NET API Reference
description: Recognizes text on image.
type: docs
weight: 80
url: /net/aspose.ocr/asposeocr/recognizeimage/
---
## RecognizeImage(string) {#recognizeimage_5}

Recognizes text on image.

```csharp
public string RecognizeImage(string fullPath)
```

| Parameter | Type | Description |
| --- | --- | --- |
| fullPath | String | Path to the image. |

### Return Value

Recognized text.

### Remarks

Uses automatic image skew correction and text areas detection. Supports GIF, PNG, JPEG, BMP, TIFF.

### See Also

* class [AsposeOcr](../../asposeocr)
* namespace [Aspose.OCR](../../asposeocr)
* assembly [Aspose.OCR](../../../)

---

## RecognizeImage(string, RecognitionSettings) {#recognizeimage_3}

Recognizes text on image.

```csharp
public RecognitionResult RecognizeImage(string fullPath, RecognitionSettings settings)
```

| Parameter | Type | Description |
| --- | --- | --- |
| fullPath | String | Path to the image. |
| settings | RecognitionSettings | Recognition settings. |

### Return Value

The [`RecognitionResult`](../../recognitionresult) object with image recognition results.

### Remarks

Recognizes image with the ability to specify [`RecognitionSettings`](../../recognitionsettings). Supports GIF, PNG, JPEG, BMP, TIFF.

### See Also

* class [RecognitionResult](../../recognitionresult)
* class [RecognitionSettings](../../recognitionsettings)
* class [AsposeOcr](../../asposeocr)
* namespace [Aspose.OCR](../../asposeocr)
* assembly [Aspose.OCR](../../../)

---

## RecognizeImage(MemoryStream) {#recognizeimage_4}

Recognizes text on image.

```csharp
public string RecognizeImage(MemoryStream stream)
```

| Parameter | Type | Description |
| --- | --- | --- |
| stream | MemoryStream | Memory stream containing the image. |

### Return Value

Recognized text.

### Remarks

Uses automatic image skew correction and text areas detection. Support GIF, PNG, JPEG, BMP, TIFF.

### See Also

* class [AsposeOcr](../../asposeocr)
* namespace [Aspose.OCR](../../asposeocr)
* assembly [Aspose.OCR](../../../)

---

## RecognizeImage(MemoryStream, RecognitionSettings) {#recognizeimage_2}

Recognizes text on image.  Recognizes image with the ability to specify [`RecognitionSettings`](../../recognitionsettings). Supports GIF, PNG, JPEG, BMP, TIFF.

```csharp
public RecognitionResult RecognizeImage(MemoryStream stream, RecognitionSettings settings)
```

| Parameter | Type | Description |
| --- | --- | --- |
| stream | MemoryStream | Memory stream containing the image. |
| settings | RecognitionSettings | Recognition settings. |

### Return Value

The [`RecognitionResult`](../../recognitionresult) object with image recognition results.

### See Also

* class [RecognitionResult](../../recognitionresult)
* class [RecognitionSettings](../../recognitionsettings)
* class [AsposeOcr](../../asposeocr)
* namespace [Aspose.OCR](../../asposeocr)
* assembly [Aspose.OCR](../../../)

---

## RecognizeImage(byte[], int, int, PixelType, RecognitionSettings) {#recognizeimage_1}

Recognizes text on image.

```csharp
public RecognitionResult RecognizeImage(byte[] imageData, int width, int height, 
    PixelType pixelFormat, RecognitionSettings settings = null)
```

| Parameter | Type | Description |
| --- | --- | --- |
| imageData | Byte[] | Decoded image in bytes array. Uses RGB lighting technology for bitsPerPixel &gt; 1. |
| width | Int32 | Image width. |
| height | Int32 | Image height. |
| pixelFormat | PixelType | Supports byte, rgb, bgr, rgba. |
| settings | RecognitionSettings | Recognition settings. |

### Return Value

The [`RecognitionResult`](../../recognitionresult) object with image recognition results.

### Remarks

Recognizes image with the ability to specify [`RecognitionSettings`](../../recognitionsettings). Supports row decoded byte data.

### See Also

* class [RecognitionResult](../../recognitionresult)
* enum [PixelType](../../pixeltype)
* class [RecognitionSettings](../../recognitionsettings)
* class [AsposeOcr](../../asposeocr)
* namespace [Aspose.OCR](../../asposeocr)
* assembly [Aspose.OCR](../../../)

---

## RecognizeImage(Color[], int, int, RecognitionSettings) {#recognizeimage}

Recognizes text on image.

```csharp
public RecognitionResult RecognizeImage(Color[] imageData, int width, int height, 
    RecognitionSettings settings = null)
```

| Parameter | Type | Description |
| --- | --- | --- |
| imageData | Color[] | Decoded image in Aspose.Drawing.Color array. |
| width | Int32 | Image width. |
| height | Int32 | Image height. |
| settings | RecognitionSettings | Recognition settings. |

### Return Value

The [`RecognitionResult`](../../recognitionresult) object with image recognition results.

### Remarks

Recognizes image with the ability to specify [`RecognitionSettings`](../../recognitionsettings). Supports row decoded byte data.

### See Also

* class [RecognitionResult](../../recognitionresult)
* class [RecognitionSettings](../../recognitionsettings)
* class [AsposeOcr](../../asposeocr)
* namespace [Aspose.OCR](../../asposeocr)
* assembly [Aspose.OCR](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.OCR.dll -->
