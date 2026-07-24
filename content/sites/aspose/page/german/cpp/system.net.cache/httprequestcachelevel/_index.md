---
title: "System::Net::Cache::HttpRequestCacheLevel Enum"
linktitle: "HttpRequestCacheLevel"
second_title: "Aspose.Page für C++"
description: "System::Net::Cache::HttpRequestCacheLevel Enum. Das Enum beschreibt Cache‑Einstellungen für HTTP in C++."
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
| Default | 0 | Erfüllt eine Anforderung für eine Ressource entweder durch Verwendung der zwischengespeicherten Kopie der Ressource oder durch Senden einer Anforderung an den Server. |
| BypassCache | 1 | Erfüllt eine Anforderung, indem der Server verwendet wird. |
| CacheOnly | 2 | Verwendet stets den Client‑Cache, um eine Ressource zu erhalten. |
| CacheIfAvailable | 3 | Erfüllt eine Anforderung für eine Ressource aus dem Cache, wenn die Ressource verfügbar ist, andernfalls wird eine Anfrage an den Server gesendet. |
| Revalidieren | 4 | Verwendet eine lokale Kopie einer Ressource, wenn der Client-Zeitstempel mit dem Zeitstempel der Ressource auf dem Server übereinstimmt. Andernfalls wird die Ressource von einem Server heruntergeladen. |
| Neu laden | 5 | Eine Ressource wird immer vom Server heruntergeladen. |
| NoCacheNoStore | 6 | Erfüllt niemals eine Anforderung, indem Ressourcen aus dem Cache verwendet werden, und cached keine Ressourcen. |
| CacheOrNextCacheOnly | 7 | Erfüllt eine Anforderung für eine Ressource entweder aus dem Cache des lokalen Computers oder aus einem entfernten Cache im LAN. |
| Refresh | 8 | Erfüllt eine Anforderung, indem der Server oder ein anderer Cache als der lokale Cache verwendet wird. |

## Siehe auch

* Namespace [System::Net::Cache](../)
* Library [Aspose.Page for C++](../../)
