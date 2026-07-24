---
title: "System::Drawing::PointF-klasse"
linktitle: "PointF"
second_title: "Aspose.Page voor C++"
description: "System::Drawing::PointF-klasse. Vertegenwoordigt een paar van enkelprecisie floating‑point X‑ en Y‑coördinaten van een punt op een tweedimensionaal vlak. Dit type moet op de stack worden gealloceerd en aan functies worden doorgegeven per waarde of per referentie. Gebruik nooit de System::SmartPtr-klasse om objecten van dit type in C++ te beheren."
type: docs
weight: 1800
url: /nl/cpp/system.drawing/pointf/
---
## PointF class


Vertegenwoordigt een paar van enkelprecisie floating‑point X‑ en Y‑coördinaten van een punt op een tweedimensionaal vlak. Dit type moet op de stack worden gealloceerd en aan functies worden doorgegeven per waarde of per referentie. Gebruik nooit de [System::SmartPtr](../../system/smartptr/)-klasse om objecten van dit type te beheren.

```cpp
class PointF
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| static [Add](./add/)(const PointF\&, const SizeF\&) | Voegt de breedte‑ en hoogte‑waarden van het opgegeven [SizeF](../sizef/)-object toe aan de X‑ en Y‑coördinaatwaarden van het opgegeven [PointF](./)-object overeenkomstig. |
| static [Add](./add/)(const PointF\&, const Size\&) | Voegt de breedte‑ en hoogte‑waarden van het opgegeven [Size](../size/)-object toe aan de X‑ en Y‑coördinaatwaarden van het opgegeven [PointF](./)-object overeenkomstig. |
| [Equals](./equals/)(const PointF\&) const | Bepaalt of het huidige object en het opgegeven object gelijk zijn, d.w.z. of ze hetzelfde paar X‑ en Y‑coördinaatwaarden vertegenwoordigen. |
| [get_IsEmpty](./get_isempty/)() const | Bepaalt of zowel de X‑ als de Y‑coördinaatwaarden gelijk zijn aan 0. |
| [get_X](./get_x/)() const | Retourneert de waarde van de X‑coördinaat die door het huidige object wordt vertegenwoordigd. |
| [get_Y](./get_y/)() const | Retourneert de waarde van de Y‑coördinaat die door het huidige object wordt vertegenwoordigd. |
| [GetHashCode](./gethashcode/)() const | Retourneert een hashcode voor het huidige object. |
| [IsNull](./isnull/)() const | Geeft altijd false terug. |
| explicit [operator bool](./operatorbool/)() | Geeft altijd true terug. |
| [PointF](./pointf/)() | Construeert een nieuw [PointF](./) object en initialiseert de X- en Y-coördinaatwaarden met 0. |
| [PointF](./pointf/)(float, float) | Construeert een nieuw [PointF](./) object en initialiseert het met de opgegeven waarden. |
| [PointF](./pointf/)(const SizeF\&) | Construeert een nieuw [PointF](./) object en initialiseert de X- en Y-coördinaatwaarden met de breedte- en hoogtewaarden van het opgegeven [SizeF](../sizef/) object respectievelijk. |
| [set_X](./set_x/)(float) | Stelt de waarde van de X-coördinaat in die door het huidige object wordt vertegenwoordigd. |
| [set_Y](./set_y/)(float) | Stelt de waarde van de Y-coördinaat in die door het huidige object wordt vertegenwoordigd. |
| static [Subtract](./subtract/)(const PointF\&, const SizeF\&) | Trek de breedte- en hoogtewaarden van het opgegeven [SizeF](../sizef/) object af van respectievelijk de X- en Y-coördinaatwaarden van het opgegeven [PointF](./) object. |
| static [Subtract](./subtract/)(const PointF\&, const Size\&) | Trek de breedte- en hoogtewaarden van het opgegeven [Size](../size/) object af van respectievelijk de X- en Y-coördinaatwaarden van het opgegeven [PointF](./) object. |
| [ToString](./tostring/)() const | Retourneert de tekenreeksrepresentatie van het paar X- en Y-coördinaatwaarden dat door het huidige object wordt vertegenwoordigd. |
## Velden

| Veld | Beschrijving |
| --- | --- |
| static [Empty](./empty/) | Een lege instantie van de [PointF](./) klasse waarvan de X- en Y-coördinaatwaarden 0 zijn. |
## Zie ook

* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
