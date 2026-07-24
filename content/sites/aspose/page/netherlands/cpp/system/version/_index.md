---
title: "System::Version-klasse"
linktitle: "Versie"
second_title: "Aspose.Page voor C++"
description: "System::Version-klasse. Vertegenwoordigt een versienummer. Dit type moet op de stack worden gealloceerd en aan functies worden doorgegeven per waarde of per referentie. Gebruik nooit de System::SmartPtr-klasse om objecten van dit type in C++ te beheren."
type: docs
weight: 7300
url: /nl/cpp/system/version/
---
## Version class


Vertegenwoordigt een versienummer. Dit type moet op de stack worden gealloceerd en aan functies worden doorgegeven per waarde of per referentie. Gebruik nooit de [System::SmartPtr](../smartptr/) klasse om objecten van dit type te beheren.

```cpp
class Version
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [CompareTo](./compareto/)(const Version\&) const | Vergelijkt de versies die worden vertegenwoordigd door het huidige object en het opgegeven object. |
| [Equals](./equals/)(const Version\&) const | Bepaalt of de versienummers die worden vertegenwoordigd door het huidige en het opgegeven object gelijk zijn. |
| [get_Build](./get_build/)() const | Retourneert het buildnummer. |
| [get_Major](./get_major/)() const | Retourneert de hoofdversie. |
| [get_MajorRevision](./get_majorrevision/)() const | Retourneert de hoge 16-bit waarde van het revisienummer. |
| [get_Minor](./get_minor/)() const | Retourneert de onderversie. |
| [get_MinorRevision](./get_minorrevision/)() const | Retourneert de lage 16-bit waarde van het revisienummer. |
| [get_Revision](./get_revision/)() const | Retourneert het revisienummer. |
| [GetHashCode](./gethashcode/)() const | Retourneert een hashcode voor het huidige object. |
| static [Parse](./parse/)(const String\&) | Converteert de tekenreeksrepresentatie van een versienummer naar een gelijkwaardige instantie van de [Version](./)-klasse. |
| [ToString](./tostring/)() const | Retourneert de tekenreeksrepresentatie van het versienummer dat door het huidige object wordt weergegeven. |
| [ToString](./tostring/)(int) const | Retourneert de tekenreeksrepresentatie van het opgegeven aantal secties van het versienummer dat door het huidige object wordt weergegeven. |
| [Version](./version/)(int, int, int, int) | Construeert een instantie die de opgegeven major-, minor-, build- en revsion-waarden vertegenwoordigt. |
| [Version](./version/)(int, int, int) | Construeert een instantie die de opgegeven major-, minor- en build-waarden vertegenwoordigt. |
| [Version](./version/)(int, int) | Construeert een instantie die de opgegeven major- en waarden vertegenwoordigt. |
| [Version](./version/)(const String\&) | Construeert een instantie die het versienummer vertegenwoordigt dat als tekenreeks wordt weergegeven. |
| [Version](./version/)() | Construeert een instantie die versienummer 0.0.-1.-1 vertegenwoordigt. |
## Zie ook

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
