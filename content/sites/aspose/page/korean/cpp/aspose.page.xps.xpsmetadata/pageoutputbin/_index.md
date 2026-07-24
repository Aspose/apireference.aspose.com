---
title: "Aspose::Page::XPS::XpsMetadata::PageOutputBin 클래스"
linktitle: "PageOutputBin"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::XPS::XpsMetadata::PageOutputBin 클래스. 장치에서 지원되는 모든 bin 목록을 설명합니다. 페이지별로 출력 bin을 지정할 수 있습니다. JobOutputBin, DocumentOutputBin 및 PageOutputBin 키워드는 서로 배타적이며 PrintTicket 또는 Print Capabilities 문서에서 하나만 지정해야 합니다. C++에서."
type: docs
weight: 11400
url: /ko/cpp/aspose.page.xps.xpsmetadata/pageoutputbin/
---
## PageOutputBin class


장치에서 지원되는 모든 bin 목록을 설명합니다. 페이지별로 출력 bin을 지정할 수 있습니다. [JobOutputBin](../joboutputbin/), [DocumentOutputBin](../documentoutputbin/) 및 [PageOutputBin](./) 키워드는 서로 배타적이며 [PrintTicket](../printticket/) 또는 Print Capabilities 문서에서 하나만 지정해야 합니다. [https://docs.microsoft.com/en-us/windows/win32/printdocs/pageoutputbin](https://docs.microsoft.com/en-us/windows/win32/printdocs/pageoutputbin).

```cpp
class PageOutputBin : public Aspose::Page::XPS::XpsMetadata::OutputBin,
                      public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                      public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem,
                      public Aspose::Page::XPS::XpsMetadata::IPagePrintTicketItem
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [PageOutputBin](./pageoutputbin/)(const System::ArrayPtr\<System::SharedPtr\<OutputBin::IOutputBinItem\>\>\&) | 새 인스턴스를 생성합니다. |
## 또 보기

* Class [OutputBin](../outputbin/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Class [IPagePrintTicketItem](../ipageprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
