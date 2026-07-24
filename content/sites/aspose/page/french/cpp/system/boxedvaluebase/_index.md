---
title: "Classe System::BoxedValueBase"
linktitle: "BoxedValueBase"
second_title: "Aspose.Page pour C++"
description: "Classe System::BoxedValueBase. Une classe de base qui définit une interface et implémente certaines méthodes fondamentales d'une classe dérivée qui représente une valeur encapsulée. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne jamais créer d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Toujours envelopper cette classe dans un pointeur System::SmartPtr et utiliser ce pointeur pour la transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 900
url: /fr/cpp/system/boxedvaluebase/
---
## BoxedValueBase class


Une classe de base qui définit une interface et implémente certaines méthodes fondamentales d'une classe dérivée qui représente une valeur encapsulée. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../makeobject/). Ne jamais créer d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Toujours envelopper cette classe dans un pointeur [System::SmartPtr](../smartptr/) et utiliser ce pointeur pour la transmettre aux fonctions en tant qu'argument.

```cpp
class BoxedValueBase : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [GetTypeCode](./gettypecode/)() const | Renvoie la valeur représentant le type de la valeur encapsulée représentée par l'objet actuel. |
| virtual [GetUnsignedLongLongValue](./getunsignedlonglongvalue/)() const | Convertit la valeur encapsulée représentée par l'objet actuel en entier 64 bits. |
| virtual [IsBoxedEnum](./isboxedenum/)() | Détermine si l'objet actuel représente une valeur encapsulée de type enum. |
| static [Parse](./parse/)(const TypeInfo\&, const String\&, bool) | Encapsule la valeur de la constante d'énumération de l'énumération spécifiée avec le nom spécifié. Un paramètre indique si la casse doit être ignorée lors de l'interprétation de la chaîne spécifiant le nom de la constante d'énumération. |
| static [Parse](./parse/)(const TypeInfo\&, const String\&) | Encapsule la valeur de la constante d'énumération de l'énumération spécifiée avec le nom spécifié. |
| [ToString](./tostring/)(const System::String\&) const | Convertit l'objet encapsulé en chaîne en utilisant la chaîne de format spécifiée. |
| virtual [ToString](./tostring/)() const | Analogue de la méthode C# [Object.ToString()](../object/tostring/). Permet de convertir des objets personnalisés en chaîne. |
## Voir aussi

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
