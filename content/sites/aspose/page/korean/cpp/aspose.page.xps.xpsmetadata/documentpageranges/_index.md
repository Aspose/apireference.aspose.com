---
title: "Aspose::Page::XPS::XpsMetadata::DocumentPageRanges 클래스"
linktitle: "DocumentPageRanges"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::XPS::XpsMetadata::DocumentPageRanges 클래스. 문서의 페이지 출력 범위를 설명합니다. 매개변수 값은 다음 구조를 따라야 합니다: C++에서."
type: docs
weight: 2200
url: /ko/cpp/aspose.page.xps.xpsmetadata/documentpageranges/
---
## DocumentPageRanges class


문서의 페이지별 출력 범위를 설명합니다. 매개변수 값은 다음 구조를 따라야 합니다:

```cpp
class DocumentPageRanges : public Aspose::Page::XPS::XpsMetadata::StringParameterInit,
                           public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                           public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [DocumentPageRanges](./documentpageranges/)(System::String) | 새 인스턴스를 생성합니다. |
## 비고


* PageRangeText: "PageRange" or "PageRange,PageRange"
* PageRange: "PageNumber" or "PageNumber-PageNumber"
* PageNumber: 1 to N, where N is the number of pages in the document.If PageNumber > N, then PageNumber = N. Whitespace in the string should be ignored. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentpageranges](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentpageranges)


## 또 보기

* Class [StringParameterInit](../stringparameterinit/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
