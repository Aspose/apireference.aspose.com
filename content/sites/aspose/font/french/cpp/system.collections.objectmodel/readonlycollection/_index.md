---
title: "Classe System::Collections::ObjectModel::ReadOnlyCollection"
linktitle: "ReadOnlyCollection"
second_title: "Aspose.Font pour C++"
description: "Classe System::Collections::ObjectModel::ReadOnlyCollection. Enveloppe un conteneur spécifique pour y accéder en mode lecture seule. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject() fonction. Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 300
url: /fr/cpp/system.collections.objectmodel/readonlycollection/
---
## ReadOnlyCollection class


Enveloppe un conteneur spécifique pour y accéder en mode lecture seule. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/) fonction. Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
template<typename T>class ReadOnlyCollection : public virtual System::Object,
                                               public System::Collections::Generic::IList<T>
```


| Paramètre | Description |
| --- | --- |
| T | Type d'élément. |
## Méthodes

| Méthode | Description |
| --- | --- |
| [Contains](./contains/)(const T\&) const override | Vérifie si le conteneur contient un élément spécifique. |
| [CopyTo](./copyto/)(System::ArrayPtr\<T\>, int) override | Copie les éléments du conteneur vers des éléments de tableau existants. |
| [get_Count](./get_count/)() const override | Obtient le nombre d'éléments du conteneur. |
| [get_IsReadOnly](./get_isreadonly/)() const override | Vérifie si la collection est en lecture seule. |
| [GetEnumerator](./getenumerator/)() override | Obtient l'énumérateur de la collection. |
| [idx_get](./idx_get/)(int) const override | Obtient l'élément à une position spécifique. |
| [IndexOf](./indexof/)(const T\&) const override | Recherche un élément spécifique dans la collection. |
| [ReadOnlyCollection](./readonlycollection/)(const SharedPtr\<Generic::IList\<T\>\>\&) | Enveloppe une collection en lecture seule autour d'une collection spécifique. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Ne fait rien car la collection en lecture seule se contente d'envelopper les données et ne stocke rien. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Obtient l'implémentation de l'itérateur const begin pour le conteneur actuel. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Obtient l'implémentation de l'itérateur begin pour le conteneur actuel. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Obtient l'implémentation de l'itérateur const end pour le conteneur actuel. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Obtient l'implémentation de l'itérateur end pour le conteneur actuel. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [BaseType](./basetype/) | Interface implémentée. |
| [IEnumeratorPtr](./ienumeratorptr/) | Conteneur d'éléments identiques. |
| [ValueType](./valuetype/) | Type valeur. |

## Voir aussi

* Class [Object](../../system/object/)
* Class [IList](../../system.collections.generic/ilist/)
* Namespace [System::Collections::ObjectModel](../)
* Library [Aspose.Font for C++](../../)
