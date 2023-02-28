---
title: DocumentRecognitionSettings.DocumentRecognitionSettings
second_title: Справочник по Aspose.OCR для .NET API
description: DocumentRecognitionSettings строитель. Инициализирует новый экземплярDocumentRecognitionSettings класс с коротким набором свойств.
type: docs
weight: 10
url: /ru/net/aspose.ocr/documentrecognitionsettings/documentrecognitionsettings/
---
## DocumentRecognitionSettings(int, int) {#constructor}

Инициализирует новый экземпляр[`DocumentRecognitionSettings`](../) класс с коротким набором свойств.

```csharp
public DocumentRecognitionSettings(int startPage = 0, int pagesNumber = 1)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| startPage | Int32 | Установите первую страницу для распознавания. 0 по умолчанию. |
| pagesNumber | Int32 | Установите количество страниц для распознавания многостраничного pdf файла. |

### Смотрите также

* class [DocumentRecognitionSettings](../)
* пространство имен [Aspose.OCR](../../documentrecognitionsettings/)
* сборка [Aspose.OCR](../../../)

---

## DocumentRecognitionSettings(int, int, Language, bool, bool, int) {#constructor_1}

Инициализирует новый экземпляр[`DocumentRecognitionSettings`](../)класс с полным набором свойств.

```csharp
public DocumentRecognitionSettings(int startPage, int pagesNumber, 
    Language language = Language.None, bool detectAreas = true, bool autoSkew = true, 
    int threshold = 0)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| startPage | Int32 | Установите первую страницу для распознавания. 0 по умолчанию. |
| pagesNumber | Int32 | Установите количество страниц для распознавания многостраничного pdf файла. |
| language | Language | Язык, используемый для OCR. |
| detectAreas | Boolean | Включить автоматическое обнаружение текстовых областей. |
| autoSkew | Boolean | Включите автоматическую коррекцию перекоса изображения. |
| threshold | Int32 | Пользовательский порог бинаризации изображения. |

### Смотрите также

* enum [Language](../../language/)
* class [DocumentRecognitionSettings](../)
* пространство имен [Aspose.OCR](../../documentrecognitionsettings/)
* сборка [Aspose.OCR](../../../)


