---
title: "Aspose::Page::XPS::XpsMetadata::DocumentBinding 클래스"
linktitle: "DocumentBinding"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::XPS::XpsMetadata::DocumentBinding 클래스. 바인딩 방법을 설명합니다. 각 문서는 별도로 바인딩됩니다. DocumentBinding과 JobBindAllDocuments는 상호 배타적입니다. 키워드 간 제약 처리 여부는 드라이버에 따라 결정됩니다. C++에서."
type: docs
weight: 600
url: /ko/cpp/aspose.page.xps.xpsmetadata/documentbinding/
---
## DocumentBinding class


바인딩 방법을 설명합니다. 각 문서는 별도로 바인딩됩니다. [DocumentBinding](./) 및 [JobBindAllDocuments](../jobbindalldocuments/)는 상호 배타적입니다. 키워드 간 제약 처리 여부는 드라이버에 따라 결정됩니다. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentbinding](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentbinding).

```cpp
class DocumentBinding : public Aspose::Page::XPS::XpsMetadata::Feature,
                        public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                        public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Nested classes

* Class [BindingGutter](./bindinggutter/)
* Class [BindingOption](./bindingoption/)
* Class [IBindingOptionItem](./ibindingoptionitem/)
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [DocumentBinding](./documentbinding/)(const System::ArrayPtr\<System::SharedPtr\<DocumentBinding::BindingOption\>\>\&) | 새 인스턴스를 생성합니다. |
## 또 보기

* Class [Feature](../feature/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
