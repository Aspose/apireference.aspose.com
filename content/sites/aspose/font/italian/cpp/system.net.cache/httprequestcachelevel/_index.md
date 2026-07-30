---
title: "System::Net::Cache::HttpRequestCacheLevel enumerazione"
linktitle: "HttpRequestCacheLevel"
second_title: "Aspose.Font per C++"
description: "System::Net::Cache::HttpRequestCacheLevel enumerazione. L'enumerazione descrive le impostazioni di cache per HTTP in C++."
type: docs
weight: 400
url: /it/cpp/system.net.cache/httprequestcachelevel/
---
## HttpRequestCacheLevel enum


L'enumerazione descrive le impostazioni di cache per HTTP.

```cpp
enum class HttpRequestCacheLevel
```

### Valori

| Nome | Valore | Descrizione |
| --- | --- | --- |
| Predefinito | 0 | Soddisfa una richiesta per una risorsa utilizzando la copia nella cache della risorsa o inviando una richiesta al server. |
| BypassCache | 1 | Soddisfa una richiesta utilizzando il server. |
| CacheOnly | 2 | Utilizza sempre la cache client per ottenere una risorsa. |
| CacheIfAvailable | 3 | Soddisfa una richiesta per una risorsa dalla cache se la risorsa è disponibile, altrimenti invia una richiesta al server. |
| Revalidate | 4 | Utilizza una copia locale della risorsa se il timestamp del client è lo stesso del timestamp della risorsa sul server. Altrimenti, la risorsa viene scaricata da un server. |
| Reload | 5 | Una risorsa viene sempre scaricata dal server. |
| NoCacheNoStore | 6 | Non soddisfa mai una richiesta utilizzando risorse dalla cache e non memorizza le risorse nella cache. |
| CacheOrNextCacheOnly | 7 | Soddisfa una richiesta per una risorsa sia dalla cache del computer locale sia da una cache remota sulla LAN. |
| Refresh | 8 | Soddisfa una richiesta utilizzando il server o una cache diversa dalla cache locale. |

## Vedi anche

* Namespace [System::Net::Cache](../)
* Library [Aspose.Font for C++](../../)
