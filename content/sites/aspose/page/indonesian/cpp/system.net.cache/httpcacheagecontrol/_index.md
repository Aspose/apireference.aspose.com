---
title: "System::Net::Cache::HttpCacheAgeControl enum"
linktitle: "HttpCacheAgeControl"
second_title: "Aspose.Page untuk C++"
description: "System::Net::Cache::HttpCacheAgeControl enum. CacheAgeControl digunakan untuk menentukan preferensi terkait usia dan kesegaran item yang di-cache dalam C++."
type: docs
weight: 300
url: /id/cpp/system.net.cache/httpcacheagecontrol/
---
## HttpCacheAgeControl enum


CacheAgeControl digunakan untuk menentukan preferensi terkait usia dan kesegaran item yang di-cache.

```cpp
enum class HttpCacheAgeControl
```

### Nilai

| Nama | Nilai | Deskripsi |
| --- | --- | --- |
| None | 0 | Hanya untuk penggunaan internal. |
| MinFresh | 1 | Konten dapat diambil dari cache jika waktu yang tersisa sebelum kedaluwarsa lebih besar atau sama dengan waktu yang ditentukan dengan nilai ini. |
| MaxAge | 2 | Konten dapat diambil dari cache sampai lebih lama daripada usia yang ditentukan dengan nilai ini. |
| MaxStale | 4 | Konten dapat diambil dari cache setelah kedaluwarsa sampai waktu yang ditentukan dengan nilai ini berakhir. |
| MaxAgeAndMinFresh | 3 | MaxAge dan MinFresh. |
| MaxAgeAndMaxStale | 6 | MaxAge dan MaxStale. |

## Lihat Juga

* Namespace [System::Net::Cache](../)
* Library [Aspose.Page for C++](../../)
