---
title: "System::Net::Cache::HttpRequestCacheLevel enum"
linktitle: "HttpRequestCacheLevel"
second_title: "Aspose.Page için C++"
description: "System::Net::Cache::HttpRequestCacheLevel enum. Bu enum, C++'ta HTTP için önbellek ayarlarını açıklar."
type: docs
weight: 400
url: /tr/cpp/system.net.cache/httprequestcachelevel/
---
## HttpRequestCacheLevel enum


Enum, HTTP için önbellek ayarlarını tanımlar.

```cpp
enum class HttpRequestCacheLevel
```

### Değerler

| Ad | Değer | Açıklama |
| --- | --- | --- |
| Default | 0 | Bir kaynağa yönelik isteği, kaynağın önbellekteki kopyasını kullanarak ya da isteği sunucuya göndererek karşılar. |
| BypassCache | 1 | İsteği sunucu kullanarak karşılar. |
| CacheOnly | 2 | Her zaman bir kaynağı almak için istemci önbelleğini kullanır. |
| CacheIfAvailable | 3 | Kaynak önbellekte mevcutsa bir kaynak isteğini karşılar, aksi takdirde sunucuya bir istek gönderir. |
| Yeniden Doğrula | 4 | İstemci zaman damgası, sunucudaki kaynağın zaman damgasıyla aynıysa kaynak yerel kopyası kullanılır. Aksi takdirde, bir kaynak sunucudan indirilir. |
| Yeniden Yükle | 5 | Bir kaynak her zaman sunucudan indirilir. |
| NoCacheNoStore | 6 | Önbellekten kaynakları kullanarak hiçbir zaman bir isteği karşılamaz ve kaynakları önbelleğe almaz. |
| CacheOrNextCacheOnly | 7 | Bir kaynağa yönelik isteği, ya yerel bilgisayarın önbelleğinden ya da LAN üzerindeki uzak bir önbellekten karşılar. |
| Refresh | 8 | İsteği, sunucu kullanarak veya yerel önbellek dışındaki bir önbellek kullanarak karşılar. |

## Ayrıca Bakınız

* Namespace [System::Net::Cache](../)
* Library [Aspose.Page for C++](../../)
