---
title: RecognizeImage
second_title: Aspose.OCR for .NET API Reference
description: 
type: docs
weight: 80
url: /net/aspose.ocr/asposeocr/recognizeimage/
---
## AsposeOcr.RecognizeImage method (1 of 8)

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

## AsposeOcr.RecognizeImage method (2 of 8)

Recognizes text on image.

```csharp
public string RecognizeImage(string fullPath, bool detectAreas, bool autoSkew = true)
```

| Parameter | Type | Description |
| --- | --- | --- |
| fullPath | String | Path to the image. |
| detectAreas | Boolean | Enable automatic text areas detection. If false, image is processed as single text block. |
| autoSkew | Boolean | Enable automatic image skew correction. Enabled by default. |

### Return Value

Recognized text.

### Remarks

Recognizes image with ability to disable automatic text areas detection and image skew correction. Supports GIF, PNG, JPEG, BMP, TIFF.

### See Also

* class [AsposeOcr](../../asposeocr)
* namespace [Aspose.OCR](../../asposeocr)
* assembly [Aspose.OCR](../../../)

---

## AsposeOcr.RecognizeImage method (3 of 8)

Recognizes text on image.

```csharp
public List<string> RecognizeImage(string fullPath, List<Rectangle> textAreas)
```

| Parameter | Type | Description |
| --- | --- | --- |
| fullPath | String | Path to the image. |
| textAreas | List`1 | List of areas to recognize. |

### Return Value

List of recognized text strings (one string for each specified text area).

### Remarks

Recognizes image with ability to specify text areas. Supports GIF, PNG, JPEG, BMP, TIFF. Automatic image skew correction is not applied.

### See Also

* class [AsposeOcr](../../asposeocr)
* namespace [Aspose.OCR](../../asposeocr)
* assembly [Aspose.OCR](../../../)

---

## AsposeOcr.RecognizeImage method (4 of 8)

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

## AsposeOcr.RecognizeImage method (5 of 8)

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

## AsposeOcr.RecognizeImage method (6 of 8)

Recognizes text on image.

```csharp
public string RecognizeImage(MemoryStream stream, bool detectAreas, bool autoSkew = true)
```

| Parameter | Type | Description |
| --- | --- | --- |
| stream | MemoryStream | Memory stream containing the image. |
| detectAreas | Boolean | Enable automatic text areas detection. If false, image is processed as single text block. |
| autoSkew | Boolean | Enable automatic image skew correction. Enabled by default. |

### Return Value

Recognized text.

### Remarks

Recognizes image with ability to disable automatic text areas detection and image skew correction. Supports GIF, PNG, JPEG, BMP, TIFF.

### See Also

* class [AsposeOcr](../../asposeocr)
* namespace [Aspose.OCR](../../asposeocr)
* assembly [Aspose.OCR](../../../)

---

## AsposeOcr.RecognizeImage method (7 of 8)

Recognizes text on image.

```csharp
public List<string> RecognizeImage(MemoryStream stream, List<Rectangle> textAreas)
```

| Parameter | Type | Description |
| --- | --- | --- |
| stream | MemoryStream | Memory stream containing the image. |
| textAreas | List`1 | List of areas to recognize. |

### Return Value

List of recognized text strings (one string for each specified text area).

### Remarks

Recognizes image with ability to specify text areas. Supports GIF, PNG, JPEG, BMP, TIFF. Automatic image skew correction is not applied.

### See Also

* class [AsposeOcr](../../asposeocr)
* namespace [Aspose.OCR](../../asposeocr)
* assembly [Aspose.OCR](../../../)

---

## AsposeOcr.RecognizeImage method (8 of 8)

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

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.OCR.dll -->
