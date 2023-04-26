---
title: Class PageDeviceColorSpaceUsage.PageDeviceColorSpaceUsageOption
second_title: Aspose.Page untuk Referensi .NET API
description: Aspose.Page.XPS.XpsMetadata.PageDeviceColorSpaceUsagePageDeviceColorSpaceUsageOption kelas. MenjelaskanPageDeviceColorSpaceUsage opsi fitur.
type: docs
weight: 1950
url: /id/net/aspose.page.xps.xpsmetadata/pagedevicecolorspaceusage.pagedevicecolorspaceusageoption/
---
## PageDeviceColorSpaceUsage.PageDeviceColorSpaceUsageOption class

Menjelaskan[`PageDeviceColorSpaceUsage`](../pagedevicecolorspaceusage/) opsi fitur.

```csharp
public sealed class PageDeviceColorSpaceUsageOption : Option
```

## Properti

| Nama | Keterangan |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | Mendapat nama elemen. |

## Metode

| Nama | Keterangan |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/option/add/)(params IOptionItem[]) | Menambahkan daftar item ke akhir daftar item opsi ini. Masing-masing harus a[`ScoredProperty`](../scoredproperty/) atau[`Property`](../property/) contoh. |

## Bidang

| Nama | Keterangan |
| --- | --- |
| static [MatchToDefault](../../aspose.page.xps.xpsmetadata/pagedevicecolorspaceusageoption/matchtodefault/) | Jika perangkat menentukan bahwa profil ditentukan oleh[`PageDeviceColorSpaceProfileURI`](../pagedevicecolorspaceprofileuri/) parameter dapat digunakan sebagai profil ruang warna perangkat, semua elemen yang menggunakan profil yang sama diperlakukan sebagai telah ditentukan dalam ruang warna perangkat. Semua elemen lainnya HARUS menggunakan profil yang ditentukan untuk elemen tersebut. Jika profil tidak dapat digunakan sebagai profil ruang warna perangkat, elemen yang menggunakan profil HARUS dikelola warna seperti elemen lain yang menggunakan profil warna. |
| static [OverrideDeviceDefault](../../aspose.page.xps.xpsmetadata/pagedevicecolorspaceusageoption/overridedevicedefault/) | Jika profil yang ditentukan oleh parameter PageDeviceColorSpaceProfileURI memiliki sejumlah saluran yang cocok dengan nomor primer perangkat, itu HARUS digunakan sebagai pengganti manajemen warna internal perangkat untuk semua elemen. Elemen yang menggunakan profil ini diasumsikan berwarna perangkat ruang dan warna tidak akan dikelola lebih lanjut. |

### Lihat juga

* class [Option](../option/)
* class [PageDeviceColorSpaceUsage](../pagedevicecolorspaceusage/)
* ruang nama [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* perakitan [Aspose.Page](../../)


