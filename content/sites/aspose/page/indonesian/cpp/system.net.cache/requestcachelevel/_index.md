---
title: "System::Net::Cache::RequestCacheLevel enum"
linktitle: "RequestCacheLevel"
second_title: "Aspose.Page untuk C++"
description: "enum System::Net::Cache::RequestCacheLevel. Enum ini menjelaskan pengaturan cache yang berlaku untuk setiap WebRequest dalam C++."
type: docs
weight: 500
url: /id/cpp/system.net.cache/requestcachelevel/
---
## RequestCacheLevel enum


Enum ini menjelaskan pengaturan cache yang berlaku untuk setiap [WebRequest](../../system.net/webrequest/).

```cpp
enum class RequestCacheLevel
```

### Nilai

| Nama | Nilai | Deskripsi |
| --- | --- | --- |
| Default | 0 | Memenuhi permintaan untuk sumber daya baik dengan menggunakan salinan cache dari sumber daya tersebut atau dengan mengirimkan permintaan ke server. |
| BypassCache | 1 | Memenuhi permintaan dengan menggunakan server. Tidak ada entri yang diambil dari cache. |
| CacheOnly | 2 | Memenuhi permintaan untuk sumber daya hanya dari cache. [WebException](../../system.net/webexception/) akan dilemparkan ketika sumber daya tidak ada di cache klien. |
| CacheIfAvailable | 3 | Memenuhi permintaan sumber daya dari cache jika sumber daya tersedia, jika tidak mengirim permintaan ke server. |
| Revalidasi | 4 | Menggunakan salinan lokal sumber daya jika cap waktu klien sama dengan cap waktu sumber daya di server. Jika tidak, sumber daya diunduh dari server. |
| Muat Ulang | 5 | Sumber daya selalu diunduh dari server. |
| NoCacheNoStore | 6 | Tidak pernah memenuhi permintaan dengan menggunakan sumber daya dari cache dan tidak menyimpan sumber daya di cache. |

## Lihat Juga

* Namespace [System::Net::Cache](../)
* Library [Aspose.Page for C++](../../)
