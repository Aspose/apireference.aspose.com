---
title: "Aspose::Page::XPS::XpsMetadata::DocumentHolePunch kelas"
linktitle: "DocumentHolePunch"
second_title: "Aspose.Page untuk C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentHolePunch kelas. Menjelaskan karakteristik lubang punch pada output. Setiap dokumen dipunch secara terpisah. Kata kunci JobHolePunch dan DocumentHolePunch bersifat saling eksklusif. Kedua‑nya tidak boleh ditentukan secara bersamaan dalam dokumen PrintTicket atau Print Capabilities.  dalam C++."
type: docs
weight: 1500
url: /id/cpp/aspose.page.xps.xpsmetadata/documentholepunch/
---
## DocumentHolePunch class


Menjelaskan karakteristik lubang punch pada output. Setiap dokumen dipunch secara terpisah. Kata kunci [JobHolePunch](../jobholepunch/) dan [DocumentHolePunch](./) bersifat saling eksklusif. Kedua‑nya tidak boleh ditentukan secara bersamaan dalam [PrintTicket](../printticket/) atau dokumen Print Capabilities. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentholepunch](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentholepunch).

```cpp
class DocumentHolePunch : public Aspose::Page::XPS::XpsMetadata::HolePunch,
                          public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                          public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [DocumentHolePunch](./documentholepunch/)(const System::ArrayPtr\<System::SharedPtr\<HolePunch::HolePunchOption\>\>\&) | Membuat instance baru. |
## Lihat Juga

* Class [HolePunch](../holepunch/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
