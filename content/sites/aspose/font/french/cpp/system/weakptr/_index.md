---
title: "System::WeakPtr classe"
linktitle: "WeakPtr"
second_title: "Aspose.Font pour C++"
description: "System::WeakPtr classe. Sous-classe de System::SmartPtr qui se place en mode faible lors de la construction. Veuillez noter que cette classe ne garantit pas que son instance restera toujours en mode faible car set_Mode() est toujours accessible. Ce type est un pointeur permettant de gérer la suppression d'un autre objet. Il doit être alloué sur la pile et passé aux fonctions soit par valeur, soit par référence constante en C++."
type: docs
weight: 7500
url: /fr/cpp/system/weakptr/
---
## WeakPtr class


Sous-classe de [System::SmartPtr](../smartptr/) qui se place en mode faible lors de la construction. Veuillez noter que cette classe ne garantit pas que son instance restera toujours en mode faible car [set_Mode()](../smartptr/set_mode/) est toujours accessible. Ce type est un pointeur permettant de gérer la suppression d'un autre objet. Il doit être alloué sur la pile et passé aux fonctions soit par valeur, soit par référence constante.

```cpp
template<class T>class WeakPtr : public System::SmartPtr<T>
```


| Paramètre | Description |
| --- | --- |
| T | Type pointeur. |
## Méthodes

| Méthode | Description |
| --- | --- |
| [expired](./expired/)() const | Vérifie si l'objet référencé a déjà été supprimé. |
| [get_weak](./get_weak/)() const | Obtient l'objet référencé. Vérifie que le pointeur est en mode faible. |
| [operator=](./operator=/)(Q\&&) | Assigne une valeur au pointeur faible. Appelle l'opérateur d'affectation spécifique de [SmartPtr_](./smartptr_/). |
| [operator==](./operator==/)(std::nullptr_t) const | Vérifie si le pointeur faible est nul. |
| [WeakPtr](./weakptr/)(std::nullptr_t) | Crée un pointeur nul. |
| [WeakPtr](./weakptr/)(Pointee_ *) | Crée un pointeur faible vers l'objet donné. |
| [WeakPtr](./weakptr/)(const SmartPtr_\&) | Crée un pointeur faible référencant le même pointeur que ptr pointe. |
| [WeakPtr](./weakptr/)(const SmartPtr\<Q\>\&) | Crée un pointeur faible référencant le même pointeur que x pointe. |
| [WeakPtr](./weakptr/)(const WeakPtr_\&) | Construit par copie le pointeur faible. |
| [WeakPtr](./weakptr/)(const WeakPtr\<Q\>\&) | Construit par copie le pointeur faible. |
| [WeakPtr](./weakptr/)(SmartPtr_\&&) | Construit par déplacement le pointeur faible. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [Pointee_](./pointee_/) | Type pointé. |
| [SmartPtr_](./smartptr_/) | Alias pour la classe [SmartPtr](../smartptr/) correspondante. |
| [WeakPtr_](./weakptr_/) | Alias pour le type lui-même. |

## Voir aussi

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
