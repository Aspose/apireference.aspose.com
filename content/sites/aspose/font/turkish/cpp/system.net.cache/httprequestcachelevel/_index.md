---
title: "System::Net::Cache::HttpRequestCacheLevel enum"
linktitle: "HttpRequestCacheLevel"
second_title: "Aspose.Font için C++"
description: "System::Net::Cache::HttpRequestCacheLevel enum. Bu enum, C++'da HTTP için önbellek ayarlarını tanımlar."
type: docs
weight: 400
url: /tr/cpp/system.net.cache/httprequestcachelevel/
---
## HttpRequestCacheLevel enum


Bu enum, HTTP için önbellek ayarlarını açıklar.

```cpp
enum class HttpRequestCacheLevel
```

### Değerler

| Ad | Değer | Açıklama |
| --- | --- | --- |
| Varsayılan | 0 | Bir kaynağa yönelik isteği, ya kaynağın önbellekteki kopyasını kullanarak ya da isteği sunucuya göndererek karşılar. |
| BypassCache | 1 | Sunucuyu kullanarak bir isteği karşılar. |
| CacheOnly | 2 | Her zaman bir kaynağı almak için istemci önbelleğini kullanır. |
| CacheIfAvailable | 3 | Kaynak mevcutsa, isteği önbellekten karşılar; aksi takdirde isteği sunucuya gönderir. |
| Revalidate | 4 | İstemci zaman damgası, sunucudaki kaynağın zaman damgasıyla aynıysa, kaynağın yerel kopyası kullanılır. Aksi takdirde, kaynak bir sunucudan indirilir. |
| Reload | 5 | Bir kaynak her zaman sunucudan indirilir. |
| NoCacheNoStore | 6 | Önbellekten kaynakları kullanarak bir isteği asla karşılamaz ve kaynakları önbelleğe almaz. |
| CacheOrNextCacheOnly | 7 | Bir kaynağa yönelik isteği, yerel bilgisayarın önbelleğinden ya da LAN üzerindeki uzak bir önbellekten karşılar. |
| Yenile | 8 | İsteği, sunucuyu veya yerel önbellek dışındaki bir önbelleği kullanarak karşılar. |

## Ayrıca Bakınız

* Namespace [System::Net::Cache](../)
* Library [Aspose.Font for C++](../../)
