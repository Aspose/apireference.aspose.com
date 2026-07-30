---
title: "System::Net::Cache::RequestCacheLevel enum"
linktitle: "RequestCacheLevel"
second_title: "Aspose.Font için C++"
description: "System::Net::Cache::RequestCacheLevel enum. Enum, C++'deki herhangi bir WebRequest için geçerli olan önbellek ayarlarını açıklar."
type: docs
weight: 500
url: /tr/cpp/system.net.cache/requestcachelevel/
---
## RequestCacheLevel enum


Enum, herhangi bir [WebRequest](../../system.net/webrequest/) için geçerli olan önbellek ayarlarını açıklar.

```cpp
enum class RequestCacheLevel
```

### Değerler

| Ad | Değer | Açıklama |
| --- | --- | --- |
| Varsayılan | 0 | Bir kaynağa yönelik isteği, ya kaynağın önbellekteki kopyasını kullanarak ya da isteği sunucuya göndererek karşılar. |
| BypassCache | 1 | İsteği sunucuyu kullanarak karşılar. Önbellekten hiçbir giriş alınmaz. |
| CacheOnly | 2 | Bir kaynağa yönelik isteği yalnızca önbellekten karşılar. [WebException](../../system.net/webexception/) bir kaynak istemci önbelleğinde bulunmadığında fırlatılacaktır. |
| CacheIfAvailable | 3 | Kaynak mevcutsa, isteği önbellekten karşılar; aksi takdirde isteği sunucuya gönderir. |
| Revalidate | 4 | İstemci zaman damgası, sunucudaki kaynağın zaman damgasıyla aynıysa, kaynağın yerel kopyası kullanılır. Aksi takdirde, kaynak bir sunucudan indirilir. |
| Reload | 5 | Bir kaynak her zaman sunucudan indirilir. |
| NoCacheNoStore | 6 | Önbellekten kaynakları kullanarak bir isteği asla karşılamaz ve kaynakları önbelleğe almaz. |

## Ayrıca Bakınız

* Namespace [System::Net::Cache](../)
* Library [Aspose.Font for C++](../../)
