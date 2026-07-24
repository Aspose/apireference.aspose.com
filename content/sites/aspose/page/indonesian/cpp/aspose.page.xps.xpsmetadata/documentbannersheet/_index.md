---
title: "Aspose::Page::XPS::XpsMetadata::DocumentBannerSheet kelas"
linktitle: "DocumentBannerSheet"
second_title: "Aspose.Page untuk C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentBannerSheet kelas. Menjelaskan lembar banner yang akan dikeluarkan untuk dokumen tertentu. Lembar banner harus dikeluarkan dengan ukuran PageMediaSize default dan menggunakan tipe PageMediaType default. Lembar banner juga harus terisolasi dari sisa pekerjaan. Ini berarti bahwa opsi penyelesaian atau pemrosesan apa pun (seperti DocumentDuplex, DocumentStaple, atau DocumentBinding) tidak boleh menyertakan lembar banner. Lembar banner mungkin terisolasi atau tidak terisolasi dari sisa pekerjaan. Ini berarti bahwa opsi penyelesaian atau pemrosesan pekerjaan dapat menyertakan lembar banner dokumen. Lembar banner harus muncul sebagai lembar pertama dokumen. dalam C++."
type: docs
weight: 400
url: /id/cpp/aspose.page.xps.xpsmetadata/documentbannersheet/
---
## DocumentBannerSheet class


Menjelaskan lembar banner yang akan dikeluarkan untuk dokumen tertentu. Lembar banner harus dikeluarkan dengan [PageMediaSize](../pagemediasize/) default dan menggunakan [PageMediaType](../pagemediatype/) default. Lembar banner juga harus terisolasi dari sisa pekerjaan. Ini berarti bahwa opsi penyelesaian atau pemrosesan apa pun (seperti [DocumentDuplex](../documentduplex/), [DocumentStaple](../documentstaple/), atau [DocumentBinding](../documentbinding/)) tidak boleh menyertakan lembar banner. Lembar banner mungkin terisolasi atau tidak terisolasi dari sisa pekerjaan. Ini berarti bahwa opsi penyelesaian atau pemrosesan pekerjaan dapat menyertakan lembar banner dokumen. Lembar banner harus muncul sebagai lembar pertama dokumen. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentbannersheet](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentbannersheet).

```cpp
class DocumentBannerSheet : public Aspose::Page::XPS::XpsMetadata::Feature,
                            public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                            public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Nested classes

* Class [BannerSheetOption](./bannersheetoption/)
## Metode

| Metode | Deskripsi |
| --- | --- |
| [DocumentBannerSheet](./documentbannersheet/)(const System::ArrayPtr\<System::SharedPtr\<DocumentBannerSheet::BannerSheetOption\>\>\&) | Membuat instance baru. |
## Lihat Juga

* Class [Feature](../feature/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
