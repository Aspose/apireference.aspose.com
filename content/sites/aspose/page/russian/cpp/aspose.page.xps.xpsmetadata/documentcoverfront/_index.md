---
title: "Класс Aspose::Page::XPS::XpsMetadata::DocumentCoverFront"
linktitle: "DocumentCoverFront"
second_title: "Aspose.Page для C++"
description: "Класс Aspose::Page::XPS::XpsMetadata::DocumentCoverFront. Описывает переднюю (начальную) обложку. Каждый документ будет иметь отдельный лист. Обложка должна печататься с использованием PageMediaSize и PageMediaType, применяемых к первой странице документа. Обложка должна быть интегрирована в параметры обработки (например, DocumentDuplex, DocumentNUp) в соответствии с указанным параметром Option. на C++."
type: docs
weight: 1200
url: /ru/cpp/aspose.page.xps.xpsmetadata/documentcoverfront/
---
## DocumentCoverFront class


Описывает переднюю (начальную) обложку. Каждый документ будет иметь отдельный лист. Обложка должна печататься с использованием [PageMediaSize](../pagemediasize/) и [PageMediaType](../pagemediatype/), применяемых к первой странице документа. Обложка должна быть интегрирована в параметры обработки (например, [DocumentDuplex](../documentduplex/), [DocumentNUp](../documentnup/)) в соответствии с указанным [Option](../option/). [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentcoverfront](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentcoverfront).

```cpp
class DocumentCoverFront : public Aspose::Page::XPS::XpsMetadata::Feature,
                           public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                           public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Nested classes

* Class [CoverFrontOption](./coverfrontoption/)
## Методы

| Метод | Описание |
| --- | --- |
| [DocumentCoverFront](./documentcoverfront/)(const System::ArrayPtr\<System::SharedPtr\<DocumentCoverFront::CoverFrontOption\>\>\&) | Создаёт новый экземпляр. |
## См. также

* Class [Feature](../feature/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
