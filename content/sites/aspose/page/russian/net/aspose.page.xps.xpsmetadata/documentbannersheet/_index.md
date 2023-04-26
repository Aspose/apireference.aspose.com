---
title: Class DocumentBannerSheet
second_title: Справочник по Aspose.Page для .NET API
description: Aspose.Page.XPS.XpsMetadata.DocumentBannerSheet сорт. Описывает титульный лист который будет выводиться для конкретного документа. Баннерный лист должен выводиться на default PageMediaSize и используя значение по умолчаниюPageMediaType . Титульный лист должен быть также изолирован от остальной части задания. Это означает что любые варианты отделки или обработки например DocumentDuplex DocumentStaple  илиDocumentBinding не должен включать титульный лист. Титульный лист может быть или не быть изолированным от остальной части задания. Это означает что любые варианты завершения или обработки задания могут включать титульный лист документа. Титульный лист должен быть первым листом документа. https //docs.microsoft.com/enus/windows/win32/printdocs/documentbannersheet
type: docs
weight: 540
url: /ru/net/aspose.page.xps.xpsmetadata/documentbannersheet/
---
## DocumentBannerSheet class

Описывает титульный лист, который будет выводиться для конкретного документа. Баннерный лист должен выводиться на default [`PageMediaSize`](../pagemediasize/) и используя значение по умолчанию[`PageMediaType`](../pagemediatype/) . Титульный лист должен быть также изолирован от остальной части задания. Это означает, что любые варианты отделки или обработки (например, [`DocumentDuplex`](../documentduplex/) ,[`DocumentStaple`](../documentstaple/) , или[`DocumentBinding`](../documentbinding/)) не должен включать титульный лист. Титульный лист может быть или не быть изолированным от остальной части задания. Это означает, что любые варианты завершения или обработки задания могут включать титульный лист документа. Титульный лист должен быть первым листом документа. https ://docs.microsoft.com/en-us/windows/win32/printdocs/documentbannersheet

```csharp
public sealed class DocumentBannerSheet : Feature, IDocumentPrintTicketItem, IJobPrintTicketItem
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [DocumentBannerSheet](documentbannersheet/)(params BannerSheetOption[]) | Создает новый экземпляр. |

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
| class [BannerSheetOption](documentbannersheet.bannersheetoption/) | Представляет параметры`DocumentBannerSheet` особенность. |

### Смотрите также

* class [Feature](../feature/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* пространство имен [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* сборка [Aspose.Page](../../)


