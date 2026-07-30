---
title: "Classe System::ObjectExt"
linktitle: "ObjectExt"
second_title: "Aspose.Font pour C++"
description: "Classe System::ObjectExt. Fournit des méthodes statiques qui reproduisent les méthodes C# Object appelées pour des types C++ non‑Object (chaînes, nombres, etc.). Il s'agit d'un type statique sans services d'instance. Vous ne devez jamais créer d'instances de ce type, quel que soit le moyen, en C++."
type: docs
weight: 4900
url: /fr/cpp/system/objectext/
---
## ObjectExt class


Fournit des méthodes statiques qui reproduisent les méthodes C# [Object](../object/) appelées pour des types C++ non‑Object (chaînes, nombres, etc.). Il s'agit d'un type statique sans services d'instance. Vous ne devez jamais créer d'instances de ce type, quel que soit le moyen.

```cpp
class ObjectExt : public System::ObjectType
```

## Méthodes

| Méthode | Description |
| --- | --- |
| static [ArrayInitializerCast](./arrayinitializercast/)(From ...) | Convertit les valeurs fondamentales des tableaux (ce que C# fait implicitement mais que C++ ne fait apparemment pas). |
| static [Box](./box/)(const T\&) | Encapsule les types valeur pour les convertir en [Object](../object/). Implémentation pour les types enum. |
| static [Box](./box/)(const T\&) | Encapsule les types valeur pour les convertir en [Object](../object/). Implémentation pour les types non‑enum. |
| static [Box](./box/)(const T\&) | Encapsule les types [Nullable](../nullable/) pour les convertir en [Object](../object/). |
| static [Box](./box/)(const String\&) | Encapsule les valeurs de chaîne. |
| static [BoxEnum](./boxenum/)(T) | Encapsule les types enum pour être propagés en tant que [Object](../object/). |
| static [CastToIList](./casttoilist/)(const SmartPtr\<Object\>\&) |  |
| static [Coalesce](./coalesce/)(T0, T1) | Implémentation de la traduction de l'opérateur '??' pour les types non nullable. |
| static [Coalesce](./coalesce/)(System::Nullable\<T0\>, T1) | Implémentation de la traduction de l'opérateur '??' pour les types nullable. |
| static [CoalesceAssign](./coalesceassign/)(T0\&, T1) | Implémentation de la traduction de l'opérateur '??='. |
| static [CoalesceInternal](./coalesceinternal/)(RT1, F) | Implémentation de la traduction de l'opérateur '??' pour les types non nullables. Surcharge pour le cas où RT2 est convertible en RT1. |
| static [Equals](./equals/)(const T\&, const T2\&) |  |
| static [Equals](./equals/)(const T\&, const T2\&) | Substitution des appels C# [Object.Equals](../object/equals/) fonctionnant pour tout type en C++. Surcharge pour les types pointeur intelligent. |
| static [Equals](./equals/)(T, const T2\&) | Substitution des appels C# [Object.Equals](../object/equals/) fonctionnant pour tout type en C++. Surcharge pour les types de structure. |
| static [Equals](./equals/)(const T\&, const T2\&) | Substitution des appels C# [Object.Equals](../object/equals/) fonctionnant pour tout type en C++. Surcharge pour les types scalaires. |
| static [Equals](./equals/)(const char_t(&), String) | Substitution des appels C# [Object.Equals](../object/equals/) fonctionnant pour tout type en C++. Surcharge pour le littéral chaîne avec comparaison de chaînes. |
| static [Equals](./equals/)(const float\&, const float\&) | Émule la comparaison en virgule flottante de style C# où deux NaN sont considérés égaux même si, selon IEC 60559:1989, NaN n'est égal à aucune valeur, y compris NaN. |
| static [Equals](./equals/)(const double\&, const double\&) | Émule la comparaison en virgule flottante de style C# où deux NaN sont considérés égaux même si, selon IEC 60559:1989, NaN n'est égal à aucune valeur, y compris NaN. |
| static [ExplicitCastToObject](./explicitcasttoobject/)(const T\&) |  |
| static [ExplicitCastToObject](./explicitcasttoobject/)(const T\&) |  |
| static [GetHashCode](./gethashcode/)(const T\&) | Implémente les appels [GetHashCode()](./gethashcode/) ; fonctionne à la fois sur les sous‑classes de [Object](../object/) et sur des types non liés. |
| static [Is](./is/)(const T\&) | Implémente la traduction de l'opérateur 'is'. Spécialisation pour les types pouvant être boxés (valeur) qui sont exactement cela. |
| static [Is](./is/)(const U\&) | Implémente la traduction de l'opérateur 'is'. Spécialisation pour les types pointeur optimisés pour les classes 'final'. |
| static [Is](./is/)(const U\&) | Implémente la traduction de l'opérateur 'is'. Spécialisation pour les types pointeur. |
| static [Is](./is/)(const Object\&) | Implémente la traduction de l'opérateur 'is'. Spécialisation pour les types valeur. |
| static [Is](./is/)(const Object\&) | Implémente la traduction de l'opérateur 'is'. Spécialisation pour les types non convertibles. |
| static [Is](./is/)(const SmartPtr\<U\>\&) | Implémente la traduction de l'opérateur 'is'. Spécialisation pour les types pointeur. |
| static [Is](./is/)(const ExceptionWrapper\<U\>\&) | Implémente la traduction de l'opérateur 'is'. Spécialisation pour les types d'enveloppe d'exception. |
| static [Is](./is/)(const SmartPtr\<Object\>\&) | Implémente la traduction de l'opérateur 'is'. Spécialisation pour les types nullable. |
| static [Is](./is/)(const SmartPtr\<Object\>\&) | Implémente la traduction de l'opérateur 'is'. Spécialisation pour les types pouvant être boxés avec l'opérateur == défini. |
| static [Is](./is/)(const SmartPtr\<Object\>\&) | Implémente la traduction de l'opérateur 'is'. Spécialisation pour les types pouvant être boxés sans == défini. |
| static [Is](./is/)(const SmartPtr\<V\>\&) | Implémente la traduction de l'opérateur 'is'. Spécialisation des types valeur boxés vers des interfaces. |
| static [Is](./is/)(const SmartPtr\<U\>\&) | Implémente la traduction de l'opérateur 'is'. Spécialisation pour les types enum. |
| static [Is](./is/)(const WeakPtr\<U\>\&) | Implémente la traduction de l'opérateur 'is'. Spécialisation pour les types enum vs pointeurs faibles. |
| static [Is](./is/)(const Nullable\<U\>\&) | Implémente la traduction de l'opérateur 'is'. Spécialisation pour le type [Nullable](../nullable/). |
| static [Is](./is/)(const char16_t *) | Implémente la traduction de l'opérateur 'is'. Spécialisation pour le littéral chaîne. |
| static [Is](./is/)(int32_t) | Implémente la traduction de l'opérateur 'is'. Spécialisation pour le littéral entier. |
| static [IsBoxedValue](./isboxedvalue/)(const SmartPtr\<Object\>\&) | Vérifie si l'objet est une valeur boxée. |
| static [ObjectToUnknown](./objecttounknown/)(SmartPtr\<Object\>) | Convertit [Object](../object/) en type inconnu, en gérant à la fois les types pointeur intelligent et les situations de valeur boxée. |
| static [ObjectToUnknown](./objecttounknown/)(SmartPtr\<Object\>) | Convertit [Object](../object/) en type inconnu, en gérant à la fois les types pointeur intelligent et les situations de valeur boxée. |
| static [ToString](./tostring/)(const char_t *) | Substitution de la méthode C# ToString pour fonctionner avec n'importe quel type C++. |
| static [ToString](./tostring/)(const Nullable\<T\>\&) | Substitution de la méthode C# ToString pour fonctionner avec n'importe quel type C++. |
| static [ToString](./tostring/)(const T\&) | Substitution de la méthode C# ToString pour fonctionner avec n'importe quel type C++. |
| static [ToString](./tostring/)(const T\&) | Substitution de la méthode C# ToString pour fonctionner avec n'importe quel type C++. |
| static [ToString](./tostring/)(T\&) | Substitution de la méthode C# ToString pour fonctionner avec n'importe quel type C++. |
| static [ToString](./tostring/)(T\&) | Substitution de la méthode C# ToString pour fonctionner avec n'importe quel type C++. |
| static [ToString](./tostring/)(T\&&) | Substitution de la méthode C# ToString pour fonctionner avec n'importe quel type C++. |
| static [ToString](./tostring/)(T\&) | Substitution de la méthode C# ToString pour fonctionner avec n'importe quel type C++. |
| static [ToString](./tostring/)(const T\&) | Substitution de la méthode C# ToString pour fonctionner avec n'importe quel type C++. |
| static [ToString](./tostring/)(T\&&) | Substitution de la méthode C# ToString pour fonctionner avec n'importe quel type C++. |
| static [Unbox](./unbox/)(const SmartPtr\<Object\>\&) | Déboîte les types valeur après conversion en [Object](../object/). Implémentation pour les types enum. |
| static [Unbox](./unbox/)(const SmartPtr\<Object\>\&) | Déboîte les types valeur après conversion en [Object](../object/). Implémentation pour les types non‑enum et non nullable. |
| static [Unbox](./unbox/)(const SmartPtr\<Object\>\&) | Déboîte les types valeur après conversion en [Object](../object/). Implémentation pour les types non‑enum et non nullable. |
| static [Unbox](./unbox/)(E) | Déboîte les types enum en entier. |
| static [Unbox](./unbox/)(E) | Convertit les types enum. |
| static [Unbox](./unbox/)(const SmartPtr\<Object\>\&) | Déboîte les valeurs de chaîne. |
| static [UnboxStringSafe](./unboxstringsafe/)(const SmartPtr\<Object\>\&) | Déboîte la chaîne à partir d'une valeur emballée. |
| static [UnboxToNullable](./unboxtonullable/)(const SmartPtr\<Object\>\&, bool) | Déboîte l'objet en type nullable. |
| static [UnknownIsNull](./unknownisnull/)(T) | Vérifie si l'objet de type inconnu est nullptr. Surcharge pour les types non scalaires. |
| static [UnknownIsNull](./unknownisnull/)(T) | Vérifie si l'objet de type inconnu est nullptr. Surcharge pour les types scalaires. |
| static [UnknownToObject](./unknowntoobject/)(T) | Convertit le type inconnu en [Object](../object/), en gérant à la fois les situations de type pointeur intelligent et de type valeur. |
| static [UnknownToObject](./unknowntoobject/)(const T\&) | Convertit le type inconnu en [Object](../object/), en gérant à la fois les situations de type pointeur intelligent et de type valeur. |
## Voir aussi

* Class [ObjectType](../objecttype/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
