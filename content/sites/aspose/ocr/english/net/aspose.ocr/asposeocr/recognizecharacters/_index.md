---
title: RecognizeCharacters
second_title: Aspose.OCR for .NET API Reference
description: Detects symbols on images. Supports GIF PNG JPEG BMP TIFF JFIF stream folder arrays archives.
type: docs
weight: 140
url: /net/aspose.ocr/asposeocr/recognizecharacters/
---
## RecognizeCharacters(OcrInput) {#recognizecharacters}

Detects symbols on images. Supports GIF, PNG, JPEG, BMP, TIFF, JFIF, stream, folder, arrays, archives.

```csharp
public List<CharacterRecognitionResult> RecognizeCharacters(OcrInput images)
```

| Parameter | Type | Description |
| --- | --- | --- |
| images | OcrInput | The container with sources.[`OcrInput`](../../ocrinput) |

### Return Value

List of [`CharacterRecognitionResult`](../../characterrecognitionresult) with detected symbols data.

### See Also

* class [CharacterRecognitionResult](../../characterrecognitionresult)
* class [OcrInput](../../ocrinput)
* class [AsposeOcr](../../asposeocr)
* namespace [Aspose.OCR](../../asposeocr)
* assembly [Aspose.OCR](../../../)

---

## RecognizeCharacters(OcrInput, DetectAreasMode, Language) {#recognizecharacters_1}

Detects symbols on images. Supports GIF, PNG, JPEG, BMP, TIFF, JFIF, stream, folder, arrays, archives.

```csharp
public List<CharacterRecognitionResult> RecognizeCharacters(OcrInput images, 
    DetectAreasMode detectAreasMode = DetectAreasMode.UNIVERSAL, Language language = Language.Latin)
```

| Parameter | Type | Description |
| --- | --- | --- |
| images | OcrInput | The container with sources.[`OcrInput`](../../ocrinput) |
| detectAreasMode | DetectAreasMode | Determines the type of neural network used for areas detection. |
| language | Language | Language used for OCR.. |

### Return Value

List of [`Character`](../../character) with detected symbols data.

### See Also

* class [CharacterRecognitionResult](../../characterrecognitionresult)
* class [OcrInput](../../ocrinput)
* enum [DetectAreasMode](../../detectareasmode)
* enum [Language](../../language)
* class [AsposeOcr](../../asposeocr)
* namespace [Aspose.OCR](../../asposeocr)
* assembly [Aspose.OCR](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.OCR.dll -->
