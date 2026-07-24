---
title: "System::Net::Cache::HttpRequestCacheLevel enum"
linktitle: "HttpRequestCacheLevel"
second_title: "Aspose.Page untuk C++"
description: "System::Net::Cache::HttpRequestCacheLevel enum. Enum ini menjelaskan pengaturan cache untuk HTTP dalam C++."
type: docs
weight: 400
url: /id/cpp/system.net.cache/httprequestcachelevel/
---
## HttpRequestCacheLevel enum


Enum ini menggambarkan pengaturan cache untuk HTTP.

```cpp
enum class HttpRequestCacheLevel
```

### Nilai

| Nama | Nilai | Deskripsi |
| --- | --- | --- |
| Default | 0 | Memenuhi permintaan untuk sumber daya baik dengan menggunakan salinan cache dari sumber daya tersebut atau dengan mengirimkan permintaan ke server. |
| BypassCache | 1 | Memenuhi permintaan dengan menggunakan server. |
| CacheOnly | 2 | Selalu menggunakan cache klien untuk mendapatkan sumber daya. |
| CacheIfAvailable | 3 | Memenuhi permintaan sumber daya dari cache jika sumber daya tersedia, jika tidak mengirim permintaan ke server. |
| Revalidasi | 4 | Menggunakan salinan lokal sumber daya jika cap waktu klien sama dengan cap waktu sumber daya di server. Jika tidak, sumber daya diunduh dari server. |
| Muat Ulang | 5 | Sumber daya selalu diunduh dari server. |
| NoCacheNoStore | 6 | Tidak pernah memenuhi permintaan dengan menggunakan sumber daya dari cache dan tidak menyimpan sumber daya di cache. |
| CacheOrNextCacheOnly | 7 | Memenuhi permintaan untuk sumber daya baik dari cache komputer lokal maupun dari cache remote di LAN. |
| Refresh | 8 | Memenuhi permintaan dengan menggunakan server atau cache selain cache lokal. |

## Lihat Juga

* Namespace [System::Net::Cache](../)
* Library [Aspose.Page for C++](../../)
