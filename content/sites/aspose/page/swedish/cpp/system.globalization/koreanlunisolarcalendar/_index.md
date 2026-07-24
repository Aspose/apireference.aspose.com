---
title: "System::Globalization::KoreanLunisolarCalendar class"
linktitle: "KoreanLunisolarCalendar"
second_title: "Aspose.Page för C++"
description: "System::Globalization::KoreanLunisolarCalendar class. Koreansk lunisolarkalender. Inte implementerad. Objekt av denna klass bör endast allokeras med System::MakeObject()-funktionen. Skapa aldrig en instans av denna typ på stacken eller med operator new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i en System::SmartPtr-pekare och använd denna pekare för att skicka den till funktioner som argument i C++."
type: docs
weight: 1800
url: /sv/cpp/system.globalization/koreanlunisolarcalendar/
---
## KoreanLunisolarCalendar class


Koreansk lunisolarkalender. Inte implementerad. Objekt av denna klass bör endast allokeras med [System::MakeObject()](../../system/makeobject/) funktionen. Skapa aldrig en instans av denna typ på stacken eller med operator new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i en [System::SmartPtr](../../system/smartptr/) pekare och använd denna pekare för att skicka den till funktioner som argument.

```cpp
class KoreanLunisolarCalendar : public System::Globalization::EastAsianLunisolarCalendar
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [Clone](./clone/)() override | RTTI-information. |
| [get_Eras](./get_eras/)() const override | Hämtar lista över epoker som finns i kalendern. |
| [get_MaxSupportedDateTime](./get_maxsupporteddatetime/)() const override | Maximal tidpunkt som stöds av kalendern. |
| [get_MinSupportedDateTime](./get_minsupporteddatetime/)() const override | Minimal tidpunkt som stöds av kalendern. |
| [GetLeapMonth](./getleapmonth/)(int, int) const override | Hämtar skottmånaden för det angivna året. |
| virtual [GetLeapMonth](./getleapmonth/)(int) const | RTTI-information. |
| [IsLeapDay](./isleapday/)(int, int, int, int) const override | Kontrollerar om dagen är skottår. |
| virtual [IsLeapDay](./isleapday/)(int, int, int) const | Kontrollerar om dagen är skottår. |
| [IsLeapYear](./isleapyear/)(int, int) const override | Kontrollerar om året är skottår. |
| virtual [IsLeapYear](./isleapyear/)(int) const | Kontrollerar om året är skottår. |
| [KoreanLunisolarCalendar](./koreanlunisolarcalendar/)() | Konstruktor. |
## Fält

| Fält | Beskrivning |
| --- | --- |
| static constexpr [GregorianEra](./gregorianera/) | Aktuell gregorianska era. |
## Se även

* Class [EastAsianLunisolarCalendar](../eastasianlunisolarcalendar/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
