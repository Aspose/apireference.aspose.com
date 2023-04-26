---
title: Class DocumentOutputBin
second_title: Справочник по Aspose.Page для .NET API
description: Aspose.Page.XPS.XpsMetadata.DocumentOutputBin сорт. Описывает полный список поддерживаемых бинов для устройства. Позволяет указать output bin для каждого документа.JobOutputBin DocumentOutputBin и PageOutputBin ключевые слова являются взаимоисключающими только одно должно быть указано в документе PrintTicket или Print Capabilities. https//docs.microsoft.com/enus/windows/win32/printdocs/documentoutputbin
type: docs
weight: 770
url: /ru/net/aspose.page.xps.xpsmetadata/documentoutputbin/
---
## DocumentOutputBin class

Описывает полный список поддерживаемых бинов для устройства. Позволяет указать output bin для каждого документа.[`JobOutputBin`](../joboutputbin/) ,`DocumentOutputBin` и [`PageOutputBin`](../pageoutputbin/) ключевые слова являются взаимоисключающими, только одно должно быть указано в документе PrintTicket или Print Capabilities. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentoutputbin

```csharp
public sealed class DocumentOutputBin : OutputBin, IDocumentPrintTicketItem, IJobPrintTicketItem
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [DocumentOutputBin](documentoutputbin/)(params IOutputBinItem[]) | Создает новый экземпляр. |

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
* пространство имен [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* сборка [Aspose.Page](../../)


