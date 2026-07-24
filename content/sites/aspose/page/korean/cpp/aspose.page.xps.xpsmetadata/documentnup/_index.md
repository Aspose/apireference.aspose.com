---
title: "Aspose::Page::XPS::XpsMetadata::DocumentNUp 클래스"
linktitle: "DocumentNUp"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::XPS::XpsMetadata::DocumentNUp 클래스. 여러 논리 페이지를 하나의 물리 시트에 출력하고 포맷하는 방식을 설명합니다. 각 문서는 별도로 컴파일됩니다. DocumentNUp와 JobNUpAllDocumentsContiguously는 상호 배타적입니다. 이러한 키워드 간 제약 처리 여부는 드라이버에 달려 있습니다.  in C++."
type: docs
weight: 2000
url: /ko/cpp/aspose.page.xps.xpsmetadata/documentnup/
---
## DocumentNUp class


여러 논리 페이지를 하나의 물리 시트에 출력하고 포맷하는 방식을 설명합니다. 각 문서는 별도로 컴파일됩니다. **[DocumentNUp](./)**와 [JobNUpAllDocumentsContiguously](../jobnupalldocumentscontiguously/)는 상호 배타적입니다. 이러한 키워드 간 제약 처리 여부는 드라이버에 달려 있습니다. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentnup](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentnup).

```cpp
class DocumentNUp : public Aspose::Page::XPS::XpsMetadata::NUp,
                    public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                    public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [AddPagesPerSheetOption](./addpagespersheetoption/)(int32_t) | **PagesPerSheet** 스코어드 속성 값을 가진 옵션을 추가합니다. 물리 시트당 논리 페이지 수를 지정합니다. |
| [DocumentNUp](./documentnup/)(const System::ArrayPtr\<System::SharedPtr\<NUp::INUpItem\>\>\&) | 새 인스턴스를 생성합니다. |
## 또 보기

* Class [NUp](../nup/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
