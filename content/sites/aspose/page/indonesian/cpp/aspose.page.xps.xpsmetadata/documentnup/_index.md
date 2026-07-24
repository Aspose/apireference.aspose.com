---
title: "Aspose::Page::XPS::XpsMetadata::DocumentNUp kelas"
linktitle: "DocumentNUp"
second_title: "Aspose.Page untuk C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentNUp kelas. Menjelaskan output dan format beberapa halaman logis ke satu lembar fisik. Setiap dokumen dikompilasi secara terpisah. DocumentNUp dan JobNUpAllDocumentsContiguously bersifat saling eksklusif. Penentuan penanganan batasan antara kata kunci ini menjadi tanggung jawab driver. dalam C++."
type: docs
weight: 2000
url: /id/cpp/aspose.page.xps.xpsmetadata/documentnup/
---
## DocumentNUp class


Menjelaskan output dan format beberapa halaman logis ke satu lembar fisik. Setiap dokumen dikompilasi secara terpisah. **[DocumentNUp](./)** dan [JobNUpAllDocumentsContiguously](../jobnupalldocumentscontiguously/) bersifat saling eksklusif. Penentuan penanganan batasan antara kata kunci ini menjadi tanggung jawab driver. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentnup](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentnup).

```cpp
class DocumentNUp : public Aspose::Page::XPS::XpsMetadata::NUp,
                    public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                    public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [AddPagesPerSheetOption](./addpagespersheetoption/)(int32_t) | Menambahkan opsi dengan nilai properti scored **PagesPerSheet**. Menentukan jumlah halaman logis per lembar fisik. |
| [DocumentNUp](./documentnup/)(const System::ArrayPtr\<System::SharedPtr\<NUp::INUpItem\>\>\&) | Membuat instance baru. |
## Lihat Juga

* Class [NUp](../nup/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
