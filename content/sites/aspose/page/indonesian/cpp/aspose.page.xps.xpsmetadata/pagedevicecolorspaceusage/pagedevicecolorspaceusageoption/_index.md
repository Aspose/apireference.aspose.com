---
title: "Aspose::Page::XPS::XpsMetadata::PageDeviceColorSpaceUsage::PageDeviceColorSpaceUsageOption kelas"
linktitle: "PageDeviceColorSpaceUsageOption"
second_title: "Aspose.Page untuk C++"
description: "Aspose::Page::XPS::XpsMetadata::PageDeviceColorSpaceUsage::PageDeviceColorSpaceUsageOption kelas. Menjelaskan opsi fitur PageDeviceColorSpaceUsage dalam C++."
type: docs
weight: 200
url: /id/cpp/aspose.page.xps.xpsmetadata/pagedevicecolorspaceusage/pagedevicecolorspaceusageoption/
---
## PageDeviceColorSpaceUsageOption class


Menjelaskan opsi fitur [PageDeviceColorSpaceUsage](../).

```cpp
class PageDeviceColorSpaceUsageOption : public Aspose::Page::XPS::XpsMetadata::Option
```

## Bidang

| Bidang | Deskripsi |
| --- | --- |
| static [MatchToDefault](./matchtodefault/) | Jika perangkat menentukan bahwa profil yang ditentukan oleh parameter [PageDeviceColorSpaceProfileURI](../../pagedevicecolorspaceprofileuri/) dapat digunakan sebagai profil ruang warna perangkat, semua elemen yang menggunakan profil yang sama diperlakukan seolah‑sudah ditentukan dalam ruang warna perangkat. Semua elemen lainnya MUST menggunakan profil yang ditentukan untuk elemen tersebut. Jika profil tidak dapat digunakan sebagai profil ruang warna perangkat, elemen yang menggunakan profil MUST dikelola warnanya seperti elemen lain yang menggunakan profil warna. |
| static [OverrideDeviceDefault](./overridedevicedefault/) | Jika profil yang ditentukan oleh parameter [PageDeviceColorSpaceProfileURI](../../pagedevicecolorspaceprofileuri/) memiliki jumlah saluran yang cocok dengan jumlah primer perangkat, profil tersebut SHOULD digunakan alih-alih manajemen warna internal perangkat untuk semua elemen. Elemen yang menggunakan profil ini diasumsikan berada dalam ruang warna perangkat dan tidak akan dikelola warnanya lebih lanjut. |
## Lihat Juga

* Class [Option](../../option/)
* Class [PageDeviceColorSpaceUsage](../)
* Namespace [Aspose::Page::XPS::XpsMetadata](../../)
* Library [Aspose.Page for C++](../../../)
