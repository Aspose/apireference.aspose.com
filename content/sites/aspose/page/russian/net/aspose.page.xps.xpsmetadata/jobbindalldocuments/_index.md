---
title: Class JobBindAllDocuments
second_title: Справочник по Aspose.Page для .NET API
description: Aspose.Page.XPS.XpsMetadata.JobBindAllDocuments сорт. Описывает метод привязки. Все документы в задании связаны вместе. JobBindAllDocuments иDocumentBinding являются взаимоисключающими. Драйвер должен определить обработку ограничений между этими ключевыми словами. https//docs.microsoft.com/enus/windows/win32/printdocs/jobbindalldocuments
type: docs
weight: 1150
url: /ru/net/aspose.page.xps.xpsmetadata/jobbindalldocuments/
---
## JobBindAllDocuments class

Описывает метод привязки. Все документы в задании связаны вместе. `JobBindAllDocuments` и[`DocumentBinding`](../documentbinding/) являются взаимоисключающими. Драйвер должен определить обработку ограничений между этими ключевыми словами. https://docs.microsoft.com/en-us/windows/win32/printdocs/jobbindalldocuments

```csharp
public sealed class JobBindAllDocuments : Feature, IJobPrintTicketItem
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [JobBindAllDocuments](jobbindalldocuments/)(params BindingOption[]) | Создает новый экземпляр. |

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
| class [BindingGutter](jobbindalldocuments.bindinggutter/) | Описывает способ указания оцененное значение свойства, либо целочисленным значением, либо ссылкой на параметр. |
| class [BindingOption](jobbindalldocuments.bindingoption/) | Описывает`JobBindAllDocuments` параметры функции. |
| interface [IBindingOptionItem](jobbindalldocuments.ibindingoptionitem/) | Интерфейс любой[`BindingOption`](../jobbindalldocuments.bindingoption/) пункт. |

### Смотрите также

* class [Feature](../feature/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* пространство имен [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* сборка [Aspose.Page](../../)


