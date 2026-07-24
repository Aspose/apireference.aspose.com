---
title: "Aspose::Page::XPS::XpsMetadata::DocumentNUp class"
linktitle: "DocumentNUp"
second_title: "Aspose.Page для C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentNUp class. Описывает вывод и формат нескольких логических страниц на один физический лист. Каждый документ компилируется отдельно. DocumentNUp и JobNUpAllDocumentsContiguously являются взаимно исключающимися. Управление ограничениями между этими ключевыми словами оставляется на драйвер.  на C++."
type: docs
weight: 2000
url: /ru/cpp/aspose.page.xps.xpsmetadata/documentnup/
---
## DocumentNUp class


Описывает вывод и формат нескольких логических страниц на один физический лист. Каждый документ компилируется отдельно. **[DocumentNUp](./)** и [JobNUpAllDocumentsContiguously](../jobnupalldocumentscontiguously/) являются взаимно исключающимися. Управление ограничениями между этими ключевыми словами оставляется на драйвер. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentnup](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentnup).

```cpp
class DocumentNUp : public Aspose::Page::XPS::XpsMetadata::NUp,
                    public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                    public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Методы

| Метод | Описание |
| --- | --- |
| [AddPagesPerSheetOption](./addpagespersheetoption/)(int32_t) | Добавляет параметр со значением scored‑свойства **PagesPerSheet**. Указывает количество логических страниц на один физический лист. |
| [DocumentNUp](./documentnup/)(const System::ArrayPtr\<System::SharedPtr\<NUp::INUpItem\>\>\&) | Создаёт новый экземпляр. |
## См. также

* Class [NUp](../nup/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
