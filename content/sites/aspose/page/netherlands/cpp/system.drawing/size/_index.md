---
title: "System::Drawing::Size-klasse"
linktitle: "Size"
second_title: "Aspose.Page voor C++"
description: "System::Drawing::Size-klasse. Vertegenwoordigt een paar gehele getallen die de breedte en hoogte van een afbeelding weergeven. Dit type moet op de stack worden gealloceerd en aan functies worden doorgegeven per waarde of per referentie. Gebruik nooit de System::SmartPtr-klasse om objecten van dit type in C++ te beheren."
type: docs
weight: 2200
url: /nl/cpp/system.drawing/size/
---
## Size class


Vertegenwoordigt een paar gehele getallen die de breedte en hoogte van een afbeelding weergeven. Dit type moet op de stack worden gealloceerd en aan functies worden doorgegeven per waarde of per referentie. Gebruik nooit de [System::SmartPtr](../../system/smartptr/)-klasse om objecten van dit type te beheren.

```cpp
class Size
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| static [Add](./add/)(const Size\&, const Size\&) | Retourneert een nieuw [Size](./)-object dat de som is van het opgegeven [Size](./)-object, d.w.z. waarvan de breedtewaarde gelijk is aan de som van de breedtewaarden van de opgegeven objecten en de hoogtewaarde gelijk is aan de som van de hoogtewaarden van de opgegeven objecten. |
| static [Ceiling](./ceiling/)(const SizeF\&) | Construeert een [Size](./)-object uit het opgegeven [SizeF](../sizef/)-object door de breedte- en hoogtewaarden van het [SizeF](../sizef/)-object af te ronden naar het volgende hogere gehele getal. |
| [Equals](./equals/)(const Size\&) const | Bepaalt of het huidige object en het opgegeven object gelijk zijn, d.w.z. of ze hetzelfde paar breedte- en hoogtewaarden vertegenwoordigen. |
| [get_Height](./get_height/)() const | Retourneert de hoogtewaarde die door het huidige object wordt weergegeven. |
| [get_IsEmpty](./get_isempty/)() const | Bepaalt of zowel de breedte- als de hoogtewaarden gelijk zijn aan 0. |
| [get_Width](./get_width/)() const | Retourneert de breedtewaarde die door het huidige object wordt weergegeven. |
| [GetHashCode](./gethashcode/)() const | Retourneert een hashcode voor het huidige object. |
| [operator Point](./operatorpoint/)() const | Construeert een instantie van het [Point](../point/)-object en initialiseert de X- en Y-coördinaat met respectievelijk de breedte- en hoogtewaarden van het huidige object. |
| [operator SizeF](./operatorsizef/)() const | Construeert een instantie van het [SizeF](../sizef/)-object en initialiseert het met de breedte- en hoogtewaarden van het huidige [Size](./)-object. |
| static [Round](./round/)(const SizeF\&) | Construeert een [Size](./)-object uit het opgegeven [SizeF](../sizef/)-object door de breedte- en hoogtewaarden van het [SizeF](../sizef/)-object af te ronden naar het dichtstbijzijnde gehele getal. |
| [set_Height](./set_height/)(int) | Stelt de hoogtewaarde in die door het huidige object wordt weergegeven. |
| [set_Width](./set_width/)(int) | Stelt de breedtewaarde in die door het huidige object wordt weergegeven. |
| [Size](./size/)() | Construeert een nieuw [Size](./)-object en initialiseert de breedte- en hoogtewaarden met 0. |
| [Size](./size/)(const Point\&) | Construeert een nieuw [Size](./)-object en initialiseert de breedte- en hoogtewaarden met respectievelijk de waarden van de X- en Y-coördinaten van het opgegeven punt. |
| [Size](./size/)(int, int) | Construeert een nieuw [Size](./)-object en initialiseert het met de opgegeven waarde. |
| static [Subtract](./subtract/)(const Size\&, const Size\&) | Retourneert een nieuw [Size](./) object dat het resultaat is van de aftrekking van **size2** van **size1**, d.w.z. waarvan de breedtewaarde het resultaat is van de aftrekking van **size2's** breedtewaarde van **size1's** breedtewaarde en de hoogtewaarde het resultaat is van de aftrekking van **size2's** hoogtewaarde van **size1's** hoogtewaarde. |
| [ToString](./tostring/)() const | Retourneert de tekenreeksrepresentatie van het paar breedte- en hoogtewaarden dat door het huidige object wordt weergegeven. |
| static [Truncate](./truncate/)(const SizeF\&) | Construeert een [Size](./)-object vanuit het opgegeven [SizeF](../sizef/)-object door de breedte- en hoogtewaarden van het [SizeF](../sizef/)-object af te kappen naar de eerstvolgende lagere gehele getallen. |
## Velden

| Veld | Beschrijving |
| --- | --- |
| static [Empty](./empty/) | Een lege instantie van de [Size](./)-klasse waarvan de breedte- en hoogtewaarden 0 zijn. |
## Zie ook

* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
