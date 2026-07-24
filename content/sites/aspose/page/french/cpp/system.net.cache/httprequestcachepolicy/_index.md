---
title: "System::Net::Cache::HttpRequestCachePolicy class"
linktitle: "HttpRequestCachePolicy"
second_title: "Aspose.Page pour C++"
description: "Classe System::Net::Cache::HttpRequestCachePolicy. Politique de cache HTTP qui exprime la sémantique de mise en cache HTTP RFC2616. Les objets de cette classe ne doivent être alloués qu’en utilisant la fonction System::MakeObject(). Ne créez jamais d’instance de ce type sur la pile ou avec l’opérateur new, car cela entraînera des erreurs d’exécution et/ou des échecs d’assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le transmettre aux fonctions en tant qu’argument en C++."
type: docs
weight: 100
url: /fr/cpp/system.net.cache/httprequestcachepolicy/
---
## HttpRequestCachePolicy class


Politique de cache HTTP qui exprime la sémantique de mise en cache HTTP RFC2616. Les objets de cette classe ne doivent être alloués qu’en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d’instance de ce type sur la pile ou avec l’opérateur new, car cela entraînera des erreurs d’exécution et/ou des échecs d’assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en tant qu’argument.

```cpp
class HttpRequestCachePolicy : public System::Net::Cache::RequestCachePolicy
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_CacheSyncDate](./get_cachesyncdate/)() const | Obtient l’heure à laquelle les ressources stockées dans le cache doivent être revalidées. |
| [get_InternalCacheSyncDateUtc](./get_internalcachesyncdateutc/)() const | Obtient l’heure au format UTC à laquelle les ressources stockées dans le cache doivent être revalidées. Usage interne uniquement. |
| [get_Level](./get_level/)() const | Informations RTTI. |
| [get_MaxAge](./get_maxage/)() const | Obtient l’âge maximal autorisé pour une ressource. |
| [get_MaxStale](./get_maxstale/)() const | Obtient la valeur maximale d’obsolescence autorisée pour une ressource. |
| [get_MinFresh](./get_minfresh/)() const | Obtient l’âge minimal autorisé pour une ressource. |
| [HttpRequestCachePolicy](./httprequestcachepolicy/)() | Construit une nouvelle instance. |
| [HttpRequestCachePolicy](./httprequestcachepolicy/)(HttpRequestCacheLevel) | Construit une nouvelle instance. |
| [HttpRequestCachePolicy](./httprequestcachepolicy/)(HttpCacheAgeControl, TimeSpan) | Construit une nouvelle instance. |
| [HttpRequestCachePolicy](./httprequestcachepolicy/)(HttpCacheAgeControl, TimeSpan, TimeSpan) | Construit une nouvelle instance. |
| [HttpRequestCachePolicy](./httprequestcachepolicy/)(DateTime) | Construit une nouvelle instance. |
| [HttpRequestCachePolicy](./httprequestcachepolicy/)(HttpCacheAgeControl, TimeSpan, TimeSpan, DateTime) | Construit une nouvelle instance. |
| [ToString](./tostring/)() const override | Analogue de la méthode C# [Object.ToString()](../../system/object/tostring/). Permet de convertir des objets personnalisés en chaîne. |
## Voir aussi

* Class [RequestCachePolicy](../requestcachepolicy/)
* Namespace [System::Net::Cache](../)
* Library [Aspose.Page for C++](../../)
