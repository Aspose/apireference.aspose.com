---
title: AsposeOcr.RecognizeIDCard
second_title: Справочник по Aspose.OCR для .NET API
description: AsposeOcr метод. Распознает текст на удостоверении личности.
type: docs
weight: 130
url: /ru/net/aspose.ocr/asposeocr/recognizeidcard/
---
## RecognizeIDCard(string, IDCardRecognitionSettings) {#recognizeidcard_1}

Распознает текст на удостоверении личности.

```csharp
public RecognitionResult RecognizeIDCard(string fullPath, IDCardRecognitionSettings settings = null)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| fullPath | String | Путь к изображению. |
| settings | IDCardRecognitionSettings | Настройки распознавания[`IDCardRecognitionSettings`](../../idcardrecognitionsettings/). |

### Возвращаемое значение

[`RecognitionResult`](../../recognitionresult/) объект с результатами распознавания изображений.

### Примечания

Распознает изображение с возможностью указать[`IDCardRecognitionSettings`](../../idcardrecognitionsettings/) . Поддерживает GIF, PNG, JPEG, BMP, TIFF, JFIF.

### Смотрите также

* class [RecognitionResult](../../recognitionresult/)
* class [IDCardRecognitionSettings](../../idcardrecognitionsettings/)
* class [AsposeOcr](../)
* пространство имен [Aspose.OCR](../../asposeocr/)
* сборка [Aspose.OCR](../../../)

---

## RecognizeIDCard(MemoryStream, IDCardRecognitionSettings) {#recognizeidcard}

Распознает текст на удостоверении личности.

```csharp
public RecognitionResult RecognizeIDCard(MemoryStream stream, 
    IDCardRecognitionSettings settings = null)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| stream | MemoryStream | Поток памяти, содержащий изображение чека. |
| settings | IDCardRecognitionSettings | Настройки распознавания[`IDCardRecognitionSettings`](../../idcardrecognitionsettings/). |

### Возвращаемое значение

[`RecognitionResult`](../../recognitionresult/) объект с результатами распознавания изображений.

### Примечания

Распознает изображение с возможностью указать[`IDCardRecognitionSettings`](../../idcardrecognitionsettings/) . Поддерживает GIF, PNG, JPEG, BMP, TIFF, JFIF.

### Смотрите также

* class [RecognitionResult](../../recognitionresult/)
* class [IDCardRecognitionSettings](../../idcardrecognitionsettings/)
* class [AsposeOcr](../)
* пространство имен [Aspose.OCR](../../asposeocr/)
* сборка [Aspose.OCR](../../../)


