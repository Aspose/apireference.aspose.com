---
title: "System::Globalization::KoreanLunisolarCalendar classe"
linktitle: "CalendrierLunaireCoréen"
second_title: "Aspose.Font pour C++"
description: "System::Globalization::KoreanLunisolarCalendar classe. Calendrier lunisolaire coréen. Non implémenté. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction `System::MakeObject()`. Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur `System::SmartPtr` et utilisez ce pointeur pour le passer aux fonctions en argument en C++."
type: docs
weight: 1800
url: /fr/cpp/system.globalization/koreanlunisolarcalendar/
---
## KoreanLunisolarCalendar class


Calendrier lunisolaire coréen. Non implémenté. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en argument.

```cpp
class KoreanLunisolarCalendar : public System::Globalization::EastAsianLunisolarCalendar
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Clone](./clone/)() override | Informations RTTI. |
| [get_Eras](./get_eras/)() const override | Obtient la liste des ères existantes dans le calendrier. |
| [get_MaxSupportedDateTime](./get_maxsupporteddatetime/)() const override | Point temporel maximal pris en charge par le calendrier. |
| [get_MinSupportedDateTime](./get_minsupporteddatetime/)() const override | Point temporel minimal pris en charge par le calendrier. |
| [GetLeapMonth](./getleapmonth/)(int, int) const override | Obtient le mois intercalaire pour l'année spécifiée. |
| virtual [GetLeapMonth](./getleapmonth/)(int) const | Informations RTTI. |
| [IsLeapDay](./isleapday/)(int, int, int, int) const override | Vérifie si le jour est intercalaire. |
| virtual [IsLeapDay](./isleapday/)(int, int, int) const | Vérifie si le jour est intercalaire. |
| [IsLeapYear](./isleapyear/)(int, int) const override | Vérifie si l'année est bissextile. |
| virtual [IsLeapYear](./isleapyear/)(int) const | Vérifie si l'année est bissextile. |
| [KoreanLunisolarCalendar](./koreanlunisolarcalendar/)() | Constructeur. |
## Champs

| Champ | Description |
| --- | --- |
| static constexpr [GregorianEra](./gregorianera/) | Ère grégorienne actuelle. |
## Voir aussi

* Class [EastAsianLunisolarCalendar](../eastasianlunisolarcalendar/)
* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)
