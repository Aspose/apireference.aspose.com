---
title: "System::Net::Cache::HttpRequestCacheLevel enum"
linktitle: "HttpRequestCacheLevel"
second_title: "Aspose.Page per C++"
description: "System::Net::Cache::HttpRequestCacheLevel enum. L'enumerazione descrive le impostazioni della cache per HTTP in C++."
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
| Default | 0 | Soddisfa una richiesta per una risorsa utilizzando la copia nella cache della risorsa o inviando una richiesta per la risorsa al server. |
| BypassCache | 1 | Soddisfa una richiesta utilizzando il server. |
| CacheOnly | 2 | Utilizza sempre la cache client per ottenere una risorsa. |
| CacheIfAvailable | 3 | Soddisfa una richiesta per una risorsa dalla cache se la risorsa è disponibile, altrimenti invia una richiesta al server. |
| Rivalida | 4 | Utilizza una copia locale della risorsa se il timestamp del client è lo stesso del timestamp della risorsa sul server. Altrimenti, la risorsa viene scaricata da un server. |
| Ricarica | 5 | Una risorsa viene sempre scaricata dal server. |
| NoCacheNoStore | 6 | Non soddisfa mai una richiesta utilizzando risorse dalla cache e non memorizza le risorse nella cache. |
| CacheOrNextCacheOnly | 7 | Soddisfa una richiesta di una risorsa sia dalla cache del computer locale sia da una cache remota sulla LAN. |
| Refresh | 8 | Soddisfa una richiesta utilizzando il server o una cache diversa da quella locale. |

## Vedi anche

* Namespace [System::Net::Cache](../)
* Library [Aspose.Page for C++](../../)
