---
title: "System::Net::Cache::HttpRequestCacheLevel énum"
linktitle: "HttpRequestCacheLevel"
second_title: "Aspose.Font pour C++"
description: "System::Net::Cache::HttpRequestCacheLevel énum. L'énum décrit les paramètres de cache pour HTTP en C++."
type: docs
weight: 400
url: /fr/cpp/system.net.cache/httprequestcachelevel/
---
## HttpRequestCacheLevel enum


L'énumération décrit les paramètres de cache pour HTTP.

```cpp
enum class HttpRequestCacheLevel
```

### Valeurs

| Nom | Valeur | Description |
| --- | --- | --- |
| Default | 0 | Satisfait une requête pour une ressource soit en utilisant la copie mise en cache de la ressource, soit en envoyant une requête pour la ressource au serveur. |
| BypassCache | 1 | Satisfait une requête en utilisant le serveur. |
| CacheOnly | 2 | Utilise toujours le cache client pour obtenir une ressource. |
| CacheIfAvailable | 3 | Satisfait une requête pour une ressource depuis le cache si la ressource est disponible, sinon envoie une requête au serveur. |
| Revalidate | 4 | Utilise une copie locale de la ressource si l'horodatage du client est identique à celui de la ressource sur le serveur. Sinon, la ressource est téléchargée depuis un serveur. |
| Reload | 5 | Une ressource est toujours téléchargée depuis le serveur. |
| NoCacheNoStore | 6 | Ne satisfait jamais une requête en utilisant des ressources du cache et ne met pas en cache les ressources. |
| CacheOrNextCacheOnly | 7 | Satisfait une requête pour une ressource soit depuis le cache de l'ordinateur local, soit depuis un cache distant sur le réseau local (LAN). |
| Actualiser | 8 | Satisfait une requête en utilisant le serveur ou un cache autre que le cache local. |

## Voir aussi

* Namespace [System::Net::Cache](../)
* Library [Aspose.Font for C++](../../)
