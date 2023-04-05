---
title: Class JobNUpAllDocumentsContiguously
second_title: Справочник по Aspose.Page для .NET API
description: Aspose.Page.XPS.XpsMetadata.JobNUpAllDocumentsContiguously сорт. Описывает вывод нескольких логических страниц на один физический лист. Все документы в job компилируются последовательно.JobNUpAllDocumentsContiguously иDocumentNUp являются взаимоисключающими. Драйвер должен определить обработку ограничений между этими ключевыми словами.
type: docs
weight: 1380
url: /ru/net/aspose.page.xps.xpsmetadata/jobnupalldocumentscontiguously/
---
## JobNUpAllDocumentsContiguously class

Описывает вывод нескольких логических страниц на один физический лист. Все документы в job компилируются последовательно.`JobNUpAllDocumentsContiguously` и[`DocumentNUp`](../documentnup/) являются взаимоисключающими. Драйвер должен определить обработку ограничений между этими ключевыми словами.

```csharp
public sealed class JobNUpAllDocumentsContiguously : NUp, IJobPrintTicketItem
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [JobNUpAllDocumentsContiguously](jobnupalldocumentscontiguously/)(params INUpItem[]) | Создает новый экземпляр. |

## Характеристики

| Имя | Описание |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | Получает имя элемента. |

## Методы

| Имя | Описание |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | Добавляет список элементов в конец списка элементов этой функции. Каждый должен быть[`Feature`](../feature/) , ан[`Option`](../option/) или[`Property`](../property/) экземпляр. |
| [AddPagesPerSheetOption](../../aspose.page.xps.xpsmetadata/jobnupalldocumentscontiguously/addpagespersheetoption/)(int) | Добавляет и вариант с значение свойства scored. Указывает количество логических страниц на физический лист. |

### Смотрите также

* class [NUp](../nup/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* пространство имен [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* сборка [Aspose.Page](../../)


