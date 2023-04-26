---
title: Class PageInputBin
second_title: Справочник по Aspose.Page для .NET API
description: Aspose.Page.XPS.XpsMetadata.PageInputBin сорт. Описывает установленный входной лоток в устройстве или полный список поддерживаемых лотков для устройства. Позволяет указать входной лоток для каждой страницы.JobInputBin DocumentInputBin и PageInputBin ключевые слова взаимоисключающие. Оба не должны быть указаны одновременно в документе PrintTicket или Print Capabilities. https//docs.microsoft.com/enus/windows/win32/printdocs/pageinputbin
type: docs
weight: 2030
url: /ru/net/aspose.page.xps.xpsmetadata/pageinputbin/
---
## PageInputBin class

Описывает установленный входной лоток в устройстве или полный список поддерживаемых лотков для устройства. Позволяет указать входной лоток для каждой страницы.[`JobInputBin`](../jobinputbin/) ,[`DocumentInputBin`](../documentinputbin/) и `PageInputBin` ключевые слова взаимоисключающие. Оба не должны быть указаны одновременно в документе PrintTicket или Print Capabilities. https://docs.microsoft.com/en-us/windows/win32/printdocs/pageinputbin

```csharp
public sealed class PageInputBin : InputBin, IDocumentPrintTicketItem, IJobPrintTicketItem, 
    IPagePrintTicketItem
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [PageInputBin](pageinputbin/)(params IInputBinItem[]) | Создает новый экземпляр. |

## Характеристики

| Имя | Описание |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | Получает имя элемента. |

## Методы

| Имя | Описание |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | Добавляет список элементов в конец списка элементов этой функции. Каждый должен быть[`Feature`](../feature/) , ан[`Option`](../option/) или[`Property`](../property/) экземпляр. |

### Смотрите также

* class [InputBin](../inputbin/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* interface [IPagePrintTicketItem](../ipageprintticketitem/)
* пространство имен [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* сборка [Aspose.Page](../../)


