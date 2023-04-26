---
title: Class JobOutputBin
second_title: Справочник по Aspose.Page для .NET API
description: Aspose.Page.XPS.XpsMetadata.JobOutputBin сорт. Описывает установленный выходной лоток на устройстве или полный список поддерживаемых лотков для устройства. JobOutputBin DocumentOutputBin иPageOutputBin ключевые слова являются взаимоисключающими только одно должно быть указано в документе PrintTicket или Print Capabilities. https//docs.microsoft.com/enus/windows/win32/printdocs/joboutputbin
type: docs
weight: 1430
url: /ru/net/aspose.page.xps.xpsmetadata/joboutputbin/
---
## JobOutputBin class

Описывает установленный выходной лоток на устройстве или полный список поддерживаемых лотков для устройства. `JobOutputBin` ,[`DocumentOutputBin`](../documentoutputbin/) и[`PageOutputBin`](../pageoutputbin/) ключевые слова являются взаимоисключающими, только одно должно быть указано в документе PrintTicket или Print Capabilities. https://docs.microsoft.com/en-us/windows/win32/printdocs/joboutputbin

```csharp
public sealed class JobOutputBin : OutputBin, IJobPrintTicketItem
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [JobOutputBin](joboutputbin/)(params IOutputBinItem[]) | Создает новый экземпляр. |

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
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* пространство имен [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* сборка [Aspose.Page](../../)


