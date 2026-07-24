---
title: "Aspose::Page::XPS::XpsMetadata::DocumentHolePunch 클래스"
linktitle: "DocumentHolePunch"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::XPS::XpsMetadata::DocumentHolePunch 클래스. 출력의 펀칭 특성을 설명합니다. 각 문서는 별도로 펀칭됩니다. JobHolePunch와 DocumentHolePunch 키워드는 서로 배타적이며 PrintTicket 또는 Print Capabilities 문서에서 동시에 지정해서는 안 됩니다. C++에서."
type: docs
weight: 1500
url: /ko/cpp/aspose.page.xps.xpsmetadata/documentholepunch/
---
## DocumentHolePunch class


출력의 펀칭 특성을 설명합니다. 각 문서는 별도로 펀칭됩니다. [JobHolePunch](../jobholepunch/)와 [DocumentHolePunch](./) 키워드는 서로 배타적이며 [PrintTicket](../printticket/) 또는 Print Capabilities 문서에서 동시에 지정해서는 안 됩니다. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentholepunch](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentholepunch).

```cpp
class DocumentHolePunch : public Aspose::Page::XPS::XpsMetadata::HolePunch,
                          public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                          public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [DocumentHolePunch](./documentholepunch/)(const System::ArrayPtr\<System::SharedPtr\<HolePunch::HolePunchOption\>\>\&) | 새 인스턴스를 생성합니다. |
## 또 보기

* Class [HolePunch](../holepunch/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
