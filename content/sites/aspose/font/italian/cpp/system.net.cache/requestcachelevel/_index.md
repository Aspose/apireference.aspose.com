---
title: "System::Net::Cache::RequestCacheLevel enum"
linktitle: "RequestCacheLevel"
second_title: "Aspose.Font per C++"
description: "System::Net::Cache::RequestCacheLevel enum. L'enumerazione descrive le impostazioni della cache applicabili a qualsiasi WebRequest in C++."
type: docs
weight: 500
url: /it/cpp/system.net.cache/requestcachelevel/
---
## RequestCacheLevel enum


L'enumerazione descrive le impostazioni della cache applicabili a qualsiasi [WebRequest](../../system.net/webrequest/).

```cpp
enum class RequestCacheLevel
```

### Valori

| Nome | Valore | Descrizione |
| --- | --- | --- |
| Predefinito | 0 | Soddisfa una richiesta per una risorsa utilizzando la copia nella cache della risorsa o inviando una richiesta al server. |
| BypassCache | 1 | Soddisfa una richiesta utilizzando il server. Nessuna voce viene prelevata dalla cache. |
| CacheOnly | 2 | Soddisfa una richiesta per una risorsa solo dalla cache. Verrà generata una [WebException](../../system.net/webexception/) quando una risorsa non è presente nella cache client. |
| CacheIfAvailable | 3 | Soddisfa una richiesta per una risorsa dalla cache se la risorsa è disponibile, altrimenti invia una richiesta al server. |
| Revalidate | 4 | Utilizza una copia locale della risorsa se il timestamp del client è lo stesso del timestamp della risorsa sul server. Altrimenti, la risorsa viene scaricata da un server. |
| Reload | 5 | Una risorsa viene sempre scaricata dal server. |
| NoCacheNoStore | 6 | Non soddisfa mai una richiesta utilizzando risorse dalla cache e non memorizza le risorse nella cache. |

## Vedi anche

* Namespace [System::Net::Cache](../)
* Library [Aspose.Font for C++](../../)
