---
title: Class PageWatermark
second_title: Aspose.Page untuk Referensi .NET API
description: Aspose.Page.XPS.XpsMetadata.PageWatermark kelas. Menjelaskan pengaturan tanda air keluaran dan karakteristik tanda air. Tanda air apply ke halaman logis bukan halaman fisik. Misalnya jikaDocumentDuplex diaktifkan tanda air akan muncul di masingmasing halaman pada setiap lembar. JikaDocumentDuplex  2 maka setiap lembar akan memiliki 2 tanda air. https//docs.microsoft.com/enus/windows/win32/printdocs/pagewatermark
type: docs
weight: 2650
url: /id/net/aspose.page.xps.xpsmetadata/pagewatermark/
---
## PageWatermark class

Menjelaskan pengaturan tanda air keluaran dan karakteristik tanda air. Tanda air apply ke halaman logis, bukan halaman fisik. Misalnya, jika[`DocumentDuplex`](../documentduplex/) diaktifkan, tanda air akan muncul di masing-masing halaman pada setiap lembar. Jika[`DocumentDuplex`](../documentduplex/) , =2, maka setiap lembar akan memiliki 2 tanda air. https://docs.microsoft.com/en-us/windows/win32/printdocs/pagewatermark

```csharp
NUp
```

```csharp
PagesPerSheet
```

```csharp
public sealed class PageWatermark : Feature, IDocumentPrintTicketItem, IJobPrintTicketItem, 
    IPagePrintTicketItem
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [PageWatermark](pagewatermark/)(params IPageWatermarkItem[]) | Membuat instance baru. |

## Properti

| Nama | Keterangan |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | Mendapat nama elemen. |

## Metode

| Nama | Keterangan |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | Menambahkan daftar item ke akhir daftar item fitur ini. Masing-masing harus a[`Feature`](../feature/) , sebuah[`Option`](../option/) atau a[`Property`](../property/) contoh. |

## Anggota lainnya

| Nama | Keterangan |
| --- | --- |
| interface [IPageWatermarkItem](pagewatermark.ipagewatermarkitem/) | Antarmuka apa saja`PageWatermark` item fitur. |
| interface [IPageWatermarkOptionItem](pagewatermark.ipagewatermarkoptionitem/) | Antarmuka apa saja[`PageWatermarkOption`](../pagewatermark.pagewatermarkoption/) barang. |
| class [Layering](pagewatermark.layering/) | Menjelaskan bagian dalam fitur. Mendefinisikan perilaku layering dari watermark. |
| class [LayeringOption](pagewatermark.layeringoption/) | Menjelaskan[`Layering`](../pagewatermark.layering/) opsi fitur. |
| class [PageWatermarkOption](pagewatermark.pagewatermarkoption/) | Menjelaskan`PageWatermark` opsi fitur. |

### Lihat juga

* class [Feature](../feature/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* interface [IPagePrintTicketItem](../ipageprintticketitem/)
* ruang nama [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* perakitan [Aspose.Page](../../)


