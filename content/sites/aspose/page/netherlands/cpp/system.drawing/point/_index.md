---
title: "System::Drawing::Point klasse"
linktitle: "Point"
second_title: "Aspose.Page voor C++"
description: "System::Drawing::Point klasse. Vertegenwoordigt een paar gehele X- en Y-coördinaten van een punt op een tweedimensionaal vlak. Dit type moet op de stack worden gealloceerd en aan functies worden doorgegeven per waarde of per referentie. Gebruik nooit de System::SmartPtr klasse om objecten van dit type in C++ te beheren."
type: docs
weight: 1700
url: /nl/cpp/system.drawing/point/
---
## Point class


Vertegenwoordigt een paar gehele X- en Y-coördinaten van een punt op een tweedimensionaal vlak. Dit type moet op de stack worden gealloceerd en aan functies worden doorgegeven per waarde of per referentie. Gebruik nooit de [System::SmartPtr](../../system/smartptr/) klasse om objecten van dit type te beheren.

```cpp
class Point
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| static [Add](./add/)(const Point\&, const Size\&) | Voegt de breedte- en hoogtewaarden van het opgegeven [Size](../size/) object toe aan respectievelijk de X- en Y-coördinatenwaarden van het opgegeven [Point](./) object. |
| static [Ceiling](./ceiling/)(const PointF\&) | Construeert een [Point](./) object van het opgegeven [PointF](../pointf/) object door de X- en Y-coördinatenwaarden van het [PointF](../pointf/) object af te ronden naar de eerstvolgende hogere gehele waarden. |
| [Equals](./equals/)(const Point\&) const | Bepaalt of het huidige object en het opgegeven object gelijk zijn, d.w.z. of ze hetzelfde paar X‑ en Y‑coördinaatwaarden vertegenwoordigen. |
| [get_IsEmpty](./get_isempty/)() const | Bepaalt of zowel de X‑ als de Y‑coördinaatwaarden gelijk zijn aan 0. |
| [get_X](./get_x/)() const | Retourneert de waarde van de X‑coördinaat die door het huidige object wordt vertegenwoordigd. |
| [get_Y](./get_y/)() const | Retourneert de waarde van de Y‑coördinaat die door het huidige object wordt vertegenwoordigd. |
| [GetHashCode](./gethashcode/)() const | Retourneert een hashcode voor het huidige object. |
| [getStdHash](./getstdhash/)() const | Retourneert een hashwaarde voor het huidige object. |
| [IsNull](./isnull/)() const | Geeft altijd false terug. |
| [Offset](./offset/)(int, int) | Verschuift de X- en Y-coördinatenwaarde die door het huidige object wordt vertegenwoordigd met de opgegeven waarden. |
| [Offset](./offset/)(Point) | Verschuift de X- en Y-coördinaten die door het huidige object worden vertegenwoordigd met respectievelijk de X- en Y-coördinatenwaarden van het opgegeven [Point](./) object. |
| [operator PointF](./operatorpointf/)() const | Construeert een instantie van een [PointF](../pointf/) object en initialiseert deze met de X- en Y-coördinatenwaarden van het huidige [Point](./) object. |
| [operator Size](./operatorsize/)() const | Construeert een instantie van een [Size](../size/) object en initialiseert de breedte- en hoogtewaarden met respectievelijk de X- en Y-coördinatenwaarden die door het huidige object worden vertegenwoordigd. |
| [Point](./point/)() | Construeert een nieuw [Point](./) object en initialiseert de X- en Y-coördinatenwaarden met 0. |
| [Point](./point/)(int, int) | Construeert een nieuw [Point](./) object en initialiseert het met de opgegeven waarden. |
| [Point](./point/)(const Size\&) | Construeert een nieuw [Point](./) object en initialiseert de X- en Y-coördinatenwaarden met respectievelijk de breedte- en hoogtewaarden van het opgegeven [SizeF](../sizef/) object. |
| [Point](./point/)(int) | Construeert een nieuw [Point](./) object en initialiseert de X-coördinaatwaarde met een waarde gevormd door de hoge 16 bits van het opgegeven 32‑bit geheel getal en de Y-coördinaatwaarde met een waarde gevormd door de lage 16 bits van het opgegeven 32‑bit geheel getal. |
| static [Round](./round/)(const PointF\&) | Construeert een [Point](./) object van het opgegeven [PointF](../pointf/) object door de X- en Y-coördinaatwaarden van het [PointF](../pointf/) object af te ronden op de dichtstbijzijnde gehele getallen. |
| [set_X](./set_x/)(int) | Stelt de waarde van de X-coördinaat in die door het huidige object wordt vertegenwoordigd. |
| [set_Y](./set_y/)(int) | Stelt de waarde van de Y-coördinaat in die door het huidige object wordt vertegenwoordigd. |
| static [Subtract](./subtract/)(const Point\&, const Size\&) | Trek de breedte- en hoogtewaarden van het opgegeven [Size](../size/) object af van de X- en Y-coördinaatwaarden van het opgegeven [Point](./) object, respectievelijk. |
| [ToString](./tostring/)() const | Retourneert de tekenreeksrepresentatie van het paar X- en Y-coördinaatwaarden dat door het huidige object wordt vertegenwoordigd. |
| static [Truncate](./truncate/)(const PointF\&) | Construeert een [Point](./) object van het opgegeven [PointF](../pointf/) object door de X- en Y-coördinaatwaarden van het [PointF](../pointf/) object af te kappen op het eerstvolgende lagere gehele getal. |
## Velden

| Veld | Beschrijving |
| --- | --- |
| static [Empty](./empty/) | Een lege instantie van de [Point](./) klasse waarvan de X- en Y-coördinaatwaarden 0 zijn. |
## Zie ook

* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
