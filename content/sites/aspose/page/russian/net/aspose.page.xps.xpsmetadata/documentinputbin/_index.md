---
title: Class DocumentInputBin
second_title: Справочник по Aspose.Page для .NET API
description: Aspose.Page.XPS.XpsMetadata.DocumentInputBin сорт. Описывает установленный входной лоток на устройстве или полный список поддерживаемых лотков для устройства. JobInputBin DocumentInputBin  иPageInputBin Ключевые слова являются взаимоисключающими. Оба не должны быть указаны одновременно в документе PrintTicket или Print Capabilities. https//docs.microsoft.com/enus/windows/win32/printdocs/documentinputbin
type: docs
weight: 730
url: /ru/net/aspose.page.xps.xpsmetadata/documentinputbin/
---
## DocumentInputBin class

Описывает установленный входной лоток на устройстве или полный список поддерживаемых лотков для устройства. [`JobInputBin`](../jobinputbin/) ,`DocumentInputBin` , и[`PageInputBin`](../pageinputbin/) Ключевые слова являются взаимоисключающими. Оба не должны быть указаны одновременно в документе PrintTicket или Print Capabilities. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentinputbin

```csharp
public sealed class DocumentInputBin : InputBin, IDocumentPrintTicketItem, IJobPrintTicketItem
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [DocumentInputBin](documentinputbin/)(params IInputBinItem[]) | Создает новый экземпляр. |

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
* пространство имен [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* сборка [Aspose.Page](../../)


