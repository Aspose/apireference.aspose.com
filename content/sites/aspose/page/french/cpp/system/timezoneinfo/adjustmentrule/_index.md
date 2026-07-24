---
title: "System::TimeZoneInfo::AdjustmentRule classe"
linktitle: "AdjustmentRule"
second_title: "Aspose.Page pour C++"
description: "System::TimeZoneInfo::AdjustmentRule classe. Fournit des informations sur un ajustement de fuseau horaire. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour la passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 3300
url: /fr/cpp/system/timezoneinfo/adjustmentrule/
---
## AdjustmentRule class


Fournit des informations sur un ajustement de fuseau horaire. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../smartptr/) et utilisez ce pointeur pour la passer aux fonctions en tant qu'argument.

```cpp
class AdjustmentRule : public System::IEquatable<AdjustmentRulePtr>
```

## Méthodes

| Méthode | Description |
| --- | --- |
| static [CreateAdjustmentRule](./createadjustmentrule/)(DateTime, DateTime, TimeSpan, const TransitionTime\&, const TransitionTime\&) | Construit une instance de la classe [AdjustmentRule](./) qui représente une règle d'ajustement horaire décrite avec les paramètres spécifiés. |
| static [CreateAdjustmentRule](./createadjustmentrule/)(DateTime, DateTime, TimeSpan, const TransitionTime\&, const TransitionTime\&, TimeSpan, bool) | Construit une instance de la classe [AdjustmentRule](./) qui représente une règle d'ajustement horaire décrite avec les paramètres spécifiés. |
| [Equals](./equals/)(AdjustmentRulePtr) override |  |
| [get_BaseUtcOffsetDelta](./get_baseutcoffsetdelta/)() const | Retourne un delta par rapport au décalage UTC par défaut. |
| [get_DateEnd](./get_dateend/)() const | Retourne un objet [DateTime](../../datetime/) qui représente la date et l'heure auxquelles la règle d'ajustement cesse d'être effective. |
| [get_DateStart](./get_datestart/)() const | Retourne un objet [DateTime](../../datetime/) qui représente la date et l'heure auxquelles la règle d'ajustement entre en vigueur. |
| [get_DaylightDelta](./get_daylightdelta/)() const | Retourne un objet [TimeSpan](../../timespan/) qui représente la quantité de temps requise pour former l'heure d'été du fuseau horaire. |
| [get_DaylightTransitionEnd](./get_daylighttransitionend/)() const | Retourne les informations sur la transition de l'heure standard à l'heure d'été. |
| [get_DaylightTransitionStart](./get_daylighttransitionstart/)() const | Retourne les informations sur la transition de l'heure d'été à l'heure standard. |
| [get_HasDaylightSaving](./get_hasdaylightsaving/)() const | POUR USAGE INTERNE. |
| [GetHashCode](./gethashcode/)() const override | Analogue de la méthode C# [Object.GetHashCode()](../../object/gethashcode/). Permet le hachage d'objets personnalisés. |
## Voir aussi

* Class [IEquatable](../../iequatable/)
* Class [TimeZoneInfo](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
