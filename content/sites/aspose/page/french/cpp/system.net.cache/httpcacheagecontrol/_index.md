---
title: "System::Net::Cache::HttpCacheAgeControl enum"
linktitle: "HttpCacheAgeControl"
second_title: "Aspose.Page pour C++"
description: "System::Net::Cache::HttpCacheAgeControl enum. CacheAgeControl est utilisé pour spécifier les préférences concernant l'âge et la fraîcheur des éléments mis en cache en C++."
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
| None | 0 | Pour usage interne uniquement. |
| MinFresh | 1 | Le contenu peut être récupéré du cache si le temps restant avant l'expiration est supérieur ou égal au temps spécifié avec cette valeur. |
| MaxAge | 2 | Le contenu peut être pris du cache tant qu'il n'est pas plus ancien que l'âge spécifié avec cette valeur. |
| MaxStale | 4 | Le contenu peut être pris du cache après son expiration jusqu'à ce que le délai spécifié avec cette valeur s'écoule. |
| MaxAgeAndMinFresh | 3 | MaxAge et MinFresh. |
| MaxAgeAndMaxStale | 6 | MaxAge et MaxStale. |

## Voir aussi

* Namespace [System::Net::Cache](../)
* Library [Aspose.Page for C++](../../)
