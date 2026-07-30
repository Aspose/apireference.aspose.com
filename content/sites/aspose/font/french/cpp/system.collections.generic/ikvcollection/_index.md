---
title: "Classe System::Collections::Generic::IKVCollection"
linktitle: "IKVCollection"
second_title: "Aspose.Font pour C++"
description: "Classe System::Collections::Generic::IKVCollection. Interface d'un conteneur contenant les clés ou les valeurs d'un conteneur de type dictionnaire. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 2500
url: /fr/cpp/system.collections.generic/ikvcollection/
---
## IKVCollection class


Interface d'un conteneur contenant les clés ou les valeurs d'un conteneur de type dictionnaire. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument.

```cpp
template<typename T>class IKVCollection : public System::Collections::Generic::IList<T>
```


| Paramètre | Description |
| --- | --- |
| T | [KeyValuePair](../keyvaluepair/) type. |
## Méthodes

| Méthode | Description |
| --- | --- |
| [Add](./add/)(const T\&) override | Ajoute un élément au conteneur. |
| [Clear](./clear/)() override | Supprime tous les éléments du conteneur. |
| [Contains](./contains/)(const T\&) const override | Vérifie si l'élément est présent dans le conteneur. |
| virtual [get_Count](./get_count/)() const | Obtient le nombre d'éléments dans le conteneur. |
| [get_IsReadOnly](./get_isreadonly/)() const override | Vérifie si le conteneur est en lecture seule. |
| virtual [GetEnumerator](./getenumerator/)() | Informations RTTI. |
| virtual [idx_get](./idx_get/)(int) const | Fonction d'accès (getter). |
| [idx_set](./idx_set/)(int, T) override | Fonction de modification (setter). |
| [IndexOf](./indexof/)(const T\&) const override | Obtient l'index de l'élément dans le conteneur. |
| [Insert](./insert/)(int, const T\&) override | Insère l'élément à la position spécifiée. |
| [Remove](./remove/)(const T\&) override | Supprime l'élément du conteneur. |
| [RemoveAt](./removeat/)(int) override | Supprime l'élément à la position spécifiée. |

## Voir aussi

* Class [IList](../ilist/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
