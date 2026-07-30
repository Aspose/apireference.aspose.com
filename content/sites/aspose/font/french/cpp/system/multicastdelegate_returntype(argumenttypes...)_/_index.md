---
title: "Classe System::MulticastDelegate< ReturnType(ArgumentTypes...)>"
linktitle: "MulticastDelegate< ReturnType(ArgumentTypes...)>"
second_title: "Aspose.Font pour C++"
description: "Classe System::MulticastDelegate< ReturnType(ArgumentTypes...)>. Représente une collection de délégués. Ce type doit être alloué sur la pile et passé aux fonctions par valeur ou par référence. N’utilisez jamais la classe System::SmartPtr pour gérer les objets de ce type en C++."
type: docs
weight: 4500
url: /fr/cpp/system/multicastdelegate_returntype(argumenttypes...)_/
---
## MulticastDelegate< ReturnType(ArgumentTypes...)> class


Représente une collection de délégués. Ce type doit être alloué sur la pile et passé aux fonctions par valeur ou par référence. N’utilisez jamais la classe [System::SmartPtr](../smartptr/) pour gérer les objets de ce type.

```cpp
template<class ReturnType,class...>class MulticastDelegate< ReturnType(ArgumentTypes...)> : public System::Details::DelegateHoldingVariables
```


| Paramètre | Description |
| --- | --- |
| ReturnType | Type de retour des entités invoquables pointées par chaque délégué de la collection |
| ArgumentTypes | Liste d’arguments des entités invoquables pointées par chaque délégué de la collection |
## Méthodes

| Méthode | Description |
| --- | --- |
| [BeginInvoke](./begininvoke/)(ArgumentTypes..., const AsyncCallback\&, const CallbackArgumentType\&) | NON IMPLEMENTÉ. |
| [connect](./connect/)(Callback) | Ajoute le délégué spécifié à la collection. |
| [connect](./connect/)(std::function\<R(Args...)>) | Ajoute l'objet fonction spécifié à la collection de délégués. L'objet fonction est converti en type de délégué [Callback](./callback/) avant d'être ajouté à la collection. |
| [connect](./connect/)(MulticastDelegate\&) | Ajoute l'objet MulticastDelegate spécifié à la collection de délégués. |
| [connect](./connect/)(MemberType ClassType::*, ClassType *) | Ajoute la méthode non statique spécifiée de l'objet spécifié à la collection de délégués. |
| [connect](./connect/)(MemberType ClassType::*, const SharedPtr\<ClassType\>\&) | Ajoute la méthode non statique spécifiée de l'objet spécifié à la collection de délégués. |
| [disconnect](./disconnect/)(Callback) | Supprime le délégué spécifié de la collection de délégués. |
| [disconnect](./disconnect/)(MemberType ClassType::*, ClassType *) | Supprime la méthode non statique spécifiée de l'objet spécifié de la collection de délégués. |
| [disconnect](./disconnect/)(MemberType ClassType::*, const SharedPtr\<ClassType\>\&) | Supprime la méthode non statique spécifiée de l'objet spécifié de la collection de délégués. |
| [disconnect](./disconnect/)(MulticastDelegate\&) | Supprime l'objet MulticastDelegate spécifié de la collection de délégués. |
| [disconnect_all_slots](./disconnect_all_slots/)() | Supprime tous les délégués de la collection de délégués. |
| [empty](./empty/)() const | Détermine si la collection de délégués est vide. |
| [EndInvoke](./endinvoke/)(const SharedPtr\<IAsyncResult\>\&) | NON IMPLEMENTÉ. |
| [Equals](./equals/)(const MulticastDelegate\&) |  |
| [GetHashCode](./gethashcode/)() const |  |
| [GetType](./gettype/)() const |  |
| [invoke](./invoke/)(ArgumentTypes...) const | Exécute tous les délégués actuellement présents dans la collection de délégués. Les délégués sont exécutés dans le même ordre que celui dans lequel ils ont été ajoutés à la collection. La méthode se bloque pendant l'exécution des délégués. |
| [IsNull](./isnull/)() const | Détermine si la collection de délégués est vide. |
| [MulticastDelegate](./multicastdelegate/)() | Construit une collection vide. |
| [MulticastDelegate](./multicastdelegate/)(std::nullptr_t) | Équivalent au constructeur par défaut. |
| [MulticastDelegate](./multicastdelegate/)(const MulticastDelegate\&) | Effectue une copie superficielle de la collection de délégués. |
| [MulticastDelegate](./multicastdelegate/)(MulticastDelegate\&&) | Constructeur de déplacement. |
| [MulticastDelegate](./multicastdelegate/)(Callback\&&) | Construit une instance et ajoute le délégué spécifié à la collection de délégués. |
| [MulticastDelegate](./multicastdelegate/)(T) | Construit une instance et ajoute la valeur spécifiée à la collection de délégués. |
| [MulticastDelegate](./multicastdelegate/)(std::function\<ReturnType(ArgumentTypes...)>) | Construit une instance et ajoute la valeur spécifiée à la collection de délégués. |
| [operator!=](./operator!=/)(const std::nullptr_t\&) const | Détermine si la collection de délégués n'est pas vide. |
| [operator!=](./operator!=/)(const MulticastDelegate\&) const | Détermine si deux instances de MulticastDelegate - l'objet actuel et l'objet spécifié - sont inégales. |
| [operator()](./operator()/)(ArgumentTypes...) const | Exécute tous les délégués actuellement présents dans la collection de délégués. Les délégués sont exécutés dans le même ordre que celui dans lequel ils ont été ajoutés à la collection. L'opérateur se bloque pendant l'exécution des délégués. |
| [operator+=](./operator+=/)(Callback) | Ajoute le délégué spécifié à la collection. |
| [operator-=](./operator-=/)(Callback) | Supprime le délégué spécifié de la collection de délégués. |
| [operator=](./operator=/)(const MulticastDelegate\&) | Assigne la collection de délégués représentée par l'objet spécifié à l'objet actuel. En conséquence, les deux objets pointent vers la même collection de délégués. |
| [operator=](./operator=/)(MulticastDelegate\&&) | Opérateur d'affectation de déplacement. |
| [operator==](./operator==/)(const std::nullptr_t\&) const | Détermine si la collection de délégués est vide. |
| [operator==](./operator==/)(const MulticastDelegate\&) const | Détermine si deux instances de MulticastDelegate - l'objet actuel et l'objet spécifié - sont égales. |
| [remove_empty_callbacks](./remove_empty_callbacks/)() const | Nettoie les rappels contenus qui sont vides (ne déclenchant en fait rien). |
| [ToString](./tostring/)() const |  |
| static [Type](./type/)() | Renvoie une référence à l'objet [TypeInfo](../typeinfo/) représentant les informations de type de la classe MulticastDelegate. |
| [~MulticastDelegate](./~multicastdelegate/)() | Destructeur. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [Callback](./callback/) | Le type des délégués représentés par la classe MulticastDelegate. |

## Voir aussi

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
