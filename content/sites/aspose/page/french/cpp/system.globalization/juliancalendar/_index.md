---
title: "System::Globalization::JulianCalendar classe"
linktitle: "JulianCalendar"
second_title: "Aspose.Page pour C++"
description: "System::Globalization::JulianCalendar classe. Calendrier julien. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject() . Ne jamais créer d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Toujours encapsuler cette classe dans un pointeur System::SmartPtr et utiliser ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 1600
url: /fr/cpp/system.globalization/juliancalendar/
---
## JulianCalendar class


Calendrier julien. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/) . Ne jamais créer d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Toujours encapsuler cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utiliser ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class JulianCalendar : public System::Globalization::Calendar
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Clone](./clone/)() override | Informations RTTI. |
| [get_AlgorithmType](./get_algorithmtype/)() const override | Obtient le type d'algorithme. |
| [get_Eras](./get_eras/)() const override | Obtient la liste des ères existantes dans le calendrier. |
| [get_MaxSupportedDateTime](./get_maxsupporteddatetime/)() const override | Point maximal dans le temps pris en charge par le calendrier. |
| [get_MinSupportedDateTime](./get_minsupporteddatetime/)() const override | Point minimal dans le temps pris en charge par le calendrier. |
| [GetDaysInMonth](./getdaysinmonth/)(int, int, int) const override | Obtient le nombre de jours dans le mois spécifié. |
| virtual [GetDaysInMonth](./getdaysinmonth/)(int, int) const | Obtient le nombre de jours dans le mois spécifié. |
| [GetDaysInYear](./getdaysinyear/)(int, int) const override | Obtient le nombre de jours dans l'année spécifiée. |
| virtual [GetDaysInYear](./getdaysinyear/)(int) const | Obtient le nombre de jours dans l'année spécifiée. |
| [GetEra](./getera/)(DateTime) const override | Obtient l'ère pour le point temporel spécifié. |
| [GetLeapMonth](./getleapmonth/)(int, int) const override | Obtient le mois intercalaire pour l'année spécifiée. |
| virtual [GetLeapMonth](./getleapmonth/)(int) const | Obtient le mois intercalaire pour l'année spécifiée. |
| [GetMonthsInYear](./getmonthsinyear/)(int, int) const override | Obtient le nombre de mois dans l'année spécifiée. |
| virtual [GetMonthsInYear](./getmonthsinyear/)(int) const | Informations RTTI. |
| [IsLeapDay](./isleapday/)(int, int, int, int) const override | Vérifie si le jour est bissextile. |
| virtual [IsLeapDay](./isleapday/)(int, int, int) const | Vérifie si le jour est bissextile. |
| [IsLeapMonth](./isleapmonth/)(int, int, int) const override | Vérifie si le mois est bissextile. |
| virtual [IsLeapMonth](./isleapmonth/)(int, int) const | Vérifie si le mois est bissextile. |
| [IsLeapYear](./isleapyear/)(int, int) const override | Vérifie si l'année est bissextile. |
| virtual [IsLeapYear](./isleapyear/)(int) const | Vérifie si l'année est bissextile. |
| [JulianCalendar](./juliancalendar/)() | Constructeur. |
## Champs

| Champ | Description |
| --- | --- |
| static constexpr [JulianEra](./julianera/) | Ère julienne actuelle. |
## Voir aussi

* Class [Calendar](../calendar/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
