---
title: AsposeOcr.RecognizePdf
second_title: Справочник по Aspose.OCR для .NET API
description: AsposeOcr метод. Распознать текст из отсканированного pdf извлечь изображения.  Распознает pdf файл с возможностью указатьDocumentRecognitionSettings . Поддерживает только отсканированные файлы PDF. Не поддерживает PDF с возможностью поиска.
type: docs
weight: 220
url: /ru/net/aspose.ocr/asposeocr/recognizepdf/
---
## RecognizePdf(string, DocumentRecognitionSettings) {#recognizepdf_1}

Распознать текст из отсканированного pdf (извлечь изображения).  Распознает pdf файл с возможностью указать[`DocumentRecognitionSettings`](../../documentrecognitionsettings/) . Поддерживает только отсканированные файлы PDF. Не поддерживает PDF с возможностью поиска.

```csharp
public List<RecognitionResult> RecognizePdf(string fullPath, DocumentRecognitionSettings settings)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| fullPath | String | Полный путь к образу. |
| settings | DocumentRecognitionSettings | Настройки распознавания. |

### Возвращаемое значение

[`RecognitionResult`](../../recognitionresult/) объект с результатами распознавания изображений.

### Смотрите также

* class [RecognitionResult](../../recognitionresult/)
* class [DocumentRecognitionSettings](../../documentrecognitionsettings/)
* class [AsposeOcr](../)
* пространство имен [Aspose.OCR](../../asposeocr/)
* сборка [Aspose.OCR](../../../)

---

## RecognizePdf(MemoryStream, DocumentRecognitionSettings) {#recognizepdf}

Распознать текст из отсканированного pdf (извлечь изображения).  Распознает pdf файл с возможностью указать[`RecognitionSettings`](../../recognitionsettings/) . Поддерживает только отсканированные файлы PDF. Не поддерживает PDF с возможностью поиска.

```csharp
public List<RecognitionResult> RecognizePdf(MemoryStream stream, 
    DocumentRecognitionSettings settings)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| stream | MemoryStream | Поток памяти с файлом pdf. |
| settings | DocumentRecognitionSettings | Настройки распознавания. |

### Возвращаемое значение

[`RecognitionResult`](../../recognitionresult/) объект с результатами распознавания изображений.

### Смотрите также

* class [RecognitionResult](../../recognitionresult/)
* class [DocumentRecognitionSettings](../../documentrecognitionsettings/)
* class [AsposeOcr](../)
* пространство имен [Aspose.OCR](../../asposeocr/)
* сборка [Aspose.OCR](../../../)


