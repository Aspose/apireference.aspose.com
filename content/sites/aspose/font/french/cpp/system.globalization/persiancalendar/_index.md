---
title: "classe System::Globalization::PersianCalendar"
linktitle: "PersianCalendar"
second_title: "Aspose.Font pour C++"
description: "Classe System::Globalization::PersianCalendar. Calendrier persan. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 2000
url: /fr/cpp/system.globalization/persiancalendar/
---
## PersianCalendar class


Calendrier persan. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument.

```cpp
class PersianCalendar : public System::Globalization::Calendar
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
| virtual [GetDaysInMonth](./getdaysinmonth/)(int, int) const | Informations RTTI. |
| [GetDaysInYear](./getdaysinyear/)(int, int) const override | Obtient le nombre de jours dans l'année spécifiée. |
| virtual [GetDaysInYear](./getdaysinyear/)(int) const | Obtient le nombre de jours dans l'année spécifiée. |
| [GetLeapMonth](./getleapmonth/)(int, int) const override | Obtient le mois intercalaire pour l'année spécifiée. |
| virtual [GetLeapMonth](./getleapmonth/)(int) const | Obtient le mois intercalaire pour l'année spécifiée. |
| [GetMonthsInYear](./getmonthsinyear/)(int, int) const override | Obtient le nombre de mois dans l'année spécifiée. |
| virtual [GetMonthsInYear](./getmonthsinyear/)(int) const | Obtient le nombre de mois dans l'année spécifiée. |
| [IsLeapDay](./isleapday/)(int, int, int, int) const override | Vérifie si le jour est intercalaire. |
| virtual [IsLeapDay](./isleapday/)(int, int, int) const | Vérifie si le jour est intercalaire. |
| [IsLeapMonth](./isleapmonth/)(int, int, int) const override | Vérifie si le mois est intercalaire. |
| virtual [IsLeapMonth](./isleapmonth/)(int, int) const | Vérifie si le mois est intercalaire. |
| [IsLeapYear](./isleapyear/)(int, int) const override | Vérifie si l'année est bissextile. |
| virtual [IsLeapYear](./isleapyear/)(int) const | Vérifie si l'année est bissextile. |
| [PersianCalendar](./persiancalendar/)() | Constructeur. |
## Champs

| Champ | Description |
| --- | --- |
| static constexpr [PersianEra](./persianera/) | Ère persane actuelle. |
## Voir aussi

* Class [Calendar](../calendar/)
* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)
