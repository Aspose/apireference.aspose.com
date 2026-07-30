---
title: "Classe System::Globalization::SortVersion"
linktitle: "SortVersion"
second_title: "Aspose.Font pour C++"
description: "Classe System::Globalization::SortVersion. Fournit des informations sur la version Unicode utilisée pour comparer et ordonner les chaînes. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject() . Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 2300
url: /fr/cpp/system.globalization/sortversion/
---
## SortVersion class


Fournit des informations sur la version Unicode utilisée pour comparer et ordonner les chaînes. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/) . Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class SortVersion : public System::IEquatable<SharedPtr<SortVersion>>
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Equals](./equals/)(SharedPtr\<SortVersion\>) override | Vérifie si l'instance actuelle de [SortVersion](./) est égale à l'objet [SortVersion](./) spécifié. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Vérifie si l'instance actuelle de [SortVersion](./) est égale à l'objet [SortVersion](./) spécifié. |
| [get_FullVersion](./get_fullversion/)() | Obtient le numéro complet de la version. |
| [get_SortId](./get_sortid/)() | Obtient l'identifiant unique de cet objet. |
| [GetHashCode](./gethashcode/)() const override | Obtient le code de hachage de l'objet actuel. |
| [operator!=](./operator!=/)(const SortVersion\&) | Vérifie si l'instance actuelle de [SortVersion](./) n'est pas égale à un objet [SortVersion](./) spécifié. |
| [operator=](./operator=/)(const SortVersion\&) |  |
| [operator==](./operator==/)(const SortVersion\&) | Vérifie si l'instance actuelle de [SortVersion](./) est égale à l'objet [SortVersion](./) spécifié. |
| [SortVersion](./sortversion/)(int, const Guid\&) | Informations RTTI. |
| [SortVersion](./sortversion/)(const SortVersion\&) |  |
## Voir aussi

* Class [IEquatable](../../system/iequatable/)
* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)
