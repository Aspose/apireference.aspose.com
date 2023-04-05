---
title: Class JobErrorSheet
second_title: Aspose.Page untuk Referensi .NET API
description: Aspose.Page.XPS.XpsMetadata.JobErrorSheet kelas. Menjelaskan keluaran lembar kesalahan. Seluruh pekerjaan akan memiliki satu lembar kesalahan. Lembar kesalahan harus ditampilkan secara defaultPageMediaSize dan menggunakan defaultPageMediaType . Lembar kesalahan harus diisolasi dari sisa pekerjaan. Ini berarti bahwa setiap opsi penyelesaian atau pemrosesan seperti   atau  tidak boleh menyertakan lembar kesalahan. Lembar kesalahan harus muncul sebagai lembar akhir pekerjaan. https//docs.microsoft.com/enus/windows/win32/printdocs/joberrorsheet
type: docs
weight: 1290
url: /id/net/aspose.page.xps.xpsmetadata/joberrorsheet/
---
## JobErrorSheet class

Menjelaskan keluaran lembar kesalahan. Seluruh pekerjaan akan memiliki satu lembar kesalahan. Lembar kesalahan harus ditampilkan secara default[`PageMediaSize`](../pagemediasize/) dan menggunakan default[`PageMediaType`](../pagemediatype/) . Lembar kesalahan harus diisolasi dari sisa pekerjaan. Ini berarti bahwa setiap opsi penyelesaian atau pemrosesan (seperti , , atau ) tidak boleh menyertakan lembar kesalahan. Lembar kesalahan harus muncul sebagai lembar akhir pekerjaan. https://docs.microsoft.com/en-us/windows/win32/printdocs/joberrorsheet

```csharp
JobDuplex
```

```csharp
JobStaple
```

```csharp
JobBinding
```

```csharp
public sealed class JobErrorSheet : Feature, IJobPrintTicketItem
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [JobErrorSheet](joberrorsheet/)(params IJobErrorSheetItem[]) | Membuat instance baru. |

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
| class [ErrorSheetOption](joberrorsheet.errorsheetoption/) | Menjelaskan`JobErrorSheet` opsi fitur. |
| class [ErrorSheetWhen](joberrorsheet.errorsheetwhen/) | Menjelaskan bagian dalam fitur. |
| interface [IJobErrorSheetItem](joberrorsheet.ijoberrorsheetitem/) | Antarmuka apa saja`JobErrorSheet` item fitur. |

### Lihat juga

* class [Feature](../feature/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* ruang nama [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* perakitan [Aspose.Page](../../)


