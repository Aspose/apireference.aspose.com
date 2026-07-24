---
title: "System::Net::Cache::HttpRequestCacheLevel enum"
linktitle: "HttpRequestCacheLevel"
second_title: "Aspose.Page voor C++"
description: "System::Net::Cache::HttpRequestCacheLevel enum. De enum beschrijft cache-instellingen voor HTTP in C++."
type: docs
weight: 400
url: /nl/cpp/system.net.cache/httprequestcachelevel/
---
## HttpRequestCacheLevel enum


De enum beschrijft cache‑instellingen voor HTTP.

```cpp
enum class HttpRequestCacheLevel
```

### Waarden

| Naam | Waarde | Beschrijving |
| --- | --- | --- |
| Default | 0 | Vervult een verzoek voor een bron door ofwel de gecachte kopie van de bron te gebruiken of door een verzoek voor de bron naar de server te sturen. |
| BypassCache | 1 | Vervult een verzoek door de server te gebruiken. |
| CacheOnly | 2 | Gebruikt altijd de clientcache om een bron op te halen. |
| CacheIfAvailable | 3 | Voldoet aan een verzoek om een bron uit de cache als de bron beschikbaar is, anders wordt een verzoek naar de server gestuurd. |
| Revalideren | 4 | Een lokale kopie van een bron gebruiken als de client-tijdstempel gelijk is aan de tijdstempel van de bron op de server. Anders wordt de bron van een server gedownload. |
| Herladen | 5 | Een bron wordt altijd van de server gedownload. |
| NoCacheNoStore | 6 | Voldoet nooit aan een verzoek door bronnen uit de cache te gebruiken en cachet geen bronnen. |
| CacheOrNextCacheOnly | 7 | Vervult een verzoek voor een bron ofwel uit de cache van de lokale computer of uit een externe cache op het LAN. |
| Refresh | 8 | Vervult een verzoek door de server te gebruiken of een cache die niet de lokale cache is. |

## Zie ook

* Namespace [System::Net::Cache](../)
* Library [Aspose.Page for C++](../../)
