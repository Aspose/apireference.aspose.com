---
title: "System::Text::RegularExpressions::GroupCollection classe"
linktitle: "GroupCollection"
second_title: "Aspose.Page pour C++"
description: "Classe System::Text::RegularExpressions::GroupCollection. Liste des groupes de capture dans une correspondance unique. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 400
url: /fr/cpp/system.text.regularexpressions/groupcollection/
---
## GroupCollection class


Liste des groupes de capture dans une correspondance unique. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class GroupCollection : public System::Collections::Generic::List<GroupPtr>
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Add](./add/)(const GroupPtr\&) override | Désactive l'ajout d'éléments dans la collection. |
| [AddGroup](./addgroup/)(const GroupPtr\&) | Ajoute un groupe dans la collection. |
| [Clear](./clear/)() override | Désactive la suppression d'éléments de la collection. |
| [get_Item](./get_item/)(int) const | [Group](../group/) accesseur. |
| [get_Item](./get_item/)(const String\&) const | [Group](../group/) accesseur. |
| [GroupCollection](./groupcollection/)(const WeakPtr\<Match\>\&) | Constructeur. |
| virtual [idx_get](./idx_get/)(String) const | [Group](../group/) accesseur. |
| [idx_get](./idx_get/)(int) const override | [Group](../group/) accesseur. |
| [IsReadOnly](./isreadonly/)() const | Marque la collection comme lecture seule. |
| [operator[]](./operator[]/)(const String\&) const | [Group](../group/) accesseur. |
| [operator[]](./operator[]/)(int) | [Group](../group/) accesseur. |
| [operator[]](./operator[]/)(int) const | [Group](../group/) accesseur. |
| [Remove](./remove/)(const GroupPtr\&) override | Désactive la suppression d'un élément de la collection. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [Base](./base/) | Classe [Base](./base/). |
## Voir aussi

* Class [List](../../system.collections.generic/list/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Page for C++](../../)
