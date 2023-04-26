---
title: Class JobErrorSheet
second_title: Справочник по Aspose.Page для .NET API
description: Aspose.Page.XPS.XpsMetadata.JobErrorSheet сорт. Описывает вывод листа ошибок. Вся работа будет иметь один лист ошибок. Лист ошибок должен выводиться по умолчаниюPageMediaSize и используя значение по умолчаниюPageMediaType . Лист ошибок должен быть изолирован от остальной части задания. Это означает что любые варианты отделки или обработки например   или  не должен включать лист ошибок. Лист ошибок должен быть последним листом задания. https//docs.microsoft.com/enus/windows/win32/printdocs/joberrorsheet
type: docs
weight: 1300
url: /ru/net/aspose.page.xps.xpsmetadata/joberrorsheet/
---
## JobErrorSheet class

Описывает вывод листа ошибок. Вся работа будет иметь один лист ошибок. Лист ошибок должен выводиться по умолчанию[`PageMediaSize`](../pagemediasize/) и используя значение по умолчанию[`PageMediaType`](../pagemediatype/) . Лист ошибок должен быть изолирован от остальной части задания. Это означает, что любые варианты отделки или обработки (например, , , или ) не должен включать лист ошибок. Лист ошибок должен быть последним листом задания. https://docs.microsoft.com/en-us/windows/win32/printdocs/joberrorsheet

```csharp
JobDuplex
```

```csharp
JobStaple
```

```csharp
JobBinding
```

```csharp
public sealed class JobErrorSheet : Feature, IJobPrintTicketItem
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [JobErrorSheet](joberrorsheet/)(params IJobErrorSheetItem[]) | Создает новый экземпляр. |

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
| class [ErrorSheetOption](joberrorsheet.errorsheetoption/) | Описывает`JobErrorSheet` параметры функции. |
| class [ErrorSheetWhen](joberrorsheet.errorsheetwhen/) | Описывает внутренний особенность. |
| interface [IJobErrorSheetItem](joberrorsheet.ijoberrorsheetitem/) | Интерфейс любой`JobErrorSheet` элемент функции. |

### Смотрите также

* class [Feature](../feature/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* пространство имен [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* сборка [Aspose.Page](../../)


