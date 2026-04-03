---
title: RecognizeCharacters
second_title: Aspose.OCR 适用于 .NET API 参考
description: 检测图像上的符号。支持 GIF PNG JPEG BMP TIFF JFIF 流、文件夹、数组、存档。
type: docs
weight: 150
url: /zh/net/aspose.ocr/asposeocr/recognizecharacters/
---
## RecognizeCharacters(OcrInput) {#recognizecharacters}

检测图像上的符号。支持 GIF、PNG、JPEG、BMP、TIFF、JFIF、流、文件夹、数组、压缩包。

```csharp
public List<CharacterRecognitionResult> RecognizeCharacters(OcrInput images)
```

| Parameter | Type | 描述 |
| --- | --- | --- |
| images | OcrInput | 包含源的容器[`OcrInput`](../../ocrinput)。 |

### 返回值

包含检测到的符号数据的 [`CharacterRecognitionResult`](../../characterrecognitionresult) 列表。

### 另请参见

* class [CharacterRecognitionResult](../../characterrecognitionresult)
* class [OcrInput](../../ocrinput)
* class [AsposeOcr](../../asposeocr)
* namespace [Aspose.OCR](../../asposeocr)
* assembly [Aspose.OCR](../../../)

---

## RecognizeCharacters(OcrInput, DetectAreasMode, Language) {#recognizecharacters_1}

检测图像上的符号。支持 GIF、PNG、JPEG、BMP、TIFF、JFIF、流、文件夹、数组、压缩包。

```csharp
public List<CharacterRecognitionResult> RecognizeCharacters(OcrInput images, 
    DetectAreasMode detectAreasMode = DetectAreasMode.UNIVERSAL, Language language = Language.Latin)
```

| Parameter | Type | 描述 |
| --- | --- | --- |
| images | OcrInput | 包含源的容器[`OcrInput`](../../ocrinput)。 |
| detectAreasMode | DetectAreasMode | 确定用于区域检测的神经网络类型。 |
| language | 语言 | 用于 OCR 的语言。 |

### 返回值

包含检测到的符号数据的 [`Character`](../../character) 列表。

### 另请参见

* class [CharacterRecognitionResult](../../characterrecognitionresult)
* class [OcrInput](../../ocrinput)
* enum [DetectAreasMode](../../detectareasmode)
* enum [Language](../../language)
* class [AsposeOcr](../../asposeocr)
* namespace [Aspose.OCR](../../asposeocr)
* assembly [Aspose.OCR](../../../)

<!-- 请勿编辑：由 xmldocmd 为 Aspose.OCR.dll 生成 -->
