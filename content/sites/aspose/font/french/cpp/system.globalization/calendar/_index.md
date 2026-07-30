---
title: "System::Globalization::Calendar classe"
linktitle: "Calendar"
second_title: "Aspose.Font pour C++"
description: "Classe System::Globalization::Calendar. Calendrier qui définit comment les dates sont gérées, calculées, formatées, etc. Les opérations de définition ne sont activées que sur les objets non en lecture seule. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 100
url: /fr/cpp/system.globalization/calendar/
---
## Calendar class


[Calendar](./) which defines how the dates are handled, calculated, formatted, etc. Setter operations are only enabled on non-read-only objects. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Calendar : public System::ICloneable
```

## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [AddDays](./adddays/)(DateTime, int) const | Ajoute des jours au point temporel. |
| virtual [AddHours](./addhours/)(DateTime, int) const | Ajoute des heures au point temporel. |
| virtual [AddMilliseconds](./addmilliseconds/)(DateTime, double) const | Ajoute des millisecondes au point temporel. |
| virtual [AddMinutes](./addminutes/)(DateTime, int) const | Ajoute des minutes au point temporel. |
| virtual [AddMonths](./addmonths/)(DateTime, int) const | Ajoute des mois au point temporel. |
| virtual [AddSeconds](./addseconds/)(DateTime, int) const | Ajoute des secondes au point temporel. |
| virtual [AddWeeks](./addweeks/)(DateTime, int) const | Ajoute des semaines au point temporel. |
| virtual [AddYears](./addyears/)(DateTime, int) const | Ajoute des années au point temporel. |
| [Calendar](./calendar/)(const Calendar\&) | Informations RTTI. |
| virtual [get_AlgorithmType](./get_algorithmtype/)() const | Obtient le type d'algorithme. |
| [get_CurrentEra](./get_currentera/)() const | Obtient l'index de l'ère actuelle. |
| [get_CurrentEraValue](./get_currenteravalue/)() const | Obtient la valeur de l'ère actuelle. |
| virtual [get_Eras](./get_eras/)() const | Obtient la liste des ères existantes dans le calendrier. |
| virtual [get_ID](./get_id/)() const | Obtient l'identifiant du calendrier. |
| [get_IsReadOnly](./get_isreadonly/)() const | Vérifie si le calendrier est en lecture seule. |
| virtual [get_MaxSupportedDateTime](./get_maxsupporteddatetime/)() const | Point temporel maximal pris en charge par le calendrier. |
| virtual [get_MinSupportedDateTime](./get_minsupporteddatetime/)() const | Point temporel minimal pris en charge par le calendrier. |
| virtual [get_TwoDigitYearMax](./get_twodigityearmax/)() const | Obtient la dernière année qui peut être représentée par un nombre à 2 chiffres. |
| virtual [GetDayOfMonth](./getdayofmonth/)(DateTime) const | Obtient le jour du mois pour le point temporel spécifié. |
| virtual [GetDayOfWeek](./getdayofweek/)(DateTime) const | Obtient le jour de la semaine pour le point temporel spécifié. |
| virtual [GetDayOfYear](./getdayofyear/)(DateTime) const | Obtient le jour de l'année pour le point temporel spécifié. |
| virtual [GetDaysInMonth](./getdaysinmonth/)(int, int) const | Obtient le nombre de jours dans le mois spécifié. |
| virtual [GetDaysInMonth](./getdaysinmonth/)(int, int, int) const | Obtient le nombre de jours dans le mois spécifié. |
| virtual [GetDaysInYear](./getdaysinyear/)(int) const | Obtient le nombre de jours dans l'année spécifiée. |
| virtual [GetDaysInYear](./getdaysinyear/)(int, int) const | Obtient le nombre de jours dans l'année spécifiée. |
| virtual [GetEra](./getera/)(DateTime) const | Obtient l'ère pour le point temporel spécifié. |
| virtual [GetHour](./gethour/)(DateTime) const | Obtient les heures pour le point temporel spécifié. |
| virtual [GetLeapMonth](./getleapmonth/)(int) const | Obtient le mois intercalaire pour l'année spécifiée. |
| virtual [GetLeapMonth](./getleapmonth/)(int, int) const | Obtient le mois intercalaire pour l'année spécifiée. |
| virtual [GetMilliseconds](./getmilliseconds/)(DateTime) const | Obtient les millisecondes pour le point temporel spécifié. |
| virtual [GetMinute](./getminute/)(DateTime) const | Obtient les minutes pour le point temporel spécifié. |
| virtual [GetMonth](./getmonth/)(DateTime) const | Obtient le mois pour le point temporel spécifié. |
| virtual [GetMonthsInYear](./getmonthsinyear/)(int) const | Obtient le nombre de mois dans l'année spécifiée. |
| virtual [GetMonthsInYear](./getmonthsinyear/)(int, int) const | Obtient le nombre de mois dans l'année spécifiée. |
| virtual [GetSecond](./getsecond/)(DateTime) const | Obtient les secondes pour le point temporel spécifié. |
| virtual [GetWeekOfYear](./getweekofyear/)(DateTime, CalendarWeekRule, DayOfWeek) const | Obtient la semaine de l'année pour le point temporel spécifié. |
| virtual [GetYear](./getyear/)(DateTime) const | Obtient l'année pour le point temporel spécifié. |
| virtual [IsLeapDay](./isleapday/)(int, int, int) const | Vérifie si le jour est intercalaire. |
| virtual [IsLeapDay](./isleapday/)(int, int, int, int) const | Vérifie si le jour est intercalaire. |
| virtual [IsLeapMonth](./isleapmonth/)(int, int) const | Vérifie si le mois est intercalaire. |
| virtual [IsLeapMonth](./isleapmonth/)(int, int, int) const | Vérifie si le mois est intercalaire. |
| virtual [IsLeapYear](./isleapyear/)(int) const | Vérifie si l'année est bissextile. |
| virtual [IsLeapYear](./isleapyear/)(int, int) const | Vérifie si l'année est bissextile. |
| [IsValidDay](./isvalidday/)(int, int, int, int) const | Vérifie les valeurs de l'année, du mois, du jour et de l'ère. |
| [operator=](./operator=/)(const Calendar\&) |  |
| static [ReadOnly](./readonly/)(const CalendarPtr\&) | Obtient la version en lecture seule du calendrier. |
| virtual [set_TwoDigitYearMax](./set_twodigityearmax/)(int) | Définit la dernière année qui peut être représentée par un nombre à 2 chiffres. |
| virtual [ToDateTime](./todatetime/)(int, int, int, int, int, int, int) const | Construit l'objet [DateTime](../../system/datetime/) à partir des composants. |
| virtual [ToDateTime](./todatetime/)(int, int, int, int, int, int, int, int) const | Construit l'objet [DateTime](../../system/datetime/) à partir des composants. |
| virtual [ToFourDigitYear](./tofourdigityear/)(int) const | Convertit l'année en année à 4 chiffres en utilisant la propriété TwoDigitYearMax. |
## Voir aussi

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)
