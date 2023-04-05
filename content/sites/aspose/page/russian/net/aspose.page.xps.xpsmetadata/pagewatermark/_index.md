---
title: Class PageWatermark
second_title: Справочник по Aspose.Page для .NET API
description: Aspose.Page.XPS.XpsMetadata.PageWatermark сорт. Описывает настройку водяного знака вывода и характеристики водяного знака. Водяные знаки применяются к логической странице а не к физической странице. Например еслиDocumentDuplex включен водяной знак появится на каждом страницы на каждом листе. ЕслиDocumentDuplex  2 то на каждом листе будет 2 водяных знака. https//docs.microsoft.com/enus/windows/win32/printdocs/pagewatermark
type: docs
weight: 2640
url: /ru/net/aspose.page.xps.xpsmetadata/pagewatermark/
---
## PageWatermark class

Описывает настройку водяного знака вывода и характеристики водяного знака. Водяные знаки применяются к логической странице, а не к физической странице. Например, если[`DocumentDuplex`](../documentduplex/) включен, водяной знак появится на каждом страницы на каждом листе. Если[`DocumentDuplex`](../documentduplex/) , =2, то на каждом листе будет 2 водяных знака. https://docs.microsoft.com/en-us/windows/win32/printdocs/pagewatermark

```csharp
NUp
```

```csharp
PagesPerSheet
```

```csharp
public sealed class PageWatermark : Feature, IDocumentPrintTicketItem, IJobPrintTicketItem, 
    IPagePrintTicketItem
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [PageWatermark](pagewatermark/)(params IPageWatermarkItem[]) | Создает новый экземпляр. |

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
| interface [IPageWatermarkItem](pagewatermark.ipagewatermarkitem/) | Интерфейс любой`PageWatermark` элемент функции. |
| interface [IPageWatermarkOptionItem](pagewatermark.ipagewatermarkoptionitem/) | Интерфейс любой[`PageWatermarkOption`](../pagewatermark.pagewatermarkoption/) пункт. |
| class [Layering](pagewatermark.layering/) | Описывает внутренний особенность. Определяет поведение водяного знака по слоям. |
| class [LayeringOption](pagewatermark.layeringoption/) | Описывает[`Layering`](../pagewatermark.layering/) параметры функции. |
| class [PageWatermarkOption](pagewatermark.pagewatermarkoption/) | Описывает`PageWatermark` возможности вариантов. |

### Смотрите также

* class [Feature](../feature/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* interface [IPagePrintTicketItem](../ipageprintticketitem/)
* пространство имен [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* сборка [Aspose.Page](../../)


