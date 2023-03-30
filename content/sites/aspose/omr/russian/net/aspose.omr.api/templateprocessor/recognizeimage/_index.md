---
title: TemplateProcessor.RecognizeImage
second_title: Справочник по Aspose.OMR для .NET API
description: TemplateProcessor метод. Распознает изображение
type: docs
weight: 30
url: /ru/net/aspose.omr.api/templateprocessor/recognizeimage/
---
## RecognizeImage(string, int) {#recognizeimage_1}

Распознает изображение

```csharp
public RecognitionResult RecognizeImage(string imagePath, int recognitionThreshold = -100)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| imagePath | String | Путь к изображению для распознавания |
| recognitionThreshold | Int32 | (Необязательно) Порог распознавания в диапазоне (0..100). Только элементы, заполненные выше порога, будут считаться заполненными. |

### Возвращаемое значение

Результат распознавания

### Смотрите также

* class [RecognitionResult](../../../aspose.omr.model/recognitionresult/)
* class [TemplateProcessor](../)
* пространство имен [Aspose.OMR.Api](../../templateprocessor/)
* сборка [Aspose.OMR](../../../)

---

## RecognizeImage(MemoryStream, int) {#recognizeimage}

Распознавание изображения из памяти stream

```csharp
public RecognitionResult RecognizeImage(MemoryStream stream, int recognitionThreshold = -100)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| stream | MemoryStream | Поток памяти изображения. |
| recognitionThreshold | Int32 | (Необязательно) Порог распознавания в диапазоне (0..100). Только элементы, заполненные выше порога, будут считаться заполненными. |

### Возвращаемое значение

Результат распознавания

### Смотрите также

* class [RecognitionResult](../../../aspose.omr.model/recognitionresult/)
* class [TemplateProcessor](../)
* пространство имен [Aspose.OMR.Api](../../templateprocessor/)
* сборка [Aspose.OMR](../../../)


