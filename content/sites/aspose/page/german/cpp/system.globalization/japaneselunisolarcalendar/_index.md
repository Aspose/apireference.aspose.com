---
title: "System::Globalization::JapaneseLunisolarCalendar Klasse"
linktitle: "JapaneseLunisolarCalendar"
second_title: "Aspose.Page für C++"
description: "System::Globalization::JapaneseLunisolarCalendar Klasse. Japanischer lunisolaren Kalender. Nicht implementiert. Objekte dieser Klasse sollten nur mit der System::MakeObject()-Funktion alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 1500
url: /de/cpp/system.globalization/japaneselunisolarcalendar/
---
## JapaneseLunisolarCalendar class


Japanischer lunisolaren Kalender. Nicht implementiert. Objekte dieser Klasse sollten nur mit der [System::MakeObject()](../../system/makeobject/) Funktion alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class JapaneseLunisolarCalendar : public System::Globalization::EastAsianLunisolarCalendar
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Clone](./clone/)() override | RTTI-Informationen. |
| [get_Eras](./get_eras/)() const override | Liefert die Liste der im Kalender vorhandenen Äras. |
| [get_MaxSupportedDateTime](./get_maxsupporteddatetime/)() const override | Der maximal unterstützte Zeitpunkt des Kalenders. |
| [get_MinSupportedDateTime](./get_minsupporteddatetime/)() const override | Der minimal unterstützte Zeitpunkt des Kalenders. |
| [GetEra](./getera/)(DateTime) const override | Liefert die Ära für den angegebenen Zeitpunkt. |
| [GetLeapMonth](./getleapmonth/)(int, int) const override | Liefert den Schaltmonat für das angegebene Jahr. |
| virtual [GetLeapMonth](./getleapmonth/)(int) const | RTTI-Informationen. |
| [GetYear](./getyear/)(DateTime) const override | Ermittelt das Jahr für den angegebenen Zeitpunkt. |
| [IsLeapDay](./isleapday/)(int, int, int, int) const override | Überprüft, ob der Tag ein Schaltjahr ist. |
| virtual [IsLeapDay](./isleapday/)(int, int, int) const | Überprüft, ob der Tag ein Schaltjahr ist. |
| [IsLeapYear](./isleapyear/)(int, int) const override | Überprüft, ob das Jahr ein Schaltjahr ist. |
| virtual [IsLeapYear](./isleapyear/)(int) const | Überprüft, ob das Jahr ein Schaltjahr ist. |
| [JapaneseLunisolarCalendar](./japaneselunisolarcalendar/)() | Konstruktor. |
## Felder

| Feld | Beschreibung |
| --- | --- |
| static constexpr [JapaneseEra](./japaneseera/) | Aktuelle japanische Ära. |
## Siehe auch

* Class [EastAsianLunisolarCalendar](../eastasianlunisolarcalendar/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
