---
title: Class JobInputBin
second_title: Справочник по Aspose.Page для .NET API
description: Aspose.Page.XPS.XpsMetadata.JobInputBin сорт. Описывает установленный входной лоток в устройстве или полный список поддерживаемых лотков для устройства. Позволяет указать входной лоток для каждого задания.JobInputBin DocumentInputBin  иPageInputBin ключевые слова взаимоисключающие. Оба не должны быть указаны одновременно в документе PrintTicket или Print Capabilities. https//docs.microsoft.com/enus/windows/win32/printdocs/jobinputbin
type: docs
weight: 1380
url: /ru/net/aspose.page.xps.xpsmetadata/jobinputbin/
---
## JobInputBin class

Описывает установленный входной лоток в устройстве или полный список поддерживаемых лотков для устройства. Позволяет указать входной лоток для каждого задания.`JobInputBin` ,[`DocumentInputBin`](../documentinputbin/) , и[`PageInputBin`](../pageinputbin/) ключевые слова взаимоисключающие. Оба не должны быть указаны одновременно в документе PrintTicket или Print Capabilities. https://docs.microsoft.com/en-us/windows/win32/printdocs/jobinputbin

```csharp
public sealed class JobInputBin : InputBin, IJobPrintTicketItem
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [JobInputBin](jobinputbin/)(params IInputBinItem[]) | Создает новый экземпляр. |

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
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* пространство имен [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* сборка [Aspose.Page](../../)


