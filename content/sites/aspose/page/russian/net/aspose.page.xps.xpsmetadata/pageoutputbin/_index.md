---
title: Class PageOutputBin
second_title: Справочник по Aspose.Page для .NET API
description: Aspose.Page.XPS.XpsMetadata.PageOutputBin сорт. Описывает полный список поддерживаемых бинов для устройства. Позволяет указать выходной лоток для каждой страницы. JobOutputBin DocumentOutputBin иPageOutputBin ключевые слова являются взаимоисключающими только одно должно быть указано в документе PrintTicket или Print Capabilities. https//docs.microsoft.com/enus/windows/win32/printdocs/pageoutputbin
type: docs
weight: 2320
url: /ru/net/aspose.page.xps.xpsmetadata/pageoutputbin/
---
## PageOutputBin class

Описывает полный список поддерживаемых бинов для устройства. Позволяет указать выходной лоток для каждой страницы. [`JobOutputBin`](../joboutputbin/) ,[`DocumentOutputBin`](../documentoutputbin/) и`PageOutputBin` ключевые слова являются взаимоисключающими, только одно должно быть указано в документе PrintTicket или Print Capabilities. https://docs.microsoft.com/en-us/windows/win32/printdocs/pageoutputbin

```csharp
public sealed class PageOutputBin : OutputBin, IDocumentPrintTicketItem, IJobPrintTicketItem, 
    IPagePrintTicketItem
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [PageOutputBin](pageoutputbin/)(params IOutputBinItem[]) | Создает новый экземпляр. |

## Характеристики

| Имя | Описание |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | Получает имя элемента. |

## Методы

| Имя | Описание |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | Добавляет список элементов в конец списка элементов этой функции. Каждый должен быть[`Feature`](../feature/) , ан[`Option`](../option/) или[`Property`](../property/) экземпляр. |

### Смотрите также

* class [OutputBin](../outputbin/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* interface [IPagePrintTicketItem](../ipageprintticketitem/)
* пространство имен [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* сборка [Aspose.Page](../../)


