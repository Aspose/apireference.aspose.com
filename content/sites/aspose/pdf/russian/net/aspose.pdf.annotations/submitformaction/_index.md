---
title: SubmitFormAction
second_title: Aspose.PDF для справочника API .NET
description: Класс описывающий действие отправки формы.
type: docs
weight: 1190
url: /ru/net/aspose.pdf.annotations/submitformaction/
---
## SubmitFormAction class

Класс, описывающий действие отправки формы.

```csharp
public sealed class SubmitFormAction : PdfAction
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [SubmitFormAction](submitformaction)() | Инициализирует объект SubmitFormAction. |

## Характеристики

| Имя | Описание |
| --- | --- |
| [Flags](../../aspose.pdf.annotations/submitformaction/flags) { get; set; } | Получает или устанавливает флаги отправки action |
| [Next](../../aspose.pdf.annotations/pdfaction/next) { get; } | Следующие действия по порядку. |
| [Url](../../aspose.pdf.annotations/submitformaction/url) { get; set; } | URL-адрес назначения. |

## Поля

| Имя | Описание |
| --- | --- |
| const [CanonicalFormat](../../aspose.pdf.annotations/submitformaction/canonicalformat) | Если установлено, любые отправленные значения полей, представляющие даты, должны быть преобразованы в стандартный формат. |
| const [EmbedForm](../../aspose.pdf.annotations/submitformaction/embedform) | Если установлено, запись F отправленного FDF должна быть спецификацией файла, содержащей встроенный файловый поток , представляющий файл PDF, из которого отправляется FDF. |
| const [ExclFKey](../../aspose.pdf.annotations/submitformaction/exclfkey) | Если установлено, представленный FDF должен исключить запись F. |
| const [ExclNonUserAnnots](../../aspose.pdf.annotations/submitformaction/exclnonuserannots) | Если установлено, оно должно включать только те аннотации разметки, запись T которых соответствует имени текущего пользователя. |
| const [Exclude](../../aspose.pdf.annotations/submitformaction/exclude) | Если флажок не установлен, массив Fields указывает, какие поля следует включить в отправку. |
| const [ExportFormat](../../aspose.pdf.annotations/submitformaction/exportformat) | Если установлено, имена полей и значения должны быть представлены в формате формы HTML. |
| const [GetMethod](../../aspose.pdf.annotations/submitformaction/getmethod) | Если установлено, имена полей и значения должны быть отправлены с использованием HTTP-запроса GET. |
| const [IncludeAnnotations](../../aspose.pdf.annotations/submitformaction/includeannotations) | Если установлено, отправленный файл FDF должен включать в себя все аннотации разметки в базовом документе PDF. |
| const [IncludeAppendSaves](../../aspose.pdf.annotations/submitformaction/includeappendsaves) | Если установлено, отправленный файл FDF должен включать содержимое всех добавочных обновлений. |
| const [IncludeNoValueFields](../../aspose.pdf.annotations/submitformaction/includenovaluefields) | Если установлено, должны быть отправлены все поля, обозначенные массивом Fields и флагом Include/Exclude. |
| const [SubmitCoordinates](../../aspose.pdf.annotations/submitformaction/submitcoordinates) | Если установлено, координаты щелчка мыши, вызвавшего действие отправки формы, должны передаваться как часть данных формы. |
| const [SubmitPdf](../../aspose.pdf.annotations/submitformaction/submitpdf) | Если установлено, документ должен быть отправлен в формате PDF с использованием типа содержимого MIME application/pdf. |
| const [Xfdf](../../aspose.pdf.annotations/submitformaction/xfdf) | Если установлено, имена полей и значения должны быть представлены в виде XFDF. |

### Смотрите также

* class [PdfAction](../pdfaction)
* пространство имен [Aspose.Pdf.Annotations](../../aspose.pdf.annotations)
* сборка [Aspose.PDF](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.PDF.dll -->
