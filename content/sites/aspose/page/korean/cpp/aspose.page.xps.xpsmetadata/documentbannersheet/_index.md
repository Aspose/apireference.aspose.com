---
title: "Aspose::Page::XPS::XpsMetadata::DocumentBannerSheet 클래스"
linktitle: "DocumentBannerSheet"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::XPS::XpsMetadata::DocumentBannerSheet 클래스. 특정 문서에 출력될 배너 시트를 설명합니다. 배너 시트는 기본 PageMediaSize와 기본 PageMediaType을 사용하여 출력되어야 합니다. 배너 시트는 작업의 나머지 부분과도 격리되어야 합니다. 이는 DocumentDuplex, DocumentStaple, DocumentBinding과 같은 마감 또는 처리 옵션에 배너 시트가 포함되지 않아야 함을 의미합니다. 배너 시트는 작업의 나머지와 격리될 수도, 안 될 수도 있습니다. 이는 작업 마감 또는 처리 옵션에 문서 배너 시트를 포함할 수 있음을 의미합니다. 배너 시트는 문서의 첫 번째 시트로 나타나야 합니다.  C++에서."
type: docs
weight: 400
url: /ko/cpp/aspose.page.xps.xpsmetadata/documentbannersheet/
---
## DocumentBannerSheet class


특정 문서에 출력될 배너 시트를 설명합니다. 배너 시트는 기본 [PageMediaSize](../pagemediasize/)을 사용하고 기본 [PageMediaType](../pagemediatype/)을 사용하여 출력되어야 합니다. 배너 시트는 작업의 나머지와도 격리되어야 합니다. 이는 [DocumentDuplex](../documentduplex/), [DocumentStaple](../documentstaple/), [DocumentBinding](../documentbinding/)과 같은 마감 또는 처리 옵션에 배너 시트가 포함되지 않아야 함을 의미합니다. 배너 시트는 작업의 나머지와 격리될 수도, 안 될 수도 있습니다. 이는 작업 마감 또는 처리 옵션에 문서 배너 시트를 포함할 수 있음을 의미합니다. 배너 시트는 문서의 첫 번째 시트로 나타나야 합니다. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentbannersheet](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentbannersheet).

```cpp
class DocumentBannerSheet : public Aspose::Page::XPS::XpsMetadata::Feature,
                            public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                            public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Nested classes

* Class [BannerSheetOption](./bannersheetoption/)
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [DocumentBannerSheet](./documentbannersheet/)(const System::ArrayPtr\<System::SharedPtr\<DocumentBannerSheet::BannerSheetOption\>\>\&) | 새 인스턴스를 생성합니다. |
## 또 보기

* Class [Feature](../feature/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
