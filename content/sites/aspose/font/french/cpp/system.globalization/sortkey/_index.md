---
title: "System::Globalization::SortKey classe"
linktitle: "SortKey"
second_title: "Aspose.Font pour C++"
description: "Classe System::Globalization::SortKey. Mappage d'une chaîne à sa clé de tri. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 2200
url: /fr/cpp/system.globalization/sortkey/
---
## SortKey class


Mappage d'une chaîne à sa clé de tri. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument.

```cpp
class SortKey : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| static [Compare](./compare/)(const SortKeyPtr\&, const SortKeyPtr\&) | Compare deux clés de tri. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Vérifie si l'objet spécifié est égal à l'objet [SortKey](./) actuel. |
| virtual [get_KeyData](./get_keydata/)() | Obtient le tableau d'octets représentant l'objet actuel. |
| virtual [get_OriginalString](./get_originalstring/)() | Obtient la chaîne originale utilisée pour créer cet objet. |
| [GetHashCode](./gethashcode/)() const override | Obtient le code de hachage pour l'objet [SortKey](./) actuel. |
| [operator=](./operator=/)(const SortKey\&) |  |
| [SortKey](./sortkey/)(const SortKey\&) |  |
| [ToString](./tostring/)() const override | Convertit l'objet actuel en sa représentation sous forme de chaîne. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)
