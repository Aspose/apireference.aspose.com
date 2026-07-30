---
title: "System::Net::Cache::HttpRequestCacheLevel Enum"
linktitle: "HttpRequestCacheLevel"
second_title: "Aspose.Font für C++"
description: "System::Net::Cache::HttpRequestCacheLevel Enum. Das Enum beschreibt die Cache-Einstellungen für HTTP in C++."
type: docs
weight: 400
url: /de/cpp/system.net.cache/httprequestcachelevel/
---
## HttpRequestCacheLevel enum


Die Aufzählung beschreibt Cache-Einstellungen für HTTP.

```cpp
enum class HttpRequestCacheLevel
```

### Werte

| Name | Wert | Beschreibung |
| --- | --- | --- |
| Standard | 0 | Erfüllt eine Anforderung für eine Ressource entweder durch Verwendung der zwischengespeicherten Kopie der Ressource oder durch Senden einer Anforderung für die Ressource an den Server. |
| BypassCache | 1 | Erfüllt eine Anforderung, indem der Server verwendet wird. |
| CacheOnly | 2 | Verwendet immer den Client-Cache, um eine Ressource zu erhalten. |
| CacheIfAvailable | 3 | Erfüllt eine Anforderung für eine Ressource aus dem Cache, wenn die Ressource verfügbar ist, andernfalls wird eine Anforderung an den Server gesendet. |
| Revalidate | 4 | Verwendung einer lokalen Kopie einer Ressource, wenn der Client-Zeitstempel mit dem Zeitstempel der Ressource auf dem Server übereinstimmt. Andernfalls wird die Ressource von einem Server heruntergeladen. |
| Reload | 5 | Eine Ressource wird immer vom Server heruntergeladen. |
| NoCacheNoStore | 6 | Erfüllt niemals eine Anforderung, indem Ressourcen aus dem Cache verwendet werden, und cached keine Ressourcen. |
| CacheOrNextCacheOnly | 7 | Erfüllt eine Anforderung für eine Ressource entweder aus dem Cache des lokalen Computers oder aus einem entfernten Cache im LAN. |
| Aktualisieren | 8 | Erfüllt eine Anforderung, indem der Server oder ein anderer Cache als der lokale Cache verwendet wird. |

## Siehe auch

* Namespace [System::Net::Cache](../)
* Library [Aspose.Font for C++](../../)
