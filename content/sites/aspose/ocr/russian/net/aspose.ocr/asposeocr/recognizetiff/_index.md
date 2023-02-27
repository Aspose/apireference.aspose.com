---
title: AsposeOcr.RecognizeTiff
second_title: Справочник по Aspose.OCR для .NET API
description: AsposeOcr метод. Распознавание текста из многостраничного изображения TIFF.  Распознает файл TIFF с возможностью указатьDocumentRecognitionSettings . Поддерживает только формат TIFF TIF. Не поддерживает другие типы изображений.
type: docs
weight: 240
url: /ru/net/aspose.ocr/asposeocr/recognizetiff/
---
## RecognizeTiff(string, DocumentRecognitionSettings) {#recognizetiff_1}

Распознавание текста из многостраничного изображения TIFF.  Распознает файл TIFF с возможностью указать[`DocumentRecognitionSettings`](../../documentrecognitionsettings/) . Поддерживает только формат TIFF (TIF). Не поддерживает другие типы изображений.

```csharp
public List<RecognitionResult> RecognizeTiff(string fullPath, DocumentRecognitionSettings settings)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| fullPath | String | Полный путь к образу. |
| settings | DocumentRecognitionSettings | Настройки распознавания. |

### Возвращаемое значение

[`RecognitionResult`](../../recognitionresult/) список объектов с результатами распознавания изображений.

### Смотрите также

* class [RecognitionResult](../../recognitionresult/)
* class [DocumentRecognitionSettings](../../documentrecognitionsettings/)
* class [AsposeOcr](../)
* пространство имен [Aspose.OCR](../../asposeocr/)
* сборка [Aspose.OCR](../../../)

---

## RecognizeTiff(MemoryStream, DocumentRecognitionSettings) {#recognizetiff}

Распознавание текста из многостраничного изображения TIFF.  Распознает файл TIFF с возможностью указать[`DocumentRecognitionSettings`](../../documentrecognitionsettings/) . Поддерживает только формат TIFF (TIF). Не поддерживает другие типы изображений.

```csharp
public List<RecognitionResult> RecognizeTiff(MemoryStream stream, 
    DocumentRecognitionSettings settings)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| stream | MemoryStream | Поток памяти с файлом TIFF. |
| settings | DocumentRecognitionSettings | Настройки распознавания. |

### Возвращаемое значение

[`RecognitionResult`](../../recognitionresult/) список объектов с результатами распознавания изображений.

### Смотрите также

* class [RecognitionResult](../../recognitionresult/)
* class [DocumentRecognitionSettings](../../documentrecognitionsettings/)
* class [AsposeOcr](../)
* пространство имен [Aspose.OCR](../../asposeocr/)
* сборка [Aspose.OCR](../../../)


