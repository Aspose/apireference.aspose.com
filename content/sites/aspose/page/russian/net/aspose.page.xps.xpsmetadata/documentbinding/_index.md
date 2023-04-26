---
title: Class DocumentBinding
second_title: Справочник по Aspose.Page для .NET API
description: Aspose.Page.XPS.XpsMetadata.DocumentBinding сорт. Описывает метод привязки. Каждый документ связан отдельно. DocumentBinding и JobBindAllDocuments являются взаимоисключающими. Драйвер должен определить обработку ограничений между ключевыми словами. https//docs.microsoft.com/enus/windows/win32/printdocs/documentbinding
type: docs
weight: 570
url: /ru/net/aspose.page.xps.xpsmetadata/documentbinding/
---
## DocumentBinding class

Описывает метод привязки. Каждый документ связан отдельно. DocumentBinding и JobBindAllDocuments являются взаимоисключающими. Драйвер должен определить обработку ограничений между ключевыми словами. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentbinding

```csharp
public sealed class DocumentBinding : Feature, IDocumentPrintTicketItem, IJobPrintTicketItem
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [DocumentBinding](documentbinding/)(params BindingOption[]) | Создает новый экземпляр. |

## Характеристики

| Имя | Описание |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | Получает имя элемента. |

## Методы

| Имя | Описание |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | Добавляет список элементов в конец списка элементов этой функции. Каждый должен быть[`Feature`](../feature/) , ан[`Option`](../option/) или[`Property`](../property/) экземпляр. |

## Другие члены

| Имя | Описание |
| --- | --- |
| class [BindingGutter](documentbinding.bindinggutter/) | Описывает способ указания оцененное значение свойства, либо целочисленным значением, либо ссылкой на параметр. |
| class [BindingOption](documentbinding.bindingoption/) | Представляет параметры`DocumentBinding` особенность. |
| interface [IBindingOptionItem](documentbinding.ibindingoptionitem/) | Интерфейс любой[`BindingOption`](../documentbinding.bindingoption/) пункт. |

### Смотрите также

* class [Feature](../feature/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* пространство имен [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* сборка [Aspose.Page](../../)


