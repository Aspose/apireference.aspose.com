---
title: "Aspose::Page::XPS::XpsMetadata::PageInputBin 클래스"
linktitle: "PageInputBin"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::XPS::XpsMetadata::PageInputBin 클래스. 장치에 설치된 입력 바이너리 또는 장치가 지원하는 전체 바이너리 목록을 설명합니다. 페이지별로 입력 바이너리를 지정할 수 있습니다. JobInputBin, DocumentInputBin 및 PageInputBin 키워드는 상호 배타적입니다. 두 키워드는 PrintTicket 또는 Print Capabilities 문서에서 동시에 지정해서는 안 됩니다. C++에서."
type: docs
weight: 10000
url: /ko/cpp/aspose.page.xps.xpsmetadata/pageinputbin/
---
## PageInputBin class


장치에 설치된 입력 바이너리 또는 장치가 지원하는 전체 바이너리 목록을 설명합니다. 페이지별로 입력 바이너리를 지정할 수 있습니다. [JobInputBin](../jobinputbin/), [DocumentInputBin](../documentinputbin/) 및 [PageInputBin](./) 키워드는 상호 배타적입니다. 두 키워드는 [PrintTicket](../printticket/) 또는 Print Capabilities 문서에서 동시에 지정해서는 안 됩니다. [https://docs.microsoft.com/en-us/windows/win32/printdocs/pageinputbin](https://docs.microsoft.com/en-us/windows/win32/printdocs/pageinputbin).

```cpp
class PageInputBin : public Aspose::Page::XPS::XpsMetadata::InputBin,
                     public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                     public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem,
                     public Aspose::Page::XPS::XpsMetadata::IPagePrintTicketItem
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [PageInputBin](./pageinputbin/)(const System::ArrayPtr\<System::SharedPtr\<InputBin::IInputBinItem\>\>\&) | 새 인스턴스를 생성합니다. |
## 또 보기

* Class [InputBin](../inputbin/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Class [IPagePrintTicketItem](../ipageprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
