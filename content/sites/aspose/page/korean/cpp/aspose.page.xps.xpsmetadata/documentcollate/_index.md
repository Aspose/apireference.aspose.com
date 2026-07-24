---
title: "Aspose::Page::XPS::XpsMetadata::DocumentCollate 클래스"
linktitle: "DocumentCollate"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::XPS::XpsMetadata::DocumentCollate 클래스. 출력의 정렬 특성을 설명합니다. 각 개별 문서의 모든 페이지가 정렬됩니다. DocumentCollate와 JobCollateAlldocuments는 상호 배타적입니다. 이러한 키워드 중 하나만 구현할지 여부에 대한 동작 및 구현은 드라이버에 맡겨집니다.  in C++."
type: docs
weight: 800
url: /ko/cpp/aspose.page.xps.xpsmetadata/documentcollate/
---
## DocumentCollate class


출력의 정렬 특성을 설명합니다. 각 개별 문서의 모든 페이지가 정렬됩니다. [DocumentCollate](./)와 JobCollateAlldocuments는 상호 배타적입니다. 이러한 키워드 중 하나만 구현할지 여부에 대한 동작 및 구현은 드라이버에 맡겨집니다. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentcollate](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentcollate).

```cpp
class DocumentCollate : public Aspose::Page::XPS::XpsMetadata::Collate,
                        public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                        public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [DocumentCollate](./documentcollate/)(const System::ArrayPtr\<System::SharedPtr\<Collate::CollateOption\>\>\&) | 새 인스턴스를 생성합니다. |
## 또 보기

* Class [Collate](../collate/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
