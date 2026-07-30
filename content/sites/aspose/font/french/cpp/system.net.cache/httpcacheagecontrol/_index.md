---
title: "System::Net::Cache::HttpCacheAgeControl énum"
linktitle: "HttpCacheAgeControl"
second_title: "Aspose.Font pour C++"
description: "Énumération System::Net::Cache::HttpCacheAgeControl. CacheAgeControl est utilisé pour spécifier les préférences concernant l'âge et la fraîcheur des éléments mis en cache en C++."
type: docs
weight: 300
url: /fr/cpp/system.net.cache/httpcacheagecontrol/
---
## HttpCacheAgeControl enum


CacheAgeControl est utilisé pour spécifier les préférences concernant l'âge et la fraîcheur des éléments mis en cache.

```cpp
enum class HttpCacheAgeControl
```

### Valeurs

| Nom | Valeur | Description |
| --- | --- | --- |
| Aucun | 0 | À usage interne uniquement. |
| MinFresh | 1 | Le contenu peut être récupéré du cache si le temps restant avant expiration est supérieur ou égal au temps spécifié par cette valeur. |
| MaxAge | 2 | Le contenu peut être récupéré du cache tant qu'il n'est pas plus ancien que l'âge spécifié par cette valeur. |
| MaxStale | 4 | Le contenu peut être récupéré du cache après son expiration jusqu'à ce que le temps spécifié par cette valeur se soit écoulé. |
| MaxAgeAndMinFresh | 3 | MaxAge et MinFresh. |
| MaxAgeAndMaxStale | 6 | MaxAge et MaxStale. |

## Voir aussi

* Namespace [System::Net::Cache](../)
* Library [Aspose.Font for C++](../../)
