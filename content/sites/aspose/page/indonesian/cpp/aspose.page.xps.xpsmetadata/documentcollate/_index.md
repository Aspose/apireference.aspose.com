---
title: "Aspose::Page::XPS::XpsMetadata::DocumentCollate kelas"
linktitle: "DocumentCollate"
second_title: "Aspose.Page untuk C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentCollate class. Menjelaskan karakteristik penggabungan (collating) dari output. Semua halaman dalam setiap dokumen individu digabungkan. DocumentCollate dan JobCollateAlldocuments bersifat saling eksklusif. Perilaku dan implementasi apakah kedua kata kunci atau hanya satu yang diimplementasikan diserahkan kepada driver.  dalam C++."
type: docs
weight: 800
url: /id/cpp/aspose.page.xps.xpsmetadata/documentcollate/
---
## DocumentCollate class


Menjelaskan karakteristik penggabungan dari output. Semua halaman dalam setiap dokumen individu digabungkan. [DocumentCollate](./) dan JobCollateAlldocuments bersifat saling eksklusif. Perilaku dan implementasi apakah kedua kata kunci atau hanya satu yang diimplementasikan diserahkan kepada driver. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentcollate](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentcollate).

```cpp
class DocumentCollate : public Aspose::Page::XPS::XpsMetadata::Collate,
                        public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                        public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [DocumentCollate](./documentcollate/)(const System::ArrayPtr\<System::SharedPtr\<Collate::CollateOption\>\>\&) | Membuat instance baru. |
## Lihat Juga

* Class [Collate](../collate/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
