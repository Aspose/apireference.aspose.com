---
title: Class DocumentCoverBack
second_title: Справочник по Aspose.Page для .NET API
description: Aspose.Page.XPS.XpsMetadata.DocumentCoverBack сорт. Описывает заднюю конечную обложку. Каждый документ будет иметь отдельный лист. Титульный лист должен быть напечатан наPageMediaSize иPageMediaType используется для последней страницы документа. Титульный лист должен быть интегрирован в обработку options напримерDocumentDuplex DocumentNUp  как указано в указанной опции. https//docs.microsoft.com/enus/windows/win32/printdocs/documentcoverback
type: docs
weight: 630
url: /ru/net/aspose.page.xps.xpsmetadata/documentcoverback/
---
## DocumentCoverBack class

Описывает заднюю (конечную) обложку. Каждый документ будет иметь отдельный лист. Титульный лист должен быть напечатан на[`PageMediaSize`](../pagemediasize/) и[`PageMediaType`](../pagemediatype/) используется для последней страницы документа. Титульный лист должен быть интегрирован в обработку options (например,[`DocumentDuplex`](../documentduplex/) ,[`DocumentNUp`](../documentnup/) ), как указано в указанной опции. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentcoverback

```csharp
public sealed class DocumentCoverBack : Feature, IDocumentPrintTicketItem, IJobPrintTicketItem
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [DocumentCoverBack](documentcoverback/)(params CoverBackOption[]) | Создает новый экземпляр. |

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
| class [CoverBackOption](documentcoverback.coverbackoption/) | Описывает`DocumentCoverBack` параметры функции. |

### Смотрите также

* class [Feature](../feature/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* пространство имен [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* сборка [Aspose.Page](../../)


