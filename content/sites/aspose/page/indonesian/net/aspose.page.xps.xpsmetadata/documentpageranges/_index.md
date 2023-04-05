---
title: Class DocumentPageRanges
second_title: Aspose.Page untuk Referensi .NET API
description: Aspose.Page.XPS.XpsMetadata.DocumentPageRanges kelas. Menjelaskan rentang keluaran dokumen dalam halaman. Nilai parameter harus sesuai dengan struktur berikut  PageRangeText PageRange atau PageRangePageRange  PageRange PageNumber atau PageNumberPageNumber  PageNumber 1 sampai N dengan N adalah jumlah halaman dalam dokumen. Jika PageNumber  N maka PageNumber  N. Spasi kosong dalam string harus diabaikan. https//docs.microsoft.com/enus/windows/win32/printdocs/documentpageranges
type: docs
weight: 770
url: /id/net/aspose.page.xps.xpsmetadata/documentpageranges/
---
## DocumentPageRanges class

Menjelaskan rentang keluaran dokumen dalam halaman. Nilai parameter harus sesuai dengan struktur berikut: - PageRangeText: "PageRange" atau "PageRange,PageRange" - PageRange: "PageNumber" atau "PageNumber-PageNumber" - PageNumber: 1 sampai N, dengan N adalah jumlah halaman dalam dokumen. Jika PageNumber &gt; N, maka PageNumber = N. Spasi kosong dalam string harus diabaikan. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentpageranges

```csharp
public sealed class DocumentPageRanges : StringParameterInit, IDocumentPrintTicketItem, 
    IJobPrintTicketItem
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [DocumentPageRanges](documentpageranges/)(string) | Membuat instance baru. |

## Properti

| Nama | Keterangan |
| --- | --- |
| virtual [MaxLength](../../aspose.page.xps.xpsmetadata/stringparameterinit/maxlength/) { get; } | Untuk nilai string, tentukan string terpanjang yang diperbolehkan. |
| virtual [MinLength](../../aspose.page.xps.xpsmetadata/stringparameterinit/minlength/) { get; } | Untuk nilai string, tentukan string terpendek yang diizinkan. |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | Mendapat nama elemen. |

### Lihat juga

* class [StringParameterInit](../stringparameterinit/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* ruang nama [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* perakitan [Aspose.Page](../../)


