---
title: "System::Net::Cache::RequestCacheLevel Enum"
linktitle: "RequestCacheLevel"
second_title: "Aspose.Font für C++"
description: "System::Net::Cache::RequestCacheLevel Enum. Das Enum beschreibt Cache-Einstellungen, die für jede WebRequest in C++ gelten."
type: docs
weight: 500
url: /de/cpp/system.net.cache/requestcachelevel/
---
## RequestCacheLevel enum


Das Enum beschreibt Cache-Einstellungen, die für jede [WebRequest](../../system.net/webrequest/) gelten.

```cpp
enum class RequestCacheLevel
```

### Werte

| Name | Wert | Beschreibung |
| --- | --- | --- |
| Standard | 0 | Erfüllt eine Anforderung für eine Ressource entweder durch Verwendung der zwischengespeicherten Kopie der Ressource oder durch Senden einer Anforderung für die Ressource an den Server. |
| BypassCache | 1 | Erfüllt eine Anforderung durch Verwendung des Servers. Es werden keine Einträge aus dem Cache übernommen. |
| CacheOnly | 2 | Erfüllt eine Anforderung für eine Ressource ausschließlich aus dem Cache. [WebException](../../system.net/webexception/) wird ausgelöst, wenn eine Ressource nicht im Client-Cache vorhanden ist. |
| CacheIfAvailable | 3 | Erfüllt eine Anforderung für eine Ressource aus dem Cache, wenn die Ressource verfügbar ist, andernfalls wird eine Anforderung an den Server gesendet. |
| Revalidate | 4 | Verwendung einer lokalen Kopie einer Ressource, wenn der Client-Zeitstempel mit dem Zeitstempel der Ressource auf dem Server übereinstimmt. Andernfalls wird die Ressource von einem Server heruntergeladen. |
| Reload | 5 | Eine Ressource wird immer vom Server heruntergeladen. |
| NoCacheNoStore | 6 | Erfüllt niemals eine Anforderung, indem Ressourcen aus dem Cache verwendet werden, und cached keine Ressourcen. |

## Siehe auch

* Namespace [System::Net::Cache](../)
* Library [Aspose.Font for C++](../../)
