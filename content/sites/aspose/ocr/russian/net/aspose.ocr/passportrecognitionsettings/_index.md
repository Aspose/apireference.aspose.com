---
title: Class PassportRecognitionSettings
second_title: Справочник по Aspose.OCR для .NET API
description: Aspose.OCR.PassportRecognitionSettings сорт. Настройки распознавания паспорта. Содержит элементы позволяющие настроить процесс распознавания.
type: docs
weight: 190
url: /ru/net/aspose.ocr/passportrecognitionsettings/
---
## PassportRecognitionSettings class

Настройки распознавания паспорта. Содержит элементы, позволяющие настроить процесс распознавания.

```csharp
public class PassportRecognitionSettings : ReceiptRecognitionSettings
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [PassportRecognitionSettings](passportrecognitionsettings/)(Language) | Инициализирует новый экземпляр`PassportRecognitionSettings`класс с полным набором свойств. |

## Характеристики

| Имя | Описание |
| --- | --- |
| [AllowedCharacters](../../aspose.ocr/receiptrecognitionsettings/allowedcharacters/) { get; set; } | Установлены допустимые символы. Определяет тип символов, разрешенных для результата распознавания. |
| [AutoSkew](../../aspose.ocr/receiptrecognitionsettings/autoskew/) { set; } | Получает или задает флаг, указывающий, следует ли включить автоматическую коррекцию перекоса изображения. Включено (true) по умолчанию. |
| [IgnoredCharacters](../../aspose.ocr/receiptrecognitionsettings/ignoredcharacters/) { get; set; } | Устанавливает черный список для символов распознавания. |
| [Language](../../aspose.ocr/receiptrecognitionsettings/language/) { set; } | Получает или задает язык, используемый для OCR.  Определяет алфавит, используемый при распознавании. Многоязычный по умолчанию. |
| [PreprocessingFilters](../../aspose.ocr/receiptrecognitionsettings/preprocessingfilters/) { get; set; } | Позволяет подготовить изображение к распознаванию путем настройки методов предварительной обработки. |
| [ThreadsCount](../../aspose.ocr/receiptrecognitionsettings/threadscount/) { set; } | Получает или задает количество потоков для обработки. По умолчанию 0 означает, что изображение будет обрабатываться количеством потоков, равным количеству ваших процессоров. ThreadsCount = 1 означает, что изображение будет обрабатываться в основном потоке. |

### Смотрите также

* class [ReceiptRecognitionSettings](../receiptrecognitionsettings/)
* пространство имен [Aspose.OCR](../../aspose.ocr/)
* сборка [Aspose.OCR](../../)


