---
title: "Aspose::Page::XPS::XpsMetadata::PageInputBin kelas"
linktitle: "PageInputBin"
second_title: "Aspose.Page untuk C++"
description: "Aspose::Page::XPS::XpsMetadata::PageInputBin kelas. Menjelaskan input bin yang terpasang pada perangkat atau daftar lengkap bin yang didukung untuk sebuah perangkat. Memungkinkan spesifikasi input bin per halaman. Kata kunci JobInputBin, DocumentInputBin, dan PageInputBin bersifat saling eksklusif. Kedua-duanya tidak boleh ditentukan secara bersamaan dalam dokumen PrintTicket atau Print Capabilities.  di C++."
type: docs
weight: 10000
url: /id/cpp/aspose.page.xps.xpsmetadata/pageinputbin/
---
## PageInputBin class


Menjelaskan input bin yang terpasang pada perangkat atau daftar lengkap bin yang didukung untuk sebuah perangkat. Memungkinkan spesifikasi input bin per halaman. Kata kunci [JobInputBin](../jobinputbin/), [DocumentInputBin](../documentinputbin/) dan [PageInputBin](./) bersifat saling eksklusif. Kedua-duanya tidak boleh ditentukan secara bersamaan dalam dokumen [PrintTicket](../printticket/) atau Print Capabilities. [https://docs.microsoft.com/en-us/windows/win32/printdocs/pageinputbin](https://docs.microsoft.com/en-us/windows/win32/printdocs/pageinputbin).

```cpp
class PageInputBin : public Aspose::Page::XPS::XpsMetadata::InputBin,
                     public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                     public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem,
                     public Aspose::Page::XPS::XpsMetadata::IPagePrintTicketItem
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [PageInputBin](./pageinputbin/)(const System::ArrayPtr\<System::SharedPtr\<InputBin::IInputBinItem\>\>\&) | Membuat instance baru. |
## Lihat Juga

* Class [InputBin](../inputbin/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Class [IPagePrintTicketItem](../ipageprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
