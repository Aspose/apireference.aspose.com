---
title: "Aspose::Page::XPS::XpsMetadata::JobNUpAllDocumentsContiguously 클래스"
linktitle: "JobNUpAllDocumentsContiguously"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::XPS::XpsMetadata::JobNUpAllDocumentsContiguously 클래스. 여러 논리 페이지를 하나의 물리 시트에 출력하는 방식을 설명합니다. 작업의 모든 문서는 연속적으로 함께 컴파일됩니다. JobNUpAllDocumentsContiguously와 DocumentNUp는 상호 배타적입니다. 이러한 키워드 간의 제약 처리 여부는 드라이버에 달려 있습니다. C++에서."
type: docs
weight: 5900
url: /ko/cpp/aspose.page.xps.xpsmetadata/jobnupalldocumentscontiguously/
---
## JobNUpAllDocumentsContiguously class


여러 논리 페이지를 하나의 물리 시트에 출력하는 방식을 설명합니다. 작업의 모든 문서는 연속적으로 함께 컴파일됩니다. [JobNUpAllDocumentsContiguously](./)와 [DocumentNUp](../documentnup/)는 상호 배타적입니다. 이러한 키워드 간의 제약 처리 여부는 드라이버에 달려 있습니다. [https://docs.microsoft.com/en-us/windows/win32/printdocs/jobnupalldocumentscontiguously](https://docs.microsoft.com/en-us/windows/win32/printdocs/jobnupalldocumentscontiguously).

```cpp
class JobNUpAllDocumentsContiguously : public Aspose::Page::XPS::XpsMetadata::NUp,
                                       public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [AddPagesPerSheetOption](./addpagespersheetoption/)(int32_t) | **PagesPerSheet** 스코어드 속성 값을 가진 옵션을 추가합니다. 물리 시트당 논리 페이지 수를 지정합니다. |
| [JobNUpAllDocumentsContiguously](./jobnupalldocumentscontiguously/)(const System::ArrayPtr\<System::SharedPtr\<NUp::INUpItem\>\>\&) | 새 인스턴스를 생성합니다. |
## 또 보기

* Class [NUp](../nup/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
