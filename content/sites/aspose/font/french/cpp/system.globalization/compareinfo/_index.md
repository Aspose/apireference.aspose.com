---
title: "classe System::Globalization::CompareInfo"
linktitle: "CompareInfo"
second_title: "Aspose.Font pour C++"
description: "Classe System::Globalization::CompareInfo. Effectue une comparaison de chaînes sensible à la culture. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject() function. Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en argument en C++."
type: docs
weight: 400
url: /fr/cpp/system.globalization/compareinfo/
---
## CompareInfo class


Effectue une comparaison de chaînes sensible à la culture. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/) . Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en argument.

```cpp
class CompareInfo : public virtual System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [Compare](./compare/)(const String\&, const String\&) const | Compare des chaînes. Non implémenté. |
| virtual [Compare](./compare/)(const String\&, const String\&, CompareOptions) const | Compare des chaînes. Seuls les modes Ordinal et OrdinalIgnoreCase sont pris en charge. |
| virtual [Compare](./compare/)(const String\&, int, int, const String\&, int, int) const | Compare une section d'une chaîne avec une section d'une deuxième chaîne. Non implémenté. |
| virtual [Compare](./compare/)(const String\&, int, const String\&, int, CompareOptions) const | Compare la section finale d'une chaîne avec la section finale d'une deuxième chaîne en utilisant des méthodes de comparaison de chaînes. Non implémenté. |
| virtual [Compare](./compare/)(const String\&, int, const String\&, int) const | Compare la section finale d'une chaîne avec la section finale d'une deuxième chaîne. Non implémenté. |
| virtual [Compare](./compare/)(const String\&, int, int, const String\&, int, int, CompareOptions) const | Compare une section d'une chaîne avec une section d'une deuxième chaîne en utilisant des méthodes de comparaison de chaînes. Non implémenté. |
| [CompareInfo](./compareinfo/)(const CompareInfo\&) | Informations RTTI. |
| [Equals](./equals/)(SharedPtr\<Object\>) override |  |
| [get_LCID](./get_lcid/)() const | Obtient le LCID de la culture associée au comparateur. |
| virtual [get_Name](./get_name/)() const | Obtient le nom de la culture associée au comparateur. |
| [get_Version](./get_version/)() const | Obtient des informations sur la version du tri. |
| static [GetCompareInfo](./getcompareinfo/)(int, const SharedPtr\<Reflection::Assembly\>\&) | Obtient le [CompareInfo](./) associé à la culture spécifiée et utilisant les méthodes de comparaison de chaînes dans l'assembly spécifié. |
| static [GetCompareInfo](./getcompareinfo/)(const String\&, const SharedPtr\<Reflection::Assembly\>\&) | Obtient le [CompareInfo](./) associé à la culture spécifiée et utilisant les méthodes de comparaison de chaînes dans l'assembly spécifié. |
| static [GetCompareInfo](./getcompareinfo/)(int) | Obtient le [CompareInfo](./) associé à la culture spécifiée. |
| static [GetCompareInfo](./getcompareinfo/)(const String\&) | Obtient le [CompareInfo](./) associé à la culture spécifiée. |
| virtual [GetHashCode](./gethashcode/)(const String\&, CompareOptions) const | Obtient le code de hachage de la chaîne basé sur les options de comparaison spécifiées. |
| [GetHashCode](./gethashcode/)() const override | Analogue de la méthode C# [Object.GetHashCode()](../../system/object/gethashcode/) . Permet le hachage d'objets personnalisés. |
| virtual [GetSortKey](./getsortkey/)(const String\&, CompareOptions) const | Obtient l'objet [SortKey](../sortkey/) pour la chaîne spécifiée en utilisant les options de comparaison spécifiées. |
| virtual [GetSortKey](./getsortkey/)(const String\&) const | Obtient l'objet [SortKey](../sortkey/) pour la chaîne spécifiée. |
| virtual [IndexOf](./indexof/)(const String\&, const String\&, int, int) const | Recherche une sous-chaîne. |
| virtual [IndexOf](./indexof/)(const String\&, const String\&, int, CompareOptions) const | Recherche une sous-chaîne. Seul le mode Ordinal est pris en charge. |
| virtual [IndexOf](./indexof/)(const String\&, const String\&, int, int, CompareOptions) const | Recherche une sous-chaîne. Seul le mode Ordinal est pris en charge. |
| virtual [IndexOf](./indexof/)(const String\&, char16_t, int, int, CompareOptions) const | Recherche le caractère spécifié. Seul le mode Ordinal est pris en charge. |
| virtual [IndexOf](./indexof/)(const String\&, const String\&, int) const | Recherche une sous-chaîne. |
| virtual [IndexOf](./indexof/)(const String\&, char16_t) const | Recherche le caractère spécifié. |
| virtual [IndexOf](./indexof/)(const String\&, const String\&) const | Recherche une sous-chaîne. |
| virtual [IndexOf](./indexof/)(const String\&, char16_t, int, CompareOptions) const | Recherche le caractère spécifié. Seul le mode Ordinal est pris en charge. |
| virtual [IndexOf](./indexof/)(const String\&, char16_t, int, int) const | Recherche le caractère spécifié. |
| virtual [IndexOf](./indexof/)(const String\&, char16_t, int) const | Recherche le caractère spécifié. |
| virtual [IndexOf](./indexof/)(const String\&, const String\&, CompareOptions) const | Recherche une sous-chaîne. Seul le mode Ordinal est pris en charge. |
| virtual [IndexOf](./indexof/)(const String\&, char16_t, CompareOptions) const | Recherche le caractère spécifié. Seul le mode Ordinal est pris en charge. |
| virtual [IsPrefix](./isprefix/)(const String\&, const String\&, CompareOptions) const | Vérifie si la chaîne spécifiée commence par le préfixe spécifié en utilisant les options de comparaison spécifiées. |
| virtual [IsPrefix](./isprefix/)(const String\&, const String\&) const | Vérifie si la chaîne spécifiée commence par le préfixe spécifié. |
| static [IsSortable](./issortable/)(char16_t) | Vérifie si un caractère spécifié est triable. |
| static [IsSortable](./issortable/)(const String\&) | Vérifie si une chaîne spécifiée est triable. |
| virtual [IsSuffix](./issuffix/)(const String\&, const String\&, CompareOptions) const | Vérifie si la chaîne spécifiée se termine par le suffixe spécifié en utilisant les options de comparaison spécifiées. |
| virtual [IsSuffix](./issuffix/)(const String\&, const String\&) const | Vérifie si la chaîne spécifiée se termine par le suffixe spécifié. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, const String\&) const | Recherche la dernière occurrence de la sous-chaîne spécifiée. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, const String\&, int, int, CompareOptions) const | Recherche la dernière occurrence de la sous-chaîne spécifiée en utilisant les options de comparaison spécifiées. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, char16_t, int, int, CompareOptions) const | Recherche la dernière occurrence du caractère spécifié en utilisant les options de comparaison spécifiées. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, const String\&, int, int) const | Recherche la dernière occurrence de la chaîne spécifiée. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, const String\&, int, CompareOptions) const | Recherche la dernière occurrence de la chaîne spécifiée en utilisant les options de comparaison spécifiées. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, char16_t, int, CompareOptions) const | Recherche la dernière occurrence du caractère spécifié en utilisant les options de comparaison spécifiées. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, const String\&, int) const | Recherche la dernière occurrence de la chaîne spécifiée. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, char16_t, int) const | Recherche la dernière occurrence du caractère spécifié. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, const String\&, CompareOptions) const | Recherche la dernière occurrence de la chaîne spécifiée en utilisant les options de comparaison spécifiées. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, char16_t, CompareOptions) const | Recherche la dernière occurrence du caractère spécifié en utilisant les options de comparaison spécifiées. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, char16_t) const | Recherche la dernière occurrence du caractère spécifié. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, char16_t, int, int) const | Recherche la dernière occurrence du caractère spécifié. |
| [operator=](./operator=/)(const CompareInfo\&) |  |
| [ToString](./tostring/)() const override | Analogue de la méthode C# [Object.ToString()](../../system/object/tostring/). Permet de convertir des objets personnalisés en chaîne. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)
