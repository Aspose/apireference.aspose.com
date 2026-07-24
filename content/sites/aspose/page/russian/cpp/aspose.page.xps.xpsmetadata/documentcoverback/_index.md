---
title: "Aspose::Page::XPS::XpsMetadata::DocumentCoverBack class"
linktitle: "DocumentCoverBack"
second_title: "Aspose.Page для C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentCoverBack class. Описывает заднюю (конечную) обложку. Каждый документ будет иметь отдельный лист. Обложка должна печататься с использованием PageMediaSize и PageMediaType, применяемых для последней страницы документа. Обложка должна быть интегрирована в параметры обработки (например, DocumentDuplex, DocumentNUp) в соответствии с указанным параметром Option.  на C++."
type: docs
weight: 1000
url: /ru/cpp/aspose.page.xps.xpsmetadata/documentcoverback/
---
## DocumentCoverBack class


Описывает заднюю (конечную) обложку. Каждый документ будет иметь отдельный лист. Обложка должна печататься с использованием [PageMediaSize](../pagemediasize/) и [PageMediaType](../pagemediatype/), применяемых для последней страницы документа. Обложка должна быть интегрирована в параметры обработки (например, [DocumentDuplex](../documentduplex/), [DocumentNUp](../documentnup/)) в соответствии с указанным параметром [Option](../option/). [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentcoverback](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentcoverback).

```cpp
class DocumentCoverBack : public Aspose::Page::XPS::XpsMetadata::Feature,
                          public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                          public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Nested classes

* Class [CoverBackOption](./coverbackoption/)
## Методы

| Метод | Описание |
| --- | --- |
| [DocumentCoverBack](./documentcoverback/)(const System::ArrayPtr\<System::SharedPtr\<DocumentCoverBack::CoverBackOption\>\>\&) | Создаёт новый экземпляр. |
## См. также

* Class [Feature](../feature/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
