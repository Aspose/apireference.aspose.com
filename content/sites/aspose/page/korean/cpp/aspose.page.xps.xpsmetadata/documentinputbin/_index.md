---
title: "Aspose::Page::XPS::XpsMetadata::DocumentInputBin 클래스"
linktitle: "DocumentInputBin"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::XPS::XpsMetadata::DocumentInputBin 클래스. 장치에 설치된 입력 트레이를 설명하거나 장치가 지원하는 트레이 전체 목록을 설명합니다. JobInputBin, DocumentInputBin 및 PageInputBin 키워드는 서로 배타적입니다. PrintTicket 또는 Print Capabilities 문서에서 두 키워드를 동시에 지정해서는 안 됩니다. C++에서."
type: docs
weight: 1800
url: /ko/cpp/aspose.page.xps.xpsmetadata/documentinputbin/
---
## DocumentInputBin class


장치에 설치된 입력 트레이를 설명하거나 장치가 지원하는 트레이 전체 목록을 설명합니다. [JobInputBin](../jobinputbin/), [DocumentInputBin](./), 및 [PageInputBin](../pageinputbin/) 키워드는 서로 배타적입니다. [PrintTicket](../printticket/) 또는 인쇄 기능 문서에서 두 키워드를 동시에 지정해서는 안 됩니다. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentinputbin](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentinputbin).

```cpp
class DocumentInputBin : public Aspose::Page::XPS::XpsMetadata::InputBin,
                         public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                         public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [DocumentInputBin](./documentinputbin/)(const System::ArrayPtr\<System::SharedPtr\<InputBin::IInputBinItem\>\>\&) | 새 인스턴스를 생성합니다. |
## 또 보기

* Class [InputBin](../inputbin/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
