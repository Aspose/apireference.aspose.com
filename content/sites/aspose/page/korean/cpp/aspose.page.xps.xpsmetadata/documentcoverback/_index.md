---
title: "Aspose::Page::XPS::XpsMetadata::DocumentCoverBack 클래스"
linktitle: "DocumentCoverBack"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::XPS::XpsMetadata::DocumentCoverBack 클래스. 뒷표지(끝) 시트를 설명합니다. 각 문서는 별도의 시트를 가집니다. 표지 시트는 문서의 마지막 페이지에 사용되는 PageMediaSize 및 PageMediaType에 맞춰 인쇄되어야 합니다. 표지 시트는 지정된 Option에 의해 표시된 처리 옵션(예: DocumentDuplex, DocumentNUp)과 통합되어야 합니다.  in C++."
type: docs
weight: 1000
url: /ko/cpp/aspose.page.xps.xpsmetadata/documentcoverback/
---
## DocumentCoverBack class


뒷표지(끝) 시트를 설명합니다. 각 문서는 별도의 시트를 가집니다. 표지 시트는 문서의 마지막 페이지에 사용되는 [PageMediaSize](../pagemediasize/) 및 [PageMediaType](../pagemediatype/)에 인쇄되어야 합니다. 표지 시트는 지정된 [Option](../option/)에 의해 표시된 처리 옵션(예: [DocumentDuplex](../documentduplex/), [DocumentNUp](../documentnup/))과 통합되어야 합니다. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentcoverback](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentcoverback).

```cpp
class DocumentCoverBack : public Aspose::Page::XPS::XpsMetadata::Feature,
                          public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                          public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Nested classes

* Class [CoverBackOption](./coverbackoption/)
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [DocumentCoverBack](./documentcoverback/)(const System::ArrayPtr\<System::SharedPtr\<DocumentCoverBack::CoverBackOption\>\>\&) | 새 인스턴스를 생성합니다. |
## 또 보기

* Class [Feature](../feature/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
