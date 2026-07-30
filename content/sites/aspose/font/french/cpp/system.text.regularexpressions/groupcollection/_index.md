---
title: "classe System::Text::RegularExpressions::GroupCollection"
linktitle: "GroupCollection"
second_title: "Aspose.Font pour C++"
description: "Classe System::Text::RegularExpressions::GroupCollection. Liste des groupes de capture dans une correspondance unique. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour la transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 400
url: /fr/cpp/system.text.regularexpressions/groupcollection/
---
## GroupCollection class


Liste des groupes de capture dans une correspondance unique. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument.

```cpp
class GroupCollection : public System::Collections::Generic::List<GroupPtr>
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Add](./add/)(const GroupPtr\&) override | Désactive l'ajout d'éléments à la collection. |
| [AddGroup](./addgroup/)(const GroupPtr\&) | Ajoute un groupe à la collection. |
| [Clear](./clear/)() override | Désactive la suppression d'éléments de la collection. |
| [get_Item](./get_item/)(int) const | Accesseur [Group](../group/). |
| [get_Item](./get_item/)(const String\&) const | Accesseur [Group](../group/). |
| [GroupCollection](./groupcollection/)(const WeakPtr\<Match\>\&) | Constructeur. |
| virtual [idx_get](./idx_get/)(String) const | Accesseur [Group](../group/). |
| [idx_get](./idx_get/)(int) const override | Accesseur [Group](../group/). |
| [IsReadOnly](./isreadonly/)() const | Marque la collection comme en lecture seule. |
| [operator[]](./operator[]/)(const String\&) const | Accesseur [Group](../group/). |
| [operator[]](./operator[]/)(int) | Accesseur [Group](../group/). |
| [operator[]](./operator[]/)(int) const | Accesseur [Group](../group/). |
| [Remove](./remove/)(const GroupPtr\&) override | Désactive la suppression d'un élément de la collection. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [Base](./base/) | [Base](./base/) classe. |
## Voir aussi

* Class [List](../../system.collections.generic/list/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Font for C++](../../)
