---
title: "System::Net::Http::Headers::CacheControlHeaderValue classe"
linktitle: "CacheControlHeaderValue"
second_title: "Aspose.Font pour C++"
description: "System::Net::Http::Headers::CacheControlHeaderValue classe. Représente une valeur de l’en-tête ''Cache-Control''. Les objets de cette classe ne doivent être alloués qu’en utilisant la fonction System::MakeObject(). Ne créez jamais d’instance de ce type sur la pile ou en utilisant l’opérateur new, car cela entraînera des erreurs d’exécution et/ou des échecs d’assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu’argument en C++."
type: docs
weight: 200
url: /fr/cpp/system.net.http.headers/cachecontrolheadervalue/
---
## CacheControlHeaderValue class


Représente une valeur de l’en-tête 'Cache-Control'. Les objets de cette classe ne doivent être alloués qu’en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d’instance de ce type sur la pile ou en utilisant l’opérateur new, car cela entraînera des erreurs d’exécution et/ou des échecs d’assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu’argument.

```cpp
class CacheControlHeaderValue : public System::ICloneable
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [CacheControlHeaderValue](./cachecontrolheadervalue/)() | Construit une nouvelle instance. |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Compare les objets en utilisant la sémantique C# [Object.Equals](../../system/object/equals/). |
| [get_Extensions](./get_extensions/)() | Renvoie la collection des jetons d’extension de cache. |
| [get_MaxAge](./get_maxage/)() | Obtient la valeur d’âge maximale en secondes qui détermine une période pendant laquelle le client acceptera une réponse. |
| [get_MaxStale](./get_maxstale/)() | Obtient la valeur qui détermine si le client acceptera les réponses expirées. |
| [get_MaxStaleLimit](./get_maxstalelimit/)() | Obtient la valeur en secondes qui détermine la période pendant laquelle le client acceptera les réponses expirées. |
| [get_MinFresh](./get_minfresh/)() | Obtient la valeur qui détermine la durée de fraîcheur. |
| [get_MustRevalidate](./get_mustrevalidate/)() | Obtient la valeur qui détermine si le serveur nécessite une revalidation d'une entrée de cache lorsqu'elle devient obsolète. |
| [get_NoCache](./get_nocache/)() | Informations RTTI. |
| [get_NoCacheHeaders](./get_nocacheheaders/)() | Obtient la collection des noms de champs dans la directive 'no-cache' de l'en-tête 'Cache-Control'. |
| [get_NoStore](./get_nostore/)() | Obtient la valeur qui détermine si un cache ne doit stocker aucune partie d'une requête ou d'une réponse HTTP. |
| [get_NoTransform](./get_notransform/)() | Obtient la valeur qui détermine si un cache ou un proxy ne doit modifier aucune partie du corps de l'entité. |
| [get_OnlyIfCached](./get_onlyifcached/)() | Obtient la valeur qui détermine si le client doit n'utiliser que des entrées mises en cache. |
| [get_Private](./get_private/)() | Obtient la valeur qui détermine si le message de réponse HTTP ou une partie de celui-ci est destiné à un seul utilisateur et ne doit pas être mis en cache par un cache partagé. |
| [get_PrivateHeaders](./get_privateheaders/)() | Obtient la collection des noms de champs dans la directive 'private' de l'en-tête 'Cache-Control'. |
| [get_ProxyRevalidate](./get_proxyrevalidate/)() | Obtient la valeur qui détermine si le serveur nécessite une revalidation d'une entrée de cache lorsqu'elle devient obsolète pour les caches d'agents utilisateurs partagés. |
| [get_Public](./get_public/)() | Obtient la valeur qui détermine si une réponse HTTP peut être mise en cache par n'importe quel cache. |
| [get_SharedMaxAge](./get_sharedmaxage/)() | Obtient la valeur d'âge maximal partagé en secondes qui remplace la directive 'max-age' de l'en-tête 'Cache-Control' ou l'en-tête 'Expires' pour un cache partagé. |
| static [GetCacheControlLength](./getcachecontrollength/)(String, int32_t, System::SharedPtr\<CacheControlHeaderValue\>, System::SharedPtr\<CacheControlHeaderValue\>\&) | Convertit une chaîne passée à partir de l'index spécifié en une instance de la classe [CacheControlHeaderValue](./). |
| [GetHashCode](./gethashcode/)() const override | Analogue de la méthode C# [Object.GetHashCode()](../../system/object/gethashcode/) . Permet le hachage d'objets personnalisés. |
| static [Parse](./parse/)(String) | Convertit une chaîne passée en une instance de la classe [CacheControlHeaderValue](./). |
| [set_MaxAge](./set_maxage/)(Nullable\<TimeSpan\>) | Définit la valeur d'âge maximal en secondes qui détermine la période pendant laquelle le client acceptera une réponse. |
| [set_MaxStale](./set_maxstale/)(bool) | Définit la valeur qui détermine si le client acceptera les réponses expirées. |
| [set_MaxStaleLimit](./set_maxstalelimit/)(Nullable\<TimeSpan\>) | Définit la valeur en secondes qui détermine la durée pendant laquelle le client acceptera les réponses expirées. |
| [set_MinFresh](./set_minfresh/)(Nullable\<TimeSpan\>) | Définit la valeur qui détermine la durée de fraîcheur. |
| [set_MustRevalidate](./set_mustrevalidate/)(bool) | Définit la valeur qui détermine si le serveur nécessite une revalidation d'une entrée de cache lorsqu'elle devient obsolète. |
| [set_NoCache](./set_nocache/)(bool) | Définit la valeur qui détermine si le client acceptera une réponse mise en cache. |
| [set_NoStore](./set_nostore/)(bool) | Définit la valeur qui détermine si un cache ne doit stocker aucune partie d'une requête ou d'une réponse HTTP. |
| [set_NoTransform](./set_notransform/)(bool) | Définit la valeur qui détermine si un cache ou un proxy ne doit modifier aucune partie du corps de l'entité. |
| [set_OnlyIfCached](./set_onlyifcached/)(bool) | Définit la valeur qui détermine si le client doit n'utiliser que des entrées mises en cache. |
| [set_Private](./set_private/)(bool) | Définit la valeur qui détermine si le message de réponse HTTP ou une partie de celui-ci est destiné à un seul utilisateur et ne doit pas être mis en cache par un cache partagé. |
| [set_ProxyRevalidate](./set_proxyrevalidate/)(bool) | Définit la valeur qui détermine si le serveur nécessite une revalidation d'une entrée de cache lorsqu'elle devient obsolète pour les caches d'agents utilisateurs partagés. |
| [set_Public](./set_public/)(bool) | Définit la valeur qui détermine si une réponse HTTP peut être mise en cache par n'importe quel cache. |
| [set_SharedMaxAge](./set_sharedmaxage/)(Nullable\<TimeSpan\>) | Définit la valeur d'âge maximal partagé en secondes qui remplace la directive 'max-age' de l'en-tête 'Cache-Control' ou l'en-tête 'Expires' pour un cache partagé. |
| [ToString](./tostring/)() const override | Analogue de la méthode C# [Object.ToString()](../../system/object/tostring/). Permet de convertir des objets personnalisés en chaîne. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<CacheControlHeaderValue\>\&) | Essaie de convertir une chaîne passée en une instance de la classe [CacheControlHeaderValue](./). |
## Voir aussi

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
