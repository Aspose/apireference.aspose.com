---
title: "System::Globalization::HebrewCalendar classe"
linktitle: "HebrewCalendar"
second_title: "Aspose.Font pour C++"
description: "System::Globalization::HebrewCalendar classe. Calendrier hébreu. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 1100
url: /fr/cpp/system.globalization/hebrewcalendar/
---
## HebrewCalendar class


Calendrier hébreu. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class HebrewCalendar : public System::Globalization::Calendar
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Clone](./clone/)() override | Informations RTTI. |
| [get_AlgorithmType](./get_algorithmtype/)() const override | Obtient le type d'algorithme. |
| [get_Eras](./get_eras/)() const override | Obtient la liste des ères existantes dans le calendrier. |
| [get_MaxSupportedDateTime](./get_maxsupporteddatetime/)() const override | Point temporel maximal pris en charge par le calendrier. |
| [get_MinSupportedDateTime](./get_minsupporteddatetime/)() const override | Point temporel minimal pris en charge par le calendrier. |
| [GetDayOfWeek](./getdayofweek/)(DateTime) const override | Obtient le jour de la semaine pour le point temporel spécifié. |
| [GetDaysInMonth](./getdaysinmonth/)(int, int, int) const override | Obtient le nombre de jours dans le mois spécifié. |
| [GetEra](./getera/)(DateTime) const override | Obtient l'ère pour le point temporel spécifié. |
| [GetLeapMonth](./getleapmonth/)(int, int) const override | Obtient le mois intercalaire pour l'année spécifiée. |
| virtual [GetLeapMonth](./getleapmonth/)(int) const | Informations RTTI. |
| [GetMonth](./getmonth/)(DateTime) const override | Obtient le mois pour le point temporel spécifié. |
| [GetMonthsInYear](./getmonthsinyear/)(int, int) const override | Obtient le nombre de mois dans l'année spécifiée. |
| virtual [GetMonthsInYear](./getmonthsinyear/)(int) const | Obtient le nombre de mois dans l'année spécifiée. |
| [HebrewCalendar](./hebrewcalendar/)() | Constructeur. |
| [IsLeapDay](./isleapday/)(int, int, int, int) const override | Vérifie si le jour est intercalaire. |
| virtual [IsLeapDay](./isleapday/)(int, int, int) const | Vérifie si le jour est intercalaire. |
| [IsLeapMonth](./isleapmonth/)(int, int, int) const override | Vérifie si le mois est intercalaire. |
| virtual [IsLeapMonth](./isleapmonth/)(int, int) const | Vérifie si le mois est intercalaire. |
| [IsLeapYear](./isleapyear/)(int, int) const override | Vérifie si l'année est bissextile. |
| virtual [IsLeapYear](./isleapyear/)(int) const | Vérifie si l'année est bissextile. |
| [set_TwoDigitYearMax](./set_twodigityearmax/)(int) override | Définit la dernière année qui peut être représentée par un nombre à 2 chiffres. |
| [ToDateTime](./todatetime/)(int, int, int, int, int, int, int, int) const override | Construit l'objet [DateTime](../../system/datetime/) à partir des composants. |
| virtual [ToDateTime](./todatetime/)(int, int, int, int, int, int, int) const | Construit l'objet [DateTime](../../system/datetime/) à partir des composants. |
## Champs

| Champ | Description |
| --- | --- |
| static constexpr [HebrewEra](./hebrewera/) | Ère hébraïque actuelle. |
## Voir aussi

* Class [Calendar](../calendar/)
* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)
