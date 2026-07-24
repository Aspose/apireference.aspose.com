---
title: "System::Net::Cache::HttpCacheAgeControl enum"
linktitle: "HttpCacheAgeControl"
second_title: "Aspose.Page voor C++"
description: "System::Net::Cache::HttpCacheAgeControl enum. CacheAgeControl wordt gebruikt om voorkeuren met betrekking tot de leeftijd en versheid van gecachte items op te geven in C++."
type: docs
weight: 300
url: /nl/cpp/system.net.cache/httpcacheagecontrol/
---
## HttpCacheAgeControl enum


CacheAgeControl wordt gebruikt om voorkeuren met betrekking tot de leeftijd en versheid van gecachte items op te geven.

```cpp
enum class HttpCacheAgeControl
```

### Waarden

| Naam | Waarde | Beschrijving |
| --- | --- | --- |
| None | 0 | Alleen voor intern gebruik. |
| MinFresh | 1 | Inhoud kan uit de cache worden gehaald als de resterende tijd vóór expiratie groter dan of gelijk is aan de tijd die met deze waarde is gespecificeerd. |
| MaxAge | 2 | Inhoud kan uit de cache worden gehaald totdat deze ouder is dan de leeftijd die met deze waarde is opgegeven. |
| MaxStale | 4 | Inhoud kan uit de cache worden gehaald nadat deze is verlopen, totdat de met deze waarde opgegeven tijd verstrijkt. |
| MaxAgeAndMinFresh | 3 | MaxAge en MinFresh. |
| MaxAgeAndMaxStale | 6 | MaxAge en MaxStale. |

## Zie ook

* Namespace [System::Net::Cache](../)
* Library [Aspose.Page for C++](../../)
