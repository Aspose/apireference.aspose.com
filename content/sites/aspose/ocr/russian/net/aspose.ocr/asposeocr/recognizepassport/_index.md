---
title: AsposeOcr.RecognizePassport
second_title: Справочник по Aspose.OCR для .NET API
description: AsposeOcr метод. Распознает текст в паспортах.
type: docs
weight: 210
url: /ru/net/aspose.ocr/asposeocr/recognizepassport/
---
## RecognizePassport(string, PassportRecognitionSettings) {#recognizepassport_1}

Распознает текст в паспортах.

```csharp
public RecognitionResult RecognizePassport(string fullPath, 
    PassportRecognitionSettings settings = null)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| fullPath | String | Путь к изображению. |
| settings | PassportRecognitionSettings | Настройки распознавания[`PassportRecognitionSettings`](../../passportrecognitionsettings/). |

### Возвращаемое значение

[`RecognitionResult`](../../recognitionresult/) объект с результатами распознавания изображений.

### Примечания

Распознает изображение с возможностью указать[`PassportRecognitionSettings`](../../passportrecognitionsettings/) . Поддерживает GIF, PNG, JPEG, BMP, TIFF, JFIF.

### Смотрите также

* class [RecognitionResult](../../recognitionresult/)
* class [PassportRecognitionSettings](../../passportrecognitionsettings/)
* class [AsposeOcr](../)
* пространство имен [Aspose.OCR](../../asposeocr/)
* сборка [Aspose.OCR](../../../)

---

## RecognizePassport(MemoryStream, PassportRecognitionSettings) {#recognizepassport}

Распознает текст в паспортах.

```csharp
public RecognitionResult RecognizePassport(MemoryStream stream, 
    PassportRecognitionSettings settings = null)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| stream | MemoryStream | Поток памяти, содержащий изображение чека. |
| settings | PassportRecognitionSettings | Настройки распознавания[`PassportRecognitionSettings`](../../passportrecognitionsettings/). |

### Возвращаемое значение

[`RecognitionResult`](../../recognitionresult/) объект с результатами распознавания изображений.

### Примечания

Распознает изображение с возможностью указать[`PassportRecognitionSettings`](../../passportrecognitionsettings/) . Поддерживает GIF, PNG, JPEG, BMP, TIFF, JFIF.

### Смотрите также

* class [RecognitionResult](../../recognitionresult/)
* class [PassportRecognitionSettings](../../passportrecognitionsettings/)
* class [AsposeOcr](../)
* пространство имен [Aspose.OCR](../../asposeocr/)
* сборка [Aspose.OCR](../../../)


