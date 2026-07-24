---
title: "System::Net::Cache::RequestCacheLevel enum"
linktitle: "RequestCacheLevel"
second_title: "Aspose.Page voor C++"
description: "System::Net::Cache::RequestCacheLevel enum. De enum beschrijft cache‑instellingen die van toepassing zijn op elke WebRequest in C++."
type: docs
weight: 500
url: /nl/cpp/system.net.cache/requestcachelevel/
---
## RequestCacheLevel enum


De enum beschrijft cache‑instellingen die van toepassing zijn op elke [WebRequest](../../system.net/webrequest/).

```cpp
enum class RequestCacheLevel
```

### Waarden

| Naam | Waarde | Beschrijving |
| --- | --- | --- |
| Default | 0 | Vervult een verzoek voor een bron door ofwel de gecachte kopie van de bron te gebruiken of door een verzoek voor de bron naar de server te sturen. |
| BypassCache | 1 | Vervult een verzoek door de server te gebruiken. Er worden geen items uit de cache gehaald. |
| CacheOnly | 2 | Vervult een verzoek voor een bron uitsluitend vanuit de cache. [WebException](../../system.net/webexception/) wordt gegooid wanneer een bron niet in de clientcache aanwezig is. |
| CacheIfAvailable | 3 | Voldoet aan een verzoek om een bron uit de cache als de bron beschikbaar is, anders wordt een verzoek naar de server gestuurd. |
| Revalideren | 4 | Een lokale kopie van een bron gebruiken als de client-tijdstempel gelijk is aan de tijdstempel van de bron op de server. Anders wordt de bron van een server gedownload. |
| Herladen | 5 | Een bron wordt altijd van de server gedownload. |
| NoCacheNoStore | 6 | Voldoet nooit aan een verzoek door bronnen uit de cache te gebruiken en cachet geen bronnen. |

## Zie ook

* Namespace [System::Net::Cache](../)
* Library [Aspose.Page for C++](../../)
