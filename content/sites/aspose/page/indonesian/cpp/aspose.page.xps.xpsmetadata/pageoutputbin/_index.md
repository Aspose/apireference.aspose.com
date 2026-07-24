---
title: "Aspose::Page::XPS::XpsMetadata::PageOutputBin kelas"
linktitle: "PageOutputBin"
second_title: "Aspose.Page untuk C++"
description: "Aspose::Page::XPS::XpsMetadata::PageOutputBin kelas. Menjelaskan daftar lengkap bin yang didukung untuk perangkat. Memungkinkan penentuan bin output per halaman. Kata kunci JobOutputBin, DocumentOutputBin, dan PageOutputBin bersifat saling eksklusif; hanya satu yang harus ditentukan dalam dokumen PrintTicket atau Print Capabilities.  dalam C++."
type: docs
weight: 11400
url: /id/cpp/aspose.page.xps.xpsmetadata/pageoutputbin/
---
## PageOutputBin class


Menjelaskan daftar lengkap bin yang didukung untuk perangkat. Memungkinkan penentuan bin output per halaman. Kata kunci [JobOutputBin](../joboutputbin/), [DocumentOutputBin](../documentoutputbin/) dan [PageOutputBin](./) bersifat saling eksklusif; hanya satu yang harus ditentukan dalam [PrintTicket](../printticket/) atau dokumen Print Capabilities. [https://docs.microsoft.com/en-us/windows/win32/printdocs/pageoutputbin](https://docs.microsoft.com/en-us/windows/win32/printdocs/pageoutputbin).

```cpp
class PageOutputBin : public Aspose::Page::XPS::XpsMetadata::OutputBin,
                      public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                      public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem,
                      public Aspose::Page::XPS::XpsMetadata::IPagePrintTicketItem
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [PageOutputBin](./pageoutputbin/)(const System::ArrayPtr\<System::SharedPtr\<OutputBin::IOutputBinItem\>\>\&) | Membuat instance baru. |
## Lihat Juga

* Class [OutputBin](../outputbin/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Class [IPagePrintTicketItem](../ipageprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
