---
title: "Aspose::Page::XPS::XpsMetadata::DocumentNUp sınıfı"
linktitle: "DocumentNUp"
second_title: "Aspose.Page için C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentNUp sınıfı. Birden fazla mantıksal sayfanın tek bir fiziksel sayfaya çıktısını ve biçimini tanımlar. Her belge ayrı ayrı derlenir. DocumentNUp ve JobNUpAllDocumentsContiguously birbirini dışlar. Bu anahtar kelimeler arasındaki kısıtlama yönetimini sürücü belirler. C++'ta."
type: docs
weight: 2000
url: /tr/cpp/aspose.page.xps.xpsmetadata/documentnup/
---
## DocumentNUp class


Birden fazla mantıksal sayfanın tek bir fiziksel sayfaya çıktısını ve biçimini tanımlar. Her belge ayrı ayrı derlenir. **[DocumentNUp](./)** ve [JobNUpAllDocumentsContiguously](../jobnupalldocumentscontiguously/) birbirini dışlar. Bu anahtar kelimeler arasındaki kısıtlama yönetimini sürücü belirler. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentnup](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentnup).

```cpp
class DocumentNUp : public Aspose::Page::XPS::XpsMetadata::NUp,
                    public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                    public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [AddPagesPerSheetOption](./addpagespersheetoption/)(int32_t) | Bir **PagesPerSheet** skorlu özelliği değeriyle bir seçenek ekler. Fiziksel bir sayfa başına mantıksal sayfa sayısını belirtir. |
| [DocumentNUp](./documentnup/)(const System::ArrayPtr\<System::SharedPtr\<NUp::INUpItem\>\>\&) | Yeni bir örnek oluşturur. |
## Ayrıca Bakınız

* Class [NUp](../nup/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
