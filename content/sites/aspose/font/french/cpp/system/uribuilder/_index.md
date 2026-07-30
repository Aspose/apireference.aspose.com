---
title: "classe System::UriBuilder"
linktitle: "UriBuilder"
second_title: "Aspose.Font pour C++"
description: "classe System::UriBuilder. Fournit des méthodes pour créer et modifier les identificateurs de ressources universels (URI). Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject() . Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 6800
url: /fr/cpp/system/uribuilder/
---
## UriBuilder class


Fournit des méthodes pour créer et modifier les identificateurs de ressources universels (URI). Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../makeobject/) . Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument.

```cpp
class UriBuilder : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_Scheme](./get_scheme/)() const | Renvoie le schéma de l'URI construit par l'objet actuel. |
| [get_Uri](./get_uri/)() const | Renvoie l'objet [Uri](../uri/) construit par l'objet actuel. |
| [set_Port](./set_port/)(int) | Définit le numéro de port de l'URI. |
| [set_Scheme](./set_scheme/)(const String\&) | Définit le schéma de l'URI construit par l'objet actuel à la valeur spécifiée. |
| [ToString](./tostring/)() const override | Renvoie la représentation sous forme de chaîne de caractères de l'URI construit par l'objet actuel. |
| [UriBuilder](./uribuilder/)(const String\&) | Construit un objet [UriBuilder](./) qui représente l'URI spécifié. |
| [UriBuilder](./uribuilder/)(const SharedPtr\<Uri\>\&) | Construit un objet [UriBuilder](./) qui représente l'URI spécifié. |
## Voir aussi

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
