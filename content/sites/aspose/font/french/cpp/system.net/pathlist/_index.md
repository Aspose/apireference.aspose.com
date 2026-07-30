---
title: "classe System::Net::PathList"
linktitle: "PathList"
second_title: "Aspose.Font pour C++"
description: "Classe System::Net::PathList. Représente la liste des instances de la classe CookieCollection. Les objets de cette classe ne doivent être alloués qu'à l'aide de la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour la transmettre aux fonctions en argument en C++."
type: docs
weight: 3000
url: /fr/cpp/system.net/pathlist/
---
## PathList class


Représente la liste des instances de la classe [CookieCollection](../cookiecollection/). Les objets de cette classe ne doivent être alloués qu'à l'aide de la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour la transmettre aux fonctions en argument.

```cpp
class PathList : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| static [Create](./create/)() | Crée une nouvelle instance. |
| [get_Count](./get_count/)() const | Renvoie le nombre d'éléments. |
| [get_SyncRoot](./get_syncroot/)() const | Renvoie l'objet à travers lequel la collection est synchronisée. |
| [GetCookiesCount](./getcookiescount/)() | Renvoie le nombre de cookies de tous les éléments de la collection. |
| [GetEnumerator](./getenumerator/)() | Renvoie l'énumérateur de la collection actuelle. |
| [idx_get](./idx_get/)(String) | Obtient la collection de cookies par le chemin spécifié. |
| [idx_set](./idx_set/)(String, System::SharedPtr\<CookieCollection\>) | Définit la collection de cookies par le chemin spécifié. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
