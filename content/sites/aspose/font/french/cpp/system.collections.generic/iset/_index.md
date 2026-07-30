---
title: "System::Collections::Generic::ISet classe"
linktitle: "ISet"
second_title: "Aspose.Font pour C++"
description: "System::Collections::Generic::ISet classe. Interface d'une collection contenant un ensemble d'éléments uniques. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 2700
url: /fr/cpp/system.collections.generic/iset/
---
## ISet class


Interface d'une collection contenant un ensemble d'éléments uniques. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
template<typename T>class ISet : public System::Collections::Generic::ICollection<T>
```


| Paramètre | Description |
| --- | --- |
| T | Type d'élément. |
## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [ExceptWith](./exceptwith/)(IEnumerablePtr) | Supprime un groupe d'éléments. |
| virtual [IntersectWith](./intersectwith/)(IEnumerablePtr) | Supprime les éléments qui ne sont pas présents dans un autre conteneur. |
| virtual [IsProperSubsetOf](./ispropersubsetof/)(IEnumerablePtr) | Vérifie si l'ensemble actuel est un sous-ensemble strict d'un autre conteneur. |
| virtual [IsProperSupersetOf](./ispropersupersetof/)(IEnumerablePtr) | Vérifie si l'ensemble actuel est un sur-ensemble strict d'un autre conteneur. |
| virtual [IsSubsetOf](./issubsetof/)(IEnumerablePtr) | Vérifie si l'ensemble actuel est un sous-ensemble d'un autre conteneur. |
| virtual [IsSupersetOf](./issupersetof/)(IEnumerablePtr) | Vérifie si l'ensemble actuel est un sur-ensemble d'un autre conteneur. |
| virtual [Overlaps](./overlaps/)(IEnumerablePtr) | Vérifie si l'ensemble se chevauche avec un autre conteneur. |
| virtual [SetEquals](./setequals/)(IEnumerablePtr) | Vérifie si l'ensemble et le conteneur contiennent les mêmes éléments. |
| virtual [SymmetricExceptWith](./symmetricexceptwith/)(IEnumerablePtr) | Calcule l'exception symétrique de deux conteneurs. Supprime tous les éléments présents dans les deux conteneurs, mais ajoute en même temps tous les éléments présents dans **other**, mais pas dans l'ensemble actuel. |
| virtual [UnionWith](./unionwith/)(IEnumerablePtr) | Ajoute les éléments de la collection spécifiée qui ne sont pas encore présents dans l'ensemble actuel. |
| virtual [~ISet](./~iset/)() | Destructeur. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [IEnumerablePtr](./ienumerableptr/) | Informations RTTI. |

## Voir aussi

* Class [ICollection](../icollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
