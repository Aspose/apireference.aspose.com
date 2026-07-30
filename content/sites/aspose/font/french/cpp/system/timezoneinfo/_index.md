---
title: "Classe System::TimeZoneInfo"
linktitle: "TimeZoneInfo"
second_title: "Aspose.Font pour C++"
description: "Classe System::TimeZoneInfo. Représente une information décrivant un fuseau horaire particulier. Les objets de cette classe ne doivent être alloués qu’en utilisant la fonction System::MakeObject(). Ne créez jamais d’instance de ce type sur la pile ou avec l’opérateur new, car cela entraînera des erreurs d’exécution et/ou des échecs d’assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu’argument en C++."
type: docs
weight: 6300
url: /fr/cpp/system/timezoneinfo/
---
## TimeZoneInfo class


Représente une information décrivant un fuseau horaire particulier. Les objets de cette classe ne doivent être alloués qu’en utilisant la fonction [System::MakeObject()](../makeobject/). Ne créez jamais d’instance de ce type sur la pile ou avec l’opérateur new, car cela entraînera des erreurs d’exécution et/ou des échecs d’assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu’argument.

```cpp
class TimeZoneInfo : public System::IEquatable<TimeZoneInfoPtr>
```

## Nested classes

* Class [AdjustmentRule](./adjustmentrule/)
* Class [TransitionTime](./transitiontime/)
## Méthodes

