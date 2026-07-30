---
title: "classe System::Net::CookieCollection"
linktitle: "CookieCollection"
second_title: "Aspose.Font pour C++"
description: "Classe System::Net::CookieCollection. Représente une liste de cookies triés. Les objets de cette classe ne doivent être alloués qu'à l'aide de la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour la transmettre aux fonctions en argument en C++."
type: docs
weight: 200
url: /fr/cpp/system.net/cookiecollection/
---
## CookieCollection class


Représente une liste de cookies triés. Les objets de cette classe ne doivent être alloués qu'à l'aide de la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour la transmettre aux fonctions en argument.

```cpp
class CookieCollection : public System::Collections::Generic::ICollection<System::SharedPtr<System::Net::Cookie>>
```

## Enums

| Énumération | Description |
| --- | --- |
| [Stamp](./stamp/) | Informations RTTI. |
## Méthodes

| Méthode | Description |
| --- | --- |
| [Add](./add/)(const System::SharedPtr\<Cookie\>\&) override | Ajoute un cookie à la collection. |
| [Add](./add/)(System::SharedPtr\<CookieCollection\>) | Ajoute des cookies de la collection spécifiée à celle actuelle. |
| [Clear](./clear/)() override | Supprime tous les cookies de la collection. |
| [Contains](./contains/)(const System::SharedPtr\<Cookie\>\&) const override | Vérifie si la collection contient le cookie spécifié. |
| [CookieCollection](./cookiecollection/)() | Construit une nouvelle instance. |
| [get_Count](./get_count/)() const override | Obtient le nombre d'éléments dans la collection. |
| [get_IsOtherVersionSeen](./get_isotherversionseen/)() | Renvoie une valeur indiquant si la collection contient un cookie dont la version n'est pas égale à [Cookie::MaxSupportedVersion](../cookie/maxsupportedversion/). |
| [GetEnumerator](./getenumerator/)() override | Obtient l'énumérateur. |
| [idx_get](./idx_get/)(int32_t) | Renvoie un cookie de la collection de cookies à l'index spécifié. |
| [idx_get](./idx_get/)(String) | Renvoie un cookie de la collection de cookies par le nom spécifié. |
| [IndexOf](./indexof/)(System::SharedPtr\<Cookie\>) | Renvoie l'index du cookie spécifié. |
| [InternalAdd](./internaladd/)(System::SharedPtr\<Cookie\>, bool) | Ajoute le cookie spécifié à la collection. |
| [Remove](./remove/)(const System::SharedPtr\<Cookie\>\&) override | Supprime le cookie spécifié de la collection. |
| [RemoveAt](./removeat/)(int32_t) | Supprime un cookie à l'index spécifié. |
| [TimeStamp](./timestamp/)(CookieCollection::Stamp) | Met à jour l'horodatage selon le scénario spécifié et renvoie une nouvelle valeur. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Obtient l'implémentation de l'itérateur const begin pour le conteneur actuel. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Obtient l'implémentation de l'itérateur begin pour le conteneur actuel. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Obtient l'implémentation de l'itérateur const end pour le conteneur actuel. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Obtient l'implémentation de l'itérateur end pour le conteneur actuel. |
## Voir aussi

* Class [ICollection](../../system.collections.generic/icollection/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
