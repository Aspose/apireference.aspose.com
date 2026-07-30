---
title: "System::Globalization::RegionInfo-Klasse"
linktitle: "RegionInfo"
second_title: "Aspose.Font für C++"
description: "System::Globalization::RegionInfo-Klasse. Stellt Informationen zur Region bereit. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 2100
url: /de/cpp/system.globalization/regioninfo/
---
## RegionInfo class


Stellt Informationen zur Region bereit. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) zugewiesen werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class RegionInfo : public virtual System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Equals](./equals/)(SharedPtr\<Object\>) override |  |
| virtual [get_CurrencyEnglishName](./get_currencyenglishname/)() const | Liefert den englischen Namen der Währung. |
| virtual [get_CurrencyNativeName](./get_currencynativename/)() const | Liefert den nativen Namen der Währung. |
| virtual [get_CurrencySymbol](./get_currencysymbol/)() const | Gibt das Währungssymbol zurück. |
| static [get_CurrentRegion](./get_currentregion/)() | Liefert die im System eingestellte Region. |
| virtual [get_DisplayName](./get_displayname/)() const | Liefert den vollständigen Regionsnamen. |
| virtual [get_EnglishName](./get_englishname/)() const | Liefert den englischen Namen der Region. |
| virtual [get_GeoId](./get_geoid/)() const | Liefert einen eindeutigen Bezeichner für eine Region. |
| virtual [get_IsMetric](./get_ismetric/)() const | Überprüft, ob die Region das metrische System verwendet. |
| virtual [get_ISOCurrencySymbol](./get_isocurrencysymbol/)() const | Liefert das ISO-Währungssymbol. |
| virtual [get_Name](./get_name/)() const | Liefert den Namen der Region. |
| virtual [get_NativeName](./get_nativename/)() const | Liefert den nativen Namen der Region. |
| virtual [get_ThreeLetterISORegionName](./get_threeletterisoregionname/)() const | Liefert den dreibuchstabigen ISO-Regioncode. |
| virtual [get_ThreeLetterWindowsRegionName](./get_threeletterwindowsregionname/)() const | Liefert den dreibuchstabigen [Windows](../../system.windows/) Regionscode. |
| virtual [get_TwoLetterISORegionName](./get_twoletterisoregionname/)() const | Liefert den zweibuchstabigen ISO-Regioncode. |
| [GetHashCode](./gethashcode/)() const override | Analog zur C#-Methode [Object.GetHashCode()](../../system/object/gethashcode/). Ermöglicht das Hashen benutzerdefinierter Objekte. |
| [operator=](./operator=/)(const RegionInfo\&) |  |
| [RegionInfo](./regioninfo/)(const String\&) | RTTI-Informationen. |
| [RegionInfo](./regioninfo/)(int) | Konstruktor. |
| [RegionInfo](./regioninfo/)(const RegionInfo\&) |  |
| [ToString](./tostring/)() const override | Analog zur C#-Methode [Object.ToString()](../../system/object/tostring/). Ermöglicht die Umwandlung benutzerdefinierter Objekte in einen String. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)
