---
title: "Aspose::Page::XPS::XpsMetadata::DocumentStaple class"
linktitle: "DocumentStaple"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::XPS::XpsMetadata::DocumentStaple class. 출력의 스테이플링 특성을 설명합니다. 각 문서는 별도로 스테이플됩니다. JobStapleAllDocuments와 DocumentStaple 키워드는 서로 배타적입니다. 이러한 키워드 간의 제약 처리 여부는 드라이버가 결정합니다. C++에서."
type: docs
weight: 2600
url: /ko/cpp/aspose.page.xps.xpsmetadata/documentstaple/
---
## DocumentStaple class


출력의 스테이플링 특성을 설명합니다. 각 문서는 별도로 스테이플됩니다. [JobStapleAllDocuments](../jobstaplealldocuments/)와 [DocumentStaple](./) 키워드는 서로 배타적입니다. 이러한 키워드 간의 제약 처리 여부는 드라이버가 결정합니다. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentstaple](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentstaple).

```cpp
class DocumentStaple : public Aspose::Page::XPS::XpsMetadata::Staple,
                       public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                       public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [DocumentStaple](./documentstaple/)(const System::ArrayPtr\<System::SharedPtr\<Staple::StapleOption\>\>\&) | 새 인스턴스를 생성합니다. |
## 또 보기

* Class [Staple](../staple/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
