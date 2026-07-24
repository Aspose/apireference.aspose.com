---
title: "System::Net::Cache::RequestCacheLevel enum"
linktitle: "RequestCacheLevel"
second_title: "Aspose.Page pour C++"
description: "System::Net::Cache::RequestCacheLevel enum. L'énum décrit les paramètres de cache applicables à toute WebRequest en C++."
type: docs
weight: 500
url: /fr/cpp/system.net.cache/requestcachelevel/
---
## RequestCacheLevel enum


L'énum décrit les paramètres de cache applicables à toute [WebRequest](../../system.net/webrequest/).

```cpp
enum class RequestCacheLevel
```

### Valeurs

| Nom | Valeur | Description |
| --- | --- | --- |
| Default | 0 | Satisfait une requête pour une ressource soit en utilisant la copie mise en cache de la ressource, soit en envoyant une requête pour la ressource au serveur. |
| BypassCache | 1 | Satisfait une requête en utilisant le serveur. Aucune entrée n'est prise dans le cache. |
| CacheOnly | 2 | Satisfait une requête pour une ressource uniquement à partir du cache. [WebException](../../system.net/webexception/) sera levée lorsqu'une ressource n'est pas dans le cache client. |
| CacheIfAvailable | 3 | Satisfait une requête pour une ressource depuis le cache si la ressource est disponible, sinon envoie une requête au serveur. |
| Revalider | 4 | Utilise une copie locale d’une ressource si l’horodatage du client est identique à celui de la ressource sur le serveur. Sinon, la ressource est téléchargée depuis un serveur. |
| Recharger | 5 | Une ressource est toujours téléchargée depuis le serveur. |
| NoCacheNoStore | 6 | Ne satisfait jamais une requête en utilisant des ressources du cache et ne met pas en cache les ressources. |

## Voir aussi

* Namespace [System::Net::Cache](../)
* Library [Aspose.Page for C++](../../)
