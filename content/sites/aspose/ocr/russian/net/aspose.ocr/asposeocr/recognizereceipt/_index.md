---
title: AsposeOcr.RecognizeReceipt
second_title: Справочник по Aspose.OCR для .NET API
description: AsposeOcr метод. Распознает текст на изображении.
type: docs
weight: 230
url: /ru/net/aspose.ocr/asposeocr/recognizereceipt/
---
## RecognizeReceipt(string, ReceiptRecognitionSettings) {#recognizereceipt_1}

Распознает текст на изображении.

```csharp
public RecognitionResult RecognizeReceipt(string fullPath, 
    ReceiptRecognitionSettings settings = null)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| fullPath | String | Путь к изображению. |
| settings | ReceiptRecognitionSettings | Настройки распознавания[`ReceiptRecognitionSettings`](../../receiptrecognitionsettings/). |

### Возвращаемое значение

[`RecognitionResult`](../../recognitionresult/) объект с результатами распознавания изображений.

### Примечания

Распознает изображение с возможностью указать[`ReceiptRecognitionSettings`](../../receiptrecognitionsettings/) . Поддерживает GIF, PNG, JPEG, BMP, TIFF, JFIF.

### Смотрите также

* class [RecognitionResult](../../recognitionresult/)
* class [ReceiptRecognitionSettings](../../receiptrecognitionsettings/)
* class [AsposeOcr](../)
* пространство имен [Aspose.OCR](../../asposeocr/)
* сборка [Aspose.OCR](../../../)

---

## RecognizeReceipt(MemoryStream, ReceiptRecognitionSettings) {#recognizereceipt}

Распознает текст на изображении.

```csharp
public RecognitionResult RecognizeReceipt(MemoryStream stream, 
    ReceiptRecognitionSettings settings = null)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| stream | MemoryStream | Поток памяти, содержащий изображение чека. |
| settings | ReceiptRecognitionSettings | Настройки распознавания[`ReceiptRecognitionSettings`](../../receiptrecognitionsettings/). |

### Возвращаемое значение

[`RecognitionResult`](../../recognitionresult/) объект с результатами распознавания изображений.

### Примечания

Распознает изображение с возможностью указать[`ReceiptRecognitionSettings`](../../receiptrecognitionsettings/) . Поддерживает GIF, PNG, JPEG, BMP, TIFF, JFIF.

### Смотрите также

* class [RecognitionResult](../../recognitionresult/)
* class [ReceiptRecognitionSettings](../../receiptrecognitionsettings/)
* class [AsposeOcr](../)
* пространство имен [Aspose.OCR](../../asposeocr/)
* сборка [Aspose.OCR](../../../)


