---
title: "Classe System::BoxedValue"
linktitle: "BoxedValue"
second_title: "Aspose.Font pour C++"
description: "Classe System::BoxedValue. Représente une valeur encapsulée. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 800
url: /fr/cpp/system/boxedvalue/
---
## BoxedValue class


Représente une valeur encapsulée. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument.

```cpp
template<class T>class BoxedValue : public System::BoxedValueBase
```


| Paramètre | Description |
| --- | --- |
| T | Type de la valeur encapsulée représentée par la classe |
## Méthodes

| Méthode | Description |
| --- | --- |
| [BoxedValue](./boxedvalue/)(const T\&) | Construit un objet qui représente la valeur spécifiée encapsulée. |
| [Equals](./equals/)(ptr) override | Détermine l'égalité des valeurs encapsulées représentées par les objets actuel et spécifié. |
| [GetHashCode](./gethashcode/)() const override | Renvoie un code de hachage pour l'objet actuel. |
| [GetType](./gettype/)() const override | Obtient le type réel de l'objet. |
| [GetTypeCode](./gettypecode/)() const override | Renvoie la valeur représentant le type de la valeur encapsulée représentée par l'objet actuel. |
| [GetUnsignedLongLongValue](./getunsignedlonglongvalue/)() const override | Renvoie la valeur numérique de l'objet encapsulé s'il peut être converti, zéro sinon. |
| [is](./is/)() const | Détermine si le type de la valeur encapsulée représentée par l'objet actuel est **V**. |
| [IsBoxedEnum](./isboxedenum/)() override | Détermine si l'objet actuel représente une valeur encapsulée de type énumération. |
| static [Parse](../boxedvaluebase/parse/)(const TypeInfo\&, const String\&, bool) | Encapsule la valeur du constant d'énumération de l'énumération spécifiée avec le nom spécifié. Un paramètre indique si la casse doit être ignorée lors de l'interprétation de la chaîne spécifiant le nom du constant d'énumération. |
| static [Parse](../boxedvaluebase/parse/)(const TypeInfo\&, const String\&) | Encapsule la valeur du constant d'énumération de l'énumération spécifiée avec le nom spécifié. |
| [ToString](./tostring/)() const override | Convertit la valeur encapsulée représentée par l'objet actuel en chaîne. |
| [ToString](../boxedvaluebase/tostring/)(const System::String\&) const | Convertit l'objet encapsulé en chaîne en utilisant la chaîne de format spécifiée. |
| [unbox](./unbox/)() const | Désencapsule la valeur représentée par l'objet actuel. |

## Voir aussi

* Class [BoxedValueBase](../boxedvaluebase/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
