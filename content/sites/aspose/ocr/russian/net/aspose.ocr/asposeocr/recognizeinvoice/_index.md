---
title: AsposeOcr.RecognizeInvoice
second_title: Справочник по Aspose.OCR для .NET API
description: AsposeOcr метод. Распознает текст на изображении счетафактуры.
type: docs
weight: 180
url: /ru/net/aspose.ocr/asposeocr/recognizeinvoice/
---
## RecognizeInvoice(string, InvoiceRecognitionSettings) {#recognizeinvoice_1}

Распознает текст на изображении счета-фактуры.

```csharp
public RecognitionResult RecognizeInvoice(string fullPath, 
    InvoiceRecognitionSettings settings = null)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| fullPath | String | Путь к изображению. |
| settings | InvoiceRecognitionSettings | Настройки распознавания[`InvoiceRecognitionSettings`](../../invoicerecognitionsettings/). |

### Возвращаемое значение

[`RecognitionResult`](../../recognitionresult/) объект с результатами распознавания изображений.

### Примечания

Распознает изображение с возможностью указать[`InvoiceRecognitionSettings`](../../invoicerecognitionsettings/) . Поддерживает GIF, PNG, JPEG, BMP, TIFF, JFIF.

### Смотрите также

* class [RecognitionResult](../../recognitionresult/)
* class [InvoiceRecognitionSettings](../../invoicerecognitionsettings/)
* class [AsposeOcr](../)
* пространство имен [Aspose.OCR](../../asposeocr/)
* сборка [Aspose.OCR](../../../)

---

## RecognizeInvoice(MemoryStream, InvoiceRecognitionSettings) {#recognizeinvoice}

Распознает текст на изображении счета-фактуры.

```csharp
public RecognitionResult RecognizeInvoice(MemoryStream stream, 
    InvoiceRecognitionSettings settings = null)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| stream | MemoryStream | Поток памяти, содержащий изображение чека. |
| settings | InvoiceRecognitionSettings | Настройки распознавания[`InvoiceRecognitionSettings`](../../invoicerecognitionsettings/). |

### Возвращаемое значение

[`RecognitionResult`](../../recognitionresult/) объект с результатами распознавания изображений.

### Примечания

Распознает изображение с возможностью указать[`InvoiceRecognitionSettings`](../../invoicerecognitionsettings/) . Поддерживает GIF, PNG, JPEG, BMP, TIFF, JFIF.

### Смотрите также

* class [RecognitionResult](../../recognitionresult/)
* class [InvoiceRecognitionSettings](../../invoicerecognitionsettings/)
* class [AsposeOcr](../)
* пространство имен [Aspose.OCR](../../asposeocr/)
* сборка [Aspose.OCR](../../../)


