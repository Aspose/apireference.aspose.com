---
title: "Aspose::Page::XPS::XpsMetadata::DocumentBinding kelas"
linktitle: "DocumentBinding"
second_title: "Aspose.Page untuk C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentBinding kelas. Menjelaskan metode pengikatan. Setiap dokumen diikat secara terpisah. DocumentBinding dan JobBindAllDocuments bersifat saling eksklusif. Terserah driver untuk menentukan penanganan batasan antar kata kunci. dalam C++."
type: docs
weight: 600
url: /id/cpp/aspose.page.xps.xpsmetadata/documentbinding/
---
## DocumentBinding class


Menjelaskan metode pengikatan. Setiap dokumen diikat secara terpisah. [DocumentBinding](./) dan [JobBindAllDocuments](../jobbindalldocuments/) bersifat saling eksklusif. Terserah driver untuk menentukan penanganan batasan antar kata kunci. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentbinding](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentbinding).

```cpp
class DocumentBinding : public Aspose::Page::XPS::XpsMetadata::Feature,
                        public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                        public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Nested classes

* Class [BindingGutter](./bindinggutter/)
* Class [BindingOption](./bindingoption/)
* Class [IBindingOptionItem](./ibindingoptionitem/)
## Metode

| Metode | Deskripsi |
| --- | --- |
| [DocumentBinding](./documentbinding/)(const System::ArrayPtr\<System::SharedPtr\<DocumentBinding::BindingOption\>\>\&) | Membuat instance baru. |
## Lihat Juga

* Class [Feature](../feature/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
