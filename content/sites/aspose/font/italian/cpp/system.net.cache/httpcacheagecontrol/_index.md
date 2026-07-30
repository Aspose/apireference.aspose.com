---
title: "System::Net::Cache::HttpCacheAgeControl enum"
linktitle: "HttpCacheAgeControl"
second_title: "Aspose.Font per C++"
description: "Enum System::Net::Cache::HttpCacheAgeControl. CacheAgeControl è usato per specificare le preferenze riguardo all'età e alla freschezza degli elementi nella cache in C++."
type: docs
weight: 300
url: /it/cpp/system.net.cache/httpcacheagecontrol/
---
## HttpCacheAgeControl enum


CacheAgeControl è usato per specificare le preferenze riguardo all'età e alla freschezza degli elementi nella cache.

```cpp
enum class HttpCacheAgeControl
```

### Valori

| Nome | Valore | Descrizione |
| --- | --- | --- |
| None | 0 | Solo per uso interno. |
| MinFresh | 1 | Il contenuto può essere prelevato dalla cache se il tempo rimanente prima della scadenza è maggiore o uguale al tempo specificato con questo valore. |
| MaxAge | 2 | Il contenuto può essere prelevato dalla cache finché non è più vecchio dell'età specificata con questo valore. |
| MaxStale | 4 | Il contenuto può essere prelevato dalla cache dopo la scadenza fino a quando non trascorre il tempo specificato con questo valore. |
| MaxAgeAndMinFresh | 3 | MaxAge e MinFresh. |
| MaxAgeAndMaxStale | 6 | MaxAge e MaxStale. |

## Vedi anche

* Namespace [System::Net::Cache](../)
* Library [Aspose.Font for C++](../../)
