---
title: "Aspose::Page::XPS::XpsMetadata::DocumentInputBin kelas"
linktitle: "DocumentInputBin"
second_title: "Aspose.Page untuk C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentInputBin kelas. Menjelaskan kotak masukan yang terpasang pada perangkat atau daftar lengkap kotak yang didukung untuk sebuah perangkat. Kata kunci JobInputBin, DocumentInputBin, dan PageInputBin bersifat saling eksklusif. Keduanya tidak boleh ditentukan secara bersamaan dalam dokumen PrintTicket atau Print Capabilities.  dalam C++."
type: docs
weight: 1800
url: /id/cpp/aspose.page.xps.xpsmetadata/documentinputbin/
---
## DocumentInputBin class


Menjelaskan kotak masukan yang terpasang pada perangkat atau daftar lengkap kotak yang didukung untuk sebuah perangkat. Kata kunci [JobInputBin](../jobinputbin/), [DocumentInputBin](./), dan [PageInputBin](../pageinputbin/) bersifat saling eksklusif. Keduanya tidak boleh ditentukan secara bersamaan dalam [PrintTicket](../printticket/) atau dokumen Print Capabilities. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentinputbin](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentinputbin).

```cpp
class DocumentInputBin : public Aspose::Page::XPS::XpsMetadata::InputBin,
                         public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                         public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [DocumentInputBin](./documentinputbin/)(const System::ArrayPtr\<System::SharedPtr\<InputBin::IInputBinItem\>\>\&) | Membuat instance baru. |
## Lihat Juga

* Class [InputBin](../inputbin/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
