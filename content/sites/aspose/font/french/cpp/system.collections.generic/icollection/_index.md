---
title: "classe System::Collections::Generic::ICollection"
linktitle: "ICollection"
second_title: "Aspose.Font pour C++"
description: "classe System::Collections::Generic::ICollection. Interface d'une collection d'éléments. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 1900
url: /fr/cpp/system.collections.generic/icollection/
---
## ICollection class


Interface d'une collection d'éléments. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
template<typename T>class ICollection : public virtual System::Collections::Generic::IEnumerable<T>
```

## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [Add](./add/)(const T\&) | Ajoute un élément à la collection. |
| virtual [Clear](./clear/)() | Supprime tous les éléments de la collection. |
| virtual [Contains](./contains/)(const T\&) const | Vérifie si l’élément est présent dans la collection. |
| virtual [CopyTo](./copyto/)(System::ArrayPtr\<T\>, int) | Copie tous les éléments de la collection dans les éléments existants du tableau. |
| virtual [get_Count](./get_count/)() const | Obtient le nombre d'éléments dans la collection. |
| virtual [get_IsReadOnly](./get_isreadonly/)() const | Vérifie si la collection est en lecture seule. |
| [get_SyncRoot](./get_syncroot/)() const | Obtient l'objet avec lequel la collection est synchronisée. |
| [ICollection](./icollection/)() | Constructeur par défaut. |
| [ICollection](./icollection/)(const ICollection\&) | Constructeur de copie. |
| [ICollection](./icollection/)(ICollection\&&) | Constructeur de déplacement. |
| [operator=](./operator=/)(ICollection\&&) | Opérateur d'affectation par déplacement. |
| [operator=](./operator=/)(const ICollection\&) | Opérateur d'affectation par déplacement. |
| virtual [Remove](./remove/)(const T\&) | Supprime l’élément de la collection. |
| virtual [~ICollection](./~icollection/)() | Destructeur. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [ThisType](./thistype/) | Nom du type de collection. |
| [ValueType](./valuetype/) | Informations RTTI. |

## Voir aussi

* Class [IEnumerable](../ienumerable/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
