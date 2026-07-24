---
title: "Aspose::Page::XPS::XpsMetadata::DocumentOutputBin kelas"
linktitle: "DocumentOutputBin"
second_title: "Aspose.Page untuk C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentOutputBin kelas. Menjelaskan daftar lengkap bin yang didukung untuk perangkat. Memungkinkan spesifikasi bin keluaran per dokumen. Kata kunci JobOutputBin, DocumentOutputBin, dan PageOutputBin bersifat saling eksklusif; hanya satu yang harus ditentukan dalam dokumen PrintTicket atau Print Capabilities.  dalam C++."
type: docs
weight: 2100
url: /id/cpp/aspose.page.xps.xpsmetadata/documentoutputbin/
---
## DocumentOutputBin class


Menjelaskan daftar lengkap bin yang didukung untuk perangkat. Memungkinkan spesifikasi bin output per dokumen. Kata kunci [JobOutputBin](../joboutputbin/), [DocumentOutputBin](./) dan [PageOutputBin](../pageoutputbin/) bersifat saling eksklusif; hanya satu yang harus ditentukan dalam [PrintTicket](../printticket/) atau dokumen Print Capabilities. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentoutputbin](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentoutputbin).

```cpp
class DocumentOutputBin : public Aspose::Page::XPS::XpsMetadata::OutputBin,
                          public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                          public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [DocumentOutputBin](./documentoutputbin/)(const System::ArrayPtr\<System::SharedPtr\<OutputBin::IOutputBinItem\>\>\&) | Membuat instance baru. |
## Lihat Juga

* Class [OutputBin](../outputbin/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
