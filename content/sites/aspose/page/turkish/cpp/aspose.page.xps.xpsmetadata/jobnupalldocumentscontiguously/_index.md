---
title: "Aspose::Page::XPS::XpsMetadata::JobNUpAllDocumentsContiguously class"
linktitle: "JobNUpAllDocumentsContiguously"
second_title: "Aspose.Page için C++"
description: "Aspose::Page::XPS::XpsMetadata::JobNUpAllDocumentsContiguously sınıfı. Birden fazla mantıksal sayfanın tek bir fiziksel sayfaya çıktısını açıklar. İşteki tüm belgeler art arda birleştirilir. JobNUpAllDocumentsContiguously ve DocumentNUp birbirini dışlar. Bu anahtar kelimeler arasındaki kısıtlama yönetimini sürücü belirler.  C++'da."
type: docs
weight: 5900
url: /tr/cpp/aspose.page.xps.xpsmetadata/jobnupalldocumentscontiguously/
---
## JobNUpAllDocumentsContiguously class


Birden fazla mantıksal sayfanın tek bir fiziksel sayfaya çıktısını açıklar. İşteki tüm belgeler art arda birleştirilir. [JobNUpAllDocumentsContiguously](./) ve [DocumentNUp](../documentnup/) birbirini dışlar. Bu anahtar kelimeler arasındaki kısıtlama yönetimini sürücü belirler. [https://docs.microsoft.com/en-us/windows/win32/printdocs/jobnupalldocumentscontiguously](https://docs.microsoft.com/en-us/windows/win32/printdocs/jobnupalldocumentscontiguously).

```cpp
class JobNUpAllDocumentsContiguously : public Aspose::Page::XPS::XpsMetadata::NUp,
                                       public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [AddPagesPerSheetOption](./addpagespersheetoption/)(int32_t) | Bir **PagesPerSheet** skorlu özelliği değeriyle bir seçenek ekler. Fiziksel bir sayfa başına mantıksal sayfa sayısını belirtir. |
| [JobNUpAllDocumentsContiguously](./jobnupalldocumentscontiguously/)(const System::ArrayPtr\<System::SharedPtr\<NUp::INUpItem\>\>\&) | Yeni bir örnek oluşturur. |
## Ayrıca Bakınız

* Class [NUp](../nup/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
