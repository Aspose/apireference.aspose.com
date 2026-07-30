---
title: "System::Globalization::KoreanCalendar classe"
linktitle: "KoreanCalendar"
second_title: "Aspose.Font pour C++"
description: "System::Globalization::KoreanCalendar class. Calendrier coréen. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject() . Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 1700
url: /fr/cpp/system.globalization/koreancalendar/
---
## KoreanCalendar class


Calendrier coréen. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class KoreanCalendar : public System::Globalization::Calendar
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Clone](./clone/)() override | Informations RTTI. |
| [get_AlgorithmType](./get_algorithmtype/)() const override | Obtient le type d'algorithme. |
| [get_Eras](./get_eras/)() const override | Obtient la liste des ères existantes dans le calendrier. |
| [get_MaxSupportedDateTime](./get_maxsupporteddatetime/)() const override | Point temporel maximal pris en charge par le calendrier. |
| [get_MinSupportedDateTime](./get_minsupporteddatetime/)() const override | Point temporel minimal pris en charge par le calendrier. |
| [GetDayOfMonth](./getdayofmonth/)(DateTime) const override | Obtient le jour du mois pour le point temporel spécifié. |
| [GetDayOfWeek](./getdayofweek/)(DateTime) const override | Obtient le jour de la semaine pour le point temporel spécifié. |
| [GetDayOfYear](./getdayofyear/)(DateTime) const override | Obtient le jour de l'année pour le point temporel spécifié. |
| [GetDaysInMonth](./getdaysinmonth/)(int, int, int) const override | Obtient le nombre de jours dans le mois spécifié. |
| virtual [GetDaysInMonth](./getdaysinmonth/)(int, int) const | Obtient le nombre de jours dans le mois spécifié. |
| [GetDaysInYear](./getdaysinyear/)(int, int) const override | Obtient le nombre de jours dans l'année spécifiée. |
| virtual [GetDaysInYear](./getdaysinyear/)(int) const | Obtient le nombre de jours dans l'année spécifiée. |
| [GetEra](./getera/)(DateTime) const override | Obtient l'ère pour le point temporel spécifié. |
| [GetLeapMonth](./getleapmonth/)(int, int) const override | Obtient le mois intercalaire pour l'année spécifiée. |
| virtual [GetLeapMonth](./getleapmonth/)(int) const | Obtient le mois intercalaire pour l'année spécifiée. |
| [GetMonth](./getmonth/)(DateTime) const override | Obtient le mois pour le point temporel spécifié. |
| [GetMonthsInYear](./getmonthsinyear/)(int, int) const override | Obtient le nombre de mois dans l'année spécifiée. |
| virtual [GetMonthsInYear](./getmonthsinyear/)(int) const | Informations RTTI. |
| [GetYear](./getyear/)(DateTime) const override | Obtient l'année pour le point temporel spécifié. |
| [IsLeapDay](./isleapday/)(int, int, int, int) const override | Vérifie si le jour est intercalaire. |
| virtual [IsLeapDay](./isleapday/)(int, int, int) const | Vérifie si le jour est intercalaire. |
| [IsLeapMonth](./isleapmonth/)(int, int, int) const override | Vérifie si le mois est intercalaire. |
| virtual [IsLeapMonth](./isleapmonth/)(int, int) const | Vérifie si le mois est intercalaire. |
| [IsLeapYear](./isleapyear/)(int, int) const override | Vérifie si l'année est bissextile. |
| virtual [IsLeapYear](./isleapyear/)(int) const | Vérifie si l'année est bissextile. |
| [KoreanCalendar](./koreancalendar/)() | Constructeur. |
| [ToDateTime](./todatetime/)(int, int, int, int, int, int, int, int) const override | Construit l'objet [DateTime](../../system/datetime/) à partir des composants. |
| virtual [ToDateTime](./todatetime/)(int, int, int, int, int, int, int) const | Construit l'objet [DateTime](../../system/datetime/) à partir des composants. |
## Champs

| Champ | Description |
| --- | --- |
| static constexpr [KoreanEra](./koreanera/) | Ère coréenne actuelle. |
## Voir aussi

* Class [Calendar](../calendar/)
* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)
