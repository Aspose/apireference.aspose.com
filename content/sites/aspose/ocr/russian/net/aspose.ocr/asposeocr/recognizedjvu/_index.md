---
title: AsposeOcr.RecognizeDjvu
second_title: Справочник по Aspose.OCR для .NET API
description: AsposeOcr метод. Распознавание текста из многостраничного изображения DJVU.  Распознает файл DJVU с возможностью указатьDocumentRecognitionSettings . Поддерживает только DJVU. Не поддерживает другие типы изображений.
type: docs
weight: 120
url: /ru/net/aspose.ocr/asposeocr/recognizedjvu/
---
## RecognizeDjvu(string, DocumentRecognitionSettings) {#recognizedjvu_1}

Распознавание текста из многостраничного изображения DJVU.  Распознает файл DJVU с возможностью указать[`DocumentRecognitionSettings`](../../documentrecognitionsettings/) . Поддерживает только DJVU. Не поддерживает другие типы изображений.

```csharp
public List<RecognitionResult> RecognizeDjvu(string fullPath, DocumentRecognitionSettings settings)
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

## RecognizeDjvu(MemoryStream, DocumentRecognitionSettings) {#recognizedjvu}

Распознавание текста из многостраничного изображения DJVU.  Распознает файл DJVU с возможностью указать[`DocumentRecognitionSettings`](../../documentrecognitionsettings/) . Поддерживает только DJVU. Не поддерживает другие типы изображений.

```csharp
public List<RecognitionResult> RecognizeDjvu(MemoryStream stream, 
    DocumentRecognitionSettings settings)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| stream | MemoryStream | Поток памяти с файлом DJVU. |
| settings | DocumentRecognitionSettings | Настройки распознавания. |

### Возвращаемое значение

[`RecognitionResult`](../../recognitionresult/) список объектов с результатами распознавания изображений.

### Смотрите также

* class [RecognitionResult](../../recognitionresult/)
* class [DocumentRecognitionSettings](../../documentrecognitionsettings/)
* class [AsposeOcr](../)
* пространство имен [Aspose.OCR](../../asposeocr/)
* сборка [Aspose.OCR](../../../)


