---
title: Class Feature
second_title: Aspose.Page untuk Referensi .NET API
description: Aspose.Page.XPS.XpsMetadata.Feature kelas. Kelas yang merangkum fitur Skema Cetak umum. Kelas dasar untuk semua fitur yang ditentukan skema. A elemen berisi daftar lengkap dariOption DanProperty elemen yang sepenuhnya mendeskripsikan atribut perangkat pengaturan pemformatan tugas atau karakteristik relevan lainnya. https//docs.microsoft.com/enus/windows/win32/printdocs/feature
type: docs
weight: 880
url: /id/net/aspose.page.xps.xpsmetadata/feature/
---
## Feature class

Kelas yang merangkum fitur Skema Cetak umum. Kelas dasar untuk semua fitur yang ditentukan skema. A elemen berisi daftar lengkap dari[`Option`](../option/) Dan[`Property`](../property/) elemen yang sepenuhnya mendeskripsikan atribut perangkat, pengaturan pemformatan tugas, atau karakteristik relevan lainnya. https://docs.microsoft.com/en-us/windows/win32/printdocs/feature

```csharp
Feature
```

```csharp
public class Feature : CompositePrintTicketElement, IFeatureItem, IPrintTicketItem
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [Feature](feature/#constructor)(string, Feature, params IFeatureItem[]) | Membuat instance fitur PrintTicket baru. |
| [Feature](feature/#constructor_1)(string, Option, params IFeatureItem[]) | Membuat instance fitur PrintTicket baru. |

## Properti

| Nama | Keterangan |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | Mendapat nama elemen. |

## Metode

| Nama | Keterangan |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | Menambahkan daftar item ke akhir daftar item fitur ini. Masing-masing harus a`Feature` , sebuah[`Option`](../option/) atau a[`Property`](../property/) contoh. |

### Lihat juga

* class [CompositePrintTicketElement](../compositeprintticketelement/)
* interface [IFeatureItem](../ifeatureitem/)
* interface [IPrintTicketItem](../iprintticketitem/)
* ruang nama [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* perakitan [Aspose.Page](../../)


