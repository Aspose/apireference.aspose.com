---
title: "Aspose::Page::XPS::XpsMetadata::JobPrimaryBannerSheet class"
linktitle: "JobPrimaryBannerSheet"
second_title: "Aspose.Page для C++"
description: "Aspose::Page::XPS::XpsMetadata::JobPrimaryBannerSheet class. Описывает лист‑баннер, который будет выводиться для задания. Лист‑баннер должен выводиться с использованием размеров страницы по умолчанию PageMediaSize и типа страницы по умолчанию PageMediaType. Лист‑баннер должен быть изолирован от остальной части задания. Это означает, что любые параметры завершения или обработки (например, JobDuplexAllDocumentsContiguously, JobStapleAllDocuments или JobBindAllDocuments) не должны включать лист‑баннер. Лист‑баннер должен быть первым листом задания в C++."
type: docs
weight: 6400
url: /ru/cpp/aspose.page.xps.xpsmetadata/jobprimarybannersheet/
---
## JobPrimaryBannerSheet class


Описывает лист‑баннер, который будет выводиться для задания. Лист‑баннер должен выводиться с использованием размеров страницы по умолчанию [PageMediaSize](../pagemediasize/) и типа страницы по умолчанию [PageMediaType](../pagemediatype/). Лист‑баннер должен быть изолирован от остальной части задания. Это означает, что любые параметры завершения или обработки (например, [JobDuplexAllDocumentsContiguously](../jobduplexalldocumentscontiguously/), [JobStapleAllDocuments](../jobstaplealldocuments/), или [JobBindAllDocuments](../jobbindalldocuments/)) не должны включать лист‑баннер. Лист‑баннер должен быть первым листом задания.

```cpp
class JobPrimaryBannerSheet : public Aspose::Page::XPS::XpsMetadata::Feature,
                              public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem
```

## Nested classes

* Class [BannerSheetOption](./bannersheetoption/)
## Методы

| Метод | Описание |
| --- | --- |
| [JobPrimaryBannerSheet](./jobprimarybannersheet/)(const System::ArrayPtr\<System::SharedPtr\<JobPrimaryBannerSheet::BannerSheetOption\>\>\&) | Создаёт новый экземпляр. |
## См. также

* Class [Feature](../feature/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
