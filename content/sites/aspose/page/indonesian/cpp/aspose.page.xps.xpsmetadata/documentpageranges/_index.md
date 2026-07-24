---
title: "Aspose::Page::XPS::XpsMetadata::DocumentPageRanges kelas"
linktitle: "DocumentPageRanges"
second_title: "Aspose.Page untuk C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentPageRanges kelas. Menjelaskan rentang keluaran dokumen dalam halaman. Nilai parameter harus sesuai dengan struktur berikut: dalam C++."
type: docs
weight: 2200
url: /id/cpp/aspose.page.xps.xpsmetadata/documentpageranges/
---
## DocumentPageRanges class


Menjelaskan rentang output dokumen dalam halaman. Nilai parameter harus sesuai dengan struktur berikut:

```cpp
class DocumentPageRanges : public Aspose::Page::XPS::XpsMetadata::StringParameterInit,
                           public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                           public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [DocumentPageRanges](./documentpageranges/)(System::String) | Membuat instance baru. |
## Catatan


* PageRangeText: "PageRange" or "PageRange,PageRange"
* PageRange: "PageNumber" or "PageNumber-PageNumber"
* PageNumber: 1 to N, where N is the number of pages in the document.If PageNumber > N, then PageNumber = N. Whitespace in the string should be ignored. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentpageranges](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentpageranges)


## Lihat Juga

* Class [StringParameterInit](../stringparameterinit/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
