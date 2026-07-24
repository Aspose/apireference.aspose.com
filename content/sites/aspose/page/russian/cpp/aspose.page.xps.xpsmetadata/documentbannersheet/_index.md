---
title: "Aspose::Page::XPS::XpsMetadata::DocumentBannerSheet class"
linktitle: "DocumentBannerSheet"
second_title: "Aspose.Page для C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentBannerSheet class. Описывает лист‑баннер, который должен выводиться для конкретного документа. Лист‑баннер должен выводиться с использованием размеров PageMediaSize по умолчанию и типа PageMediaType по умолчанию. Лист‑баннер также должен быть изолирован от остальной части задания. Это означает, что любые опции завершения или обработки (например, DocumentDuplex, DocumentStaple или DocumentBinding) не должны включать лист‑баннер. Лист‑баннер может быть изолирован или нет от остальной части задания. Это означает, что любые опции завершения или обработки задания могут включать лист‑баннер документа. Лист‑баннер должен быть первым листом документа.  в C++."
type: docs
weight: 400
url: /ru/cpp/aspose.page.xps.xpsmetadata/documentbannersheet/
---
## DocumentBannerSheet class


Описывает лист‑баннер, который должен выводиться для конкретного документа. Лист‑баннер должен выводиться с использованием размеров [PageMediaSize](../pagemediasize/) по умолчанию и типа [PageMediaType](../pagemediatype/) по умолчанию. Лист‑баннер также должен быть изолирован от остальной части задания. Это означает, что любые опции завершения или обработки (например, [DocumentDuplex](../documentduplex/), [DocumentStaple](../documentstaple/), или [DocumentBinding](../documentbinding/)) не должны включать лист‑баннер. Лист‑баннер может быть изолирован или нет от остальной части задания. Это означает, что любые опции завершения или обработки задания могут включать лист‑баннер документа. Лист‑баннер должен быть первым листом документа. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentbannersheet](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentbannersheet).

```cpp
class DocumentBannerSheet : public Aspose::Page::XPS::XpsMetadata::Feature,
                            public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                            public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Nested classes

* Class [BannerSheetOption](./bannersheetoption/)
## Методы

| Метод | Описание |
| --- | --- |
| [DocumentBannerSheet](./documentbannersheet/)(const System::ArrayPtr\<System::SharedPtr\<DocumentBannerSheet::BannerSheetOption\>\>\&) | Создаёт новый экземпляр. |
## См. также

* Class [Feature](../feature/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