| Méthode | Description |
| --- | --- |
| static [ClearCachedData](./clearcacheddata/)() | Efface les données de fuseau horaire mises en cache. |
| static [ConvertTime](./converttime/)(DateTime, const TimeZoneInfoPtr\&, const TimeZoneInfoPtr\&) | [Convert](../convert/) le temps d’un fuseau horaire à un autre. |
| static [ConvertTime](./converttime/)(const DateTimeOffset\&, const TimeZoneInfoPtr\&) | [Convert](../convert/) le temps vers l’heure dans un fuseau horaire spécifié. |
| static [ConvertTime](./converttime/)(DateTime, const TimeZoneInfoPtr\&) | [Convert](../convert/) le temps vers l’heure dans un fuseau horaire spécifié. |
| static [ConvertTimeBySystemTimeZoneId](./converttimebysystemtimezoneid/)(DateTime, const String\&) | [Convert](../convert/) le temps vers l’heure dans un fuseau horaire spécifié. |
| static [ConvertTimeBySystemTimeZoneId](./converttimebysystemtimezoneid/)(const DateTimeOffset\&, const String\&) | [Convert](../convert/) le temps vers l’heure dans un fuseau horaire spécifié. |
| static [ConvertTimeBySystemTimeZoneId](./converttimebysystemtimezoneid/)(DateTime, const String\&, const String\&) | [Convert](../convert/) le temps vers l’heure dans un fuseau horaire spécifié. |
| static [ConvertTimeFromUtc](./converttimefromutc/)(DateTime, const TimeZoneInfoPtr\&) | Convertit l’heure UTC en l’heure d’un fuseau horaire spécifié. |
| static [ConvertTimeToUtc](./converttimetoutc/)(DateTime, const TimeZoneInfoPtr\&) | Convertit le temps en heure UTC. |
| static [ConvertTimeToUtc](./converttimetoutc/)(DateTime) | Convertit le temps en heure UTC. |
| static [ConvertTimeToUtcNoThrow](./converttimetoutcnothrow/)(DateTime) | Convertit le temps en heure UTC. POUR USAGE INTERNE. |
| static [CreateCustomTimeZone](./createcustomtimezone/)(const String\&, TimeSpan, const String\&, const String\&, const String\&, const ArrayPtr\<AdjustmentRulePtr\>\&, bool) | Crée un fuseau horaire personnalisé. |
| static [CreateCustomTimeZone](./createcustomtimezone/)(const String\&, TimeSpan, const String\&, const String\&, const String\&, const ArrayPtr\<AdjustmentRulePtr\>\&) | Crée un fuseau horaire personnalisé. |
| static [CreateCustomTimeZone](./createcustomtimezone/)(const String\&, TimeSpan, const String\&, const String\&) | Crée un fuseau horaire personnalisé. |
| [Equals](./equals/)(SharedPtr\<Object\>) override |  |
| [Equals](./equals/)(TimeZoneInfoPtr) override | Détermine si l'objet actuel et l'objet spécifié sont égaux. |
| static [FindSystemTimeZoneById](./findsystemtimezonebyid/)(const String\&) | Obtient le fuseau horaire avec l'identifiant spécifié. |
| [get_BaseUtcOffset](./get_baseutcoffset/)() const | Renvoie une instance de [TimeSpan](../timespan/) qui représente un intervalle de temps entre l'heure standard du fuseau horaire actuel et l'heure UTC. |
| [get_DaylightName](./get_daylightname/)() const | Obtient le nom de l'heure d'été du fuseau horaire actuel. |
| [get_DisplayName](./get_displayname/)() const | Obtient le nom du fuseau horaire actuel. |
| [get_Id](./get_id/)() const | Renvoie l'identifiant du fuseau horaire représenté par l'objet actuel. |
| static [get_Local](./get_local/)() | Renvoie une instance de [TimeZoneInfo](./) qui représente un fuseau horaire local. |
| [get_StandardName](./get_standardname/)() const | Obtient le nom de l'heure standard du fuseau horaire actuel. |
| [get_SupportsDaylightSavingTime](./get_supportsdaylightsavingtime/)() const | Obtient le drapeau indiquant si le fuseau horaire possède des règles d'heure d'été. |
| static [get_Utc](./get_utc/)() | Renvoie une instance de [TimeZoneInfo](./) qui représente un fuseau horaire UTC. |
| [GetAdjustmentRules](./getadjustmentrules/)() const | Renvoie un tableau contenant des objets [AdjustmentRule](./adjustmentrule/) qui représentent les règles d'ajustement appliquées à l'objet [TimeZoneInfo](./) actuel. |
| [GetAmbiguousTimeOffsets](./getambiguoustimeoffsets/)(DateTime) const | Obtient les dates et heures UTC auxquelles une date et heure spécifiées peuvent être associées. |
| [GetAmbiguousTimeOffsets](./getambiguoustimeoffsets/)(const DateTimeOffset\&) const | Obtient les dates et heures UTC auxquelles une date et heure spécifiées peuvent être associées. |
| [GetHashCode](./gethashcode/)() const override | Analogue de la méthode C# [Object.GetHashCode()](../object/gethashcode/). Permet le hachage d'objets personnalisés. |
| static [GetSystemTimeZones](./getsystemtimezones/)() | Obtient une collection triée de tous les fuseaux horaires disponibles sur le système local. |
| [GetUtcOffset](./getutcoffset/)(DateTime) const | Calcule la différence entre l'heure de ce fuseau horaire et le fuseau horaire UTC pour une date et heure spécifiées. |
| [GetUtcOffset](./getutcoffset/)(const DateTimeOffset\&) const | Calcule la différence entre l'heure de ce fuseau horaire et le fuseau horaire UTC pour une date et heure spécifiées. |
| static [GetUtcOffsetFromUtc](./getutcoffsetfromutc/)(DateTime, const TimeZoneInfoPtr\&) | Fonction d'aide interne qui renvoie le décalage UTC pour une date-heure UTC dans un fuseau horaire spécifié. POUR USAGE INTERNE. |
| static [GetUtcOffsetFromUtc](./getutcoffsetfromutc/)(DateTime, const TimeZoneInfoPtr\&, bool\&, bool\&) | Fonction d'aide interne qui renvoie le décalage UTC pour une date-heure UTC dans un fuseau horaire spécifié. POUR USAGE INTERNE. |
| [GetUtcOffsetNoThrow](./getutcoffsetnothrow/)(DateTime) const | Calcule la différence entre l'heure de ce fuseau horaire et le fuseau horaire UTC pour une date et heure spécifiées. POUR USAGE INTERNE. |
| [HasSameRules](./hassamerules/)(const TimeZoneInfoPtr\&) const | Vérifie si le fuseau horaire actuel et un autre ont les mêmes règles d'ajustement. |
| [IsAmbiguousTime](./isambiguoustime/)(DateTime) const | Vérifie si la date et l'heure spécifiées sont ambiguës et peuvent être associées à plusieurs heures UTC. |
| [IsAmbiguousTime](./isambiguoustime/)(const DateTimeOffset\&) const | Vérifie si la date et l'heure spécifiées sont ambiguës et peuvent être associées à plusieurs heures UTC. |
| [IsDaylightSavingTime](./isdaylightsavingtime/)(DateTime) const | Vérifie si la date et l'heure spécifiées se situent dans la période d'heure d'été. |
| [IsDaylightSavingTime](./isdaylightsavingtime/)(const DateTimeOffset\&) const | Vérifie si la date et l'heure spécifiées se situent dans la période d'heure d'été. |
| [IsDaylightSavingTimeNoThrow](./isdaylightsavingtimenothrow/)(DateTime) const | Vérifie si la date et l'heure spécifiées se situent dans la période d'heure d'été. |
| [IsInvalidTime](./isinvalidtime/)(DateTime) const | Vérifie si la date et l'heure spécifiées sont invalides. |
| [ToString](./tostring/)() const override | Analogue de la méthode C# [Object.ToString()](../object/tostring/). Permet de convertir des objets personnalisés en chaîne. |
| static [TransitionTimeToDateTime](./transitiontimetodatetime/)(int32_t, const TransitionTime\&) | Fonction d'aide qui convertit une année et un [TransitionTime](./transitiontime/) en un [DateTime](../datetime/). |
## Typedefs

| Typedef | Description |
| --- | --- |
| [AdjustmentRulePtr](./adjustmentruleptr/) | Un alias pour un pointeur partagé vers une instance de la classe [AdjustmentRule](./adjustmentrule/). |
## Voir aussi

* Class [IEquatable](../iequatable/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
