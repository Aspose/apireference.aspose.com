---
title: Class DocumentHolePunch
second_title: Справочник по Aspose.Page для .NET API
description: Aspose.Page.XPS.XpsMetadata.DocumentHolePunch сорт. Описывает характеристики перфорации выходных данных. Каждый документ перфорируется отдельно. JobHolePunch иDocumentHolePunch ключевые слова являются взаимоисключающими. Оба не должны быть указаны одновременно в документе PrintTicket или Print Capabilities. https//docs.microsoft.com/enus/windows/win32/printdocs/documentholepunch
type: docs
weight: 700
url: /ru/net/aspose.page.xps.xpsmetadata/documentholepunch/
---
## DocumentHolePunch class

Описывает характеристики перфорации выходных данных. Каждый документ перфорируется отдельно. [`JobHolePunch`](../jobholepunch/) и`DocumentHolePunch` ключевые слова являются взаимоисключающими. Оба не должны быть указаны одновременно в документе PrintTicket или Print Capabilities. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentholepunch

```csharp
public sealed class DocumentHolePunch : HolePunch, IDocumentPrintTicketItem, IJobPrintTicketItem
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [DocumentHolePunch](documentholepunch/)(params HolePunchOption[]) | Создает новый экземпляр. |

## Характеристики

| Имя | Описание |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | Получает имя элемента. |

## Методы

| Имя | Описание |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | Добавляет список элементов в конец списка элементов этой функции. Каждый должен быть[`Feature`](../feature/) , ан[`Option`](../option/) или[`Property`](../property/) экземпляр. |

### Смотрите также

* class [HolePunch](../holepunch/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* пространство имен [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* сборка [Aspose.Page](../../)


