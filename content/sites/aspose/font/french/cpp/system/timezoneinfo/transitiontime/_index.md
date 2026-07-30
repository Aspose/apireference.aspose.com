---
title: "Classe System::TimeZoneInfo::TransitionTime"
linktitle: "TransitionTime"
second_title: "Aspose.Font pour C++"
description: "Classe System::TimeZoneInfo::TransitionTime. Informations RTTI en C++."
type: docs
weight: 3400
url: /fr/cpp/system/timezoneinfo/transitiontime/
---
## TransitionTime class


Informations RTTI.

```cpp
class TransitionTime
```

## Méthodes

| Méthode | Description |
| --- | --- |
| static [CreateFixedDateRule](./createfixeddaterule/)(DateTime, int, int) | Construit une instance de la classe [TransitionTime](./) qui représente une règle à date fixe (changement d'heure qui se produit un jour spécifique d'un mois spécifique). |
| static [CreateFloatingDateRule](./createfloatingdaterule/)(DateTime, int, int, DayOfWeek) | Construit une instance de la classe [TransitionTime](./) qui représente une règle à date flottante (changement d'heure qui se produit un jour spécifique d'une semaine spécifique d'un mois spécifique). |
| static [CreateTransitionTime](./createtransitiontime/)(DateTime, int, int, int, DayOfWeek, bool) | Construit une instance de la classe [TransitionTime](./) qui représente un changement d'heure décrit avec les paramètres spécifiés. |
| [get_Day](./get_day/)() const | Renvoie le numéro ordinal du jour de la semaine où le changement d'heure se produit. |
| [get_DayOfWeek](./get_dayofweek/)() const | Renvoie la valeur qui représente le jour de la semaine où le changement d'heure se produit. |
| [get_IsFixedDateRule](./get_isfixeddaterule/)() const | Renvoie la valeur qui indique si le changement d'heure se produit à une date et heure fixes ou à une date et heure flottantes. |
| [get_Month](./get_month/)() const | Renvoie le numéro ordinal du mois de l'année où le changement d'heure se produit. |
| [get_TimeOfDay](./get_timeofday/)() const | Renvoie un objet [DateTime](../../datetime/) qui représente le moment précis où le changement d'heure se produit. |
| [get_Week](./get_week/)() const | Renvoie le numéro ordinal de la semaine du mois où le changement d'heure se produit. |
| [operator!=](./operator!=/)(const TransitionTime\&) const |  |
| [operator==](./operator==/)(const TransitionTime\&) const |  |
| [TransitionTime](./transitiontime/)() | Constructeur par défaut. POUR USAGE INTERNE. |
## Remarques


Fournit des informations sur un changement d'heure dans un fuseau horaire.
## Voir aussi

* Class [TimeZoneInfo](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
